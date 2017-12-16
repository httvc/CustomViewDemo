package zhichuangpda.hydculture.com.customviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
      //  canvas.drawArc();
        canvas.drawRect(oval,paint);
        paint1.setARGB(00,55,55,55);
        canvas.drawOval(oval,paint1);
    }
}
