package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.service.autofill.CustomDescription;
import android.service.autofill.SaveInfo;
import android.view.autofill.AutofillId;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.metrics.MetricsContext;

/* renamed from: lbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lbn extends lbm {
    public lbn(Context context, kpk kpk, kbe kbe, lhi lhi) {
        super(context, kpk, kbe, lhi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14963a(lcf lcf, FillField fillField, FillField fillField2) {
        RemoteViews remoteViews;
        int i;
        bmxv bmxv;
        if (fillField2 == null || fillField != null) {
            return bqga.m112775a(bmvz.f131120a);
        }
        AutofillId autofillId = fillField2.f11631a;
        int i2 = 1;
        SaveInfo.Builder flags = new SaveInfo.Builder(1, new AutofillId[]{autofillId}).setFlags(1);
        boolean z = !this.f25738d.mo14344a().mo66813a();
        byte[] k = lcf.f25782f.mo66813a() ? m18899a((MetricsContext) lcf.f25782f.mo66814b(), lcf.f25778b, z).serializeToBytes() : new byte[0];
        if (!z) {
            Intent a = kyu.m18809a(this.f25736b, lcf.f25778b.f11643c, lcf.f25777a, laz.CREDENTIAL, k);
            if (a != null) {
                PendingIntent service = PendingIntent.getService(this.f25736b, 0, a, 134217728);
                if (cciw.m129957f()) {
                    i2 = mo14964b(lcf.f25777a.f23817a);
                } else if (!lhj.m19079a(this.f25739e, lcf.f25777a.f23817a)) {
                    i2 = 0;
                }
                flags.setNegativeAction(i2, service.getIntentSender());
            }
        } else {
            Context context = this.f25736b;
            if (ccjf.m130040j()) {
                bmxv = bmxv.m108566b(lcf.f25777a);
            } else {
                bmxv = bmvz.f131120a;
            }
            Intent a2 = kyu.m18808a(context, bmxv, k);
            if (a2 != null) {
                PendingIntent service2 = PendingIntent.getService(this.f25736b, 0, a2, 134217728);
                if (ccjf.m130039i()) {
                    i2 = mo14961a(lcf.f25777a.f23817a);
                } else if (this.f25739e.mo15084d() < lhi.f26105c - 1) {
                    i2 = 0;
                }
                flags.setNegativeAction(i2, service2.getIntentSender());
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (ccjf.m130032b()) {
            remoteViews = lbj.m18894b(this.f25736b, this.f25737c.mo14764a(lcf.f25777a).f24746b, z);
        } else {
            remoteViews = lbj.m18894b(this.f25736b, null, false);
        }
        SaveInfo.Builder validator = flags.setValidator(kcc.m17626a(autofillId, lqy.f26616a));
        CustomDescription.Builder builder = new CustomDescription.Builder(remoteViews);
        if (ccjf.m130033c()) {
            i = qkj.m32287a(this.f25736b, C0126R.C0129id.password_value);
        } else {
            i = 16908309;
        }
        validator.setCustomDescription(builder.addChild(i, kcb.m17625a(autofillId, lqy.f26617b, "•")).build());
        return bqga.m112775a(bmxv.m108566b(lcg.m18921a(flags.build())));
    }
}
