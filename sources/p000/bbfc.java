package p000;

import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: bbfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfc {

    /* renamed from: a */
    public final bbaz f102530a;

    /* renamed from: b */
    public final bbda f102531b;

    /* renamed from: c */
    public final befa f102532c;

    /* renamed from: d */
    public final bbep f102533d;

    /* renamed from: e */
    public final Context f102534e;

    /* renamed from: f */
    public final bawt f102535f;

    /* renamed from: g */
    public final bmxv f102536g;

    /* renamed from: h */
    public final Executor f102537h;

    public bbfc(Context context, bbaz bbaz, bbda bbda, befa befa, bbep bbep, bawt bawt, bmxv bmxv, Executor executor) {
        this.f102534e = context;
        this.f102530a = bbaz;
        this.f102531b = bbda;
        this.f102532c = befa;
        this.f102533d = bbep;
        this.f102535f = bawt;
        this.f102536g = bmxv;
        this.f102537h = executor;
    }

    /* renamed from: a */
    public static final String m87914a(bavr bavr) {
        return bavr.f101919b + "|" + bavr.f101920c;
    }

    /* renamed from: a */
    public static final Set m87915a(Map map, String str) {
        Set set = (Set) map.get(str);
        if (set != null) {
            return set;
        }
        map.put(str, new HashSet());
        return (Set) map.get(str);
    }
}
