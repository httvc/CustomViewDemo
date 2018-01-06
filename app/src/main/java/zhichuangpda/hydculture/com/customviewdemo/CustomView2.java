package zhichuangpda.hydculture.com.customviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Android Studio
 * Project：CustomViewDemo
 * Author：httvc
 * Email：jfjie2013@163.com
 * Date：2018/1/4.
 */

public class CustomView2 extends View {
    public CustomView2(Context context) {
        super(context);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //自定义图像
        Paint mPaint = new Paint();             // 创建画笔
        mPaint.setColor(Color.BLACK);           // 画笔颜色 - 黑色
        mPaint.setStyle(Paint.Style.STROKE);    // 填充模式 - 描边
        mPaint.setStrokeWidth(10);
        Path path=new Path();
        path.addCircle(200,200,200, Path.Direction.CW);
       // canvas.drawPath(path,paint);

        Path path1=new Path();
        RectF rectF=new RectF(200,450,400,650);
        path1.addArc(rectF,-225,225);
      //  canvas.drawPath(path1,mPaint);
        RectF rectF1=new RectF(400,450,600,650);
        //path1.addArc(rectF,-180,225);
        path1.arcTo(rectF1,-180,225);
       // canvas.drawPath(path1,mPaint);
        path1.lineTo(400,850);
        canvas.drawPath(path1,mPaint);
      //  path1.lineTo(300, 300);
     //   canvas.drawPath(path1, mPaint);

        RectF oval=new RectF(0,0,300,300);
      //  canvas.drawRect(oval,mPaint);
        path1.addArc(oval,0,270);
        canvas.drawPath(path1,mPaint);

        Path path2=new Path();
       // path2.moveTo(100, 500);
        path2.quadTo(300, 100, 600, 500);
        canvas.drawPath(path2, mPaint);

        Path path3=new Path();
        path3.moveTo(100, 500);
        path3.cubicTo(100, 500, 300, 100, 600, 500);
        canvas.drawPath(path3,mPaint);
    }
}
