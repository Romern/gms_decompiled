package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.activity.OrchestrationDelegatorChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: awjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awjo extends awcd {

    /* renamed from: b */
    Toolbar f94552b;

    public awjo(OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity) {
        super(orchestrationDelegatorChimeraActivity);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.activity.OrchestrationDelegatorChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* renamed from: a */
    public final void mo51845a(Bundle bundle) {
        OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity = this.f94162a;
        awia.m79981a((Activity) orchestrationDelegatorChimeraActivity, orchestrationDelegatorChimeraActivity.mo51881h(), awia.f94387i, false);
        this.f94162a.mo51862a(bundle, awij.f94466n, 12, bpis.FLOW_TYPE_EMBEDDED_LANDING_PAGE);
    }

    /* renamed from: b */
    public final void mo51849b(Bundle bundle) {
        byte[] bArr;
        awcf.m79641a((dnx) this.f94162a);
        this.f94162a.setContentView((int) C0126R.C0128layout.wallet_activity_common);
        this.f94552b = (Toolbar) this.f94162a.findViewById(C0126R.C0129id.toolbar);
        this.f94162a.mo8626a(this.f94552b);
        this.f94162a.mo8628aW().mo15853b(true);
        if (((awjt) this.f94162a.mo51879e()) == null) {
            Intent intent = this.f94162a.getIntent();
            Bundle extras = intent.getExtras();
            if (extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                if (extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                    bArr = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                } else {
                    bArr = null;
                }
                BuyFlowConfig h = this.f94162a.mo51881h();
                OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity = this.f94162a;
                String str = orchestrationDelegatorChimeraActivity.f94163b;
                LogContext logContext = orchestrationDelegatorChimeraActivity.f94164c;
                sdo.checkIfNull(byteArrayExtra, "EmbeddedLandingPageParameters must not be null");
                awjt awjt = new awjt();
                Bundle a = awzk.m81653a(h, str, logContext);
                a.putByteArray("embeddedLandingPageParameters", byteArrayExtra);
                if (bArr != null) {
                    a.putByteArray("initializeToken", bArr);
                }
                awjt.setArguments(a);
                this.f94162a.mo51866a(awjt, (int) C0126R.C0129id.fragment_holder);
                return;
            }
            throw new IllegalArgumentException("EmbeddedLandingPage requires encrypted parameters");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awce.a(android.os.Parcelable, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      awce.a(int, android.content.Intent):void
      awce.a(android.view.View, rx):void
      awce.a(awzk, int):void
      awce.a(bmoc, boolean):void
      awib.a(bmoc, boolean):void
      awym.a(android.view.View, rx):void
      awce.a(android.os.Parcelable, boolean):void */
    /* renamed from: g */
    public final boolean mo51857g() {
        awjt awjt = (awjt) this.f94162a.mo51879e();
        if (awjt != null) {
            awjt.mo52873af();
            return true;
        }
        this.f94162a.mo51864a((Parcelable) null, false);
        return true;
    }
}
