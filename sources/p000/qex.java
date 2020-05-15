package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: qex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qex extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.checkin.internal.ICheckinApiService");
        if (queryLocalInterface instanceof qfl) {
            return (qfl) queryLocalInterface;
        }
        return new qfj(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.checkin.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.checkin.internal.ICheckinApiService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12200000;
    }

    public qex(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 130, sat, rjz, rka);
    }
}
