package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.AttributeSet;
import android.webkit.WebView;

/* renamed from: com.google.android.wallet.ui.common.BlurredWebView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlurredWebView extends WebView {

    /* renamed from: a */
    Bitmap f151896a;

    /* renamed from: b */
    Bitmap f151897b;

    /* renamed from: c */
    Canvas f151898c;

    /* renamed from: d */
    RenderScript f151899d;

    /* renamed from: e */
    ScriptIntrinsicBlur f151900e;

    /* renamed from: f */
    Allocation f151901f;

    /* renamed from: g */
    Allocation f151902g;

    /* renamed from: h */
    boolean f151903h;

    public BlurredWebView(Context context) {
        super(context);
        m118401a(context, null, 0, 0);
    }

    /* renamed from: a */
    private final void m118401a(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (((Boolean) bjwe.f123477L.mo54082a()).booleanValue()) {
            RenderScript create = RenderScript.create(context);
            this.f151899d = create;
            this.f151900e = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkju.f124463a, i, i2);
                this.f151900e.setRadius(obtainStyledAttributes.getDimension(0, bkfr.m105541a(3.0f)));
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void computeScroll() {
    }

    public final boolean isImportantForAccessibility() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RenderScript renderScript = this.f151899d;
        if (renderScript != null) {
            renderScript.destroy();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f151903h) {
            this.f151896a.eraseColor(0);
            super.onDraw(this.f151898c);
            this.f151901f.copyFrom(this.f151896a);
            this.f151900e.setInput(this.f151901f);
            this.f151900e.forEach(this.f151902g);
            this.f151902g.copyTo(this.f151897b);
            canvas.drawBitmap(this.f151897b, 0.0f, 0.0f, (Paint) null);
            return;
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (z) {
            int i7 = Build.VERSION.SDK_INT;
            if (i5 != 0 && i6 != 0) {
                this.f151896a = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                this.f151897b = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                this.f151898c = new Canvas(this.f151896a);
                Allocation createFromBitmap = Allocation.createFromBitmap(this.f151899d, this.f151896a, Allocation.MipmapControl.MIPMAP_NONE, 1);
                this.f151901f = createFromBitmap;
                this.f151902g = Allocation.createTyped(this.f151899d, createFromBitmap.getType());
                this.f151903h = true;
            }
        }
    }

    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return false;
    }

    public final void scrollTo(int i, int i2) {
    }

    public BlurredWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118401a(context, attributeSet, 0, 0);
    }

    public BlurredWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118401a(context, attributeSet, i, 0);
    }

    public BlurredWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m118401a(context, attributeSet, i, i2);
    }
}
