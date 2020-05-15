package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* renamed from: qrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qrp extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final int f42002a;

    /* renamed from: b */
    public final PendingIntent f42003b;

    public qrp(int i) {
        this(i, null, null, null);
    }

    /* renamed from: a */
    public static qrp m32740a(rjp rjp) {
        Status status = rjp.f43152a;
        int a = rjp.mo24655a();
        return new qrp(qrq.m32741a(a), rjp.getMessage(), status.f30117k, rjp.getCause());
    }

    public qrp(int i, String str) {
        this(i, str, null, null);
    }

    public qrp(int i, String str, PendingIntent pendingIntent, Throwable th) {
        super(str, th);
        this.f42002a = i;
        this.f42003b = pendingIntent;
    }

    public qrp(int i, String str, Throwable th) {
        this(i, str, null, th);
    }

    public qrp(int i, Throwable th) {
        super(th);
        this.f42002a = i;
        this.f42003b = null;
    }
}
