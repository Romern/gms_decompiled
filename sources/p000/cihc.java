package p000;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLParameters;

/* renamed from: cihc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihc implements PrivilegedExceptionAction {
    public final /* bridge */ /* synthetic */ Object run() {
        return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
    }
}
