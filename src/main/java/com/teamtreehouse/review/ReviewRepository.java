package com.teamtreehouse.review;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Godzi on 3/28/2017.
 */
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {
}
