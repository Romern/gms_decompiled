package p000;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ilm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilm {

    /* renamed from: a */
    public static final Logger f21293a = new Logger("GLSActivity", "CheckinHelper");

    /* renamed from: d */
    public static final imo f21294d = new ilh();

    /* renamed from: b */
    public final Context f21295b;

    /* renamed from: c */
    public final qco f21296c;

    public ilm(Context context) {
        qco a = qco.m31854a(context);
        this.f21295b = context;
        this.f21296c = a;
    }

    /* renamed from: b */
    public final void mo13120b() {
        if (gnv.m13532ae()) {
            this.f21296c.mo24732b(new qcj()).mo50371a(new ill(this, new ili(this)));
        }
    }

    /* renamed from: a */
    public final void mo13119a() {
        int i = Build.VERSION.SDK_INT;
        if (stu.m36327m() == aymd.BUILD_TYPE_PRODLMP && stu.m36329o() == 6) {
            f21293a.mo25414c("Checkin check is skipped because force legacy multi dex is enabled", new Object[0]);
            return;
        }
        if (spn.getAndroidId(this.f21295b) == 0) {
            qcw qcw = new qcw(this.f21295b, this);
            qcw.mo23921b();
            try {
                int intValue = ((Integer) aucu.m76783a(this.f21296c.mo23912a(qcw.mo23920a()), 2, TimeUnit.MINUTES)).intValue();
                if (!rjs.m33680f(intValue)) {
                    Logger Logger = f21293a;
                    StringBuilder sb = new StringBuilder(47);
                    sb.append("Checkin fails and the error code is ");
                    sb.append(intValue);
                    Logger.mo25418e(sb.toString(), new Object[0]);
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                f21293a.mo25417e("Error waiting for checkin result", e, new Object[0]);
            }
        }
        if (spn.getAndroidId(this.f21295b) == 0) {
            f21293a.mo25418e("AndroidId is still 0 after Checkin", new Object[0]);
        }
    }
}
