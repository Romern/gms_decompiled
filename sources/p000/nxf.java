package p000;

import android.media.AudioFocusInfo;
import android.media.audiopolicy.AudioPolicy;

/* renamed from: nxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nxf extends AudioPolicy.AudioPolicyFocusListener {

    /* renamed from: a */
    final /* synthetic */ nxt f36855a;

    public nxf(nxt nxt) {
        this.f36855a = nxt;
    }

    public final void onAudioFocusGrant(AudioFocusInfo audioFocusInfo, int i) {
        this.f36855a.mo21807a(audioFocusInfo, i);
    }

    public final void onAudioFocusLoss(AudioFocusInfo audioFocusInfo, boolean z) {
        this.f36855a.mo21808a(audioFocusInfo, z);
    }
}
