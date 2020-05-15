package p000;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwq {

    /* renamed from: a */
    private static final Map f74477a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "home");
        hashMap.put(4, "mobile");
        hashMap.put(3, "other");
        hashMap.put(2, "work");
        hashMap.put(0, "custom");
        f74477a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static final String m62008a(alwa alwa) {
        return alwa.mo40830a(0);
    }

    /* renamed from: b */
    public static String m62010b(alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null && f74477a.containsKey(a)) {
            return (String) f74477a.get(a);
        }
        amdk.m62658a("ContactData", "Invalid Email Type: %d", a);
        return null;
    }

    /* renamed from: a */
    public static String m62009a(Context context, alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null) {
            return ContactsContract.CommonDataKinds.Email.getTypeLabel(context.getResources(), a.intValue(), alwa.mo40830a(2)).toString();
        }
        return null;
    }
}
