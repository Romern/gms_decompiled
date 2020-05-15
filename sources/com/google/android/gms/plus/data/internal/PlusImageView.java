package com.google.android.gms.plus.data.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlusImageView extends ImageView implements rjz {

    /* renamed from: a */
    public int f82341a;

    /* renamed from: b */
    public boolean f82342b;

    /* renamed from: c */
    public boolean f82343c;

    /* renamed from: d */
    public Bitmap f82344d;

    /* renamed from: e */
    private Uri f82345e;

    /* renamed from: f */
    private anuy f82346f;

    public PlusImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m68412a() {
        boolean z;
        Uri uri = this.f82345e;
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            z = false;
        } else {
            z = true;
        }
        if (this.f82343c) {
            Uri uri2 = this.f82345e;
            if (uri2 == null) {
                setImageBitmap(null);
                return;
            }
            if (!z) {
                anuy anuy = this.f82346f;
                if (anuy != null && anuy.mo24648p()) {
                    this.f82346f.mo42323a(this, this.f82345e, this.f82341a);
                } else {
                    return;
                }
            } else {
                setImageURI(uri2);
            }
            this.f82343c = false;
        }
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        m68412a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f82342b = true;
        anuy anuy = this.f82346f;
        if (anuy != null && !anuy.mo42329b(this)) {
            this.f82346f.mo42324a(this);
        }
        Bitmap bitmap = this.f82344d;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f82342b = false;
        anuy anuy = this.f82346f;
        if (anuy != null && anuy.mo42329b(this)) {
            this.f82346f.mo42331c(this);
        }
    }

    public PlusImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlusImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo46568a(Uri uri) {
        mo46569a(uri, 0);
    }

    /* renamed from: a */
    public final void mo46569a(Uri uri, int i) {
        boolean z;
        Uri uri2 = this.f82345e;
        if (uri2 != null) {
            z = uri2.equals(uri);
        } else {
            z = uri == null;
        }
        int i2 = this.f82341a;
        if (!z || i2 != i) {
            this.f82345e = uri;
            this.f82341a = i;
            this.f82343c = true;
            m68412a();
        }
    }

    /* renamed from: a */
    public final void mo46570a(anuy anuy) {
        anuy anuy2 = this.f82346f;
        if (anuy != anuy2) {
            if (anuy2 != null && anuy2.mo42329b(this)) {
                this.f82346f.mo42331c(this);
            }
            this.f82346f = anuy;
            anuy.mo42324a(this);
        }
    }
}
