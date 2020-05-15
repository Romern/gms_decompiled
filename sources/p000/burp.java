package p000;

import android.accounts.Account;
import android.os.SystemClock;

/* renamed from: burp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class burp implements bqfp {

    /* renamed from: a */
    final /* synthetic */ Account f154779a;

    /* renamed from: b */
    final /* synthetic */ burt f154780b;

    /* renamed from: c */
    final /* synthetic */ long f154781c;

    /* renamed from: d */
    final /* synthetic */ bqfp f154782d;

    /* renamed from: e */
    final /* synthetic */ buru f154783e;

    public burp(buru buru, Account account, burt burt, long j, bqfp bqfp) {
        this.f154783e = buru;
        this.f154779a = account;
        this.f154780b = burt;
        this.f154781c = j;
        this.f154782d = bqfp;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        busr busr = busr.f154819a;
        this.f154783e.mo73057a(this.f154779a, this.f154780b, SystemClock.elapsedRealtime() - this.f154781c, null);
        bqfp bqfp = this.f154782d;
        if (bqfp != null) {
            bqfp.mo6480a(voidR);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("burp", "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Footprints Manager: Write failed.");
        this.f154783e.mo73057a(this.f154779a, this.f154780b, SystemClock.elapsedRealtime() - this.f154781c, th);
        bqfp bqfp = this.f154782d;
        if (bqfp != null) {
            bqfp.mo6481a(th);
        }
    }
}
