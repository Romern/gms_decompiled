package p000;

import javax.net.ssl.SSLEngineResult;

/* renamed from: pki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final /* synthetic */ class pki {

    /* renamed from: a */
    static final /* synthetic */ int[] f39443a;

    /* renamed from: b */
    static final /* synthetic */ int[] f39444b;

    static {
        int[] iArr = new int[SSLEngineResult.Status.values().length];
        f39444b = iArr;
        try {
            iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f39444b[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f39444b[SSLEngineResult.Status.CLOSED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f39444b[SSLEngineResult.Status.OK.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
        f39443a = iArr2;
        try {
            iArr2[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f39443a[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f39443a[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
        }
    }
}
