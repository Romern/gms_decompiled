package p000;

import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.gms.carrierauth.EAPAKARequest;
import com.google.android.gms.carrierauth.EAPAKAResponse;
import com.google.android.gms.common.Feature;
import java.lang.reflect.InvocationTargetException;

/* renamed from: tee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tee implements teu {

    /* renamed from: a */
    public static final sek f45730a = tea.m36798a("carrierId verifier");

    /* renamed from: b */
    private final cbqy f45731b;

    /* renamed from: c */
    private final sza f45732c;

    /* renamed from: d */
    private final tdx f45733d;

    /* renamed from: e */
    private final TelephonyManager f45734e = ((TelephonyManager) rpr.m34216b().getSystemService("phone"));

    /* renamed from: f */
    private final ted f45735f;

    /* renamed from: g */
    private final oqh f45736g;

    public tee(cbqy cbqy, sza sza, tdx tdx) {
        ted a = ted.m36809a(tdx);
        oqh oqh = new oqh(rpr.m34216b().getApplicationContext());
        this.f45731b = cbqy;
        this.f45732c = sza;
        this.f45733d = tdx;
        this.f45735f = a;
        this.f45736g = oqh;
    }

    /* renamed from: a */
    private static cboe m36816a(int i) {
        bxvd da = cboe.f177806c.mo74144da();
        bxvd da2 = cbny.f177777c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbny) da2.f164949b).f177780b = i - 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cboe cboe = (cboe) da.f164949b;
        cbny cbny = (cbny) da2.mo74062i();
        cbny.getClass();
        cboe.f177809b = cbny;
        cboe.f177808a = 2;
        return (cboe) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo26427a() {
    }

    /* renamed from: b */
    public final cbqy mo26428b() {
        return this.f45731b;
    }

    /* renamed from: c */
    public final String mo26429c() {
        cbqg cbqg;
        cbqy cbqy = this.f45731b;
        if (cbqy.f178083a == 4) {
            cbqg = (cbqg) cbqy.f178084b;
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
        return cboa.f177790a;
    }

    /* renamed from: d */
    public final cbqy mo26430d() {
        tds a = tds.m36774a(rpr.m34216b());
        if (this.f45735f.mo26421a()) {
            return m36817a(this.f45731b, (int) cdgc.f180745a.mo6606a().mo77483e());
        }
        a.mo26415b(this.f45733d, this.f45731b, 48);
        return this.f45732c.mo26253a(this.f45733d, this.f45731b, m36816a(3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a2 A[SYNTHETIC, Splitter:B:90:0x01a2] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b2 A[Catch:{ tdw -> 0x02be }] */
    /* renamed from: a */
    private final cbqy m36817a(cbqy cbqy, int i) {
        cbqg cbqg;
        cbnx cbnx;
        cbqn cbqn;
        String str;
        cbqg cbqg2;
        cbqg cbqg3;
        tec a;
        tdx tdx;
        int i2;
        cbqg cbqg4;
        cbqg cbqg5;
        cbqy cbqy2 = cbqy;
        f45730a.mo25409a("do verification", new Object[0]);
        if (i <= 0) {
            tds.m36774a(rpr.m34216b()).mo26415b(this.f45733d, this.f45731b, 49);
            return this.f45732c.mo26253a(this.f45733d, cbqy2, m36816a(4));
        }
        cbqz cbqz = cbqy2.f178085c;
        if (cbqz == null) {
            cbqz = cbqz.f178091c;
        }
        if (cbqz.f178093a != 1) {
            return this.f45732c.mo26253a(this.f45733d, cbqy2, m36816a(7));
        }
        try {
            if (cbqy2.f178083a == 4) {
                cbqg = (cbqg) cbqy2.f178084b;
            } else {
                cbqg = cbqg.f178018b;
            }
            cbnz cbnz = cbqg.f178020a;
            if (cbnz == null) {
                cbnz = cbnz.f177781f;
            }
            if (cbnz.f177783a == 4) {
                cbnx = (cbnx) cbnz.f177784b;
            } else {
                cbnx = cbnx.f177772d;
            }
            bxvd bxvd = (bxvd) cbnx.mo74142c(5);
            bxvd.mo73625a((bxvk) cbnx);
            if (((cbnx) bxvd.f164949b).f177776c == 0) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cbnx cbnx2 = cbnx.f177772d;
                ((cbnx) bxvd.f164949b).f177776c = 2;
                bxvd bxvd2 = (bxvd) cbqy2.mo74142c(5);
                bxvd2.mo73625a((bxvk) cbqy2);
                cbqw cbqw = (cbqw) bxvd2;
                if (cbqy2.f178083a == 4) {
                    cbqg4 = (cbqg) cbqy2.f178084b;
                } else {
                    cbqg4 = cbqg.f178018b;
                }
                bxvd bxvd3 = (bxvd) cbqg4.mo74142c(5);
                bxvd3.mo73625a((bxvk) cbqg4);
                if (cbqy2.f178083a == 4) {
                    cbqg5 = (cbqg) cbqy2.f178084b;
                } else {
                    cbqg5 = cbqg.f178018b;
                }
                cbnz cbnz2 = cbqg5.f178020a;
                if (cbnz2 == null) {
                    cbnz2 = cbnz.f177781f;
                }
                bxvd bxvd4 = (bxvd) cbnz2.mo74142c(5);
                bxvd4.mo73625a((bxvk) cbnz2);
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                cbnz cbnz3 = (cbnz) bxvd4.f164949b;
                cbnx cbnx3 = (cbnx) bxvd.mo74062i();
                cbnx3.getClass();
                cbnz3.f177784b = cbnx3;
                cbnz3.f177783a = 4;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                cbnz cbnz4 = (cbnz) bxvd4.mo74062i();
                cbqg cbqg6 = cbqg.f178018b;
                cbnz4.getClass();
                ((cbqg) bxvd3.f164949b).f178020a = cbnz4;
                if (cbqw.f164950c) {
                    cbqw.mo74035c();
                    cbqw.f164950c = false;
                }
                cbqy cbqy3 = (cbqy) cbqw.f164949b;
                cbqg cbqg7 = (cbqg) bxvd3.mo74062i();
                cbqy cbqy4 = cbqy.f178081i;
                cbqg7.getClass();
                cbqy3.f178084b = cbqg7;
                cbqy3.f178083a = 4;
                cbqy2 = (cbqy) cbqw.mo74062i();
            }
            try {
                cbqz cbqz2 = cbqy2.f178085c;
                if (cbqz2 == null) {
                    cbqz2 = cbqz.f178091c;
                }
                if (cbqz2.f178093a == 1) {
                    cbqn = (cbqn) cbqz2.f178094b;
                } else {
                    cbqn = cbqn.f178043d;
                }
                cbqp cbqp = cbqn.f178045a;
                if (cbqp == null) {
                    cbqp = cbqp.f178048c;
                }
                bxwc bxwc = cbqp.f178050a;
                cbnx cbnx4 = (cbnx) bxvd.mo74062i();
                if (cdgc.f180745a.mo6606a().mo77489k()) {
                    try {
                        a = tec.m36805a(rpr.m34216b(), this.f45733d);
                        tdx = this.f45733d;
                        rpr b = rpr.m34216b();
                        if (!bxwc.isEmpty()) {
                            int i3 = Build.VERSION.SDK_INT;
                            if (!a.f45724c) {
                                bnre i4 = a.f45725d.listIterator();
                                while (true) {
                                    if (!i4.hasNext()) {
                                        break;
                                    }
                                    ted ted = (ted) i4.next();
                                    if (bxwc.contains(ted.mo26422b())) {
                                        i2 = ted.f45729c.getSubscriptionId();
                                        break;
                                    }
                                }
                                if (i2 != -1) {
                                    f45730a.mo25412b("Verifying with CarrierId default", new Object[0]);
                                    str = mo26426a((Integer) null, cbnx4);
                                } else {
                                    f45730a.mo25412b("Verifying with CarrierId for subId", new Object[0]);
                                    str = mo26426a(Integer.valueOf(i2), cbnx4);
                                }
                            }
                            if (bxwc.contains(((TelephonyManager) b.getSystemService("phone")).getSubscriberId())) {
                                i2 = -1;
                                if (i2 != -1) {
                                }
                            } else {
                                throw new tdm("No telephony manager is found for the given imsi.");
                            }
                        } else {
                            throw new tdm("Invalid IMSI.");
                        }
                    } catch (SecurityException e) {
                        tec.f45721a.mo25417e("No READ_PHONE_STATE permission", e, new Object[0]);
                        a.f45723b.mo26410a(tdx, 43, e);
                        throw new tdm("No telephony manager is found for the given imsi.");
                    } catch (tdm e2) {
                        tds.m36774a(rpr.m34216b()).mo26415b(this.f45733d, this.f45731b, 57);
                        throw new tdw(e2.getCause());
                    }
                } else {
                    str = mo26426a((Integer) null, cbnx4);
                }
                if (str != null) {
                    sza sza = this.f45732c;
                    tdx tdx2 = this.f45733d;
                    bxvd da = cboe.f177806c.mo74144da();
                    bxvd da2 = cbny.f177777c.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    str.getClass();
                    ((cbny) da2.f164949b).f177779a = str;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cboe cboe = (cboe) da.f164949b;
                    cbny cbny = (cbny) da2.mo74062i();
                    cbny.getClass();
                    cboe.f177809b = cbny;
                    cboe.f177808a = 2;
                    cbqy a2 = sza.mo26253a(tdx2, cbqy2, (cboe) da.mo74062i());
                    tdz.m36796a();
                    if (tdz.m36797a(a2)) {
                        if (a2.f178083a == 4) {
                            cbqg2 = (cbqg) a2.f178084b;
                        } else {
                            cbqg2 = cbqg.f178018b;
                        }
                        cbnz cbnz5 = cbqg2.f178020a;
                        if (cbnz5 == null) {
                            cbnz5 = cbnz.f177781f;
                        }
                        cboa cboa = cbnz5.f177785c;
                        if (cboa == null) {
                            cboa = cboa.f177788b;
                        }
                        String str2 = cboa.f177790a;
                        if (cbqy2.f178083a == 4) {
                            cbqg3 = (cbqg) cbqy2.f178084b;
                        } else {
                            cbqg3 = cbqg.f178018b;
                        }
                        cbnz cbnz6 = cbqg3.f178020a;
                        if (cbnz6 == null) {
                            cbnz6 = cbnz.f177781f;
                        }
                        cboa cboa2 = cbnz6.f177785c;
                        if (cboa2 == null) {
                            cboa2 = cboa.f177788b;
                        }
                        if (str2.equals(cboa2.f177790a)) {
                            return m36817a(a2, i - 1);
                        }
                    }
                    return a2;
                }
                tds.m36774a(rpr.m34216b()).mo26415b(this.f45733d, this.f45731b, 47);
                throw new tdw("Got null ISIM response", 47, false);
            } catch (tdw e3) {
                e = e3;
                if (e.f45707b != 47) {
                    return this.f45732c.mo26253a(this.f45733d, cbqy2, m36816a(5));
                }
                if ("No API available for getting ISIM challenge response".equals(e.getMessage())) {
                    return this.f45732c.mo26253a(this.f45733d, cbqy2, m36816a(6));
                }
                if (e.f45707b == 57) {
                    return this.f45732c.mo26253a(this.f45733d, cbqy2, m36816a(8));
                }
                return this.f45732c.mo26253a(this.f45733d, cbqy2, m36816a(9));
            }
        } catch (tdw e4) {
            e = e4;
            if (e.f45707b != 47) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo26426a(Integer num, cbnx cbnx) {
        int i;
        if (cdfh.m132920b()) {
            f45730a.mo25412b("Calling Carrier Auth API", new Object[0]);
            EAPAKARequest eAPAKARequest = new EAPAKARequest(cbnx.f177774a, Integer.valueOf(cbnx.f177775b), Integer.valueOf(cbnx.f177776c), num);
            oqh oqh = this.f45736g;
            roz b = rpa.m34196b();
            b.f43472a = new oqg(eAPAKARequest);
            b.f43473b = new Feature[]{sxu.f45400c};
            aucb a = oqh.mo24701a(b.mo24977a());
            long currentTimeMillis = System.currentTimeMillis();
            while (!a.mo50381a()) {
                if (System.currentTimeMillis() - currentTimeMillis > 60000) {
                    tds.m36774a(rpr.m34216b()).mo26415b(this.f45733d, this.f45731b, 61);
                    throw new tdw("CarrierAuth API timeout", 61, false);
                }
            }
            if (a.mo50384b()) {
                EAPAKAResponse eAPAKAResponse = (EAPAKAResponse) a.mo50386d();
                f45730a.mo25412b("Successfully call CarrierAuth API. RESPONSE: %s", eAPAKAResponse.f29532a);
                return eAPAKAResponse.f29532a;
            }
            Exception e = a.mo50387e();
            f45730a.mo25417e("Failed to challenge via CarrierAuth API", e, new Object[0]);
            if (!(e instanceof NoSuchMethodException)) {
                i = !(e instanceof IllegalAccessException) ? !(e instanceof InvocationTargetException) ? 2 : 21 : 23;
            } else {
                i = 22;
            }
            throw new tdw("No API available for getting ISIM challenge response", i, false);
        }
        f45730a.mo25412b("Not calling Carrier Auth API", new Object[0]);
        int i2 = Build.VERSION.SDK_INT;
        return (num != null ? this.f45734e.createForSubscriptionId(num.intValue()) : this.f45734e).getIccAuthentication(cbnx.f177776c, cbnx.f177775b, cbnx.f177774a);
    }
}
