package p000;

import android.accounts.AuthenticatorDescription;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.auth.api.accounttransfer.DeviceAuthInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: gub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gub {

    /* renamed from: a */
    public static final Object f19021a = new Object();

    /* renamed from: b */
    public static gub f19022b = null;

    /* renamed from: l */
    private static final sbw f19023l = new sbw("AccountTransfer", "[ATCache]");

    /* renamed from: c */
    public Map f19024c;

    /* renamed from: d */
    public ConcurrentMap f19025d;

    /* renamed from: e */
    public Set f19026e;

    /* renamed from: f */
    public Set f19027f;

    /* renamed from: g */
    public DeviceAuthInfo f19028g;

    /* renamed from: h */
    public DeviceAuthInfo f19029h;

    /* renamed from: i */
    public Boolean f19030i;

    /* renamed from: j */
    public Boolean f19031j;

    /* renamed from: k */
    public final Object f19032k = new Object();

    /* renamed from: m */
    private Map f19033m;

    /* renamed from: n */
    private ConcurrentMap f19034n;

    /* renamed from: o */
    private ConcurrentMap f19035o;

    /* renamed from: a */
    public static gub m13906a() {
        gub gub;
        synchronized (f19021a) {
            if (f19022b == null) {
                f19022b = new gub();
            }
            gub = f19022b;
        }
        return gub;
    }

    /* renamed from: b */
    public final ConcurrentMap mo12227b() {
        ConcurrentMap concurrentMap;
        synchronized (this.f19032k) {
            if (this.f19035o == null) {
                this.f19035o = new ConcurrentHashMap();
            }
            concurrentMap = this.f19035o;
        }
        return concurrentMap;
    }

    /* renamed from: c */
    public final ConcurrentMap mo12230c() {
        ConcurrentMap concurrentMap;
        synchronized (this.f19032k) {
            if (this.f19034n == null) {
                this.f19034n = new ConcurrentHashMap();
            }
            concurrentMap = this.f19034n;
        }
        return concurrentMap;
    }

    /* renamed from: b */
    public final void mo12228b(Context context) {
        synchronized (this.f19032k) {
            if (this.f19033m != null) {
                if (this.f19024c != null) {
                    return;
                }
            }
            AuthenticatorDescription[] a = adyd.m51363a(context).mo33918a();
            PackageManager packageManager = context.getPackageManager();
            int length = a.length;
            this.f19033m = new HashMap(length);
            this.f19024c = new HashMap(length);
            for (AuthenticatorDescription authenticatorDescription : a) {
                this.f19033m.put(authenticatorDescription.type, authenticatorDescription.packageName);
                try {
                    this.f19024c.put(authenticatorDescription.type, Integer.valueOf(packageManager.getApplicationInfo(authenticatorDescription.packageName, 0).uid));
                } catch (PackageManager.NameNotFoundException e) {
                    f19023l.mo25380d("AccountTransfer", String.format("packageName %s not found", authenticatorDescription.packageName), e);
                    bqye.m113758a(e);
                }
            }
            int i = Build.VERSION.SDK_INT;
        }
    }

    /* renamed from: a */
    public final Map mo12225a(Context context) {
        Map map;
        synchronized (this.f19032k) {
            mo12228b(context);
            map = this.f19033m;
        }
        return map;
    }

    /* renamed from: a */
    public final Set mo12226a(Context context, int i) {
        Set set;
        Set set2;
        if (i != 1) {
            synchronized (this.f19032k) {
                synchronized (this.f19032k) {
                    if (this.f19027f == null) {
                        this.f19027f = gvh.m14003b(context, 2);
                    }
                }
                set2 = this.f19027f;
            }
            return set2;
        }
        synchronized (this.f19032k) {
            synchronized (this.f19032k) {
                if (this.f19026e == null) {
                    this.f19026e = gvh.m14003b(context, 1);
                }
            }
            set = this.f19026e;
        }
        return set;
    }

    /* renamed from: b */
    public final boolean mo12229b(Context context, int i) {
        boolean booleanValue;
        boolean booleanValue2;
        if (i != 1) {
            synchronized (this.f19032k) {
                if (this.f19031j == null) {
                    this.f19031j = Boolean.valueOf(gvh.m14005c(context, 2));
                }
                booleanValue2 = this.f19031j.booleanValue();
            }
            return booleanValue2;
        }
        synchronized (this.f19032k) {
            if (this.f19030i == null) {
                this.f19030i = Boolean.valueOf(gvh.m14005c(context, 1));
            }
            booleanValue = this.f19030i.booleanValue();
        }
        return booleanValue;
    }
}
