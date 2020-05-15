package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.widget.RemoteViews;
import com.google.android.gms.autofill.fill.FillField;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: kqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqx implements kqv {

    /* renamed from: c */
    private static final srn f24820c = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    public final bnic f24821a = bnic.m109494a(kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE, new kpb[0]);

    /* renamed from: b */
    public final Context f24822b;

    public kqx(Context context) {
        this.f24822b = context;
    }

    /* renamed from: a */
    private final kbz m18372a(bmxv bmxv, bnhe bnhe, bmxv bmxv2) {
        bnhe bnhe2;
        bnrd a = bnhe.values().iterator();
        while (a.hasNext()) {
            if (((kqc) a.next()).f24791f) {
                kbz b = m18373b(bmxv, bnhe, bmvz.f131120a);
                if (b == null) {
                    return null;
                }
                PendingIntent a2 = lio.m19189a(this.f24822b, lio.m19200c(8).setData(Uri.parse(UUID.randomUUID().toString())).putExtra("com.google.android.gms.autofill.extra.DATASET", b.f23732a));
                if (a2 != null) {
                    bnha h = bnhe.m109414h();
                    bnrd a3 = bnhe.entrySet().iterator();
                    while (a3.hasNext()) {
                        Map.Entry entry = (Map.Entry) a3.next();
                        kqc kqc = (kqc) entry.getValue();
                        h.mo67695b((FillField) entry.getKey(), new kqc(kqk.m18330a(a2), kqc.f24787b, kqc.f24788c, kqc.f24789d, kqc.f24790e));
                    }
                    bnhe2 = h.mo67618b();
                } else {
                    ((bnsl) f24820c.mo68388c()).mo68405a("createDatasetPendingIntent failed");
                    bnhe2 = bnoj.f131912b;
                }
                return m18373b(bmxv, bnhe2, bmxv2);
            }
        }
        int i = Build.VERSION.SDK_INT;
        return m18373b(bmxv, bnhe, bmxv2);
    }

    /* renamed from: b */
    private final kbz m18373b(bmxv bmxv, bnhe bnhe, bmxv bmxv2) {
        AutofillValue autofillValue;
        int i;
        Pattern pattern;
        kby a = kbz.m17615a();
        if (bmxv.mo66813a()) {
            a.mo14357a((String) bmxv.mo66814b());
        }
        bnrd a2 = bnhe.entrySet().iterator();
        while (a2.hasNext()) {
            Map.Entry entry = (Map.Entry) a2.next();
            FillField fillField = (FillField) entry.getKey();
            AutofillId autofillId = fillField.f11631a;
            kqc kqc = (kqc) entry.getValue();
            kqk kqk = kqc.f24786a;
            PendingIntent b = kqk.mo14779b();
            if (b != null) {
                a.mo14353a(b.getIntentSender());
                autofillValue = null;
            } else {
                autofillValue = kqk.m18329a(fillField, kqk);
                if (autofillValue == null) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (fillField.f11632b != 1) {
                        ((bnsl) f24820c.mo68388c()).mo68424a("createAutofillValue(%s, %s) returns null", fillField, kqk);
                    } else {
                        a.mo14354a(autofillId, null);
                    }
                }
            }
            Context context = this.f24822b;
            bnrd a3 = this.f24821a.iterator();
            while (true) {
                if (a3.hasNext()) {
                    if (fillField.mo7943a((kpb) a3.next())) {
                        i = 2;
                        break;
                    }
                } else {
                    i = 1;
                    break;
                }
            }
            RemoteViews a4 = lbj.m18888a(context, kqc.f24787b, kqc.f24788c, kqc.f24789d, false, i);
            int i3 = Build.VERSION.SDK_INT;
            kqo kqo = kqc.f24790e;
            bmxv a5 = bmxv2.mo66810a((bmxj) new kqw(this, kqc, fillField));
            int i4 = kqo.f24807d;
            int i5 = i4 - 1;
            if (i5 == 0) {
                a.mo14356a(autofillId, autofillValue, null, a4, a5);
            } else if (i5 == 1) {
                a.mo14355a(autofillId, autofillValue, a4, a5);
            } else if (i4 != 3 || (pattern = kqo.f24806c) == null) {
                throw new IllegalStateException();
            } else {
                a.mo14356a(autofillId, autofillValue, pattern, a4, a5);
            }
        }
        return a.mo14352a();
    }

    /* renamed from: a */
    public final kbz mo14817a(bnhe bnhe) {
        return m18372a(bmvz.f131120a, bnhe, bmvz.f131120a);
    }

    /* renamed from: a */
    public final kbz mo14818a(String str, bnhe bnhe) {
        return m18372a(bmxv.m108566b(str), bnhe, bmvz.f131120a);
    }

    /* renamed from: a */
    public final kbz mo14819a(String str, bnhe bnhe, bmxv bmxv) {
        return m18372a(bmxv.m108566b(str), bnhe, bmxv);
    }
}
