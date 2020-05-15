package p000;

import org.webrtc.Logging;

/* renamed from: city */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class city {
    /* renamed from: a */
    public static final boolean m151012a(String str) {
        Logging.m151178a(citz.f191459a, str.length() == 0 ? new String("Loading library: ") : "Loading library: ".concat(str));
        try {
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            Logging.m151179a(citz.f191459a, str.length() == 0 ? new String("Failed to load native library: ") : "Failed to load native library: ".concat(str), e);
            return false;
        }
    }
}
