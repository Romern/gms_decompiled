package com.google.android.gms.ocr.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardHintBoundingBox extends BoundingBox {

    /* renamed from: a */
    private final Paint f81355a;

    /* renamed from: b */
    private final int f81356b;

    /* renamed from: c */
    private final Path f81357c;

    /* renamed from: d */
    private final Path f81358d;

    /* renamed from: e */
    private final Path f81359e;

    /* renamed from: f */
    private final Path f81360f;

    /* renamed from: g */
    private boolean f81361g;

    /* renamed from: h */
    private boolean f81362h;

    /* renamed from: i */
    private boolean f81363i;

    /* renamed from: j */
    private boolean f81364j;

    public CardHintBoundingBox(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44751a(Rect rect) {
        super.mo44751a(rect);
        int i = this.f81356b / 2;
        rect.left = Math.max(i, rect.left);
        rect.right = Math.max(i, rect.right);
        rect.top = Math.max(i, rect.top);
        rect.bottom = Math.max(i, rect.bottom);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (mo44753b()) {
            super.onDraw(canvas);
            if (this.f81361g) {
                canvas.drawPath(this.f81357c, this.f81355a);
            }
            if (this.f81362h) {
                canvas.drawPath(this.f81358d, this.f81355a);
            }
            if (this.f81363i) {
                canvas.drawPath(this.f81359e, this.f81355a);
            }
            if (this.f81364j) {
                canvas.drawPath(this.f81360f, this.f81355a);
            }
        }
    }

    public CardHintBoundingBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardHintBoundingBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81357c = new Path();
        this.f81358d = new Path();
        this.f81359e = new Path();
        this.f81360f = new Path();
        this.f81356b = getResources().getDimensionPixelSize(C0126R.dimen.ocr_edge_detection_hint_line_width);
        this.f81355a = BoundingBox.m67719a(getResources().getColor(C0126R.color.ocr_edge_detection_hint_stroke), this.f81356b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44752a(Rect rect, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, float f) {
        this.f81357c.reset();
        this.f81357c.addArc(rectF4, 135.0f, 45.0f);
        this.f81357c.lineTo((float) rect.left, ((float) rect.top) + f);
        this.f81357c.arcTo(rectF, 180.0f, 45.0f);
        this.f81358d.reset();
        this.f81358d.addArc(rectF, 225.0f, 45.0f);
        this.f81358d.lineTo(((float) rect.right) - f, (float) rect.top);
        this.f81358d.arcTo(rectF2, 270.0f, 45.0f);
        this.f81359e.reset();
        this.f81359e.addArc(rectF2, 315.0f, 45.0f);
        this.f81359e.lineTo((float) rect.right, ((float) rect.bottom) - f);
        this.f81359e.arcTo(rectF3, 0.0f, 45.0f);
        this.f81360f.reset();
        this.f81360f.addArc(rectF3, 45.0f, 45.0f);
        this.f81360f.lineTo(((float) rect.right) - f, (float) rect.bottom);
        this.f81360f.arcTo(rectF4, 90.0f, 45.0f);
    }

    /* renamed from: a */
    public final void mo44756a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f81361g = z;
        this.f81362h = z2;
        this.f81363i = z3;
        this.f81364j = z4;
        invalidate();
    }
}
