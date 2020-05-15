package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: aved */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aved extends sbm {
    /* renamed from: H */
    public final boolean mo16778H() {
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.udc.internal.IUdcService");
        if (queryLocalInterface instanceof avdo) {
            return (avdo) queryLocalInterface;
        }
        return new avdm(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.udc.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.udc.internal.IUdcService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public aved(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 35, sat, rjz, rka);
        sdo.m34966a(sat.f43963a, "Must pass an account via UdcOptions or call GoogleApiClient.Builder.setAccount()");
    }
}
