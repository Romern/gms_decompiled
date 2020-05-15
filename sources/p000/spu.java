package p000;

import android.app.ActivityManager;
import android.os.Handler;

/* renamed from: spu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class spu extends sps {

    /* renamed from: d */
    private final ActivityManager f44952d;

    /* renamed from: e */
    private final svq f44953e;

    /* renamed from: f */
    private final ActivityManager.OnUidImportanceListener f44954f = new spt(this);

    public spu(ActivityManager activityManager, svq svq, Handler handler) {
        super(handler);
        this.f44952d = activityManager;
        this.f44953e = svq;
    }

    /* renamed from: b */
    public static boolean m35919b(int i) {
        return i <= 125;
    }

    /* renamed from: a */
    public final boolean mo25946a(int i) {
        String[] a = this.f44953e.mo26175a(i);
        if (a != null) {
            for (String str : a) {
                if (m35919b(this.f44952d.getPackageImportance(str))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo25948c() {
        this.f44952d.removeOnUidImportanceListener(this.f44954f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25947b() {
        this.f44952d.addOnUidImportanceListener(this.f44954f, 125);
    }
}
