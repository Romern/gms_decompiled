package p000;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: aycv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aycv extends IOException {

    /* renamed from: a */
    public final IOException f97185a;

    public aycv(IOException iOException) {
        super(iOException);
        this.f97185a = iOException;
    }

    public final String getMessage() {
        return this.f97185a.getMessage();
    }

    public final StackTraceElement[] getStackTrace() {
        return this.f97185a.getStackTrace();
    }

    public final void printStackTrace() {
        bqye.m113758a(this.f97185a);
    }

    public final void printStackTrace(PrintStream printStream) {
        bqye.m113759a(this.f97185a, printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        bqye.m113760a(this.f97185a, printWriter);
    }
}
