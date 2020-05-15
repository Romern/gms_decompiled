package p000;

import java.util.Collections;

/* renamed from: bfpm */
public final /* synthetic */ class bfpm implements Runnable {

    /* renamed from: a */
    private final bfpq f114798a;

    public bfpm(bfpq bfpq) {
        this.f114798a = bfpq;
    }

    public final void run() {
        bfpq bfpq = this.f114798a;
        bfpq.f114805b.mo34511a(Collections.emptyList(), false);
        aesh aesh = bfpq.f114804a;
        if (aesh != null) {
            aesh.mo34507b();
        }
    }
}
