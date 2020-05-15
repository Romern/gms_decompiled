package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.Feature;

/* renamed from: apjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apjn extends sbm {
    public apjn(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, sat, rlz, rof);
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return aphb.f84375c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.scheduler.IGmsTaskScheduler");
        if (queryLocalInterface instanceof aphf) {
            return (aphf) queryLocalInterface;
        }
        return new aphd(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.scheduler.ACTION_PROXY_SCHEDULE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.scheduler.IGmsTaskScheduler";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 19792000;
    }
}
