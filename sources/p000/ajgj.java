package p000;

import android.content.DialogInterface;
import com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity;

/* renamed from: ajgj */
public final /* synthetic */ class ajgj implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final NearbyMessagesAppOptInChimeraActivity f70583a;

    public ajgj(NearbyMessagesAppOptInChimeraActivity nearbyMessagesAppOptInChimeraActivity) {
        this.f70583a = nearbyMessagesAppOptInChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f70583a.mo44379a();
    }
}
