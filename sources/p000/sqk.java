package p000;

import android.util.Log;
import java.io.IOException;

/* renamed from: sqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sqk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ sqm f44976a;

    public sqk(sqm sqm) {
        this.f44976a = sqm;
    }

    public final void run() {
        try {
            this.f44976a.mo25980b();
        } catch (IOException e) {
            Log.w("CachingFileWriter", "Failed to flush cache.", e);
        }
    }
}
