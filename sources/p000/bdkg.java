package p000;

import java.util.concurrent.Executor;

/* renamed from: bdkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdkg {

    /* renamed from: a */
    public final bdpz f105794a;

    /* renamed from: b */
    public final cijl f105795b;

    /* renamed from: c */
    public final cijl f105796c;

    /* renamed from: d */
    private final bdif f105797d;

    /* renamed from: e */
    private final Executor f105798e;

    public bdkg(cijl cijl, cijl cijl2, bdif bdif, Executor executor, bdpz bdpz) {
        this.f105797d = bdif;
        this.f105794a = bdpz;
        bmxy.m108581a(cijl);
        this.f105795b = cijl;
        bmxy.m108581a(cijl2);
        this.f105796c = cijl2;
        this.f105798e = executor;
    }

    /* renamed from: a */
    public final bqgg mo58100a(bqeg bqeg) {
        if (this.f105797d.f105691b) {
            return bqga.m112770a();
        }
        try {
            return bqga.m112771a(new bdke(this, bqeg), this.f105798e);
        } catch (Exception e) {
            return bqga.m112777a((Throwable) e);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo58102a(cios cios) {
        mo58104b(null, true, cios, null, null);
    }

    @Deprecated
    /* renamed from: b */
    public final void mo58104b(String str, boolean z, cios cios, cimz cimz, String str2) {
        bdhp.m90826a(mo58101a(str, z, cios, cimz, str2));
    }

    /* renamed from: a */
    public final bqgg mo58101a(String str, boolean z, cios cios, cimz cimz, String str2) {
        if (cios == null) {
            String valueOf = String.valueOf(str);
            return bqga.m112777a((Throwable) new IllegalArgumentException(valueOf.length() == 0 ? new String("metric is null, skipping recorded metric for event: ") : "metric is null, skipping recorded metric for event: ".concat(valueOf)));
        } else if (this.f105797d.f105691b) {
            return bqga.m112770a();
        } else {
            return bqga.m112776a(new bdkf(this, cios, z, str, cimz, str2), this.f105798e);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo58103a(String str, boolean z, cios cios, cimz cimz) {
        mo58104b(str, z, cios, cimz, null);
    }
}
