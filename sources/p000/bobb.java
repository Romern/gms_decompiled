package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: bobb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobb implements Closeable {

    /* renamed from: c */
    private static final boba f132485c = (boaz.f132484b != null ? boaz.f132483a : boay.f132482a);

    /* renamed from: a */
    final boba f132486a;

    /* renamed from: b */
    public Throwable f132487b;

    /* renamed from: d */
    private final Deque f132488d = new ArrayDeque(4);

    public bobb(boba boba) {
        bmxy.m108581a(boba);
        this.f132486a = boba;
    }

    /* renamed from: a */
    public static bobb m111033a() {
        return new bobb(f132485c);
    }

    public final void close() {
        Throwable th = this.f132487b;
        while (!this.f132488d.isEmpty()) {
            Closeable closeable = (Closeable) this.f132488d.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th != null) {
                    this.f132486a.mo68840a(closeable, th, th2);
                } else {
                    th = th2;
                }
            }
        }
        if (this.f132487b == null && th != null) {
            bmzo.m108690b(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    /* renamed from: a */
    public final RuntimeException mo68841a(Throwable th) {
        bmxy.m108581a(th);
        this.f132487b = th;
        bmzo.m108690b(th, IOException.class);
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    public final void mo68842a(Closeable closeable) {
        if (closeable != null) {
            this.f132488d.addFirst(closeable);
        }
    }
}
