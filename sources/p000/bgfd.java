package p000;

import android.content.DialogInterface;
import com.google.android.location.network.NetworkConsentChimeraActivity;

/* renamed from: bgfd */
public final /* synthetic */ class bgfd implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final NetworkConsentChimeraActivity f116342a;

    public bgfd(NetworkConsentChimeraActivity networkConsentChimeraActivity) {
        this.f116342a = networkConsentChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        NetworkConsentChimeraActivity networkConsentChimeraActivity = this.f116342a;
        if (!networkConsentChimeraActivity.isFinishing()) {
            networkConsentChimeraActivity.finish();
        }
    }
}
