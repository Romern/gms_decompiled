package p000;

import java.io.IOException;
import java.util.HashSet;

/* renamed from: bace */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bace {

    /* renamed from: a */
    public static final bnic f100466a = bnic.m109491a(bqak.BAD_AUTHENTICATION, bqak.NETWORK_ERROR, bqak.AUTH_INTERNAL_ERROR);

    /* renamed from: a */
    static bqak m86560a(Exception exc) {
        HashSet hashSet = new HashSet();
        for (Throwable th : bmzo.m108691c(exc)) {
            hashSet.add(th.getClass());
        }
        if ((bmzo.m108688b(exc) instanceof IOException) && exc.getMessage() != null && exc.getMessage().contains("NetworkError")) {
            return bqak.NETWORK_ERROR;
        }
        if (bmzo.m108688b(exc) instanceof IOException) {
            return bqak.IO_EXCEPTION;
        }
        if (hashSet.contains(badu.class) && exc.getMessage() != null && exc.getMessage().contains("BadAuthentication")) {
            return bqak.BAD_AUTHENTICATION;
        }
        if (hashSet.contains(badu.class)) {
            return bqak.USER_RECOVERABLE_AUTH_EXCEPTION;
        }
        if (hashSet.contains(badt.class) && exc.getMessage() != null && exc.getMessage().contains("InternalError")) {
            return bqak.AUTH_INTERNAL_ERROR;
        }
        if (hashSet.contains(badt.class)) {
            return bqak.AUTH_EXCEPTION;
        }
        return bqak.UNDEFINED;
    }
}
