package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.cast.JGCastService;

/* renamed from: rwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rwx {

    /* renamed from: a */
    public final Context f43795a;

    /* renamed from: b */
    public boolean f43796b = true;

    public rwx(Context context) {
        this.f43795a = context;
    }

    /* renamed from: a */
    public final void mo25220a(RuntimeException runtimeException) {
        try {
            sqx.m36054a(this.f43795a, runtimeException, JGCastService.FLAG_PRIVATE_DISPLAY);
        } catch (RuntimeException e) {
            Log.e("SosLogRequestBuilder", "Couldn't log to dropbox.", e);
        }
    }
}
