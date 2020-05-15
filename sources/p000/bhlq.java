package p000;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: bhlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhlq extends Drawable.ConstantState {

    /* renamed from: a */
    public bhlx f118968a;

    /* renamed from: b */
    public bhid f118969b;

    /* renamed from: c */
    public ColorFilter f118970c;

    /* renamed from: d */
    public ColorStateList f118971d = null;

    /* renamed from: e */
    public ColorStateList f118972e = null;

    /* renamed from: f */
    public ColorStateList f118973f = null;

    /* renamed from: g */
    public ColorStateList f118974g = null;

    /* renamed from: h */
    public PorterDuff.Mode f118975h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    public Rect f118976i = null;

    /* renamed from: j */
    public float f118977j = 1.0f;

    /* renamed from: k */
    public float f118978k = 1.0f;

    /* renamed from: l */
    public float f118979l;

    /* renamed from: m */
    public int f118980m = 255;

    /* renamed from: n */
    public float f118981n = 0.0f;

    /* renamed from: o */
    public float f118982o = 0.0f;

    /* renamed from: p */
    public float f118983p = 0.0f;

    /* renamed from: q */
    public int f118984q = 0;

    /* renamed from: r */
    public int f118985r = 0;

    /* renamed from: s */
    public int f118986s = 0;

    /* renamed from: t */
    public int f118987t = 0;

    /* renamed from: u */
    public boolean f118988u = false;

    /* renamed from: v */
    public Paint.Style f118989v = Paint.Style.FILL_AND_STROKE;

    public bhlq(bhlq bhlq) {
        this.f118968a = bhlq.f118968a;
        this.f118969b = bhlq.f118969b;
        this.f118979l = bhlq.f118979l;
        this.f118970c = bhlq.f118970c;
        this.f118971d = bhlq.f118971d;
        this.f118972e = bhlq.f118972e;
        this.f118975h = bhlq.f118975h;
        this.f118974g = bhlq.f118974g;
        this.f118980m = bhlq.f118980m;
        this.f118977j = bhlq.f118977j;
        this.f118986s = bhlq.f118986s;
        int i = bhlq.f118984q;
        this.f118984q = 0;
        boolean z = bhlq.f118988u;
        this.f118988u = false;
        this.f118978k = bhlq.f118978k;
        this.f118981n = bhlq.f118981n;
        this.f118982o = bhlq.f118982o;
        float f = bhlq.f118983p;
        this.f118983p = 0.0f;
        this.f118985r = bhlq.f118985r;
        this.f118987t = bhlq.f118987t;
        ColorStateList colorStateList = bhlq.f118973f;
        this.f118973f = null;
        this.f118989v = bhlq.f118989v;
        Rect rect = bhlq.f118976i;
        if (rect != null) {
            this.f118976i = new Rect(rect);
        }
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        bhlr bhlr = new bhlr(this);
        bhlr.f119011w = true;
        return bhlr;
    }

    public bhlq(bhlx bhlx) {
        this.f118968a = bhlx;
        this.f118969b = null;
    }
}
