package p000;

/* renamed from: xpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpi extends Exception {
    public xpi(String str) {
        super(String.format("AuthenticatorType %s not supported", str));
    }
}
