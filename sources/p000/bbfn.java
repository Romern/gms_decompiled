package p000;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: bbfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfn implements beib {

    /* renamed from: a */
    public final Context f102554a;

    /* renamed from: b */
    public bmxv f102555b = bmvz.f131120a;

    /* renamed from: c */
    public final HashMap f102556c = new HashMap();

    /* renamed from: d */
    private final ayte f102557d = new aytg();

    /* renamed from: e */
    private final HashMap f102558e = new HashMap();

    public bbfn(Context context) {
        this.f102554a = context;
    }

    /* renamed from: a */
    public static String m87948a(String str, String str2) {
        return str + "|" + str2;
    }

    /* renamed from: a */
    public final beia mo56097a() {
        return null;
    }

    /* renamed from: b */
    public final behl mo56100b(Uri uri) {
        return mo56096a(uri);
    }

    /* renamed from: a */
    public static String m87949a(String str, String str2, int i) {
        return str + "|" + str2 + "|" + i;
    }

    /* renamed from: a */
    public final behl mo56096a(Uri uri) {
        synchronized (bbfn.class) {
            String str = (String) this.f102556c.get(uri);
            if (str == null) {
                return null;
            }
            if (this.f102558e.get(str) == null) {
                this.f102558e.put(str, new behl(new bbfm(this, str), 10000, TimeUnit.MILLISECONDS));
            }
            behl behl = (behl) this.f102558e.get(str);
            return behl;
        }
    }
}
