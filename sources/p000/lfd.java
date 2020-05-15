package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.service.autofill.SaveInfo;
import android.view.autofill.AutofillId;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
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

/* renamed from: lfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lfd implements lej {

    /* renamed from: a */
    public static final srn f25942a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public final bngm f25943b;

    /* renamed from: c */
    public final bnic f25944c;

    /* renamed from: d */
    public final lch f25945d;

    /* renamed from: e */
    public final lho f25946e;

    /* renamed from: f */
    public final kqn f25947f;

    /* renamed from: g */
    public final kwu f25948g;

    /* renamed from: h */
    public final UserFieldTypeManager f25949h;

    /* renamed from: i */
    public final bmxv f25950i;

    /* renamed from: j */
    public final lgd f25951j;

    /* renamed from: k */
    private final kju f25952k;

    /* renamed from: l */
    private final kpk f25953l;

    public lfd(kju kju, bngm bngm, bnic bnic, lch lch, lho lho, kqn kqn, kwu kwu, kpk kpk, lgd lgd, UserFieldTypeManager userFieldTypeManager, bmxv bmxv) {
        this.f25952k = kju;
        this.f25943b = bngm;
        this.f25944c = bnic;
        this.f25945d = lch;
        this.f25946e = lho;
        this.f25947f = kqn;
        this.f25948g = kwu;
        this.f25953l = kpk;
        this.f25951j = lgd;
        this.f25949h = userFieldTypeManager;
        this.f25950i = bmxv;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0014  */
    /* renamed from: a */
    public static bmxv m19004a(FillForm fillForm, kck kck) {
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

    /* renamed from: a */
    static final /* synthetic */ bqgg m19005a(bnic bnic) {
        bnia bnia = new bnia();
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            try {
                bnia.mo67752b((Iterable) ((kek) bqga.m112780a((Future) ((bqgg) a.next()))).f23936a);
            } catch (ExecutionException e) {
                bnsl bnsl = (bnsl) f25942a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("lfd", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Fetching data entries from an account unsuccessful.");
            }
        }
        return bqga.m112775a((Object) bnia.mo67751a());
    }

    /* renamed from: a */
    private static lba m19006a(kct kct, kbz kbz, Collection collection) {
        kcv kcv;
        bxvd da = lba.f25675f.mo74144da();
        laz a = kwv.m18701a(kct.mo14368a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((lba) da.f164949b).f25678b = a.mo3214a();
        da.mo73933A((Iterable) collection.stream().map(lfa.f25931a).collect(Collectors.toList()));
        try {
            int parseInt = Integer.parseInt(kbz.f23733b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((lba) da.f164949b).f25677a = parseInt;
        } catch (NumberFormatException e) {
            bnsl bnsl = (bnsl) f25942a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lfd", "a", 600, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
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
    public final /* synthetic */ bqgg mo15050a(bqgg bqgg, leh leh, kjs kjs, kjp kjp, FillForm fillForm, bqgg bqgg2, kck kck, kca kca) {
        bmvz bmvz;
        bngx bngx;
        boolean z;
        boolean z2;
        boolean z3;
        laz laz;
        kcv kcv;
        leh leh2 = leh;
        kjs kjs2 = kjs;
        FillForm fillForm2 = fillForm;
        kck kck2 = kck;
        kca kca2 = kca;
        try {
            bmvz = (bmxv) bqgg.get();
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) f25942a.mo68387b();
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
        kqm a = this.f25947f.mo14815a(kql.m18341a(fillForm2, kck2, bnic, (MetricsContext) this.f25950i.mo66815c()));
        bngx e2 = isEmpty ? bngx.m109376e() : this.f25951j.mo15054a(new lgc(leh, kjs, fillForm, a, this.f25950i));
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
                    } catch (NumberFormatException e3) {
                        bnsl bnsl2 = (bnsl) f25942a.mo68388c();
                        bnsl2.mo68437a(e3);
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
            bnre i = e2.listIterator();
            while (i.hasNext()) {
                lgb lgb = (lgb) i.next();
                if (lgb.f26024c.mo66813a()) {
                    b2.mo67668c((lba) lgb.f26024c.mo66814b());
                }
            }
            bngx = b2.mo67664a();
        } else {
            bngx = bngx.m109376e();
        }
        lbf a5 = kwv.m18704a(kjp);
        if (this.f25950i.mo66813a()) {
            MetricsContext metricsContext = (MetricsContext) this.f25950i.mo66814b();
            if (bmvz2.mo66813a()) {
                laz = ((lcg) bmvz.mo66814b()).f25784b;
            } else {
                laz = null;
            }
            metricsContext.mo7955a(new MetricsContext.FillContext(a5, bngx, laz, false));
        }
        if (this.f25946e.mo15089i() && bmvz2.mo66813a()) {
            kwe.m18646a((Context) null).mo14890b(((lcg) bmvz.mo66814b()).f25784b.mo3214a());
        }
        if (a5 != null) {
            bngx a6 = bngx.m109368a((Collection) e2.stream().map(lev.f25926a).collect(Collectors.toList()));
            bxvd da2 = lai.f25545e.mo74144da();
            da2.mo74123z(bngx);
            da2.mo74121y(a6);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a5.getClass();
            ((lai) da2.f164949b).f25548b = a5;
            if (this.f25950i.mo66813a()) {
                MetricsContext metricsContext2 = (MetricsContext) this.f25950i.mo66814b();
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
            kwu kwu = this.f25948g;
            da2.getClass();
            kwu.mo14909j(new lez(da2));
        }
        AbstractDetectionHistory$DetectionResult a8 = AbstractDetectionHistory$DetectionResult.m7160a(kqj.m18328a(kjp, bmxv.m108566b(kck), leh2.f25874d), (List) kjs2.f24277b.stream().map(new lew(leh2)).collect(Collectors.toList()));
        bngx a9 = bngx.m109368a((Collection) e2.stream().map(lex.f25928a).collect(Collectors.toList()));
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
            List list = (List) a10.stream().map(ley.f25929a).collect(Collectors.toList());
            arrayList.addAll(list);
            kca2.mo14364a((AutofillId[]) list.toArray(new AutofillId[0]));
        }
        ClientState a12 = ClientState.m7165a();
        a12.f11671c.mo7980a(clientState.f11671c.mo7979a());
        a12.f11671c.mo7981a(a8);
        a12.f11672d = this.f25949h;
        a12.f11673e = (MetricsContext) this.f25950i.mo66815c();
        if (!bmvz.mo66813a() || !((lcg) bmvz.mo66814b()).f25783a.mo66813a()) {
            z = false;
        } else {
            lcg lcg = (lcg) bmvz.mo66814b();
            kca2.mo14362a((SaveInfo) lcg.f25783a.mo66814b());
            if (lcg.f25785c.mo66813a()) {
                a12.f11669a = (byte[]) lcg.f25785c.mo66814b();
            }
            if (lcg.f25786d.mo66813a()) {
                z = false;
                a12.f11670b = (PaymentsUtils$CardNetwork[]) ((List) lcg.f25786d.mo66814b()).toArray(new PaymentsUtils$CardNetwork[0]);
            } else {
                z = false;
            }
        }
        kca2.mo14360a(a12.mo7976b());
        int i4 = Build.VERSION.SDK_INT;
        kca.mo14365b();
        if (ccjc.m130016b()) {
            kca2.mo14363a(arrayList);
        }
        bmxv c2 = bmxv.m108567c(kca.mo14359a());
        if (!c2.mo66813a() || !bmvz2.mo66813a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!bmvz.mo66813a() || !((lcg) bmvz.mo66814b()).f25787e) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (bmvz.mo66813a() && ((lcg) bmvz.mo66814b()).f25788f) {
            z = true;
        }
        return bqga.m112775a(new lei(c2, true, z2, z3, z, m19004a(fillForm2, kck)));
    }

    /* renamed from: a */
    public final bqgg mo15036a(bqgj bqgj, leh leh) {
        kca kca = new kca();
        if (this.f25944c.isEmpty()) {
            return bqga.m112775a(lei.f25877b);
        }
        ComponentName activityComponent = leh.f25872b.getActivityComponent();
        String packageName = activityComponent != null ? activityComponent.getPackageName() : null;
        if (packageName == null) {
            bnsl bnsl = (bnsl) f25942a.mo68388c();
            bnsl.mo68432a("lfd", "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Request AssistStructure missing android package name.");
            return bqga.m112775a(lei.f25876a);
        }
        try {
            kck b = this.f25953l.mo14765b(packageName);
            String str = b.f23841b;
            ComponentName activityComponent2 = leh.f25872b.getActivityComponent();
            kjw c = kjx.m17960c();
            c.mo14552b(activityComponent2.getPackageName());
            c.mo14551a(activityComponent2.getClassName());
            kjx a = c.mo14550a();
            bngx a2 = kog.m18243a(leh.f25872b);
            kju kju = this.f25952k;
            kjq a3 = kjr.m17953a();
            a3.mo14542a(b);
            a3.mo14543a(a);
            a3.mo14541a(a2);
            return bqdx.m112674a(kju.mo14544a(a3.mo14540a(), bqgj), new let(this, b, leh, bqgj, packageName, kca), bqfb.INSTANCE);
        } catch (kpi e) {
            bnsl bnsl2 = (bnsl) f25942a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("lfd", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Unable to fetch data entries successfully.");
            return bqga.m112777a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo15051a(bqgj bqgj, leh leh, kca kca) {
        if (this.f25944c.isEmpty()) {
            return bqga.m112775a(lei.f25877b);
        }
        ComponentName activityComponent = leh.f25872b.getActivityComponent();
        String packageName = activityComponent != null ? activityComponent.getPackageName() : null;
        if (packageName == null) {
            bnsl bnsl = (bnsl) f25942a.mo68388c();
            bnsl.mo68432a("lfd", "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Request AssistStructure missing android package name.");
            return bqga.m112775a(lei.f25876a);
        }
        try {
            kck b = this.f25953l.mo14765b(packageName);
            String str = b.f23841b;
            ComponentName activityComponent2 = leh.f25872b.getActivityComponent();
            kjw c = kjx.m17960c();
            c.mo14552b(activityComponent2.getPackageName());
            c.mo14551a(activityComponent2.getClassName());
            kjx a = c.mo14550a();
            bngx a2 = kog.m18243a(leh.f25872b);
            kju kju = this.f25952k;
            kjq a3 = kjr.m17953a();
            a3.mo14542a(b);
            a3.mo14543a(a);
            a3.mo14541a(a2);
            return bqdx.m112674a(kju.mo14544a(a3.mo14540a(), bqgj), new let(this, b, leh, bqgj, packageName, kca), bqfb.INSTANCE);
        } catch (kpi e) {
            bnsl bnsl2 = (bnsl) f25942a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("lfd", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Unable to fetch data entries successfully.");
            return bqga.m112777a((Throwable) e);
        }
    }
}
