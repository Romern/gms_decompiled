package p000;

import android.app.PendingIntent;
import android.util.Log;

/* renamed from: agz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agz {
    /* renamed from: a */
    static final /* synthetic */ boolean m750a(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
            return true;
        } catch (PendingIntent.CanceledException e) {
            Log.w("InlineRenderer", "Attribution intent cancelled");
            return false;
        }
    }
}
