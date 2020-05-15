package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.Feature;

/* renamed from: gbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gbr extends sbm {
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.asterism.internal.IAsterismApiService");
        if (queryLocalInterface instanceof gbu) {
            return (gbu) queryLocalInterface;
        }
        return new gbs(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.asterism.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.asterism.internal.IAsterismApiService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 16200000;
    }

    public gbr(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, ErrorInfo.TYPE_SDU_UNKNOWN, sat, rjz, rka);
    }
}
