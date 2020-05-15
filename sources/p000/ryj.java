package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ryj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryj extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadService");
        if (queryLocalInterface instanceof rym) {
            return (rym) queryLocalInterface;
        }
        return new ryk(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.common.download.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.common.download.internal.IDownloadService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public ryj(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 43, sat, rjz, rka);
    }
}
