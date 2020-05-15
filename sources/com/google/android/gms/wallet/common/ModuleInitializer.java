package com.google.android.gms.wallet.common;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wallet.service.WalletGcmTaskChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {

    /* renamed from: a */
    static final String[] f110041a = {"com.google.android.gms.wallet.cache.MerchantCache", "com.google.android.gms.wallet.fragment.WalletFragment.PREFS", "com.google.android.gms.wallet.service.ow.LocalPreAuth", "com.google.android.gms.wallet.service.ow.TransactionContextStorage", "FabExperimentPrefsFile"};

    public ModuleInitializer() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awsp.a(android.content.SharedPreferences, boolean):java.lang.String
     arg types: [android.content.SharedPreferences, int]
     candidates:
      awsp.a(android.os.Parcelable$Creator, java.lang.String):android.os.Parcelable
      awsp.a(android.content.SharedPreferences, boolean):java.lang.String */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        if (((Boolean) awie.f94428x.mo58455c()).booleanValue()) {
            int i = spn.f44932a;
            awsp.m80969a(awsp.m80965a(false), false);
        }
    }

    public ModuleInitializer(Context context) {
        attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        WalletGcmTaskChimeraService.m94097a(this);
        for (String str : f110041a) {
            getSharedPreferences(str, 0).edit().clear().apply();
        }
    }
}
