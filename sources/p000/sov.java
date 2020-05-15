package p000;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: sov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sov {

    /* renamed from: a */
    public final RectF f44878a = new RectF();

    /* renamed from: b */
    public final Paint f44879b = new Paint();

    /* renamed from: c */
    public float f44880c = 0.0f;

    /* renamed from: d */
    public float f44881d = 0.0f;

    /* renamed from: e */
    public float f44882e = 0.0f;

    /* renamed from: f */
    public float f44883f = 5.0f;

    /* renamed from: g */
    public float f44884g = 2.5f;

    /* renamed from: h */
    public int[] f44885h;

    /* renamed from: i */
    public int f44886i;

    /* renamed from: j */
    public float f44887j;

    /* renamed from: k */
    public float f44888k;

    /* renamed from: l */
    public float f44889l;

    /* renamed from: m */
    public float f44890m;

    /* renamed from: n */
    public double f44891n;

    /* renamed from: o */
    public int f44892o;

    /* renamed from: p */
    public final Paint f44893p = new Paint();

    /* renamed from: q */
    private final Paint f44894q = new Paint();

    /* renamed from: r */
    private final Drawable.Callback f44895r;

    public sov(Drawable.Callback callback) {
        this.f44895r = callback;
        this.f44879b.setStrokeCap(Paint.Cap.SQUARE);
        this.f44879b.setAntiAlias(true);
        this.f44879b.setStyle(Paint.Style.STROKE);
        this.f44894q.setStyle(Paint.Style.FILL);
        this.f44894q.setAntiAlias(true);
    }

    /* renamed from: a */
    public final void mo25899a() {
        this.f44886i = (this.f44886i + 1) % this.f44885h.length;
    }

    /* renamed from: b */
    public final void mo25902b() {
        this.f44887j = this.f44880c;
        this.f44888k = this.f44881d;
        this.f44889l = this.f44882e;
    }

    /* renamed from: c */
    public final void mo25904c() {
        this.f44887j = 0.0f;
        this.f44888k = 0.0f;
        this.f44889l = 0.0f;
        mo25900a(0.0f);
        mo25903b(0.0f);
        mo25905c(0.0f);
    }

    /* renamed from: d */
    public final void mo25906d() {
        this.f44895r.invalidateDrawable(null);
    }

    /* renamed from: e */
    public final void mo25907e() {
        this.f44886i = 0;
    }

    /* renamed from: a */
    public final void mo25900a(float f) {
        this.f44880c = f;
        mo25906d();
    }

    /* renamed from: b */
    public final void mo25903b(float f) {
        this.f44881d = f;
        mo25906d();
    }

    /* renamed from: c */
    public final void mo25905c(float f) {
        this.f44882e = f;
        mo25906d();
    }

    /* renamed from: a */
    public final void mo25901a(int[] iArr) {
        this.f44885h = iArr;
        mo25907e();
    }
}
