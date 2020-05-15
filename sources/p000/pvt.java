package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pvt implements pik {

    /* renamed from: d */
    public static final /* synthetic */ int f40395d = 0;

    /* renamed from: e */
    private static final qav f40396e = new qav("DeviceControllerEntry");

    /* renamed from: a */
    public final Context f40397a;

    /* renamed from: b */
    public final List f40398b;

    /* renamed from: c */
    public final pjc f40399c;

    /* renamed from: f */
    private final pmx f40400f;

    /* renamed from: g */
    private final Handler f40401g;

    /* renamed from: h */
    private final pim f40402h;

    /* renamed from: i */
    private boolean f40403i = true;

    /* renamed from: j */
    private boolean f40404j;

    public pvt(Context context, CastDevice castDevice, pmx pmx, piy piy, Handler handler, String str) {
        this.f40397a = context;
        this.f40400f = pmx;
        this.f40401g = handler;
        pmx.mo23454a(castDevice.mo17494a(), 1);
        this.f40404j = false;
        this.f40398b = new ArrayList();
        pim pim = new pim("gms_cast_mrp", rfi.f42869b, 2, "MRP", this);
        this.f40402h = pim;
        this.f40399c = piy.mo23232a(castDevice, str, pim);
    }

    /* renamed from: a */
    public final void mo23181a(int i) {
        f40396e.mo23673b("CastDeviceController.Listener.onConnectionFailed: %s", pew.m30274a(i));
        if (!mo23748b()) {
            this.f40403i = false;
            this.f40404j = false;
            ArrayList arrayList = new ArrayList(this.f40398b);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((pvq) arrayList.get(i2)).mo23702b();
            }
            if (!this.f40399c.f39230a.mo17500e() && i != 2501) {
                this.f40401g.post(new pvs(this.f40397a));
            }
            this.f40400f.mo23454a(this.f40399c.f39230a.mo17494a(), 0);
        }
    }

    /* renamed from: a */
    public final void mo23187a(String str, long j) {
    }

    /* renamed from: a */
    public final void mo23188a(String str, long j, int i) {
    }

    /* renamed from: a */
    public final void mo23189a(String str, String str2) {
    }

    /* renamed from: a */
    public final void mo23190a(String str, byte[] bArr) {
    }

    /* renamed from: b */
    public final void mo23192b(int i) {
    }

    /* renamed from: bm */
    public final void mo23194bm() {
    }

    /* renamed from: c */
    public final void mo23195c(int i) {
        int i2 = 1;
        f40396e.mo23673b("CastDeviceController.Listener.onDisconnected: %s", pew.m30274a(i));
        if (!mo23748b()) {
            this.f40403i = false;
            this.f40404j = false;
            if (i == 0) {
                ArrayList arrayList = new ArrayList(this.f40398b);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((pvq) arrayList.get(i3)).mo23702b();
                }
            } else {
                ArrayList arrayList2 = new ArrayList(this.f40398b);
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    pvq pvq = (pvq) arrayList2.get(i4);
                    if (!pvq.f40387v) {
                        pvq.mo23702b();
                    }
                }
                f40396e.mo23861b("MRP is trying to reconnect");
                this.f40403i = true;
                this.f40404j = true;
                this.f40399c.mo23198a();
            }
        } else {
            this.f40403i = false;
            this.f40404j = false;
        }
        pmx pmx = this.f40400f;
        String a = this.f40399c.f39230a.mo17494a();
        if (!this.f40403i && !this.f40404j) {
            i2 = 0;
        }
        pmx.mo23454a(a, i2);
    }

    /* renamed from: d */
    public final void mo23196d(int i) {
        f40396e.mo23673b("onApplicationConnectionFailed: castStatusCode=%s", pew.m30274a(i));
        if (!mo23748b()) {
            ArrayList arrayList = new ArrayList(this.f40398b);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((pvq) arrayList.get(i2)).mo23705d(i);
            }
        }
    }

    /* renamed from: e */
    public final void mo23197e(int i) {
    }

    /* renamed from: b */
    public final void mo23193b(String str, String str2) {
        f40396e.mo23861b("CastDeviceController.Listener.onCastNearbyPaired");
        if (!mo23748b() && !this.f40399c.f39230a.mo17500e()) {
            this.f40401g.post(new pvr(this, str2));
        }
    }

    /* renamed from: b */
    public final boolean mo23748b() {
        return this.f40398b.isEmpty();
    }

    /* renamed from: a */
    public final void mo23182a(int i, String str) {
        f40396e.mo23673b("onApplicationDisconnected: castStatusCode=%s, sessionId=%s", pew.m30274a(i), str);
        if (!mo23748b()) {
            ArrayList arrayList = new ArrayList(this.f40398b);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((pvq) arrayList.get(i2)).mo23738a(i, str);
            }
        }
    }

    /* renamed from: a */
    public final void mo23183a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        f40396e.mo23673b("CastDeviceController.Listener.onApplicationConnected: appId=%s, sessionId=%s", applicationMetadata.f29706a, str2);
        if (!mo23748b()) {
            ArrayList arrayList = new ArrayList(this.f40398b);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pvq pvq = (pvq) arrayList.get(i);
                pvq.f40379n.mo23670a("onApplicationConnected: sessionId=%s", str2);
                pvq.f40379n.mo23670a("mSession = %s", pvq.f40377C);
                pwb pwb = pvq.f40377C;
                if (pwb != null) {
                    pwb.mo23756a(applicationMetadata, str2);
                }
                if (!ptk.m31236a(str, pvq.f40390y)) {
                    pvq.f40390y = str;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo23184a(ApplicationStatus applicationStatus) {
        if (!mo23748b()) {
            String str = applicationStatus.f29887a;
            ArrayList arrayList = new ArrayList(this.f40398b);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pvq) arrayList.get(i)).mo23743b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo23185a(DeviceStatus deviceStatus) {
        if (!mo23748b()) {
            double d = deviceStatus.f29888a;
            if (!Double.isNaN(d)) {
                ArrayList arrayList = new ArrayList(this.f40398b);
                int size = arrayList.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= ((pvq) arrayList.get(i)).mo23741a(d);
                }
                if (z) {
                    this.f40400f.mo23453a(this.f40399c.f39230a.mo17494a(), d);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo23186a(String str, double d, boolean z) {
        if (!mo23748b()) {
            ArrayList arrayList = new ArrayList(this.f40398b);
            int size = arrayList.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                pvq pvq = (pvq) arrayList.get(i);
                pvq.mo23743b(str);
                z2 |= pvq.mo23741a(d);
            }
            if (z2) {
                this.f40400f.mo23453a(this.f40399c.f39230a.mo17494a(), d);
            }
        }
    }

    /* renamed from: a */
    public final void mo23191a(boolean z) {
        f40396e.mo23856a("CastDeviceController.Listener.onConnected. rejoinedApp: %b", Boolean.valueOf(z));
        if (!mo23748b()) {
            if (!this.f40404j) {
                CastDevice castDevice = this.f40399c.f39230a;
                String str = "com.google.android.gms.cast.audio_video";
                if (!castDevice.mo17496a(1) && castDevice.mo17496a(4)) {
                    str = "com.google.android.gms.cast.audio_only";
                }
                String[] strArr = {str};
                sdl.m34954a(tvn.m37524a(tvn.m37523a(this.f40397a).f43165D, strArr));
            }
            this.f40404j = false;
            this.f40403i = false;
            this.f40400f.mo23454a(this.f40399c.f39230a.mo17494a(), 2);
            ArrayList arrayList = new ArrayList(this.f40398b);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pvq pvq = (pvq) arrayList.get(i);
                pvq.mo23697a();
                if (!z) {
                    pvq.mo23738a(2005, (String) null);
                }
            }
        }
    }
}
