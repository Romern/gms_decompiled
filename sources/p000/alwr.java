package p000;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwr {

    /* renamed from: a */
    private static final Map f74478a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "anniversary");
        hashMap.put(3, "birthday");
        hashMap.put(2, "other");
        hashMap.put(0, "custom");
        f74478a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static final String m62011a(alwa alwa) {
        return alwa.mo40830a(0);
    }

    /* renamed from: b */
    public static final String m62013b(alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null && f74478a.containsKey(a)) {
            return (String) f74478a.get(a);
        }
        amdk.m62658a("ContactData", "Invalid Event Type: %d", a);
        return null;
    }

    /* renamed from: a */
    public static final String m62012a(Context context, alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null) {
            return context.getString(ContactsContract.CommonDataKinds.Event.getTypeResource(a));
        }
        return null;
    }
}
