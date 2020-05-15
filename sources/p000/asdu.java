package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: asdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asdu extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperService");
        if (queryLocalInterface instanceof asdt) {
            return (asdt) queryLocalInterface;
        }
        return new asdr(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.smartdevice.wifi.START_WIFI_HELPER_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.smartdevice.wifi.internal.IWifiHelperService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public asdu(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, sat, rjz, rka);
    }
}
