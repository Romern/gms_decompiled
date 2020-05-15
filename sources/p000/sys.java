package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.Feature;

/* renamed from: sys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sys extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return sxu.f45402e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.constellation.internal.IConstellationApiService");
        if (queryLocalInterface instanceof syv) {
            return (syv) queryLocalInterface;
        }
        return new syt(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.constellation.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.constellation.internal.IConstellationApiService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public sys(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, sat, rjz, rka);
    }
}
