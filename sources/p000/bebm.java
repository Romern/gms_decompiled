package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;

/* renamed from: bebm */
final /* synthetic */ class bebm implements rka {

    /* renamed from: a */
    static final rka f106871a = new bebm();

    private bebm() {
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        Log.e("RocketImpressions", String.format(Locale.US, "ClearcutLogger connection failed: %s", connectionResult));
    }
}
