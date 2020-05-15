package p000;

/* renamed from: teh */
final /* synthetic */ class teh implements Runnable {

    /* renamed from: a */
    private final tej f45748a;

    /* renamed from: b */
    private final String f45749b;

    public teh(tej tej, String str) {
        this.f45748a = tej;
        this.f45749b = str;
    }

    public final void run() {
        cbqg cbqg;
        cboh cboh;
        boolean z;
        cbqg cbqg2;
        tej tej = this.f45748a;
        String str = this.f45749b;
        synchronized (tej.f45756f) {
            try {
                cbqy a = tej.f45753c.mo26253a(tej.f45754d, (cbqy) tej.f45757g.mo74062i(), tej.m36832a(str, 2));
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
                    if (cbnz.f177783a == 8) {
                        cboh = (cboh) cbnz.f177784b;
                    } else {
                        cboh = cboh.f177813e;
                    }
                    synchronized (tej.f45756f) {
                        z = true;
                        if (cboh != null) {
                            int b = cbog.m128044b(cboh.f177816b);
                            if (b != 0) {
                                if (b == 2) {
                                }
                            }
                            if (cboh.f177817c.size() == cboh.f177818d.size()) {
                                if (cboh.f177817c.size() != 0) {
                                    if (cboh.f177817c.size() > 0) {
                                        String str2 = ((cboa) cboh.f177817c.get(cboh.f177817c.size() - 1)).f177790a;
                                        cbqy cbqy = (cbqy) tej.f45757g.f164949b;
                                        if (cbqy.f178083a == 4) {
                                            cbqg2 = (cbqg) cbqy.f178084b;
                                        } else {
                                            cbqg2 = cbqg.f178018b;
                                        }
                                        cbnz cbnz2 = cbqg2.f178020a;
                                        if (cbnz2 == null) {
                                            cbnz2 = cbnz.f177781f;
                                        }
                                        cboa cboa = cbnz2.f177785c;
                                        if (cboa == null) {
                                            cboa = cboa.f177788b;
                                        }
                                        if (!str2.equals(cboa.f177790a)) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        int b2 = cbog.m128044b(cboh.f177816b);
                        if (b2 != 0 && b2 == 4) {
                            tej.f45751a.mo25412b("Received pending verification with state: VERIFYING.", new Object[0]);
                            tej.f45760j = 4;
                            bxvd bxvd = (bxvd) a.mo74142c(5);
                            bxvd.mo73625a((bxvk) a);
                            tej.f45757g = (cbqw) bxvd;
                            tej.f45755e.mo26434a(tej.f45759i);
                            return;
                        }
                    }
                    tej.f45751a.mo25412b("Received bad pending verification.", new Object[0]);
                    tej.f45760j = 6;
                } else {
                    tdz.m36796a();
                    if (a != null) {
                        int b3 = cbqx.m128116b(a.f178086d);
                        if (b3 != 0 && b3 == 5) {
                            tej.f45751a.mo25412b("Received verified verification.", new Object[0]);
                            tej.f45760j = 5;
                        }
                    }
                    tej.f45751a.mo25412b("Received verification with none or unknown state.", new Object[0]);
                    tej.f45760j = 6;
                }
                tej.f45752b.put(a);
            } catch (InterruptedException | tdw e) {
                tej.f45758h = 0;
                tej.f45760j = 6;
                if (!(e instanceof tdw)) {
                    tej.f45751a.mo25417e("fails to put into blocking queue.", e, new Object[0]);
                } else {
                    tej.f45751a.mo25417e("calling rpc throws exception.", e, new Object[0]);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
