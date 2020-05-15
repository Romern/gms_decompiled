package p000;

import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.activity.OrchestrationDelegatorChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: awnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awnq extends awcd {
    public awnq(OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity) {
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
        awia.m79981a((Activity) orchestrationDelegatorChimeraActivity, orchestrationDelegatorChimeraActivity.mo51881h(), awia.f94383e, true);
        this.f94162a.mo51862a(bundle, awij.f94470r, 15, bpis.FLOW_TYPE_INVOICE_SUMMARY);
    }

    /* renamed from: b */
    public final void mo51849b(Bundle bundle) {
        awnu awnu;
        awcf.m79641a((dnx) this.f94162a);
        this.f94162a.setContentView((int) C0126R.C0128layout.wallet_activity_common);
        OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity = this.f94162a;
        orchestrationDelegatorChimeraActivity.mo8626a((Toolbar) orchestrationDelegatorChimeraActivity.findViewById(C0126R.C0129id.toolbar));
        this.f94162a.mo8628aW().mo15853b(true);
        if (((awnu) this.f94162a.mo51879e()) == null) {
            Intent intent = this.f94162a.getIntent();
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
            if (byteArrayExtra != null) {
                BuyFlowConfig h = this.f94162a.mo51881h();
                OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity2 = this.f94162a;
                String str = orchestrationDelegatorChimeraActivity2.f94163b;
                LogContext logContext = orchestrationDelegatorChimeraActivity2.f94164c;
                sdo.checkIfNull(byteArrayExtra, "Encrypted params must not be null.");
                awnu = new awnu();
                Bundle a = awzk.m81653a(h, str, logContext);
                a.putByteArray("parameters", byteArrayExtra);
                awnu.setArguments(a);
            } else if (byteArrayExtra2 != null) {
                BuyFlowConfig h2 = this.f94162a.mo51881h();
                OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity3 = this.f94162a;
                String str2 = orchestrationDelegatorChimeraActivity3.f94163b;
                LogContext logContext2 = orchestrationDelegatorChimeraActivity3.f94164c;
                sdo.checkIfNull(byteArrayExtra2, "Initialization token must not be null.");
                awnu = new awnu();
                Bundle a2 = awzk.m81653a(h2, str2, logContext2);
                a2.putByteArray("initializeToken", byteArrayExtra2);
                awnu.setArguments(a2);
            } else {
                throw new IllegalArgumentException("Invoice summary requires either encrypted params or initialize token");
            }
            this.f94162a.mo51866a(awnu, (int) C0126R.C0129id.fragment_holder);
        }
    }
}
