package p000;

import android.widget.CompoundButton;
import com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity;

/* renamed from: ajgi */
public final /* synthetic */ class ajgi implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final NearbyMessagesAppOptInChimeraActivity f70582a;

    public ajgi(NearbyMessagesAppOptInChimeraActivity nearbyMessagesAppOptInChimeraActivity) {
        this.f70582a = nearbyMessagesAppOptInChimeraActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f70582a.f80824a.setEnabled(!z);
    }
}
