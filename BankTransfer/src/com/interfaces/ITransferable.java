package com.interfaces;

import com.models.BankAccount;

public interface ITransferable {



	void transfer(BankAccount from,BankAccount to,double bal);
}
