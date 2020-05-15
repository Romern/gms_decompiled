package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.security.StorageKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: athk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class athk {

    /* renamed from: a */
    private static final srn f90375a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static athk f90376b;

    /* renamed from: c */
    private final rsk f90377c;

    /* renamed from: d */
    private final CountDownLatch f90378d = new CountDownLatch(1);

    private athk(Context context) {
        this.f90377c = rsk.m34337b(context, "com.google.android.gms.tapandpay.security.StorageKeyCacheService", 3000, new rsh());
    }

    /* renamed from: a */
    public static synchronized athk m75896a(Context context) {
        athk athk;
        synchronized (athk.class) {
            if (f90376b == null) {
                f90376b = new athk(context.getApplicationContext());
            }
            athk = f90376b;
        }
        return athk;
    }

    /* renamed from: a */
    public static String m75897a(askf askf) {
        String str = askf.f89123a;
        String str2 = askf.f89125c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r5.f90378d.await(10, java.util.concurrent.TimeUnit.SECONDS) != false) goto L_0x0042;
     */
    /* renamed from: a */
    public final Bundle mo49992a() {
        if (this.f90378d.getCount() > 0) {
            try {
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                bnsl bnsl = (bnsl) f90375a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("athk", "a", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("InterruptedException");
            }
        }
        List e2 = this.f90377c.mo25074e();
        if (e2.isEmpty()) {
            return new Bundle();
        }
        return (Bundle) e2.get(0);
        return new Bundle();
    }

    /* renamed from: a */
    public final synchronized void mo49993a(Intent intent) {
        this.f90377c.mo25070c(intent);
        this.f90378d.getCount();
        this.f90378d.countDown();
    }

    /* renamed from: a */
    public final void mo49994a(Bundle bundle) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(bundle);
        this.f90377c.mo25064a(arrayList);
        bundle.keySet().size();
    }

    /* renamed from: a */
    public final void mo49995a(askf askf, StorageKey storageKey) {
        Bundle a = mo49992a();
        a.putParcelable(m75897a(askf), storageKey);
        mo49994a(a);
    }
}
