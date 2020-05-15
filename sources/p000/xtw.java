package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: xtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xtw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgg f53097a;

    /* renamed from: b */
    final /* synthetic */ xub f53098b;

    public xtw(xub xub, bqgg bqgg) {
        this.f53098b = xub;
        this.f53097a = bqgg;
    }

    public final void run() {
        try {
            if (((Boolean) this.f53097a.get()).booleanValue()) {
                return;
            }
        } catch (InterruptedException | ExecutionException e) {
        }
        xub.f53108m.mo25418e("Failed to send data to client, disconnecting...", new Object[0]);
        this.f53098b.mo30142c();
    }
}
