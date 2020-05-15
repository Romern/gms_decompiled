package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.android.media.remotedisplay.RemoteDisplay;
import com.android.media.remotedisplay.RemoteDisplayProvider;
import com.google.android.gms.cast.CastDevice;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: qbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qbn extends RemoteDisplayProvider implements pvb {

    /* renamed from: d */
    public static qbn f40874d;

    /* renamed from: e */
    public static int f40875e = 0;

    /* renamed from: a */
    public final qav f40876a = new qav("CastMirroringProvider");

    /* renamed from: b */
    public final Context f40877b;

    /* renamed from: c */
    public final ScheduledExecutorService f40878c;

    /* renamed from: f */
    public pvc f40879f;

    /* renamed from: g */
    public qbl f40880g;

    /* renamed from: h */
    public boolean f40881h;

    /* renamed from: i */
    public boolean f40882i;

    /* renamed from: j */
    public boolean f40883j;

    /* renamed from: k */
    public qbm f40884k;

    /* renamed from: l */
    public qbj f40885l;

    /* renamed from: m */
    public qbx f40886m;

    /* renamed from: n */
    private final qam f40887n;

    /* renamed from: o */
    private final pmx f40888o;

    /* renamed from: p */
    private final pva f40889p;

    /* renamed from: q */
    private final alw f40890q;

    /* renamed from: r */
    private final alm f40891r;

    /* renamed from: s */
    private final all f40892s;

    /* renamed from: t */
    private final Handler f40893t = new adzt(Looper.getMainLooper());

    /* renamed from: u */
    private Intent f40894u;

    /* renamed from: v */
    private PendingIntent f40895v;

    /* renamed from: w */
    private qbx f40896w;

    /* renamed from: x */
    private qbx f40897x;

    /* renamed from: y */
    private qca f40898y;

    public qbn(Context context, ScheduledExecutorService scheduledExecutorService, pmx pmx, pva pva, alw alw) {
        super(context);
        this.f40877b = context;
        this.f40878c = scheduledExecutorService;
        this.f40888o = pmx;
        this.f40889p = pva;
        this.f40887n = new qam(context, "CastMirroringProvider");
        this.f40890q = alw;
        this.f40891r = new qbk(this);
        alk alk = new alk();
        alk.mo973a(pev.m30272a(ccxs.m132043d()));
        alk.mo973a(pev.m30272a(ccxs.m132041b()));
        this.f40892s = alk.mo971a();
    }

    /* renamed from: a */
    public static qbn m31799a(Context context, ScheduledExecutorService scheduledExecutorService, pmx pmx, pva pva, alw alw) {
        qbn qbn;
        synchronized (qbn.class) {
            if (f40875e == 0) {
                f40874d = new qbn(context, scheduledExecutorService, pmx, pva, alw);
            }
            f40875e++;
            qbn = f40874d;
        }
        return qbn;
    }

    /* renamed from: a */
    public final CastDevice mo23873a() {
        pvc pvc = this.f40879f;
        if (pvc != null) {
            return pvc.f40381p;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo23879b() {
        this.f40893t.post(new qbi(this));
    }

    public final PendingIntent getSettingsPendingIntent() {
        if (this.f40895v == null) {
            this.f40895v = PendingIntent.getActivity(this.f40877b, 0, new Intent("android.intent.action.MAIN").setPackage(ccxs.m132042c()), 0);
        }
        return this.f40895v;
    }

    public final void onAdjustVolume(RemoteDisplay remoteDisplay, int i) {
        this.f40878c.execute(new qbd(this, remoteDisplay, i));
    }

    public final void onConnect(RemoteDisplay remoteDisplay) {
        mo23875a(remoteDisplay);
    }

    public final void onDisconnect(RemoteDisplay remoteDisplay) {
        this.f40878c.execute(new qbb(this, remoteDisplay));
    }

    public final void onDiscoveryModeChanged(int i) {
        this.f40876a.mo23673b("onDiscoveryModeChanged, mode=%d", Integer.valueOf(i));
        if (i == 1) {
            this.f40890q.mo1005a(this.f40892s, this.f40891r, 4);
        } else if (i != 2) {
            this.f40890q.mo1006a(this.f40891r);
            this.f40878c.execute(new qaz(this));
        } else {
            this.f40890q.mo1005a(this.f40892s, this.f40891r, 5);
        }
    }

    public final void onSetVolume(RemoteDisplay remoteDisplay, int i) {
        this.f40878c.execute(new qbc(this, remoteDisplay, i));
    }

    /* renamed from: c */
    private final boolean m31800c() {
        int i = Build.VERSION.SDK_INT;
        if (this.f40877b.checkSelfPermission("android.permission.CAPTURE_VIDEO_OUTPUT") != -1 || this.f40894u != null) {
            return false;
        }
        this.f40882i = true;
        Context context = this.f40877b;
        context.startActivity(new Intent().setClassName(context, "com.google.android.gms.cast.activity.CastNearbyPinActivity").addFlags(268435456).putExtra("ACTIVITY_TYPE", "consent"));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo23880b(RemoteDisplay remoteDisplay) {
        this.f40895v = qbn.super.getSettingsPendingIntent();
        this.f40883j = true;
        CastDevice a = mo23873a();
        String id = remoteDisplay.getId();
        if (a == null || !a.mo17494a().equals(id)) {
            mo23878a(null, null, id, this.f40895v);
            remoteDisplay.setStatus(3);
            updateDisplay(remoteDisplay);
        } else {
            remoteDisplay.setStatus(4);
            updateDisplay(remoteDisplay);
            mo23879b();
        }
        this.f40884k = null;
    }

    /* renamed from: a */
    public final void mo23874a(Intent intent) {
        if (intent == null && this.f40894u != null && cdbq.f180432a.mo6606a().mo77207a()) {
            int i = Build.VERSION.SDK_INT;
            ((MediaProjectionManager) this.f40877b.getSystemService("media_projection")).getMediaProjection(-1, this.f40894u).stop();
        }
        this.f40894u = intent;
    }

    /* renamed from: b */
    public final void mo23726b(CastDevice castDevice, boolean z) {
        int i = 0;
        this.f40876a.mo23673b("onDeviceCollectedData: device=%s, error=%b", castDevice, Boolean.valueOf(z));
        qbx qbx = this.f40886m;
        if (qbx != null) {
            if (z) {
                i = 2207;
            }
            try {
                qbx.mo23897a(i);
            } catch (RemoteException e) {
            }
            this.f40886m = null;
        }
    }

    /* renamed from: a */
    public final void mo23875a(RemoteDisplay remoteDisplay) {
        if (m31800c()) {
            this.f40884k = new qbm(remoteDisplay, this.f40888o.mo23451a(remoteDisplay.getId()));
            remoteDisplay.setStatus(3);
            return;
        }
        this.f40878c.execute(new qba(this, remoteDisplay));
    }

    /* renamed from: a */
    public final void mo23724a(CastDevice castDevice, int i) {
        this.f40876a.mo23673b("onDeviceStartedMirroring: device=%s, displayId=%d", castDevice, Integer.valueOf(i));
        this.f40887n.mo23842a();
        RemoteDisplay findRemoteDisplay = findRemoteDisplay(castDevice.mo17494a());
        if (findRemoteDisplay != null) {
            findRemoteDisplay.setStatus(4);
            findRemoteDisplay.setPresentationDisplayId(i);
            updateDisplay(findRemoteDisplay);
        }
        qbx qbx = this.f40896w;
        if (qbx != null) {
            try {
                qbx.mo23896a();
            } catch (RemoteException e) {
            }
            this.f40896w = null;
        }
        this.f40881h = false;
        mo23879b();
        Intent intent = new Intent("com.google.android.gms.cast_mirroring.MIRRORING_STARTED");
        intent.putExtra("extra_cast_device", castDevice);
        this.f40877b.sendBroadcast(intent);
        this.f40893t.post(new qbf(this));
    }

    /* renamed from: a */
    public final void mo23725a(CastDevice castDevice, boolean z) {
        int i;
        this.f40876a.mo23673b("onDeviceStoppedMirroring: device=%s, error=%b", castDevice, Boolean.valueOf(z));
        this.f40887n.mo23843b();
        RemoteDisplay findRemoteDisplay = findRemoteDisplay(castDevice.mo17494a());
        if (findRemoteDisplay != null) {
            findRemoteDisplay.setStatus(2);
            findRemoteDisplay.setPresentationDisplayId(-1);
            updateDisplay(findRemoteDisplay);
        }
        qbx qbx = this.f40897x;
        if (qbx == null) {
            qbx qbx2 = this.f40896w;
            if (qbx2 != null) {
                try {
                    qbx2.mo23897a(2203);
                } catch (RemoteException e) {
                }
                this.f40896w = null;
            }
        } else {
            if (z) {
                try {
                    qbx.mo23897a(2204);
                } catch (RemoteException e2) {
                }
            } else {
                qbx.mo23898c();
            }
            this.f40897x = null;
        }
        if (!z) {
            i = 0;
        } else {
            i = 2206;
        }
        qca qca = this.f40898y;
        if (qca != null) {
            try {
                Parcel bj = qca.mo8529bj();
                bj.writeInt(i);
                qca.mo8530c(1, bj);
            } catch (RemoteException e3) {
            }
            this.f40898y = null;
        }
        this.f40879f = null;
        this.f40881h = false;
        this.f40883j = false;
        mo23879b();
        Intent intent = new Intent("com.google.android.gms.cast_mirroring.MIRRORING_ENDED");
        intent.putExtra("extra_status_code", i);
        intent.putExtra("extra_cast_device", castDevice);
        this.f40877b.sendBroadcast(intent);
        this.f40893t.post(new qbg(this, castDevice));
    }

    /* renamed from: a */
    public final void mo23876a(qbl qbl) {
        if (this.f40880g != qbl) {
            this.f40880g = qbl;
            mo23879b();
        }
    }

    /* renamed from: a */
    public final void mo23877a(qbx qbx) {
        pvc pvc = this.f40879f;
        if (pvc != null) {
            this.f40897x = qbx;
            pvc.mo944e();
            this.f40879f = null;
        } else if (qbx != null) {
            try {
                qbx.mo23897a(2208);
            } catch (RemoteException e) {
            }
        }
        mo23879b();
        this.f40893t.post(new qbe(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* renamed from: a */
    public final void mo23878a(qbx qbx, qca qca, String str, PendingIntent pendingIntent) {
        CastDevice castDevice;
        pwd pwd;
        String str2;
        CastDevice a = this.f40888o.mo23451a(str);
        if (m31800c()) {
            this.f40885l = new qbj(a, qbx, qca, this.f40895v);
            return;
        }
        if (a == null) {
            qbm qbm = this.f40884k;
            if (qbm != null) {
                a = qbm.f40873b;
            } else {
                qbj qbj = this.f40885l;
                a = qbj != null ? qbj.f40867a : null;
            }
            if (a == null) {
                castDevice = null;
            } else if (!a.mo17494a().equals(str)) {
                castDevice = null;
            }
            this.f40876a.mo23856a("startMirroring on device: %s", castDevice);
            if (castDevice == null) {
                pvc pvc = this.f40879f;
                if (pvc != null) {
                    pvc.mo944e();
                }
                qbx qbx2 = this.f40896w;
                if (qbx2 != null) {
                    try {
                        qbx2.mo23897a(2203);
                    } catch (RemoteException e) {
                    }
                }
                this.f40896w = qbx;
                this.f40895v = pendingIntent;
                this.f40898y = qca;
                pva pva = this.f40889p;
                if (!castDevice.mo17496a(4) || castDevice.mo17496a(1)) {
                    String str3 = pvc.f40333k;
                    pwd = pwd.m31503a(4);
                    str2 = str3;
                } else {
                    str2 = pvc.f40334l;
                    pwd = pwd.m31503a(5);
                }
                Context context = pva.f40327a;
                ScheduledExecutorService scheduledExecutorService = pva.f40328b;
                pvv pvv = pva.f40329c;
                pmx pmx = pva.f40330d;
                qbw qbw = pva.f40331e;
                qbv qbv = pva.f40332f;
                pvc pvc2 = new pvc(context, castDevice, scheduledExecutorService, pvv, pmx, str2, pwd);
                this.f40879f = pvc2;
                pvc2.f40276j = this.f40894u;
                pvc2.f40384s.execute(new puy(pvc2, this));
                this.f40879f.mo943d();
                this.f40881h = true;
                mo23879b();
                return;
            } else if (qbx != null) {
                try {
                    qbx.mo23897a(2205);
                    return;
                } catch (RemoteException e2) {
                    return;
                }
            } else {
                return;
            }
        }
        castDevice = a;
        this.f40876a.mo23856a("startMirroring on device: %s", castDevice);
        if (castDevice == null) {
        }
    }
}
