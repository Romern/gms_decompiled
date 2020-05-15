package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: brig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brig extends sbm {

    /* renamed from: a */
    public static final rjo f142864a = new rjo("AppIndexing.API", f142866c, f142865b);

    /* renamed from: b */
    private static final rje f142865b = new rje();

    /* renamed from: c */
    private static final rjl f142866c = new brif();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        if (queryLocalInterface instanceof brix) {
            return (brix) queryLocalInterface;
        }
        return new briv(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12600000;
    }

    public brig(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 113, sat, rjz, rka);
    }
}
