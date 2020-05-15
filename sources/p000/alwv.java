package p000;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwv {

    /* renamed from: a */
    private static final Map f74483a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(19, "assistant");
        hashMap.put(8, "callback");
        hashMap.put(9, "car");
        hashMap.put(10, "mainCompany");
        hashMap.put(5, "homeFax");
        hashMap.put(4, "workFax");
        hashMap.put(1, "home");
        hashMap.put(11, "isdn");
        hashMap.put(12, "main");
        hashMap.put(20, "mms");
        hashMap.put(2, "mobile");
        hashMap.put(7, "other");
        hashMap.put(13, "otherFax");
        hashMap.put(6, "pager");
        hashMap.put(14, "radio");
        hashMap.put(15, "telex");
        hashMap.put(16, "ttytdd");
        hashMap.put(3, "work");
        hashMap.put(17, "workMobile");
        hashMap.put(18, "workPager");
        hashMap.put(0, "custom");
        f74483a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static final String m62029a(alwa alwa) {
        return alwa.mo40830a(0);
    }

    /* renamed from: b */
    public static String m62031b(alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null && f74483a.containsKey(a)) {
            return (String) f74483a.get(a);
        }
        amdk.m62658a("ContactData", "Invalid Phone Type: %d", a);
        return null;
    }

    /* renamed from: a */
    public static String m62030a(Context context, alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null) {
            return ContactsContract.CommonDataKinds.Phone.getTypeLabel(context.getResources(), a.intValue(), alwa.mo40830a(2)).toString();
        }
        return null;
    }
}
