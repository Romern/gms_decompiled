package p000;

import java.io.IOException;

/* renamed from: cigr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cigr {

    /* renamed from: a */
    final cipu f190157a;

    /* renamed from: b */
    final int f190158b;

    /* renamed from: c */
    int f190159c;

    /* renamed from: d */
    int f190160d;

    /* renamed from: e */
    cifz f190161e;

    /* renamed from: f */
    boolean f190162f;

    /* renamed from: g */
    final /* synthetic */ cigt f190163g;

    public cigr(cigt cigt, int i, int i2) {
        this.f190163g = cigt;
        this.f190162f = false;
        this.f190158b = i;
        this.f190159c = i2;
        this.f190157a = new cipu();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo86077a() {
        return Math.max(0, Math.min(this.f190159c, (int) this.f190157a.f191213b)) - this.f190160d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo86081b() {
        return Math.min(this.f190159c, this.f190163g.f190168d.f190159c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo86082c() {
        return this.f190157a.f191213b > 0;
    }

    public cigr(cigt cigt, cifz cifz, int i) {
        this(cigt, cifz.f190075g, i);
        this.f190161e = cifz;
    }

    /* renamed from: a */
    public final void mo86078a(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.f190159c) {
            this.f190159c += i;
            return;
        }
        int i2 = this.f190158b;
        StringBuilder sb = new StringBuilder(44);
        sb.append("Window size overflow for stream: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86079a(int i, cigs cigs) {
        int min = Math.min(i, mo86081b());
        int i2 = 0;
        while (mo86082c() && min > 0) {
            cipu cipu = this.f190157a;
            long j = cipu.f191213b;
            if (((long) min) >= j) {
                int i3 = (int) j;
                i2 += i3;
                mo86080a(cipu, i3, this.f190162f);
            } else {
                i2 += min;
                mo86080a(cipu, min, false);
            }
            cigs.f190164a++;
            min = Math.min(i - i2, mo86081b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86080a(cipu cipu, int i, boolean z) {
        do {
            int min = Math.min(i, ((cihw) ((cifq) this.f190163g.f190166b).f190023b).f190379a);
            int i2 = -min;
            this.f190163g.f190168d.mo86078a(i2);
            mo86078a(i2);
            try {
                boolean z2 = cipu.f191213b != ((long) min) ? false : z;
                ciho ciho = this.f190163g.f190166b;
                int i3 = this.f190158b;
                ((cifq) ciho).f190024c.mo86070a(2, i3, cipu, min, z2);
                try {
                    ((cifq) ciho).f190023b.mo86038a(z2, i3, cipu, min);
                } catch (IOException e) {
                    ((cifq) ciho).f190022a.mo86031a(e);
                }
                this.f190161e.f190076h.mo85778c(min);
                i -= min;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } while (i > 0);
    }
}
