package p000;

import com.google.android.gms.location.LocationResult;
import java.util.concurrent.BlockingQueue;

/* renamed from: ator */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ator extends aehy {

    /* renamed from: a */
    final /* synthetic */ BlockingQueue f90612a;

    public ator(BlockingQueue blockingQueue) {
        this.f90612a = blockingQueue;
    }

    /* renamed from: a */
    public final void mo9910a(LocationResult locationResult) {
        this.f90612a.offer(locationResult);
    }
}
