package p000;

import android.graphics.Paint;

/* renamed from: auq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auq extends aut {

    /* renamed from: a */
    public int[] f2281a;

    /* renamed from: b */
    C1149kx f2282b;

    /* renamed from: c */
    float f2283c = 0.0f;

    /* renamed from: d */
    C1149kx f2284d;

    /* renamed from: e */
    float f2285e = 1.0f;

    /* renamed from: f */
    float f2286f = 1.0f;

    /* renamed from: g */
    float f2287g = 0.0f;

    /* renamed from: h */
    float f2288h = 1.0f;

    /* renamed from: i */
    float f2289i = 0.0f;

    /* renamed from: j */
    Paint.Cap f2290j = Paint.Cap.BUTT;

    /* renamed from: k */
    Paint.Join f2291k = Paint.Join.MITER;

    /* renamed from: l */
    float f2292l = 4.0f;

    public auq() {
    }

    /* renamed from: a */
    public final boolean mo2584a(int[] iArr) {
        return this.f2282b.mo14927a(iArr) | this.f2284d.mo14927a(iArr);
    }

    /* renamed from: b */
    public final boolean mo2585b() {
        return this.f2284d.mo14928b() || this.f2282b.mo14928b();
    }

    /* access modifiers changed from: package-private */
    public float getFillAlpha() {
        return this.f2286f;
    }

    /* access modifiers changed from: package-private */
    public int getFillColor() {
        return this.f2284d.f25336b;
    }

    /* access modifiers changed from: package-private */
    public float getStrokeAlpha() {
        return this.f2285e;
    }

    /* access modifiers changed from: package-private */
    public int getStrokeColor() {
        return this.f2282b.f25336b;
    }

    /* access modifiers changed from: package-private */
    public float getStrokeWidth() {
        return this.f2283c;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathEnd() {
        return this.f2288h;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathOffset() {
        return this.f2289i;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathStart() {
        return this.f2287g;
    }

    /* access modifiers changed from: package-private */
    public void setFillAlpha(float f) {
        this.f2286f = f;
    }

    /* access modifiers changed from: package-private */
    public void setFillColor(int i) {
        this.f2284d.f25336b = i;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeAlpha(float f) {
        this.f2285e = f;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeColor(int i) {
        this.f2282b.f25336b = i;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeWidth(float f) {
        this.f2283c = f;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathEnd(float f) {
        this.f2288h = f;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathOffset(float f) {
        this.f2289i = f;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathStart(float f) {
        this.f2287g = f;
    }

    public auq(auq auq) {
        super(auq);
        int[] iArr = auq.f2281a;
        this.f2281a = null;
        this.f2282b = auq.f2282b;
        this.f2283c = auq.f2283c;
        this.f2285e = auq.f2285e;
        this.f2284d = auq.f2284d;
        this.f2308o = auq.f2308o;
        this.f2286f = auq.f2286f;
        this.f2287g = auq.f2287g;
        this.f2288h = auq.f2288h;
        this.f2289i = auq.f2289i;
        this.f2290j = auq.f2290j;
        this.f2291k = auq.f2291k;
        this.f2292l = auq.f2292l;
    }
}
