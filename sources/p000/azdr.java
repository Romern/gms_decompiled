package p000;

import android.util.Pair;

/* renamed from: azdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azdr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Pair f99107a;

    /* renamed from: b */
    final /* synthetic */ azds f99108b;

    public azdr(azds azds, Pair pair) {
        this.f99108b = azds;
        this.f99107a = pair;
    }

    public final void run() {
        azds azds = this.f99108b;
        Pair pair = this.f99107a;
        if (azds.f99112d == null) {
            return;
        }
        if (((Boolean) pair.first).booleanValue() && pair.second != null) {
            azds.f99112d.mo54816a((azda) pair.second);
        } else if (!((Boolean) pair.first).booleanValue()) {
            azds.f99112d.mo54817d();
        }
    }
}
