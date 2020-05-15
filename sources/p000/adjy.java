package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Set;

/* renamed from: adjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjy {

    /* renamed from: a */
    private static final adfs f61960a = new adfs("NetworkCriteria");

    /* renamed from: b */
    private final Context f61961b;

    /* renamed from: c */
    private final adem f61962c;

    /* renamed from: d */
    private String f61963d;

    /* renamed from: e */
    private final Set f61964e = new C1225nr();

    public adjy(Context context, adem adem) {
        this.f61961b = context;
        this.f61962c = adem;
    }

    /* renamed from: b */
    private final synchronized void m50678b() {
        String o = cepl.f183185a.mo6606a().mo79544o();
        if (!o.equals(this.f61963d)) {
            this.f61963d = o;
            this.f61964e.clear();
            for (String str : o.split(",")) {
                String trim = str.trim();
                if (!trim.isEmpty()) {
                    try {
                        this.f61964e.add(Integer.valueOf(Integer.parseInt(trim)));
                    } catch (NumberFormatException e) {
                        f61960a.mo33425a(e, "%s", o);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo33596a() {
        boolean z = true;
        if (!cepl.f183185a.mo6606a().mo79548s() || this.f61962c.mo33394a()) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f61961b.getSystemService("connectivity");
        if (connectivityManager == null) {
            f61960a.mo33429c("ConnectivityManager N/A", new Object[0]);
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        m50678b();
        synchronized (this) {
            if (activeNetworkInfo.getType() == 0 && this.f61964e.contains(Integer.valueOf(activeNetworkInfo.getSubtype()))) {
                z = false;
            }
        }
        return z;
    }
}
