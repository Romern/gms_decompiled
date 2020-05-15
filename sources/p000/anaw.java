package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: anaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anaw {
    /* renamed from: a */
    public static String m63872a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long parseLong = Long.parseLong(str, 16);
        StringBuilder sb = new StringBuilder(21);
        sb.append("c");
        sb.append(parseLong);
        return sb.toString();
    }

    /* renamed from: a */
    public static List m63873a(bler bler) {
        ArrayList arrayList = new ArrayList();
        blew blew = bler.f126253c;
        if (blew == null) {
            blew = blew.f126288f;
        }
        bxvw bxvw = blew.f126292c;
        int size = bxvw.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Long.toHexString(((Long) bxvw.get(i)).longValue()));
        }
        return arrayList;
    }
}
