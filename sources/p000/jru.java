package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: jru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jru extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return kba.f23681b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
        if (queryLocalInterface instanceof jrx) {
            return (jrx) queryLocalInterface;
        }
        return new jrv(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.proximity.devicesyncservice.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.proximity.internal.IDeviceSyncService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12600000;
    }

    public jru(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 142, sat, rjz, rka);
    }
}
