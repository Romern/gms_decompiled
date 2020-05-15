package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: axur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axur extends soa {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f96411a;

    /* renamed from: b */
    final /* synthetic */ axuv f96412b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axur(axuv axuv, CountDownLatch countDownLatch) {
        super(9);
        this.f96412b = axuv;
        this.f96411a = countDownLatch;
    }

    public final void run() {
        String str;
        axuv axuv = this.f96412b;
        axuv axuv2 = axuv.f96418a;
        synchronized (axuv.f96425f) {
            this.f96411a.countDown();
            List<ApplicationInfo> installedApplications = this.f96412b.f96422c.getInstalledApplications(0);
            axuv axuv3 = this.f96412b;
            HashSet<axue> hashSet = new HashSet();
            Cursor c = axuv3.mo53609c(axuv3.f96427h.mo53808b().f96814a);
            try {
                c.moveToFirst();
                while (!c.isAfterLast()) {
                    hashSet.add(axuv.m83268b(axxj.m83472a(c)));
                }
                if (c != null) {
                    c.close();
                }
                HashSet<axue> hashSet2 = new HashSet();
                for (ApplicationInfo applicationInfo : installedApplications) {
                    str = applicationInfo.packageName;
                    axue a = axug.m83241a(this.f96412b.f96421b, str);
                    hashSet.remove(a);
                    hashSet2.add(a);
                }
                for (axue axue : hashSet) {
                    this.f96412b.mo53607b(axue.f96377a);
                }
                for (axue axue2 : hashSet2) {
                    this.f96412b.mo53599a(axue2);
                }
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
                sb.append("Could not generate AppKey for package \"");
                sb.append(str);
                sb.append("\"");
                Log.e("CapabilityService", sb.toString());
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    if (((axue) it.next()).f96377a.equals(str)) {
                        it.remove();
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25);
                sb2.append("Could not find package \"");
                sb2.append(str);
                sb2.append("\"");
                Log.e("CapabilityService", sb2.toString());
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        return;
        throw th;
    }
}
