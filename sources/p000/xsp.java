package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: xsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xsp extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return wzj.f51604e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
        if (queryLocalInterface instanceof xss) {
            return (xss) queryLocalInterface;
        }
        return new xsq(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fido.fido2.zeroparty.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 13000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.zeroparty.START");
        return bundle;
    }

    public xsp(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 180, sat, rjz, rka);
    }
}
