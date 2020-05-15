package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: hzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hzt extends sbm {
    public hzt(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, 126, sat, rlz, rof);
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return kax.f23675e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof hyu) {
            return (hyu) queryLocalInterface;
        }
        return new hys(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
