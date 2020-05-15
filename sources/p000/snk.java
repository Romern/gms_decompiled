package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: snk */
final /* synthetic */ class snk implements Runnable {

    /* renamed from: a */
    private final ExecutionException f44797a;

    /* renamed from: b */
    private final String f44798b;

    public snk(ExecutionException executionException, String str) {
        this.f44797a = executionException;
        this.f44798b = str;
    }

    public final void run() {
        ExecutionException executionException = this.f44797a;
        String str = this.f44798b;
        Throwable cause = executionException.getCause();
        if (cause instanceof Error) {
            String valueOf = String.valueOf(str);
            throw new bqfc(valueOf.length() == 0 ? new String("rethrowing error from ") : "rethrowing error from ".concat(valueOf), (Error) cause);
        } else {
            String valueOf2 = String.valueOf(str);
            throw new bqhh(valueOf2.length() == 0 ? new String("rethrowing exception from ") : "rethrowing exception from ".concat(valueOf2), cause);
        }
    }
}
