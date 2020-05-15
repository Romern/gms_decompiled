package p000;

/* renamed from: tql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class tql {
    /* renamed from: a */
    public static tql m37363a(int i, Object obj, Exception exc) {
        return new tqh(i, obj, exc);
    }

    /* renamed from: d */
    public static tql m37366d() {
        return new tqh(2, null, null);
    }

    /* renamed from: a */
    public abstract Object mo26735a();

    /* renamed from: b */
    public abstract Exception mo26736b();

    /* renamed from: c */
    public abstract int mo26737c();

    /* renamed from: a */
    public static tql m37364a(Exception exc) {
        return new tqh(3, null, exc);
    }

    /* renamed from: a */
    public static tql m37365a(Object obj) {
        return new tqh(1, obj, null);
    }
}
