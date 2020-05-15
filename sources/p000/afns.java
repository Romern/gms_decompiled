package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: afns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afns extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMobileDataHubListenerService");
        if (queryLocalInterface instanceof afnf) {
            return (afnf) queryLocalInterface;
        }
        return new afnd(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.mdh.service.listener.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.mdh.internal.IMobileDataHubListenerService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12600000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final afnf mo34974n() {
        return (afnf) mo25289B();
    }

    public afns(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 164, sat, rjz, rka);
    }
}
