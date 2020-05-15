package p000;

import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: ico */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ico extends C1132kg {

    /* renamed from: c */
    public final Semaphore f20745c = new Semaphore(0);

    /* renamed from: d */
    private final Set f20746d;

    public ico(Context context, Set set) {
        super(context);
        this.f20746d = set;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i = 0;
        for (rkb rkb : this.f20746d) {
            if (rkb.mo24792a(this)) {
                i++;
            }
        }
        try {
            this.f20745c.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        this.f20745c.drainPermits();
        forceLoad();
    }
}
