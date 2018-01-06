package zhichuangpda.hydculture.com.customviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Android Studio
 * Project：CustomViewDemo
 * Author：httvc
 * Email：jfjie2013163.com
 * Date：2017/12/16.
 */

public class CustomView1 extends View{
    public CustomView1(Context context) {
        super(context);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint=new Paint();
    Paint paint1=new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //画圆
       // canvas.drawCircle(200,200,200,paint);
        //画圆弧
        /**
         * RectF oval 作用：定义圆弧的形状和大小的范围
         */
        float x = (getWidth() - getHeight() / 2) / 2;
        float y = getHeight() / 4;
        RectF oval = new RectF( x, y,
                getWidth() - x, getHeight() - y);
        canvas.drawRect(oval,paint);

        Rect rect=new Rect((int)x,(int)y,(int)(getWidth()-x),(int)(getHeight()-y));
    //    canvas.drawRect(rect,paint);
        paint1.setColor(Color.BLUE);
        paint1.setStyle(Paint.Style.FILL_AND_STROKE);
        paint1.setAntiAlias(true);
        //画圆弧
      //  canvas.drawArc();
       // canvas.drawOval(oval,paint1);
        Paint paint2=new Paint();
        paint2.setStrokeWidth(20);
        paint2.setStrokeCap(Paint.Cap.ROUND);
       // canvas.drawPoint(getWidth()/2,getHeight()/2,paint2);

        float[] points={0,0,50,50,50,100,100,50,100,100,150,50,150,100};
        canvas.drawPoints(points,2,8,paint2);

        paint.setStyle(Paint.Style.FILL);
       // canvas.drawOval(50, 50, 350, 200, paint);

        paint.setStyle(Paint.Style.STROKE);
        //canvas.drawOval(400, 50, 700, 200, paint);

        float[] pointtt = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
        canvas.drawLines(pointtt, paint);

      //  canvas.drawRoundRect(oval,50,50,paint);

        float x1 = (getWidth() - getHeight() / 2) / 4;
        float y1 = getHeight() / 4;
        RectF oval1 = new RectF(x1, y1,
                getWidth() - x1, getHeight() - y1);
//        　startAngle -  开始角度（以时钟3点的方向为0°，顺时针为正方向）
//　　      sweepAngle -  扫过角度（以时钟3点的方向为0°，顺时针为正方向）

        canvas.drawArc(oval1,-110,110,true,paint1);
        canvas.drawArc(oval1,20,140,false,paint1);
        canvas.drawArc(oval1,180,60,false,paint);

    }
}
