package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.config.FeatureRequestExtras;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WrapperControlledChimeraActivity extends jxf {

    /* renamed from: a */
    private static final sek f11456a = ght.m13171a("AddAccount", "WrapperControlledChimeraActivity");

    /* renamed from: b */
    private static final imr f11457b = imr.m15727a("intent");

    /* renamed from: a */
    public static Intent m7009a(Context context, boolean z, rrq rrq, Intent intent) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.WrapperControlledActivity");
        ims a = jxf.m17460a(rrq, z, (int) C0126R.string.auth_gls_name_checking_info_title);
        a.mo13148b(f11457b, intent);
        return className.putExtras(a.f21367a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "WrapperControlledActivity";
    }

    /* access modifiers changed from: protected */
    /* renamed from: ba */
    public final void mo7716ba() {
        if (gkf.f18388a.mo11981b(this)) {
            gkf.f18388a.mo11979a(this, (Intent) mo14202g().mo13146a(f11457b));
        } else {
            super.mo7716ba();
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo7874a(i2, intent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = (Intent) mo14202g().mo13146a(f11457b);
        bizc.m103024a(getIntent(), intent);
        if (gnv.m13557c() && rrk.m34295a(intent)) {
            ims ims = new ims();
            ims.mo13148b(jxx.f23496o, (Integer) mo14202g().mo13147a(jxx.f23496o, 0));
            ims.mo13148b(jxx.f23495n, (String) mo14202g().mo13146a(jxx.f23495n));
            Bundle bundle2 = ims.f21367a;
            if (jxx.m17492k()) {
                FeatureRequestExtras.RequestBuilder requestBuilder = new FeatureRequestExtras.RequestBuilder();
                requestBuilder.setSessionId((String) mo14202g().mo13146a(jxx.f23495n));
                requestBuilder.addToBundle(bundle2);
            }
            intent.putExtras(bundle2);
        }
        if (gkf.f18388a.mo11981b(this)) {
            gkf.f18388a.mo11978a((jwz) this);
        }
        if (getPackageManager().resolveActivity(intent, 0) == null) {
            sek sek = f11456a;
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Could not resolve intent: ");
            sb.append(valueOf);
            sek.mo25416d(sb.toString(), new Object[0]);
            mo7874a(0, null);
        }
        startActivityForResult(intent, 0);
    }
}
