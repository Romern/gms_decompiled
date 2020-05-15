package p000;

import android.app.PendingIntent;
import java.util.Arrays;

/* renamed from: ajdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajdt {

    /* renamed from: a */
    public final ajcd f70399a;

    /* renamed from: b */
    public final PendingIntent f70400b;

    private ajdt(ajcd ajcd, PendingIntent pendingIntent) {
        this.f70399a = ajcd;
        this.f70400b = pendingIntent;
    }

    /* renamed from: a */
    public static ajdt m58563a(ajcd ajcd) {
        sdo.m34959a(ajcd);
        return new ajdt(ajcd, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajdt) {
            ajdt ajdt = (ajdt) obj;
            return sdg.m34949a(this.f70399a, ajdt.f70399a) && sdg.m34949a(this.f70400b, ajdt.f70400b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f70399a, this.f70400b});
    }

    public final String toString() {
        ajcd ajcd = this.f70399a;
        if (ajcd != null) {
            String valueOf = String.valueOf(ajcd.asBinder());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("UnsubscribeOperation[listener=");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        String valueOf2 = String.valueOf(this.f70400b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
        sb2.append("UnsubscribeOperation[pendingIntent=");
        sb2.append(valueOf2);
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: a */
    public static ajdt m58564a(PendingIntent pendingIntent) {
        sdo.m34959a(pendingIntent);
        return new ajdt(null, pendingIntent);
    }
}
