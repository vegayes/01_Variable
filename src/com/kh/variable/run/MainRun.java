package com.kh.variable.run;

import com.kh.variable.practice2.CastingPractice1;

public class MainRun {
// 실행 클래스
	
	public static void main(String[] args) {
		
		CastingPractice1 cp1 = new CastingPractice1();
		
		cp1.ex1(0, 1);
		
		/* [ github에 Repositories 만드는 방법 및 확인 ]
		 * 
		 * 1. github Dashboard에서 "New" Click
		 * 
		 * 2. Repository name 작성하고 create repository Click
		 * 
		 * 3. command line 나오는데, 복사함. 
		 * 
		 * 4. 내가 repository 할 파일로 들어가서 우클릭 후 Open Git Bash here 함.
		 * 
		 * 5. 복사한 command line을 Shift + Insert 이용하여 붙여넣기함.
		 * 
		 * 6. git status  :: git이 인지한 update 안된 상태들 빨간색으로 표시 // 이상 없는 파일은 초록색
		 * 
		 * 7. git add . :: Staging Area로 변경사항들 저장함.
		 *
		 * 8. git commit -m "commit_content" ::  Local Repository로 대규모 update
		 * 
		 * 9. commit만 한 상태에서 git status하면, git push해서 Remote Repository로 옮기는 거 하라는 명령 뜸.
		 * 
		 * 10. git push :: Local Repository에서 원격 저장소로 이동. 
		 * 
		 */
		
		/*[ github에서 받아오는 방법 ]
		 * 1. 아무것도 없는 경우
		 * 	  -> 폴더 만든 후 Open Git Bash here 함.
		 *    -> 가져 올 project 링크 복사
		 *    -> git clone "링크 " 
		 *    
		 * 2. 원격 Repository랑 연결된 상태
		 *    -> git pull 
		 *    -> git clone  
		 *
		 * 
		 */
	}
	
	
}
