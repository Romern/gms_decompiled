package com.google.android.gms.auth.uiflows.common;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateCredentialsChimeraActivity extends jxf implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    public static final imr f11465a = imr.m15727a("token_handle");

    /* renamed from: b */
    public static final imr f11466b = imr.m15727a("succeeded");

    /* renamed from: c */
    private static final sek f11467c = ght.m13171a("UpdateCredentialsActivity");

    /* renamed from: d */
    private static final imr f11468d = imr.m15727a("account_type");

    /* renamed from: e */
    private static final imr f11469e = imr.m15727a("auth_code");

    /* renamed from: a */
    public static Intent m7035a(Context context, Account account, String str, boolean z, rrq rrq) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.common.UpdateCredentialsActivity");
        ims a = jxf.m17460a(rrq, z, (int) C0126R.string.auth_gls_name_checking_info_title);
        a.mo13148b(f11468d, account);
        a.mo13148b(f11469e, str);
        return className.putExtras(a.f21367a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "UpdateCredentialsActivity";
    }

    /* access modifiers changed from: protected */
    /* renamed from: ba */
    public final void mo7716ba() {
        if (gkf.f18388a.mo11981b(this)) {
            setTheme(C0126R.style.TvMinuteMaidOpaque);
        } else {
            super.mo7716ba();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (gkf.f18388a.mo11981b(this)) {
            setContentView(LayoutInflater.from(this).inflate((int) C0126R.C0128layout.auth_tv_suw_glif_activity, (ViewGroup) null));
        }
        getSupportLoaderManager().initLoader(0, null, this);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new jxk(this, (Account) mo14202g().mo13146a(f11468d), (String) mo14202g().mo13146a(f11469e), mo14203f().f43554c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Bundle bundle = (Bundle) obj;
        Account account = (Account) mo14202g().mo13146a(f11468d);
        if (bundle == null || !bundle.getBoolean(f11466b.f21366a)) {
            sek sek = f11467c;
            String valueOf = String.valueOf(account);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("Failed to update credentails for account: ");
            sb.append(valueOf);
            sek.mo25416d(sb.toString(), new Object[0]);
            mo7874a(0, null);
            return;
        }
        sek sek2 = f11467c;
        String valueOf2 = String.valueOf(account);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
        sb2.append("Updated credentials for account: ");
        sb2.append(valueOf2);
        sek2.mo25414c(sb2.toString(), new Object[0]);
        mo7874a(-1, new Intent().putExtras(bundle));
    }

    public final void onLoaderReset(Loader loader) {
    }
}
