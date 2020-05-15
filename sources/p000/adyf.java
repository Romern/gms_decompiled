package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.gms.libs.accountsettings.utils.DarkThemeManager$1;

/* renamed from: adyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyf implements C1504y {

    /* renamed from: a */
    public static Boolean f62894a;

    /* renamed from: b */
    public static Boolean f62895b;

    /* renamed from: c */
    public final deu f62896c;

    /* renamed from: d */
    public final boolean f62897d;

    /* renamed from: e */
    public final bmzi f62898e;

    /* renamed from: f */
    private final boolean f62899f;

    /* renamed from: g */
    private final BroadcastReceiver f62900g;

    public adyf(deu deu, bmzi bmzi, int i, int i2, int i3) {
        this.f62896c = deu;
        boolean z = false;
        if (i3 == 2) {
            f62895b = false;
        } else if (i3 == 3) {
            f62895b = true;
        }
        this.f62899f = i3 != 1 ? true : z;
        this.f62898e = bmzi;
        m51390h();
        this.f62900g = new DarkThemeManager$1(this, "accountsettings/lib");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        deu.registerReceiver(this.f62900g, intentFilter);
        deu.getLifecycle().mo557a(this);
        f62894a = Boolean.valueOf(m51388f());
        boolean a = m51386a(bmzi);
        this.f62897d = a;
        deu.setTheme(a ? i2 : i);
    }

    /* renamed from: a */
    public static boolean m51386a(bmzi bmzi) {
        boolean a;
        synchronized (adyf.class) {
            if (f62894a == null) {
                f62894a = Boolean.valueOf(m51388f());
            }
            a = m51387a(bmzi, f62894a.booleanValue(), m51389g());
        }
        return a;
    }

    /* renamed from: f */
    public static boolean m51388f() {
        m51390h();
        return ((PowerManager) rpr.m34216b().getSystemService("power")).isPowerSaveMode();
    }

    /* renamed from: g */
    public static boolean m51389g() {
        return (rpr.m34216b().getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: a */
    public final void mo2a() {
    }

    /* renamed from: b */
    public final void mo4b() {
    }

    /* renamed from: c */
    public final void mo5c() {
    }

    /* renamed from: d */
    public final void mo6d() {
    }

    /* renamed from: e */
    public final void mo7e() {
    }

    /* renamed from: h */
    private static void m51390h() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static boolean m51387a(bmzi bmzi, boolean z, boolean z2) {
        if (!((Boolean) bmzi.mo6606a()).booleanValue()) {
            return false;
        }
        m51390h();
        Boolean bool = f62895b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!z2 && !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo3a(C0013ak akVar) {
        int i = Build.VERSION.SDK_INT;
        this.f62896c.unregisterReceiver(this.f62900g);
        f62894a = null;
        if (this.f62899f) {
            f62895b = null;
        }
    }
}
