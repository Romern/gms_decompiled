package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: axmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axmv extends sbm {

    /* renamed from: a */
    private final axea f96197a;

    /* renamed from: H */
    public final boolean mo16778H() {
        return true;
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return axdw.f95846e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.walletp2p.internal.firstparty.IFirstPartyWalletP2PService");
        if (queryLocalInterface instanceof axnb) {
            return (axnb) queryLocalInterface;
        }
        return new axmz(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.walletp2p.service.firstparty.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.walletp2p.internal.firstparty.IFirstPartyWalletP2PService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putInt("integrator_id", this.f96197a.f95847a);
        return bundle;
    }

    public axmv(Context context, Looper looper, axea axea, rjz rjz, rka rka, sat sat) {
        super(context, looper, 114, sat, rjz, rka);
        this.f96197a = axea;
    }
}
