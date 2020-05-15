package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: wfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wfo extends sbm {
    /* renamed from: H */
    public final boolean mo16778H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsCacheService");
        if (queryLocalInterface instanceof wfv) {
            return (wfv) queryLocalInterface;
        }
        return new wft(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.facs.cache.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.facs.cache.internal.IFacsCacheService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 19525000;
    }

    public wfo(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 202, sat, rjz, rka);
    }
}
