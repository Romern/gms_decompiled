package p000;

import android.os.SystemClock;

/* renamed from: bgqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgqr implements sqv {

    /* renamed from: a */
    private final bgqq f117304a;

    public bgqr(bgqq bgqq) {
        this.f117304a = bgqq;
    }

    /* renamed from: a */
    public final long mo20505a() {
        buov a = this.f117304a.mo63107b().mo63103a();
        int i = a.f154595b;
        buou buou = a.f154594a;
        if (buou == null) {
            buou = buou.f154588c;
        }
        buow buow = buou.f154590a;
        if (buow == null) {
            buow = buow.f154597c;
        }
        long j = buow.f154599a;
        buou buou2 = a.f154594a;
        if (buou2 == null) {
            buou2 = buou.f154588c;
        }
        long j2 = (long) buou2.f154591b;
        buou buou3 = a.f154594a;
        if (buou3 == null) {
            buou3 = buou.f154588c;
        }
        buow buow2 = buou3.f154590a;
        if (buow2 == null) {
            buow2 = buow.f154597c;
        }
        return j + ((j2 - ((long) buow2.f154600b)) / 2) + ((long) i);
    }

    /* renamed from: b */
    public final long mo20506b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo20507c() {
        throw new UnsupportedOperationException();
    }
}
