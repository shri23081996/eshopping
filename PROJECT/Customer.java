package com.emusic.model;
import javax.persistence.*;
@Entity
public class Customer {
	  @Id
	  
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private int cid;
	  private String cname;
	  private String cemail;
	  private String cwpd;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCwpd() {
		return cwpd;
	}
	public void setCwpd(String cwpd) {
		this.cwpd = cwpd;
	}
	  
	
}


