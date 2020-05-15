package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.service.autofill.CustomDescription;
import android.service.autofill.SaveInfo;
import android.service.autofill.Validators;
import android.view.autofill.AutofillId;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.metrics.MetricsContext;

/* renamed from: lck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lck extends lbm {
    public lck(Context context, kpk kpk, kbe kbe, lhi lhi) {
        super(context, kpk, kbe, lhi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14963a(lcf lcf, FillField fillField, FillField fillField2) {
        RemoteViews remoteViews;
        int i;
        int i2;
        bmxv bmxv;
        int i3;
        int i4;
        lcf lcf2 = lcf;
        FillField fillField3 = fillField;
        FillField fillField4 = fillField2;
        if (fillField3 == null || fillField4 == null) {
            return bqga.m112775a(bmvz.f131120a);
        }
        AutofillId autofillId = fillField3.f11631a;
        AutofillId autofillId2 = fillField4.f11631a;
        int i5 = Build.VERSION.SDK_INT;
        SaveInfo.Builder builder = new SaveInfo.Builder(1);
        builder.setOptionalIds(new AutofillId[]{autofillId, autofillId2});
        builder.setFlags(1);
        boolean z = !this.f25738d.mo14344a().mo66813a();
        byte[] k = lcf2.f25782f.mo66813a() ? m18899a((MetricsContext) lcf2.f25782f.mo66814b(), lcf2.f25778b, z).mo73642k() : new byte[0];
        if (!z) {
            Intent a = kyu.m18809a(this.f25736b, lcf2.f25778b.f11643c, lcf2.f25777a, laz.CREDENTIAL, k);
            if (a != null) {
                PendingIntent service = PendingIntent.getService(this.f25736b, 0, a, 134217728);
                if (cciw.m129957f()) {
                    i4 = mo14964b(lcf2.f25777a.f23817a);
                } else {
                    i4 = lhj.m19079a(this.f25739e, lcf2.f25777a.f23817a) ? 1 : 0;
                }
                builder.setNegativeAction(i4, service.getIntentSender());
            }
        } else {
            Context context = this.f25736b;
            if (ccjf.m130040j()) {
                bmxv = bmxv.m108566b(lcf2.f25777a);
            } else {
                bmxv = bmvz.f131120a;
            }
            Intent a2 = kyu.m18808a(context, bmxv, k);
            if (a2 != null) {
                PendingIntent service2 = PendingIntent.getService(this.f25736b, 0, a2, 134217728);
                if (ccjf.m130039i()) {
                    i3 = mo14961a(lcf2.f25777a.f23817a);
                } else {
                    i3 = this.f25739e.mo15084d() >= lhi.f26105c + -1 ? 1 : 0;
                }
                builder.setNegativeAction(i3, service2.getIntentSender());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        builder.setValidator(Validators.and(kcc.m17626a(autofillId, lqy.f26616a), kcc.m17626a(autofillId2, lqy.f26616a)));
        int i7 = Build.VERSION.SDK_INT;
        boolean a3 = bmxi.m108538a(fillField4.f11631a, fillField3.f11631a);
        if (ccjf.m130032b()) {
            remoteViews = lbj.m18889a(this.f25736b, this.f25737c.mo14764a(lcf2.f25777a).f24746b, z);
        } else {
            remoteViews = lbj.m18889a(this.f25736b, null, false);
        }
        if (!a3) {
            CustomDescription.Builder builder2 = new CustomDescription.Builder(remoteViews);
            if (ccjf.m130033c()) {
                i = qkj.m32287a(this.f25736b, C0126R.C0129id.username_value);
            } else {
                i = 16908308;
            }
            CustomDescription.Builder addChild = builder2.addChild(i, kcb.m17625a(autofillId, lqy.f26616a, "$0"));
            if (ccjf.m130033c()) {
                i2 = qkj.m32287a(this.f25736b, C0126R.C0129id.password_value);
            } else {
                i2 = 16908309;
            }
            builder.setCustomDescription(addChild.addChild(i2, kcb.m17625a(autofillId2, lqy.f26617b, "•")).build());
        }
        int i8 = Build.VERSION.SDK_INT;
        if (lcf2.f25778b.f11642b.mo66813a()) {
            builder.setTriggerId(((FillField) lcf2.f25778b.f11642b.mo66814b()).f11631a);
        }
        return bqga.m112775a(bmxv.m108566b(lcg.m18921a(builder.build())));
    }
}
