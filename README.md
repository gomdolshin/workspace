# study space

## 스택과 큐의 핵심이론
> 스택
  - 삽입과 삭제 연산이 후입선출(LIFO : Last-in First-out)
  - 후입선출 : 삽입과 삭제가 한 쪽에서만 일어남 / **재귀 함수 알고리즘**과 비슷
  - DFS(우선탐색), 백트래킹 종류의 코테에 나옴
  - 스택 관련용어
    * push : top의 위치에 데이터 삽입
    * peek : top의 위치에 데이터 확인
    * pop : top의 위치에 데이터 삭제하고 확인

> 큐
  - 삽입과 삭제 연산이 선입선출(FIFO : Fast-in First-out)
  - 먼저 들어온 데이터가 먼저 나가며, 삽입과 삭제가 양방향에서 이루어짐
  - 너비우선탐색(BFS)에서 자주사용
  - 큐 관련 용어
    * rear : 가장 끝 데이터
    * front : 가장 앞 데이터
    * add : read 부분에 새로운 데이터를 삽입하는 연산
    * poll : front 부분에 데이터를 삭제하고 확인하는 연산
    * peek : 큐의 front에 있는 데이터를 확인
  - 우선순위 큐 : 먼저 들어오는 데이터가아닌, 우선순위가 높은 데이터가 먼저 나가는 형태의 자료구조
    * 우선순의 큐를 힙이아닌 배열이나 linkedlist를 통해 구현할수있으나 배열과 연결리스트는
      선형 구조의 자료구조이므로 삭제나 삽입연산의 시간복잡도가 O(n)이나
      힙트리는 완전이진트리 구조이므로 힙트리의 높이는 log2(n+1)이고 힙의 시간복잡도는 O(logn)

> 힙
  - 힙(heap)은 우선순위 큐를 위해 고안된 완전이진트리 형태의 자료구조
  - 특징
    * 완전이진트리
    * 부모노드와 서브트리간 대소관계 성립(반정렬 상태)
    * 이진탐색트리(BST)와 달리 중복값이 허용된다
  - 종류
    * 최대 힙(Max Heap) : 부모 노드의 키 값이 자식 노드보다 크거나 같은 완전이진트리
    * 최소 힙(Min Heap) : 부모 노드의 키 값이 자식 노드보다 작거나 같은 완전이진트리

## DB_WEB 관련 미팅 후 기록
> view
  - 사용이유 : 사용자에게 접근이 허용된 자료를 보여주기위해 만든 가상 테이블
  - 장점 : 데이터의 독립성, 접근제어에 따른 보안, 데이터 관리의 용이
  - 단점 : 독립적인 인덱스를 가질수없고, 뷰의 정의를 변경할수없고, insert, update, delete에 제약이 있다
> ad-hoc query(동적쿼리)
  - 임시변통 가설 , 좀 여유롭게,혹은 특정한 형식 없이 사용할 수 있는 쿼리문이다
  - ex) var newSqlQuery = "SELECT * FROM table WHERE id = " + myId;
> context
  - 
> iframe
> cross domain
> drill down
> graph_db
> django
  - MTV방식
    * Model : 서버쪽 데이터베이스를 만듦
    * Template : 웹페이지 화면을 만듦
    * View : 템플릿에서 서버에 일을 시킴