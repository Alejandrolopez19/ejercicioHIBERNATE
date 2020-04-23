/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Alejandro Lopez
 */
public class HibernateSession {
    
SessionFactory sessionFactory;

 Configuration configuration = new Configuration();
 configuration.configure();
 ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
 
}






