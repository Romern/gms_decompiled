package p000;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import com.google.android.gms.car.CrashInfoParcel;
import com.google.android.gms.car.diagnostics.CrashReporterServiceImpl;
import com.google.android.gms.car.display.CarRegionId;
import java.io.PrintWriter;

/* renamed from: nij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nij {

    /* renamed from: a */
    public static final bnsn f35704a = odk.m28481a("CAR.CAM");

    /* renamed from: b */
    protected final nip f35705b;

    /* renamed from: c */
    protected final niv f35706c;

    /* renamed from: d */
    protected final ComponentName f35707d;

    /* renamed from: e */
    public volatile boolean f35708e = false;

    /* renamed from: f */
    public final Runnable f35709f = new nie(this);

    /* renamed from: g */
    public Handler f35710g;

    /* renamed from: h */
    protected final String f35711h;

    /* renamed from: i */
    public boolean f35712i = false;

    /* renamed from: j */
    public volatile int f35713j = -1;

    /* renamed from: k */
    public volatile String f35714k = "unknown";

    /* renamed from: l */
    public boolean f35715l;

    /* renamed from: m */
    public boolean f35716m;

    /* renamed from: n */
    public volatile int f35717n = -1;

    /* renamed from: o */
    public boolean f35718o = false;

    /* renamed from: p */
    public boolean f35719p;

    /* renamed from: q */
    public nin f35720q;

    /* renamed from: r */
    public Animation f35721r;

    /* renamed from: s */
    public boolean f35722s;

    /* renamed from: t */
    protected final oqa f35723t;

    /* renamed from: u */
    protected final CarRegionId f35724u;

    /* renamed from: v */
    private int f35725v = -1;

    /* renamed from: w */
    private String f35726w;

    /* renamed from: x */
    private volatile RuntimeException f35727x = null;

    /* renamed from: y */
    private volatile boolean f35728y = false;

    /* renamed from: z */
    private final boolean f35729z;

    protected nij(nip nip, niv niv, ComponentName componentName, oqa oqa, CarRegionId carRegionId) {
        this.f35705b = nip;
        this.f35706c = niv;
        this.f35723t = oqa;
        this.f35724u = carRegionId;
        this.f35707d = componentName;
        this.f35729z = nip.mo20831f().mo21393d();
        this.f35711h = m26407a(this.f35707d);
    }

    /* renamed from: a */
    static String m26407a(ComponentName componentName) {
        String className = componentName.getClassName();
        return className.lastIndexOf(46) < className.length() + -1 ? className.substring(className.lastIndexOf(46) + 1) : className;
    }

    /* renamed from: r */
    private final void mo21468r() {
        bnsi c = f35704a.mo68388c();
        c.mo68432a("nij", "r", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Binder died.");
        if (ccql.m131267b()) {
            this.f35705b.mo20827d().mo20858a(bpdi.CAR_SERVICE, bpdh.CAR_ACTIVITY_MANAGER_BINDER_DIED, this.f35707d.getPackageName());
        }
    }

    /* renamed from: a */
    public abstract void mo20766a(Configuration configuration, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20767a(PrintWriter printWriter) {
    }

    /* renamed from: a */
    public abstract void mo20770a(String str);

    /* renamed from: a */
    public void mo20771a(nij nij) {
        this.f35719p = false;
    }

    /* renamed from: b */
    public abstract int mo20773b();

    /* renamed from: b */
    public abstract void mo20774b(nil nil);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nij.a(java.lang.RuntimeException, boolean):void
     arg types: [java.lang.RuntimeException, int]
     candidates:
      nij.a(android.content.res.Configuration, int):void
      nij.a(java.lang.RuntimeException, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo20775b(String str) {
        if (!this.f35729z) {
            this.f35718o = true;
            mo20782h();
            String flattenToShortString = this.f35707d.flattenToShortString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(flattenToShortString).length());
            sb.append("ANR(");
            sb.append(str);
            sb.append(") in ");
            sb.append(flattenToShortString);
            mo20769a(new RuntimeException(sb.toString()), false);
            return true;
        }
        bnsi c = f35704a.mo68388c();
        c.mo68432a("nij", "b", 474, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("component: %s; Ignoring ANR because ANR monitoring is disabled.", this.f35711h);
        return false;
    }

    /* renamed from: c */
    public abstract oos mo20776c();

    /* renamed from: c */
    public abstract void mo20777c(int i);

    /* renamed from: d */
    public abstract boolean mo20778d();

    /* renamed from: e */
    public abstract void mo20779e();

    /* renamed from: f */
    public void mo20780f() {
        int i = nip.f35750c;
        this.f35722s = true;
        niv niv = this.f35706c;
        niv.f35780e.remove(this);
        if (niv.f35780e.isEmpty()) {
            niv.f35778c.mo20810a(niv);
        }
        this.f35705b.mo20832f(this);
    }

    /* renamed from: g */
    public void mo20781g() {
        int i = nip.f35750c;
        toString();
        this.f35712i = false;
        this.f35713j = -1;
        this.f35728y = false;
        this.f35727x = null;
        this.f35708e = false;
        this.f35714k = "unknown";
        this.f35715l = false;
        this.f35717n = -1;
        this.f35725v = -1;
        this.f35726w = null;
        this.f35718o = false;
        this.f35719p = false;
    }

    /* renamed from: h */
    public abstract void mo20782h();

    /* renamed from: i */
    public abstract void mo20783i();

    /* renamed from: j */
    public abstract void mo20784j();

    /* renamed from: k */
    public abstract boolean mo20785k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo20786l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract String mo20787m();

    /* renamed from: n */
    public final boolean mo20788n() {
        return !this.f35722s && this.f35719p;
    }

    /* renamed from: o */
    public final int mo20789o() {
        int i = this.f35725v;
        if (i != -1) {
            return i;
        }
        try {
            this.f35725v = this.f35705b.mo20797a().getPackageManager().getPackageInfo(this.f35707d.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            this.f35725v = 0;
            this.f35707d.getPackageName();
        }
        return this.f35725v;
    }

    /* renamed from: p */
    public final String mo20790p() {
        String str = this.f35726w;
        if (str != null) {
            return str;
        }
        try {
            String str2 = this.f35705b.mo20797a().getPackageManager().getPackageInfo(this.f35707d.getPackageName(), 0).versionName;
            this.f35726w = str2;
            if (str2 == null) {
                this.f35726w = "";
            }
        } catch (PackageManager.NameNotFoundException e) {
            this.f35726w = "";
            this.f35707d.getPackageName();
        }
        return this.f35726w;
    }

    /* renamed from: q */
    public final void mo20791q() {
        if (!this.f35728y) {
            this.f35728y = true;
            this.f35705b.mo20809a(this, new nik(this.f35727x));
        }
    }

    /* renamed from: x */
    public abstract ComponentName mo20792x();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20768a(RuntimeException runtimeException, CrashInfoParcel crashInfoParcel, boolean z) {
        if (!this.f35712i) {
            if (crashInfoParcel == null && runtimeException != null) {
                crashInfoParcel = new CrashInfoParcel(runtimeException);
            }
            npq npq = new npq(crashInfoParcel, this.f35705b.mo20829e().mo21346p());
            if (crashInfoParcel != null) {
                npq.f36344a = mo20787m();
                npq.mo21428a(this.f35714k);
                npq.f36348e = this.f35713j;
                if (this.f35705b.mo20822b(this.f35707d)) {
                    String packageName = this.f35707d.getPackageName();
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 29);
                    sb.append(packageName);
                    sb.append(".ANDROID_AUTO_PROJECTED_CRASH");
                    npq.f36349f = sb.toString();
                }
                if (!z && this.f35716m) {
                    CrashReporterServiceImpl.m22083a(this.f35705b.mo20797a(), this.f35707d.getPackageName(), npq);
                }
            }
            mo20786l();
            this.f35712i = true;
            this.f35727x = runtimeException;
            if (this.f35708e) {
                mo20791q();
                return;
            }
            adzt adzt = new adzt(Looper.getMainLooper());
            this.f35710g = adzt;
            nwp.m28032a(adzt, this.f35709f, 1000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20769a(RuntimeException runtimeException, boolean z) {
        mo20768a(runtimeException, null, z);
    }

    /* renamed from: a */
    public void mo20772a(nil nil) {
        this.f35719p = true;
        this.f35720q = nil.f35732a;
        this.f35721r = nil.f35735d;
    }
}
