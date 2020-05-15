package p000;

import android.content.Context;
import android.os.Build;
import android.service.autofill.SaveInfo;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult;
import com.google.android.gms.autofill.service.common.ClientState;
import com.google.android.gms.autofill.util.PaymentsUtils$CardNetwork;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/* renamed from: lfc */
final /* synthetic */ class lfc implements bqeg {

    /* renamed from: a */
    private final lfd f25933a;

    /* renamed from: b */
    private final bqgg f25934b;

    /* renamed from: c */
    private final leh f25935c;

    /* renamed from: d */
    private final kjs f25936d;

    /* renamed from: e */
    private final kjp f25937e;

    /* renamed from: f */
    private final FillForm f25938f;

    /* renamed from: g */
    private final bqgg f25939g;

    /* renamed from: h */
    private final kck f25940h;

    /* renamed from: i */
    private final kca f25941i;

    public lfc(lfd lfd, bqgg bqgg, leh leh, kjs kjs, kjp kjp, FillForm fillForm, bqgg bqgg2, kck kck, kca kca) {
        this.f25933a = lfd;
        this.f25934b = bqgg;
        this.f25935c = leh;
        this.f25936d = kjs;
        this.f25937e = kjp;
        this.f25938f = fillForm;
        this.f25939g = bqgg2;
        this.f25940h = kck;
        this.f25941i = kca;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnpf.a(java.util.Set, java.util.Set):bnpd
     arg types: [bnic, bnic]
     candidates:
      bnpf.a(java.lang.Enum, java.lang.Enum[]):bnic
      bnpf.a(java.util.Set, java.lang.Object):boolean
      bnpf.a(java.util.Set, java.util.Collection):boolean
      bnpf.a(java.util.Set, java.util.Iterator):boolean
      bnpf.a(java.util.Set, java.util.Set):bnpd */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bmvz bmvz;
        kck kck;
        FillForm fillForm;
        kca kca;
        bngx bngx;
        bngx bngx2;
        boolean z;
        boolean z2;
        boolean z3;
        laz laz;
        kcv kcv;
        lfd lfd = this.f25933a;
        bqgg bqgg = this.f25934b;
        leh leh = this.f25935c;
        kjs kjs = this.f25936d;
        kjp kjp = this.f25937e;
        FillForm fillForm2 = this.f25938f;
        bqgg bqgg2 = this.f25939g;
        kck kck2 = this.f25940h;
        kca kca2 = this.f25941i;
        try {
            bmvz = (bmxv) bqgg.get();
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) lfd.f25942a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lfd", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SaveInfoFactory failed to execute.");
            bmvz = bmvz.f131120a;
        }
        bnic bnic = (bnic) bqgg2.get();
        boolean isEmpty = bnic.isEmpty();
        bmvz bmvz2 = bmvz.mo66813a() ? ((lcg) bmvz.mo66814b()).f25783a : bmvz.f131120a;
        if (isEmpty && !bmvz2.mo66813a()) {
            return bqga.m112775a(lei.f25877b);
        }
        kqm a = lfd.f25947f.mo14815a(kql.m18341a(fillForm2, kck2, bnic, (MetricsContext) lfd.f25950i.mo66815c()));
        if (isEmpty) {
            bngx = bngx.m109376e();
            kck = kck2;
            fillForm = fillForm2;
            kca = kca2;
        } else {
            fillForm = fillForm2;
            kca = kca2;
            kck = kck2;
            bngx = lfd.f25951j.mo15054a(new lgc(leh, kjs, fillForm2, a, lfd.f25950i));
        }
        if (!isEmpty) {
            bnhe a2 = a.mo14790a();
            bnhe b = a.mo14791b();
            bngs b2 = bngx.m109371b(a2.size());
            bnrd a3 = a2.keySet().iterator();
            while (a3.hasNext()) {
                kct kct = (kct) a3.next();
                kbz kbz = (kbz) a2.get(kct);
                bnic bnic2 = (bnic) b.get(kct);
                if (kbz != null && bnic2 != null) {
                    bxvd da = lba.f25675f.mo74144da();
                    laz a4 = kwv.m18701a(kct.mo14368a());
                    bnhe bnhe = a2;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bnhe bnhe2 = b;
                    ((lba) da.f164949b).f25678b = a4.mo3214a();
                    da.mo73933A((Iterable) bnic2.stream().map(lfa.f25931a).collect(Collectors.toList()));
                    try {
                        int parseInt = Integer.parseInt(kbz.f23733b);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((lba) da.f164949b).f25677a = parseInt;
                    } catch (NumberFormatException e2) {
                        bnsl bnsl2 = (bnsl) lfd.f25942a.mo68388c();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("lfd", "a", 600, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Failed to convert dataset id to integer");
                    }
                    if ((kct.mo14368a() instanceof Credential) && (kcv = ((Credential) kct.mo14368a()).f11610c) != null) {
                        String str = kcv.f23841b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        str.getClass();
                        ((lba) da.f164949b).f25680d = str;
                    }
                    b2.mo67668c((lba) da.mo74062i());
                    a2 = bnhe;
                    b = bnhe2;
                }
            }
            bnre i = bngx.listIterator();
            while (i.hasNext()) {
                lgb lgb = (lgb) i.next();
                if (lgb.f26024c.mo66813a()) {
                    b2.mo67668c((lba) lgb.f26024c.mo66814b());
                }
            }
            bngx2 = b2.mo67664a();
        } else {
            bngx2 = bngx.m109376e();
        }
        lbf a5 = kwv.m18704a(kjp);
        if (lfd.f25950i.mo66813a()) {
            MetricsContext metricsContext = (MetricsContext) lfd.f25950i.mo66814b();
            if (bmvz2.mo66813a()) {
                laz = ((lcg) bmvz.mo66814b()).f25784b;
            } else {
                laz = null;
            }
            metricsContext.mo7955a(new MetricsContext.FillContext(a5, bngx2, laz, false));
        }
        if (lfd.f25946e.mo15089i() && bmvz2.mo66813a()) {
            kwe.m18646a((Context) null).mo14890b(((lcg) bmvz.mo66814b()).f25784b.mo3214a());
        }
        if (a5 != null) {
            bngx a6 = bngx.m109368a((Collection) bngx.stream().map(lev.f25926a).collect(Collectors.toList()));
            bxvd da2 = lai.f25545e.mo74144da();
            da2.mo74123z(bngx2);
            da2.mo74121y(a6);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a5.getClass();
            ((lai) da2.f164949b).f25548b = a5;
            if (lfd.f25950i.mo66813a()) {
                MetricsContext metricsContext2 = (MetricsContext) lfd.f25950i.mo66814b();
                bxvd da3 = kzz.f25505d.mo74144da();
                int a7 = metricsContext2.mo7953a();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((kzz) da3.f164949b).f25507a = a7;
                kzx b3 = metricsContext2.mo7956b();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                b3.getClass();
                ((kzz) da3.f164949b).f25508b = b3;
                lbh c = metricsContext2.mo7957c();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                c.getClass();
                ((kzz) da3.f164949b).f25509c = c;
                kzz kzz = (kzz) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                kzz.getClass();
                ((lai) da2.f164949b).f25547a = kzz;
            }
            kwu kwu = lfd.f25948g;
            da2.getClass();
            kwu.mo14909j(new lez(da2));
        }
        AbstractDetectionHistory$DetectionResult a8 = AbstractDetectionHistory$DetectionResult.m7160a(kqj.m18328a(kjp, bmxv.m108566b(kck), leh.f25874d), (List) kjs.f24277b.stream().map(new lew(leh)).collect(Collectors.toList()));
        bngx a9 = bngx.m109368a((Collection) bngx.stream().map(lex.f25928a).collect(Collectors.toList()));
        bnpd a10 = bnpf.m110046a((Set) kjs.f24278c, (Set) kjs.f24279d);
        ClientState clientState = leh.f25873c;
        bnrd a11 = a.mo14790a().values().iterator();
        while (a11.hasNext()) {
            kca.mo14361a(((kbz) a11.next()).f23732a);
        }
        bnre i2 = a9.listIterator();
        while (i2.hasNext()) {
            kca.mo14361a(((kbz) i2.next()).f23732a);
        }
        ArrayList arrayList = new ArrayList();
        FillForm fillForm3 = fillForm;
        bnre i3 = fillForm3.f11641a.listIterator();
        while (i3.hasNext()) {
            arrayList.add(((FillField) i3.next()).f11631a);
        }
        if (!a10.isEmpty()) {
            List list = (List) a10.stream().map(ley.f25929a).collect(Collectors.toList());
            arrayList.addAll(list);
            kca.mo14364a((AutofillId[]) list.toArray(new AutofillId[0]));
        }
        ClientState a12 = ClientState.m7165a();
        a12.f11671c.mo7980a(clientState.f11671c.mo7979a());
        a12.f11671c.mo7981a(a8);
        a12.f11672d = lfd.f25949h;
        a12.f11673e = (MetricsContext) lfd.f25950i.mo66815c();
        if (bmvz.mo66813a() && ((lcg) bmvz.mo66814b()).f25783a.mo66813a()) {
            lcg lcg = (lcg) bmvz.mo66814b();
            kca.mo14362a((SaveInfo) lcg.f25783a.mo66814b());
            if (lcg.f25785c.mo66813a()) {
                a12.f11669a = (byte[]) lcg.f25785c.mo66814b();
            }
            if (lcg.f25786d.mo66813a()) {
                a12.f11670b = (PaymentsUtils$CardNetwork[]) ((List) lcg.f25786d.mo66814b()).toArray(new PaymentsUtils$CardNetwork[0]);
            }
        }
        kca.mo14360a(a12.mo7976b());
        int i4 = Build.VERSION.SDK_INT;
        kca.mo14365b();
        if (ccjc.m130016b()) {
            kca.mo14363a(arrayList);
        }
        bmxv c2 = bmxv.m108567c(kca.mo14359a());
        if (!c2.mo66813a() || !bmvz2.mo66813a()) {
            z = false;
        } else {
            z = true;
        }
        if (!bmvz.mo66813a() || !((lcg) bmvz.mo66814b()).f25787e) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!bmvz.mo66813a() || !((lcg) bmvz.mo66814b()).f25788f) {
            z3 = false;
        } else {
            z3 = true;
        }
        return bqga.m112775a(new lei(c2, true, z, z2, z3, lfd.m19004a(fillForm3, kck)));
    }
}
