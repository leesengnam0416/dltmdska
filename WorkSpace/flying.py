from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

browser=webdriver.Chrome()
browser.maximize_window() #창 최대화

url='https://flight.naver.com/flights/'
browser.get(url)

#가는날 선택 버튼 클릭
browser.find_element_by_link_text("가는날 선택").click()

# 이번달 27일,28일 선택 - 27일 항공권 모두를 가져오니까 elements가 됨
# [0]은 이번달 [1]은 다음달
browser.find_elements_by_link_text('27')[0].click()
browser.find_elements_by_link_text('28')[0].click()


# 다음달 27,28
browser.find_elements_by_link_text("27")[1].click()
browser.find_elements_by_link_text("28")[1].click()

#이번달 27,다음달 28일
browser.find_elements_by_link_text("27")[0].click()
browser.find_elements_by_link_text("28")[1].click()

#제주도 선택
browser.find_element_by_xpath("//*[@id='recommendationList']/ul/li[1]").click()

#항공권 검색 클릭
browser.find_element_by_link_text("항공권 검색").click()

#로딩 시간이 길어서 제대로 읽어오지 못하기 때문에 import time쓸수도 있지만 그러면 너무 기다려야 하니까
#로딩이 끝나면 바로 동작을 처리하라는 수식어를 줌(아래 세개)
#from selenium.webdriver.common.by import By
#from selenium.webdriver.support.ui import WebDriverWait
#from selenium.webdriver.support import expected_conditions as EC
#presence_of_all_elements_located는 elem가 나올때까지 기다려달라는 뜻

try:
    #성공했을 때 동작수행
    elem = WebDriverWait(browser, 10).until(EC.presence_of_element_located((By.XPATH, "//*[@id='content']/div[2]/div/div[4]/ul/li[1]")))
    #-> elem는 웹드라이버를 통해 브라우져에서 최대 10초를 기다려주고 xpath 기준으로 값에 해당하는 elem가 나올때까지 기다려줘.
    print(elem.text)

finally:
    #실패하면 브라우저 끄기
    browser.quit()

#이거만 쓰면 로딩시간 길어져서 안뜸 그래서 위에꺼 넣어줌
# elem = browser.find_element_by_xpath("//*[@id='content']/div[2]/div/div[4]/ul/li[1]")
# print(elem.text)

