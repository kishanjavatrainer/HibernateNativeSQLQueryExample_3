package com.infotech.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.transform.Transformers;

import com.infotech.dto.PersonSummaryDTO;
import com.infotech.util.HibernateUtil;

public class HibernateNativeSQLClientTest {

	public static void main(String[] args) {

		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			@SuppressWarnings("unchecked")
			List<PersonSummaryDTO> personSummaryDTOs = session.createNativeQuery(
				    "SELECT p.id as \"id\", p.name as \"name\" " +
				    "FROM Person p")
				.setResultTransformer(Transformers.aliasToBean(PersonSummaryDTO.class ) )
				.list();
			for (PersonSummaryDTO personSummaryDTO : personSummaryDTOs) {
				System.out.println(personSummaryDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
