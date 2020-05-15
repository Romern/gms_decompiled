package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: meo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class meo extends Thread {

    /* renamed from: a */
    private static final lvn f33524a = new lvn("D2dFileWritingThread");

    /* renamed from: b */
    private final InputStream f33525b;

    /* renamed from: c */
    private final OutputStream f33526c;

    /* renamed from: d */
    private boolean f33527d;

    /* renamed from: e */
    private boolean f33528e;

    public meo(InputStream inputStream, OutputStream outputStream) {
        this.f33525b = inputStream;
        this.f33526c = outputStream;
    }

    /* renamed from: a */
    public final synchronized boolean mo19882a() {
        return this.f33528e;
    }

    public final void run() {
        InputStream inputStream;
        synchronized (this) {
            sdo.m34970a(!this.f33527d);
            this.f33527d = true;
        }
        try {
            srz.m36172a(this.f33525b, this.f33526c);
            this.f33525b.close();
            this.f33526c.close();
            synchronized (this) {
                this.f33528e = true;
            }
            inputStream = this.f33525b;
        } catch (IOException e) {
            try {
                f33524a.mo25417e("Failed while writing to d2d file. %s", e, new Object[0]);
                inputStream = this.f33525b;
            } catch (Throwable th) {
                srz.m36171a((Closeable) this.f33525b);
                srz.m36171a(this.f33526c);
                throw th;
            }
        }
        srz.m36171a((Closeable) inputStream);
        srz.m36171a(this.f33526c);
    }
}
