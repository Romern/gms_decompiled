package p000;

import java.util.Locale;

/* renamed from: bjjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjjp {

    /* renamed from: a */
    public final bxxc f122834a;

    /* renamed from: b */
    public final int[] f122835b = mo65311a();

    /* renamed from: c */
    public final int[] f122836c = mo65313b();

    public bjjp(bxxc bxxc) {
        this.f122834a = bxxc;
    }

    /* renamed from: a */
    private static IllegalArgumentException m103697a(String str, int i, bxxc bxxc) {
        return new IllegalArgumentException(String.format(Locale.US, "%s does not support %s for fieldNumber: %d", bxxc.getClass().getName(), str, Integer.valueOf(i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int[] mo65311a() {
        throw null;
    }

    /* renamed from: b */
    public float mo65312b(bxxc bxxc, int i) {
        throw m103697a("getFloat", i, bxxc);
    }

    /* renamed from: c */
    public int mo65314c(bxxc bxxc, int i) {
        throw m103697a("getInt", i, bxxc);
    }

    /* renamed from: d */
    public bxxc mo65315d(bxxc bxxc, int i) {
        throw m103697a("getProto", i, bxxc);
    }

    /* renamed from: e */
    public Object mo65316e(bxxc bxxc, int i) {
        throw m103697a("getEnum", i, bxxc);
    }

    /* renamed from: f */
    public bxxc mo65317f(bxxc bxxc, int i) {
        throw m103697a("getSubProperty", i, bxxc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int[] mo65313b() {
        return new int[0];
    }

    /* renamed from: a */
    public String mo65309a(bxxc bxxc) {
        throw m103697a("getString", 1, bxxc);
    }

    /* renamed from: a */
    public boolean mo65310a(bxxc bxxc, int i) {
        throw m103697a("hasField", i, bxxc);
    }
}
