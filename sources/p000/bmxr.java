package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: bmxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bmxr {

    /* renamed from: b */
    public final String f131179b;

    public bmxr(bmxr bmxr) {
        this.f131179b = bmxr.f131179b;
    }

    /* renamed from: a */
    public static bmxr m108543a(char c) {
        return new bmxr(String.valueOf(c));
    }

    /* renamed from: b */
    public final bmxq mo66879b(String str) {
        return new bmxq(this, str);
    }

    private bmxr(String str) {
        bmxy.m108581a(str);
        this.f131179b = str;
    }

    /* renamed from: a */
    public static bmxr m108544a(String str) {
        return new bmxr(str);
    }

    /* renamed from: a */
    static CharSequence m108545a(Object obj) {
        bmxy.m108581a(obj);
        return !(obj instanceof CharSequence) ? obj.toString() : (CharSequence) obj;
    }

    /* renamed from: a */
    public final bmxr mo66873a() {
        return new bmxo(this, this);
    }

    /* renamed from: a */
    public final String mo66874a(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        mo66878a(sb, it);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo66875a(Object obj, Object obj2, Object... objArr) {
        bmxy.m108581a(objArr);
        return mo66874a((Iterable) new bmxp(objArr, obj, obj2));
    }

    /* renamed from: a */
    public final String mo66876a(Object[] objArr) {
        return mo66874a((Iterable) Arrays.asList(objArr));
    }

    /* renamed from: a */
    public void mo66869a(Appendable appendable, Iterator it) {
        bmxy.m108581a(appendable);
        if (it.hasNext()) {
            appendable.append(m108545a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f131179b);
                appendable.append(m108545a(it.next()));
            }
        }
    }

    /* renamed from: a */
    public final void mo66877a(StringBuilder sb, Iterable iterable) {
        mo66878a(sb, iterable.iterator());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxr.a(java.lang.Appendable, java.util.Iterator):void
     arg types: [java.lang.StringBuilder, java.util.Iterator]
     candidates:
      bmxr.a(java.lang.StringBuilder, java.lang.Iterable):void
      bmxr.a(java.lang.StringBuilder, java.util.Iterator):void
      bmxr.a(java.lang.Appendable, java.util.Iterator):void */
    /* renamed from: a */
    public final void mo66878a(StringBuilder sb, Iterator it) {
        try {
            mo66869a((Appendable) sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
