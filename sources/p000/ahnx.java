package p000;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: ahnx */
final /* synthetic */ class ahnx implements Callable {

    /* renamed from: a */
    private final InputStream f67642a;

    public ahnx(InputStream inputStream) {
        this.f67642a = inputStream;
    }

    public final Object call() {
        return Integer.valueOf(this.f67642a.read());
    }
}
