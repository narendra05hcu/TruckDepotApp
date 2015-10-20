package com.truckdepot.common.dao.repository.custom.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.truckdepot.common.dao.entities.Quote;
import com.truckdepot.common.dao.repository.custom.SearchQuotesDao;

@Repository
public class SearchQuotesDaoImpl implements SearchQuotesDao {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Quote> searhcQuotes(String fromCity, String toCity,
			Date availableDate) {
		Query query = entityManager
				.createQuery("From Quote q where q.pickupDate= :pickupDate AND "
						+ "q.originAddress.city = :fromCity AND q.destinationAddress.city = :toCity");
		query.setParameter("pickupDate", availableDate);
		query.setParameter("fromCity", fromCity);
		query.setParameter("toCity", toCity);
		return query.getResultList();
	}

}
