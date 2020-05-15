package com.google.android.gms.wallet.p082im;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.setupwizard.WalletGlifLayout;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: com.google.android.gms.wallet.im.SetupWizardImRootChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWizardImRootChimeraActivity extends ImRootChimeraActivity implements awib {

    /* renamed from: o */
    WalletGlifLayout f110257o;

    /* renamed from: p */
    private bmno f110258p;

    /* renamed from: a */
    public final void mo51861a(Bundle bundle) {
        bundle.putBoolean("savedSpinnerState", mo51880g());
    }

    /* renamed from: a */
    public final void mo51867a(bmoc bmoc, boolean z) {
    }

    /* renamed from: a */
    public final void mo51868a(String str) {
    }

    /* renamed from: b */
    public final void mo51871b(Bundle bundle) {
        mo51872b(bundle.getBoolean("savedSpinnerState"));
    }

    /* renamed from: g */
    public final boolean mo51880g() {
        WalletGlifLayout walletGlifLayout = this.f110257o;
        return walletGlifLayout != null && walletGlifLayout.mo71369h();
    }

    public final void onCreate(Bundle bundle) {
        this.f110247m = false;
        this.f110248n = false;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("com.google.android.gms.wallet.im.SetupWizardImRootChimeraActivity.EXTRA_GLIF_ICON")) {
            this.f110258p = (bmno) bjvp.m104729a(intent, "com.google.android.gms.wallet.im.SetupWizardImRootChimeraActivity.EXTRA_GLIF_ICON", (bxxk) bmno.f130138m.mo74142c(7));
            mo59944u();
        }
    }

    /* access modifiers changed from: protected */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        WalletGlifLayout walletGlifLayout = this.f110257o;
        if (walletGlifLayout != null) {
            walletGlifLayout.mo71363a(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo52134t() {
        return C0126R.C0128layout.wallet_activity_setupwizard_instrument_manager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo59944u() {
        String str;
        Drawable drawable;
        WalletGlifLayout walletGlifLayout = (WalletGlifLayout) findViewById(C0126R.C0129id.setup_wizard_layout);
        this.f110257o = walletGlifLayout;
        if (walletGlifLayout != null) {
            bmno bmno = this.f110258p;
            if (bmno == null) {
                drawable = bkfr.m105626l(this);
                C1173lt.m19601a(drawable, this.f110257o.f151481g);
                str = getResources().getString(C0126R.string.wallet_activity_default_title);
            } else {
                drawable = ImageWithCaptionView.m118565a(bmno, this);
                str = this.f110258p.f130149j;
            }
            this.f110257o.mo71362a(drawable);
            ((bjae) this.f110257o.mo71342a(bjae.class)).mo64939a(str);
            this.f110257o.mo71363a(getTitle());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo59945v() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final awmv mo59946w() {
        boolean z;
        boolean z2 = true;
        if (((ImRootChimeraActivity) this).f110243i != null) {
            BuyFlowConfig h = mo51881h();
            String str = this.f94163b;
            bmsf bmsf = ((ImRootChimeraActivity) this).f110243i;
            boolean z3 = ((ImRootChimeraActivity) this).f110245k;
            boolean z4 = ((ImRootChimeraActivity) this).f110246l;
            LogContext logContext = this.f94164c;
            boolean z5 = this.f110247m;
            boolean z6 = this.f110248n;
            if (bmsf != null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34971a(z, (Object) "ActionToken must not be null.");
            bmrv bmrv = bmsf.f130665c;
            if (bmrv == null) {
                bmrv = bmrv.f130586g;
            }
            if ((bmrv.f130588a & 2) == 0) {
                z2 = false;
            }
            sdo.m34971a(z2, (Object) "ActionToken must have a ResponseContext.");
            awna awna = new awna();
            Bundle a = awzk.m81653a(h, str, logContext);
            bjvp.m104736a(a, "actionToken", bmsf);
            a.putBoolean("isDialog", z3);
            a.putBoolean("showCancelButton", z4);
            a.putBoolean("showTitleInHeader", z5);
            a.putBoolean("showHeaderSeparator", z6);
            awna.setArguments(a);
            return awna;
        }
        BuyFlowConfig h2 = mo51881h();
        String str2 = this.f94163b;
        byte[] bArr = ((ImRootChimeraActivity) this).f110244j;
        boolean z7 = ((ImRootChimeraActivity) this).f110245k;
        boolean z8 = ((ImRootChimeraActivity) this).f110246l;
        LogContext logContext2 = this.f94164c;
        if (bArr == null) {
            z2 = false;
        }
        sdo.m34971a(z2, (Object) "InstrumentManager parameters must not be null.");
        awna awna2 = new awna();
        Bundle a2 = awzk.m81653a(h2, str2, logContext2);
        a2.putByteArray("instrumentManagerParams", bArr);
        a2.putBoolean("isDialog", z7);
        a2.putBoolean("showCancelButton", z8);
        awna2.setArguments(a2);
        return awna2;
    }

    /* renamed from: b */
    public final void mo51872b(boolean z) {
        WalletGlifLayout walletGlifLayout = this.f110257o;
        if (walletGlifLayout != null) {
            walletGlifLayout.mo71364b(z);
        }
    }
}
