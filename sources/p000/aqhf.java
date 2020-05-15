package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableItem;
import com.google.android.gms.setupservices.item.GoogleServicesTextItem;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aqhf */
public final /* synthetic */ class aqhf implements aubg {

    /* renamed from: a */
    private final GoogleServicesChimeraActivity f86106a;

    /* renamed from: b */
    private final boolean f86107b;

    /* renamed from: c */
    private final ggp f86108c;

    public aqhf(GoogleServicesChimeraActivity googleServicesChimeraActivity, boolean z, ggp ggp) {
        this.f86106a = googleServicesChimeraActivity;
        this.f86107b = z;
        this.f86108c = ggp;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86106a;
        boolean z = this.f86107b;
        ggp ggp = this.f86108c;
        bsqw a = aqjw.m71745a(googleServicesChimeraActivity, (String) aucb.mo50386d(), z, aqjv.PHONE);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        bsqv bsqv = (bsqv) bxvd;
        bxvd da = bsry.f146810e.mo74144da();
        bxvd da2 = bsse.f146846h.mo74144da();
        aqkf aqkf = googleServicesChimeraActivity.f107627e;
        if (aqkf != null) {
            int i = aqkf.f86277f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsry bsry = (bsry) da.f164949b;
            int i2 = i - 1;
            if (i != 0) {
                bsry.f146814c = i2;
                bsry.f146812a |= 1;
            } else {
                throw null;
            }
        }
        String a2 = googleServicesChimeraActivity.f107626d.mo47928a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsry bsry2 = (bsry) da.f164949b;
        a2.getClass();
        bsry2.f146812a |= 2;
        bsry2.f146815d = a2;
        for (aqiv aqiv : googleServicesChimeraActivity.f107630h) {
            aqiz aqiz = aqiv.f86182g;
            if (aqiz != null && aqiz.mo47907bK()) {
                googleServicesChimeraActivity.getApplicationContext();
                aqju d = aqiv.f86182g.mo47909d();
                bsrw bsrw = d.f86238a;
                bxvd bxvd2 = (bxvd) bsrw.mo74142c(5);
                bxvd2.mo73625a((bxvk) bsrw);
                int i3 = aqiv.f86183h;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bsrw bsrw2 = (bsrw) bxvd2.f164949b;
                bsrw bsrw3 = bsrw.f146804d;
                bsrw2.f146807b = i3 - 1;
                bsrw2.f146806a |= 1;
                bsrw bsrw4 = (bsrw) bxvd2.mo74062i();
                bssd bssd = d.f86239b;
                bxvd bxvd3 = (bxvd) bssd.mo74142c(5);
                bxvd3.mo73625a((bxvk) bssd);
                bssc a3 = bssc.m116141a(aqiv.f86183h - 1);
                sdo.m34959a(a3);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bssd bssd2 = (bssd) bxvd3.f164949b;
                bssd bssd3 = bssd.f146839f;
                bssd2.f146842b = a3.f146838k;
                bssd2.f146841a |= 1;
                aqju aqju = new aqju(bsrw4, (bssd) bxvd3.mo74062i());
                bsrw bsrw5 = aqju.f86238a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsry bsry3 = (bsry) da.f164949b;
                bsrw5.getClass();
                if (!bsry3.f146813b.mo73666a()) {
                    bsry3.f146813b = bxvk.m124021a(bsry3.f146813b);
                }
                bsry3.f146813b.add(bsrw5);
                bssd bssd4 = aqju.f86239b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsse bsse = (bsse) da2.f164949b;
                bssd4.getClass();
                if (!bsse.f146849b.mo73666a()) {
                    bsse.f146849b = bxvk.m124021a(bsse.f146849b);
                }
                bsse.f146849b.add(bssd4);
                aqiv.mo47889a(bsqv);
            }
        }
        GoogleServicesTextItem googleServicesTextItem = (GoogleServicesTextItem) googleServicesChimeraActivity.f107632j.mo64921b((int) C0126R.C0129id.google_services_description);
        if (googleServicesTextItem != null && googleServicesTextItem.f151504f) {
            bssa bssa = googleServicesTextItem.mo58965a().f146843c;
            if (bssa == null) {
                bssa = bssa.f146821d;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsse bsse2 = (bsse) da2.f164949b;
            bssa.getClass();
            bsse2.f146850c = bssa;
            bsse2.f146848a |= 1;
        }
        GoogleServicesTextItem googleServicesTextItem2 = (GoogleServicesTextItem) googleServicesChimeraActivity.f107632j.mo64921b((int) C0126R.C0129id.google_services_tos);
        if (googleServicesTextItem2 != null && googleServicesTextItem2.f151504f) {
            bssa bssa2 = googleServicesTextItem2.mo58965a().f146843c;
            if (bssa2 == null) {
                bssa2 = bssa.f146821d;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsse bsse3 = (bsse) da2.f164949b;
            bssa2.getClass();
            bsse3.f146851d = bssa2;
            bsse3.f146848a |= 2;
        }
        GoogleServicesExpandableItem googleServicesExpandableItem = googleServicesChimeraActivity.f107634l;
        if (googleServicesExpandableItem != null && googleServicesExpandableItem.f151504f) {
            bssd bssd5 = googleServicesExpandableItem.mo47909d().f86239b;
            bssa bssa3 = bssd5.f146843c;
            if (bssa3 == null) {
                bssa3 = bssa.f146821d;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsse bsse4 = (bsse) da2.f164949b;
            bssa3.getClass();
            bsse4.f146852e = bssa3;
            bsse4.f146848a |= 4;
            bssa bssa4 = bssd5.f146844d;
            if (bssa4 == null) {
                bssa4 = bssa.f146821d;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsse bsse5 = (bsse) da2.f164949b;
            bssa4.getClass();
            bsse5.f146853f = bssa4;
            bsse5.f146848a |= 8;
            bssa bssa5 = bssd5.f146845e;
            if (bssa5 == null) {
                bssa5 = bssa.f146821d;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsse bsse6 = (bsse) da2.f164949b;
            bssa5.getClass();
            bsse6.f146854g = bssa5;
            bsse6.f146848a |= 16;
        }
        if (GoogleServicesChimeraActivity.f107625c.mo19637a(3)) {
            sek sek = GoogleServicesChimeraActivity.f107625c;
            String valueOf = String.valueOf(bsqv);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Audit record=");
            sb.append(valueOf);
            sek.mo25412b(sb.toString(), new Object[0]);
            sek sek2 = GoogleServicesChimeraActivity.f107625c;
            int length = ((bsqw) bsqv.mo74062i()).mo73642k().length;
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("Length=");
            sb2.append(length);
            sek2.mo25412b(sb2.toString(), new Object[0]);
        }
        bsrf bsrf = ((bsqw) bsqv.f164949b).f146701e;
        if (bsrf == null) {
            bsrf = bsrf.f146744d;
        }
        bsrg bsrg = bsrf.f146748c;
        if (bsrg == null) {
            bsrg = bsrg.f146749m;
        }
        bxvd bxvd4 = (bxvd) bsrg.mo74142c(5);
        bxvd4.mo73625a((bxvk) bsrg);
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bsrg bsrg2 = (bsrg) bxvd4.f164949b;
        bsry bsry4 = (bsry) da.mo74062i();
        bsry4.getClass();
        bsrg2.f146760j = bsry4;
        bsrg2.f146751a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        bsrg bsrg3 = (bsrg) bxvd4.mo74062i();
        bsrf bsrf2 = ((bsqw) bsqv.f164949b).f146701e;
        if (bsrf2 == null) {
            bsrf2 = bsrf.f146744d;
        }
        bxvd bxvd5 = (bxvd) bsrf2.mo74142c(5);
        bxvd5.mo73625a((bxvk) bsrf2);
        if (bxvd5.f164950c) {
            bxvd5.mo74035c();
            bxvd5.f164950c = false;
        }
        bsrf bsrf3 = (bsrf) bxvd5.f164949b;
        bsrg3.getClass();
        bsrf3.f146748c = bsrg3;
        bsrf3.f146746a |= 2;
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw = (bsqw) bsqv.f164949b;
        bsrf bsrf4 = (bsrf) bxvd5.mo74062i();
        bsqw bsqw2 = bsqw.f146695g;
        bsrf4.getClass();
        bsqw.f146701e = bsrf4;
        bsqw.f146697a |= 4;
        bssm bssm = ((bsqw) bsqv.f164949b).f146702f;
        if (bssm == null) {
            bssm = bssm.f146877d;
        }
        bssi bssi = bssm.f146881c;
        if (bssi == null) {
            bssi = bssi.f146862i;
        }
        bxvd bxvd6 = (bxvd) bssi.mo74142c(5);
        bxvd6.mo73625a((bxvk) bssi);
        if (bxvd6.f164950c) {
            bxvd6.mo74035c();
            bxvd6.f164950c = false;
        }
        bssi bssi2 = (bssi) bxvd6.f164949b;
        bsse bsse7 = (bsse) da2.mo74062i();
        bsse7.getClass();
        bssi2.f146871h = bsse7;
        bssi2.f146864a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        bssi bssi3 = (bssi) bxvd6.mo74062i();
        bssm bssm2 = ((bsqw) bsqv.f164949b).f146702f;
        if (bssm2 == null) {
            bssm2 = bssm.f146877d;
        }
        bxvd bxvd7 = (bxvd) bssm2.mo74142c(5);
        bxvd7.mo73625a((bxvk) bssm2);
        if (bxvd7.f164950c) {
            bxvd7.mo74035c();
            bxvd7.f164950c = false;
        }
        bssm bssm3 = (bssm) bxvd7.f164949b;
        bssi3.getClass();
        bssm3.f146881c = bssi3;
        bssm3.f146879a |= 8;
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw3 = (bsqw) bsqv.f164949b;
        bssm bssm4 = (bssm) bxvd7.mo74062i();
        bssm4.getClass();
        bsqw3.f146702f = bssm4;
        bsqw3.f146697a |= 8;
        ggp.mo11800a(((bsqw) bsqv.mo74062i()).mo73642k());
        return aqjw.m71744a(googleServicesChimeraActivity.getApplicationContext(), ggp, googleServicesChimeraActivity.f107633k);
    }
}
