package p000;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: bjwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjwb {

    /* renamed from: a */
    public static final Pattern f123456a = Pattern.compile("⁣");

    /* renamed from: b */
    public static final Pattern f123457b = Pattern.compile("‽");

    /* renamed from: a */
    public static bjvz m104763a(String str) {
        return new bjvz(str);
    }

    /* renamed from: a */
    public static bjwa m104764a() {
        return new bjwa();
    }

    /* renamed from: a */
    public static String m104765a(String str, Object[] objArr, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        for (Object obj : objArr) {
            if (obj == null) {
                str2 = "";
            } else if (obj instanceof bxxc) {
                str2 = bjvp.m104734a((bxxc) obj).trim();
            } else {
                str2 = obj.toString();
            }
            if (!z || !TextUtils.isEmpty(str2)) {
                if (z2) {
                    sb.append(str);
                }
                sb.append(str2);
                z2 = true;
            }
        }
        return sb.toString();
    }
}
