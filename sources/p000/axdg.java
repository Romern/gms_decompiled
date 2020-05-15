package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.activity.OrchestrationDelegatorChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.webview.WebViewWidgetResult;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: axdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axdg extends awcd {
    public axdg(OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity) {
        super(orchestrationDelegatorChimeraActivity);
    }

    /* renamed from: a */
    public static Intent m82385a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent a = OrchestrationDelegatorChimeraActivity.m93799a(context, intent, buyFlowConfig);
        a.setAction("com.google.android.gms.wallet.firstparty.ACTION_WEB_VIEW_WIDGET");
        return a;
    }

    /* renamed from: b */
    public final void mo51849b(Bundle bundle) {
        awcf.m79641a((dnx) this.f94162a);
        this.f94162a.setContentView((int) C0126R.C0128layout.wallet_activity_common);
        OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity = this.f94162a;
        orchestrationDelegatorChimeraActivity.mo8626a((Toolbar) orchestrationDelegatorChimeraActivity.findViewById(C0126R.C0129id.toolbar));
        boolean z = true;
        this.f94162a.mo8628aW().mo15853b(true);
        if (((axdk) this.f94162a.mo51879e()) == null) {
            Intent intent = this.f94162a.getIntent();
            Bundle extras = intent.getExtras();
            if (!extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS") && !extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS")) {
                z = false;
            }
            sdo.m34974b(z);
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
            BuyFlowConfig h = this.f94162a.mo51881h();
            OrchestrationDelegatorChimeraActivity orchestrationDelegatorChimeraActivity2 = this.f94162a;
            String str = orchestrationDelegatorChimeraActivity2.f94163b;
            LogContext logContext = orchestrationDelegatorChimeraActivity2.f94164c;
            sdo.m34966a(byteArrayExtra, "Params must not be null.");
            axdk axdk = new axdk();
            Bundle a = awzk.m81653a(h, str, logContext);
            a.putByteArray("parameters", byteArrayExtra);
            axdk.setArguments(a);
            this.f94162a.mo51866a(axdk, (int) C0126R.C0129id.fragment_holder);
        }
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
        this.f94162a.mo51862a(bundle, awij.f94471s, 36, bpis.FLOW_TYPE_WEB_VIEW_WIDGET);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo51856a(Parcelable parcelable, boolean z) {
        byte[] bArr;
        WebViewWidgetResult webViewWidgetResult = (WebViewWidgetResult) parcelable;
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_REFRESH", z);
        if (!(webViewWidgetResult == null || (bArr = webViewWidgetResult.f110597a) == null || bArr.length <= 0)) {
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
        }
        this.f94162a.mo51859a(-1, intent);
        return true;
    }
}
