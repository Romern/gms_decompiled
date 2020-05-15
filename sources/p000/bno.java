package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: bno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bno implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f5196a;

    public bno(Handler handler) {
        this.f5196a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f5196a.post(runnable);
    }
}
