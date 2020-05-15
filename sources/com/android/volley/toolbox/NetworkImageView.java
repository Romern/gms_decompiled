package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.toolbox.ImageLoader;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkImageView extends ImageView {

    /* renamed from: a */
    public int f7354a;

    /* renamed from: b */
    public Drawable f7355b;

    /* renamed from: c */
    public Bitmap f7356c;

    /* renamed from: d */
    public int f7357d;

    /* renamed from: e */
    public Drawable f7358e;

    /* renamed from: f */
    public Bitmap f7359f;

    /* renamed from: g */
    private String f7360g;

    /* renamed from: h */
    private ImageLoader f7361h;

    /* renamed from: i */
    private ImageLoader.ImageContainer f7362i;

    public NetworkImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void mo71888a() {
        int i = this.f7354a;
        if (i == 0) {
            Drawable drawable = this.f7355b;
            if (drawable == null) {
                Bitmap bitmap = this.f7356c;
                if (bitmap != null) {
                    setImageBitmap(bitmap);
                } else {
                    setImageBitmap(null);
                }
            } else {
                setImageDrawable(drawable);
            }
        } else {
            setImageResource(i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ImageLoader.ImageContainer imageContainer = this.f7362i;
        if (imageContainer != null) {
            imageContainer.cancelRequest();
            setImageBitmap(null);
            this.f7362i = null;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo4257a(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f7354a = 0;
        this.f7355b = null;
        this.f7356c = bitmap;
    }

    public void setDefaultImageDrawable(Drawable drawable) {
        this.f7354a = 0;
        this.f7356c = null;
        this.f7355b = drawable;
    }

    public void setDefaultImageResId(int i) {
        this.f7356c = null;
        this.f7355b = null;
        this.f7354a = i;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.f7357d = 0;
        this.f7358e = null;
        this.f7359f = bitmap;
    }

    public void setErrorImageDrawable(Drawable drawable) {
        this.f7357d = 0;
        this.f7359f = null;
        this.f7358e = drawable;
    }

    public void setErrorImageResId(int i) {
        this.f7359f = null;
        this.f7358e = null;
        this.f7357d = i;
    }

    public void setImageUrl(String str, ImageLoader imageLoader) {
        boh.m3401a();
        this.f7360g = str;
        this.f7361h = imageLoader;
        mo4257a(false);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4257a(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        boolean z4 = true;
        if (getLayoutParams() != null) {
            if (getLayoutParams().width == -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = getLayoutParams().height == -2;
        } else {
            z3 = false;
            z2 = false;
        }
        if (!z3) {
            z4 = false;
        } else if (!z2) {
            z4 = false;
        }
        if (width != 0 || height != 0 || z4) {
            if (TextUtils.isEmpty(this.f7360g)) {
                ImageLoader.ImageContainer imageContainer = this.f7362i;
                if (imageContainer != null) {
                    imageContainer.cancelRequest();
                    this.f7362i = null;
                }
                mo71888a();
                return;
            }
            ImageLoader.ImageContainer imageContainer2 = this.f7362i;
            if (!(imageContainer2 == null || imageContainer2.getRequestUrl() == null)) {
                if (!this.f7362i.getRequestUrl().equals(this.f7360g)) {
                    this.f7362i.cancelRequest();
                    mo71888a();
                } else {
                    return;
                }
            }
            if (z3) {
                width = 0;
            }
            if (!z2) {
                i = height;
            } else {
                i = 0;
            }
            this.f7362i = this.f7361h.get(this.f7360g, new bog(this, z), width, i, scaleType);
        }
    }
}
