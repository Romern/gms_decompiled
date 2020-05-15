package p000;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* renamed from: lyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lyx {

    /* renamed from: a */
    public static final lvn f33226a = new lvn("ContactsAccountTypeMetadataHelper");

    /* renamed from: b */
    public static final String[] f33227b = {"account_type"};

    /* renamed from: d */
    public static Set f33228d;

    /* renamed from: c */
    public final Context f33229c;

    public lyx(Context context) {
        this.f33229c = context;
    }

    /* renamed from: a */
    public static final void m24692a(Map map, String str) {
        Integer num = (Integer) map.get(str);
        if (num == null) {
            map.put(str, 1);
        } else {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }
}
