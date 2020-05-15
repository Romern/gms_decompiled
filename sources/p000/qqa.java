package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.net.URISyntaxException;

/* renamed from: qqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qqa extends rjx {

    /* renamed from: a */
    public final bxxk f41939a;

    /* renamed from: b */
    public final int f41940b;

    public qqa(bxxk bxxk, int i, Context context, qqg qqg) {
        super(context, qqb.f41941a, qqg, rjw.f43159a);
        this.f41939a = bxxk;
        this.f41940b = i;
    }

    /* renamed from: a */
    private static String m32639a(Context context, Intent intent) {
        intent.setPackage(context.getPackageName());
        String a = qsg.m32790a(intent);
        try {
            qsg.m32789a(a);
            return a;
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Notification intent contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    /* renamed from: b */
    public final aucb mo24202b(Intent intent) {
        sdo.m34959a(intent);
        return mo24701a((rpa) new qpw(this, m32639a(this.f43168w, intent)));
    }

    /* renamed from: b */
    public final aucb mo24203b(bxxc bxxc, Bundle bundle) {
        sdo.m34959a(bxxc);
        return mo24732b(new qpz(this, bxxc, bundle));
    }

    /* renamed from: a */
    public final aucb mo24199a(Intent intent) {
        sdo.m34959a(intent);
        return mo24701a((rpa) new qpv(this, m32639a(this.f43168w, intent)));
    }

    /* renamed from: a */
    public final aucb mo24200a(Bundle bundle) {
        return mo24701a((rpa) new qpx(this, bundle));
    }

    /* renamed from: a */
    public final aucb mo24201a(bxxc bxxc, Bundle bundle) {
        sdo.m34959a(bxxc);
        return mo24732b(new qpy(this, bxxc, bundle));
    }
}
