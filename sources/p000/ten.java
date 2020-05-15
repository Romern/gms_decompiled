package p000;

/* renamed from: ten */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ten implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f45773a;

    /* renamed from: b */
    final /* synthetic */ String f45774b;

    /* renamed from: c */
    final /* synthetic */ teo f45775c;

    public ten(teo teo, String str, String str2) {
        this.f45775c = teo;
        this.f45773a = str;
        this.f45774b = str2;
    }

    public final void run() {
        cbqg cbqg;
        cbqg cbqg2;
        try {
            teo teo = this.f45775c;
            cbqy a = teo.f45779d.mo26253a(teo.f45780e, teo.f45778c, teo.m36846a(this.f45773a, this.f45774b));
            tdz.m36796a();
            if (tdz.m36797a(a)) {
                if (a.f178083a == 4) {
                    cbqg = (cbqg) a.f178084b;
                } else {
                    cbqg = cbqg.f178018b;
                }
                cbnz cbnz = cbqg.f178020a;
                if (cbnz == null) {
                    cbnz = cbnz.f177781f;
                }
                cboa cboa = cbnz.f177785c;
                if (cboa == null) {
                    cboa = cboa.f177788b;
                }
                String str = cboa.f177790a;
                cbqy cbqy = this.f45775c.f45778c;
                if (cbqy.f178083a == 4) {
                    cbqg2 = (cbqg) cbqy.f178084b;
                } else {
                    cbqg2 = cbqg.f178018b;
                }
                cbnz cbnz2 = cbqg2.f178020a;
                if (cbnz2 == null) {
                    cbnz2 = cbnz.f177781f;
                }
                cboa cboa2 = cbnz2.f177785c;
                if (cboa2 == null) {
                    cboa2 = cboa.f177788b;
                }
                if (str.equals(cboa2.f177790a)) {
                    return;
                }
            }
            this.f45775c.f45777b.put(a);
        } catch (tdw e) {
            teo.f45776a.mo25417e("calling rpc throws exception.", e, new Object[0]);
        } catch (InterruptedException e2) {
            teo.f45776a.mo25417e("fails to put into blocking queue.", e2, new Object[0]);
        }
    }
}
