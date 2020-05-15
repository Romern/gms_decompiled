package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: aphw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aphw {

    /* renamed from: a */
    private final Context f84408a;

    /* renamed from: b */
    private final aamf f84409b;

    public aphw(Context context, aamf aamf) {
        this.f84408a = context;
        this.f84409b = aamf;
    }

    /* renamed from: a */
    public static final void m70331a(PrintWriter printWriter, String[] strArr, Collection collection, apia apia) {
        printWriter.println();
        apia.mo47249a(printWriter);
        apht.m70315a().f84405e.f107332a.mo47208a(printWriter);
        bngf f = bngf.m109302f();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aapm aapm = ((apid) it.next()).f84431a;
            long j = aapm.f28809e;
            String str = aapm.f28806b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
            sb.append("u");
            sb.append((int) j);
            sb.append("|");
            sb.append(str);
            f.add(sb.toString());
        }
        printWriter.println("\nTask count by user and package:");
        for (bnno bnno : f.mo67324e()) {
            String str2 = (String) bnno.f131866a;
            int a = bnno.mo68118a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13);
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(a);
            printWriter.println(sb2.toString());
        }
        List<String> list = null;
        for (String str3 : strArr) {
            if (!"--endpoints".equals(str3)) {
                if (str3.contains("--")) {
                    break;
                } else if (list != null) {
                    list.add(str3);
                }
            } else {
                list = new ArrayList();
            }
        }
        if (list == null) {
            list = bngx.m109356a(".");
        }
        long a2 = apia.mo47242a();
        StringBuilder sb3 = new StringBuilder(73);
        sb3.append("GmsTaskScheduler execution stats over the last ");
        sb3.append(a2);
        sb3.append(" secs\n");
        printWriter.println(sb3.toString());
        printWriter.println("Pending:\n");
        for (String str4 : list) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                apid apid = (apid) it2.next();
                if (apid.mo47268f().flattenToShortString().contains(str4)) {
                    String valueOf = String.valueOf(apid);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb4.append("(scheduled) ");
                    sb4.append(valueOf);
                    printWriter.println(sb4.toString());
                    if (apid.f84437g == 0) {
                        printWriter.println("Not yet run.");
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j2 = apid.f84437g;
                        StringBuilder sb5 = new StringBuilder(40);
                        sb5.append("Last executed ");
                        sb5.append((currentTimeMillis - j2) / 1000);
                        sb5.append("s ago.");
                        printWriter.println(sb5.toString());
                    }
                    printWriter.println();
                }
            }
        }
        apia.mo47251a(printWriter, list);
    }

    /* renamed from: b */
    public static final apid m70332b(apid apid) {
        long j = 0;
        if (apid.f84437g == 0) {
            Log.e("NetworkScheduler", "Rescheduling a periodic should not have a last run-time of 0.");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = elapsedRealtime - (System.currentTimeMillis() - apid.f84437g);
        if (currentTimeMillis > 0 && currentTimeMillis < apid.mo47272i()) {
            j = apid.mo47272i() - currentTimeMillis;
        }
        apid a = apid.m70357a(apid, elapsedRealtime + j);
        a.f84438h = 0;
        return a;
    }

    /* renamed from: c */
    public static final apid m70333c(apid apid) {
        apid a = apid.m70357a(apid, (SystemClock.elapsedRealtime() + ((long) (apif.m70388a(apid) * 1000))) - ((Long) apif.m70389a(apid.f84444n).mo68172b()).longValue());
        a.f84438h = apid.f84438h + 1;
        return a;
    }

    /* renamed from: a */
    public final void mo47237a(aphv aphv, aamh aamh) {
        aecn aecn = new aecn();
        aecn.mo34039a(aamh.f28458b);
        aecn.mo34041b(aamh.f28457a);
        aecn.f63154b = 23;
        aecn.f63153a |= 8;
        aphv.mo47235b(aecn.mo34038a());
        apjh.m70453a(this.f84408a, aamh);
    }

    /* renamed from: a */
    public final void mo47238a(apid apid) {
        if (apid.f84436f) {
            aamh j = apid.mo47273j();
            PackageManager c = this.f84409b.mo17013c(j.f28458b);
            if (c == null || c.checkPermission("android.permission.RECEIVE_BOOT_COMPLETED", j.f28457a) != 0) {
                String str = j.f28457a;
                String e = apid.mo47266e();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 146 + String.valueOf(e).length());
                sb.append(str);
                sb.append(" requested task be persisted for tag: '");
                sb.append(e);
                sb.append("' but does not hold the permission android.permission.RECEIVE_BOOT_COMPLETED. This task won't be persisted.");
                Log.e("NetworkScheduler", sb.toString());
                apid.mo47283t();
            }
            Bundle bundle = apid.f84444n.f63120m;
            if (bundle != null) {
                try {
                    new Bundle(bundle).size();
                } catch (BadParcelableException e2) {
                    apid.mo47283t();
                    String str2 = j.f28457a;
                    String e3 = apid.mo47266e();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 108 + String.valueOf(e3).length());
                    sb2.append(str2);
                    sb2.append(" requested task be persisted for tag: '");
                    sb2.append(e3);
                    sb2.append("' but task contains custom Parcelables. This task won't be persisted.");
                    Log.w("NetworkScheduler", sb2.toString());
                } catch (RuntimeException e4) {
                    if (e4.getCause() instanceof ClassNotFoundException) {
                        apid.mo47283t();
                        String str3 = j.f28457a;
                        String e5 = apid.mo47266e();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 129 + String.valueOf(e5).length());
                        sb3.append(str3);
                        sb3.append(" requested task be persisted for tag: '");
                        sb3.append(e5);
                        sb3.append("' but task contains Parcelables referencing unknown classes. This task won't be persisted.");
                        Log.w("NetworkScheduler", sb3.toString());
                        return;
                    }
                    throw e4;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo47239a(apid apid, int i) {
        long j;
        if (apid.mo47278o()) {
            j = ceea.f182428a.mo6606a().mo78923h();
        } else {
            j = ceea.f182428a.mo6606a().mo78924i();
        }
        if (i >= ((int) j)) {
            String valueOf = String.valueOf(apid);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
            sb.append("Too many tasks scheduled for this package. Not scheduling: ");
            sb.append(valueOf);
            Log.e("NetworkScheduler", sb.toString());
            return false;
        } else if (apid.f84431a.f28806b.isEmpty()) {
            String valueOf2 = String.valueOf(apid);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
            sb2.append("Invalid package name specified, not scheduling: ");
            sb2.append(valueOf2);
            Log.e("NetworkScheduler", sb2.toString());
            return false;
        } else if (!apid.mo47279p() || apid.mo47272i() >= apid.mo47270h()) {
            String e = apid.mo47266e();
            if (e == null || e.length() > 100) {
                String e2 = apid.mo47266e();
                String valueOf3 = String.valueOf(apid);
                StringBuilder sb3 = new StringBuilder(String.valueOf(e2).length() + 44 + String.valueOf(valueOf3).length());
                sb3.append("Dropping task - invalid tag specified: ");
                sb3.append(e2);
                sb3.append(" for ");
                sb3.append(valueOf3);
                Log.e("NetworkScheduler", sb3.toString());
                return false;
            }
            int i2 = Build.VERSION.SDK_INT;
            try {
                if (apid.mo47273j().mo17016a(this.f84409b, 0).targetSdkVersion >= 26 && !apid.mo47262a()) {
                    String valueOf4 = String.valueOf(apid.f84431a.f28806b);
                    Log.e("NetworkScheduler", valueOf4.length() == 0 ? new String("Dropping task as app's play services SDK version does not support Android O. Either update the SDK or lower your app's target SDK version. Package: ") : "Dropping task as app's play services SDK version does not support Android O. Either update the SDK or lower your app's target SDK version. Package: ".concat(valueOf4));
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e3) {
            }
            return true;
        } else {
            Log.e("NetworkScheduler", String.format("Invalid task: %s. Latest runtime %d earlier than earliest %d", apid, Long.valueOf(apid.mo47272i()), Long.valueOf(apid.mo47270h())));
            return false;
        }
    }
}
