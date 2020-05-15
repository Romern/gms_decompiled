package p000;

import java.util.Iterator;

/* renamed from: ajgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajgs {
    /* renamed from: a */
    public static String m58685a(bzbu bzbu) {
        bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = bzbu.ordinal();
        if (ordinal == 1) {
            return "audio (ultrasound)";
        }
        if (ordinal == 2) {
            return "bluetooth";
        }
        if (ordinal == 3) {
            return "ble";
        }
        if (ordinal == 4 || ordinal == 7) {
            return "wifi";
        }
        return ordinal != 8 ? "unknown" : "audio (audible)";
    }

    /* renamed from: a */
    public static String m58686a(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bzbu bzbu = (bzbu) it.next();
            if (bzbu != null) {
                sb.append(m58685a(bzbu));
                sb.append(",");
            }
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }
}
