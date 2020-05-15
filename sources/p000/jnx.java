package p000;

import java.io.IOException;

/* renamed from: jnx */
final /* synthetic */ class jnx implements Runnable {

    /* renamed from: a */
    private final jny f22911a;

    /* renamed from: b */
    private final IOException f22912b;

    public jnx(jny jny, IOException iOException) {
        this.f22911a = jny;
        this.f22912b = iOException;
    }

    public final void run() {
        jny jny = this.f22911a;
        jny.f22913a.mo13815a(this.f22912b);
    }
}
