
package com.emisoft.javaappautos.Logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String email;
    private int password;

    public Usuario()
    {
    }

    public Usuario(int id, String email, int password)
    {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public int getPassword()
    {
        return password;
    }

    public void setPassword(int password)
    {
        this.password = password;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    
    
    
    
}
