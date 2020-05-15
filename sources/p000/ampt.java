package p000;

import android.util.Pair;

/* renamed from: ampt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ampt {
    /* renamed from: a */
    public static Pair m63151a(bler bler) {
        if (bler == null) {
            return null;
        }
        if (bler.f126254d.size() > 0) {
            bleh bleh = (bleh) bler.f126254d.get(0);
            String str = bleh.f126205e;
            String str2 = bleh.f126206f;
            int i = bleh.f126201a;
            if ((i & 2) != 0) {
                str = bleh.f126203c;
            } else if ((i & 16) == 0) {
                str = str2;
            } else if ((i & 32) != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" ");
                sb.append(str2);
                str = sb.toString();
            }
            return Pair.create(str, 40);
        }
        if (bler.f126257g.size() > 0) {
            bldu bldu = (bldu) bler.f126257g.get(0);
            if ((bldu.f126133a & 16) != 0) {
                return Pair.create(bldu.f126137e, 10);
            }
        }
        if (bler.f126258h.size() > 0) {
            blex blex = (blex) bler.f126258h.get(0);
            if ((blex.f126297a & 2) != 0) {
                return Pair.create(blex.f126299c, 20);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m63152a(bler bler, String str) {
        if (!bler.f126254d.isEmpty()) {
            bleh bleh = (bleh) bler.f126254d.get(0);
            String str2 = bleh.f126205e;
            String str3 = bleh.f126206f;
            if (!str2.isEmpty() && !str3.isEmpty()) {
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str2).length());
                sb.append(str3);
                sb.append(" ");
                sb.append(str2);
                return sb.toString();
            } else if (!str3.isEmpty()) {
                return str3;
            }
        }
        return str;
    }
}
