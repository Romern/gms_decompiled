package p000;

import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: jny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jny implements bluw {

    /* renamed from: a */
    public final bluw f22913a;

    /* renamed from: b */
    private final Executor f22914b;

    public jny(Executor executor, bluw bluw) {
        this.f22914b = executor;
        this.f22913a = bluw;
    }

    /* renamed from: a */
    public final void mo13814a() {
        Executor executor = this.f22914b;
        bluw bluw = this.f22913a;
        bluw.getClass();
        executor.execute(new jnu(bluw));
    }

    /* renamed from: b */
    public final void mo13820b() {
        Executor executor = this.f22914b;
        bluw bluw = this.f22913a;
        bluw.getClass();
        executor.execute(new jnv(bluw));
    }

    /* renamed from: a */
    public final void mo13815a(IOException iOException) {
        this.f22914b.execute(new jnx(this, iOException));
    }

    /* renamed from: a */
    public final void mo13818a(byte[] bArr) {
        this.f22914b.execute(new jnw(this, bArr));
    }
}
