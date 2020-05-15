package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: pyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pyf extends ptp implements IBinder.DeathRecipient, pik, aaai {

    /* renamed from: a */
    public final String f40619a = ccxs.m132043d();

    /* renamed from: b */
    public final Context f40620b;

    /* renamed from: c */
    public final String f40621c;

    /* renamed from: d */
    public final qav f40622d;

    /* renamed from: e */
    public ptt f40623e;

    /* renamed from: f */
    final pjx f40624f;

    /* renamed from: g */
    private final boolean f40625g;

    /* renamed from: h */
    private final boolean f40626h;

    /* renamed from: i */
    private final int f40627i;

    /* renamed from: j */
    private final Handler f40628j = new adzt(Looper.getMainLooper());

    /* renamed from: k */
    private final aaag f40629k;

    /* renamed from: l */
    private final boolean f40630l = ccxv.m132089b();

    /* renamed from: m */
    private final pim f40631m;

    public pyf(Context context, aaac aaac, CastDevice castDevice, boolean z, boolean z2, int i, String str, long j, qav qav, aaag aaag, pmx pmx, piy piy) {
        sdo.m34959a(aaac);
        this.f40620b = context.getApplicationContext();
        this.f40622d = qav;
        this.f40629k = aaag;
        this.f40627i = i;
        this.f40621c = str;
        this.f40625g = z;
        this.f40626h = z2;
        this.f40631m = new pim(str, i, j, "API", this);
        this.f40622d.mo23673b("Google Play services client: %s, Google Play services APK: %d", Integer.valueOf(i), 201515000);
        this.f40622d.mo23673b("acquireDeviceController by %s", this.f40621c);
        TextUtils.isEmpty(castDevice.f29723k);
        this.f40624f = new pjx(castDevice, this.f40631m, pes.m30266a(), pmx, piy);
        aaac.mo16652a((aaai) this);
    }

    /* renamed from: a */
    private final void m31604a(String str, Runnable runnable) {
        if (!ccyt.f180279a.mo6606a().mo77083b()) {
            runnable.run();
        } else {
            this.f40629k.mo16658a(new pxv(str, runnable));
        }
    }

    /* renamed from: b */
    public final synchronized void mo23805b() {
        ptt ptt = this.f40623e;
        if (ptt != null) {
            try {
                ptt.asBinder().unlinkToDeath(this, 0);
            } catch (NoSuchElementException e) {
            }
            this.f40623e = null;
        }
    }

    /* renamed from: b */
    public final void mo23193b(String str, String str2) {
    }

    public final void binderDied() {
        m31604a("binderDied", new pxl(this));
    }

    /* renamed from: bm */
    public final void mo23194bm() {
        this.f40622d.mo23673b("onApplicationLeaveFailed: %s %s", this.f40621c, pew.m30274a(2001));
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23014f(2001);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: c */
    public final void mo23658c() {
        this.f40629k.mo16658a(new pxz(this, "leaveApplication"));
    }

    /* renamed from: d */
    public final void mo23660d() {
        this.f40629k.mo16658a(new pyb(this, "requestStatus"));
    }

    /* renamed from: e */
    public final void mo23661e() {
        this.f40629k.mo16658a(new pxw(this, "ConnectToDevice"));
    }

    /* renamed from: f */
    public final void mo23662f() {
        m31604a("unregisterCastDeviceControllerListener", new pxo(this));
    }

    @Deprecated
    /* renamed from: g */
    public final void mo23663g(String str, String str2) {
        this.f40622d.mo23673b("joinApplication: %s %s %s", this.f40621c, str, str2);
        mo23652a(str, str2, new JoinOptions());
    }

    /* renamed from: b */
    public final void mo23192b(int i) {
        try {
            this.f40622d.mo23673b("onConnectionSuspended: package: %s status=%s", this.f40621c, pew.m30274a(i));
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23011c(i);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: c */
    public final void mo23195c(int i) {
        this.f40622d.mo23673b("onDisconnected: package: %s status=%s", this.f40621c, pew.m30274a(i));
        ptt ptt = this.f40623e;
        if (ptt == null || !ptt.asBinder().isBinderAlive()) {
            this.f40622d.mo23670a("Binder is not alive. Not calling onDisconnected", new Object[0]);
        } else {
            try {
                this.f40623e.mo23001a(i);
            } catch (RemoteException e) {
                this.f40622d.mo23670a("client died while brokering service", new Object[0]);
            }
        }
        mo23806b(false);
    }

    /* renamed from: d */
    public final void mo23196d(int i) {
        this.f40622d.mo23673b("onApplicationConnectionFailed: %s %s", this.f40621c, pew.m30274a(i));
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23012d(i);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: e */
    public final void mo23197e(int i) {
        this.f40622d.mo23670a("onApplicationStopFailed: %s %s", this.f40621c, pew.m30274a(i));
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23013e(i);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: a */
    public final void mo23645a() {
        m31604a("disconnect", new pxm(this));
    }

    /* renamed from: a */
    public final void mo23646a(double d, double d2, boolean z) {
        this.f40629k.mo16658a(new pxt(this, "setVolume", d, d2, z));
    }

    /* renamed from: b */
    public final void mo23657b(String str) {
        this.f40629k.mo16658a(new pyc(this, "registerNamespace", str));
    }

    /* renamed from: d */
    public final void mo23808d(String str) {
        this.f40628j.post(new pxp(this, str));
    }

    /* renamed from: e */
    public final boolean mo23809e(String str) {
        return TextUtils.isEmpty(str) || pwe.f40451b.equals(str) || pkz.f39550a.equals(str) || str.startsWith(qau.f40838g) || qau.f40833b.equals(str) || qau.f40834c.equals(str) || qau.f40835d.equals(str) || qau.f40837f.equals(str) || (qau.f40836e.equals(str) && !qay.m31782a(this.f40620b, this.f40621c)) || (ptw.f40214b.equals(str) && !qay.m31782a(this.f40620b, this.f40621c));
    }

    /* renamed from: a */
    public final void mo23181a(int i) {
        try {
            this.f40622d.mo23673b("onConnectionFailed: package: %s status=%s", this.f40621c, pew.m30274a(i));
            if (!ccxv.m132090c()) {
                i = 2301;
            } else if (i == 0) {
                i = 2301;
            }
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23010b(i);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: b */
    public final synchronized void mo23806b(boolean z) {
        String str;
        qav qav = this.f40622d;
        pjx pjx = this.f40624f;
        if (pjx != null) {
            str = pjx.mo23217g();
        } else {
            str = null;
        }
        qav.mo23856a("Disposing ConnectedClient; controller=%s.", str);
        pjx pjx2 = this.f40624f;
        if (pjx2 != null) {
            if (!pjx2.mo23211b() && !this.f40624f.mo23213c()) {
                if (!this.f40624f.mo23214d()) {
                    this.f40624f.mo23288j();
                }
            }
            this.f40624f.mo23207a(z);
        }
        mo23805b();
    }

    /* renamed from: c */
    public final void mo23659c(String str) {
        this.f40629k.mo16658a(new pyd(this, "unregisterNamespace", str));
    }

    /* renamed from: a */
    public final void mo23182a(int i, String str) {
        this.f40622d.mo23673b("onApplicationDisconnected: %s %s %s", this.f40621c, str, pew.m30274a(i));
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23015g(i);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: a */
    public final void mo23183a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.f40622d.mo23673b("onApplicationConnected: %s %s %s %s %b", this.f40621c, applicationMetadata, str, str2, Boolean.valueOf(z));
        String str3 = applicationMetadata.f29706a;
        if (!TextUtils.isEmpty(str3) && !this.f40621c.equals("com.google.android.gms") && !this.f40621c.equals("com.google.android.apps.chromecast.app")) {
            SharedPreferences b = qay.m31785b(this.f40620b);
            Set<String> stringSet = b.getStringSet("googlecast-cafAppIdsNotificationEnabled", new HashSet());
            if (!this.f40625g && !this.f40626h) {
                stringSet.remove(str3);
            } else {
                stringSet.add(str3);
            }
            b.edit().putStringSet("googlecast-cafAppIdsNotificationEnabled", stringSet).apply();
        }
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23002a(applicationMetadata, str, str2, z);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: a */
    public final void mo23647a(EqualizerSettings equalizerSettings) {
        if (this.f40630l) {
            this.f40629k.mo16658a(new pxu(this, "setEqualizerSettings", equalizerSettings));
        }
    }

    /* renamed from: a */
    public final void mo23184a(ApplicationStatus applicationStatus) {
        this.f40622d.mo23670a("onApplicationStatusChanged: %s %s", this.f40621c, applicationStatus);
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23003a(applicationStatus);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: a */
    public final void mo23185a(DeviceStatus deviceStatus) {
        this.f40622d.mo23670a("onDeviceStatusChanged: %s %s", this.f40621c, deviceStatus);
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23004a(deviceStatus);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: a */
    public final void mo23648a(String str) {
        this.f40629k.mo16658a(new pya(this, "stopApplication", str));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo23186a(String str, double d, boolean z) {
        if (!srq.m36140a(this.f40627i)) {
            this.f40622d.mo23670a("onStatusReceived: %s %s %f %b", this.f40621c, str, Double.valueOf(d), Boolean.valueOf(z));
            try {
                ptt ptt = this.f40623e;
                if (ptt != null) {
                    ptt.mo23005a(str, d, z);
                }
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo23187a(String str, long j) {
        this.f40622d.mo23670a("onMessageEnqueued: %s %s %d", this.f40621c, str, Long.valueOf(j));
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23006a(str, j);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: a */
    public final void mo23188a(String str, long j, int i) {
        this.f40622d.mo23673b("onMessageSendFailed: %s %s %d %s", this.f40621c, str, Long.valueOf(j), pew.m30274a(i));
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23007a(str, j, i);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: a */
    public final void mo23649a(String str, LaunchOptions launchOptions) {
        this.f40629k.mo16658a(new pxy(this, "launchApplicationWithOptions", launchOptions, str));
    }

    /* renamed from: a */
    public final void mo23189a(String str, String str2) {
        this.f40622d.mo23670a("onTextMessageReceived: %s %s %s", this.f40621c, str, str2);
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23008a(str, str2);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: a */
    public final void mo23650a(String str, String str2, long j) {
        this.f40629k.mo16658a(new pxq(this, "sendTextMessage", str, str2, j));
    }

    /* renamed from: a */
    public final void mo23651a(String str, String str2, long j, String str3) {
        this.f40629k.mo16658a(new pxr(this, "sendTextMessageWithDestinationId", str, str2, j, str3));
    }

    /* renamed from: a */
    public final void mo23652a(String str, String str2, JoinOptions joinOptions) {
        this.f40629k.mo16658a(new pxx(this, "joinApplicationWithOptions", joinOptions, str, str2));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo23653a(String str, boolean z) {
        this.f40622d.mo23673b("launchApplication: %s %s %b", this.f40621c, str, Boolean.valueOf(z));
        pfx pfx = new pfx();
        pfx.mo23027a(z);
        mo23649a(str, pfx.f39073a);
    }

    /* renamed from: a */
    public final void mo23190a(String str, byte[] bArr) {
        int i;
        qav qav = this.f40622d;
        Object[] objArr = new Object[3];
        objArr[0] = this.f40621c;
        objArr[1] = str;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        objArr[2] = Integer.valueOf(i);
        qav.mo23670a("onBinaryMessageReceived: %s %s %d", objArr);
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                ptt.mo23009a(str, bArr);
            }
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: a */
    public final void mo23654a(String str, byte[] bArr, long j) {
        this.f40629k.mo16658a(new pye(this, "sendBinaryMessage", str, bArr, j));
    }

    /* renamed from: a */
    public final void mo23655a(ptt ptt) {
        m31604a("registerCastDeviceControllerListener", new pxn(this, ptt));
    }

    /* renamed from: a */
    public final void mo23191a(boolean z) {
        try {
            ptt ptt = this.f40623e;
            if (ptt != null) {
                if (!z) {
                    ptt.mo23010b(2300);
                } else {
                    ptt.mo23010b(0);
                }
            }
            this.f40622d.mo23670a("Connected to device. rejoinedApp: %b", Boolean.valueOf(z));
        } catch (RemoteException e) {
            mo23806b(false);
        }
    }

    /* renamed from: a */
    public final void mo23656a(boolean z, double d, boolean z2) {
        this.f40629k.mo16658a(new pxs(this, "setMute", z, d, z2));
    }
}
