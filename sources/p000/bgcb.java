package p000;

import android.content.Context;
import android.hardware.location.ContextHubManager;
import android.os.Build;

/* renamed from: bgcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgcb implements bugp {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060 A[Catch:{ IllegalArgumentException -> 0x0056, IllegalStateException -> 0x0054, SecurityException -> 0x0052 }] */
    /* renamed from: a */
    public final bugn mo62634a(Context context) {
        bgcz a = bgcz.m98588a();
        bgbq a2 = bgbq.m98540a(context);
        if (buhb.f153806d == null) {
            synchronized (buhb.f153805c) {
                if (buhb.f153806d == null) {
                    int i = Build.VERSION.SDK_INT;
                    ContextHubManager contextHubManager = (ContextHubManager) context.getSystemService("contexthub");
                    bugn bugn = null;
                    if (contextHubManager != null) {
                        sns sns = new sns("RealContextHub Handler", 10);
                        sns.start();
                        try {
                            buhb buhb = new buhb(contextHubManager, a, new snr(sns), a2);
                            sns sns2 = new sns("ContextHubManager Handler", 10);
                            sns2.start();
                            if (buhb.f153807e.registerCallback(buhb.f153811i, new snr(sns2)) == 0) {
                                bugn = buhb;
                            }
                        } catch (IllegalArgumentException e) {
                            e = e;
                            new Object[1][0] = e;
                            if (bugn == null) {
                            }
                            buhb.f153806d = bugn;
                            return buhb.f153806d;
                        } catch (IllegalStateException e2) {
                            e = e2;
                            new Object[1][0] = e;
                            if (bugn == null) {
                            }
                            buhb.f153806d = bugn;
                            return buhb.f153806d;
                        } catch (SecurityException e3) {
                            e = e3;
                            new Object[1][0] = e;
                            if (bugn == null) {
                            }
                            buhb.f153806d = bugn;
                            return buhb.f153806d;
                        }
                    }
                    if (bugn == null) {
                        bugn = buhb.f153803a;
                    }
                    buhb.f153806d = bugn;
                }
            }
        }
        return buhb.f153806d;
    }
}
