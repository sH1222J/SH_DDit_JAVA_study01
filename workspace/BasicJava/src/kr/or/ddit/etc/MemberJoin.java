package kr.or.ddit.etc;

import kr.or.ddit.util.ScanUtil;

public class MemberJoin {
	public static void main(String[] args) {
		MemberJoin mj = new MemberJoin();
		mj.process();
	}
	
	int cnt;
	Member[] memList = new Member[50];
	public void process() {
		while(true) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 정보 수정");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 전체 출력");
			int sel = ScanUtil.select();
			
			if(sel==1) memberJoin();
			if(sel==2) memberUpdate();
			if(sel==3) memberDelete();
			if(sel==4) printAll();
			
		}
	}
	
	public void memberJoin() {
		String id  = ScanUtil.next("아이디 : ");
		String nm  = ScanUtil.next("이름 : ");
		int age    = ScanUtil.nextInt("나이 : ");
		
		Member member = new Member();
		member.setId(id);
		member.setName(nm);
		member.setAge(age);
		memList[cnt++] = member;
		printAll();
	}
	public void memberUpdate() {
		// 전체 정보 출력후 회원 선택 -> 수정
		printAll();
		int sel = ScanUtil.nextInt("회원 선택 : ")-1;
		Member member = memList[sel];
		
		String id  = ScanUtil.next("아이디 : ");
		String nm  = ScanUtil.next("이름 : ");
		int age    = ScanUtil.nextInt("나이 : ");
		member.setId(id);
		member.setName(nm);
		member.setAge(age);
		printAll();
		
	}
	public void memberDelete() {
		// 전체 정보 출력후 회원 선택 -> 삭제
		// 삭제시 배열 앞으로 댕기기 
		printAll();
		int sel = ScanUtil.nextInt("삭제할 회원 : ")-1;
		for(int i=sel; i<cnt; i++) {
			if(i==memList.length-1) {
				memList[i] = null;
			}
			else {
				memList[i] = memList[i+1];
			}
		}
		cnt--;
		printAll();
	}
	public void printAll() {
		System.out.println("아이디\t이름\t나이");
		System.out.println("========================");
		for(int i=0; i<cnt;i++) {
			System.out.println((i+1)+". "+memList[i]);
		}
		System.out.println("========================");
	}
	
	
}
class Member{
	// 아이디 이름 나이
	private String id; 
	private String name;
	private int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return id+"\t"+name+"\t"+age;
	}
	
}


