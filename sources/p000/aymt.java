package p000;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: aymt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aymt {

    /* renamed from: a */
    public static ContentResolver f97993a = null;

    /* renamed from: b */
    public final String f97994b;

    /* renamed from: c */
    public final Object f97995c;

    protected aymt(String str, Object obj) {
        this.f97994b = str;
        this.f97995c = obj;
    }

    /* renamed from: a */
    public static aymt m84278a(String str, Integer num) {
        return new aymq(str, num);
    }

    /* renamed from: a */
    public abstract Object mo54082a();

    /* renamed from: a */
    public static aymt m84279a(String str, Long l) {
        return new aymp(str, l);
    }

    /* renamed from: a */
    public static aymt m84280a(String str, String str2) {
        return new aymr(str, str2);
    }

    /* renamed from: a */
    public static aymt m84281a(String str, boolean z) {
        return new aymo(str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static void m84282a(Context context) {
        f97993a = context.getContentResolver();
    }
}
