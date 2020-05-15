package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: azy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class azy {

    /* renamed from: a */
    final List f2740a = new ArrayList(1);

    /* renamed from: b */
    public boolean f2741b = false;

    /* renamed from: c */
    public float f2742c = 0.0f;

    /* renamed from: d */
    public beq f2743d;

    /* renamed from: e */
    private final List f2744e;

    /* renamed from: f */
    private beo f2745f;

    /* renamed from: g */
    private beo f2746g;

    /* renamed from: h */
    private float f2747h = -1.0f;

    /* renamed from: i */
    private Object f2748i = null;

    /* renamed from: j */
    private float f2749j = -1.0f;

    /* renamed from: k */
    private float f2750k = -1.0f;

    public azy(List list) {
        this.f2744e = list;
    }

    /* renamed from: g */
    private final float mo2946g() {
        float f = this.f2749j;
        if (f == -1.0f) {
            f = !this.f2744e.isEmpty() ? ((beo) this.f2744e.get(0)).mo3069b() : 0.0f;
            this.f2749j = f;
        }
        return f;
    }

    /* renamed from: a */
    public abstract Object mo2936a(beo beo, float f);

    /* renamed from: a */
    public void mo2937a() {
        for (int i = 0; i < this.f2740a.size(); i++) {
            ((azx) this.f2740a.get(i)).mo2922a();
        }
    }

    /* renamed from: b */
    public final beo mo2940b() {
        beo beo = this.f2745f;
        if (beo != null && beo.mo3068a(this.f2742c)) {
            axq.m2409a();
            return this.f2745f;
        }
        List list = this.f2744e;
        beo beo2 = (beo) list.get(list.size() - 1);
        if (this.f2742c < beo2.mo3069b()) {
            for (int size = this.f2744e.size() - 1; size >= 0; size--) {
                beo2 = (beo) this.f2744e.get(size);
                if (beo2.mo3068a(this.f2742c)) {
                    break;
                }
            }
        }
        this.f2745f = beo2;
        axq.m2409a();
        return beo2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final float mo2941c() {
        if (this.f2741b) {
            return 0.0f;
        }
        beo b = mo2940b();
        if (!b.mo3071d()) {
            return (this.f2742c - b.mo3069b()) / (b.mo3070c() - b.mo3069b());
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final float mo2942d() {
        beo b = mo2940b();
        if (!b.mo3071d()) {
            return b.f3105d.getInterpolation(mo2941c());
        }
        return 0.0f;
    }

    /* renamed from: e */
    public float mo2943e() {
        float f = this.f2750k;
        if (f == -1.0f) {
            if (!this.f2744e.isEmpty()) {
                List list = this.f2744e;
                f = ((beo) list.get(list.size() - 1)).mo3070c();
            } else {
                f = 1.0f;
            }
            this.f2750k = f;
        }
        return f;
    }

    /* renamed from: f */
    public Object mo2944f() {
        beo b = mo2940b();
        float d = mo2942d();
        if (this.f2743d == null && b == this.f2746g && this.f2747h == d) {
            return this.f2748i;
        }
        this.f2746g = b;
        this.f2747h = d;
        Object a = mo2936a(b, d);
        this.f2748i = a;
        return a;
    }

    /* renamed from: a */
    public void mo2938a(float f) {
        if (!this.f2744e.isEmpty()) {
            beo b = mo2940b();
            if (f < mo2946g()) {
                f = mo2946g();
            } else if (f > mo2943e()) {
                f = mo2943e();
            }
            if (f != this.f2742c) {
                this.f2742c = f;
                beo b2 = mo2940b();
                if (b != b2 || !b2.mo3071d()) {
                    mo2937a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2939a(azx azx) {
        this.f2740a.add(azx);
    }
}
