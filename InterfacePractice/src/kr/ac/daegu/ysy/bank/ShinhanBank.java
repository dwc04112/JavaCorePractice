package kr.ac.daegu.ysy.bank;

public class ShinhanBank implements Bank {
    @Override
    public void deposit(int money) {
        System.out.println("신한은행으로 " + money + "만틈 입금 되었습니다.");
    }

    @Override
    public void withdraw(int money) {
        System.out.println("신한은행으로 " + money + "만틈 출금 되었습니다.");
    }
}
