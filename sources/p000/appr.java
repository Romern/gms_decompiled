package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: appr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class appr extends apod {
    public appr(Context context, Looper looper, sat sat, rlz rlz, rof rof, aplz aplz) {
        super(context, looper, 36, sat, rlz, rof, aplz);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
        if (queryLocalInterface instanceof appk) {
            return (appk) queryLocalInterface;
        }
        return new appi(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.search.corpora.internal.ISearchCorporaService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12600000;
    }

    public appr(Context context, sat sat, rlz rlz, rof rof, aplz aplz) {
        super(context, context.getMainLooper(), 36, sat, rlz, rof, aplz);
    }
}
