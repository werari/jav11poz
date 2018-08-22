package pl.sda.clone;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CloneTest {

    @Test
    void cloneTest1(){
        Point point1 = new Point(3, 3);
        Point point2 = new Point(3, 3);
        Point copyPoint = point1;

//        assertEquals(point1,point2);
//        assertEquals(point1,copyPoint);
//        assertEquals(point2,copyPoint);

//        point2.setX(5);
//        assertEquals(point1,point2);
//        assertEquals(point1,copyPoint);
//        assertEquals(point2,copyPoint);

//        point1.setX(5);
//        assertEquals(point1,point2);
//        assertEquals(point1,copyPoint);
//        assertEquals(point2,copyPoint);

//        copyPoint.setX(5);
//        assertEquals(point1,point2);
//        assertEquals(point1,copyPoint);
//        assertEquals(point2,copyPoint);
    }

    @Test
    void cloneTest2(){
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 3);
        Segment segment1 = new Segment(startPoint, endPoint);
        Segment segment2 = new Segment(startPoint, endPoint);
        Segment copySegment = segment1;

//        assertEquals(segment1,segment2);
//        assertEquals(segment1,copySegment);
//        assertEquals(segment2,copySegment);

//        segment1.getStartPoint().setX(5);
//        assertEquals(segment1,segment2);
//        assertEquals(segment1,copySegment);
//        assertEquals(segment2,copySegment);
//
//        segment2.getStartPoint().setX(5);
//        assertEquals(segment1,copySegment);
//        assertEquals(segment1,segment2);
//        assertEquals(segment2,copySegment);
//
//        copySegment.getStartPoint().setX(5);
//        assertEquals(segment1,segment2);
//        assertEquals(segment1,copySegment);
//        assertEquals(segment2,copySegment);
    }
}