package factory;


import models.Figure;

abstract public class AbstractFigureFactory {
    public enum FiguresType{
        COLOR, NOT_COLOR
    }
    public abstract Figure getFigure(FiguresType figureType);
}

