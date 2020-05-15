package p000;

import android.net.ConnectivityManager;
import android.os.ResultReceiver;

/* renamed from: afbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbs extends ConnectivityManager.OnStartTetheringCallback {

    /* renamed from: a */
    private final ResultReceiver f64157a;

    public afbs(ResultReceiver resultReceiver) {
        this.f64157a = resultReceiver;
    }

    public final void onTetheringFailed() {
        this.f64157a.send(1, null);
    }

    public final void onTetheringStarted() {
        this.f64157a.send(0, null);
    }
}
