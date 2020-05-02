/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.UTS.repo;

import com.app.UTS.model.KursusOnline;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface KursusOnlineRepository extends JpaRepository<KursusOnline, String>{
    
}
