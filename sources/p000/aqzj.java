package p000;

import com.android.volley.NoConnectionError;
import com.android.volley.TimeoutError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: aqzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aqzj {

    /* renamed from: a */
    private final int f87151a;

    /* renamed from: b */
    private final int f87152b;

    /* renamed from: c */
    private final float f87153c;

    public aqzj(int i, int i2, float f) {
        this.f87151a = i;
        this.f87152b = i2;
        this.f87153c = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo48296a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Future mo48297a();

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if ((r3 instanceof com.android.volley.NetworkError) == false) goto L_0x0081;
     */
    /* renamed from: b */
    public final Object mo48298b() {
        int i = 0;
        while (true) {
            if (i >= this.f87152b) {
                break;
            }
            try {
                return mo48297a().get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    break;
                }
                if (cause instanceof NoConnectionError) {
                    int i2 = this.f87151a;
                    float f = this.f87153c;
                    int i3 = this.f87152b;
                    int i4 = i + 1;
                    double d = (double) ((long) i2);
                    try {
                        double pow = Math.pow((double) f, (double) i);
                        Double.isNaN(d);
                        Thread.sleep((long) (d * pow));
                    } catch (InterruptedException e2) {
                        aqzk.f87154b.mo25408a("Wait interrupted.", e2, new Object[0]);
                    }
                    if (i4 >= i3) {
                        break;
                    }
                    i = i4;
                } else if (!(cause instanceof TimeoutError)) {
                }
                aqzk.f87154b.mo25417e("Network error calling exchange_session_checkpoints", e, new Object[0]);
                return mo48296a(3);
            } catch (InterruptedException e3) {
                sek sek = aqzk.f87154b;
                String valueOf = String.valueOf(e3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Operation interrupted: ");
                sb.append(valueOf);
                sek.mo25415d(sb.toString(), e3, new Object[0]);
            }
        }
        return mo48296a(1);
    }
}
