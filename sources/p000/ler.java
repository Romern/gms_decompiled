package p000;

import android.content.Context;
import android.os.Build;
import android.service.autofill.SaveInfo;
import android.view.autofill.AutofillId;
import android.view.inputmethod.InlineSuggestionsRequest;
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
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/* renamed from: ler */
final /* synthetic */ class ler implements bqeg {

    /* renamed from: a */
    private final les f25896a;

    /* renamed from: b */
    private final bqgg f25897b;

    /* renamed from: c */
    private final bqgj f25898c;

    /* renamed from: d */
    private final leh f25899d;

    /* renamed from: e */
    private final kjs f25900e;

    /* renamed from: f */
    private final kjp f25901f;

    /* renamed from: g */
    private final FillForm f25902g;

    /* renamed from: h */
    private final bqgg f25903h;

    /* renamed from: i */
    private final kck f25904i;

    /* renamed from: j */
    private final kca f25905j;

    public ler(les les, bqgg bqgg, bqgj bqgj, leh leh, kjs kjs, kjp kjp, FillForm fillForm, bqgg bqgg2, kck kck, kca kca) {
        this.f25896a = les;
        this.f25897b = bqgg;
        this.f25898c = bqgj;
        this.f25899d = leh;
        this.f25900e = kjs;
        this.f25901f = kjp;
        this.f25902g = fillForm;
        this.f25903h = bqgg2;
        this.f25904i = kck;
        this.f25905j = kca;
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
        bngx bngx;
        lbf lbf;
        boolean z;
        boolean z2;
        boolean z3;
        laz laz;
        kcv kcv;
        les les = this.f25896a;
        bqgg bqgg = this.f25897b;
        bqgj bqgj = this.f25898c;
        leh leh = this.f25899d;
        kjs kjs = this.f25900e;
        kjp kjp = this.f25901f;
        FillForm fillForm = this.f25902g;
        bqgg bqgg2 = this.f25903h;
        kck kck = this.f25904i;
        kca kca = this.f25905j;
        try {
            bmvz = (bmxv) bqgg.get();
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) les.f25906a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("les", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SaveInfoFactory failed to execute.");
            bmvz = bmvz.f131120a;
        }
        bmxv c = bmxv.m108567c(kjp);
        try {
            kqm a = les.f25910e.mo14815a(kql.m18342a(fillForm, kck, ((kek) bqga.m112780a((Future) bqgg2)).f23936a, (MetricsContext) les.f25915j.mo66815c(), leh.f25875e));
            FillForm fillForm2 = fillForm;
            kca kca2 = kca;
            kck kck2 = kck;
            bngx a2 = les.f25913h.mo15054a(new lgc(leh, kjs, fillForm, a, les.f25915j));
            if (!leh.f25875e.mo66813a() || a.mo14790a().size() + a2.size() <= ((InlineSuggestionsRequest) leh.f25875e.mo66814b()).getMaxSuggestionCount()) {
                bngx = a2;
            } else {
                bngx = bngx.m109355a(bnjd.m109594d(a2, (int) ccjm.m130120c()));
            }
            bnhe a3 = a.mo14790a();
            bnhe b = a.mo14791b();
            bngs b2 = bngx.m109371b(a3.size());
            bnrd a4 = a3.keySet().iterator();
            while (a4.hasNext()) {
                kct kct = (kct) a4.next();
                kbz kbz = (kbz) a3.get(kct);
                bnic bnic = (bnic) b.get(kct);
                if (kbz != null && bnic != null) {
                    bxvd da = lba.f25675f.mo74144da();
                    laz a5 = kwv.m18701a(kct.mo14368a());
                    bnhe bnhe = a3;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bnhe bnhe2 = b;
                    ((lba) da.f164949b).f25678b = a5.mo3214a();
                    da.mo73933A((Iterable) bnic.stream().map(leq.f25895a).collect(Collectors.toList()));
                    try {
                        int parseInt = Integer.parseInt(kbz.f23733b);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((lba) da.f164949b).f25677a = parseInt;
                    } catch (NumberFormatException e2) {
                        bnsl bnsl2 = (bnsl) les.f25906a.mo68388c();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("les", "a", 612, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
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
                    if (kct.mo14368a() instanceof kdb) {
                        kdb kdb = (kdb) kct.mo14368a();
                        if (kdb.f23850e.mo66813a() && !((String) kdb.f23850e.mo66814b()).isEmpty()) {
                            bxvd da2 = lbg.f25722a.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((lbg) da2.f164949b).f25724b = true;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            lbg lbg = (lbg) da2.mo74062i();
                            lbg.getClass();
                            ((lba) da.f164949b).f25681e = lbg;
                        }
                    }
                    b2.mo67668c((lba) da.mo74062i());
                    a3 = bnhe;
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
            bngx a6 = b2.mo67664a();
            FillForm fillForm3 = null;
            if (c.mo66813a()) {
                lbf = kwv.m18704a((kjp) c.mo66814b());
            } else {
                lbf = null;
            }
            if (les.f25915j.mo66813a()) {
                MetricsContext metricsContext = (MetricsContext) les.f25915j.mo66814b();
                if (!bmvz.mo66813a() || !((lcg) bmvz.mo66814b()).f25783a.mo66813a()) {
                    laz = null;
                } else {
                    laz = ((lcg) bmvz.mo66814b()).f25784b;
                }
                metricsContext.mo7955a(new MetricsContext.FillContext(lbf, a6, laz, false));
            }
            if (les.f25909d.mo15089i() && bmvz.mo66813a() && ((lcg) bmvz.mo66814b()).f25783a.mo66813a()) {
                kwe.m18646a((Context) null).mo14890b(((lcg) bmvz.mo66814b()).f25784b.mo3214a());
            }
            if (lbf != null) {
                bngx a7 = bngx.m109368a((Collection) bngx.stream().map(lel.f25890a).collect(Collectors.toList()));
                bxvd da3 = lai.f25545e.mo74144da();
                da3.mo74123z(a6);
                da3.mo74121y(a7);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                lbf.getClass();
                ((lai) da3.f164949b).f25548b = lbf;
                if (les.f25915j.mo66813a()) {
                    MetricsContext metricsContext2 = (MetricsContext) les.f25915j.mo66814b();
                    bxvd da4 = kzz.f25505d.mo74144da();
                    int a8 = metricsContext2.mo7953a();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    ((kzz) da4.f164949b).f25507a = a8;
                    kzx b3 = metricsContext2.mo7956b();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    b3.getClass();
                    ((kzz) da4.f164949b).f25508b = b3;
                    lbh c2 = metricsContext2.mo7957c();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    c2.getClass();
                    ((kzz) da4.f164949b).f25509c = c2;
                    kzz kzz = (kzz) da4.mo74062i();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    kzz.getClass();
                    ((lai) da3.f164949b).f25547a = kzz;
                }
                kwu kwu = les.f25911f;
                da3.getClass();
                kwu.mo14909j(new lep(da3));
            }
            List list = (List) kjs.f24277b.stream().map(new lem(leh)).collect(Collectors.toList());
            if (c.mo66813a()) {
                fillForm3 = kqj.m18328a((kjp) c.mo66814b(), bmxv.m108566b(kck2), leh.f25874d);
            }
            AbstractDetectionHistory$DetectionResult a9 = AbstractDetectionHistory$DetectionResult.m7160a(fillForm3, list);
            bngx a10 = bngx.m109368a((Collection) bngx.stream().map(len.f25892a).collect(Collectors.toList()));
            bnpd a11 = bnpf.m110046a((Set) kjs.f24278c, (Set) kjs.f24279d);
            ClientState clientState = leh.f25873c;
            bnrd a12 = a.mo14790a().values().iterator();
            while (a12.hasNext()) {
                kca2.mo14361a(((kbz) a12.next()).f23732a);
            }
            bnre i2 = a10.listIterator();
            while (i2.hasNext()) {
                kca2.mo14361a(((kbz) i2.next()).f23732a);
            }
            ArrayList arrayList = new ArrayList();
            FillForm fillForm4 = fillForm2;
            bnre i3 = fillForm4.f11641a.listIterator();
            while (i3.hasNext()) {
                arrayList.add(((FillField) i3.next()).f11631a);
            }
            if (!a11.isEmpty()) {
                List list2 = (List) a11.stream().map(leo.f25893a).collect(Collectors.toList());
                arrayList.addAll(list2);
                kca2.mo14364a((AutofillId[]) list2.toArray(new AutofillId[0]));
            }
            ClientState a13 = ClientState.m7165a();
            a13.f11671c.mo7980a(clientState.f11671c.mo7979a());
            a13.f11671c.mo7981a(a9);
            a13.f11672d = les.f25914i;
            a13.f11673e = (MetricsContext) les.f25915j.mo66815c();
            if (bmvz.mo66813a() && ((lcg) bmvz.mo66814b()).f25783a.mo66813a()) {
                lcg lcg = (lcg) bmvz.mo66814b();
                kca2.mo14362a((SaveInfo) lcg.f25783a.mo66814b());
                if (lcg.f25785c.mo66813a()) {
                    a13.f11669a = (byte[]) lcg.f25785c.mo66814b();
                }
                if (lcg.f25786d.mo66813a()) {
                    a13.f11670b = (PaymentsUtils$CardNetwork[]) ((List) lcg.f25786d.mo66814b()).toArray(new PaymentsUtils$CardNetwork[0]);
                }
            }
            kca2.mo14360a(a13.mo7976b());
            int i4 = Build.VERSION.SDK_INT;
            kca2.mo14365b();
            if (ccjc.m130016b()) {
                kca2.mo14363a(arrayList);
            }
            bmxv c3 = bmxv.m108567c(kca2.mo14359a());
            if (!c3.mo66813a() || !bmvz.mo66813a() || !((lcg) bmvz.mo66814b()).f25783a.mo66813a()) {
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
            return bqga.m112775a(new lei(c3, true, z, z2, z3, les.m18992a(fillForm4, kck2)));
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof kep) || ((kep) cause).f23945a != 2) {
                bnsl bnsl3 = (bnsl) les.f25906a.mo68388c();
                bnsl3.mo68437a(e3);
                bnsl3.mo68432a("les", "a", 383, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68448m();
                return bqga.m112777a((Throwable) e3);
            }
            les.f25909d.mo15101a(kdi.f23885a);
            return les.f25912g.mo15036a(bqgj, leh);
        }
    }
}
