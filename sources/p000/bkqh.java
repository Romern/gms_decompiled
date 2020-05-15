package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bkqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkqh implements bkxj {

    /* renamed from: a */
    public static final bkqh f125111a = new bkqh();

    /* renamed from: b */
    private static final blgm f125112b;

    static {
        blgk f = blgm.m107133f();
        f.mo66488a(blgf.NULL_VALUE);
        f125112b = f.mo66486a();
    }

    private bkqh() {
    }

    /* renamed from: b */
    public static final blgm m106279b(double d) {
        blgk f = blgm.m107133f();
        f.mo66487a(d);
        return f.mo66486a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66215a() {
        return f125112b;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo66223b() {
        return blgh.m107126b();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66216a(double d) {
        return m106279b(d);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo66224b(Object obj) {
        blgd blgd = (blgd) obj;
        blgk f = blgm.m107133f();
        blge blge = new blge(blgd);
        blgd.f126420a = new ArrayList();
        f.f126434a = blgl.LIST_VALUE;
        f.f126435b = blge;
        return f.mo66486a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo66225c() {
        return blge.m107124b();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66217a(int i) {
        return m106279b((double) i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66218a(Object obj) {
        blgg blgg = (blgg) obj;
        blgk f = blgm.m107133f();
        blgh blgh = new blgh(blgg);
        blgg.f126426a = new HashMap();
        f.f126434a = blgl.STRUCT_VALUE;
        f.f126435b = blgh;
        return f.mo66486a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66219a(String str) {
        if (str == null) {
            return f125112b;
        }
        blgk f = blgm.m107133f();
        f.mo66489a(str);
        return f.mo66486a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66220a(boolean z) {
        blgk f = blgm.m107133f();
        f.f126434a = blgl.BOOL_VALUE;
        f.f126435b = Boolean.valueOf(z);
        return f.mo66486a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66221a(Object obj, Object obj2) {
        ((blgd) obj2).f126420a.add((blgm) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66222a(String str, Object obj, Object obj2) {
        ((blgg) obj2).f126426a.put(str, (blgm) obj);
    }
}
