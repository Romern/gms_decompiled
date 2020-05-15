package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
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

/* renamed from: pyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pyx extends ptp implements IBinder.DeathRecipient, pik, aaai {

    /* renamed from: a */
    public final String f40681a = ccxs.m132043d();

    /* renamed from: b */
    public final Context f40682b;

    /* renamed from: c */
    public final String f40683c;

    /* renamed from: d */
    public final qav f40684d;

    /* renamed from: e */
    final pim f40685e;

    /* renamed from: f */
    public pil f40686f;

    /* renamed from: g */
    public aaac f40687g;

    /* renamed from: h */
    private final ptt f40688h;

    /* renamed from: i */
    private final boolean f40689i;

    /* renamed from: j */
    private final boolean f40690j;

    /* renamed from: k */
    private final int f40691k;

    /* renamed from: l */
    private final Handler f40692l = new adzt(Looper.getMainLooper());

    /* renamed from: m */
    private final aaag f40693m;

    /* renamed from: n */
    private final boolean f40694n = ccxv.m132089b();

    public pyx(Context context, aaac aaac, CastDevice castDevice, String str, String str2, boolean z, boolean z2, ptt ptt, int i, String str3, long j, qav qav, aaag aaag, pin pin) {
        this.f40682b = context.getApplicationContext();
        this.f40684d = qav;
        this.f40693m = aaag;
        sdo.m34959a(aaac);
        this.f40687g = aaac;
        this.f40691k = i;
        this.f40688h = ptt;
        this.f40683c = str3;
        this.f40689i = z;
        this.f40690j = z2;
        this.f40685e = new pim(str3, i, j, "API", this);
        this.f40684d.mo23673b("Google Play services client: %s, Google Play services APK: %d", Integer.valueOf(i), 201515000);
        try {
            this.f40687g.mo16654a((IBinder.DeathRecipient) this);
            this.f40688h.asBinder().linkToDeath(this, 0);
        } catch (RemoteException e) {
            this.f40684d.mo23677d("client disconnected before listener was set", new Object[0]);
            m31661b(false);
        }
        this.f40684d.mo23673b("acquireDeviceController by %s", this.f40683c);
        String str4 = castDevice.f29723k;
        TextUtils.isEmpty(str4);
        this.f40693m.mo16658a(new pyn(this, "ConnectToDevice", pin, castDevice, str4, aaac, str, str2));
    }

    /* renamed from: b */
    private final synchronized void m31661b(boolean z) {
        String str;
        qav qav = this.f40684d;
        Object[] objArr = new Object[1];
        pil pil = this.f40686f;
        if (pil != null) {
            str = pil.mo23217g();
        } else {
            str = null;
        }
        objArr[0] = str;
        qav.mo23670a("Disposing ConnectedClient; controller=%s.", objArr);
        pil pil2 = this.f40686f;
        if (pil2 != null) {
            if (pil2 instanceof pkd) {
                pkd pkd = (pkd) pil2;
                pkd.f39434n.remove(this.f40685e);
                pkd.mo23295i();
                return;
            }
            if (!pil2.mo23211b() && !this.f40686f.mo23213c()) {
                if (!this.f40686f.mo23214d()) {
                    ((pjc) this.f40686f).mo23262p();
                }
            }
            this.f40693m.mo16658a(new pyo(this, "DisconnectFromDevice", z));
        }
        try {
            this.f40688h.asBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
        }
        mo23811b();
    }

    /* renamed from: a */
    public final void mo23645a() {
        this.f40684d.mo23673b("disconnect: %s", this.f40683c);
        m31661b(true);
    }

    /* renamed from: a */
    public final void mo23655a(ptt ptt) {
    }

    /* renamed from: b */
    public final void mo23192b(int i) {
    }

    /* renamed from: b */
    public final void mo23193b(String str, String str2) {
    }

    public final void binderDied() {
        this.f40684d.mo23673b("Binder just died", new Object[0]);
        m31661b(false);
    }

    /* renamed from: bm */
    public final void mo23194bm() {
        this.f40684d.mo23673b("onApplicationLeaveFailed: %s %s", this.f40683c, pew.m30274a(2001));
        try {
            this.f40688h.mo23014f(2001);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: c */
    public final void mo23658c() {
        this.f40693m.mo16658a(new pyr(this, "leaveApplication"));
    }

    /* renamed from: d */
    public final void mo23660d() {
        this.f40693m.mo16658a(new pyt(this, "requestStatus"));
    }

    /* renamed from: e */
    public final void mo23661e() {
    }

    /* renamed from: f */
    public final void mo23662f() {
    }

    @Deprecated
    /* renamed from: g */
    public final void mo23663g(String str, String str2) {
        this.f40684d.mo23673b("joinApplication: %s %s %s", this.f40683c, str, str2);
        mo23652a(str, str2, new JoinOptions());
    }

    /* renamed from: a */
    public final void mo23646a(double d, double d2, boolean z) {
        this.f40693m.mo16658a(new pyl(this, "setVolume", d, d2, z));
    }

    /* renamed from: c */
    public final void mo23195c(int i) {
        this.f40684d.mo23673b("onDisconnected: package: %s status=%s", this.f40683c, pew.m30274a(i));
        if (this.f40688h.asBinder().isBinderAlive()) {
            try {
                this.f40688h.mo23001a(i);
            } catch (RemoteException e) {
                this.f40684d.mo23670a("client died while brokering service", new Object[0]);
            }
        } else {
            this.f40684d.mo23670a("Binder is not alive. Not calling onDisconnected", new Object[0]);
        }
        m31661b(false);
    }

    /* renamed from: d */
    public final void mo23196d(int i) {
        this.f40684d.mo23673b("onApplicationConnectionFailed: %s %s", this.f40683c, pew.m30274a(i));
        try {
            this.f40688h.mo23012d(i);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: e */
    public final void mo23197e(int i) {
        this.f40684d.mo23670a("onApplicationStopFailed: %s %s", this.f40683c, pew.m30274a(i));
        try {
            this.f40688h.mo23013e(i);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: a */
    public final void mo23181a(int i) {
        if (this.f40687g != null) {
            this.f40684d.mo23673b("onConnectionFailed: package: %s status=%s", this.f40683c, pew.m30274a(i));
            if (!ccxv.m132090c()) {
                i = 2301;
            } else if (i == 0) {
                i = 2301;
            }
            this.f40687g.mo16650a(i, (Bundle) null);
            mo23811b();
            return;
        }
        this.f40684d.mo23675c("GmsCallbacks called the second time", new Object[0]);
    }

    /* renamed from: d */
    public final void mo23813d(String str) {
        this.f40692l.post(new pyg(this, str));
    }

    /* renamed from: e */
    public final boolean mo23814e(String str) {
        return TextUtils.isEmpty(str) || pwe.f40451b.equals(str) || pkz.f39550a.equals(str) || str.startsWith(qau.f40838g) || qau.f40833b.equals(str) || qau.f40834c.equals(str) || qau.f40835d.equals(str) || qau.f40837f.equals(str) || (qau.f40836e.equals(str) && !qay.m31782a(this.f40682b, this.f40683c)) || (ptw.f40214b.equals(str) && !qay.m31782a(this.f40682b, this.f40683c));
    }

    /* renamed from: a */
    public final void mo23182a(int i, String str) {
        this.f40684d.mo23673b("onApplicationDisconnected: %s %s %s", this.f40683c, str, pew.m30274a(i));
        try {
            this.f40688h.mo23015g(i);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: b */
    public final synchronized void mo23811b() {
        aaac aaac = this.f40687g;
        if (aaac != null) {
            try {
                aaac.mo16655b(this);
            } catch (NoSuchElementException e) {
            }
            this.f40687g = null;
        }
    }

    /* renamed from: c */
    public final void mo23659c(String str) {
        this.f40693m.mo16658a(new pyv(this, "unregisterNamespace", str));
    }

    /* renamed from: b */
    public final void mo23657b(String str) {
        this.f40693m.mo16658a(new pyu(this, "registerNamespace", str));
    }

    /* renamed from: a */
    public final void mo23183a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.f40684d.mo23673b("onApplicationConnected: %s %s %s %s %b", this.f40683c, applicationMetadata, str, str2, Boolean.valueOf(z));
        String str3 = applicationMetadata.f29706a;
        if (!TextUtils.isEmpty(str3) && !this.f40683c.equals("com.google.android.gms") && !this.f40683c.equals("com.google.android.apps.chromecast.app")) {
            SharedPreferences b = qay.m31785b(this.f40682b);
            Set<String> stringSet = b.getStringSet("googlecast-cafAppIdsNotificationEnabled", new HashSet());
            if (!this.f40689i && !this.f40690j) {
                stringSet.remove(str3);
            } else {
                stringSet.add(str3);
            }
            b.edit().putStringSet("googlecast-cafAppIdsNotificationEnabled", stringSet).apply();
        }
        try {
            this.f40688h.mo23002a(applicationMetadata, str, str2, z);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: a */
    public final void mo23647a(EqualizerSettings equalizerSettings) {
        if (this.f40694n) {
            this.f40693m.mo16658a(new pym(this, "setEqualizerSettings", equalizerSettings));
        }
    }

    /* renamed from: a */
    public final void mo23184a(ApplicationStatus applicationStatus) {
        this.f40684d.mo23670a("onApplicationStatusChanged: %s %s", this.f40683c, applicationStatus);
        try {
            this.f40688h.mo23003a(applicationStatus);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: a */
    public final void mo23185a(DeviceStatus deviceStatus) {
        this.f40684d.mo23670a("onDeviceStatusChanged: %s %s", this.f40683c, deviceStatus);
        try {
            this.f40688h.mo23004a(deviceStatus);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: a */
    public final void mo23648a(String str) {
        this.f40693m.mo16658a(new pys(this, "stopApplication", str));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo23186a(String str, double d, boolean z) {
        if (!srq.m36140a(this.f40691k)) {
            this.f40684d.mo23670a("onStatusReceived: %s %s %f %b", this.f40683c, str, Double.valueOf(d), Boolean.valueOf(z));
            try {
                this.f40688h.mo23005a(str, d, z);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo23187a(String str, long j) {
        this.f40684d.mo23670a("onMessageEnqueued: %s %s %d", this.f40683c, str, Long.valueOf(j));
        try {
            this.f40688h.mo23006a(str, j);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: a */
    public final void mo23188a(String str, long j, int i) {
        this.f40684d.mo23673b("onMessageSendFailed: %s %s %d %s", this.f40683c, str, Long.valueOf(j), pew.m30274a(i));
        try {
            this.f40688h.mo23007a(str, j, i);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: a */
    public final void mo23649a(String str, LaunchOptions launchOptions) {
        this.f40693m.mo16658a(new pyq(this, "launchApplicationWithOptions", launchOptions, str));
    }

    /* renamed from: a */
    public final void mo23189a(String str, String str2) {
        this.f40684d.mo23670a("onTextMessageReceived: %s %s %s", this.f40683c, str, str2);
        try {
            this.f40688h.mo23008a(str, str2);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: a */
    public final void mo23650a(String str, String str2, long j) {
        this.f40693m.mo16658a(new pyi(this, "sendTextMessage", str, str2, j));
    }

    /* renamed from: a */
    public final void mo23651a(String str, String str2, long j, String str3) {
        this.f40693m.mo16658a(new pyj(this, "sendTextMessageWithDestinationId", str, str2, j, str3));
    }

    /* renamed from: a */
    public final void mo23652a(String str, String str2, JoinOptions joinOptions) {
        this.f40693m.mo16658a(new pyp(this, "joinApplicationWithOptions", joinOptions, str, str2));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo23653a(String str, boolean z) {
        this.f40684d.mo23673b("launchApplication: %s %s %b", this.f40683c, str, Boolean.valueOf(z));
        pfx pfx = new pfx();
        pfx.mo23027a(z);
        mo23649a(str, pfx.f39073a);
    }

    /* renamed from: a */
    public final void mo23190a(String str, byte[] bArr) {
        int i;
        qav qav = this.f40684d;
        Object[] objArr = new Object[3];
        objArr[0] = this.f40683c;
        objArr[1] = str;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        objArr[2] = Integer.valueOf(i);
        qav.mo23670a("onBinaryMessageReceived: %s %s %d", objArr);
        try {
            this.f40688h.mo23009a(str, bArr);
        } catch (RemoteException e) {
            m31661b(false);
        }
    }

    /* renamed from: a */
    public final void mo23654a(String str, byte[] bArr, long j) {
        this.f40693m.mo16658a(new pyh(this, "sendBinaryMessage", str, bArr, j));
    }

    /* renamed from: a */
    public final void mo23191a(boolean z) {
        aaac aaac = this.f40687g;
        if (aaac == null) {
            this.f40684d.mo23675c("GmsCallbacks called the second time", new Object[0]);
            return;
        }
        if (!z) {
            aaac.mo16651a(2300, this, null);
        } else {
            aaac.mo16652a((aaai) this);
        }
        mo23811b();
        this.f40684d.mo23670a("Connected to device. rejoinedApp: %b", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo23656a(boolean z, double d, boolean z2) {
        this.f40693m.mo16658a(new pyk(this, "setMute", z, d, z2));
    }
}
