package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: axod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axod extends sbm {

    /* renamed from: a */
    public static final rje f96209a = new rje();

    /* renamed from: b */
    private final axea f96210b;

    /* renamed from: H */
    public final boolean mo16778H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PService");
        if (queryLocalInterface instanceof axnt) {
            return (axnt) queryLocalInterface;
        }
        return new axnr(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.walletp2p.service.zeroparty.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putInt("integrator_id", this.f96210b.f95847a);
        return bundle;
    }

    public axod(Context context, Looper looper, axea axea, rjz rjz, rka rka, sat sat) {
        super(context, looper, 115, sat, rjz, rka);
        this.f96210b = axea;
    }
}
