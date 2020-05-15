package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: bmyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmyx {

    /* renamed from: a */
    public final bmwx f131216a;

    /* renamed from: b */
    public final boolean f131217b;

    /* renamed from: c */
    public final int f131218c;

    /* renamed from: d */
    private final bmyw f131219d;

    /* renamed from: a */
    public static bmyx m108640a(char c) {
        return m108642a(bmwx.m108501b(c));
    }

    /* renamed from: b */
    public static bmyx m108644b(String str) {
        bmxa d = bmxx.m108580d(str);
        bmxy.m108596a(!d.mo66849a("").f131160a.matches(), "The pattern may not match the empty string: %s", d);
        return new bmyx(new bmyr(d));
    }

    /* renamed from: c */
    public final bmyv mo66924c(String str) {
        return mo66916a(m108643a(str));
    }

    private bmyx(bmyw bmyw) {
        this(bmyw, false, bmwu.f131151a, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static bmyx m108641a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "The length may not be less than 1");
        return new bmyx(new bmyt(i));
    }

    /* renamed from: c */
    public final List mo66925c(CharSequence charSequence) {
        bmxy.m108581a(charSequence);
        Iterator b = mo66923b(charSequence);
        ArrayList arrayList = new ArrayList();
        while (b.hasNext()) {
            arrayList.add((String) b.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private bmyx(bmyw bmyw, boolean z, bmwx bmwx, int i) {
        this.f131219d = bmyw;
        this.f131217b = z;
        this.f131216a = bmwx;
        this.f131218c = i;
    }

    /* renamed from: a */
    public static bmyx m108642a(bmwx bmwx) {
        bmxy.m108581a(bmwx);
        return new bmyx(new bmyn(bmwx));
    }

    /* renamed from: a */
    public static bmyx m108643a(String str) {
        boolean z;
        if (str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return m108640a(str.charAt(0));
        }
        return new bmyx(new bmyp(str));
    }

    /* renamed from: b */
    public final bmyv mo66919b(char c) {
        return mo66916a(m108640a(c));
    }

    /* renamed from: a */
    public final bmyv mo66916a(bmyx bmyx) {
        return new bmyv(this, bmyx);
    }

    /* renamed from: b */
    public final bmyx mo66920b() {
        return mo66922b(bmww.f131155b);
    }

    /* renamed from: a */
    public final bmyx mo66917a() {
        return new bmyx(this.f131219d, true, this.f131216a, this.f131218c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, int):void
     arg types: [int, java.lang.String, int]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, long):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, int):void */
    /* renamed from: b */
    public final bmyx mo66921b(int i) {
        bmxy.m108591a(true, "must be greater than zero: %s", i);
        return new bmyx(this.f131219d, this.f131217b, this.f131216a, i);
    }

    /* renamed from: a */
    public final Iterable mo66918a(CharSequence charSequence) {
        bmxy.m108581a(charSequence);
        return new bmyu(this, charSequence);
    }

    /* renamed from: b */
    public final bmyx mo66922b(bmwx bmwx) {
        bmxy.m108581a(bmwx);
        return new bmyx(this.f131219d, this.f131217b, bmwx, this.f131218c);
    }

    /* renamed from: b */
    public final Iterator mo66923b(CharSequence charSequence) {
        return this.f131219d.mo66912a(this, charSequence);
    }
}
