package p000;

import java.io.IOException;

/* renamed from: atdr */
final /* synthetic */ class atdr implements Runnable {

    /* renamed from: a */
    private final atds f90147a;

    /* renamed from: b */
    private final boolean f90148b;

    public atdr(atds atds, boolean z) {
        this.f90147a = atds;
        this.f90148b = z;
    }

    public final void run() {
        try {
            this.f90147a.mo49854b(this.f90148b);
        } catch (atfh | IOException e) {
        } catch (asks | RuntimeException e2) {
        }
    }
}
