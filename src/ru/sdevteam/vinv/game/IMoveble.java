package ru.sdevteam.vinv.game;

public interface IMoveble
{    
    float getX();
    float getY();
    void setX(float nx);
    void setY(float ny);
    void moveTo(float nx,float ny);
    void moveBy(float dx,float dy);

}
