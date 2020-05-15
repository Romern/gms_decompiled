package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.service.autofill.SaveInfo;
import android.view.autofill.AutofillId;
import android.view.inputmethod.InlineSuggestionsRequest;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
import com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult;
import com.google.android.gms.autofill.service.common.ClientState;
import com.google.android.gms.autofill.service.common.ImmutableDetectionHistory;
import com.google.android.gms.autofill.util.PaymentsUtils$CardNetwork;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/* renamed from: les */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class les implements lej {

    /* renamed from: a */
    public static final srn f25906a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public final bngm f25907b;

    /* renamed from: c */
    public final keo f25908c;

    /* renamed from: d */
    public final lho f25909d;

    /* renamed from: e */
    public final kqn f25910e;

    /* renamed from: f */
    public final kwu f25911f;

    /* renamed from: g */
    public final lej f25912g;

    /* renamed from: h */
    public final lgd f25913h;

    /* renamed from: i */
    public final UserFieldTypeManager f25914i;

    /* renamed from: j */
    public final bmxv f25915j;

    /* renamed from: k */
    private final kju f25916k;

    /* renamed from: l */
    private final lch f25917l;

    /* renamed from: m */
    private final kpk f25918m;

    public les(kju kju, bngm bngm, keo keo, lch lch, lho lho, kqn kqn, kwu kwu, lej lej, kpk kpk, lgd lgd, UserFieldTypeManager userFieldTypeManager, bmxv bmxv) {
        this.f25916k = kju;
        this.f25907b = bngm;
        this.f25908c = keo;
        this.f25917l = lch;
        this.f25909d = lho;
        this.f25910e = kqn;
        this.f25911f = kwu;
        this.f25912g = lej;
        this.f25918m = kpk;
        this.f25913h = lgd;
        this.f25914i = userFieldTypeManager;
        this.f25915j = bmxv;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0014  */
    /* renamed from: a */
    public static bmxv m18992a(FillForm fillForm, kck kck) {
        if (!fillForm.f11643c.equals(kck)) {
            bnre i = fillForm.f11641a.listIterator();
            while (i.hasNext()) {
                FillField fillField = (FillField) i.next();
                if (fillField.mo7943a(kpb.USERNAME) || fillField.mo7943a(kpb.PASSWORD)) {
                    return bmxv.m108566b(fillForm.f11643c);
                }
                while (i.hasNext()) {
                }
            }
        }
        return bmvz.f131120a;
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
    private final bqgg m18993a(bqgj bqgj, leh leh, kjs kjs, bmxv bmxv, FillForm fillForm, bqgg bqgg, bmxv bmxv2, kck kck, kca kca) {
        lbf lbf;
        boolean z;
        boolean z2;
        laz laz;
        leh leh2 = leh;
        kjs kjs2 = kjs;
        FillForm fillForm2 = fillForm;
        kck kck2 = kck;
        kca kca2 = kca;
        try {
            kqm a = this.f25910e.mo14815a(kql.m18342a(fillForm2, kck2, ((kek) bqga.m112780a((Future) bqgg)).f23936a, (MetricsContext) this.f25915j.mo66815c(), leh2.f25875e));
            bngx a2 = this.f25913h.mo15054a(new lgc(leh, kjs, fillForm, a, this.f25915j));
            if (leh2.f25875e.mo66813a() && a.mo14790a().size() + a2.size() > ((InlineSuggestionsRequest) leh2.f25875e.mo66814b()).getMaxSuggestionCount()) {
                a2 = bngx.m109355a(bnjd.m109594d(a2, (int) ccjm.m130120c()));
            }
            bnhe a3 = a.mo14790a();
            bnhe b = a.mo14791b();
            bngs b2 = bngx.m109371b(a3.size());
            bnrd a4 = a3.keySet().iterator();
            while (a4.hasNext()) {
                kct kct = (kct) a4.next();
                kbz kbz = (kbz) a3.get(kct);
                bnic bnic = (bnic) b.get(kct);
                if (!(kbz == null || bnic == null)) {
                    b2.mo67668c(m18994a(kct, kbz, bnic));
                }
            }
            bnre i = a2.listIterator();
            while (i.hasNext()) {
                lgb lgb = (lgb) i.next();
                if (lgb.f26024c.mo66813a()) {
                    b2.mo67668c((lba) lgb.f26024c.mo66814b());
                }
            }
            bngx a5 = b2.mo67664a();
            FillForm fillForm3 = null;
            if (bmxv.mo66813a()) {
                lbf = kwv.m18704a((kjp) bmxv.mo66814b());
            } else {
                lbf = null;
            }
            boolean z3 = false;
            if (this.f25915j.mo66813a()) {
                MetricsContext metricsContext = (MetricsContext) this.f25915j.mo66814b();
                if (!bmxv2.mo66813a() || !((lcg) bmxv2.mo66814b()).f25783a.mo66813a()) {
                    laz = null;
                } else {
                    laz = ((lcg) bmxv2.mo66814b()).f25784b;
                }
                metricsContext.mo7955a(new MetricsContext.FillContext(lbf, a5, laz, false));
            }
            if (this.f25909d.mo15089i() && bmxv2.mo66813a() && ((lcg) bmxv2.mo66814b()).f25783a.mo66813a()) {
                kwe.m18646a((Context) null).mo14890b(((lcg) bmxv2.mo66814b()).f25784b.mo3214a());
            }
            if (lbf != null) {
                bngx a6 = bngx.m109368a((Collection) a2.stream().map(lel.f25890a).collect(Collectors.toList()));
                bxvd da = lai.f25545e.mo74144da();
                da.mo74123z(a5);
                da.mo74121y(a6);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lbf.getClass();
                ((lai) da.f164949b).f25548b = lbf;
                if (this.f25915j.mo66813a()) {
                    MetricsContext metricsContext2 = (MetricsContext) this.f25915j.mo66814b();
                    bxvd da2 = kzz.f25505d.mo74144da();
                    int a7 = metricsContext2.mo7953a();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((kzz) da2.f164949b).f25507a = a7;
                    kzx b3 = metricsContext2.mo7956b();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    b3.getClass();
                    ((kzz) da2.f164949b).f25508b = b3;
                    lbh c = metricsContext2.mo7957c();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    c.getClass();
                    ((kzz) da2.f164949b).f25509c = c;
                    kzz kzz = (kzz) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    kzz.getClass();
                    ((lai) da.f164949b).f25547a = kzz;
                }
                kwu kwu = this.f25911f;
                da.getClass();
                kwu.mo14909j(lep.m18989a(da));
            }
            List list = (List) kjs2.f24277b.stream().map(new lem(leh2)).collect(Collectors.toList());
            if (bmxv.mo66813a()) {
                fillForm3 = kqj.m18328a((kjp) bmxv.mo66814b(), bmxv.m108566b(kck), leh2.f25874d);
            }
            AbstractDetectionHistory$DetectionResult a8 = AbstractDetectionHistory$DetectionResult.m7160a(fillForm3, list);
            bngx a9 = bngx.m109368a((Collection) a2.stream().map(len.f25892a).collect(Collectors.toList()));
            bnpd a10 = bnpf.m110046a((Set) kjs2.f24278c, (Set) kjs2.f24279d);
            ClientState clientState = leh2.f25873c;
            bnrd a11 = a.mo14790a().values().iterator();
            while (a11.hasNext()) {
                kca2.mo14361a(((kbz) a11.next()).f23732a);
            }
            bnre i2 = a9.listIterator();
            while (i2.hasNext()) {
                kca2.mo14361a(((kbz) i2.next()).f23732a);
            }
            ArrayList arrayList = new ArrayList();
            bnre i3 = fillForm2.f11641a.listIterator();
            while (i3.hasNext()) {
                arrayList.add(((FillField) i3.next()).f11631a);
            }
            if (!a10.isEmpty()) {
                List list2 = (List) a10.stream().map(leo.f25893a).collect(Collectors.toList());
                arrayList.addAll(list2);
                kca2.mo14364a((AutofillId[]) list2.toArray(new AutofillId[0]));
            }
            ClientState a12 = ClientState.m7165a();
            a12.f11671c.mo7980a(clientState.f11671c.mo7979a());
            a12.f11671c.mo7981a(a8);
            a12.f11672d = this.f25914i;
            a12.f11673e = (MetricsContext) this.f25915j.mo66815c();
            if (bmxv2.mo66813a() && ((lcg) bmxv2.mo66814b()).f25783a.mo66813a()) {
                lcg lcg = (lcg) bmxv2.mo66814b();
                kca2.mo14362a((SaveInfo) lcg.f25783a.mo66814b());
                if (lcg.f25785c.mo66813a()) {
                    a12.f11669a = (byte[]) lcg.f25785c.mo66814b();
                }
                if (lcg.f25786d.mo66813a()) {
                    a12.f11670b = (PaymentsUtils$CardNetwork[]) ((List) lcg.f25786d.mo66814b()).toArray(new PaymentsUtils$CardNetwork[0]);
                }
            }
            kca2.mo14360a(a12.mo7976b());
            int i4 = Build.VERSION.SDK_INT;
            kca.mo14365b();
            if (ccjc.m130016b()) {
                kca2.mo14363a(arrayList);
            }
            bmxv c2 = bmxv.m108567c(kca.mo14359a());
            if (!c2.mo66813a() || !bmxv2.mo66813a() || !((lcg) bmxv2.mo66814b()).f25783a.mo66813a()) {
                z = false;
            } else {
                z = true;
            }
            if (!bmxv2.mo66813a() || !((lcg) bmxv2.mo66814b()).f25787e) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (bmxv2.mo66813a() && ((lcg) bmxv2.mo66814b()).f25788f) {
                z3 = true;
            }
            return bqga.m112775a(new lei(c2, true, z, z2, z3, m18992a(fillForm2, kck2)));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof kep) || ((kep) cause).f23945a != 2) {
                bnsl bnsl = (bnsl) f25906a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("les", "a", 383, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68448m();
                return bqga.m112777a((Throwable) e);
            }
            this.f25909d.mo15101a(kdi.f23885a);
            return this.f25912g.mo15036a(bqgj, leh2);
        }
    }

    /* renamed from: a */
    private static lba m18994a(kct kct, kbz kbz, Collection collection) {
        kcv kcv;
        bxvd da = lba.f25675f.mo74144da();
        laz a = kwv.m18701a(kct.mo14368a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((lba) da.f164949b).f25678b = a.mo3214a();
        da.mo73933A((Iterable) collection.stream().map(leq.f25895a).collect(Collectors.toList()));
        try {
            int parseInt = Integer.parseInt(kbz.f23733b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((lba) da.f164949b).f25677a = parseInt;
        } catch (NumberFormatException e) {
            bnsl bnsl = (bnsl) f25906a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("les", "a", 612, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to convert dataset id to integer");
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
        return (lba) da.mo74062i();
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
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bqgg mo15042a(bqgg bqgg, bqgj bqgj, leh leh, kjs kjs, kjp kjp, FillForm fillForm, bqgg bqgg2, kck kck, kca kca) {
        bmxv bmxv;
        lbf lbf;
        boolean z;
        boolean z2;
        laz laz;
        leh leh2 = leh;
        kjs kjs2 = kjs;
        FillForm fillForm2 = fillForm;
        kck kck2 = kck;
        kca kca2 = kca;
        try {
            bmxv = (bmxv) bqgg.get();
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) f25906a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("les", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SaveInfoFactory failed to execute.");
            bmxv = bmvz.f131120a;
        }
        bmxv c = bmxv.m108567c(kjp);
        try {
            kqm a = this.f25910e.mo14815a(kql.m18342a(fillForm2, kck2, ((kek) bqga.m112780a((Future) bqgg2)).f23936a, (MetricsContext) this.f25915j.mo66815c(), leh2.f25875e));
            bngx a2 = this.f25913h.mo15054a(new lgc(leh, kjs, fillForm, a, this.f25915j));
            if (leh2.f25875e.mo66813a() && a.mo14790a().size() + a2.size() > ((InlineSuggestionsRequest) leh2.f25875e.mo66814b()).getMaxSuggestionCount()) {
                a2 = bngx.m109355a(bnjd.m109594d(a2, (int) ccjm.m130120c()));
            }
            bnhe a3 = a.mo14790a();
            bnhe b = a.mo14791b();
            bngs b2 = bngx.m109371b(a3.size());
            bnrd a4 = a3.keySet().iterator();
            while (a4.hasNext()) {
                kct kct = (kct) a4.next();
                kbz kbz = (kbz) a3.get(kct);
                bnic bnic = (bnic) b.get(kct);
                if (!(kbz == null || bnic == null)) {
                    b2.mo67668c(m18994a(kct, kbz, bnic));
                }
            }
            bnre i = a2.listIterator();
            while (i.hasNext()) {
                lgb lgb = (lgb) i.next();
                if (lgb.f26024c.mo66813a()) {
                    b2.mo67668c((lba) lgb.f26024c.mo66814b());
                }
            }
            bngx a5 = b2.mo67664a();
            FillForm fillForm3 = null;
            if (c.mo66813a()) {
                lbf = kwv.m18704a((kjp) c.mo66814b());
            } else {
                lbf = null;
            }
            boolean z3 = false;
            if (this.f25915j.mo66813a()) {
                MetricsContext metricsContext = (MetricsContext) this.f25915j.mo66814b();
                if (!bmxv.mo66813a() || !((lcg) bmxv.mo66814b()).f25783a.mo66813a()) {
                    laz = null;
                } else {
                    laz = ((lcg) bmxv.mo66814b()).f25784b;
                }
                metricsContext.mo7955a(new MetricsContext.FillContext(lbf, a5, laz, false));
            }
            if (this.f25909d.mo15089i() && bmxv.mo66813a() && ((lcg) bmxv.mo66814b()).f25783a.mo66813a()) {
                kwe.m18646a((Context) null).mo14890b(((lcg) bmxv.mo66814b()).f25784b.mo3214a());
            }
            if (lbf != null) {
                bngx a6 = bngx.m109368a((Collection) a2.stream().map(lel.f25890a).collect(Collectors.toList()));
                bxvd da = lai.f25545e.mo74144da();
                da.mo74123z(a5);
                da.mo74121y(a6);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lbf.getClass();
                ((lai) da.f164949b).f25548b = lbf;
                if (this.f25915j.mo66813a()) {
                    MetricsContext metricsContext2 = (MetricsContext) this.f25915j.mo66814b();
                    bxvd da2 = kzz.f25505d.mo74144da();
                    int a7 = metricsContext2.mo7953a();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((kzz) da2.f164949b).f25507a = a7;
                    kzx b3 = metricsContext2.mo7956b();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    b3.getClass();
                    ((kzz) da2.f164949b).f25508b = b3;
                    lbh c2 = metricsContext2.mo7957c();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    c2.getClass();
                    ((kzz) da2.f164949b).f25509c = c2;
                    kzz kzz = (kzz) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    kzz.getClass();
                    ((lai) da.f164949b).f25547a = kzz;
                }
                kwu kwu = this.f25911f;
                da.getClass();
                kwu.mo14909j(lep.m18989a(da));
            }
            List list = (List) kjs2.f24277b.stream().map(new lem(leh2)).collect(Collectors.toList());
            if (c.mo66813a()) {
                fillForm3 = kqj.m18328a((kjp) c.mo66814b(), bmxv.m108566b(kck), leh2.f25874d);
            }
            AbstractDetectionHistory$DetectionResult a8 = AbstractDetectionHistory$DetectionResult.m7160a(fillForm3, list);
            bngx a9 = bngx.m109368a((Collection) a2.stream().map(len.f25892a).collect(Collectors.toList()));
            bnpd a10 = bnpf.m110046a((Set) kjs2.f24278c, (Set) kjs2.f24279d);
            ClientState clientState = leh2.f25873c;
            bnrd a11 = a.mo14790a().values().iterator();
            while (a11.hasNext()) {
                kca2.mo14361a(((kbz) a11.next()).f23732a);
            }
            bnre i2 = a9.listIterator();
            while (i2.hasNext()) {
                kca2.mo14361a(((kbz) i2.next()).f23732a);
            }
            ArrayList arrayList = new ArrayList();
            bnre i3 = fillForm2.f11641a.listIterator();
            while (i3.hasNext()) {
                arrayList.add(((FillField) i3.next()).f11631a);
            }
            if (!a10.isEmpty()) {
                List list2 = (List) a10.stream().map(leo.f25893a).collect(Collectors.toList());
                arrayList.addAll(list2);
                kca2.mo14364a((AutofillId[]) list2.toArray(new AutofillId[0]));
            }
            ClientState a12 = ClientState.m7165a();
            a12.f11671c.mo7980a(clientState.f11671c.mo7979a());
            a12.f11671c.mo7981a(a8);
            a12.f11672d = this.f25914i;
            a12.f11673e = (MetricsContext) this.f25915j.mo66815c();
            if (bmxv.mo66813a() && ((lcg) bmxv.mo66814b()).f25783a.mo66813a()) {
                lcg lcg = (lcg) bmxv.mo66814b();
                kca2.mo14362a((SaveInfo) lcg.f25783a.mo66814b());
                if (lcg.f25785c.mo66813a()) {
                    a12.f11669a = (byte[]) lcg.f25785c.mo66814b();
                }
                if (lcg.f25786d.mo66813a()) {
                    a12.f11670b = (PaymentsUtils$CardNetwork[]) ((List) lcg.f25786d.mo66814b()).toArray(new PaymentsUtils$CardNetwork[0]);
                }
            }
            kca2.mo14360a(a12.mo7976b());
            int i4 = Build.VERSION.SDK_INT;
            kca.mo14365b();
            if (ccjc.m130016b()) {
                kca2.mo14363a(arrayList);
            }
            bmxv c3 = bmxv.m108567c(kca.mo14359a());
            if (!c3.mo66813a() || !bmxv.mo66813a() || !((lcg) bmxv.mo66814b()).f25783a.mo66813a()) {
                z = false;
            } else {
                z = true;
            }
            if (!bmxv.mo66813a() || !((lcg) bmxv.mo66814b()).f25787e) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (bmxv.mo66813a() && ((lcg) bmxv.mo66814b()).f25788f) {
                z3 = true;
            }
            return bqga.m112775a(new lei(c3, true, z, z2, z3, m18992a(fillForm2, kck)));
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof kep) || ((kep) cause).f23945a != 2) {
                bnsl bnsl2 = (bnsl) f25906a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("les", "a", 383, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68448m();
                return bqga.m112777a((Throwable) e2);
            }
            this.f25909d.mo15101a(kdi.f23885a);
            return this.f25912g.mo15036a(bqgj, leh2);
        }
    }

    /* renamed from: a */
    public final bqgg mo15036a(bqgj bqgj, leh leh) {
        String str;
        kca kca = new kca();
        ComponentName activityComponent = leh.f25872b.getActivityComponent();
        if (activityComponent != null) {
            str = activityComponent.getPackageName();
        } else {
            str = null;
        }
        if (str == null) {
            bnsl bnsl = (bnsl) f25906a.mo68388c();
            bnsl.mo68432a("les", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Request AssistStructure missing android package name.");
            return bqga.m112775a(lei.f25876a);
        }
        try {
            kck b = this.f25918m.mo14765b(str);
            String str2 = b.f23841b;
            ComponentName activityComponent2 = leh.f25872b.getActivityComponent();
            kjw c = kjx.m17960c();
            c.mo14552b(activityComponent2.getPackageName());
            c.mo14551a(activityComponent2.getClassName());
            kjx a = c.mo14550a();
            bngx a2 = kog.m18243a(leh.f25872b);
            kju kju = this.f25916k;
            kjq a3 = kjr.m17953a();
            a3.mo14542a(b);
            a3.mo14543a(a);
            a3.mo14541a(a2);
            return bqdx.m112674a(kju.mo14544a(a3.mo14540a(), bqgj), new lek(this, b, bqgj, leh, kca), bqfb.INSTANCE);
        } catch (kpi e) {
            bnsl bnsl2 = (bnsl) f25906a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("les", "a", (int) MfiClientException.TYPE_MFICLIENT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68448m();
            return bqga.m112777a((Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo15043a(bqgj bqgj, leh leh, kca kca) {
        String str;
        ComponentName activityComponent = leh.f25872b.getActivityComponent();
        if (activityComponent != null) {
            str = activityComponent.getPackageName();
        } else {
            str = null;
        }
        if (str == null) {
            bnsl bnsl = (bnsl) f25906a.mo68388c();
            bnsl.mo68432a("les", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Request AssistStructure missing android package name.");
            return bqga.m112775a(lei.f25876a);
        }
        try {
            kck b = this.f25918m.mo14765b(str);
            String str2 = b.f23841b;
            ComponentName activityComponent2 = leh.f25872b.getActivityComponent();
            kjw c = kjx.m17960c();
            c.mo14552b(activityComponent2.getPackageName());
            c.mo14551a(activityComponent2.getClassName());
            kjx a = c.mo14550a();
            bngx a2 = kog.m18243a(leh.f25872b);
            kju kju = this.f25916k;
            kjq a3 = kjr.m17953a();
            a3.mo14542a(b);
            a3.mo14543a(a);
            a3.mo14541a(a2);
            return bqdx.m112674a(kju.mo14544a(a3.mo14540a(), bqgj), new lek(this, b, bqgj, leh, kca), bqfb.INSTANCE);
        } catch (kpi e) {
            bnsl bnsl2 = (bnsl) f25906a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("les", "a", (int) MfiClientException.TYPE_MFICLIENT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68448m();
            return bqga.m112777a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final bqgg mo15044a(kck kck, FillForm fillForm, ClientState clientState, bqgg bqgg, bngx bngx) {
        return this.f25917l.mo14962a(new lcf(kck, fillForm, ImmutableDetectionHistory.m7172a(clientState.f11671c), bqgg, bngx, this.f25915j));
    }
}
