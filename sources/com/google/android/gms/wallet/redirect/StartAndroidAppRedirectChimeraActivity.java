package com.google.android.gms.wallet.redirect;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StartAndroidAppRedirectChimeraActivity extends StartAndroidAppRedirectActivity {

    /* renamed from: f */
    private BuyFlowConfig f110318f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo59964a(ViewGroup viewGroup) {
        int i;
        boolean z;
        bxvd da = bmdb.f128767k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmdb bmdb = (bmdb) da.f164949b;
        bmdb.f128769a |= 2;
        bmdb.f128771c = true;
        if (getString(17039370) != null) {
            String string = getString(17039370);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdb bmdb2 = (bmdb) da.f164949b;
            string.getClass();
            bmdb2.f128769a |= 8;
            bmdb2.f128773e = string;
        }
        bmdb bmdb3 = (bmdb) da.mo74062i();
        LayoutInflater from = LayoutInflater.from(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.f7434xccc0db8c);
        BuyFlowConfig buyFlowConfig = this.f110318f;
        if (buyFlowConfig != null) {
            i = buyFlowConfig.f110418b.f110412g;
        } else {
            i = 0;
        }
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{C0126R.attr.internalUicUseGoogleMaterial2Theme});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        return bkbs.m105282a(bmdb3, 3, this, null, null, from, viewGroup, dimensionPixelSize, dimensionPixelSize, C0126R.C0129id.ok_button, z2, z).mo52710b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.redirect.StartAndroidAppRedirectChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo59965b(Intent intent) {
        awia.m79981a((Activity) this, this.f110318f, awia.f94389k, true);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        this.f110318f = (BuyFlowConfig) getIntent().getParcelableExtra("buyFlowConfig");
        super.onCreate(bundle);
    }
}
