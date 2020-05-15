package com.google.android.gms.feedback;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrawableView extends View {

    /* renamed from: a */
    public Paint f31498a;

    /* renamed from: b */
    public Bitmap f31499b;

    /* renamed from: c */
    public Canvas f31500c;

    /* renamed from: d */
    public Paint f31501d;

    /* renamed from: e */
    public Bitmap f31502e;

    /* renamed from: f */
    public ArrayList f31503f;

    /* renamed from: g */
    public ArrayList f31504g;

    /* renamed from: h */
    public ArrayList f31505h;

    /* renamed from: i */
    public int f31506i;

    /* renamed from: j */
    private Path f31507j;

    /* renamed from: k */
    private float f31508k;

    /* renamed from: l */
    private float f31509l;

    public DrawableView(Context context) {
        super(context);
        m23353a();
    }

    /* renamed from: a */
    private final void m23353a() {
        this.f31498a = new Paint(4);
        this.f31507j = new Path();
        Paint paint = new Paint();
        this.f31501d = paint;
        paint.setAntiAlias(true);
        this.f31501d.setDither(true);
        this.f31501d.setStyle(Paint.Style.STROKE);
        this.f31501d.setStrokeJoin(Paint.Join.ROUND);
        this.f31501d.setStrokeCap(Paint.Cap.ROUND);
        int dimension = (int) getResources().getDimension(C0126R.dimen.gf_paint_stroke_width);
        this.f31506i = dimension;
        this.f31501d.setStrokeWidth((float) dimension);
        this.f31501d.setColor((int) cdtr.m134945g());
        this.f31501d.setAlpha((int) cdtr.m134944f());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f31503f = arrayList;
        this.f31504g = arrayList2;
        this.f31505h = arrayList3;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f31499b;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f31498a);
            canvas.drawPath(this.f31507j, this.f31501d);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31507j.reset();
            this.f31507j.moveTo(x, y);
            this.f31508k = x;
            this.f31509l = y;
            invalidate();
        } else if (action == 1) {
            this.f31507j.lineTo(this.f31508k, this.f31509l);
            if (!this.f31500c.quickReject(this.f31507j, Canvas.EdgeType.BW)) {
                this.f31500c.drawPath(this.f31507j, this.f31501d);
                Path path = new Path(this.f31507j);
                int color = this.f31501d.getColor();
                int alpha = this.f31501d.getAlpha();
                this.f31503f.add(path);
                this.f31504g.add(Integer.valueOf(color));
                this.f31505h.add(Integer.valueOf(alpha));
            }
            this.f31507j.reset();
            invalidate();
            performClick();
        } else if (action == 2) {
            float abs = Math.abs(x - this.f31508k);
            float abs2 = Math.abs(y - this.f31509l);
            if (abs >= ((float) cdtr.m134950l()) || abs2 >= ((float) cdtr.m134950l())) {
                Path path2 = this.f31507j;
                float f = this.f31508k;
                float f2 = this.f31509l;
                path2.quadTo(f, f2, (x + f) / 2.0f, (y + f2) / 2.0f);
                this.f31508k = x;
                this.f31509l = y;
            }
            invalidate();
        }
        return true;
    }

    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public DrawableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23353a();
    }

    public DrawableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23353a();
    }

    /* renamed from: a */
    public final void mo18583a(int i, int i2) {
        this.f31501d.setColor(i);
        this.f31501d.setAlpha(i2);
    }
}
