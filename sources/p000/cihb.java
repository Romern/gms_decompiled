package p000;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;

/* renamed from: cihb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihb implements PrivilegedExceptionAction {
    public final /* bridge */ /* synthetic */ Object run() {
        return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
