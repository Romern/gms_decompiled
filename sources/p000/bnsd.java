package p000;

/* renamed from: bnsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnsd extends Exception {
    public bnsd(Throwable th, bnsk bnsk, StackTraceElement[] stackTraceElementArr) {
        super(bnsk.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    public final Throwable fillInStackTrace() {
        return this;
    }
}
