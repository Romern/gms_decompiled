package p000;

import android.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: asei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asei {

    /* renamed from: a */
    public final String f88771a;

    /* renamed from: b */
    public final CountDownLatch f88772b = new CountDownLatch(1);

    /* renamed from: c */
    public Object f88773c = null;

    public asei(String str) {
        this.f88771a = str;
    }

    /* renamed from: a */
    public final synchronized void mo49088a(Object obj) {
        if (this.f88772b.getCount() <= 0) {
            Log.w("StatementServiceResFut", String.format("Already set result %s to %s; refusing to re-set to %s.", this.f88771a, this.f88773c, obj));
            return;
        }
        Object[] objArr = {this.f88771a, obj};
        this.f88773c = obj;
        this.f88772b.countDown();
    }
}
