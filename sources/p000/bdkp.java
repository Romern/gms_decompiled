package p000;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bdkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdkp implements bdhy, bdkj {

    /* renamed from: a */
    public static final bnrt f105825a = bnrt.m110178a("bdkp");

    /* renamed from: b */
    public final AtomicBoolean f105826b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Application f105827c;

    /* renamed from: d */
    public final cijl f105828d;

    /* renamed from: e */
    public final int f105829e;

    /* renamed from: f */
    public final int f105830f;

    /* renamed from: g */
    public final int f105831g;

    /* renamed from: h */
    public final double f105832h;

    /* renamed from: i */
    public final int f105833i;

    /* renamed from: j */
    public final IntentFilter f105834j = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: k */
    public final ayte f105835k;

    /* renamed from: l */
    public final bdkg f105836l;

    /* renamed from: m */
    public ScheduledFuture f105837m;

    /* renamed from: n */
    private final bdkq f105838n;

    /* renamed from: o */
    private WifiManager f105839o;

    public bdkp(bdkh bdkh, Application application, cijl cijl, bmxv bmxv, ayte ayte, bdkq bdkq) {
        this.f105836l = bdkh.mo58105a((Executor) cijl.mo6445a(), bdpz.m91271a());
        this.f105827c = application;
        this.f105828d = cijl;
        bdkm bdkm = (bdkm) bmxv.mo66814b();
        this.f105829e = bdkm.mo58108b();
        this.f105830f = bdkm.mo58111e();
        this.f105831g = bdkm.mo58109c();
        this.f105833i = bdkm.mo58110d();
        this.f105832h = bdkm.mo58113f();
        this.f105835k = ayte;
        this.f105838n = bdkq;
    }

    /* renamed from: g */
    private final synchronized void m90981g() {
        ScheduledFuture scheduledFuture = this.f105837m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f105837m = null;
        }
    }

    /* renamed from: a */
    public final cimy mo58123a(Intent intent) {
        boolean z;
        bxvd da = cimy.f190871f.mo74144da();
        if (this.f105839o == null) {
            this.f105839o = (WifiManager) this.f105827c.getSystemService("wifi");
        }
        boolean isWifiEnabled = this.f105839o.isWifiEnabled();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimy cimy = (cimy) da.f164949b;
        cimy.f190873a |= 4;
        cimy.f190876d = isWifiEnabled;
        boolean z2 = true;
        if (C1133kh.m17835a(this.f105827c, "android.permission.BLUETOOTH") == 0) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                z = false;
            } else {
                z = true;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimy cimy2 = (cimy) da.f164949b;
            cimy2.f190873a |= 8;
            cimy2.f190877e = z;
        }
        boolean c = bdjb.m90892c(this.f105827c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimy cimy3 = (cimy) da.f164949b;
        cimy3.f190873a |= 1;
        cimy3.f190874b = c;
        int intExtra = intent.getIntExtra("status", -1);
        if (!(intExtra == 2 || intExtra == 5)) {
            z2 = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimy cimy4 = (cimy) da.f164949b;
        cimy4.f190873a = 2 | cimy4.f190873a;
        cimy4.f190875c = z2;
        return (cimy) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo58063a() {
    }

    /* renamed from: b */
    public final float mo58124b(Intent intent) {
        return ((float) intent.getIntExtra("level", -1)) / ((float) intent.getIntExtra("scale", -1));
    }

    /* renamed from: c */
    public final void mo58086c() {
        mo58127f();
        mo58125d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo58125d() {
        if (!this.f105826b.get()) {
            int i = 0;
            while (true) {
                if (i >= 5) {
                    break;
                }
                bdkq bdkq = this.f105838n;
                ayte ayte = bdkq.f105840a;
                long currentTimeMillis = System.currentTimeMillis();
                Long a = bdkq.mo58128a(currentTimeMillis - (currentTimeMillis % 31557600000L));
                if (a == null) {
                    break;
                }
                long longValue = a.longValue() - this.f105835k.mo54417a();
                if (longValue > 0) {
                    long longValue2 = a.longValue();
                    int i2 = this.f105831g;
                    this.f105826b.set(true);
                    this.f105837m = ((bqgk) this.f105828d.mo6445a()).mo25814a(new bdko(this, longValue2 + ((long) i2)), longValue, TimeUnit.MILLISECONDS);
                    break;
                }
                i++;
            }
        }
    }

    /* renamed from: e */
    public final synchronized File mo58126e() {
        String concat;
        File file;
        String a = bdjb.m90890a();
        concat = String.valueOf(a).concat(".trace");
        File filesDir = this.f105827c.getFilesDir();
        String valueOf = String.valueOf(a);
        file = new File(filesDir, valueOf.length() == 0 ? new String("primes_profiling_") : "primes_profiling_".concat(valueOf));
        return (file.exists() || file.mkdir()) ? new File(file, concat) : null;
    }

    /* renamed from: f */
    public final void mo58127f() {
        File e = mo58126e();
        if (e != null) {
            try {
                if (e.exists()) {
                    e.delete();
                }
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: b */
    public final void mo58031b() {
        m90981g();
    }
}
