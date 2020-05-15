package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: apte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apte extends apod {
    public apte(Context context, Looper looper, sat sat, rlz rlz, rof rof, aplz aplz) {
        super(context, looper, 32, sat, rlz, rof, aplz);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesService");
        if (queryLocalInterface instanceof apta) {
            return (apta) queryLocalInterface;
        }
        return new apsy(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.search.queries.internal.ISearchQueriesService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12600000;
    }

    public apte(Context context, sat sat, rlz rlz, rof rof, aplz aplz) {
        super(context, context.getMainLooper(), 32, sat, rlz, rof, aplz);
    }
}
