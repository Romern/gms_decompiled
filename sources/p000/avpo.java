package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: avpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avpo extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.update.ISystemUpdateApiService");
        if (queryLocalInterface instanceof avkd) {
            return (avkd) queryLocalInterface;
        }
        return new avkb(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.update.START_API_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.update.ISystemUpdateApiService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 11400000;
    }

    public avpo(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, MfiClientException.TYPE_CARD_NOT_CACHED, sat, rjz, rka);
    }
}
