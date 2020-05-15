package com.google.android.gms.auth.authzen.magicwand.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GraphicOverlay extends View {

    /* renamed from: a */
    private final Paint f10492a = new Paint();

    /* renamed from: b */
    private final RectF f10493b = new RectF(0.0f, 0.0f, 400.0f, 400.0f);

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10492a.setColor(-1);
        this.f10492a.setAlpha(128);
        this.f10492a.setStyle(Paint.Style.STROKE);
        this.f10492a.setStrokeWidth(8.0f);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = ((float) canvas.getWidth()) * 0.33f;
        this.f10493b.set(0.0f, 0.0f, width, width);
        this.f10493b.offsetTo((((float) canvas.getWidth()) - width) / 2.0f, (((float) canvas.getHeight()) - width) / 2.0f);
        canvas.drawRect(this.f10493b, this.f10492a);
    }
}
