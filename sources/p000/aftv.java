package p000;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: aftv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aftv {
    /* renamed from: a */
    static Exception m53544a(Exception exc) {
        if (exc instanceof ExecutionException) {
            ExecutionException executionException = (ExecutionException) exc;
            bmxj bmxj = aftu.f64733a;
            Throwable cause = executionException.getCause();
            bmxy.m108582a(cause, "Execution exceptions must have a cause!");
            return cause instanceof Exception ? (Exception) bmxj.apply((Exception) cause) : executionException;
        } else if (!(exc instanceof chux)) {
            return exc instanceof IOException ? new afxq(exc) : exc;
        } else {
            chuv chuv = ((chux) exc).f189238a;
            chus chus = chus.OK;
            int ordinal = chuv.f189233s.ordinal();
            if (ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 14) {
                return new afxt(exc);
            }
            if (ordinal != 16) {
                return new afxq(exc);
            }
            return new afxp(exc);
        }
    }

    /* renamed from: b */
    public static bqgg m53545b(Exception exc) {
        return bqga.m112777a((Throwable) m53544a(exc));
    }
}
