package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;

/* renamed from: dri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dri {

    /* renamed from: a */
    public final ContextManagerClientInfo f13872a;

    /* renamed from: b */
    public final int f13873b;

    /* renamed from: c */
    public final tku f13874c;

    /* renamed from: d */
    public final PendingIntent f13875d;

    private dri(ContextManagerClientInfo contextManagerClientInfo, int i, tku tku, PendingIntent pendingIntent) {
        this.f13872a = contextManagerClientInfo;
        this.f13873b = i;
        this.f13874c = tku;
        this.f13875d = pendingIntent;
    }

    /* renamed from: a */
    public static dri m9145a(ContextManagerClientInfo contextManagerClientInfo, PendingIntent pendingIntent) {
        return new dri(contextManagerClientInfo, 2, null, pendingIntent);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof dri) {
            dri dri = (dri) obj;
            if (mo9484a().equals(dri.mo9484a()) && (i = this.f13873b) == dri.f13873b) {
                if (i == 1) {
                    return this.f13874c.asBinder().equals(dri.f13874c.asBinder());
                }
                if (i != 2) {
                    return false;
                }
                return this.f13875d.equals(dri.f13875d);
            }
        }
        return false;
    }

    public final int hashCode() {
        IBinder iBinder;
        Object[] objArr = new Object[4];
        objArr[0] = mo9484a();
        objArr[1] = Integer.valueOf(this.f13873b);
        tku tku = this.f13874c;
        if (tku != null) {
            iBinder = tku.asBinder();
        } else {
            iBinder = null;
        }
        objArr[2] = iBinder;
        objArr[3] = this.f13875d;
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("accName", mo9484a());
        a.mo25396a("type", Integer.toString(this.f13873b));
        int i = this.f13873b;
        if (i == 1) {
            a.mo25396a("listener", this.f13874c);
        } else if (i != 2) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dri", "toString", 692, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[FenceListenerConsumer] Unknown type=%s", this.f13873b);
        } else {
            a.mo25396a("p.int", this.f13875d);
        }
        return a.toString();
    }

    /* renamed from: a */
    public static dri m9146a(ContextManagerClientInfo contextManagerClientInfo, tku tku) {
        return new dri(contextManagerClientInfo, 1, tku, null);
    }

    /* renamed from: a */
    public final doh mo9484a() {
        return this.f13872a.mo18066a();
    }
}
