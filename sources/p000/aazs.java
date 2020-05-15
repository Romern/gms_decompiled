package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: aazs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aazs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f56903a;

    public aazs(Context context) {
        this.f56903a = context;
    }

    public final void run() {
        String str;
        Context context = this.f56903a;
        int i = rfx.f42891a;
        try {
            str = addi.m50206a(context).mo33343a(ceeg.f182447a.mo6606a().mo78941I(), ceeg.f182447a.mo6606a().mo78943K());
        } catch (Exception e) {
            Log.w("gH_GcmTokenManager", "Could not get GCM token from IID.", e);
            str = null;
        }
        aazt.f56904a = str;
    }
}
