package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.widget.inline.InlinePresentationSpec;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.data.DomainUtils$DomainParcel;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* renamed from: kqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqy implements kqn {

    /* renamed from: a */
    private static final srn f24823a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    private final bnhe f24824b;

    /* renamed from: c */
    private final Context f24825c;

    /* renamed from: d */
    private final kqv f24826d;

    /* renamed from: e */
    private final lhi f24827e;

    public kqy(bnhe bnhe, Context context, kqv kqv, lhi lhi) {
        this.f24824b = bnhe;
        this.f24825c = context;
        this.f24826d = kqv;
        this.f24827e = lhi;
    }

    /* renamed from: a */
    private final kbz m18377a(bnhe bnhe, bmxv bmxv, bmxv bmxv2) {
        if (bmxv.mo66813a()) {
            return this.f24826d.mo14819a(String.valueOf(((MetricsContext) bmxv.mo66814b()).mo7958d()), bnhe, bmxv2);
        }
        return this.f24826d.mo14817a(bnhe);
    }

    /* renamed from: b */
    public final bqgg mo14816b(kql kql) {
        return bqga.m112775a(mo14815a(kql));
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0385 A[SYNTHETIC] */
    /* renamed from: a */
    public final kqm mo14815a(kql kql) {
        int i;
        InlinePresentationSpec inlinePresentationSpec;
        boolean z;
        bmxv bmxv;
        int i2;
        Iterator it;
        kbz kbz;
        kbz kbz2;
        FillForm a = kql.mo14782a();
        bmxv d = kql.mo14785d();
        bnic c = kql.mo14784c();
        Map b = bnmt.m109804b();
        HashSet hashSet = new HashSet();
        bnrd a2 = c.iterator();
        while (a2.hasNext()) {
            kct kct = (kct) a2.next();
            if (hashSet.add(kct.mo14368a())) {
                Object a3 = kct.mo14368a();
                kdn kdn = (kdn) this.f24824b.get(a3.getClass());
                if (kdn != null) {
                    bnhe a4 = kdn.mo14409a(a3, a);
                    if (!a4.isEmpty()) {
                        b.put(kct, a4);
                    }
                } else {
                    throw new IllegalStateException(a3.getClass().toString());
                }
            }
        }
        if (a.mo7949a(kpb.USERNAME)) {
            boolean z2 = false;
            for (kct kct2 : b.keySet()) {
                if (kct2.mo14368a() instanceof Credential) {
                    z2 = true;
                }
            }
            if (z2) {
                bnha a5 = bnhe.m109406a(b.size());
                for (Map.Entry entry : b.entrySet()) {
                    kct kct3 = (kct) entry.getKey();
                    bnhe bnhe = (bnhe) entry.getValue();
                    if (kct3.mo14368a() instanceof Credential) {
                        a5.mo67695b(kct3, bnhe);
                    } else {
                        HashMap hashMap = new HashMap();
                        bnrd a6 = bnhe.entrySet().iterator();
                        while (a6.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) a6.next();
                            if (!((FillField) entry2.getKey()).mo7943a(kpb.USERNAME)) {
                                hashMap.put((FillField) entry2.getKey(), (kqc) entry2.getValue());
                            }
                        }
                        if (!hashMap.isEmpty()) {
                            a5.mo67695b(kct3, bnhe.m109413a(hashMap));
                        }
                    }
                }
                b = a5.mo67618b();
            }
        }
        bnha h = bnhe.m109414h();
        bnha h2 = bnhe.m109414h();
        bmxv e = kql.mo14786e();
        Iterator it2 = bnjd.m109594d(b.entrySet(), e.mo66813a() ? (int) (((long) ((InlineSuggestionsRequest) e.mo66814b()).getMaxSuggestionCount()) - ccjm.m130120c()) : b.size()).iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it2.next();
            kct kct4 = (kct) entry3.getKey();
            bnhe bnhe2 = (bnhe) entry3.getValue();
            if (e.mo66813a()) {
                i = i3 + 1;
                inlinePresentationSpec = (InlinePresentationSpec) ((InlineSuggestionsRequest) e.mo66814b()).getInlinePresentationSpecs().get(i3);
            } else {
                i = i3;
                inlinePresentationSpec = null;
            }
            bmxv c2 = bmxv.m108567c(inlinePresentationSpec);
            Object a7 = kct4.mo14368a();
            kck b2 = kql.mo14783b();
            if (a7 instanceof Credential) {
                z = !((Credential) a7).f11611d.contains(b2);
            } else {
                z = false;
            }
            if (!ccjf.m130036f()) {
                it = it2;
                bmxv = e;
            } else if (!kct4.mo14370c().mo66813a()) {
                it = it2;
                bmxv = e;
            } else if (!kdi.f23885a.equals(this.f24827e.mo15081a()) && !this.f24827e.mo15096p()) {
                it = it2;
                bmxv = e;
            } else if (!z) {
                Account account = (Account) kct4.mo14370c().mo66814b();
                kbz a8 = m18377a(bnhe2, d, c2);
                if (a8 != null) {
                    Context context = this.f24825c;
                    it = it2;
                    Intent putExtra = lio.m19200c(15).putExtra("com.google.android.gms.autofill.extra.OPT_IN_ACCOUNT", account).putExtra("com.google.android.gms.autofill.extra.DATASET", a8.f23732a);
                    if (d.mo66813a()) {
                        putExtra.putExtra("com.google.android.gms.autofill.extra.METRICS_CONTEXT", lqx.m19547a((Parcelable) d.mo66814b()));
                    }
                    PendingIntent a9 = lio.m19189a(context, putExtra);
                    if (a9 == null) {
                        ((bnsl) f24823a.mo68388c()).mo68405a("createRevisedSetupAndFillIntent failed");
                        bmxv = e;
                        i2 = i;
                        kbz = null;
                    } else {
                        bnha h3 = bnhe.m109414h();
                        for (bnrd a10 = bnhe2.entrySet().iterator(); a10.hasNext(); a10 = a10) {
                            Map.Entry entry4 = (Map.Entry) a10.next();
                            kqc kqc = (kqc) entry4.getValue();
                            h3.mo67695b((FillField) entry4.getKey(), new kqc(kqk.m18330a(a9), kqc.f24787b, kqc.f24788c, kqc.f24789d, kqc.f24790e));
                            a9 = a9;
                            e = e;
                        }
                        bmxv = e;
                        kbz = this.f24826d.mo14819a(a8.f23733b, h3.mo67618b(), c2);
                        i2 = i;
                    }
                } else {
                    it = it2;
                    bmxv = e;
                    i2 = i;
                    kbz = null;
                }
                if (kbz == null) {
                    h.mo67695b(kct4, kbz);
                    h2.mo67695b(kct4, bnhe2.keySet());
                }
                it2 = it;
                i3 = i2;
                e = bmxv;
            } else {
                it = it2;
                bmxv = e;
                i2 = i;
                it2 = it;
                i3 = i2;
                e = bmxv;
            }
            if (z) {
                bnhe bnhe3 = (bnhe) entry3.getValue();
                kck b3 = kql.mo14783b();
                kcv kcv = ((Credential) kct4.mo14368a()).f11610c;
                bmxv d2 = kql.mo14785d();
                if (d2.mo66813a()) {
                    kbz2 = this.f24826d.mo14818a(String.valueOf(((MetricsContext) d2.mo66814b()).mo7958d()), bnhe3);
                } else {
                    kbz2 = this.f24826d.mo14817a(bnhe3);
                }
                if (kbz2 != null) {
                    i2 = i;
                    PendingIntent a11 = lio.m19189a(this.f24825c, lio.m19200c(6).setData(Uri.parse(UUID.randomUUID().toString())).putExtra("com.google.android.gms.autofill.extra.DATASET", kbz2.f23732a).putExtra("com.google.android.gms.autofill.extra.STATE_ANDROID_DOMAIN", lqx.m19547a(new DomainUtils$DomainParcel(b3))).putExtra("com.google.android.gms.autofill.extra.STATE_DOMAIN", lqx.m19547a(new DomainUtils$DomainParcel(kcv))));
                    if (a11 != null) {
                        bnha h4 = bnhe.m109414h();
                        bnrd a12 = bnhe3.entrySet().iterator();
                        while (a12.hasNext()) {
                            Map.Entry entry5 = (Map.Entry) a12.next();
                            kqc kqc2 = (kqc) entry5.getValue();
                            h4.mo67695b((FillField) entry5.getKey(), new kqc(kqk.m18330a(a11), kqc2.f24787b, kqc2.f24788c, kqc2.f24789d, kqc2.f24790e));
                            a11 = a11;
                        }
                        kbz = this.f24826d.mo14819a(kbz2.f23733b, h4.mo67618b(), c2);
                    } else {
                        ((bnsl) f24823a.mo68388c()).mo68405a("createDatasetWarningPendingIntent failed");
                    }
                } else {
                    i2 = i;
                }
                kbz = null;
            } else {
                i2 = i;
                kbz = m18377a(bnhe2, d, c2);
            }
            if (kbz == null) {
            }
            it2 = it;
            i3 = i2;
            e = bmxv;
        }
        return kqm.m18348a(h.mo67618b(), h2.mo67618b());
    }
}
