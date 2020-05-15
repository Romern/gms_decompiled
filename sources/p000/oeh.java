package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.car.power.BatteryStateMonitor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: oeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oeh implements oee {

    /* renamed from: n */
    public static final /* synthetic */ int f37344n = 0;

    /* renamed from: o */
    private static final bnsn f37345o = odk.m28481a("CAR.POWER");

    /* renamed from: p */
    private static final float f37346p = ((float) ccuf.f179931a.mo6606a().mo76797h());

    /* renamed from: q */
    private static final float f37347q = ((float) ccuf.f179931a.mo6606a().mo76798i());

    /* renamed from: r */
    private static final int f37348r = ((int) ccuf.f179931a.mo6606a().mo76795f());

    /* renamed from: s */
    private static final int f37349s = ((int) ccuf.f179931a.mo6606a().mo76796g());

    /* renamed from: t */
    private static final int f37350t = ((int) ccuf.f179931a.mo6606a().mo76794e());

    /* renamed from: a */
    public int f37351a = -1;

    /* renamed from: b */
    public long f37352b;

    /* renamed from: c */
    public int f37353c = -1;

    /* renamed from: d */
    public float f37354d = 0.0f;

    /* renamed from: e */
    public boolean f37355e = false;

    /* renamed from: f */
    public boolean f37356f = false;

    /* renamed from: g */
    public boolean f37357g = false;

    /* renamed from: h */
    public final BatteryStateMonitor f37358h;

    /* renamed from: i */
    public final CopyOnWriteArrayList f37359i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public volatile int f37360j = 0;

    /* renamed from: k */
    public final Object f37361k = new Object();

    /* renamed from: l */
    public int f37362l = 0;

    /* renamed from: m */
    public final oeg f37363m;

    /* renamed from: u */
    private final PowerManager f37364u;

    /* renamed from: v */
    private Method f37365v;

    public oeh(Context context) {
        this.f37358h = new BatteryStateMonitor(context);
        this.f37364u = (PowerManager) context.getSystemService("power");
        try {
            this.f37365v = PowerManager.class.getMethod("userActivity", Long.TYPE, Integer.TYPE, Integer.TYPE);
        } catch (NoSuchMethodException e) {
            bnsi c = f37345o.mo68388c();
            c.mo68432a("oeh", "<init>", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("PowerManager.userActivity not found");
            this.f37360j = -1;
        }
        this.f37363m = new oeg(this, Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void mo22048a() {
        BatteryStateMonitor batteryStateMonitor = this.f37358h;
        batteryStateMonitor.f29501d = this;
        if (!batteryStateMonitor.f29502e.getAndSet(true)) {
            batteryStateMonitor.f29500c.registerReceiver(batteryStateMonitor, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        }
    }

    /* renamed from: b */
    public final void mo22052b() {
        mo22049a(1);
    }

    /* renamed from: c */
    public final void mo22053c() {
        mo22049a(2);
    }

    /* renamed from: d */
    public final int mo22054d() {
        int i;
        synchronized (this.f37361k) {
            i = this.f37362l;
        }
        return i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oeh.a(int, boolean):void
     arg types: [int, int]
     candidates:
      oeh.a(float, int):void
      oee.a(float, int):void
      oeh.a(int, boolean):void */
    /* renamed from: a */
    public final void mo22044a(float f, int i) {
        int i2;
        int i3;
        this.f37354d = f;
        this.f37353c = i;
        if (f >= f37346p) {
            this.f37355e = true;
            bnsi d = f37345o.mo68390d();
            d.mo68432a("oeh", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("battery temp too high, temp:%g", Float.valueOf(f));
        }
        if (i <= f37348r) {
            this.f37356f = true;
            bnsi d2 = f37345o.mo68390d();
            d2.mo68432a("oeh", "a", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68409a("battery level too low, level:%d", i);
        }
        int i4 = this.f37351a;
        boolean z = false;
        if (i4 == -1) {
            this.f37351a = i;
            this.f37352b = SystemClock.elapsedRealtime();
            this.f37357g = false;
        } else if (i <= i4 - f37350t) {
            this.f37357g = true;
            bnsi d3 = f37345o.mo68390d();
            d3.mo68432a("oeh", "a", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68409a("battery level dropped too much, level:%d", i);
        }
        if (this.f37355e && f < f37347q) {
            this.f37355e = false;
            bnsi d4 = f37345o.mo68390d();
            d4.mo68432a("oeh", "a", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d4.mo68420a("battery cooled down, temp:%g", Float.valueOf(f));
        }
        if (this.f37356f && i >= f37349s) {
            this.f37356f = false;
            bnsi d5 = f37345o.mo68390d();
            d5.mo68432a("oeh", "a", 169, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d5.mo68409a("battery level above threshold, level:%d", i);
        }
        if (this.f37357g && i >= this.f37351a) {
            this.f37357g = false;
            bnsi d6 = f37345o.mo68390d();
            d6.mo68432a("oeh", "a", 173, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d6.mo68409a("battery level recovered, level:%d", i);
        }
        if (!this.f37355e) {
            i2 = 0;
        } else {
            i2 = 9;
        }
        if (this.f37356f) {
            i2 |= 3;
        }
        if (this.f37357g) {
            i2 |= 5;
        }
        synchronized (this.f37361k) {
            int i5 = this.f37362l;
            i3 = i2 | (-65536 & i5);
            if (i3 != i5) {
                this.f37362l = i3;
                z = true;
            }
        }
        if (z) {
            mo22050a(i3, true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oeh.a(int, boolean):void
     arg types: [int, int]
     candidates:
      oeh.a(float, int):void
      oee.a(float, int):void
      oeh.a(int, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo22049a(int i) {
        int i2;
        int i3;
        int i4;
        if (this.f37365v != null && this.f37360j == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                this.f37365v.invoke(this.f37364u, Long.valueOf(uptimeMillis), Integer.valueOf(i), 2);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                i4 = -2;
            } catch (SecurityException e2) {
                i4 = -3;
            }
            synchronized (this.f37361k) {
                i2 = this.f37362l;
                i3 = 65536 | i2;
                this.f37362l = i3;
            }
            if (i2 != i3) {
                mo22050a(i3, false);
            }
            this.f37363m.mo22045a();
            return;
        }
        return;
        this.f37360j = i4;
        synchronized (this.f37361k) {
        }
    }

    /* renamed from: a */
    public final void mo22050a(int i, boolean z) {
        Iterator it = this.f37359i.iterator();
        while (it.hasNext()) {
            ((oef) it.next()).mo21269a(i, z);
        }
    }

    /* renamed from: a */
    public final void mo22051a(oef oef) {
        if (oef != null) {
            this.f37359i.addIfAbsent(oef);
        }
    }
}
