package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: jds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jds {

    /* renamed from: a */
    private final Context f22232a;

    public jds(Context context) {
        this.f22232a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r4 = r0.queryLocalInterface("com.google.android.gms.auth.frp.IFrpService");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if ((r4 instanceof p000.jdz) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r6 = new p000.jdx(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        r6 = (p000.jdz) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r11 = r11.mo13604a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        p000.skh.m35531a().mo25689a(r10.f22232a, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0 = r3.mo24567a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0 == null) goto L_0x004c;
     */
    /* renamed from: a */
    public final Object mo13605a(jdr jdr) {
        rex rex;
        Intent addCategory = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.auth.frp.FRP_BIND").addCategory("android.intent.category.DEFAULT");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            rex = new rex();
            int i = 1;
            while (true) {
                jdz jdz = null;
                if (i > 3) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return null;
                } else if (skh.m35531a().mo25690a(this.f22232a, addCategory, rex, 1)) {
                    break;
                } else {
                    if (i < 3) {
                        Thread.sleep(100);
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo13606a() {
        try {
            Boolean bool = (Boolean) mo13605a(new jdq());
            if (bool != null) {
                return bool.booleanValue();
            }
            Log.w("FrpClient", "isChallengeRequired(): null");
            return false;
        } catch (RemoteException | InterruptedException e) {
            Log.w("FrpClient", e);
            return false;
        }
    }
}
