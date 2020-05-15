package com.google.android.gms.ocr.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DetectedSegmentsView extends View {

    /* renamed from: a */
    public akpo f81365a;

    /* renamed from: b */
    public float[] f81366b;

    /* renamed from: c */
    private final Paint f81367c;

    /* renamed from: d */
    private float f81368d;

    /* renamed from: e */
    private float f81369e;

    public DetectedSegmentsView(Context context) {
        this(context, null);
    }

    public final void onDraw(Canvas canvas) {
        if (this.f81365a != null) {
            canvas.translate(0.0f, -this.f81369e);
            float f = this.f81368d;
            canvas.scale(f, f);
            float[] fArr = this.f81366b;
            if (fArr != null && fArr.length > 0) {
                canvas.drawLines(fArr, this.f81367c);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f81365a != null) {
            int measuredWidth = getMeasuredWidth();
            akpo akpo = this.f81365a;
            float f = ((float) measuredWidth) / ((float) akpo.f72392a);
            this.f81368d = f;
            this.f81369e = ((f * ((float) akpo.f72393b)) - ((float) getMeasuredHeight())) / 2.0f;
        }
    }

    public DetectedSegmentsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f81367c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f81367c.setStrokeWidth(4.0f);
        this.f81367c.setStrokeCap(Paint.Cap.ROUND);
        this.f81367c.setAntiAlias(true);
        this.f81367c.setARGB(204, 128, 255, 128);
    }
}
