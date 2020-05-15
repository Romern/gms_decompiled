package p000;

/* renamed from: cifx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cifx implements chwk {

    /* renamed from: a */
    final /* synthetic */ cifz f190053a;

    public cifx(cifz cifz) {
        this.f190053a = cifz;
    }

    /* renamed from: a */
    public final void mo85727a(int i) {
        int i2 = ciix.f190424a;
        cify cify = this.f190053a.f190076h;
        int i3 = cify.f190054v;
        synchronized (cify.f190055a) {
            this.f190053a.f190076h.mo85776b(i);
        }
    }

    /* renamed from: a */
    public final void mo85728a(chtr chtr) {
        boolean z;
        int i = ciix.f190424a;
        String valueOf = String.valueOf(this.f190053a.f190070b.f189150b);
        String str = valueOf.length() == 0 ? new String("/") : "/".concat(valueOf);
        cify cify = this.f190053a.f190076h;
        int i2 = cify.f190054v;
        synchronized (cify.f190055a) {
            cify cify2 = this.f190053a.f190076h;
            cifz cifz = cify2.f190065u;
            String str2 = cifz.f190073e;
            String str3 = cifz.f190071c;
            boolean z2 = cifz.f190077i;
            if (cify2.f190063i.f190125t == null) {
                z = true;
            } else {
                z = false;
            }
            cify2.f190056b = cifr.m150186a(chtr, str, str2, str3, false, z);
            cigh cigh = cify2.f190063i;
            cifz cifz2 = cify2.f190065u;
            chuv chuv = cigh.f190121p;
            if (chuv != null) {
                cifz2.f190076h.mo85773a(chuv, chxt.REFUSED, true, new chtr());
            } else if (cigh.f190116k.size() >= cigh.f190126u) {
                cigh.f190127v.add(cifz2);
                cigh.mo86062c(cifz2);
            } else {
                cigh.mo86057a(cifz2);
            }
        }
    }

    /* renamed from: a */
    public final void mo85729a(chuv chuv) {
        int i = ciix.f190424a;
        cify cify = this.f190053a.f190076h;
        int i2 = cify.f190054v;
        synchronized (cify.f190055a) {
            this.f190053a.f190076h.mo86049c(chuv, true, null);
        }
    }

    /* renamed from: a */
    public final void mo85730a(cifi cifi, boolean z, boolean z2, int i) {
        cipu cipu;
        boolean z3;
        int i2 = ciix.f190424a;
        if (cifi == null) {
            cipu = cifz.f190069a;
        } else {
            cipu = ((cigp) cifi).f190154a;
            int i3 = (int) cipu.f191213b;
            if (i3 > 0) {
                this.f190053a.mo85781d(i3);
            }
        }
        cify cify = this.f190053a.f190076h;
        int i4 = cify.f190054v;
        synchronized (cify.f190055a) {
            cify cify2 = this.f190053a.f190076h;
            if (!cify2.f190060f) {
                if (cify2.f190064t) {
                    cify2.f190057c.mo74930a(cipu, (long) ((int) cipu.f191213b));
                    cify2.f190058d |= z;
                    cify2.f190059e |= z2;
                } else {
                    if (cify2.f190065u.f190075g != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bmxy.m108601b(z3, "streamId should be set");
                    cify2.f190062h.mo86086a(z, cify2.f190065u.f190075g, cipu, z2);
                }
            }
            cifh cifh = this.f190053a.f189385r;
            if (i != 0) {
                cifh.f190005g += (long) i;
                cifh.f190000b.mo86026a();
            }
        }
    }
}
