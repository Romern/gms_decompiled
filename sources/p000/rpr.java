package p000;

import android.content.Context;
import com.google.android.gms.common.app.BaseApplicationContext;

/* renamed from: rpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rpr extends BaseApplicationContext {

    /* renamed from: a */
    private static rpr f43499a;

    public rpr() {
        super(null);
        m34214a(this);
    }

    /* renamed from: a */
    private static void m34214a(rpr rpr) {
        synchronized (rpr.class) {
            rzz.m34726a(f43499a);
            f43499a = rpr;
        }
    }

    /* renamed from: a */
    public static boolean m34215a() {
        return f43499a != null;
    }

    /* renamed from: b */
    public static rpr m34216b() {
        rzz.m34731b(f43499a);
        return f43499a;
    }

    public rpr(Context context, BaseApplicationContext baseApplicationContext) {
        super(context, baseApplicationContext);
        m34214a(this);
    }
}
