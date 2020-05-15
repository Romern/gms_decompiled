package p000;

import android.text.TextUtils;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.text.Collator;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

/* renamed from: trs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class trs {

    /* renamed from: a */
    public static final srn f46555a = srn.m36127a(sgj.CREDENTIAL_MANAGER);

    /* renamed from: b */
    public final tox f46556b;

    /* renamed from: c */
    public final top f46557c;

    /* renamed from: d */
    public final Collator f46558d;

    /* renamed from: e */
    public final C0034at f46559e = new C0034at();

    /* renamed from: f */
    public final C0034at f46560f = new C0034at();

    /* renamed from: g */
    private final Comparator f46561g;

    public trs(qqa qqa, rjx rjx, String str) {
        this.f46556b = new tox(qqa, str);
        this.f46557c = new top(rjx);
        Collator instance = Collator.getInstance(tux.m37507a());
        this.f46558d = instance;
        instance.setStrength(0);
        this.f46561g = new tqs(this);
    }

    /* renamed from: a */
    public static String m37399a(tqj tqj) {
        if (tqj.mo26719b().mo66813a()) {
            return (String) tqj.mo26719b().mo66814b();
        }
        return tqj.mo26741f();
    }

    /* renamed from: b */
    private static final tqj m37400b(qun qun, bngx bngx) {
        TextUtils.TruncateAt truncateAt;
        String str = qun.f42167b;
        tqi tqi = new tqi(null);
        if (str != null) {
            tqi.f46500a = str;
            if (qun != null) {
                tqi.f46504e = qun;
                bmxv a = top.m37297a(bngx, str);
                if (a.mo66813a()) {
                    tqi.f46502c = bmxv.m108566b(((bytv) a.mo66814b()).f167722d);
                    tqi.f46501b = bmxv.m108566b(((bytv) a.mo66814b()).f167720b);
                    int a2 = bytu.m125339a(((bytv) a.mo66814b()).f167721c);
                    if (a2 != 0 && a2 == 2) {
                        truncateAt = TextUtils.TruncateAt.START;
                    } else {
                        truncateAt = TextUtils.TruncateAt.END;
                    }
                    tqi.f46503d = bmxv.m108566b(truncateAt);
                }
                String str2 = tqi.f46500a == null ? " signOnRealm" : "";
                if (tqi.f46504e == null) {
                    str2 = str2.concat(" passwordSpecificsData");
                }
                if (str2.isEmpty()) {
                    return new tqf(tqi.f46500a, tqi.f46501b, tqi.f46502c, tqi.f46503d, tqi.f46504e);
                }
                String valueOf = String.valueOf(str2);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            throw new NullPointerException("Null passwordSpecificsData");
        }
        throw new NullPointerException("Null signOnRealm");
    }

    /* renamed from: a */
    public final void mo26746a(aucb aucb, boolean z) {
        if (cdqa.m134650c()) {
            aucb.mo50373a(new trd(this));
            aucb.mo50372a(new trm(this, z));
            return;
        }
        aucb.mo50373a(new trn(this, z));
        aucb.mo50372a(new tro(this, z));
    }

    /* renamed from: a */
    public final void mo26747a(bngx bngx, bngx bngx2) {
        String str;
        int i;
        String str2;
        String str3;
        bnhe bnhe;
        bngs bngs;
        bytz bytz;
        int i2;
        int i3;
        trs trs = this;
        bngx bngx3 = bngx;
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        bnre i4 = bngx2.listIterator();
        while (i4.hasNext()) {
            qun qun = (qun) i4.next();
            if (qun.f42175j) {
                j2.mo67668c(qun);
            } else {
                j.mo67668c(qun);
            }
        }
        bngx a = j.mo67664a();
        bngs j3 = bngx.m109377j();
        int size = a.size();
        int i5 = 0;
        while (true) {
            str = "";
            if (i5 >= size) {
                break;
            }
            bngs bngs2 = j2;
            qun qun2 = (qun) a.get(i5);
            int i6 = qun2.f42166a;
            String str4 = (i6 & 32) != 0 ? qun2.f42170e : str;
            String str5 = (i6 & 128) != 0 ? qun2.f42172g : str;
            String str6 = (i6 & 2) != 0 ? qun2.f42167b : str;
            if ((i6 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
                str = qun2.f42178m;
            }
            if (str.isEmpty()) {
                j3.mo67668c(new tqg(str4, bmxv.m108566b(bsqg.m116088a(str5)), str6, bmvz.f131120a, bskj.PASSWORD, qun2));
            } else {
                j3.mo67668c(new tqg(str4, bmvz.f131120a, str6, bmxv.m108566b(str), bskj.IDENTITY_PROVIDER, qun2));
            }
            i5++;
            trs = this;
            bngx3 = bngx;
            j2 = bngs2;
        }
        bngx a2 = j3.mo67664a();
        bnny bnny = bsko.f144884a;
        bsld bsld = new bsld(bsks.f144892a);
        bsld.mo70684b(bngx3);
        bnic a3 = bsld.mo70680a();
        bslc bslc = new bslc(bsks.f144892a);
        bslc.mo70683a((Collection) a3);
        bnic a4 = bslc.mo70680a();
        HashSet hashSet = new HashSet();
        bnrd a5 = a4.iterator();
        while (a5.hasNext()) {
            bxwc bxwc = ((byty) a5.next()).f167734b;
            int size2 = bxwc.size();
            for (int i7 = 0; i7 < size2; i7++) {
                hashSet.add(((bytw) bxwc.get(i7)).f167728b);
            }
        }
        bngs j4 = bngx.m109377j();
        j4.mo67666b((Iterable) a4);
        int size3 = a2.size();
        int i8 = 0;
        while (true) {
            i = 2;
            if (i8 >= size3) {
                break;
            }
            bngs bngs3 = j2;
            bskl bskl = (bskl) a2.get(i8);
            if (!hashSet.contains(bskl.mo26728c())) {
                bytx bytx = (bytx) byty.f167731d.mo74144da();
                bxvd da = bytw.f167725e.mo74144da();
                String c = bskl.mo26728c();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bytw bytw = (bytw) da.f164949b;
                c.getClass();
                bytw.f167727a |= 1;
                bytw.f167728b = c;
                bytv a6 = bskk.m115901a(bskl.mo26728c());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bytw bytw2 = (bytw) da.f164949b;
                a6.getClass();
                bytw2.f167729c = a6;
                bytw2.f167727a |= 2;
                bytx.mo74507a((bytw) da.mo74062i());
                j4.mo67668c((byty) bytx.mo74062i());
                hashSet.add(bskl.mo26728c());
            }
            i8++;
            trs = this;
            bngx3 = bngx;
            j2 = bngs3;
        }
        bngx a7 = j4.mo67664a();
        bnha h = bnhe.m109414h();
        int size4 = a7.size();
        int i9 = 0;
        while (i9 < size4) {
            bxwc bxwc2 = ((byty) a7.get(i9)).f167734b;
            int size5 = bxwc2.size();
            int i10 = 0;
            while (true) {
                i3 = i9 + 1;
                if (i10 >= size5) {
                    break;
                }
                bytw bytw3 = (bytw) bxwc2.get(i10);
                if ((bytw3.f167727a & i) != 0) {
                    h.mo67695b(bytw3.f167728b, bytw3);
                } else {
                    String str7 = bytw3.f167728b;
                    bxvd bxvd = (bxvd) bytw3.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) bytw3);
                    bytv a8 = bskk.m115901a(bytw3.f167728b);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bytw bytw4 = (bytw) bxvd.f164949b;
                    bytw bytw5 = bytw.f167725e;
                    a8.getClass();
                    bytw4.f167729c = a8;
                    bytw4.f167727a |= 2;
                    h.mo67695b(str7, (bytw) bxvd.mo74062i());
                }
                i10++;
                i = 2;
            }
            i9 = i3;
            i = 2;
        }
        bnhe b = h.mo67618b();
        bnha h2 = bnhe.m109414h();
        int size6 = a7.size();
        int i11 = 0;
        while (i11 < size6) {
            bngs bngs4 = j2;
            bnhe bnhe2 = b;
            byty byty = (byty) a7.get(i11);
            if ((byty.f167733a & 1) != 0) {
                bxwc bxwc3 = byty.f167734b;
                int size7 = bxwc3.size();
                for (int i12 = 0; i12 < size7; i12++) {
                    String str8 = ((bytw) bxwc3.get(i12)).f167728b;
                    bytz bytz2 = byty.f167735c;
                    if (bytz2 == null) {
                        bytz2 = bytz.f167736g;
                    }
                    h2.mo67695b(str8, bytz2);
                }
            }
            i11++;
            trs = this;
            bngx3 = bngx;
            j2 = bngs4;
            b = bnhe2;
        }
        bnhe b2 = h2.mo67618b();
        bnha h3 = bnhe.m109414h();
        int size8 = a7.size();
        int i13 = 0;
        while (i13 < size8) {
            bngs bngs5 = j2;
            bnhe bnhe3 = b;
            byty byty2 = (byty) a7.get(i13);
            bxwc bxwc4 = byty2.f167734b;
            int size9 = bxwc4.size();
            int i14 = 0;
            while (true) {
                i2 = i13 + 1;
                if (i14 >= size9) {
                    break;
                }
                h3.mo67695b(((bytw) bxwc4.get(i14)).f167728b, byty2);
                i14++;
            }
            trs = this;
            bngx3 = bngx;
            i13 = i2;
            j2 = bngs5;
            b = bnhe3;
        }
        bnhe b3 = h3.mo67618b();
        bnia j5 = bnic.m109500j();
        bngs j6 = bngx.m109377j();
        int size10 = a2.size();
        int i15 = 0;
        while (i15 < size10) {
            bskl bskl2 = (bskl) a2.get(i15);
            bsjw d = bsjx.m115872d();
            bske i16 = bskf.m115890i();
            i16.mo70657a(bskl2);
            d.f144853b.add(i16.mo70656a(b));
            if (b2.containsKey(bskl2.mo26728c())) {
                bytz = (bytz) b2.get(bskl2.mo26728c());
                bngs = j2;
                bnhe = b;
            } else {
                String c2 = bskl2.mo26728c();
                bxvd da2 = bytz.f167736g.mo74144da();
                String b4 = bskk.m115902b(c2);
                if (b4.startsWith("http://")) {
                    bngs = j2;
                    b4 = b4.substring(7);
                } else {
                    bngs = j2;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bytz bytz3 = (bytz) da2.f164949b;
                b4.getClass();
                bnhe = b;
                bytz3.f167738a |= 1;
                bytz3.f167739b = b4;
                if (c2.startsWith("android://")) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bytz bytz4 = (bytz) da2.f164949b;
                    bytz4.f167740c = 2;
                    bytz4.f167738a |= 2;
                } else {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bytz bytz5 = (bytz) da2.f164949b;
                    bytz5.f167740c = 1;
                    bytz5.f167738a |= 2;
                }
                if (c2.startsWith("http://") || c2.startsWith("https://")) {
                    String valueOf = String.valueOf(c2);
                    String str9 = valueOf.length() == 0 ? new String("https://s2.googleusercontent.com/s2/favicons?sz=48&domain_url=") : "https://s2.googleusercontent.com/s2/favicons?sz=48&domain_url=".concat(valueOf);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bytz bytz6 = (bytz) da2.f164949b;
                    str9.getClass();
                    int i17 = bytz6.f167738a | 4;
                    bytz6.f167738a = i17;
                    bytz6.f167741d = str9;
                    int i18 = i17 | 16;
                    bytz6.f167738a = i18;
                    bytz6.f167743f = 48;
                    bytz6.f167738a = i18 | 8;
                    bytz6.f167742e = 48;
                }
                bytz = (bytz) da2.mo74062i();
            }
            d.mo70633a(bytz);
            bsjx a9 = d.mo70632a();
            if (b2.containsKey(bskl2.mo26728c())) {
                j5.mo67629b(a9);
            }
            j6.mo67668c(a9);
            i15++;
            trs = this;
            bngx3 = bngx;
            j2 = bngs;
            b = bnhe;
        }
        bngx a10 = j6.mo67664a();
        bsle bsle = new bsle(b3, j5.mo67751a());
        bsle.mo70685b(a10);
        bnic a11 = bsle.mo70680a();
        bnia j7 = bnic.m109500j();
        bnge bnge = bsle.f144911c;
        bnht a12 = !bnge.mo67314m() ? bngz.m109388a((Collection) bnge.mo67318q().entrySet()) : bnfb.f131552a;
        bnrd a13 = a11.iterator();
        while (a13.hasNext()) {
            bsjx bsjx = (bsjx) a13.next();
            bngm g = a12.mo67692g(bsjx);
            if (!g.isEmpty()) {
                bytw bytw6 = (bytw) bsko.f144884a.mo68167c(g);
                if (!bytw6.f167730d.isEmpty()) {
                    str3 = bytw6.f167730d;
                } else {
                    str3 = bytw6.f167728b;
                }
                str2 = boan.f132471e.mo68794a(bnzi.m110902d().mo68720a(str3).mo68740b());
            } else {
                str2 = str;
            }
            bsjw d2 = bsjx.m115872d();
            d2.mo70633a(bsjx.mo70637b());
            bslg bslg = new bslg(new bskr(b, str2));
            bslg.mo70686b(bsjx.mo70638c());
            d2.mo70635a(bslg.mo70680a());
            d2.mo70634a(str2);
            j7.mo67629b(d2.mo70632a());
        }
        bngx a14 = bnfi.m109235a(j7.mo67751a().mo67639g()).mo67503a(new trf(trs));
        bngs j8 = bngx.m109377j();
        bnre i19 = a14.listIterator();
        while (i19.hasNext()) {
            j8.mo67668c(new trr((bsjx) i19.next()));
        }
        trs.f46559e.mo2450b(tql.m37365a(j8.mo67664a()));
        bngx a15 = j2.mo67664a();
        bnio b5 = bniq.m109555b(trs.f46561g);
        bnre i20 = a15.listIterator();
        while (i20.hasNext()) {
            b5.mo67800d(m37400b((qun) i20.next(), bngx3));
        }
        trs.f46560f.mo2450b(tql.m37365a(b5.mo67751a().mo67639g()));
    }

    /* renamed from: a */
    public final void mo26748a(Exception exc) {
        this.f46559e.mo2450b(tql.m37364a(exc));
        this.f46560f.mo2450b(tql.m37364a(exc));
    }

    /* renamed from: a */
    public final void mo26749a(qun qun, bngx bngx) {
        bmxy.m108581a((tql) this.f46560f.mo2448b());
        bnio b = bniq.m109555b(this.f46561g);
        b.mo67798c((Iterable) ((tql) this.f46560f.mo2448b()).mo26735a());
        b.mo67800d(m37400b(qun, bngx));
        C0034at atVar = this.f46560f;
        atVar.mo2450b(tql.m37363a(((tql) atVar.mo2448b()).mo26737c(), b.mo67751a().mo67639g(), ((tql) this.f46560f.mo2448b()).mo26736b()));
    }

    /* renamed from: a */
    public final void mo26750a(boolean z) {
        if (z) {
            this.f46559e.mo2450b(tql.m37366d());
            this.f46560f.mo2450b(tql.m37366d());
        }
        mo26746a(this.f46556b.mo26694a(), z);
    }
}
