package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import java.io.Serializable;

/* renamed from: lrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lrf {
    /* renamed from: a */
    public static kbz m19575a(Context context, FillForm fillForm, bmxv bmxv, bmxv bmxv2) {
        Bundle bundle;
        PendingIntent pendingIntent;
        if (!cckh.f179230a.mo6606a().mo76176a()) {
            bmxv2 = bmvz.f131120a;
        }
        kby a = kbz.m17615a();
        lrc a2 = lbj.m18891a(context);
        CharSequence b = a2.mo15386b(C0126R.string.autofill_sms_prompt);
        RemoteViews a3 = lbj.m18888a(context, b, a2.mo15386b(C0126R.string.autofill_sms_subtext), kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.product_logo_messages_color_24, b), false, 1);
        bmxv a4 = bmxv2.mo66810a((bmxj) new lre(context));
        Intent putExtra = (cckh.f179230a.mo6606a().mo76182g() ? lio.m19201d(32) : lio.m19200c(32)).putExtra("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL", lqx.m19547a(fillForm)).putExtra("com.google.android.gms.autofill.extra.METRICS_CONTEXT", (Serializable) bmxv.mo66815c());
        if (!ssw.m36269a() || !bmxv2.mo66813a()) {
            bundle = null;
        } else {
            bundle = lqx.m19547a((Parcelable) bmxv2.mo66814b());
        }
        Intent putExtra2 = putExtra.putExtra("com.google.android.gms.autofill.extra.INLINE_PRESENTATION_SPEC", bundle);
        if (putExtra2 != null) {
            pendingIntent = lio.m19189a(context, putExtra2);
        } else {
            pendingIntent = null;
        }
        if (pendingIntent != null) {
            a.mo14353a(pendingIntent.getIntentSender());
        }
        bnre i = fillForm.mo7950b(kpb.OTP_FULL).listIterator();
        while (i.hasNext()) {
            a.mo14355a(((FillField) i.next()).f11631a, null, a3, a4);
        }
        bnre i2 = fillForm.mo7950b(kpb.OTP_1).listIterator();
        while (i2.hasNext()) {
            a.mo14355a(((FillField) i2.next()).f11631a, null, a3, a4);
        }
        return a.mo14352a();
    }
}
