package p000;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alww {

    /* renamed from: a */
    private static final Map f74484a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "assistant");
        hashMap.put(2, "brother");
        hashMap.put(3, "child");
        hashMap.put(4, "domesticPartner");
        hashMap.put(5, "father");
        hashMap.put(6, "friend");
        hashMap.put(7, "manager");
        hashMap.put(8, "mother");
        hashMap.put(9, "parent");
        hashMap.put(10, "partner");
        hashMap.put(11, "referredBy");
        hashMap.put(12, "relative");
        hashMap.put(13, "sister");
        hashMap.put(14, "spouse");
        hashMap.put(0, "custom");
        f74484a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static final String m62032a(alwa alwa) {
        return alwa.mo40830a(0);
    }

    /* renamed from: b */
    public static String m62034b(alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null && f74484a.containsKey(a)) {
            return (String) f74484a.get(a);
        }
        amdk.m62658a("ContactData", "Invalid Relation Type: %d", a);
        return null;
    }

    /* renamed from: a */
    public static String m62033a(Context context, alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null) {
            return ContactsContract.CommonDataKinds.Relation.getTypeLabel(context.getResources(), a.intValue(), alwa.mo40830a(2)).toString();
        }
        return null;
    }
}
