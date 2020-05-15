package p000;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: aoov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoov {

    /* renamed from: c */
    private static final sek f78617c = aope.m66267a("RcsBindingManager");

    /* renamed from: d */
    private static aoov f78618d;

    /* renamed from: a */
    public final aoow f78619a = new aoow(rpr.m34216b());

    /* renamed from: b */
    public final aopb f78620b;

    /* renamed from: e */
    private final aopf f78621e;

    /* renamed from: f */
    private final aoot f78622f;

    /* renamed from: g */
    private int f78623g = 1;

    public aoov(aoot aoot, aopf aopf) {
        this.f78621e = aopf;
        this.f78620b = aopb.m66261a(rpr.m34216b());
        this.f78622f = aoot;
        aoot.mo43131a(new aoou());
    }

    /* renamed from: a */
    public static synchronized aoov m66238a() {
        aoov aoov;
        synchronized (aoov.class) {
            if (f78618d == null) {
                f78618d = new aoov(new aooy(), new aopf(rpr.m34216b()));
            }
            aoov = f78618d;
        }
        return aoov;
    }

    /* renamed from: b */
    private final synchronized void m66241b(int i) {
        this.f78623g = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized int mo43137c() {
        return this.f78623g;
    }

    /* renamed from: b */
    public static boolean m66242b() {
        return !TextUtils.isEmpty(cghr.m145491b());
    }

    /* renamed from: b */
    public final synchronized void mo43136b(String str, String str2) {
        sek sek = f78617c;
        String valueOf = String.valueOf(str);
        sek.mo25414c(valueOf.length() == 0 ? new String("Disconnected from ") : "Disconnected from ".concat(valueOf), new Object[0]);
        this.f78620b.mo43144a(str, 3, str2);
        m66241b(1);
        this.f78621e.mo43145a(0, str);
    }

    /* renamed from: a */
    private static Status m66239a(int i, String str) {
        f78617c.mo25414c(str, new Object[0]);
        return new Status(i, str);
    }

    /* renamed from: a */
    private static Status m66240a(String str) {
        int i = Build.VERSION.SDK_INT;
        if (!sqc.m35963b(TextUtils.split(cghr.m145491b(), ","), str)) {
            return m66239a(32500, "Binding disabled by phenotype flag.");
        }
        int i2 = Build.VERSION.SDK_INT;
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(rpr.m34216b());
        if (defaultSmsPackage == null || !defaultSmsPackage.equalsIgnoreCase(str)) {
            String valueOf = String.valueOf(str);
            return m66239a(32502, valueOf.length() == 0 ? new String("Calling package is not the default SMS application: ") : "Calling package is not the default SMS application: ".concat(valueOf));
        }
        try {
            PackageInfo packageInfo = rpr.m34216b().getPackageManager().getPackageInfo(str, 0);
            int applicationEnabledSetting = rpr.m34216b().getPackageManager().getApplicationEnabledSetting(str);
            if (applicationEnabledSetting == 1 || (packageInfo.applicationInfo.enabled && applicationEnabledSetting == 0)) {
                return Status.f30107a;
            }
        } catch (PackageManager.NameNotFoundException | IllegalArgumentException e) {
        }
        String valueOf2 = String.valueOf(str);
        return m66239a(32504, valueOf2.length() == 0 ? new String("Calling application package is disabled: ") : "Calling application package is disabled: ".concat(valueOf2));
    }

    /* renamed from: a */
    public final synchronized Status mo43133a(int i) {
        sek sek = f78617c;
        StringBuilder sb = new StringBuilder(69);
        sb.append("Checking if we should rebind to previous service. Attempt ");
        sb.append(i);
        sek.mo25414c(sb.toString(), new Object[0]);
        if (mo43137c() != 1) {
            f78617c.mo25414c("Already bound or binding to the RCS service", new Object[0]);
            return Status.f30111e;
        }
        if (this.f78619a.f78624a.getBoolean("binding_requested", false) && !TextUtils.isEmpty(this.f78619a.mo43138a())) {
            if (!TextUtils.isEmpty(this.f78619a.mo43139b())) {
                Status a = m66240a(this.f78619a.mo43138a());
                if (!Status.f30107a.equals(a)) {
                    f78617c.mo25414c("Package we were previously bound to does not pass eligibility tests anymore", new Object[0]);
                    this.f78619a.mo43141d();
                    return a;
                }
                int c = mo43137c();
                m66241b(2);
                if (this.f78622f.mo43132a(this.f78619a.mo43138a(), this.f78619a.mo43139b(), this.f78619a.mo43140c())) {
                    f78617c.mo25414c(String.format("Requested rebinding to %s, action %s! Waiting for connection", this.f78619a.mo43138a(), this.f78619a.mo43139b()), new Object[0]);
                    return Status.f30107a;
                }
                m66241b(c);
                f78617c.mo25414c("Binding request failed", new Object[0]);
                this.f78622f.mo43130a();
                if (i >= 3) {
                    f78617c.mo25414c("Maximum retries reached, clearing binding preferences", new Object[0]);
                    this.f78619a.mo43141d();
                } else {
                    this.f78621e.mo43145a(i + 1, this.f78619a.mo43138a());
                }
                return Status.f30112f;
            }
        }
        return m66239a(32505, "No valid settings for binding.");
    }

    /* renamed from: a */
    public final synchronized Status mo43134a(String str, boolean z, String str2, String str3) {
        f78617c.mo25414c(String.format("Binding requested (%b) by %s, action %s", Boolean.valueOf(z), str, str2), new Object[0]);
        if (str == null) {
            return m66239a(32505, "Calling package must not be null.");
        }
        if (!z) {
            if (str.equalsIgnoreCase(this.f78619a.mo43138a())) {
                this.f78622f.mo43130a();
                this.f78619a.mo43141d();
                m66241b(1);
                rpr.m34216b().stopService(aopd.m66266a(rpr.m34216b()));
                return Status.f30107a;
            }
        }
        if (str2 != null) {
            Status a = m66240a(str);
            if (!Status.f30107a.equals(a)) {
                return a;
            }
            if (mo43137c() != 1) {
                this.f78622f.mo43130a();
                m66241b(1);
            }
            this.f78619a.mo43141d();
            if (z) {
                int c = mo43137c();
                m66241b(2);
                if (!this.f78622f.mo43132a(str, str2, str3)) {
                    m66241b(c);
                    this.f78622f.mo43130a();
                    return m66239a(32503, "Binding failed! Service not found");
                }
                SharedPreferences.Editor edit = this.f78619a.f78624a.edit();
                edit.putBoolean("binding_requested", true);
                edit.putString("package_name", str);
                edit.putString("service_action", str2);
                edit.putString("token", str3);
                edit.apply();
                rpr.m34216b().startService(aopd.m66266a(rpr.m34216b()));
                f78617c.mo25414c("Binding successful! Waiting for connection", new Object[0]);
            }
            return Status.f30107a;
        }
        return m66239a(32505, "Service action must not be null.");
    }

    /* renamed from: a */
    public final synchronized void mo43135a(String str, String str2) {
        m66241b(3);
        sek sek = f78617c;
        String valueOf = String.valueOf(str);
        sek.mo25414c(valueOf.length() == 0 ? new String("Connected to ") : "Connected to ".concat(valueOf), new Object[0]);
        this.f78620b.mo43144a(str, 2, str2);
    }
}
