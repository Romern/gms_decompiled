package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import com.google.android.gms.libs.scheduler.PendingCallback;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: apik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apik {

    /* renamed from: j */
    public static final /* synthetic */ int f84456j = 0;

    /* renamed from: k */
    private static final bmzi f84457k = bmzn.m108681a(apih.f84454a);

    /* renamed from: A */
    private final Integer f84458A;

    /* renamed from: a */
    public final apid f84459a;

    /* renamed from: b */
    public final aapx f84460b;

    /* renamed from: c */
    public final int f84461c;

    /* renamed from: d */
    asfb f84462d;

    /* renamed from: e */
    public final apij f84463e;

    /* renamed from: f */
    final Context f84464f;

    /* renamed from: g */
    public final Integer f84465g;

    /* renamed from: h */
    public final aeaf f84466h;

    /* renamed from: i */
    public final int f84467i;

    /* renamed from: l */
    private final PackageManager f84468l;

    /* renamed from: m */
    private final apia f84469m;

    /* renamed from: n */
    private final String f84470n;

    /* renamed from: o */
    private final ExecutorService f84471o;

    /* renamed from: p */
    private boolean f84472p = false;

    /* renamed from: q */
    private long f84473q;

    /* renamed from: r */
    private long f84474r;

    /* renamed from: s */
    private long f84475s;

    /* renamed from: t */
    private long f84476t;

    /* renamed from: u */
    private long f84477u;

    /* renamed from: v */
    private long f84478v;

    /* renamed from: w */
    private final long f84479w;

    /* renamed from: x */
    private volatile Parcelable f84480x;

    /* renamed from: y */
    private final String f84481y;

    /* renamed from: z */
    private final Integer f84482z;

    public apik(apid apid, Context context, apij apij, ExecutorService executorService, PackageManager packageManager, apia apia, long j, aapx aapx, int i) {
        Integer num;
        String str;
        aeaf aeaf;
        this.f84459a = apid;
        this.f84470n = apid.mo47268f().flattenToShortString();
        this.f84464f = context;
        this.f84463e = apij;
        this.f84471o = executorService;
        this.f84468l = packageManager;
        this.f84469m = apia;
        this.f84479w = j;
        this.f84460b = aapx;
        this.f84461c = i;
        PackageInfo a = m70396a(apid.f84444n.f63120m);
        if (a != null) {
            num = Integer.valueOf(a.applicationInfo.uid);
        } else {
            num = null;
        }
        this.f84482z = num;
        if (a != null) {
            str = a.packageName;
        } else {
            str = null;
        }
        this.f84481y = str;
        PackageInfo a2 = m70397a(apid.f84431a.f28806b, 0);
        if (a2 == null || a2.applicationInfo == null) {
            this.f84465g = null;
            this.f84458A = null;
        } else {
            this.f84465g = Integer.valueOf(a2.applicationInfo.uid);
            this.f84458A = Integer.valueOf(a2.applicationInfo.targetSdkVersion);
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        Integer num2 = this.f84458A;
        int i4 = 2;
        if (num2 == null || num2.intValue() >= 26) {
            i4 = 3;
        } else if (!this.f84459a.mo47278o() ? !cedr.f182397a.mo6606a().mo78893f() : (!cdnj.f181319a.mo6606a().mo78022z() && cedr.m136296d()) || m70400a(this.f84459a)) {
            if (this.f84459a.mo47262a()) {
                i4 = 3;
            }
        }
        this.f84467i = i4;
        if (cdnj.f181319a.mo6606a().mo78013q()) {
            aeae aeae = new aeae();
            aeae.f62981a = true;
            aeae.f62982b = cdnj.f181319a.mo6606a().mo78014r();
            aeaf = aeae.mo33977a();
        } else {
            aeae aeae2 = new aeae();
            aeae2.f62981a = false;
            aeaf = aeae2.mo33977a();
        }
        this.f84466h = aeaf;
    }

    /* renamed from: a */
    public static long m70394a() {
        return TimeUnit.SECONDS.toMillis(cedr.m136298f());
    }

    /* renamed from: m */
    private final synchronized boolean m70402m() {
        if (this.f84468l == null) {
            String valueOf = String.valueOf(this.f84459a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb.append("PackageManager service unavailable, can't execute ");
            sb.append(valueOf);
            Log.w("NetworkScheduler.ATC", sb.toString());
        } else {
            String a = m70398a(this.f84459a.mo47268f(), this.f84468l);
            int a2 = aaor.m21768a(this.f84459a.f84440j.f28717b);
            if (a2 != 0) {
                if (a2 == 6) {
                    this.f84480x = new PendingCallback(new apii(this));
                    return true;
                }
            }
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(a)) {
                this.f84480x = new com.google.android.gms.gcm.PendingCallback(new aaln(this));
                return true;
            } else if (!"com.google.android.gms.gcm.nts.TASK_READY".equals(a)) {
                String flattenToShortString = this.f84459a.mo47268f().flattenToShortString();
                int k = mo47305k();
                StringBuilder sb2 = new StringBuilder(String.valueOf(flattenToShortString).length() + 108);
                sb2.append("Unable to resolve correct action against ");
                sb2.append(flattenToShortString);
                sb2.append(" for user #");
                sb2.append(k);
                sb2.append(" to instantiate callback. Not executing task.");
                Log.e("NetworkScheduler.ATC", sb2.toString());
            } else {
                this.f84480x = new com.google.android.gms.gcm.nts.PendingCallback(new aaqa(this));
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private final synchronized boolean m70403n() {
        boolean z;
        String str = this.f84481y;
        String str2 = str != null ? str : this.f84459a.f84431a.f28806b;
        Integer num = this.f84465g;
        if (num != null) {
            if (num.intValue() == Process.myUid() && cedr.f182397a.mo6606a().mo78889b()) {
                this.f84462d = new asfb(this.f84464f, 1, m70404o(), null, str2, this.f84459a.f84431a.f28807c);
                this.f84477u = SystemClock.elapsedRealtime();
                this.f84462d.mo49114a(this.f84470n, this.f84479w);
                z = true;
            }
        }
        this.f84462d = new asfb(this.f84464f, 1, m70404o(), null, str2);
        Integer num2 = this.f84482z;
        String str3 = this.f84481y;
        if (num2 == null) {
            num2 = this.f84465g;
            str3 = this.f84459a.f84431a.f28806b;
        }
        WorkSource workSource = null;
        if (num2 == null) {
            String valueOf = String.valueOf(this.f84459a.mo47268f());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append("No PackageInfo for ");
            sb.append(valueOf);
            sb.append(", not blaming for wake lock");
            Log.w("NetworkScheduler.ATC", sb.toString());
        } else {
            Integer num3 = this.f84465g;
            if (num3 != null) {
                if (str3 != null) {
                    workSource = stx.m36334a(num3.intValue(), str3);
                }
            }
        }
        if (workSource != null) {
            this.f84462d.mo49121c(workSource);
            this.f84477u = SystemClock.elapsedRealtime();
            this.f84462d.mo49114a(this.f84470n, this.f84479w);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: o */
    private final String m70404o() {
        if (!this.f84459a.mo47278o()) {
            return "*net_scheduler*";
        }
        if (!cedx.m136353b() && !cdnj.f181319a.mo6606a().mo77995R()) {
            return "*net_scheduler*";
        }
        StringBuilder sb = new StringBuilder("*gms_scheduler*");
        if (cdnj.f181319a.mo6606a().mo77992O()) {
            sb.append('/');
            sb.append(this.f84459a.mo47268f().flattenToShortString());
        } else if (cdnj.f181319a.mo6606a().mo77994Q()) {
            sb.append('/');
            String className = this.f84459a.mo47268f().getClassName();
            String str = "";
            String substring = className.startsWith("com.google.android.gms") ? className.substring(23) : className.startsWith("com.google.android.apps") ? className.substring(24) : className.startsWith("com.google.android") ? className.substring(19) : str;
            if (!TextUtils.isEmpty(substring)) {
                int indexOf = substring.indexOf(46);
                if (indexOf >= 0) {
                    str = substring.substring(0, indexOf);
                } else {
                    str = substring;
                }
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        return;
     */
    /* renamed from: p */
    private final synchronized void m70405p() {
        asfb asfb = this.f84462d;
        if (asfb != null) {
            if (!asfb.mo49124e()) {
                String valueOf = String.valueOf(this.f84470n);
                Log.e("NetworkScheduler.ATC", valueOf.length() == 0 ? new String("Trying to release unacquired lock: ") : "Trying to release unacquired lock: ".concat(valueOf));
                return;
            }
            try {
                this.f84462d.mo49122c(this.f84470n);
                this.f84478v = SystemClock.elapsedRealtime();
            } catch (RuntimeException e) {
                String valueOf2 = String.valueOf(e.getMessage());
                Log.w("NetworkScheduler.ATC", valueOf2.length() == 0 ? new String("Caught exception releasing unacquired lock: ") : "Caught exception releasing unacquired lock: ".concat(valueOf2));
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo47295b(int i) {
        if (this.f84472p) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
            sb.append("Called cancelTask for already completed task ");
            sb.append(valueOf);
            sb.append(" :");
            sb.append(aecb.m51624a(i));
            Log.e("NetworkScheduler.ATC", sb.toString());
            return;
        }
        m70405p();
        this.f84474r = SystemClock.elapsedRealtime();
        this.f84476t = SystemClock.uptimeMillis();
        this.f84469m.mo47247a(this.f84459a, bqcn.m112585b(this.f84474r - this.f84473q), bqcn.m112585b(this.f84476t - this.f84475s));
        this.f84469m.mo47248a(this.f84459a, TimeUnit.MILLISECONDS.toSeconds(this.f84473q));
        this.f84472p = true;
    }

    /* renamed from: b */
    public final boolean mo47296b() {
        return this.f84467i == 3;
    }

    /* renamed from: c */
    public final boolean mo47297c() {
        return m70400a(this.f84459a);
    }

    /* renamed from: d */
    public final synchronized bxun mo47298d() {
        if (this.f84472p) {
            long j = this.f84478v;
            if (j > 0) {
                return bxzr.m124575a(Math.min(this.f84479w, j - this.f84477u));
            }
        }
        return bxun.f164861c;
    }

    /* renamed from: e */
    public final synchronized bxun mo47299e() {
        if (this.f84472p) {
            return bxzr.m124575a(this.f84474r - this.f84473q);
        }
        return bxun.f164861c;
    }

    /* renamed from: f */
    public final synchronized long mo47300f() {
        return this.f84473q;
    }

    /* renamed from: g */
    public final synchronized boolean mo47301g() {
        boolean z;
        if (this.f84472p || this.f84465g == null || !m70402m() || !m70403n()) {
            z = false;
        } else {
            this.f84473q = SystemClock.elapsedRealtime();
            this.f84475s = SystemClock.uptimeMillis();
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public final synchronized boolean mo47302h() {
        return this.f84472p;
    }

    /* renamed from: i */
    public final synchronized Intent mo47303i() {
        Intent putExtra;
        putExtra = new Intent("com.google.android.gms.gcm.ACTION_EXECUTE_TASK").setPackage(this.f84464f.getPackageName()).putExtra("tag", this.f84459a.mo47266e()).putExtra("component", this.f84459a.mo47268f()).putExtra("callback", this.f84480x).putExtra("extras", this.f84459a.f84444n.f63120m);
        if (cdnj.m134211g()) {
            putExtra.putExtra("user_serial", mo47305k());
        }
        if (cedr.m136297e()) {
            putExtra.putExtra("max_exec_duration", mo47306l());
        }
        m70399a(putExtra);
        return putExtra;
    }

    /* renamed from: j */
    public final synchronized Intent mo47304j() {
        Intent a;
        a = m70395a(this.f84468l, this.f84459a.mo47268f(), this.f84459a.mo47266e(), this.f84480x, this.f84459a.f84444n.f63120m, mo47306l(), this.f84466h.mo33978a());
        m70399a(a);
        return a;
    }

    /* renamed from: k */
    public final int mo47305k() {
        return (int) this.f84459a.f84431a.f28809e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final long mo47306l() {
        return TimeUnit.MILLISECONDS.toSeconds(this.f84479w);
    }

    public final String toString() {
        return this.f84459a.toString();
    }

    /* renamed from: a */
    public static Intent m70395a(PackageManager packageManager, ComponentName componentName, String str, Parcelable parcelable, Bundle bundle, long j, Bundle bundle2) {
        Intent intent = null;
        if (packageManager != null) {
            String a = m70398a(componentName, packageManager);
            if (a == null) {
                String valueOf = String.valueOf(componentName.flattenToShortString());
                Log.e("NetworkScheduler.ATC", valueOf.length() == 0 ? new String("Error finding compatible intent-filter to handle SERVICE_ACTION_EXECUTE_TASK for ") : "Error finding compatible intent-filter to handle SERVICE_ACTION_EXECUTE_TASK for ".concat(valueOf));
                return null;
            }
            intent = new Intent(a);
            intent.setComponent(componentName).putExtra("tag", str).putExtra("callback", parcelable).putExtra("extras", bundle);
            if (cedr.m136297e()) {
                intent.putExtra("max_exec_duration", j);
            }
            if (bundle2 != null && !bundle2.isEmpty()) {
                intent.putExtra("engine_flags", bundle2);
            }
        }
        return intent;
    }

    /* renamed from: a */
    private final PackageInfo m70396a(Bundle bundle) {
        if (bundle != null) {
            try {
                String string = new Bundle(bundle).getString("callingPackage");
                if (!TextUtils.isEmpty(string)) {
                    PackageInfo a = m70397a(string, 64);
                    if (a == null) {
                        String valueOf = String.valueOf(string);
                        Log.e("NetworkScheduler.ATC", valueOf.length() == 0 ? new String("Provided calling package not found: ") : "Provided calling package not found: ".concat(valueOf));
                        return null;
                    } else if (rfz.m33557a(this.f84464f).mo24606a(a)) {
                        return a;
                    }
                }
                return null;
            } catch (BadParcelableException e) {
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof ClassNotFoundException) {
                    return null;
                }
                throw e2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final PackageInfo m70397a(String str, int i) {
        PackageManager packageManager = this.f84468l;
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(str, i);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m70398a(ComponentName componentName, PackageManager packageManager) {
        if (m70401a("com.google.android.gms.gcm.ACTION_TASK_READY", componentName, packageManager)) {
            return "com.google.android.gms.gcm.ACTION_TASK_READY";
        }
        if (m70401a("com.google.android.gms.gcm.nts.TASK_READY", componentName, packageManager)) {
            return "com.google.android.gms.gcm.nts.TASK_READY";
        }
        return null;
    }

    /* renamed from: a */
    private final void m70399a(Intent intent) {
        if (intent != null && this.f84459a.mo47280q()) {
            intent.putParcelableArrayListExtra("triggered_uris", new ArrayList(this.f84459a.mo47265d()));
        }
    }

    /* renamed from: a */
    private static boolean m70400a(apid apid) {
        int i = apid.f84444n.f63113f;
        return i == 1 || (i == 2 && ((Boolean) f84457k.mo6606a()).booleanValue());
    }

    /* renamed from: a */
    private static boolean m70401a(String str, ComponentName componentName, PackageManager packageManager) {
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent(str).setPackage(componentName.getPackageName()), 0);
        if (queryIntentServices != null) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (resolveInfo.serviceInfo.name.equals(componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo47293a(int i) {
        if (this.f84472p) {
            String valueOf = String.valueOf(this.f84459a.mo47268f());
            String e = this.f84459a.mo47266e();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(e).length());
            sb.append("Received callback from client for task that is already complete. ");
            sb.append(valueOf);
            sb.append(" ");
            sb.append(e);
            Log.e("NetworkScheduler.ATC", sb.toString());
            return;
        }
        mo47295b(7);
        this.f84471o.execute(new apig(this, i));
    }

    /* renamed from: a */
    public final synchronized void mo47294a(PrintWriter printWriter) {
        String formatElapsedTime = DateUtils.formatElapsedTime((SystemClock.elapsedRealtime() - this.f84473q) / 1000);
        String flattenToShortString = this.f84459a.mo47268f().flattenToShortString();
        String e = this.f84459a.mo47266e();
        long j = this.f84459a.f84431a.f28809e;
        int length = String.valueOf(flattenToShortString).length();
        StringBuilder sb = new StringBuilder(length + 35 + String.valueOf(e).length() + String.valueOf(formatElapsedTime).length());
        sb.append("   ");
        sb.append(flattenToShortString);
        sb.append(":");
        sb.append(e);
        sb.append(",");
        sb.append(j);
        sb.append(" running: ");
        sb.append(formatElapsedTime);
        printWriter.println(sb.toString());
    }
}
