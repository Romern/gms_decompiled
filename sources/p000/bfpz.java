package p000;

import android.location.Location;
import java.util.Collections;

/* renamed from: bfpz */
public final /* synthetic */ class bfpz implements Runnable {

    /* renamed from: a */
    private final bfqm f114827a;

    /* renamed from: b */
    private final Location f114828b;

    public bfpz(bfqm bfqm, Location location) {
        this.f114827a = bfqm;
        this.f114828b = location;
    }

    public final void run() {
        bfqm bfqm = this.f114827a;
        Location location = this.f114828b;
        bfrt bfrt = bfqm.f114877d;
        if (bfrt.f115075d) {
            aeim.m51908l(location);
            bfrt.f115076e = location;
            bfrb bfrb = bfrt.f115077f;
            if (bfrb != null) {
                bfrb.mo62122f(Collections.singletonList(location));
            }
        }
    }
}
