package p000;

import android.os.ParcelUuid;
import java.util.List;

/* renamed from: nfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nfb extends ney {

    /* renamed from: a */
    public static final ParcelUuid f35449a = ParcelUuid.fromString("0000FEAA-0000-1000-8000-00805F9B34FB");

    /* renamed from: e */
    public static boolean m26080e(nek nek) {
        List list = nek.f35398a;
        return list != null && list.contains(f35449a);
    }

    /* renamed from: b */
    public final Integer mo20555b(nek nek) {
        byte[] a;
        if (!mo20556b() || (a = nek.mo20526a(f35449a)) == null) {
            return null;
        }
        return Integer.valueOf(a[1] - 41);
    }
}
