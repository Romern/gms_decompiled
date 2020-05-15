package p000;

import android.os.IBinder;
import java.util.concurrent.Semaphore;

/* renamed from: oyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oyk implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ Semaphore f38616a;

    /* renamed from: b */
    final /* synthetic */ IBinder f38617b;

    public oyk(Semaphore semaphore, IBinder iBinder) {
        this.f38616a = semaphore;
        this.f38617b = iBinder;
    }

    public final void binderDied() {
        this.f38616a.release();
        this.f38617b.unlinkToDeath(this, 0);
    }
}
