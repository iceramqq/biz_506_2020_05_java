package com.biz.bank.service;

/*
 * 은행의 내 계좌에 입출금을 처리를 할텐데
 * 초기의 내 계좌 잔액 100000으로 설정하고
 * inputBalance()를 호출하여 입금처리를 수행하고
 * outputBalance()를 호출하여 출금처리를 수행하고
 * 		출금을 할때는 내 계좌의 잔액보다 큰 금액을 출금하려 하면
 * 
 */
public interface BankService {
	
	public boolean inputBalance();
	public boolean outputBalance();
	public void listBalance();
}
