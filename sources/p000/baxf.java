package p000;

import java.util.EnumSet;

/* renamed from: baxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class baxf {

    /* renamed from: a */
    public static final baxf f102029a;

    /* renamed from: b */
    public static final baxf f102030b;

    static {
        baxd c = m87661c();
        c.mo56016a(EnumSet.noneOf(baxe.class));
        c.mo56017a(false);
        c.mo56015a();
        baxd c2 = m87661c();
        c2.mo56016a(EnumSet.of(baxe.ANY));
        c2.mo56017a(true);
        f102029a = c2.mo56015a();
        baxd c3 = m87661c();
        c3.mo56016a(EnumSet.of(baxe.ANY));
        c3.mo56017a(false);
        f102030b = c3.mo56015a();
    }

    /* renamed from: c */
    public static baxd m87661c() {
        baxd baxd = new baxd();
        baxd.mo56017a(false);
        return baxd;
    }

    /* renamed from: a */
    public abstract boolean mo56002a();

    /* renamed from: b */
    public abstract bnic mo56003b();
}
