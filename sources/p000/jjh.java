package p000;

import com.google.android.gms.auth.proximity.BleCentralChimeraService;

/* renamed from: jjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jjh {
    /* renamed from: a */
    public static synchronized BleCentralChimeraService.UpdateScanFilterReceiver m16792a(BleCentralChimeraService bleCentralChimeraService) {
        BleCentralChimeraService.UpdateScanFilterReceiver b;
        synchronized (jjh.class) {
            b = m16793b(bleCentralChimeraService);
        }
        return b;
    }

    /* renamed from: b */
    protected static final synchronized BleCentralChimeraService.UpdateScanFilterReceiver m16793b(BleCentralChimeraService bleCentralChimeraService) {
        BleCentralChimeraService.UpdateScanFilterReceiver updateScanFilterReceiver;
        synchronized (jjh.class) {
            updateScanFilterReceiver = new BleCentralChimeraService.UpdateScanFilterReceiver(bleCentralChimeraService);
        }
        return updateScanFilterReceiver;
    }
}
