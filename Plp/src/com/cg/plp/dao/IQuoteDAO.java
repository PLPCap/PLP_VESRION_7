package com.cg.plp.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import com.cg.plp.bean.AccountCreationBean;
import com.cg.plp.bean.PolicyBean;
import com.cg.plp.bean.PolicyCreationBean;
import com.cg.plp.bean.PolicyQuestions;
import com.cg.plp.bean.UserLoginBean;

public interface IQuoteDAO {

	public int checkValidLogin(UserLoginBean userLoginBean) throws SQLException, ClassNotFoundException, FileNotFoundException;
	public void profileCreation(UserLoginBean userLoginBean) throws ClassNotFoundException, FileNotFoundException, SQLException;
	public void accountCreation(AccountCreationBean accountCreationBean) throws ClassNotFoundException, FileNotFoundException, SQLException;
	public void policyCreation(PolicyCreationBean policyCreationBean);
	public List<PolicyQuestions> retrieveAll() throws ClassNotFoundException, FileNotFoundException, SQLException;
	public List<PolicyBean> getMyPolicies(String userName) throws ClassNotFoundException, FileNotFoundException, SQLException;
	public List<PolicyBean> getMyCustomerPolicies(int agentId) throws ClassNotFoundException, FileNotFoundException, SQLException;
}
