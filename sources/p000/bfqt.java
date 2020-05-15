package p000;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: bfqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfqt {

    /* renamed from: a */
    private static final HandlerThread f114940a;

    /* renamed from: b */
    private static asfb f114941b = null;

    /* renamed from: c */
    private static bfpj f114942c = null;

    static {
        HandlerThread handlerThread = new HandlerThread("FlpThread");
        f114940a = handlerThread;
        handlerThread.start();
    }

    /* renamed from: a */
    public static Looper m97589a() {
        return f114940a.getLooper();
    }

    /* renamed from: b */
    public static bfpj m97591b() {
        synchronized (f114940a) {
            if (f114942c == null) {
                f114942c = new bfpj((int) cevw.f183465a.mo6606a().eventLogSize());
            }
        }
        return f114942c;
    }

    /* renamed from: a */
    public static asfb m97590a(Context context) {
        asfb asfb;
        synchronized (f114940a) {
            if (f114941b == null) {
                asfb asfb2 = new asfb(context, 1, "GCoreFlp", "FusionThread", "com.google.android.gms");
                f114941b = asfb2;
                asfb2.mo49115a(true);
            }
            asfb = f114941b;
        }
        return asfb;
    }
}
