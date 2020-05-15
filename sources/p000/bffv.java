package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bffv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f113713a;

    /* renamed from: b */
    final /* synthetic */ bsax f113714b;

    /* renamed from: c */
    final /* synthetic */ bffw f113715c;

    public bffv(bffw bffw, int i, bsax bsax) {
        this.f113715c = bffw;
        this.f113713a = i;
        this.f113714b = bsax;
    }

    public final void run() {
        bgnq bgnq;
        bgns bgns;
        bfgp bfgp;
        this.f113715c.f113722g.mo62923b(bgnq.COLLECTIONLIB, 600000, this.f113715c.f113721f);
        try {
            bffw bffw = this.f113715c;
            if (!bffw.f113716a) {
                if (bffw.mo61635b() == null) {
                    boolean a = bfgo.f113789a.mo61665a(bffw.f113717b, TimeUnit.DAYS.toMillis(24));
                    bffw.f113716a = a;
                    if (!a) {
                        String valueOf = String.valueOf(bffw.f113717b);
                        if (valueOf.length() == 0) {
                            new String("Failed to lock dir ");
                        } else {
                            "Failed to lock dir ".concat(valueOf);
                        }
                    }
                }
                bfew bfew = this.f113715c.f113796h;
                if (bfew != null) {
                    bfew.mo61490a(this.f113713a, (String) null, "Failed to create lock file.");
                }
                bgns = this.f113715c.f113722g;
                bgnq = bgnq.COLLECTIONLIB;
                bgns.mo62925c(bgnq);
            }
            bffw bffw2 = this.f113715c;
            bsax bsax = this.f113714b;
            bffw2.mo61635b();
            synchronized (bffw2) {
                if (bffw2.f113720e == null) {
                    if (bffw2.f113718c != null) {
                        bffw2.f113720e = new bfdg(bffw2.f113717b, bfmf.m97226a(bffw2.f113718c, bffw2.f113797i));
                    } else {
                        bfgp = new bfgp(false, null, "Encryption Key invalid.");
                    }
                }
                bfgp = bffw2.f113720e.mo61462a(bsax);
            }
            bfew bfew2 = this.f113715c.f113796h;
            if (bfew2 != null) {
                String str = bfgp.f113794c;
                if (bfgp.f113792a) {
                    bmxy.m108581a(str);
                    this.f113715c.f113796h.mo61489a(this.f113713a, str);
                } else {
                    String str2 = bfgp.f113795d;
                    int i = this.f113713a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    bfew2.mo61490a(i, str, str2);
                }
            }
            bgns = this.f113715c.f113722g;
            bgnq = bgnq.COLLECTIONLIB;
            bgns.mo62925c(bgnq);
        } catch (Throwable th) {
            this.f113715c.f113722g.mo62925c(bgnq.COLLECTIONLIB);
            throw th;
        }
    }
}
