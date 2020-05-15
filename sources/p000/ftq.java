package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ftq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ftq extends sbm {
    public ftq(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, 19, sat, rlz, rof);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (queryLocalInterface instanceof fti) {
            return (fti) queryLocalInterface;
        }
        return new ftg(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12600000;
    }

    /* renamed from: e */
    public final fti mo11311e() {
        return (fti) mo25289B();
    }
}
