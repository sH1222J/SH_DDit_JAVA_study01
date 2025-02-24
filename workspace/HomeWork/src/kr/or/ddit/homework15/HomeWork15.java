package kr.or.ddit.homework15;

import kr.or.ddit.util.ScanUtil;

public class HomeWork15 {
	public static void main(String[] args) {
		HomeWork15 hw = new HomeWork15();
		hw.process();
	}
	
	public void process() {
		while(true) {
			System.out.println("1. 상품 추가");
			System.out.println("2. 상품 구매");
			System.out.println("3. 상품 삭제");
			System.out.println("4. 상품 출력");
			// 상품 구매시 남은 수량이 0이라면, 상품 삭제
			// 상품 추가시 수량을 1 이상 입력하도록 조건 추가
			int sel = ScanUtil.select();
			if(sel == 1) addProd();
			if(sel == 2) buyProd();
			if(sel == 3) deleteProd();
			if(sel == 4) printAll();
			
		}
	}
	
	Prod[] prodList = new Prod[50];
	int cnt;
	
	public void addProd() {
		String name = ScanUtil.next("상품명을 입력하세요 : ");
		String desc = ScanUtil.next("내용을 입력하세요 : ");
		int qty = ScanUtil.nextInt("수량을 입력하세요 : ");
		
		if (qty > 0) {
			Prod prod = new Prod();
			prod.setName(name);
			prod.setDesc(desc);
			prod.setQty(qty);
			prodList[cnt++] = prod;
			printAll();
		} else {
			System.out.println("수량을 1개 이상 입력해주세요.");
		}
	}
	
	public void buyProd() {
		printAll();
		int sel = ScanUtil.nextInt("구매할 상품을 선택하세요. : ")-1;
		int buyQty = ScanUtil.nextInt("구매할 수량을 입력하세요. : ");
		
		Prod prod = prodList[sel];
		if(prod.qty - buyQty <= 0) {
			deleteProd(sel);
		} else {
			prod.setQty(prod.qty - buyQty);
		}
		printAll();
	}
	
	public void deleteProd() {
		printAll();
		int sel = ScanUtil.nextInt("삭제할 상품을 선택하세요. : ")-1;
		
		for(int i=sel; i<cnt; i++) {
			if(i==prodList.length-1) {
				prodList[i] = null;
			} else {
				prodList[i] = prodList[i+1];
			}
		}
		cnt--;
		
		printAll();
	}
	
	public void deleteProd(int sel) {
		for(int i=sel; i<cnt; i++) {
			if(i==prodList.length-1) {
				prodList[i] = null;
			} else {
				prodList[i] = prodList[i+1];
			}
		}
		cnt--;
	}
	
	public void printAll() {
		System.out.println("상품명\t내용\t수량");
		System.out.println("==========================");
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1) + "." + prodList[i]);
		}
		System.out.println("==========================");
	}
}

class Prod {
	// 이름 내용 수량
	String name;
	String desc;
	int qty;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return name+"\t"+desc+"\t"+qty;
	}
}
