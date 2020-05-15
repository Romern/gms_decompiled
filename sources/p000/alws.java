package p000;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alws {

    /* renamed from: a */
    private static final Map f74479a;

    /* renamed from: b */
    private static final Map f74480b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "home");
        hashMap.put(3, "other");
        hashMap.put(2, "work");
        hashMap.put(0, "custom");
        f74479a = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(0, "aim");
        hashMap2.put(-1, "custom");
        hashMap2.put(5, "googleTalk");
        hashMap2.put(6, "icq");
        hashMap2.put(7, "jabber");
        hashMap2.put(1, "msn");
        hashMap2.put(8, "netMeeting");
        hashMap2.put(4, "qq");
        hashMap2.put(3, "skype");
        hashMap2.put(2, "yahoo");
        f74480b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static String m62014a(alwa alwa) {
        return alwa.mo40830a(0);
    }

    /* renamed from: b */
    public static String m62016b(alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null && f74479a.containsKey(a)) {
            return (String) f74479a.get(a);
        }
        amdk.m62658a("ContactData", "Invalid IM Type: %d", a);
        return null;
    }

    /* renamed from: c */
    public static String m62018c(alwa alwa) {
        Integer a = alwy.m62037a(alwa, 4);
        if (a != null && f74480b.containsKey(a)) {
            return (String) f74480b.get(a);
        }
        amdk.m62658a("ContactData", "Invalid IM Protocol: %d", a);
        return null;
    }

    /* renamed from: a */
    public static String m62015a(Context context, alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null) {
            return ContactsContract.CommonDataKinds.Im.getTypeLabel(context.getResources(), a.intValue(), alwa.mo40830a(2)).toString();
        }
        return null;
    }

    /* renamed from: b */
    public static String m62017b(Context context, alwa alwa) {
        Integer a = alwy.m62037a(alwa, 4);
        if (a != null) {
            return ContactsContract.CommonDataKinds.Im.getProtocolLabel(context.getResources(), a.intValue(), alwa.mo40830a(5)).toString();
        }
        return null;
    }
}
