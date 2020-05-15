package p000;

import android.os.ParcelUuid;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: ahsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahsy extends ahsz {

    /* renamed from: a */
    public static final ParcelUuid f67973a = new ParcelUuid(UUID.fromString("0000FEA0-0000-1000-8000-00805F9B34FB"));

    /* renamed from: b */
    public static boolean m56584b(int i) {
        return i >= 0;
    }

    /* renamed from: e */
    public static boolean m56585e(nek nek) {
        List list = nek.f35398a;
        return list != null && list.contains(f67973a);
    }

    /* renamed from: f */
    public static String m56586f(nek nek) {
        byte[] h = m56588h(nek);
        if (h == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < 7; i++) {
                sb.append(String.format("%02X", Integer.valueOf(h[i] & 255)));
                if (i < 6) {
                    sb.append(":");
                }
            }
            return sb.toString();
        } catch (IndexOutOfBoundsException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to parse Chromecast setup mac");
            return null;
        }
    }

    /* renamed from: g */
    public static int m56587g(nek nek) {
        byte[] h;
        byte[] h2 = m56588h(nek);
        if (h2 == null || (h = m56588h(nek)) == null || h.length <= 0 || h[0] < 2) {
            return -1;
        }
        try {
            return h2[12] & 255;
        } catch (IndexOutOfBoundsException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to parse Chromecast device uptime");
            return -1;
        }
    }

    /* renamed from: h */
    private static byte[] m56588h(nek nek) {
        Map map;
        if (nek == null || (map = nek.f35399b) == null) {
            return null;
        }
        return (byte[]) map.get(f67973a);
    }

    /* renamed from: a */
    public final int mo20552a() {
        return 101;
    }

    /* renamed from: a */
    public final byte[] mo20554a(nek nek) {
        return nek.f35402e;
    }
}
