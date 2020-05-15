package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: bdzt */
final /* synthetic */ class bdzt implements Runnable {

    /* renamed from: a */
    private final ExecutionException f106706a;

    public bdzt(ExecutionException executionException) {
        this.f106706a = executionException;
    }

    public final void run() {
        throw new RuntimeException(this.f106706a.getCause());
    }
}
