package hibernate.entities;

import hibernate.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;


public class Main {
	static final SessionFactory factory = HibernateUtils.getSessionFactory();
    public static void listProduct( ) {
        Session session = factory.openSession();
        List listProduct = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            listProduct = session.createQuery("FROM Product ").list();

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

       listProduct.forEach(s-> System.out.println(s.toString()));

    }
    public static void listCustomer( ) {
        Session session = factory.openSession();
        List listCustomer = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            listCustomer = session.createQuery("FROM Customer").list();

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        listCustomer.forEach(s-> System.out.println(s.toString()));

    }
    public static void listOrder( ) {
        Session session = factory.openSession();
        List listOrder = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            listOrder = session.createQuery("FROM Order ").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        listOrder.forEach(s-> System.out.println(s.toString()));

    }
    public static void listOrderDetail( ) {
        Session session = factory.openSession();
        List listOrderDetail = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            listOrderDetail = session.createQuery("FROM OrderDetail ").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        listOrderDetail.forEach(s-> System.out.println(s.toString()));

    }
    public static void listCategory( ) {
        Session session = factory.openSession();
        List listCategory = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            listCategory = session.createQuery("FROM Category ").list();

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        listCategory.forEach(s-> System.out.println(s.toString()));

    } 
    public static void listPublisher( ) {
        Session session = factory.openSession();
        List listPublisher = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            listPublisher = session.createQuery("FROM Publisher ").list();

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        listPublisher.forEach(s-> System.out.println(s.toString()));

    }
    public static void listReceipt( ) {
        Session session = factory.openSession();
        List listReceipt = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            listReceipt = session.createQuery("FROM Receipt ").list();

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        listReceipt.forEach(s-> System.out.println(s.toString()));

    }
    
    public static void listReceiptDetail( ) {
        Session session = factory.openSession();
        List listReceiptDetail = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            listReceiptDetail = session.createQuery("FROM ReceiptDetail ").list();

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        listReceiptDetail.forEach(s-> System.out.println(s.toString()));

    }
    public static void main(String[] args) {
       /* assert factory != null;
        Session session= factory.openSession();
        Transaction tx = session.beginTransaction();
        loai loai=new loai();
        loai.setId_Loai(25);
        loai.setName("trungbanbanh");
        session.save(loai);
        tx.commit();*/

//          Main.listProduct();
//        Main.listCustomer();
//         Main.listOrder();
//    	Main.listOrderDetail();
//    	Main.listCategory();
//    	Main.listPublisher();
//    	Main.listReceipt();
    	Main.listReceiptDetail();


    }
}
