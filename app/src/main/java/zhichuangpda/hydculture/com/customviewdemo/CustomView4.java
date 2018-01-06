package zhichuangpda.hydculture.com.customviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Android Studio
 * Project：CustomViewDemo
 * Author：httvc
 * Email：jfjie2013@163.com
 * Date：2018/1/6.
 */

public class CustomView4 extends View {
    public CustomView4(Context context) {
        super(context);
    }

    public CustomView4(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView4(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint1=new Paint();
    Paint paint2=new Paint();
    Paint paint3=new Paint();
    Paint paint4=new Paint();
    Paint paint5=new Paint();
    Paint paint6=new Paint();
    Paint paint7=new Paint();
    Paint paint8=new Paint();
    Paint paint9=new Paint();
    Paint paint10=new Paint();
    Paint paint11=new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint1.setColor(Color.parseColor("#E91E63"));
        paint2.setColor(Color.BLUE);
        paint3.setColor(Color.BLACK);
        paint4.setColor(Color.DKGRAY);
        paint5.setColor(Color.GREEN);
        paint6.setColor(Color.GRAY);
        paint7.setColor(Color.YELLOW);
        paint8.setColor(Color.DKGRAY);
        paint9.setColor(Color.BLUE);
        paint10.setColor(Color.GREEN);
        paint11.setColor(Color.YELLOW);
        float x1 = 400;
        float y1 = 400;
        RectF oval1 = new RectF(200, 200,600, 600);
        canvas.drawArc(oval1,0,32.7273f,true,paint1);
        canvas.drawArc(oval1,32.7273f,32.7273f,true,paint2);
        canvas.drawArc(oval1,65.4545f,32.7273f,true,paint3);
        canvas.drawArc(oval1,98.1818f,32.7273f,true,paint4);
        canvas.drawArc(oval1,130.9091f,32.7273f,true,paint5);
        canvas.drawArc(oval1,163.6364f,32.7273f,true,paint6);
        canvas.drawArc(oval1,196.3636f,32.7273f,true,paint7);
        canvas.drawArc(oval1,229.0909f,32.7273f,true,paint8);
        canvas.drawArc(oval1,261.8182f,32.7273f,true,paint9);
        canvas.drawArc(oval1,294.5455f,32.7273f,true,paint10);
        canvas.drawArc(oval1,327.2727f,32.7273f,true,paint11);
    }
}
