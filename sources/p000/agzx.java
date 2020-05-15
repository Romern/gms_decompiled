package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.Feature;

/* renamed from: agzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agzx extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return agzg.f66905b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionService");
        if (queryLocalInterface instanceof agzw) {
            return (agzw) queryLocalInterface;
        }
        return new agzu(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.mobilesubscription.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 16200000;
    }

    public agzx(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, sat, rjz, rka);
    }
}
