package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: gko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gko {

    /* renamed from: a */
    static final long f18415a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    public static final imn f18416b = new gkl();

    /* renamed from: c */
    private final Context f18417c;

    /* renamed from: d */
    private final rfz f18418d;

    /* renamed from: e */
    private final Map f18419e;

    public gko(Context context) {
        rfz a = rfz.m33557a(context);
        srb srb = srb.f45012a;
        HashMap hashMap = new HashMap();
        this.f18417c = context;
        sdo.m34959a(a);
        this.f18418d = a;
        sdo.m34959a(srb);
        sdo.m34959a(hashMap);
        this.f18419e = hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[ExcHandler: NoSuchAlgorithmException (e java.security.NoSuchAlgorithmException), Splitter:B:3:0x0005] */
    /* renamed from: b */
    private final gkm m13337b(String str) {
        boolean z;
        int i = 0;
        loop0:
        while (i < 2) {
            try {
                PackageInfo b = svr.m36484b(this.f18417c).mo26176b(str, 64);
                if (b == null || b.signatures == null || b.signatures.length == 0 || b.signatures[0] == null) {
                    throw new gkn("Invalid package signature.");
                }
                String a = boan.f132472f.mo68788c().mo68794a(MessageDigest.getInstance("SHA1").digest(b.signatures[0].toByteArray()));
                boolean a2 = this.f18418d.mo24606a(b);
                String[] a3 = svr.m36484b(this.f18417c).mo26175a(b.applicationInfo.uid);
                if (a3 != null) {
                    int length = a3.length;
                    int i2 = 0;
                    while (true) {
                        z = true;
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        PackageInfo b2 = svr.m36484b(this.f18417c).mo26176b(a3[i2], 0);
                        if (b2 == null) {
                            continue;
                        } else if ((b2.applicationInfo.flags & 1) == 0) {
                        }
                        i2++;
                    }
                    return new gkm(str, a, a2, z, b.firstInstallTime);
                }
                throw new gkn("Unable to get packages for the uid.");
            } catch (PackageManager.NameNotFoundException e) {
                throw new gkn("Invalid package name.");
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        throw new gkn("Unable to compute package signature.");
    }

    /* renamed from: a */
    public final gkm mo11990a(String str) {
        synchronized (this.f18419e) {
            C1240of ofVar = (C1240of) this.f18419e.get(str);
            if (ofVar == null || ((Long) ofVar.f26799b).longValue() <= SystemClock.elapsedRealtime() - f18415a) {
                gkm b = m13337b(str);
                this.f18419e.put(str, C1240of.m19758a(b, Long.valueOf(SystemClock.elapsedRealtime())));
                return b;
            }
            gkm gkm = (gkm) ofVar.f26798a;
            return gkm;
        }
    }
}
