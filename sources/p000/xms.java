package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: xms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xms extends sbm {
    public xms(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, sat, rlz, rof);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
        if (queryLocalInterface instanceof xmv) {
            return (xmv) queryLocalInterface;
        }
        return new xmt(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fido.credentialstore.internal_service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 19374000;
    }
}
