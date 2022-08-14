import pygame
###########################################################
#기본 초기화 (반드시 해야하는것들)
pygame.init()

# 화면 크기 설정
screen_width = 480    # 가로 크기
Screen_height = 640   # 세로 크기
screen = pygame.display.set_mode((screen_width, Screen_height))

# 화면 타이틀 설정
pygame.display.set_caption("Irin games") 

# FPS
clock = pygame.time.Clock()
#############################################################

# 1. 사용자 게임 초기화 (배경 화면, 게임 이미지, 좌표, 폰트, 속도 등)


running = True  
while running:
    dt = clock.tick(30)
    
    # 2. 이벤트 처리 (키보드 ,마우스등)
    for event in pygame.event.get():   
        if event.type == pygame.QUIT:  
            running = False            
    
    # 3. 게임 캐릭터 위치 정의
    
    # 4. 충돌 처리

    # 5. 화면에 그리기

  

    pygame.display.update() 


pygame.quit()
