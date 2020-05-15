package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: esp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class esp {

    /* renamed from: a */
    public static final sek f15622a = ffw.m11631a("ScreenGraphFetcher");

    /* renamed from: b */
    public final ffk f15623b;

    /* renamed from: c */
    public final bsxn f15624c;

    /* renamed from: d */
    public final esr f15625d;

    /* renamed from: e */
    public final ExecutorService f15626e;

    /* renamed from: f */
    public final eqc f15627f;

    /* renamed from: g */
    public final eqh f15628g;

    /* renamed from: h */
    public boolean f15629h = false;

    /* renamed from: i */
    public boolean f15630i = false;

    /* renamed from: j */
    public Exception f15631j = null;

    /* renamed from: k */
    public final C0034at f15632k;

    /* renamed from: l */
    public final eqx f15633l;

    /* renamed from: m */
    private final eqz f15634m;

    /* renamed from: n */
    private int f15635n;

    public esp(ffk ffk, bsxn bsxn, esr esr, eqz eqz, ExecutorService executorService, erg erg, eor eor, esx esx) {
        rpr b = rpr.m34216b();
        fgd.m11650a();
        eqg eqg = new eqg(b, ffk, esx);
        eqx eqx = new eqx(rpr.m34216b(), ffk, executorService, erg, eor);
        eqj eqj = new eqj();
        this.f15623b = ffk;
        this.f15624c = bsxn;
        this.f15625d = esr;
        this.f15634m = eqz;
        this.f15626e = executorService;
        this.f15627f = eqg;
        this.f15633l = eqx;
        this.f15628g = eqj;
        this.f15632k = eqz.mo10428a(mo10488d(bsxn));
        this.f15635n = 0;
    }

    /* renamed from: a */
    private final void m11091a(bsxk bsxk) {
        for (bsxn bsxn : epr.m10922a(bsxk)) {
            sek sek = f15622a;
            Object[] objArr = new Object[2];
            bsxn bsxn2 = bsxk.f147583d;
            if (bsxn2 == null) {
                bsxn2 = bsxn.f147586d;
            }
            objArr[0] = Integer.valueOf(bsxn2.f147589b);
            objArr[1] = Integer.valueOf(bsxn.f147589b);
            sek.mo25409a("loadRemoteDescendants(%s) -> %s", objArr);
            mo10481a(bsxn);
        }
    }

    /* renamed from: a */
    public final void mo10479a() {
        this.f15635n++;
    }

    /* renamed from: b */
    public final void mo10484b() {
        int i = this.f15635n - 1;
        this.f15635n = i;
        if (i == 0) {
            this.f15629h = false;
            this.f15630i = false;
            mo10486c();
        }
    }

    /* renamed from: c */
    public final void mo10486c() {
        this.f15632k.mo2450b(new eps(this.f15629h, this.f15630i, this.f15631j));
    }

    /* renamed from: d */
    public final eqy mo10488d(bsxn bsxn) {
        return new eqy(this.f15623b, bsxn, this.f15625d);
    }

    /* renamed from: b */
    public final boolean mo10485b(bsxn bsxn) {
        C0034at b = this.f15634m.mo10433b(mo10488d(bsxn));
        if (((epq) b.mo2448b()).mo10394a()) {
            return false;
        }
        for (bsxn bsxn2 : epr.m10922a(((epq) b.mo2448b()).f15491a)) {
            if (!mo10485b(bsxn2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo10487c(bsxn bsxn) {
        C0034at b = this.f15634m.mo10433b(mo10488d(bsxn));
        if (((epq) b.mo2448b()).mo10396c()) {
            return false;
        }
        for (bsxn bsxn2 : epr.m10922a(((epq) b.mo2448b()).f15491a)) {
            if (!mo10487c(bsxn2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m11092a(epq epq, long j, Map map, eqc eqc) {
        for (bsxn bsxn : epr.m10922a(epq.f15491a)) {
            mo10482a(bsxn, j, map, eqc);
        }
    }

    /* renamed from: a */
    public final void mo10480a(bswb bswb, long j, boolean z, boolean z2) {
        if (z2) {
            j = 0;
        }
        bngs bngs = new bngs();
        if ((bswb.f147371a & 1) != 0) {
            bsxk bsxk = bswb.f147372b;
            if (bsxk == null) {
                bsxk = bsxk.f147578f;
            }
            bngs.mo67668c(new epq(bsxk, j, z));
        }
        bxwc bxwc = bswb.f147373c;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bngs.mo67668c(new epq((bsxk) bxwc.get(i), j, z));
        }
        mo10483a(bngs.mo67664a());
        if ((bswb.f147371a & 1) != 0) {
            bsxk bsxk2 = bswb.f147372b;
            if (bsxk2 == null) {
                bsxk2 = bsxk.f147578f;
            }
            m11091a(bsxk2);
        }
    }

    /* renamed from: a */
    public final void mo10481a(bsxn bsxn) {
        Set<bsxn> set;
        f15622a.mo25409a("loadRemoteResourceAndDescendants(%s)", Integer.valueOf(bsxn.f147589b));
        epq epq = (epq) this.f15634m.mo10433b(mo10488d(bsxn)).mo2448b();
        boolean z = !((Boolean) this.f15634m.mo10427a().mo2448b()).booleanValue();
        if (!epq.mo10396c()) {
            f15622a.mo25409a("loadRemoteResourceAndDescendants(%s): no refresh needed for this resource", Integer.valueOf(bsxn.f147589b));
            m11091a(epq.f15491a);
            return;
        }
        eqz eqz = this.f15634m;
        eqy d = mo10488d(bsxn);
        if (eqz.f15555d.containsKey(d)) {
            bnia j = bnic.m109500j();
            bsxk bsxk = ((epq) ((C0034at) eqz.f15555d.get(d)).mo2448b()).f15491a;
            Set<bsxn> a = epr.m10922a(bsxk);
            j.mo67752b((Iterable) a);
            for (bsxn bsxn2 : a) {
                eqy eqy = new eqy(d.f15547a, bsxn2, d.f15549c, d.f15551e);
                if (eqz.f15555d.containsKey(eqy)) {
                    bsxk bsxk2 = ((epq) ((C0034at) eqz.f15555d.get(eqy)).mo2448b()).f15491a;
                    j.mo67752b((Iterable) epr.m10926b(bsxk2));
                    if (bsxk2.f147581b == 6) {
                        bnic<bsxn> a2 = bnic.m109495a((Collection) ((bsvg) bsxk2.f147582c).f147250a);
                        j.mo67752b((Iterable) a2);
                        for (bsxn bsxn3 : a2) {
                            eqy eqy2 = new eqy(d.f15547a, bsxn3, d.f15549c, d.f15551e);
                            if (eqz.f15555d.containsKey(eqy2)) {
                                j.mo67752b((Iterable) epr.m10926b(((epq) ((C0034at) eqz.f15555d.get(eqy2)).mo2448b()).f15491a));
                            }
                        }
                    }
                }
            }
            j.mo67752b((Iterable) epr.m10926b(bsxk));
            set = j.mo67751a();
        } else {
            set = bnon.f131923a;
        }
        bnia j2 = bnic.m109500j();
        for (bsxn bsxn4 : set) {
            eqy eqy3 = new eqy(d.f15547a, bsxn4, d.f15549c, d.f15551e);
            if (eqz.f15555d.containsKey(eqy3) && !((epq) ((C0034at) eqz.f15555d.get(eqy3)).mo2448b()).mo10396c()) {
                bxvd da = bsxo.f147591c.mo74144da();
                bsxn bsxn5 = ((epq) ((C0034at) eqz.f15555d.get(eqy3)).mo2448b()).f15491a.f147583d;
                if (bsxn5 == null) {
                    bsxn5 = bsxn.f147586d;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsxo bsxo = (bsxo) da.f164949b;
                bsxn5.getClass();
                bsxo.f147594b = bsxn5;
                bsxo.f147593a |= 1;
                j2.mo67629b((bsxo) da.mo74062i());
            }
        }
        bnic a3 = j2.mo67751a();
        long currentTimeMillis = System.currentTimeMillis();
        mo10479a();
        aucb a4 = aucu.m76780a(this.f15626e, new esk(this, bsxn, currentTimeMillis, a3, z));
        a4.mo50373a(new esl(this, currentTimeMillis));
        a4.mo50372a(new esm(this, bsxn, currentTimeMillis));
        a4.mo50371a(new esn(this));
    }

    /* renamed from: a */
    public final void mo10482a(bsxn bsxn, long j, Map map, eqc eqc) {
        epq epq;
        eqf eqf;
        epq epq2;
        long j2;
        int i;
        bsum a;
        bsum a2;
        esu a3;
        esu a4;
        bsxn bsxn2 = bsxn;
        Map map2 = map;
        if (!map2.containsKey(bsxn2)) {
            eqz eqz = this.f15634m;
            eqy d = mo10488d(bsxn);
            if (eqz.f15555d.containsKey(d)) {
                epq = (epq) ((C0034at) eqz.f15555d.get(d)).mo2448b();
            } else {
                epq = new epq(d.f15548b);
            }
            if (epq.mo10396c()) {
                int i2 = bsxn2.f147589b;
                epq epq3 = null;
                if (i2 == 524) {
                    int a5 = epu.m10942a(bsxn);
                    if (a5 == 1 || eqg.m10969b(a5)) {
                        bxvd da = bsvh.f147251l.mo74144da();
                        bsxn b = eqg.m10968b(10209, a5);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsvh bsvh = (bsvh) da.f164949b;
                        b.getClass();
                        bsvh.f147254b = b;
                        bsvh.f147253a |= 1;
                        bsxn b2 = eqg.m10968b(10111, a5);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsvh bsvh2 = (bsvh) da.f164949b;
                        b2.getClass();
                        bsvh2.f147258f = b2;
                        bsvh2.f147253a |= 32;
                        if (eqg.m10969b(a5)) {
                            bsxn c = eqg.m10970c(2007);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bsvh bsvh3 = (bsvh) da.f164949b;
                            c.getClass();
                            bsvh3.f147262j = c;
                            bsvh3.f147253a |= 4096;
                            bsxn c2 = eqg.m10970c(2008);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bsvh bsvh4 = (bsvh) da.f164949b;
                            c2.getClass();
                            bsvh4.f147263k = c2;
                            bsvh4.f147253a |= 8192;
                        }
                        bxvd da2 = bsxk.f147578f.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bsxk bsxk = (bsxk) da2.f164949b;
                        int i3 = 2 | bsxk.f147580a;
                        bsxk.f147580a = i3;
                        bsxk.f147584e = true;
                        bsxn.getClass();
                        bsxk.f147583d = bsxn2;
                        bsxk.f147580a = i3 | 1;
                        bsxq bsxq = (bsxq) bsxr.f147603b.mo74144da();
                        bxvd da3 = bsul.f147142j.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bsul bsul = (bsul) da3.f164949b;
                        bsvh bsvh5 = (bsvh) da.mo74062i();
                        bsvh5.getClass();
                        bsul.f147149f = bsvh5;
                        bsul.f147144a |= 32;
                        bsxq.mo70723a(da3);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bsxk bsxk2 = (bsxk) da2.f164949b;
                        bsxr bsxr = (bsxr) bsxq.mo74062i();
                        bsxr.getClass();
                        bsxk2.f147582c = bsxr;
                        bsxk2.f147581b = 3;
                        bsxk bsxk3 = (bsxk) da2.mo74062i();
                        if (cbro.m128207k() && a5 == 1 && ffr.m11620a(((eqg) eqc).f15516a)) {
                            eqf = eqf.m10960a(bsxk3);
                        } else {
                            eqf = eqf.m10961b(bsxk3);
                        }
                    } else {
                        eqf = null;
                    }
                } else if (i2 == 10047) {
                    eqf = eqg.m10967a(bsxn2, 10);
                } else if (i2 == 10110) {
                    eqf = ((eqg) eqc).mo10411b(bsxn2);
                } else if (i2 == 10211) {
                    eqg eqg = (eqg) eqc;
                    if (ffr.m11620a(eqg.f15516a)) {
                        bsum bsum = (bsum) bsuo.f147154j.mo74144da();
                        if (bsum.f164950c) {
                            bsum.mo74035c();
                            bsum.f164950c = false;
                        }
                        bsuo bsuo = (bsuo) bsum.f164949b;
                        "com.google.android.gms".getClass();
                        int i4 = bsuo.f147156a | 1;
                        bsuo.f147156a = i4;
                        bsuo.f147157b = "com.google.android.gms";
                        "com.google.android.gms.accountsettings.VIEW_SETTINGS_0P".getClass();
                        bsuo.f147156a = i4 | 4;
                        bsuo.f147159d = "com.google.android.gms.accountsettings.VIEW_SETTINGS_0P";
                        bxvd da4 = bsvx.f147351c.mo74144da();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bsvx bsvx = (bsvx) da4.f164949b;
                        bsvx.f147353a = 11;
                        bsvx.f147354b = 1;
                        bsum.mo70712a("extra.screenId", (bsvx) da4.mo74062i());
                        bxvd da5 = bsxk.f147578f.mo74144da();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bsxk bsxk4 = (bsxk) da5.f164949b;
                        int i5 = 2 | bsxk4.f147580a;
                        bsxk4.f147580a = i5;
                        bsxk4.f147584e = true;
                        bsxn.getClass();
                        bsxk4.f147583d = bsxn2;
                        bsxk4.f147580a = i5 | 1;
                        bsxq bsxq2 = (bsxq) bsxr.f147603b.mo74144da();
                        bxvd da6 = bsul.f147142j.mo74144da();
                        bxvd da7 = bsup.f147165d.mo74144da();
                        eqg.mo10409a(bsum);
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bsup bsup = (bsup) da7.f164949b;
                        bsuo bsuo2 = (bsuo) bsum.mo74062i();
                        bsuo2.getClass();
                        bsup.f147169c = bsuo2;
                        bsup.f147167a |= 1;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bsul bsul2 = (bsul) da6.f164949b;
                        bsup bsup2 = (bsup) da7.mo74062i();
                        bsup2.getClass();
                        bsul2.f147151h = bsup2;
                        bsul2.f147144a |= 128;
                        bsxq2.mo70723a(da6);
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bsxk bsxk5 = (bsxk) da5.f164949b;
                        bsxr bsxr2 = (bsxr) bsxq2.mo74062i();
                        bsxr2.getClass();
                        bsxk5.f147582c = bsxr2;
                        bsxk5.f147581b = 3;
                        eqf = eqf.m10961b((bsxk) da5.mo74062i());
                    } else {
                        eqf = null;
                    }
                } else if (i2 == 10371) {
                    eqg eqg2 = (eqg) eqc;
                    if (ffr.m11620a(eqg2.f15516a)) {
                        if (!cbro.m128204h()) {
                            i = 2;
                        } else {
                            i = 10212;
                        }
                        bxvd da8 = bsxk.f147578f.mo74144da();
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        bsxk bsxk6 = (bsxk) da8.f164949b;
                        int i6 = 2 | bsxk6.f147580a;
                        bsxk6.f147580a = i6;
                        bsxk6.f147584e = true;
                        bsxn.getClass();
                        bsxk6.f147583d = bsxn2;
                        bsxk6.f147580a = i6 | 1;
                        bsvd a6 = eqg.m10965a(eqg2.mo10408a((int) C0126R.string.common_asm_google_account_title), eqg2.mo10408a((int) C0126R.string.accountsettings_google_account_subtitle), bswg.GOOGLE_G_ICON, i);
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        bsxk bsxk7 = (bsxk) da8.f164949b;
                        a6.getClass();
                        bsxk7.f147582c = a6;
                        bsxk7.f147581b = 8;
                        bsxk bsxk8 = (bsxk) da8.mo74062i();
                        if (!cbro.m128207k() || !ffr.m11620a(eqg2.f15516a)) {
                            eqf = eqf.m10961b(bsxk8);
                        } else {
                            eqf = eqf.m10960a(bsxk8);
                        }
                    } else {
                        eqf = null;
                    }
                } else if (i2 == 2009) {
                    eqf = eqg.m10967a(bsxn2, 14);
                } else if (i2 == 2010) {
                    eqf = eqg.m10967a(bsxn2, 15);
                } else if (i2 == 10208) {
                    eqf = ((eqg) eqc).mo10407a(bsxn2);
                } else if (i2 != 10209) {
                    switch (i2) {
                        case 1003:
                            bxvd da9 = bsxk.f147578f.mo74144da();
                            if (da9.f164950c) {
                                da9.mo74035c();
                                da9.f164950c = false;
                            }
                            bsxk bsxk9 = (bsxk) da9.f164949b;
                            int i7 = bsxk9.f147580a | 2;
                            bsxk9.f147580a = i7;
                            bsxk9.f147584e = true;
                            bsxn.getClass();
                            bsxk9.f147583d = bsxn2;
                            bsxk9.f147580a = i7 | 1;
                            bsxq bsxq3 = (bsxq) bsxr.f147603b.mo74144da();
                            bxvd da10 = bsul.f147142j.mo74144da();
                            bxvd da11 = bsup.f147165d.mo74144da();
                            bsum bsum2 = (bsum) bsuo.f147154j.mo74144da();
                            if (bsum2.f164950c) {
                                bsum2.mo74035c();
                                bsum2.f164950c = false;
                            }
                            bsuo bsuo3 = (bsuo) bsum2.f164949b;
                            "com.android.settings".getClass();
                            int i8 = bsuo3.f147156a | 1;
                            bsuo3.f147156a = i8;
                            bsuo3.f147157b = "com.android.settings";
                            "android.settings.DEVICE_INFO_SETTINGS".getClass();
                            bsuo3.f147156a = i8 | 4;
                            bsuo3.f147159d = "android.settings.DEVICE_INFO_SETTINGS";
                            ((eqg) eqc).mo10409a(bsum2);
                            if (da11.f164950c) {
                                da11.mo74035c();
                                da11.f164950c = false;
                            }
                            bsup bsup3 = (bsup) da11.f164949b;
                            bsuo bsuo4 = (bsuo) bsum2.mo74062i();
                            bsuo4.getClass();
                            bsup3.f147169c = bsuo4;
                            bsup3.f147167a |= 1;
                            if (da10.f164950c) {
                                da10.mo74035c();
                                da10.f164950c = false;
                            }
                            bsul bsul3 = (bsul) da10.f164949b;
                            bsup bsup4 = (bsup) da11.mo74062i();
                            bsup4.getClass();
                            bsul3.f147151h = bsup4;
                            bsul3.f147144a |= 128;
                            bsxq3.mo70723a(da10);
                            if (da9.f164950c) {
                                da9.mo74035c();
                                da9.f164950c = false;
                            }
                            bsxk bsxk10 = (bsxk) da9.f164949b;
                            bsxr bsxr3 = (bsxr) bsxq3.mo74062i();
                            bsxr3.getClass();
                            bsxk10.f147582c = bsxr3;
                            bsxk10.f147581b = 3;
                            eqf = eqf.m10961b((bsxk) da9.mo74062i());
                            break;
                        case 1004:
                            bsxq bsxq4 = (bsxq) bsxr.f147603b.mo74144da();
                            if (!bmxx.m108577a(cbri.m128133c()) && (a = eqg.m10963a(cbri.m128133c())) != null) {
                                bxvd da12 = bsul.f147142j.mo74144da();
                                bxvd da13 = bsup.f147165d.mo74144da();
                                ((eqg) eqc).mo10409a(a);
                                if (da13.f164950c) {
                                    da13.mo74035c();
                                    da13.f164950c = false;
                                }
                                bsup bsup5 = (bsup) da13.f164949b;
                                bsuo bsuo5 = (bsuo) a.mo74062i();
                                bsuo5.getClass();
                                bsup5.f147169c = bsuo5;
                                bsup5.f147167a |= 1;
                                if (da12.f164950c) {
                                    da12.mo74035c();
                                    da12.f164950c = false;
                                }
                                bsul bsul4 = (bsul) da12.f164949b;
                                bsup bsup6 = (bsup) da13.mo74062i();
                                bsup6.getClass();
                                bsul4.f147151h = bsup6;
                                bsul4.f147144a |= 128;
                                bsxq4.mo70723a(da12);
                            }
                            bxvd da14 = bsxk.f147578f.mo74144da();
                            if (da14.f164950c) {
                                da14.mo74035c();
                                da14.f164950c = false;
                            }
                            bsxk bsxk11 = (bsxk) da14.f164949b;
                            int i9 = bsxk11.f147580a | 2;
                            bsxk11.f147580a = i9;
                            bsxk11.f147584e = true;
                            bsxn.getClass();
                            bsxk11.f147583d = bsxn2;
                            bsxk11.f147580a = i9 | 1;
                            bxvd da15 = bsul.f147142j.mo74144da();
                            bxvd da16 = bsup.f147165d.mo74144da();
                            bsum bsum3 = (bsum) bsuo.f147154j.mo74144da();
                            if (bsum3.f164950c) {
                                bsum3.mo74035c();
                                bsum3.f164950c = false;
                            }
                            bsuo bsuo6 = (bsuo) bsum3.f164949b;
                            "com.android.emergency".getClass();
                            int i10 = bsuo6.f147156a | 1;
                            bsuo6.f147156a = i10;
                            bsuo6.f147157b = "com.android.emergency";
                            "android.settings.EDIT_EMERGENCY_INFO".getClass();
                            int i11 = i10 | 4;
                            bsuo6.f147156a = i11;
                            bsuo6.f147159d = "android.settings.EDIT_EMERGENCY_INFO";
                            bsuo6.f147156a = i11 | 32;
                            bsuo6.f147164i = true;
                            ((eqg) eqc).mo10409a(bsum3);
                            if (da16.f164950c) {
                                da16.mo74035c();
                                da16.f164950c = false;
                            }
                            bsup bsup7 = (bsup) da16.f164949b;
                            bsuo bsuo7 = (bsuo) bsum3.mo74062i();
                            bsuo7.getClass();
                            bsup7.f147169c = bsuo7;
                            bsup7.f147167a |= 1;
                            if (da15.f164950c) {
                                da15.mo74035c();
                                da15.f164950c = false;
                            }
                            bsul bsul5 = (bsul) da15.f164949b;
                            bsup bsup8 = (bsup) da16.mo74062i();
                            bsup8.getClass();
                            bsul5.f147151h = bsup8;
                            bsul5.f147144a |= 128;
                            bsxq4.mo70723a(da15);
                            if (da14.f164950c) {
                                da14.mo74035c();
                                da14.f164950c = false;
                            }
                            bsxk bsxk12 = (bsxk) da14.f164949b;
                            bsxr bsxr4 = (bsxr) bsxq4.mo74062i();
                            bsxr4.getClass();
                            bsxk12.f147582c = bsxr4;
                            bsxk12.f147581b = 3;
                            eqf = eqf.m10961b((bsxk) da14.mo74062i());
                            break;
                        case 1005:
                            bsxq bsxq5 = (bsxq) bsxr.f147603b.mo74144da();
                            if (!bmxx.m108577a(cbri.m128135e()) && (a2 = eqg.m10963a(cbri.m128135e())) != null) {
                                bxvd da17 = bsul.f147142j.mo74144da();
                                bxvd da18 = bsup.f147165d.mo74144da();
                                ((eqg) eqc).mo10409a(a2);
                                if (da18.f164950c) {
                                    da18.mo74035c();
                                    da18.f164950c = false;
                                }
                                bsup bsup9 = (bsup) da18.f164949b;
                                bsuo bsuo8 = (bsuo) a2.mo74062i();
                                bsuo8.getClass();
                                bsup9.f147169c = bsuo8;
                                bsup9.f147167a |= 1;
                                if (da17.f164950c) {
                                    da17.mo74035c();
                                    da17.f164950c = false;
                                }
                                bsul bsul6 = (bsul) da17.f164949b;
                                bsup bsup10 = (bsup) da18.mo74062i();
                                bsup10.getClass();
                                bsul6.f147151h = bsup10;
                                bsul6.f147144a |= 128;
                                bsxq5.mo70723a(da17);
                            }
                            bxvd da19 = bsxk.f147578f.mo74144da();
                            if (da19.f164950c) {
                                da19.mo74035c();
                                da19.f164950c = false;
                            }
                            bsxk bsxk13 = (bsxk) da19.f164949b;
                            int i12 = bsxk13.f147580a | 2;
                            bsxk13.f147580a = i12;
                            bsxk13.f147584e = true;
                            bsxn.getClass();
                            bsxk13.f147583d = bsxn2;
                            bsxk13.f147580a = i12 | 1;
                            bxvd da20 = bsul.f147142j.mo74144da();
                            bxvd da21 = bsvb.f147222d.mo74144da();
                            if (da21.f164950c) {
                                da21.mo74035c();
                                da21.f164950c = false;
                            }
                            bsvb bsvb = (bsvb) da21.f164949b;
                            bsvb.f147224a = 2 | bsvb.f147224a;
                            bsvb.f147226c = true;
                            String j3 = cbri.f178135a.mo6606a().mo75260j();
                            if (da21.f164950c) {
                                da21.mo74035c();
                                da21.f164950c = false;
                            }
                            bsvb bsvb2 = (bsvb) da21.f164949b;
                            j3.getClass();
                            bsvb2.f147224a |= 1;
                            bsvb2.f147225b = j3;
                            if (da20.f164950c) {
                                da20.mo74035c();
                                da20.f164950c = false;
                            }
                            bsul bsul7 = (bsul) da20.f164949b;
                            bsvb bsvb3 = (bsvb) da21.mo74062i();
                            bsvb3.getClass();
                            bsul7.f147146c = bsvb3;
                            bsul7.f147144a |= 4;
                            bsxq5.mo70723a(da20);
                            if (da19.f164950c) {
                                da19.mo74035c();
                                da19.f164950c = false;
                            }
                            bsxk bsxk14 = (bsxk) da19.f164949b;
                            bsxr bsxr5 = (bsxr) bsxq5.mo74062i();
                            bsxr5.getClass();
                            bsxk14.f147582c = bsxr5;
                            bsxk14.f147581b = 3;
                            eqf = eqf.m10961b((bsxk) da19.mo74062i());
                            break;
                        default:
                            switch (i2) {
                                case 2000:
                                    int a7 = epu.m10944a(Collections.unmodifiableMap(bsxn2.f147590c));
                                    if (a7 != 0) {
                                        esx esx = ((eqg) eqc).f15518c;
                                        esx.f15656b.await();
                                        GoogleSettingsItem googleSettingsItem = (GoogleSettingsItem) esx.f15655a.f15652a.get(Integer.valueOf(a7));
                                        if (googleSettingsItem != null) {
                                            bxvd da22 = bsxk.f147578f.mo74144da();
                                            if (da22.f164950c) {
                                                da22.mo74035c();
                                                da22.f164950c = false;
                                            }
                                            bsxk bsxk15 = (bsxk) da22.f164949b;
                                            int i13 = 2 | bsxk15.f147580a;
                                            bsxk15.f147580a = i13;
                                            bsxk15.f147584e = true;
                                            bsxn.getClass();
                                            bsxk15.f147583d = bsxn2;
                                            bsxk15.f147580a = i13 | 1;
                                            epq3 = null;
                                            bsvd a8 = eqg.m10966a(eqg.m10964a(googleSettingsItem.f29958d, googleSettingsItem.f29963i, (bswg) null, eqg.m10972d(2002, a7)));
                                            if (da22.f164950c) {
                                                da22.mo74035c();
                                                da22.f164950c = false;
                                            }
                                            bsxk bsxk16 = (bsxk) da22.f164949b;
                                            a8.getClass();
                                            bsxk16.f147582c = a8;
                                            bsxk16.f147581b = 8;
                                            eqf = eqf.m10961b((bsxk) da22.mo74062i());
                                            break;
                                        }
                                    }
                                    epq3 = null;
                                    eqf = null;
                                    break;
                                case 2001:
                                    int a9 = epu.m10944a(Collections.unmodifiableMap(bsxn2.f147590c));
                                    if (a9 == 0) {
                                        eqf = null;
                                        epq3 = null;
                                        break;
                                    } else {
                                        bxvd da23 = bsxk.f147578f.mo74144da();
                                        if (da23.f164950c) {
                                            da23.mo74035c();
                                            da23.f164950c = false;
                                        }
                                        bsxk bsxk17 = (bsxk) da23.f164949b;
                                        int i14 = bsxk17.f147580a | 2;
                                        bsxk17.f147580a = i14;
                                        bsxk17.f147584e = true;
                                        bsxn.getClass();
                                        bsxk17.f147583d = bsxn2;
                                        bsxk17.f147580a = i14 | 1;
                                        bsxq bsxq6 = (bsxq) bsxr.f147603b.mo74144da();
                                        bxvd da24 = bsul.f147142j.mo74144da();
                                        bxvd da25 = bswr.f147479e.mo74144da();
                                        if (da25.f164950c) {
                                            da25.mo74035c();
                                            da25.f164950c = false;
                                        }
                                        bswr bswr = (bswr) da25.f164949b;
                                        bswr.f147481a |= 1;
                                        bswr.f147482b = 11;
                                        bxvd da26 = bswc.f147374c.mo74144da();
                                        if (da26.f164950c) {
                                            da26.mo74035c();
                                            da26.f164950c = false;
                                        }
                                        bswc bswc = (bswc) da26.f164949b;
                                        bswc.f147376a |= 1;
                                        bswc.f147377b = a9;
                                        bswc bswc2 = (bswc) da26.mo74062i();
                                        if (da25.f164950c) {
                                            da25.mo74035c();
                                            da25.f164950c = false;
                                        }
                                        bswr bswr2 = (bswr) da25.f164949b;
                                        bswc2.getClass();
                                        bswr2.f147484d = bswc2;
                                        bswr2.f147481a |= 8;
                                        bswr bswr3 = (bswr) da25.mo74062i();
                                        if (da24.f164950c) {
                                            da24.mo74035c();
                                            da24.f164950c = false;
                                        }
                                        bsul bsul8 = (bsul) da24.f164949b;
                                        bswr3.getClass();
                                        bsul8.f147145b = bswr3;
                                        bsul8.f147144a |= 2;
                                        bsxq6.mo70723a(da24);
                                        if (da23.f164950c) {
                                            da23.mo74035c();
                                            da23.f164950c = false;
                                        }
                                        bsxk bsxk18 = (bsxk) da23.f164949b;
                                        bsxr bsxr6 = (bsxr) bsxq6.mo74062i();
                                        bsxr6.getClass();
                                        bsxk18.f147582c = bsxr6;
                                        bsxk18.f147581b = 3;
                                        eqf = eqf.m10961b((bsxk) da23.mo74062i());
                                        epq3 = null;
                                        break;
                                    }
                                case 2002:
                                    int b3 = epu.m10945b(Collections.unmodifiableMap(bsxn2.f147590c));
                                    if (b3 != -1 && (a3 = ((eqg) eqc).f15518c.mo10497a(b3)) != null) {
                                        bxvd da27 = bsxk.f147578f.mo74144da();
                                        if (da27.f164950c) {
                                            da27.mo74035c();
                                            da27.f164950c = false;
                                        }
                                        bsxk bsxk19 = (bsxk) da27.f164949b;
                                        int i15 = bsxk19.f147580a | 2;
                                        bsxk19.f147580a = i15;
                                        bsxk19.f147584e = true;
                                        bsxn.getClass();
                                        bsxk19.f147583d = bsxn2;
                                        bsxk19.f147580a = i15 | 1;
                                        bsut[] bsutArr = new bsut[1];
                                        String str = a3.f15646a;
                                        bxvd da28 = bsut.f147187e.mo74144da();
                                        bxvd da29 = bsvs.f147328c.mo74144da();
                                        if (da29.f164950c) {
                                            da29.mo74035c();
                                            da29.f164950c = false;
                                        }
                                        bsvs bsvs = (bsvs) da29.f164949b;
                                        str.getClass();
                                        bsvs.f147330a |= 1;
                                        bsvs.f147331b = str;
                                        if (da28.f164950c) {
                                            da28.mo74035c();
                                            da28.f164950c = false;
                                        }
                                        bsut bsut = (bsut) da28.f164949b;
                                        bsvs bsvs2 = (bsvs) da29.mo74062i();
                                        bsvs2.getClass();
                                        bsut.f147191c = bsvs2;
                                        bsut.f147190b = 17;
                                        bsutArr[0] = (bsut) da28.mo74062i();
                                        bsvd a10 = eqg.m10966a(bsutArr);
                                        if (da27.f164950c) {
                                            da27.mo74035c();
                                            da27.f164950c = false;
                                        }
                                        bsxk bsxk20 = (bsxk) da27.f164949b;
                                        a10.getClass();
                                        bsxk20.f147582c = a10;
                                        bsxk20.f147581b = 8;
                                        eqf = eqf.m10961b((bsxk) da27.mo74062i());
                                        break;
                                    } else {
                                        eqf = null;
                                        break;
                                    }
                                    break;
                                case 2003:
                                    int b4 = epu.m10945b(Collections.unmodifiableMap(bsxn2.f147590c));
                                    if (b4 != -1 && (a4 = ((eqg) eqc).f15518c.mo10497a(b4)) != null) {
                                        bxvd da30 = bsxk.f147578f.mo74144da();
                                        if (da30.f164950c) {
                                            da30.mo74035c();
                                            da30.f164950c = false;
                                        }
                                        bsxk bsxk21 = (bsxk) da30.f164949b;
                                        int i16 = 2 | bsxk21.f147580a;
                                        bsxk21.f147580a = i16;
                                        bsxk21.f147584e = true;
                                        bsxn.getClass();
                                        bsxk21.f147583d = bsxn2;
                                        bsxk21.f147580a = i16 | 1;
                                        bsvd a11 = eqg.m10966a(eqg.m10964a(a4.f15646a, (String) null, (bswg) null, eqg.m10971c(2005, b4)));
                                        if (da30.f164950c) {
                                            da30.mo74035c();
                                            da30.f164950c = false;
                                        }
                                        bsxk bsxk22 = (bsxk) da30.f164949b;
                                        a11.getClass();
                                        bsxk22.f147582c = a11;
                                        bsxk22.f147581b = 8;
                                        eqf = eqf.m10961b((bsxk) da30.mo74062i());
                                        break;
                                    } else {
                                        eqf = null;
                                        break;
                                    }
                                case 2004:
                                    int b5 = epu.m10945b(Collections.unmodifiableMap(bsxn2.f147590c));
                                    if (b5 == -1) {
                                        eqf = null;
                                        break;
                                    } else {
                                        bsxn c3 = eqg.m10971c(2006, b5);
                                        bxvd da31 = bsxk.f147578f.mo74144da();
                                        if (da31.f164950c) {
                                            da31.mo74035c();
                                            da31.f164950c = false;
                                        }
                                        bsxk bsxk23 = (bsxk) da31.f164949b;
                                        int i17 = 2 | bsxk23.f147580a;
                                        bsxk23.f147580a = i17;
                                        bsxk23.f147584e = true;
                                        bsxn.getClass();
                                        bsxk23.f147583d = bsxn2;
                                        bsxk23.f147580a = i17 | 1;
                                        bsxq bsxq7 = (bsxq) bsxr.f147603b.mo74144da();
                                        bxvd da32 = bsul.f147142j.mo74144da();
                                        bxvd da33 = bsvh.f147251l.mo74144da();
                                        if (da33.f164950c) {
                                            da33.mo74035c();
                                            da33.f164950c = false;
                                        }
                                        bsvh bsvh6 = (bsvh) da33.f164949b;
                                        c3.getClass();
                                        bsvh6.f147258f = c3;
                                        bsvh6.f147253a |= 32;
                                        bxvd da34 = bswk.f147445c.mo74144da();
                                        String str2 = ((eqg) eqc).f15518c.mo10497a(b5).f15646a;
                                        if (da34.f164950c) {
                                            da34.mo74035c();
                                            da34.f164950c = false;
                                        }
                                        bswk bswk = (bswk) da34.f164949b;
                                        str2.getClass();
                                        bswk.f147447a |= 1;
                                        bswk.f147448b = str2;
                                        bswk bswk2 = (bswk) da34.mo74062i();
                                        if (da33.f164950c) {
                                            da33.mo74035c();
                                            da33.f164950c = false;
                                        }
                                        bsvh bsvh7 = (bsvh) da33.f164949b;
                                        bswk2.getClass();
                                        bsvh7.f147260h = bswk2;
                                        bsvh7.f147253a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                        if (da32.f164950c) {
                                            da32.mo74035c();
                                            da32.f164950c = false;
                                        }
                                        bsul bsul9 = (bsul) da32.f164949b;
                                        bsvh bsvh8 = (bsvh) da33.mo74062i();
                                        bsvh8.getClass();
                                        bsul9.f147149f = bsvh8;
                                        bsul9.f147144a |= 32;
                                        bsxq7.mo70723a(da32);
                                        if (da31.f164950c) {
                                            da31.mo74035c();
                                            da31.f164950c = false;
                                        }
                                        bsxk bsxk24 = (bsxk) da31.f164949b;
                                        bsxr bsxr7 = (bsxr) bsxq7.mo74062i();
                                        bsxr7.getClass();
                                        bsxk24.f147582c = bsxr7;
                                        bsxk24.f147581b = 3;
                                        eqf = eqf.m10961b((bsxk) da31.mo74062i());
                                        break;
                                    }
                                case 2005:
                                    int b6 = epu.m10945b(Collections.unmodifiableMap(bsxn2.f147590c));
                                    if (b6 != -1) {
                                        eqg eqg3 = (eqg) eqc;
                                        esu a12 = eqg3.f15518c.mo10497a(b6);
                                        if (a12 != null) {
                                            bsvf bsvf = (bsvf) bsvg.f147248b.mo74144da();
                                            bnrd a13 = a12.f15649d.iterator();
                                            while (a13.hasNext()) {
                                                eqg3.mo10410a(bsvf, (est) a13.next());
                                            }
                                            bxvd da35 = bsxk.f147578f.mo74144da();
                                            if (da35.f164950c) {
                                                da35.mo74035c();
                                                da35.f164950c = false;
                                            }
                                            bsxk bsxk25 = (bsxk) da35.f164949b;
                                            int i18 = bsxk25.f147580a | 2;
                                            bsxk25.f147580a = i18;
                                            bsxk25.f147584e = false;
                                            bsxn.getClass();
                                            bsxk25.f147583d = bsxn2;
                                            bsxk25.f147580a = i18 | 1;
                                            bsvg bsvg = (bsvg) bsvf.mo74062i();
                                            if (da35.f164950c) {
                                                da35.mo74035c();
                                                da35.f164950c = false;
                                            }
                                            bsxk bsxk26 = (bsxk) da35.f164949b;
                                            bsvg.getClass();
                                            bsxk26.f147582c = bsvg;
                                            bsxk26.f147581b = 6;
                                            eqf = eqf.m10961b((bsxk) da35.mo74062i());
                                            break;
                                        }
                                    }
                                    eqf = null;
                                    break;
                                case 2006:
                                    adyl.m51422a();
                                    bswv bswv = (bswv) bswx.f147509b.mo74144da();
                                    eqg eqg4 = (eqg) eqc;
                                    if (adyl.m51429e(eqg4.f15517b)) {
                                        bswv.mo70717a(eqg4.mo10406a((int) C0126R.string.common_usage_and_diagnostics, 2009));
                                    }
                                    bswv.mo70717a(eqg4.mo10406a((int) C0126R.string.common_open_source_licenses, 2010));
                                    bxvd da36 = bsxk.f147578f.mo74144da();
                                    if (da36.f164950c) {
                                        da36.mo74035c();
                                        da36.f164950c = false;
                                    }
                                    bsxk bsxk27 = (bsxk) da36.f164949b;
                                    int i19 = bsxk27.f147580a | 2;
                                    bsxk27.f147580a = i19;
                                    bsxk27.f147584e = true;
                                    bsxn.getClass();
                                    bsxk27.f147583d = bsxn2;
                                    bsxk27.f147580a = i19 | 1;
                                    bswx bswx = (bswx) bswv.mo74062i();
                                    bswx.getClass();
                                    bsxk27.f147582c = bswx;
                                    bsxk27.f147581b = 13;
                                    eqf = eqf.m10961b((bsxk) da36.mo74062i());
                                    break;
                                case 2007:
                                    eqf = eqg.m10967a(bsxn2, 12);
                                    break;
                                default:
                                    switch (i2) {
                                        case 10367:
                                            eqf = ((eqg) eqc).mo10412c(bsxn2);
                                            break;
                                        case 10368:
                                            eqf = ((eqg) eqc).mo10413d(bsxn2);
                                            break;
                                        case 10369:
                                            bxvd da37 = bsxk.f147578f.mo74144da();
                                            if (da37.f164950c) {
                                                da37.mo74035c();
                                                da37.f164950c = false;
                                            }
                                            bsxk bsxk28 = (bsxk) da37.f164949b;
                                            int i20 = bsxk28.f147580a | 2;
                                            bsxk28.f147580a = i20;
                                            bsxk28.f147584e = true;
                                            bsxn.getClass();
                                            bsxk28.f147583d = bsxn2;
                                            bsxk28.f147580a = i20 | 1;
                                            eqg eqg5 = (eqg) eqc;
                                            bsvd a14 = eqg.m10965a(eqg5.mo10408a((int) C0126R.string.as_clp_payments_info_title), eqg5.mo10408a((int) C0126R.string.as_clp_payments_info_subtitle), bswg.PAYMENT_ICON, 1006);
                                            if (da37.f164950c) {
                                                da37.mo74035c();
                                                da37.f164950c = false;
                                            }
                                            bsxk bsxk29 = (bsxk) da37.f164949b;
                                            a14.getClass();
                                            bsxk29.f147582c = a14;
                                            bsxk29.f147581b = 8;
                                            bsxk bsxk30 = (bsxk) da37.mo74062i();
                                            if (cbro.m128207k() && ffr.m11620a(eqg5.f15516a)) {
                                                eqf = eqf.m10960a(bsxk30);
                                                break;
                                            } else {
                                                eqf = eqf.m10961b(bsxk30);
                                                break;
                                            }
                                            break;
                                        default:
                                            eqf = null;
                                            break;
                                    }
                            }
                    }
                } else {
                    bxvd da38 = bsxk.f147578f.mo74144da();
                    if (da38.f164950c) {
                        da38.mo74035c();
                        da38.f164950c = false;
                    }
                    bsxk bsxk31 = (bsxk) da38.f164949b;
                    int i21 = bsxk31.f147580a | 2;
                    bsxk31.f147580a = i21;
                    bsxk31.f147584e = true;
                    bsxn.getClass();
                    bsxk31.f147583d = bsxn2;
                    bsxk31.f147580a = i21 | 1;
                    bsut[] bsutArr2 = new bsut[1];
                    bxvd da39 = bsut.f147187e.mo74144da();
                    bsvr bsvr = bsvr.f147326a;
                    if (da39.f164950c) {
                        da39.mo74035c();
                        da39.f164950c = false;
                    }
                    bsut bsut2 = (bsut) da39.f164949b;
                    bsvr.getClass();
                    bsut2.f147191c = bsvr;
                    bsut2.f147190b = 19;
                    bsutArr2[0] = (bsut) da39.mo74062i();
                    bsvd a15 = eqg.m10966a(bsutArr2);
                    if (da38.f164950c) {
                        da38.mo74035c();
                        da38.f164950c = false;
                    }
                    bsxk bsxk32 = (bsxk) da38.f164949b;
                    a15.getClass();
                    bsxk32.f147582c = a15;
                    bsxk32.f147581b = 8;
                    eqf = eqf.m10961b((bsxk) da38.mo74062i());
                }
                if (eqf == null) {
                    epq2 = epq3;
                } else if (!ffr.m11620a(((eqg) eqc).f15516a) && !eqf.f15514b) {
                    throw new IllegalStateException("No account resource should always be local-only");
                } else {
                    if (!eqf.f15514b) {
                        j2 = 0;
                    } else {
                        j2 = j;
                    }
                    epq2 = new epq(eqf.f15513a, j2, true);
                }
                if (epq2 != null) {
                    bsxn bsxn3 = epq2.f15491a.f147583d;
                    if (bsxn3 == null) {
                        bsxn3 = bsxn.f147586d;
                    }
                    sdo.m34970a(bsxn3.equals(bsxn2));
                    sdo.m34970a(epq2.f15493c);
                    map2.put(bsxn2, epq2);
                    m11092a(epq2, j, map, eqc);
                    return;
                }
                m11092a(epq, j, map, eqc);
                return;
            }
            m11092a(epq, j, map, eqc);
        }
    }

    /* renamed from: a */
    public final void mo10483a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            epq epq = (epq) list.get(i);
            if (!epq.mo10394a()) {
                eqz eqz = this.f15634m;
                bsxn bsxn = epq.f15491a.f147583d;
                if (bsxn == null) {
                    bsxn = bsxn.f147586d;
                }
                C0034at b = eqz.mo10433b(mo10488d(bsxn));
                epq epq2 = (epq) b.mo2448b();
                if (!epq.f15493c || epq2.mo10394a() || epq2.f15493c) {
                    b.mo2450b(new epq(epv.m10946a(epq.f15491a), epq.f15492b, epq.f15493c));
                }
            }
        }
    }
}
