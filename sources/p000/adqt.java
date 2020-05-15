package p000;

import android.os.SystemClock;

/* renamed from: adqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqt {

    /* renamed from: a */
    private long f62519a;

    /* renamed from: b */
    private long f62520b = 0;

    /* renamed from: c */
    private int f62521c = 0;

    /* renamed from: d */
    private int f62522d = 0;

    /* renamed from: e */
    private int f62523e = 0;

    /* renamed from: f */
    private int f62524f = 0;

    /* renamed from: g */
    private int f62525g = -1;

    /* renamed from: h */
    private final int f62526h;

    /* renamed from: i */
    private int f62527i = 2;

    public adqt(int i) {
        this.f62526h = i;
        this.f62519a = 0;
    }

    /* renamed from: a */
    public final synchronized bomc mo33725a() {
        bxvd da;
        da = bomc.f133623l.mo74144da();
        int i = this.f62526h;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bomc) da.f164949b).f133625a = i - 2;
        bomc bomc = (bomc) da.f164949b;
        bomc.f133626b = 0;
        bomc.f133627c = this.f62521c;
        bomc.f133629e = this.f62522d;
        bomc.f133630f = this.f62523e;
        bomc.f133628d = this.f62524f;
        bomc.f133631g = 0;
        bomc.f133632h = 0;
        int i2 = this.f62527i;
        if (i2 != 1) {
            bomc.f133633i = i2 - 2;
            if (this.f62525g >= 0) {
                bxvd da2 = boma.f133613b.mo74144da();
                int i3 = this.f62525g;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((boma) da2.f164949b).f133615a = i3;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boma boma = (boma) da2.mo74062i();
                boma.getClass();
                ((bomc) da.f164949b).f133634j = boma;
            }
            long j = this.f62520b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bomc) da.f164949b).f133635k = j;
        } else {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return (bomc) da.mo74062i();
    }

    /* renamed from: a */
    public final synchronized void mo33726a(int i) {
        this.f62523e += i;
    }

    /* renamed from: b */
    public final synchronized void mo33727b() {
        if (this.f62519a > 0) {
            this.f62520b = SystemClock.elapsedRealtime() - this.f62519a;
        }
    }

    /* renamed from: b */
    public final synchronized void mo33728b(int i) {
        this.f62524f += i;
    }

    /* renamed from: c */
    public final void mo33729c() {
        this.f62519a = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final synchronized void mo33730c(int i) {
        this.f62522d += i;
    }

    /* renamed from: d */
    public final synchronized void mo33731d() {
        this.f62525g = 15;
    }

    /* renamed from: d */
    public final synchronized void mo33732d(int i) {
        this.f62521c += i;
    }

    /* renamed from: e */
    public final synchronized void mo33733e(int i) {
        if (this.f62527i != 4) {
            this.f62527i = i;
        }
    }
}
