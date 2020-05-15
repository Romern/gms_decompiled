package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.provider.Settings;
import android.util.Log;
import com.google.android.location.network.NetworkLocationProvider;

/* renamed from: bgfg */
public final /* synthetic */ class bgfg implements aerc {

    /* renamed from: a */
    private final NetworkLocationProvider f116345a;

    public bgfg(NetworkLocationProvider networkLocationProvider) {
        this.f116345a = networkLocationProvider;
    }

    /* renamed from: a */
    public final void mo9721a(int i, int i2) {
        NetworkLocationProvider networkLocationProvider = this.f116345a;
        boolean z = true;
        boolean z2 = false;
        if (rfx.m33540d(networkLocationProvider.f150824a)) {
            aeri.m52432a(networkLocationProvider.f150824a, false, aerk.ALLOWED, 1, new int[0]);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (!((UserManager) networkLocationProvider.f150824a.getSystemService("user")).isDemoUser()) {
            int i4 = Build.VERSION.SDK_INT;
            if ((i2 == 3 || i2 == 2) && !aeri.m52434a(networkLocationProvider.f150824a)) {
                int i5 = Build.VERSION.SDK_INT;
                if (cevw.f183465a.mo6606a().fixGlsConsentAtv()) {
                    sre.m36088h(networkLocationProvider.f150824a);
                }
                int i6 = Settings.Secure.getInt(networkLocationProvider.f150824a.getContentResolver(), "location_changer", 0);
                Settings.Secure.putInt(networkLocationProvider.f150824a.getContentResolver(), "location_changer", 0);
                if (i6 == 2 && aepp.m52355a(networkLocationProvider.f150824a)) {
                    Log.i("NLP", "showing nlp consent dialog");
                    aepp.m52362e(networkLocationProvider.f150824a);
                    if (i2 != 2) {
                        i2 = 3;
                    }
                    bmxy.m108588a(true);
                    if (!rfx.m33540d(networkLocationProvider.f150824a) && !ssh.m36213a(networkLocationProvider.f150824a).mo26045d()) {
                        if (!srs.m36151c(networkLocationProvider.f150824a) || srs.m36149a(networkLocationProvider.f150824a)) {
                            z = false;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        Bundle applicationRestrictions = ((RestrictionsManager) networkLocationProvider.f150824a.getSystemService("restrictions")).getApplicationRestrictions();
                        if (applicationRestrictions != null) {
                            z2 = applicationRestrictions.getBoolean("suppressLocationDialog", false);
                        }
                        if (!aeri.m52434a(networkLocationProvider.f150824a) && !z2) {
                            int i8 = Build.VERSION.SDK_INT;
                            Context context = networkLocationProvider.f150824a;
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName(context, "com.google.android.location.network.NetworkConsentActivity"));
                            intent.putExtra("confirmLgaayl", z);
                            intent.putExtra("newMode", i2);
                            intent.setFlags(268435456);
                            networkLocationProvider.f150824a.startActivity(intent);
                        } else if (z) {
                            Intent intent2 = new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS");
                            intent2.setFlags(268435456);
                            networkLocationProvider.f150824a.startActivity(intent2);
                        }
                    }
                }
            }
        } else {
            aeri.m52432a(networkLocationProvider.f150824a, true, aerk.ALLOWED, 1, new int[0]);
        }
    }
}
