package p000;

import android.os.Binder;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: bfvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfvx implements Runnable {

    /* renamed from: a */
    public bszb f115455a = bszb.f147785d;

    /* renamed from: b */
    public Throwable f115456b;

    /* renamed from: c */
    final /* synthetic */ bfvy f115457c;

    /* renamed from: d */
    private final bsze f115458d;

    /* renamed from: e */
    private final ClientContext f115459e;

    public bfvx(bfvy bfvy, bsze bsze, ClientContext clientContext) {
        this.f115457c = bfvy;
        this.f115458d = bsze;
        this.f115459e = clientContext;
    }

    public final void run() {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            bfvy bfvy = this.f115457c;
            bfvy.f115464e++;
            bfvv bfvv = bfvy.f115460a;
            ClientContext clientContext = this.f115459e;
            bsze bsze = this.f115458d;
            if (bfvv.f115448c == null) {
                bfvv.f115448c = chtv.m149566a(chtu.UNARY, "google.internal.maps.geomobileservices.geocoding.v3mobile.GeocodingService/ReverseGeocode", ciie.m150370a(bsze.f147803f), ciie.m150370a(bszb.f147785d));
            }
            bszb bszb = (bszb) bfvv.f115449a.mo25553a(bfvv.f115448c, clientContext, bsze, 10000, TimeUnit.MILLISECONDS);
            this.f115455a = bszb;
            String valueOf = String.valueOf(bszb);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("grpc response = ");
            sb.append(valueOf);
            sb.toString();
        } catch (Exception e) {
            this.f115457c.f115463d++;
            this.f115456b = e;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            this.f115457c.mo62333a(System.currentTimeMillis());
            this.f115457c.mo62332a();
            throw th;
        }
        Binder.restoreCallingIdentity(clearCallingIdentity);
        this.f115457c.mo62333a(System.currentTimeMillis());
        this.f115457c.mo62332a();
    }
}
