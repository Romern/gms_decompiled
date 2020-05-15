package p000;

import java.util.concurrent.Callable;

/* renamed from: aedl */
final /* synthetic */ class aedl implements Callable {

    /* renamed from: a */
    private final aeed f63220a;

    /* renamed from: b */
    private final bxvp f63221b;

    public aedl(aeed aeed, bxvp bxvp) {
        this.f63220a = aeed;
        this.f63221b = bxvp;
    }

    public final Object call() {
        aeef aeef;
        aeed aeed = this.f63220a;
        bxvp bxvp = this.f63221b;
        aeeg b = aeed.mo34079b(bxvp);
        if (aeed.f63248b == null) {
            aeef = aeed.m51692a(b);
        } else {
            aeef = aeed.mo34088f(bxvp);
        }
        boolean z = true;
        if (!aeef.mo34090a(2)) {
            bnsi a = aeed.f63247a.mo55954a();
            a.mo68432a("aeed", "h", 530, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68409a("One time sync %d disabled", bxvp.mo3214a());
            z = false;
        } else {
            aebi aebi = new aebi();
            aebi.f63097i = b.mo34053a();
            aebi.f63099k = b.mo34055c();
            aebi.mo34024a(0, 0);
            bylh bylh = aeef.f63268a;
            if (bylh != null) {
                byla byla = bylh.f166835b;
                if (byla == null) {
                    byla = byla.f166805d;
                }
                if ((byla.f166807a & 1) != 0) {
                    byla byla2 = aeef.f63268a.f166835b;
                    if (byla2 == null) {
                        byla2 = byla.f166805d;
                    }
                    bykf bykf = byla2.f166808b;
                    if (bykf == null) {
                        bykf = bykf.f166742c;
                    }
                    bykg bykg = bykf.f166745b;
                    if (bykg == null) {
                        bykg = bykg.f166747c;
                    }
                    bxun bxun = bykg.f166749a;
                    if (bxun == null) {
                        bxun = bxun.f164861c;
                    }
                    long a2 = bxzr.m124574a(bxun);
                    bykg bykg2 = bykf.f166745b;
                    if (bykg2 == null) {
                        bykg2 = bykg.f166747c;
                    }
                    bxun bxun2 = bykg2.f166750b;
                    if (bxun2 == null) {
                        bxun2 = bxun.f164861c;
                    }
                    aebi.mo34004a(a2, bxzr.m124574a(bxun2));
                    bykz bykz = bykf.f166744a;
                    if (bykz == null) {
                        bykz = bykz.f166792l;
                    }
                    aeef.m51717a(bykz, aebi);
                    ((aeat) aeed.f63249c.mo6606a()).mo33984a(aebi.mo33974b());
                    bxvp.mo3214a();
                }
            }
            throw new IllegalStateException("One-time sync policy is not enabled");
        }
        return Boolean.valueOf(z);
    }
}
