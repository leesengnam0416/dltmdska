from email import header
import requests
url = "http://nadocoding.tistory.com"
# headers = {"User-Agent":"Mozilla/5.0(Windows NT 10.0, Win64, x64) AppleWebKit/537.36(Gecko와 같은 KHTML) Chrome/103.0.0.0 Safari/537.36"}
res = requests.get(url)
res.raise_for_status
with open("nadocoding.html","w",encoding="utf8") as f:
    f.write(res.text)
