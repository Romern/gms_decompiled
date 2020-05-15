package p000;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* renamed from: aszs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aszs {
    /* renamed from: a */
    public static Intent m75256a(askf askf, bmuw bmuw) {
        return IntentOperation.getStartIntent(askf.f89126d, "com.google.android.gms.tapandpay.issuer.CheckEligibilityIntentOperation", "com.google.android.gms.tapandpay.issuer.ACTION_CHECK_ELIGIBILITY").putExtra("extra_account_info", askf.mo49209a()).putExtra("extra_server_provisioning_session_id", bmuw.f130977a).putExtra("extra_client_provisioning_session_id", bmuw.f130978b);
    }

    /* renamed from: a */
    public static List m75257a() {
        return bngx.m109357a(btob.CAPABILITY_MAESTRO, btob.CAPABILITY_SAVE_TO_PLATFORM);
    }
}
