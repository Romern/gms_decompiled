package p000;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oel extends aeaa {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f37369a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f37370b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oel(String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        super(str);
        this.f37369a = atomicReference;
        this.f37370b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        bnsi b = oen.f37371a.mo68387b();
        b.mo68432a("oel", "a", 820, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Play store disconnected");
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        this.f37369a.set(iBinder);
        this.f37370b.countDown();
    }
}
