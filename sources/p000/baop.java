package p000;

import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: baop */
final /* synthetic */ class baop implements bqeh {

    /* renamed from: a */
    private final baot f101418a;

    public baop(baot baot) {
        this.f101418a = baot;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        baot baot = this.f101418a;
        List<baog> list = (List) obj;
        for (baog baog : list) {
            String a = baog.mo55814a();
            try {
                if (!"".equals(a) && (!baot.m87293b(a, baot.f101426d) || baot.m87292a(a, baot.f101426d))) {
                    baot.f101425c.mo55831a(a, baoi.SUBSCRIPTION_CLEANUP);
                }
            } catch (PackageManager.NameNotFoundException e) {
                baot.f101425c.mo55831a(a, baoi.SUBSCRIPTION_CLEANUP);
            }
        }
        return baot.mo55836a(list);
    }
}
