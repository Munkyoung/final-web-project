package com.project.bokduck.repository;

import com.project.bokduck.domain.ReviewCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewCategoryRepository extends JpaRepository<ReviewCategory, Long>, JpaSpecificationExecutor<ReviewCategory> {
    ReviewCategory findAllByReviewId(Long reviewId);
}
