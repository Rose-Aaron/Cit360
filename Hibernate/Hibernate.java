<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC
        "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
        "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">

<hibernate-mapping package="hibernate">

    <class name="Contact" table="CONTACT">
        <id name="id" column="CONTACT_ID">
            <generator class="increment"/>
        </id>
        <property name="name" type="string" column="NAME"/>
        <property name="email"/>
        <property name="address"/>
        <property name="telephone"/>

    </class>

</hibernate-mapping>
