package com.google.android.gms.ocr.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BoundingBox extends View {

    /* renamed from: a */
    private final float f81344a;

    /* renamed from: b */
    private final float f81345b;

    /* renamed from: c */
    private final PaintDrawable f81346c;

    /* renamed from: d */
    private final Paint f81347d;

    /* renamed from: e */
    private float f81348e;

    /* renamed from: f */
    private final int f81349f;

    /* renamed from: g */
    private final Rect f81350g;

    /* renamed from: h */
    private final RectF f81351h;

    /* renamed from: i */
    private final RectF f81352i;

    /* renamed from: j */
    private final RectF f81353j;

    /* renamed from: k */
    private final RectF f81354k;

    public BoundingBox(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    protected static final Paint m67719a(int i, int i2) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) i2);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo44752a(Rect rect, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo44753b() {
        return this.f81350g.width() > 0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (mo44753b()) {
            this.f81346c.draw(canvas);
            int i = Build.VERSION.SDK_INT;
            int i2 = this.f81350g.left;
            int i3 = this.f81350g.top;
            int i4 = this.f81350g.right;
            int i5 = this.f81350g.bottom;
            float f = this.f81348e;
            canvas.drawRoundRect((float) i2, (float) i3, (float) i4, (float) i5, f, f, this.f81347d);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Rect rect = this.f81350g;
        mo44751a(rect);
        int measuredWidth = (getMeasuredWidth() - rect.left) - rect.right;
        int measuredHeight = (getMeasuredHeight() - rect.top) - rect.bottom;
        if (this.f81350g.width() != measuredWidth || this.f81350g.height() != measuredHeight) {
            float f = (float) measuredWidth;
            float f2 = this.f81344a;
            if (f2 < 0.0f) {
                f2 = this.f81345b * f;
            }
            this.f81348e = f2;
            float f3 = f2 + f2;
            this.f81350g.set(rect.left, rect.top, measuredWidth + rect.width(), measuredHeight + rect.height());
            this.f81346c.setCornerRadius(this.f81348e);
            this.f81346c.setBounds(this.f81350g);
            this.f81351h.set((float) this.f81350g.left, (float) this.f81350g.top, ((float) this.f81350g.left) + f3, ((float) this.f81350g.top) + f3);
            this.f81352i.set(((float) this.f81350g.right) - f3, (float) this.f81350g.top, (float) this.f81350g.right, ((float) this.f81350g.top) + f3);
            this.f81353j.set(((float) this.f81350g.right) - f3, ((float) this.f81350g.bottom) - f3, (float) this.f81350g.right, (float) this.f81350g.bottom);
            this.f81354k.set((float) this.f81350g.left, ((float) this.f81350g.bottom) - f3, ((float) this.f81350g.left) + f3, (float) this.f81350g.bottom);
            int i3 = Build.VERSION.SDK_INT;
            mo44752a(this.f81350g, this.f81351h, this.f81352i, this.f81353j, this.f81354k, this.f81348e);
        }
    }

    public BoundingBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo44750a() {
        this.f81346c.getPaint().setAntiAlias(false);
        this.f81346c.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        invalidate();
    }

    public BoundingBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81346c = new PaintDrawable();
        new Path();
        this.f81350g = new Rect();
        this.f81351h = new RectF();
        this.f81352i = new RectF();
        this.f81353j = new RectF();
        this.f81354k = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, eoi.f15391c, 0, 0);
        try {
            this.f81349f = obtainStyledAttributes.getDimensionPixelSize(2, getResources().getDimensionPixelSize(C0126R.dimen.ocr_bounding_box_line_width));
            this.f81347d = m67719a(obtainStyledAttributes.getColor(1, getResources().getColor(17170443)), this.f81349f);
            this.f81345b = obtainStyledAttributes.getFloat(0, 0.0406f);
            this.f81344a = obtainStyledAttributes.getDimension(3, -1.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo44751a(Rect rect) {
        int i = this.f81349f;
        rect.set(i, i, i, i);
    }
}
