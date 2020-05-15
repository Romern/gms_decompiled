package p000;

/* renamed from: dvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvn extends duq {

    /* renamed from: f */
    private int f14201f;

    /* renamed from: g */
    private long f14202g;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dvn(bxfd bxfd) {
        super(dvn.class, bxfd, (r0 == 0 ? 1 : r0) - 1, bxcl.WEATHER_FENCE, new int[]{31});
        int a = bxfc.m122651a(bxfd.f163164a);
        this.f14201f = -1;
        this.f14202g = -1;
    }

    /* renamed from: a */
    private static final int m9537a(float f, float f2, float f3) {
        return (f > f3 || f3 >= f2) ? 0 : 1;
    }

    /* renamed from: j */
    public final float mo9710j() {
        return ((bxfd) this.f14076c).f163166c;
    }

    /* renamed from: a */
    public final float mo9709a() {
        return ((bxfd) this.f14076c).f163165b;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        int i = this.f14201f;
        if (i == -1) {
            return mo9646b();
        }
        int i2 = this.f14075b;
        boolean z = true;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            if (i == 0) {
                z = false;
            }
            return mo9643a(z);
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("dvn", "a", 173, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("[WeatherFenceImpl] Unknown trigger type: %s", this.f14075b);
        return mo9646b();
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.WEATHER) {
            bxcf bxcf = bxce.f162775h;
            if (bxcf == null) {
                bxcf = bxcf.f162779a;
            }
            bxvj bxvj = bxnp.f164074d;
            bxcf.mo74135a(bxvj);
            if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                bxcf bxcf2 = bxce.f162775h;
                if (bxcf2 == null) {
                    bxcf2 = bxcf.f162779a;
                }
                bxvj bxvj2 = bxnp.f164074d;
                bxcf2.mo74135a(bxvj2);
                Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                if (b == null) {
                    b = bxvj2.f164956b;
                } else {
                    bxvj2.mo74139a(b);
                }
                bxnp bxnp = (bxnp) b;
                long j = this.f14202g;
                bxeu bxeu = bxce.f162774g;
                if (bxeu == null) {
                    bxeu = bxeu.f163125e;
                }
                if (j < bxeu.f163129c) {
                    int i = this.f14075b;
                    int i2 = -1;
                    if (i == 1) {
                        bxno bxno = bxnp.f164077b;
                        if (bxno == null) {
                            bxno = bxno.f164069c;
                        }
                        bxnt bxnt = bxno.f164072b;
                        if (bxnt == null) {
                            bxnt = bxnt.f164083f;
                        }
                        i2 = m9537a(mo9709a(), mo9710j(), bxnt.f164085a);
                    } else if (i == 2) {
                        bxno bxno2 = bxnp.f164077b;
                        if (bxno2 == null) {
                            bxno2 = bxno.f164069c;
                        }
                        bxnt bxnt2 = bxno2.f164072b;
                        if (bxnt2 == null) {
                            bxnt2 = bxnt.f164083f;
                        }
                        i2 = m9537a(mo9709a(), mo9710j(), bxnt2.f164086b);
                    } else if (i == 3) {
                        bxno bxno3 = bxnp.f164077b;
                        if (bxno3 == null) {
                            bxno3 = bxno.f164069c;
                        }
                        bxnt bxnt3 = bxno3.f164072b;
                        if (bxnt3 == null) {
                            bxnt3 = bxnt.f164083f;
                        }
                        i2 = m9537a(mo9709a(), mo9710j(), bxnt3.f164087c);
                    } else if (i == 4) {
                        bxno bxno4 = bxnp.f164077b;
                        if (bxno4 == null) {
                            bxno4 = bxno.f164069c;
                        }
                        bxnt bxnt4 = bxno4.f164072b;
                        if (bxnt4 == null) {
                            bxnt4 = bxnt.f164083f;
                        }
                        int i3 = bxnt4.f164088d;
                        bxfd bxfd = (bxfd) this.f14076c;
                        float f = (float) i3;
                        i2 = (((float) bxfd.f163167d) > f || f >= ((float) bxfd.f163168e)) ? 0 : 1;
                    } else if (i == 5) {
                        int i4 = ((bxfd) this.f14076c).f163169f;
                        bxno bxno5 = bxnp.f164077b;
                        if (bxno5 == null) {
                            bxno5 = bxno.f164069c;
                        }
                        bxnt bxnt5 = bxno5.f164072b;
                        if (bxnt5 == null) {
                            bxnt5 = bxnt.f164083f;
                        }
                        bxwc bxwc = bxnt5.f164089e;
                        int size = bxwc.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size) {
                                int a2 = bxnr.m122904a(((bxns) bxwc.get(i5)).f164081a);
                                if (a2 == 0) {
                                    a2 = 1;
                                }
                                i5++;
                                if (a2 - 1 == i4) {
                                    i2 = 1;
                                    break;
                                }
                            } else {
                                i2 = 0;
                                break;
                            }
                        }
                    }
                    if (i2 != this.f14201f) {
                        this.f14201f = i2;
                        bxeu bxeu2 = bxce.f162774g;
                        if (bxeu2 == null) {
                            bxeu2 = bxeu.f163125e;
                        }
                        this.f14202g = bxeu2.f163129c;
                        return;
                    }
                    return;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dvn", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[WeatherFenceImpl] This weather data was received earlier and processed");
                return;
            }
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
            bnsl2.mo68432a("dvn", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("[WeatherFenceImpl] No weather data.");
        }
    }
}
