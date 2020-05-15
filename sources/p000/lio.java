package p000;

import android.app.PendingIntent;
import android.app.assist.AssistStructure;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.UUID;

/* renamed from: lio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lio {
    /* renamed from: a */
    public static PendingIntent m19187a(int i, Context context, kcu kcu, FillForm fillForm, boolean z) {
        Uri uri;
        Intent d = m19201d(i);
        if (z) {
            uri = Uri.parse(UUID.randomUUID().toString());
        } else {
            uri = kcu.f23839b;
        }
        d.setData(uri).putExtra("com.google.android.gms.autofill.extra.INTENT", kcu.f23838a).putExtra("com.google.android.gms.autofill.extra.INTENT_RESULT_TRANSFORMER", lqx.m19547a(kcu.f23840c)).putExtra("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL", lqx.m19547a(fillForm));
        return m19189a(context, d);
    }

    /* renamed from: b */
    public static Intent m19198b(int i) {
        return m19195a(i, "com.google.android.gms.autofill.ui.AutofillActivity");
    }

    /* renamed from: c */
    public static Intent m19200c(int i) {
        return m19195a(i, "com.google.android.gms.autofill.ui.AutofillDialogActivity");
    }

    /* renamed from: d */
    public static Intent m19201d(int i) {
        return m19195a(i, "com.google.android.gms.autofill.ui.AutofillTransparentActivity");
    }

    /* renamed from: b */
    public static Intent m19199b(AssistStructure assistStructure, Bundle bundle, int i) {
        return m19200c(16).putExtra("android.view.autofill.extra.ASSIST_STRUCTURE", assistStructure).putExtra("android.view.autofill.extra.CLIENT_STATE", bundle).putExtra("com.google.android.gms.autofill.extra.FILL_REQUEST_ID", i);
    }

    /* renamed from: a */
    public static PendingIntent m19188a(Context context) {
        return m19189a(context, m19193a((int) C0126R.string.autofill_setup_summary_new, (int) C0126R.string.common_ok, (int) C0126R.string.close_button_label));
    }

    /* renamed from: a */
    public static PendingIntent m19189a(Context context, Intent intent) {
        return PendingIntent.getActivity(context, 0, intent, 134217728);
    }

    /* renamed from: a */
    public static PendingIntent m19190a(Context context, kcu kcu, FillForm fillForm) {
        return m19187a(7, context, kcu, fillForm, false);
    }

    /* renamed from: a */
    public static Intent m19191a() {
        return m19198b(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
    }

    /* renamed from: a */
    public static Intent m19192a(int i) {
        return m19198b(203).putExtra("com.google.android.gms.autofill.extra.INSTRUMENTATION_POSITION", i);
    }

    /* renamed from: a */
    public static Intent m19193a(int i, int i2, int i3) {
        return m19200c(503).putExtra("com.google.android.gms.autofill.extra.ALERT_MESSAGE", i).putExtra("com.google.android.gms.autofill.extra.POSITIVE_BUTTON_TEXT", i2).putExtra("com.google.android.gms.autofill.extra.NEGATIVE_BUTTON_TEXT", i3).addFlags(268435456);
    }

    /* renamed from: a */
    public static Intent m19194a(int i, bmxv bmxv) {
        Intent putExtra = m19198b(102).putExtra("com.google.android.gms.autofill.extra.SETTINGS_SOURCE", laa.m18841a(i));
        if (bmxv.mo66813a()) {
            putExtra.putExtra("com.google.android.gms.autofill.extra.METRICS_CONTEXT", lqx.m19547a((Parcelable) bmxv.mo66814b()));
        }
        return putExtra;
    }

    /* renamed from: a */
    private static Intent m19195a(int i, String str) {
        return new Intent().setComponent(new ComponentName("com.google.android.gms", str)).setAction(kwt.m18677a(i));
    }

    /* renamed from: a */
    public static Intent m19196a(AssistStructure assistStructure, Bundle bundle, int i) {
        return m19200c(14).putExtra("android.view.autofill.extra.ASSIST_STRUCTURE", assistStructure).putExtra("android.view.autofill.extra.CLIENT_STATE", bundle).putExtra("com.google.android.gms.autofill.extra.FILL_REQUEST_ID", i);
    }

    /* renamed from: a */
    public static Intent m19197a(Context context, FillForm fillForm) {
        akoz akoz = new akoz(context);
        akoz.mo39628b();
        akoz.mo39629b(true);
        akoz.mo39626a(true);
        akoz.mo39624a(2);
        Intent a = akoz.mo39623a();
        if (a != null) {
            return m19198b(22).putExtra("com.google.android.gms.autofill.extra.INTENT", lqx.m19547a(a)).putExtra("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL", lqx.m19547a(fillForm));
        }
        return null;
    }
}
