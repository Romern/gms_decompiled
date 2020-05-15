package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: aprp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aprp extends apod {
    public aprp(Context context, sat sat, rlz rlz, rof rof, aplz aplz) {
        super(context, context.getMainLooper(), 78, sat, rlz, rof, aplz);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiService");
        if (queryLocalInterface instanceof apro) {
            return (apro) queryLocalInterface;
        }
        return new aprm(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.search.nativeapi.internal.INativeApiService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12600000;
    }
}
