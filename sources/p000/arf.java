package p000;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: arf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arf {

    /* renamed from: a */
    final RectF f2056a = new RectF();

    /* renamed from: b */
    final Paint f2057b = new Paint();

    /* renamed from: c */
    final Paint f2058c = new Paint();

    /* renamed from: d */
    final Paint f2059d = new Paint();

    /* renamed from: e */
    float f2060e = 0.0f;

    /* renamed from: f */
    float f2061f = 0.0f;

    /* renamed from: g */
    public float f2062g = 0.0f;

    /* renamed from: h */
    float f2063h = 5.0f;

    /* renamed from: i */
    int[] f2064i;

    /* renamed from: j */
    int f2065j;

    /* renamed from: k */
    float f2066k;

    /* renamed from: l */
    float f2067l;

    /* renamed from: m */
    float f2068m;

    /* renamed from: n */
    boolean f2069n;

    /* renamed from: o */
    Path f2070o;

    /* renamed from: p */
    float f2071p = 1.0f;

    /* renamed from: q */
    public float f2072q;

    /* renamed from: r */
    int f2073r;

    /* renamed from: s */
    int f2074s;

    /* renamed from: t */
    int f2075t = 255;

    /* renamed from: u */
    int f2076u;

    public arf() {
        this.f2057b.setStrokeCap(Paint.Cap.SQUARE);
        this.f2057b.setAntiAlias(true);
        this.f2057b.setStyle(Paint.Style.STROKE);
        this.f2058c.setStyle(Paint.Style.FILL);
        this.f2058c.setAntiAlias(true);
        this.f2059d.setColor(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo2320a() {
        return (this.f2065j + 1) % this.f2064i.length;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2323a(boolean z) {
        if (this.f2069n != z) {
            this.f2069n = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo2325b() {
        return this.f2064i[this.f2065j];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo2326c() {
        this.f2066k = this.f2060e;
        this.f2067l = this.f2061f;
        this.f2068m = this.f2062g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo2327d() {
        this.f2066k = 0.0f;
        this.f2067l = 0.0f;
        this.f2068m = 0.0f;
        this.f2060e = 0.0f;
        this.f2061f = 0.0f;
        this.f2062g = 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2321a(float f) {
        this.f2063h = f;
        this.f2057b.setStrokeWidth(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2322a(int i) {
        this.f2065j = i;
        this.f2076u = this.f2064i[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2324a(int[] iArr) {
        this.f2064i = iArr;
        mo2322a(0);
    }
}
