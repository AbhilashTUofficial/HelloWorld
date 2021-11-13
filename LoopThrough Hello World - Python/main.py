from os import system,name
import string
from time import sleep


def clear():
    # for windows
    if name == 'nt':_ = system('cls')
    # for mac and linux
    else: _ = system('clear')


def main():
    
    i,letters,finalStr=0,[' ','!'],'Hello World!!!'
    [letters.append(_) for _ in string.ascii_letters]
    tmpStr=f'{letters[0]}'

    while True:
        clear()
        print(tmpStr)
        sleep(0.1)
        if tmpStr==finalStr:break
        if(tmpStr[-1]==finalStr[len(tmpStr)-1]):
            tmpStr=f'{tmpStr}{letters[i]}'
            i=0
        else:
            tmpStr=f'{tmpStr[:-1]}{letters[i]}'
            i+=1

if __name__=="__main__":
    main()