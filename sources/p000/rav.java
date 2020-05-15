package p000;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rav extends rjx implements qwt {
    public rav(Context context) {
        super(context, qws.f42331a, (rjk) null, new rky());
    }

    /* renamed from: a */
    public static qwt m33200a(Context context) {
        return new rav(context);
    }

    /* renamed from: a */
    public final rke mo24338a(qwo qwo) {
        rau rau = new rau(qwo, this.f43165D);
        super.mo24715a(2, rau);
        return rau;
    }

    /* renamed from: a */
    public final void mo24339a(long j, TimeUnit timeUnit) {
        try {
            aucu.m76783a(mo24701a((rpa) new ras()), j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException | TimeoutException e2) {
        }
    }
}
