package p000;

import com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload;
import com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: gjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gjn {
    /* renamed from: a */
    public static Status m13279a(Exception exc) {
        if (exc instanceof rjp) {
            return m13280a((rjp) exc);
        }
        if (exc instanceof ExecutionException) {
            Throwable cause = exc.getCause();
            if (cause instanceof rjp) {
                return m13280a((rjp) cause);
            }
        }
        return Status.f30109c;
    }

    /* renamed from: b */
    public static void m13286b(gto gto) {
        gto.mo12201a("com.google", 2);
    }

    /* renamed from: a */
    private static Status m13280a(rjp rjp) {
        return new Status(rjp.mo24655a());
    }

    /* renamed from: a */
    public static Object m13281a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new gji("null");
    }

    /* renamed from: a */
    public static void m13282a(gto gto) {
        m13284a(gto, "com.google");
    }

    /* renamed from: a */
    public static void m13283a(gto gto, AccountBootstrapPayload accountBootstrapPayload) {
        byte[] g = accountBootstrapPayload.mo59188g();
        sdo.m34959a((Object) "com.google");
        sdo.m34959a(g);
        gto.mo24732b(new gsz(new SendDataRequest("com.google", g)));
    }

    /* renamed from: a */
    public static void m13284a(gto gto, String str) {
        gto.mo12201a(str, 1);
    }

    /* renamed from: a */
    public static Object[] m13285a(Object[] objArr) {
        m13281a((Object) objArr);
        if (objArr.length != 0) {
            return objArr;
        }
        throw new gji("empty");
    }
}
