package p000;

import android.os.Build;

/* renamed from: ahrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahrk implements ahll, ahor {

    /* renamed from: a */
    public final ahne f67879a;

    /* renamed from: b */
    public final ahlk f67880b;

    /* renamed from: c */
    private final ahov f67881c;

    public ahrk(ahov ahov, ahne ahne, ahlk ahlk) {
        this.f67881c = ahov;
        this.f67879a = ahne;
        this.f67880b = ahlk;
    }

    /* renamed from: a */
    public final ahna mo36792a(ahkv ahkv, String str, butx butx) {
        aiwd aiwd;
        this.f67881c.mo36931f();
        butv butv = butx.f154897c;
        if (butv == null) {
            butv = butv.f154881f;
        }
        ahov ahov = this.f67881c;
        String str2 = butv.f154884b;
        String str3 = butv.f154885c;
        String str4 = butv.f154887e;
        int i = butv.f154886d;
        ahfk q = ahkv.mo36739q(str);
        synchronized (ahov.f67670f) {
            aiwd = null;
            if (ahov.mo36916a()) {
                if (ahov.f67666b.f69116c.mo37789a()) {
                    aiwd = ahov.f67666b.f69120g.mo37741a(str2, str3, str4, i, q);
                }
            }
        }
        if (aiwd != null) {
            srn srn = ahkm.f67363a;
            ahna a = this.f67879a.mo36875a(aiwd);
            if (a != null) {
                return a;
            }
            srz.m36171a(aiwd);
            this.f67881c.mo36927d();
            throw new ahli(bvhu.WIFI_HOTSPOT_MEDIUM_ERROR, 29, String.format("WifiHotspotBandwidthUpgradeMedium failed to create new EndpointChannel for outgoing socket %s, aborting upgrade.", aiwd));
        }
        throw new ahli(bvhu.WIFI_HOTSPOT_MEDIUM_ERROR, 13, String.format("WifiHotspotBandwidthUpgradeMedium failed to join available Wifi hotspot (%s, %d) on endpoint %s, aborting upgrade.", butv.f154884b, Integer.valueOf(butv.f154886d), str));
    }

    /* renamed from: a */
    public final void mo36793a() {
        ahov ahov = this.f67881c;
        synchronized (ahov.f67670f) {
            if (ahov.mo36916a()) {
                ahov.f67666b.f69120g.mo37752g();
            }
        }
        this.f67881c.mo36926c();
        this.f67881c.mo36927d();
        srn srn = ahkm.f67363a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r3.f69326g.f69290e = r7.getLocalPort();
        new p000.ainp(r3, 9, r7, r0).start();
        r3.f69327h = r7;
        r0 = r3.f69326g.f69286a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0310, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0311, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0313, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0314, code lost:
        r7 = (p000.bnsl) p000.ailf.f69111a.mo68387b();
        r7.mo68437a(r0);
        r7.mo68432a("aiof", "a", 660, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r7.mo68405a("Failed to start accepting Wifi connections.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x032a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x032c, code lost:
        if (r0 != false) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03ec, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03ed, code lost:
        r1.f67881c.mo36926c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0407, code lost:
        throw new p000.ahli(p000.bvhu.WIFI_HOTSPOT_MEDIUM_ERROR, 12, java.lang.String.format("WifiHotspotBandwidthUpgradeMedium couldn't complete the Wifi upgrade for endpoint %s because it failed to start listening for incoming Wifi connections.", r19));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fc, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01cc, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022a, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0268, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x026a, code lost:
        if (r10 == false) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x026c, code lost:
        r0 = p000.ahkm.f67363a;
        r1 = r17;
        r0 = r1.f67881c;
        r2 = r0.f67670f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0274, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0279, code lost:
        if (r0.mo36916a() == false) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x027b, code lost:
        r3 = r0.f67666b.f69120g;
        getClass();
        r0 = new p000.ahoc(r1);
        r3.mo37755j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0290, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0295, code lost:
        if (r3.mo37751f() == false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0297, code lost:
        r0 = (p000.bnsl) p000.ailf.f69111a.mo68387b();
        r0.mo68432a("aiof", "a", 626, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68405a("Refusing to start accepting Wifi connections because another Wifi server is already in-progress.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a9, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02aa, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b1, code lost:
        if (r3.mo37747b() != false) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b3, code lost:
        r0 = (p000.bnsl) p000.ailf.f69111a.mo68387b();
        r0.mo68432a("aiof", "a", 634, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68405a("Can't start accepting Wifi connections without hosting a hotspot.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c5, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02c6, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02cc, code lost:
        if (r3.mo37744a() != false) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ce, code lost:
        r0 = (p000.bnsl) p000.ailf.f69111a.mo68390d();
        r0.mo68432a("aiof", "a", 639, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68405a("Failed to start accepting Wifi connections because WifiHotspot is not available.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02e0, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02e1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        p000.ails.m57439a();
        r7 = new java.net.ServerSocket();
        r7.bind(new java.net.InetSocketAddress(r3.f69326g.f69288c, 0));
     */
    /* renamed from: a */
    public final byte[] mo36794a(ahkv ahkv, String str) {
        ahou ahou;
        Object obj;
        ahrk ahrk = this;
        ahrk.f67881c.mo36931f();
        boolean d = ahkv.mo36714d(str);
        ahov ahov = ahrk.f67881c;
        synchronized (ahov.f67670f) {
            if (ahov.mo36916a()) {
                boolean b = ahov.f67666b.f69120g.mo37747b();
                if (!b) {
                }
                ahov ahov2 = ahrk.f67881c;
                synchronized (ahov2.f67670f) {
                    ahou = null;
                    if (ahov2.mo36916a()) {
                        aint c = ahov2.f67666b.f69120g.mo37748c();
                        if (c != null) {
                            ahou = new ahou(c.f69286a, c.f69287b, c.f69289d, c.f69290e);
                        }
                    }
                }
                if (ahou != null) {
                    String str2 = ahou.f67661a;
                    String str3 = ahou.f67662b;
                    String str4 = ahou.f67663c;
                    int i = ahou.f67664d;
                    bxvd da = butv.f154881f.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    butv butv = (butv) da.f164949b;
                    str2.getClass();
                    int i2 = butv.f154883a | 1;
                    butv.f154883a = i2;
                    butv.f154884b = str2;
                    str3.getClass();
                    int i3 = i2 | 2;
                    butv.f154883a = i3;
                    butv.f154885c = str3;
                    int i4 = i3 | 4;
                    butv.f154883a = i4;
                    butv.f154886d = i;
                    str4.getClass();
                    butv.f154883a = i4 | 8;
                    butv.f154887e = str4;
                    butv butv2 = (butv) da.mo74062i();
                    bxvd da2 = butx.f154893h.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    butx butx = (butx) da2.f164949b;
                    butx.f154896b = 3;
                    int i5 = butx.f154895a | 1;
                    butx.f154895a = i5;
                    butv2.getClass();
                    butx.f154897c = butv2;
                    butx.f154895a = i5 | 2;
                    return ahoy.m56310a((butx) da2.mo74062i());
                }
                throw new ahli(bvhu.WIFI_HOTSPOT_MEDIUM_ERROR, 12, String.format("WifiHotspotBandwidthUpgradeMedium couldn't initiate the WIFI_HOTSPOT upgrade for endpoint %s because the Wifi Hotspot credentials were unable to be obtained.", str));
            }
        }
        ahov ahov3 = ahrk.f67881c;
        ahfk q = ahkv.mo36739q(str);
        synchronized (ahov3.f67670f) {
            try {
                if (ahov3.mo36916a()) {
                    aiof aiof = ahov3.f67666b.f69120g;
                    aiof.mo37755j();
                    synchronized (aiof) {
                        try {
                            if (aiof.mo37747b()) {
                                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                                bnsl.mo68432a("aiof", "a", 310, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68420a("Refusing to start a Wifi hotspot because we're already hosting a Wifi hotspot with SSID %s.", aiof.mo37748c().f69286a);
                            } else if (!aiof.mo37744a()) {
                                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                                bnsl2.mo68432a("aiof", "a", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("Failed to start a Wifi hotspot because WifiHotspot is not available.");
                            } else {
                                if (cfnv.f184625a.mo6606a().mo81759aR()) {
                                    try {
                                        if (aiof.mo37749d()) {
                                            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl3.mo68432a("aiof", "a", 462, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl3.mo68405a("Attempting to start a wifi direct hotspot.");
                                            String str5 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                                            String str6 = "a";
                                            String str7 = "aiof";
                                            aioe aioe = new aioe(aiof.f69320a, aiof.f69324e, new ainf(aiof), aiof.f69322c, d);
                                            if (aiof.f69325f.mo37908b(aioe) != airr.SUCCESS) {
                                                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68388c();
                                                bnsl4.mo68432a(str7, str6, 478, str5);
                                                bnsl4.mo68405a("Unable to start Wifi Direct hotspot because registration failed");
                                            } else {
                                                aiof.f69326g = aioe.f69314b;
                                                aiof.f69330k = aioe;
                                                bnsl bnsl5 = (bnsl) ailf.f69111a.mo68390d();
                                                bnsl5.mo68432a("aiof", "a", 324, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl5.mo68405a("Successfully started a Wifi Direct hotspot");
                                            }
                                        } else {
                                            bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl6.mo68432a("aiof", "a", 458, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl6.mo68405a("Wifi Direct is not supported.");
                                        }
                                        bnsl bnsl7 = (bnsl) ailf.f69111a.mo68390d();
                                        bnsl7.mo68432a("aiof", "a", 327, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl7.mo68405a("Failed to start a Wifi Direct hotspot");
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                                if (cfnv.f184625a.mo6606a().mo81758aQ()) {
                                    int i6 = Build.VERSION.SDK_INT;
                                    bnsl bnsl8 = (bnsl) ailf.f69111a.mo68390d();
                                    bnsl8.mo68432a("aiof", "m", 516, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl8.mo68405a("Attempting to start a local only hotspot.");
                                    if (!cfnv.m140739A()) {
                                        int i7 = Build.VERSION.SDK_INT;
                                    } else if (!aiof.f69321b.mo37790b()) {
                                        bnsl bnsl9 = (bnsl) ailf.f69111a.mo68388c();
                                        bnsl9.mo68432a("aiof", "m", 525, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl9.mo68405a("Failed to start a local-only hotspot because we failed to turn Wifi off before starting it up.");
                                        bnsl bnsl10 = (bnsl) ailf.f69111a.mo68390d();
                                        bnsl10.mo68432a("aiof", "a", 336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl10.mo68405a("Failed to start a local only hotspot");
                                    }
                                    bqgy c2 = bqgy.m112818c();
                                    ainu ainu = new ainu(aiof.f69322c, c2, new ainm(aiof, c2));
                                    if (airr.SUCCESS != aiof.f69325f.mo37908b(ainu)) {
                                        aiof.f69321b.mo37789a();
                                        bnsl bnsl11 = (bnsl) ailf.f69111a.mo68388c();
                                        bnsl11.mo68432a("aiof", "m", 564, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl11.mo68405a("Unable to start the Local only hotspot because registration failed.");
                                        bnsl bnsl102 = (bnsl) ailf.f69111a.mo68390d();
                                        bnsl102.mo68432a("aiof", "a", 336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl102.mo68405a("Failed to start a local only hotspot");
                                    } else {
                                        aiof.f69328i = ainu;
                                        aiof.f69326g = ainu.f69291a;
                                        bnsl bnsl12 = (bnsl) ailf.f69111a.mo68390d();
                                        bnsl12.mo68432a("aiof", "a", 333, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl12.mo68405a("Successfully started a local only hotspot");
                                    }
                                }
                                if (cfnv.f184625a.mo6606a().mo81760aS()) {
                                    if (!aiof.f69321b.mo37790b()) {
                                        bnsl bnsl13 = (bnsl) ailf.f69111a.mo68388c();
                                        bnsl13.mo68432a("aiof", "a", 404, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl13.mo68405a("Failed to start a Wifi AP because we failed to turn Wifi off before starting it up.");
                                    } else {
                                        ainz ainz = new ainz(aiof.f69320a, aiof.f69322c, aiof.f69323d, q);
                                        if (airr.SUCCESS == aiof.f69325f.mo37908b(ainz)) {
                                            aiof.f69326g = ainz.f69302b;
                                            aiof.f69329j = ainz;
                                            bnsl bnsl14 = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl14.mo68432a("aiof", "a", 342, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl14.mo68405a("Successfully started a Wifi SoftAP hotspot");
                                        } else {
                                            aiof.f69321b.mo37789a();
                                            bnsl bnsl15 = (bnsl) ailf.f69111a.mo68388c();
                                            bnsl15.mo68432a("aiof", "a", 415, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl15.mo68405a("Unable to start a Soft AP Wifi Hotspot because registration failed.");
                                        }
                                    }
                                    bnsl bnsl16 = (bnsl) ailf.f69111a.mo68390d();
                                    bnsl16.mo68432a("aiof", "a", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl16.mo68405a("Failed to start a Wifi SoftAP hotspot");
                                }
                                bnsl bnsl17 = (bnsl) ailf.f69111a.mo68387b();
                                bnsl17.mo68432a("aiof", "a", 349, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl17.mo68405a("Failed to start a Wifi hotspot");
                            }
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                }
                throw new ahli(bvhu.WIFI_HOTSPOT_MEDIUM_ERROR, 11, String.format("WifiHotspotBandwidthUpgradeMedium couldn't complete the Wifi upgrade for endpoint %s because it failed to start a Wifi hotspot.", str));
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }
}
