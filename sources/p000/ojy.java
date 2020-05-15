package p000;

import javax.net.ssl.SSLEngineResult;

/* renamed from: ojy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final /* synthetic */ class ojy {

    /* renamed from: a */
    static final /* synthetic */ int[] f37821a;

    /* renamed from: b */
    static final /* synthetic */ int[] f37822b;

    static {
        int[] iArr = new int[SSLEngineResult.Status.values().length];
        f37822b = iArr;
        try {
            iArr[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f37822b[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f37822b[SSLEngineResult.Status.OK.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f37822b[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
        f37821a = iArr2;
        try {
            iArr2[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f37821a[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f37821a[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f37821a[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError e8) {
        }
        try {
            f37821a[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
        } catch (NoSuchFieldError e9) {
        }
    }
}
