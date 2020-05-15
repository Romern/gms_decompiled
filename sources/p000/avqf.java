package p000;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: avqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avqf extends avqd {

    /* renamed from: f */
    public static final Logger f93774f = avpq.m79020g("ZeroRatedNetworkRequester");

    /* renamed from: i */
    private static final bnhe f93775i;

    /* renamed from: g */
    public final AtomicBoolean f93776g = new AtomicBoolean(false);

    /* renamed from: h */
    public final AtomicBoolean f93777h = new AtomicBoolean(false);

    /* renamed from: j */
    private final List f93778j;

    /* renamed from: k */
    private final boolean f93779k;

    /* renamed from: l */
    private final long f93780l;

    /* renamed from: m */
    private final long f93781m;

    static {
        bnha bnha = new bnha();
        bnha.mo67695b("CAPTIVE_PORTAL", 17);
        bnha.mo67695b("DUN", 2);
        bnha.mo67695b("EIMS", 10);
        bnha.mo67695b("FOTA", 3);
        bnha.mo67695b("IA", 7);
        bnha.mo67695b("IMS", 4);
        bnha.mo67695b("INTERNET", 12);
        bnha.mo67695b("MMS", 0);
        bnha.mo67695b("NOT_METERED", 11);
        bnha.mo67695b("NOT_RESTRICTED", 13);
        bnha.mo67695b("NOT_VPN", 15);
        bnha.mo67695b("RCS", 8);
        bnha.mo67695b("SUPL", 1);
        bnha.mo67695b("TRUSTED", 14);
        bnha.mo67695b("VALIDATED", 16);
        bnha.mo67695b("WIFI_P2P", 6);
        bnha.mo67695b("XCAP", 9);
        f93775i = bnha.mo67618b();
    }

    private avqf(Context context, List list, boolean z, long j, long j2) {
        super(context);
        this.f93778j = list;
        this.f93779k = z;
        this.f93780l = j;
        this.f93781m = j2;
    }

    /* renamed from: c */
    public final void mo51499c() {
        if (this.f93766b.getPackageManager().checkPermission("android.permission.CONNECTIVITY_USE_RESTRICTED_NETWORKS", this.f93766b.getPackageName()) == 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f93778j) {
                Integer num = (Integer) f93775i.get(str);
                if (num != null) {
                    arrayList.add(num);
                } else {
                    String valueOf = String.valueOf(str);
                    throw new IOException(valueOf.length() == 0 ? new String("Capabilities contains invalid value: ") : "Capabilities contains invalid value: ".concat(valueOf));
                }
            }
            try {
                mo51498b(this.f93780l);
                this.f93776g.set(true);
            } catch (IOException e) {
                f93774f.mo25417e("Failed to acquire the non-metered network.", e, new Object[0]);
                try {
                    mo51496a(arrayList, this.f93781m);
                    this.f93777h.set(true);
                } catch (IOException e2) {
                    f93774f.mo25417e("Failed to acquire the network.", e2, new Object[0]);
                    if (this.f93779k) {
                        mo51495a(this.f93780l);
                        return;
                    }
                    throw new IOException("Unable to acquire the network (fallback not attempted).");
                }
            }
        } else {
            throw new IOException("No permission to request for a network with capabilities.");
        }
    }

    /* renamed from: a */
    public static avqf m79049a(Context context, List list, boolean z, long j, long j2) {
        int i = Build.VERSION.SDK_INT;
        bmxy.m108588a(true);
        return new avqf(context, list, z, j, j2);
    }
}
