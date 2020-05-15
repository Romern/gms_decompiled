package p000;

import android.content.Context;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwp {

    /* renamed from: a */
    private static final Map f74476a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "home");
        hashMap.put(3, "other");
        hashMap.put(2, "work");
        hashMap.put(0, "custom");
        f74476a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: b */
    public static final String m62001b(alwa alwa) {
        return alwa.mo40830a(3);
    }

    /* renamed from: c */
    public static final String m62002c(alwa alwa) {
        return alwa.mo40830a(4);
    }

    /* renamed from: d */
    public static final String m62003d(alwa alwa) {
        return alwa.mo40830a(6);
    }

    /* renamed from: e */
    public static final String m62004e(alwa alwa) {
        return alwa.mo40830a(7);
    }

    /* renamed from: f */
    public static final String m62005f(alwa alwa) {
        return alwa.mo40830a(8);
    }

    /* renamed from: g */
    public static final String m62006g(alwa alwa) {
        String a = alwa.mo40830a(9);
        if (a == null || !TextUtils.isDigitsOnly(a)) {
            return a;
        }
        return null;
    }

    /* renamed from: h */
    public static final String m62007h(alwa alwa) {
        String a = alwa.mo40830a(9);
        if (a == null || !TextUtils.isDigitsOnly(a)) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public static String m61999a(alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null && f74476a.containsKey(a)) {
            return (String) f74476a.get(a);
        }
        amdk.m62658a("ContactData", "Invalid StructuredPostal Type: %d", a);
        return null;
    }

    /* renamed from: a */
    public static String m62000a(Context context, alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null) {
            return ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(context.getResources(), a.intValue(), alwa.mo40830a(2)).toString();
        }
        return null;
    }
}
