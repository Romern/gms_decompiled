package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfm {
    /* renamed from: a */
    public static void m79848a(BuyFlowConfig buyFlowConfig, Intent intent, int i) {
        if (m79849a(buyFlowConfig)) {
            awah.m79565a(intent, new Status(i));
        } else {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
        }
    }

    /* renamed from: a */
    public static boolean m79849a(BuyFlowConfig buyFlowConfig) {
        Bundle bundle;
        ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
        if (applicationParameters == null || (bundle = applicationParameters.f110408c) == null) {
            return false;
        }
        return bundle.getBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", false);
    }
}
