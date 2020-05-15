package p000;

import android.os.StrictMode;
import android.util.Log;

/* renamed from: bwap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwap {

    /* renamed from: a */
    public static final bwap f158670a = new bwap();

    /* renamed from: b */
    private static final String f158671b = bwap.class.getSimpleName();

    private bwap() {
    }

    /* renamed from: a */
    public final StrictMode.ThreadPolicy mo73410a() {
        if (bwam.m121655a(f158671b, 5)) {
            Log.w(f158671b, "Suppressed StrictMode policy violation: StrictModeDiskReadViolation");
        }
        return StrictMode.allowThreadDiskReads();
    }

    /* renamed from: b */
    public final StrictMode.ThreadPolicy mo73412b() {
        StrictMode.ThreadPolicy a = mo73410a();
        if (bwam.m121655a(f158671b, 5)) {
            Log.w(f158671b, "Suppressed StrictMode policy violation: StrictModeDiskWriteViolation");
        }
        StrictMode.allowThreadDiskWrites();
        return a;
    }

    /* renamed from: a */
    public final void mo73411a(StrictMode.ThreadPolicy threadPolicy) {
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
