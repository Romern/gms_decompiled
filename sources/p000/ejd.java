package p000;

import android.content.Context;
import java.io.Closeable;

/* renamed from: ejd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ejd implements Closeable {

    /* renamed from: a */
    public cijl f15119a;

    /* renamed from: b */
    private cijl f15120b;

    /* renamed from: c */
    private cijl f15121c;

    /* renamed from: d */
    private cijl f15122d;

    /* renamed from: e */
    private cijl f15123e;

    /* renamed from: f */
    private cijl f15124f;

    /* renamed from: g */
    private cijl f15125g;

    /* renamed from: h */
    private cijl f15126h;

    /* renamed from: i */
    private cijl f15127i;

    /* renamed from: j */
    private cijl f15128j;

    /* renamed from: k */
    private cijl f15129k;

    ejd() {
    }

    public final void close() {
        ((ekw) this.f15125g.mo6445a()).close();
    }

    public ejd(Context context) {
        this.f15120b = cayx.m127579a(eiy.f15110a);
        cayy a = cayz.m127582a(context);
        this.f15121c = a;
        ejo ejo = new ejo(a);
        this.f15122d = ejo;
        this.f15123e = cayx.m127579a(new ejr(this.f15121c, ejo));
        ema ema = new ema(this.f15121c);
        this.f15124f = ema;
        cijl a2 = cayx.m127579a(new elu(ema));
        this.f15125g = a2;
        ejx ejx = new ejx(this.f15121c, a2);
        this.f15126h = ejx;
        cijl cijl = this.f15120b;
        cijl cijl2 = this.f15123e;
        cijl cijl3 = this.f15125g;
        this.f15127i = new ejv(cijl, cijl2, ejx, cijl3, cijl3);
        cijl cijl4 = this.f15121c;
        cijl cijl5 = this.f15123e;
        cijl cijl6 = this.f15125g;
        this.f15128j = new eko(cijl4, cijl5, cijl6, this.f15126h, this.f15120b, cijl6);
        cijl cijl7 = this.f15120b;
        cijl cijl8 = this.f15125g;
        eks eks = new eks(cijl7, cijl8, this.f15126h, cijl8);
        this.f15129k = eks;
        this.f15119a = cayx.m127579a(new eje(this.f15127i, this.f15128j, eks));
    }
}
