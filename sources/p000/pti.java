package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: pti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pti extends sbm {

    /* renamed from: M */
    private static final Object f40189M = new Object();

    /* renamed from: a */
    public static final ptx f40190a = new ptx("CastClientImpl");

    /* renamed from: p */
    public static final Object f40191p = new Object();

    /* renamed from: J */
    private pth f40192J;

    /* renamed from: K */
    private Bundle f40193K;

    /* renamed from: L */
    private final Map f40194L;

    /* renamed from: b */
    public ApplicationMetadata f40195b;

    /* renamed from: c */
    public final CastDevice f40196c;

    /* renamed from: d */
    public final pel f40197d;

    /* renamed from: e */
    public final Map f40198e = new HashMap();

    /* renamed from: f */
    public String f40199f;

    /* renamed from: g */
    public boolean f40200g;

    /* renamed from: h */
    public boolean f40201h;

    /* renamed from: i */
    public boolean f40202i;

    /* renamed from: j */
    public double f40203j;

    /* renamed from: k */
    public EqualizerSettings f40204k;

    /* renamed from: l */
    public int f40205l;

    /* renamed from: m */
    public int f40206m;

    /* renamed from: n */
    public String f40207n;

    /* renamed from: o */
    public String f40208o;

    /* renamed from: E */
    private final void m31206E() {
        f40190a.mo23670a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f40198e) {
            this.f40198e.clear();
        }
    }

    /* renamed from: o */
    public static final void m31207o() {
        synchronized (f40189M) {
        }
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
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        f40190a.mo23670a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f40207n, this.f40208o);
        this.f40196c.mo17495a(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0);
        this.f40192J = new pth(this);
        pth pth = this.f40192J;
        pth.asBinder();
        bundle.putParcelable("listener", new BinderWrapper(pth));
        String str = this.f40207n;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f40208o;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    /* renamed from: j */
    public final void mo14032j() {
        f40190a.mo23670a("disconnect(); ServiceListener=%s, isConnected=%b", this.f40192J, Boolean.valueOf(mo25301p()));
        pth pth = this.f40192J;
        this.f40192J = null;
        if (pth == null || pth.mo23638a() == null) {
            f40190a.mo23670a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        m31206E();
        try {
            ((ptq) mo25289B()).mo23645a();
        } catch (RemoteException | IllegalStateException e) {
            f40190a.mo23679f("Error while disconnecting the controller interface: %s", e.getMessage());
        } catch (Throwable th) {
            super.mo14032j();
            throw th;
        }
        super.mo14032j();
    }

    /* renamed from: l */
    public final void mo23640l() {
        this.f40205l = -1;
        this.f40206m = -1;
        this.f40195b = null;
        this.f40199f = null;
        this.f40203j = 0.0d;
        mo23641n();
        this.f40200g = false;
        this.f40204k = null;
    }

    /* renamed from: m */
    public final Bundle mo16784m() {
        Bundle bundle = this.f40193K;
        if (bundle == null) {
            return null;
        }
        this.f40193K = null;
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo23641n() {
        if (!this.f40196c.mo17496a(2048) && this.f40196c.mo17496a(4) && !this.f40196c.mo17496a(1)) {
            "Chromecast Audio".equals(this.f40196c.f29717e);
        }
    }

    public pti(Context context, Looper looper, sat sat, CastDevice castDevice, pel pel, rjz rjz, rka rka) {
        super(context, looper, 10, sat, rjz, rka);
        this.f40196c = castDevice;
        this.f40197d = pel;
        new AtomicLong(0);
        this.f40194L = new HashMap();
        mo23640l();
        mo23641n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16780a(int i, IBinder iBinder, Bundle bundle, int i2) {
        f40190a.mo23670a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.f40201h = true;
            this.f40202i = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.f40193K = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.mo16780a(i, iBinder, bundle, i2);
    }

    /* renamed from: a */
    public final void mo23639a(long j, int i) {
        rlf rlf;
        synchronized (this.f40194L) {
            rlf = (rlf) this.f40194L.remove(Long.valueOf(j));
        }
        if (rlf != null) {
            rlf.mo9482a((Object) new Status(i));
        }
    }

    /* renamed from: a */
    public final void mo16782a(ConnectionResult connectionResult) {
        super.mo16782a(connectionResult);
        m31206E();
    }
}
