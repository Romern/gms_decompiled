package p000;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: azwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azwz {

    /* renamed from: a */
    public final double f100141a = 100.0d;

    /* renamed from: b */
    public final double f100142b = 18.0d;

    /* renamed from: c */
    public final CopyOnWriteArrayList f100143c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public double f100144d;

    /* renamed from: e */
    public double f100145e;

    /* renamed from: f */
    public double f100146f;

    /* renamed from: g */
    public double f100147g;

    /* renamed from: h */
    public double f100148h;

    /* renamed from: i */
    public double f100149i;

    /* renamed from: j */
    public double f100150j;

    /* renamed from: k */
    public boolean f100151k = true;

    /* renamed from: l */
    public boolean f100152l = false;

    /* renamed from: m */
    public double f100153m = 0.0d;

    /* renamed from: a */
    public static boolean m86311a(double d, double d2, double d3) {
        return d2 >= d3 ? d < d3 : d > d3;
    }

    /* renamed from: b */
    public final void mo55349b() {
        this.f100152l = true;
    }

    /* renamed from: a */
    public final void mo55346a(double d) {
        if (d != this.f100150j) {
            this.f100150j = d;
            this.f100149i = this.f100146f;
            Iterator it = this.f100143c.iterator();
            while (it.hasNext()) {
                ((azxd) it.next()).mo55351a(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo55350b(double d) {
        if (d != this.f100146f) {
            this.f100146f = d;
            this.f100149i = d;
            Iterator it = this.f100143c.iterator();
            while (it.hasNext()) {
                azxd azxd = (azxd) it.next();
                azxd.mo55351a(this);
                azxd.mo55355a(d);
            }
        }
    }

    /* renamed from: a */
    public final void mo55347a(azxd azxd) {
        this.f100143c.add(azxd);
    }

    /* renamed from: a */
    public final boolean mo55348a() {
        return Math.abs(this.f100147g) <= 0.005d && Math.abs(this.f100150j - this.f100146f) <= 0.005d;
    }
}
