package p000;

import com.google.android.gms.framework.tracing.AbstractGmsTracer;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: aaav */
public final /* synthetic */ class aaav implements blji {

    /* renamed from: a */
    private final Closeable f27860a;

    public aaav(Closeable closeable) {
        this.f27860a = closeable;
    }

    public final void close() {
        Closeable closeable = this.f27860a;
        int i = AbstractGmsTracer.f32469f;
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }
}
