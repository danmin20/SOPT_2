# SOPT_2
SOPT android part 2차 세미나 과제

## ScreenShots
<img width="250" src="https://user-images.githubusercontent.com/50590192/80365824-2b057680-88c3-11ea-91b7-2fba747015f4.gif">

## Learned Points
* RecyclerView는 동일한 형태를 가진 뷰 여러 개를 사용할 때 씀 (틀은 같고 데이터가 다름)
  - 배치방향 정하기 (LinearLayoutManager / GridLayoutManager)
  - ViewHolder: 동일한 형태의 뷰 하나에 대한 데이터를 넣을 위치 정보를 앎
  - Adapter: 데이터와 뷰를 연결시켜줌 (adapter.notifyDataSetChanged(): 데이터가 갱신되었음을 알려줌)
* 이미지 주소로 이미지 로드하려면 uses-permission 설정 필요
* RecyclerView의 itemDecoration: 각 뷰의 여백을 정의할 수 있음
  - Decorator 클래스를 정의해준 뒤 RecyclerView에서 addItemDecoration 호출
* clipToPadding
  - RecyclerView에서 패딩을 줄 경우 위아래에 패딩공간이 생기게 됨<br>
  이 때 clipToPadding="false" 속성을 추가하면 패딩공간을 스크롤 공간으로 활용할 수 있음
