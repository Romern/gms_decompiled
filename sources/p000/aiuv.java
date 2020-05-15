package p000;

import android.net.wifi.aware.IdentityChangedListener;

/* renamed from: aiuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiuv extends IdentityChangedListener {
    public final void onIdentityChanged(byte[] bArr) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aiuv", "onIdentityChanged", 1111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("The WiFi Aware mac address has changed.");
    }
}
