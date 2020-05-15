package p000;

import java.util.Map;

/* renamed from: apkx */
final /* synthetic */ class apkx implements apij {

    /* renamed from: a */
    private final aplb f84648a;

    public apkx(aplb aplb) {
        this.f84648a = aplb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f A[Catch:{ all -> 0x00d7 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* renamed from: a */
    public final void mo47292a(apik apik, int i) {
        aplb aplb = this.f84648a;
        String a = apia.m70339a(aapx.EXECUTION_CALLBACK);
        if (a == null) {
            a = "";
        }
        boolean a2 = cdob.f181416a.mo6606a().mo78057a();
        apkz apkz = new apkz(aplb, a);
        try {
            blji b = aplb.f84660f.mo16696b("handleClientCallback");
            try {
                aplb.f84659e.mo49113a(a);
                aplb.f84662h.mo47245a(aplb.mo47386d(), apik, apka.m70511e(i));
                synchronized (aplb.f84655a) {
                    aplb.mo47383b(apik.mo47305k());
                    apik apik2 = (apik) ((Map) aplb.f84656b.get(apik.mo47305k())).remove(apik.f84459a);
                    if (apik2 != null) {
                        if (!apik2.mo47302h()) {
                            apik2.mo47295b(5);
                        }
                        apid apid = apik2.f84459a;
                        aplb.f84662h.mo47246a(apid, i);
                        apid apid2 = null;
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                }
                            } else if (apid.mo47276m()) {
                                apid2 = aphw.m70333c(apid);
                            }
                            if (!aplb.f84655a.contains(apid)) {
                                if (a2) {
                                    try {
                                        apkz.run();
                                    } catch (Throwable th) {
                                        if (b != null) {
                                            b.close();
                                        }
                                        throw th;
                                    }
                                }
                                if (b != null) {
                                    b.close();
                                }
                                if (a2) {
                                    return;
                                }
                            } else {
                                if (apid2 != null) {
                                    aplb.mo47382a(apid2, apid, i == 1 ? 3 : 4);
                                } else {
                                    aplb.mo47384b(apik.f84459a);
                                }
                                aplb.f84663i.mo47361a(aplb.f84655a);
                                if (a2) {
                                    apkz.run();
                                }
                                if (b != null) {
                                    b.close();
                                }
                                if (a2) {
                                    return;
                                }
                            }
                        }
                        if (apid.mo47277n()) {
                            apid2 = aphw.m70332b(apid);
                        }
                        if (!aplb.f84655a.contains(apid)) {
                        }
                    } else {
                        if (a2) {
                            apkz.run();
                        }
                        if (b != null) {
                            b.close();
                        }
                        if (a2) {
                            return;
                        }
                    }
                }
                apkz.run();
            } catch (Throwable th2) {
                if (a2) {
                    apkz.run();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (!a2) {
                apkz.run();
            }
            throw th3;
        }
    }
}
