package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.Feature;

/* renamed from: gpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gpz extends sbm {
    public gpz(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, MfiClientException.TYPE_MFICLIENT_STARTED, sat, rlz, rof);
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return new Feature[]{ghy.f18275a, ghy.f18276b, ghy.f18277c};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IAccountDataService");
        if (queryLocalInterface instanceof gon) {
            return (gon) queryLocalInterface;
        }
        return new gol(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.account.data.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.account.data.IAccountDataService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
