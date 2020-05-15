package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.Feature;

/* renamed from: ptj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ptj extends sbm {

    /* renamed from: a */
    private static final ptx f40209a = new ptx("CastClientImplCxless");

    /* renamed from: b */
    private final CastDevice f40210b;

    /* renamed from: c */
    private final String f40211c;

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return pfa.f39015h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof ptq) {
            return (ptq) queryLocalInterface;
        }
        return new pto(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 19390000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        f40209a.mo23670a("getRemoteService()", new Object[0]);
        this.f40210b.mo17495a(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0);
        bundle.putString("connectionless_client_record_id", this.f40211c);
        return bundle;
    }

    /* renamed from: j */
    public final void mo14032j() {
        try {
            ((ptq) mo25289B()).mo23645a();
        } catch (RemoteException | IllegalStateException e) {
            f40209a.mo23679f("Error while disconnecting the controller interface: %s", e.getMessage());
        } catch (Throwable th) {
            super.mo14032j();
            throw th;
        }
        super.mo14032j();
    }

    public ptj(Context context, Looper looper, sat sat, CastDevice castDevice, String str, rjz rjz, rka rka) {
        super(context, looper, 10, sat, rjz, rka);
        this.f40210b = castDevice;
        this.f40211c = str;
    }
}
