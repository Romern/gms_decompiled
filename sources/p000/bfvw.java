package p000;

import android.os.Binder;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: bfvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfvw implements Runnable {

    /* renamed from: a */
    public bszb f115450a = bszb.f147785d;

    /* renamed from: b */
    public Throwable f115451b;

    /* renamed from: c */
    final /* synthetic */ bfvy f115452c;

    /* renamed from: d */
    private final bszd f115453d;

    /* renamed from: e */
    private final ClientContext f115454e;

    public bfvw(bfvy bfvy, bszd bszd, ClientContext clientContext) {
        this.f115452c = bfvy;
        this.f115453d = bszd;
        this.f115454e = clientContext;
    }

    public final void run() {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            bfvy bfvy = this.f115452c;
            bfvy.f115462c++;
            bfvv bfvv = bfvy.f115460a;
            ClientContext clientContext = this.f115454e;
            bszd bszd = this.f115453d;
            if (bfvv.f115447b == null) {
                bfvv.f115447b = chtv.m149566a(chtu.UNARY, "google.internal.maps.geomobileservices.geocoding.v3mobile.GeocodingService/Geocode", ciie.m150370a(bszd.f147794h), ciie.m150370a(bszb.f147785d));
            }
            bszb bszb = (bszb) bfvv.f115449a.mo25553a(bfvv.f115447b, clientContext, bszd, 10000, TimeUnit.MILLISECONDS);
            this.f115450a = bszb;
            String valueOf = String.valueOf(bszb);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("grpc response = ");
            sb.append(valueOf);
            sb.toString();
        } catch (Exception e) {
            this.f115452c.f115461b++;
            this.f115451b = e;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            this.f115452c.mo62332a();
            throw th;
        }
        Binder.restoreCallingIdentity(clearCallingIdentity);
        this.f115452c.mo62332a();
    }
}
