package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: adgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adgq extends sbm {
    public adgq(Context context, Looper looper, rjz rjz, rka rka) {
        super(context, looper, 121, sat.m34799a(context), rjz, rka);
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return new Feature[]{adeb.f61479a, adeb.f61480b, adeb.f61481c, adeb.f61482d};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsService");
        if (queryLocalInterface instanceof adgf) {
            return (adgf) queryLocalInterface;
        }
        return new adgd(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.instantapps.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.instantapps.internal.IInstantAppsService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12200000;
    }
}
