package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: xrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xrz extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return new Feature[]{wzj.f51600a};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        if (queryLocalInterface instanceof xsf) {
            return (xsf) queryLocalInterface;
        }
        return new xsd(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fido.fido2.privileged.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 13000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.privileged.START");
        return bundle;
    }

    public xrz(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 149, sat, rjz, rka);
    }
}
