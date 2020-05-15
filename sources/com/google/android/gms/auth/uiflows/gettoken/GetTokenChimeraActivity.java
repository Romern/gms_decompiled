package com.google.android.gms.auth.uiflows.gettoken;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetTokenChimeraActivity extends jxx implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    public static final imr f11515a = imr.m15727a("response");

    /* renamed from: b */
    public static final imr f11516b = imr.m15727a("isSupervisedMemberAccount");

    /* renamed from: c */
    public static final imr f11517c = imr.m15727a("request");

    /* renamed from: d */
    private static final imr f11518d = imr.m15727a("suppress_ui");

    /* renamed from: a */
    public static Intent m7063a(Context context, TokenRequest tokenRequest, boolean z, boolean z2, rrq rrq) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.gettoken.GetTokenActivity");
        ims ims = new ims();
        ims.mo13148b(f11517c, tokenRequest);
        ims.mo13148b(f11518d, Boolean.valueOf(z));
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(z2));
        ims.mo13148b(jwz.f23428i, rrq.mo25045a());
        return className.putExtras(ims.f21367a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "GetTokenActivity";
    }

    /* access modifiers changed from: protected */
    /* renamed from: ba */
    public final void mo7716ba() {
        if (((Boolean) mo14202g().mo13147a(f11518d, false)).booleanValue()) {
            setTheme(C0126R.style.InvisibleCustomTitle);
        } else {
            setTheme(2132019672);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!((Boolean) mo14202g().mo13147a(f11518d, false)).booleanValue() && bundle == null) {
            jxg jxg = new jxg();
            ims ims = new ims();
            ims.mo13148b(jxg.f23444b, Integer.valueOf((int) C0126R.string.auth_gls_name_checking_info_title));
            jxg.setArguments(ims.f21367a);
            jxg.show(getSupportFragmentManager(), "dialog");
        }
        getSupportLoaderManager().initLoader(0, null, this);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new jxz(this, this, cbxl.f178517a.mo6606a().mo75580b());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mo7874a(-1, new Intent().putExtras((Bundle) obj));
    }

    public final void onLoaderReset(Loader loader) {
    }

    static {
        imr.m15727a("consent_intent");
    }
}
