package p000;

import java.io.IOException;

/* renamed from: cigt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cigt {

    /* renamed from: a */
    public final cigh f190165a;

    /* renamed from: b */
    public final ciho f190166b;

    /* renamed from: c */
    public int f190167c = 65535;

    /* renamed from: d */
    public final cigr f190168d = new cigr(this, 0, 65535);

    public cigt(cigh cigh, ciho ciho) {
        bmxy.m108582a(cigh, "transport");
        this.f190165a = cigh;
        bmxy.m108582a(ciho, "frameWriter");
        this.f190166b = ciho;
    }

    /* renamed from: a */
    private final cigr m150271a(cifz cifz) {
        Object obj = cifz.f190074f;
        if (obj != null) {
            return (cigr) obj;
        }
        cigr cigr = new cigr(this, cifz, this.f190167c);
        cifz.f190074f = cigr;
        return cigr;
    }

    /* renamed from: b */
    public final void mo86087b() {
        cifz[] d = this.f190165a.mo86064d();
        int i = this.f190168d.f190159c;
        int length = d.length;
        while (true) {
            int i2 = 0;
            if (length > 0 && i > 0) {
                int ceil = (int) Math.ceil((double) (((float) i) / ((float) length)));
                for (int i3 = 0; i3 < length && i > 0; i3++) {
                    cifz cifz = d[i3];
                    cigr a = m150271a(cifz);
                    int min = Math.min(i, Math.min(a.mo86077a(), ceil));
                    if (min > 0) {
                        a.f190160d += min;
                        i -= min;
                    }
                    if (a.mo86077a() > 0) {
                        d[i2] = cifz;
                        i2++;
                    }
                }
                length = i2;
            }
        }
        cigs cigs = new cigs();
        for (cifz cifz2 : this.f190165a.mo86064d()) {
            cigr a2 = m150271a(cifz2);
            a2.mo86079a(a2.f190160d, cigs);
            a2.f190160d = 0;
        }
        if (cigs.mo86083a()) {
            mo86084a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86084a() {
        try {
            this.f190166b.mo86040b();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void mo86085a(cifz cifz, int i) {
        if (cifz != null) {
            cigr a = m150271a(cifz);
            a.mo86078a(i);
            cigs cigs = new cigs();
            a.mo86079a(a.mo86081b(), cigs);
            if (cigs.mo86083a()) {
                mo86084a();
                return;
            }
            return;
        }
        this.f190168d.mo86078a(i);
        mo86087b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86086a(boolean z, int i, cipu cipu, boolean z2) {
        bmxy.m108582a(cipu, "source");
        cifz b = this.f190165a.mo86060b(i);
        if (b != null) {
            cigr a = m150271a(b);
            int b2 = a.mo86081b();
            boolean c = a.mo86082c();
            int i2 = (int) cipu.f191213b;
            if (c || b2 < i2) {
                if (!c && b2 > 0) {
                    a.mo86080a(cipu, b2, false);
                }
                a.f190157a.mo74930a(cipu, (long) ((int) cipu.f191213b));
                a.f190162f = z | a.f190162f;
            } else {
                a.mo86080a(cipu, i2, z);
            }
            if (z2) {
                mo86084a();
            }
        }
    }
}
