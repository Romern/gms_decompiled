package p000;

import java.io.IOException;

/* renamed from: miw */
final /* synthetic */ class miw implements Runnable {

    /* renamed from: a */
    private final mix f33801a;

    /* renamed from: b */
    private final IOException f33802b;

    public miw(mix mix, IOException iOException) {
        this.f33801a = mix;
        this.f33802b = iOException;
    }

    public final void run() {
        this.f33801a.f33804a.mo20094b(2, this.f33802b.getMessage());
    }
}
