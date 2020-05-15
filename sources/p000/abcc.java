package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: abcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abcc extends sbm {

    /* renamed from: a */
    public static final /* synthetic */ int f57035a = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (queryLocalInterface instanceof abci) {
            return (abci) queryLocalInterface;
        }
        return new abcg(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 11925000;
    }

    public abcc(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 63, sat, rjz, rka);
    }
}
