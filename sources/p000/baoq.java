package p000;

import android.accounts.Account;
import android.content.pm.PackageManager;
import java.util.HashSet;
import java.util.List;

/* renamed from: baoq */
final /* synthetic */ class baoq implements bqeh {

    /* renamed from: a */
    private final baot f101419a;

    public baoq(baot baot) {
        this.f101419a = baot;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        baot baot = this.f101419a;
        try {
            HashSet hashSet = new HashSet((List) obj);
            List<baog> a = baot.f101425c.mo55825a();
            for (baog baog : a) {
                Account b = baog.mo55815b();
                if (!hashSet.contains(b)) {
                    baot.f101425c.mo55827a(b, baoi.SUBSCRIPTION_CLEANUP);
                } else {
                    String a2 = baog.mo55814a();
                    try {
                        if (!"".equals(a2) && (!baot.m87293b(a2, baot.f101426d) || baot.m87292a(a2, baot.f101426d))) {
                            baot.f101425c.mo55831a(a2, baoi.SUBSCRIPTION_CLEANUP);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        baot.f101425c.mo55831a(a2, baoi.SUBSCRIPTION_CLEANUP);
                    }
                }
            }
            return baot.mo55836a(a);
        } catch (baoh e2) {
            ((achw) baot.f101423a.mo16713a()).mo25417e("Failed to get subscriptions list.", e2, new Object[0]);
            throw e2;
        }
    }
}
