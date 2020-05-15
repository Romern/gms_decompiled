package p000;

import java.util.Set;

/* renamed from: bqee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqee extends bqec {
    /* renamed from: a */
    public final int mo69161a(bqef bqef) {
        int i;
        synchronized (bqef) {
            i = bqef.remaining - 1;
            bqef.remaining = i;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo69162a(bqef bqef, Set set) {
        synchronized (bqef) {
            if (bqef.seenExceptions == null) {
                bqef.seenExceptions = set;
            }
        }
    }
}
