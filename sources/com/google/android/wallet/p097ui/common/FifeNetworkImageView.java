package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import java.util.List;

/* renamed from: com.google.android.wallet.ui.common.FifeNetworkImageView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FifeNetworkImageView extends NetworkImageView {

    /* renamed from: g */
    private boolean f151948g;

    /* renamed from: h */
    public bkdi f151949h;

    /* renamed from: i */
    public ImageLoader f151950i;

    /* renamed from: j */
    public boolean f151951j;

    /* renamed from: k */
    public List f151952k;

    /* renamed from: l */
    private boolean f151953l;

    /* renamed from: m */
    private int f151954m;

    /* renamed from: n */
    private String f151955n;

    /* renamed from: o */
    private String f151956o;

    /* renamed from: p */
    private float f151957p;

    /* renamed from: q */
    private int f151958q;

    public FifeNetworkImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m118451a(Context context, AttributeSet attributeSet) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkju.f124466d);
        boolean z2 = false;
        this.f151957p = obtainStyledAttributes.getFloat(0, -1.0f);
        int i = obtainStyledAttributes.getInt(1, -1);
        this.f151958q = i;
        if (this.f151957p != -1.0f) {
            z = false;
        } else {
            z = true;
        }
        if (i == -1) {
            z2 = true;
        }
        if (z == z2) {
            obtainStyledAttributes.recycle();
            return;
        }
        throw new RuntimeException("Both internalUicAspectRatio and internalUicDominantDimension must be specified.");
    }

    /* renamed from: b */
    public final void mo71891b() {
        this.f151953l = true;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f151953l = false;
        String str = this.f151956o;
        if (str != null) {
            super.setImageUrl(str, this.f151950i);
            this.f151956o = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        String str = this.f151955n;
        if (str != null) {
            this.f151955n = null;
            post(new bkdh(this, str));
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f151957p > 0.0f) {
            int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
            int defaultSize2 = getDefaultSize(getSuggestedMinimumHeight(), i2);
            int i3 = this.f151958q;
            if (i3 == 0) {
                defaultSize = Math.max((int) (((float) defaultSize2) * this.f151957p), getSuggestedMinimumWidth());
            } else if (i3 == 1) {
                defaultSize2 = Math.max((int) (((float) defaultSize) / this.f151957p), getSuggestedMinimumHeight());
            }
            setMeasuredDimension(defaultSize, defaultSize2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        bkdi bkdi = this.f151949h;
        if (bkdi != null) {
            bkdi.mo52989a();
        }
        if (this.f151948g && getVisibility() == 0 && getAlpha() == 1.0f) {
            bkcd.m105305a(this, 0, (long) this.f151954m, null);
        }
    }

    public final void setImageUrl(String str, ImageLoader imageLoader) {
        if (this.f151953l) {
            this.f151956o = str;
        } else {
            super.setImageUrl(str, imageLoader);
        }
    }

    public FifeNetworkImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118451a(context, attributeSet);
    }

    public FifeNetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118451a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo71888a() {
        this.f151948g = true;
        this.f151954m = getContext().getResources().getInteger(17694720);
    }

    /* renamed from: a */
    public final void mo71889a(String str, ImageLoader imageLoader, boolean z) {
        mo71890a(str, imageLoader, z, null);
    }

    /* renamed from: a */
    public final void mo71890a(String str, ImageLoader imageLoader, boolean z, List list) {
        ViewGroup.LayoutParams layoutParams;
        this.f151950i = imageLoader;
        this.f151951j = z;
        this.f151952k = list;
        int width = getWidth();
        int height = getHeight();
        if (width == 0 && height == 0 && (layoutParams = getLayoutParams()) != null && layoutParams.width > 0 && layoutParams.height > 0) {
            width = layoutParams.width;
            height = layoutParams.height;
        }
        if (height == 0 || width == 0) {
            this.f151955n = str;
            return;
        }
        this.f151955n = null;
        setImageUrl(bkcd.m105303a(str, width, height, this.f151951j, this.f151952k), this.f151950i);
    }
}
