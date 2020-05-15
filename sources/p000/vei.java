package p000;

import java.net.URL;

/* renamed from: vei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vei implements vfk {

    /* renamed from: a */
    public final vew f49119a;

    public vei(vew vew) {
        this.f49119a = vew;
    }

    /* renamed from: a */
    public final vfj mo28349a(URL url) {
        this.f49119a.mo28356a("Connection is not permitted");
        try {
            return new veh(this, url);
        } catch (Exception e) {
            shr.m35312a();
            throw e;
        }
    }
}
