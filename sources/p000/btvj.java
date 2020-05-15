package p000;

import com.google.location.bluemoon.inertialanchor.Pose;
import java.util.List;

/* renamed from: btvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvj implements Runnable {

    /* renamed from: a */
    public Pose f152616a;

    /* renamed from: b */
    private final List f152617b;

    public btvj(List list) {
        this.f152617b = list;
    }

    public final void run() {
        synchronized (this.f152617b) {
            int size = this.f152617b.size();
            for (int i = 0; i < size; i++) {
                ((btvl) this.f152617b.get(i)).mo62285a(this.f152616a);
            }
        }
    }
}
