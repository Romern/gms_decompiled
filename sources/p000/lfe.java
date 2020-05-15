package p000;

import android.accounts.Account;
import android.content.Context;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.data.Credential;
import java.util.Map;

/* renamed from: lfe */
final /* synthetic */ class lfe implements bqeh {

    /* renamed from: a */
    private final lfm f25954a;

    /* renamed from: b */
    private final boolean f25955b;

    /* renamed from: c */
    private final kck f25956c;

    /* renamed from: d */
    private final bqgj f25957d;

    /* renamed from: e */
    private final leh f25958e;

    /* renamed from: f */
    private final boolean f25959f;

    /* renamed from: g */
    private final String f25960g;

    public lfe(lfm lfm, boolean z, kck kck, bqgj bqgj, leh leh, boolean z2, String str) {
        this.f25954a = lfm;
        this.f25955b = z;
        this.f25956c = kck;
        this.f25957d = bqgj;
        this.f25958e = leh;
        this.f25959f = z2;
        this.f25960g = str;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        lfl lfl;
        kjs kjs;
        bqgj bqgj;
        lfl lfl2;
        String str;
        boolean z;
        String str2;
        kpb kpb;
        kjp kjp;
        int i;
        bqgg bqgg;
        bqgg bqgg2;
        bnon bnon;
        lfl lfl3;
        kjs kjs2;
        kpb kpb2;
        String str3;
        boolean z2;
        String str4;
        kjp kjp2;
        bqgg bqgg3;
        lfm lfm = this.f25954a;
        boolean z3 = this.f25955b;
        kck kck = this.f25956c;
        bqgj bqgj2 = this.f25957d;
        leh leh = this.f25958e;
        boolean z4 = this.f25959f;
        String str5 = this.f25960g;
        kjs kjs3 = (kjs) obj;
        kjp a = kph.m18285a(kjs3.f24276a);
        if (a == null) {
            return bqga.m112775a(lei.f25877b);
        }
        if (lfm.f25985c.mo15089i()) {
            kwe.m18646a((Context) null).mo14888a(a);
        }
        String str6 = a.f24264a.f23841b;
        bmxv k = lfm.f25985c.mo15091k();
        if (k.mo66813a() && str6.equals(k.mo66814b())) {
            return bqga.m112775a(lei.f25877b);
        }
        if (z3 && ccjv.m130168d()) {
            kjl kjl = (kjl) a.f24266c.mo66815c();
            if (kjl != null) {
                AutofillId autofillId = (AutofillId) kjl.mo14516a().f24609h;
                bnre i2 = a.f24265b.listIterator();
                boolean z5 = false;
                boolean z6 = false;
                while (i2.hasNext()) {
                    kjl kjl2 = (kjl) i2.next();
                    if (kjl2.mo14530a(kpb.PASSWORD)) {
                        z5 = true;
                    } else if (kjl2.mo14530a(kpb.USERNAME)) {
                        z6 = true;
                    }
                }
                lfl = ((kjl.mo14530a(kpb.USERNAME) && z5) || (kjl.mo14530a(kpb.PASSWORD) && z6)) ? lfl.m19016a(autofillId, bmxv.m108566b(kpb.USERNAME)) : kjl.mo14530a(kpb.PAYMENT_CARD_NUMBER) ? lfl.m19016a(autofillId, bmxv.m108566b(kpb.PAYMENT_CARD_NUMBER)) : lfl.m19016a(autofillId, bmvz.f131120a);
            } else {
                lfl = null;
            }
        } else {
            bnre i3 = a.f24265b.listIterator();
            AutofillId autofillId2 = null;
            AutofillId autofillId3 = null;
            boolean z7 = false;
            while (i3.hasNext()) {
                kjl kjl3 = (kjl) i3.next();
                if (autofillId2 == null && kjl3.mo14530a(kpb.USERNAME)) {
                    autofillId2 = (AutofillId) kjl3.mo14516a().f24609h;
                } else if (autofillId3 == null && kjl3.mo14530a(kpb.PAYMENT_CARD_NUMBER)) {
                    autofillId3 = (AutofillId) kjl3.mo14516a().f24609h;
                } else if (kjl3.mo14530a(kpb.PASSWORD)) {
                    z7 = true;
                }
            }
            lfl = (autofillId2 == null || !z7) ? autofillId3 != null ? lfl.m19016a(autofillId3, bmxv.m108566b(kpb.PAYMENT_CARD_NUMBER)) : null : lfl.m19016a(autofillId2, bmxv.m108566b(kpb.USERNAME));
        }
        if (lfl == null) {
            return bqga.m112775a(lei.f25877b);
        }
        kpb kpb3 = (kpb) ((leg) lfl).f25870b.mo66815c();
        if (!kpb.USERNAME.equals(kpb3)) {
            if (!kpb.PAYMENT_CARD_NUMBER.equals(kpb3)) {
                lfl3 = lfl;
                kjs2 = kjs3;
                kpb2 = kpb3;
                str3 = str6;
                z2 = z4;
                str4 = str5;
                kjp2 = a;
            } else if (!ccjv.m130166b()) {
                lfl3 = lfl;
                kjs2 = kjs3;
                kpb2 = kpb3;
                str3 = str6;
                z2 = z4;
                str4 = str5;
                kjp2 = a;
            } else {
                if (lfm.f25990h.isEmpty()) {
                    bqgg3 = bqga.m112775a(bmvz.f131120a);
                    lfl2 = lfl;
                    kjs = kjs3;
                    kpb = kpb3;
                    str2 = str6;
                    z = z4;
                    str = str5;
                    kjp = a;
                } else {
                    kjs = kjs3;
                    str = str5;
                    lfl2 = lfl;
                    bnha bnha = new bnha();
                    kpb = kpb3;
                    str2 = str6;
                    z = z4;
                    kjp = a;
                    kej kej = new kej(new kel(bqgj2, kck, bmvz.f131120a, bnon.f131923a, new byte[0], bmvz.f131120a), bnic.m109489a(kdb.class));
                    bnrd a2 = lfm.f25990h.entrySet().iterator();
                    while (a2.hasNext()) {
                        Map.Entry entry = (Map.Entry) a2.next();
                        bnha.mo67695b((Account) entry.getKey(), ((khd) entry.getValue()).mo14429a(kej));
                    }
                    bnhe b = bnha.mo67618b();
                    bqgg3 = bqga.m112782b(b.values()).mo69214a(new lfi(b), bqfb.INSTANCE);
                }
                bqgg = bqgg3;
                bqgj = bqgj2;
                i = 4;
            }
            bqgg = bqga.m112775a(bmvz.f131120a);
            bqgj = bqgj2;
            i = 2;
        } else {
            lfl2 = lfl;
            kjs = kjs3;
            kpb = kpb3;
            str2 = str6;
            z = z4;
            str = str5;
            kjp = a;
            kcv kcv = kjp.f24264a;
            if (lfm.f25989g.isEmpty()) {
                bqgg2 = bqga.m112775a(bmvz.f131120a);
                bqgj = bqgj2;
            } else {
                if (!kcv.equals(kck)) {
                    bnon = bnic.m109489a(kcv);
                } else {
                    bnon = bnon.f131923a;
                }
                bnha bnha2 = new bnha();
                bqgj = bqgj2;
                kej kej2 = new kej(new kel(bqgj2, kck, bmvz.f131120a, bnon, new byte[0], bmvz.f131120a), bnic.m109489a(Credential.class));
                bnrd a3 = lfm.f25989g.entrySet().iterator();
                while (a3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) a3.next();
                    bnha2.mo67695b((Account) entry2.getKey(), ((kfx) entry2.getValue()).mo14429a(kej2));
                }
                bnhe b2 = bnha2.mo67618b();
                bqgg2 = bqga.m112782b(b2.values()).mo69214a(new lfh(b2, kcv), bqfb.INSTANCE);
            }
            bqgg = bqgg2;
            i = 3;
        }
        return bqdx.m112674a(bqgg, new lfj(lfm, z3, i, kjp, kck, leh, kjs, z, lfl2, kpb, str2, str, bqgj), bqfb.INSTANCE);
    }
}
