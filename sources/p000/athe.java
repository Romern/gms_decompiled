package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.security.CheckInTaskOperation;

/* renamed from: athe */
final /* synthetic */ class athe implements Runnable {

    /* renamed from: a */
    private final athf f90357a;

    /* renamed from: b */
    private final VolleyError f90358b;

    public athe(athf athf, VolleyError volleyError) {
        this.f90357a = athf;
        this.f90358b = volleyError;
    }

    public final void run() {
        athf athf = this.f90357a;
        VolleyError volleyError = this.f90358b;
        try {
            srn srn = CheckInTaskOperation.f108654a;
            btnf a = atff.m75758a(volleyError);
            if (a != null) {
                athf.f90360b.mo49218a(athf.f90359a, a);
                athh.m75884a(athf.f90359a, a);
            }
        } finally {
            athf.f90361c.countDown();
        }
    }
}
