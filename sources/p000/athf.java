package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.security.CheckInTaskOperation;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: athf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class athf implements atfd {

    /* renamed from: a */
    public final askf f90359a;

    /* renamed from: b */
    public final askt f90360b;

    /* renamed from: c */
    public final CountDownLatch f90361c;

    /* renamed from: d */
    private final Executor f90362d;

    public athf(askf askf, Executor executor, askt askt, CountDownLatch countDownLatch) {
        this.f90359a = askf;
        this.f90362d = executor;
        this.f90360b = askt;
        this.f90361c = countDownLatch;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f90362d.execute(new athe(this, volleyError));
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        btou btou = (btou) obj;
        try {
            srn srn = CheckInTaskOperation.f108654a;
            athh.m75886b(this.f90359a);
        } finally {
            this.f90361c.countDown();
        }
    }
}
