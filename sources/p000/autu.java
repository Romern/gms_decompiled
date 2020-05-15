package p000;

import android.content.SharedPreferences;
import com.google.android.gms.trustagent.trustlet.device.connectionlessble.internal.ConnectionlessBleTrustletChimeraService;

/* renamed from: autu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class autu implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final /* synthetic */ ConnectionlessBleTrustletChimeraService f92524a;

    public autu(ConnectionlessBleTrustletChimeraService connectionlessBleTrustletChimeraService) {
        this.f92524a = connectionlessBleTrustletChimeraService;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (auuj.m77855a(str) != null) {
            this.f92524a.mo59567y();
        }
    }
}
