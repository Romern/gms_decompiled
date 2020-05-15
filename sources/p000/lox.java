package p000;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: lox */
final /* synthetic */ class lox implements Callable {

    /* renamed from: a */
    private final Object f26518a;

    /* renamed from: b */
    private final bdyx f26519b;

    public lox(Object obj, bdyx bdyx) {
        this.f26518a = obj;
        this.f26519b = bdyx;
    }

    public final Object call() {
        Object obj = this.f26518a;
        bdyx bdyx = this.f26519b;
        int i = lpc.f26525e;
        while (!Objects.equals(obj, bdyx.mo58455c())) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        return true;
    }
}
