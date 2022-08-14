# : 콜론 , ; : 세미콜론
## 주석
"""
""" #문단을 바꿔가며 주석 처리

"""
subway1 = 10
subway2 = 20
subway = [10,20]
이렇게도 가능하다
"""

# Ctrl + / 는 선택한 모든표시를 주석처리 가능

# ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

## 문자열 
# [] 대 가로 잊지 말기
#index 이란 문자열에서 몇번째 순번인지 알려준다 .index()
#append 이란 맨끝에 문자열을 추가시켜준다       .append()
#insert 이란 원하는 자리에 문자열 추가          .insert()
#pop 이란 맨 뒤에 있는 문장을 빼준다            .pop()
#count 이란 문장열에 문자 수를 알려준다         .count()
#sort 이란 문자열 정렬       .sort()
#reverse 순서 뒤집기 기능    .reverse()
#clear 모두 지워준다
""" 다양한 자료형 끼리 사용 가능
예: = ["조세호" , Ture , 20]
"""
""" 리스트 확장(하나의 리스트로 합쳐짐) extend
예 : mix_list.extend(num_list)
"""

#ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

# 사전

""" 해당되는 Key 의 문자열 출력 {} 중가로 이용하기
예 : cabinet = {3:"유재석" , 10:"조세호"}
        print(cabinet[3])
        print(cabinet.get(3))
"""
""" 해당 되는 Key 가 포함 되있는지 확인하는 방법 (Key in 변수)
예 : print(3 in cabinet) # true
     print(5 in cabinet) # 해당되는 Key 가 없으면 False
"""
""" 문자열도 가능하다
예 : cabinet = {"A-3":"유재석" , "B-10":"조세호"}
     print(cabinet["A-3"])
"""
""" 추가 기능
예 : cabinet["A-3"] = "김종국" # 해당되는 문자를 다른문자로 바꿀수 있다
     cabinet["A-2"] = "김태호" # 추가 기능
"""
""" 해당 되는 Key,문자 삭제 방법 del
예 : del cabinet["A-3"]
"""
""" Key 들만 출력 keys
예 : print(cabinet.keys())
"""
""" Value 들만 출력 values
예 : print(cabinet.values())
"""
""" 쌍으로 출력 하기 items
예 : print(cabinet.items())
"""
""" 모든걸 삭제하기 clear
예 : cabinet.clear()
     print(cabinet)
"""

#ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

# 튜플

