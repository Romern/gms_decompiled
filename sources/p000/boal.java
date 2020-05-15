package p000;

import java.math.RoundingMode;

/* renamed from: boal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class boal extends boan {

    /* renamed from: a */
    private final boan f132463a;

    /* renamed from: b */
    private final String f132464b;

    /* renamed from: c */
    private final int f132465c;

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
    public boal(boan boan, String str, int i) {
        bmxy.m108581a(boan);
        this.f132463a = boan;
        bmxy.m108581a(str);
        this.f132464b = str;
        this.f132465c = i;
        bmxy.m108591a(true, "Cannot add a separator after every %s chars", i);
    }

    /* renamed from: a */
    public final int mo68782a(int i) {
        int a = this.f132463a.mo68782a(i);
        return a + (this.f132464b.length() * bqbr.m112522a(Math.max(0, a - 1), this.f132465c, RoundingMode.FLOOR));
    }

    /* renamed from: a */
    public final boan mo68783a() {
        throw null;
    }

    /* renamed from: b */
    public final int mo68786b(int i) {
        return this.f132463a.mo68786b(i);
    }

    /* renamed from: b */
    public final boan mo68787b() {
        throw null;
    }

    /* renamed from: c */
    public final boan mo68788c() {
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f132463a);
        String str = this.f132464b;
        int i = this.f132465c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + str.length());
        sb.append(valueOf);
        sb.append(".withSeparator(\"");
        sb.append(str);
        sb.append("\", ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo68779a(byte[] bArr, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (this.f132464b.indexOf(charAt) < 0) {
                sb.append(charAt);
            }
        }
        return this.f132463a.mo68779a(bArr, sb);
    }

    /* renamed from: a */
    public final boan mo68784a(String str, int i) {
        throw new UnsupportedOperationException("Already have a separator");
    }

    /* renamed from: a */
    public final CharSequence mo68785a(CharSequence charSequence) {
        return this.f132463a.mo68785a(charSequence);
    }

    /* renamed from: a */
    public final void mo68781a(Appendable appendable, byte[] bArr, int i) {
        boan boan = this.f132463a;
        String str = this.f132464b;
        int i2 = this.f132465c;
        bmxy.m108581a(appendable);
        bmxy.m108581a(str);
        bmxy.m108588a(true);
        boan.mo68781a(new boag(i2, appendable, str), bArr, i);
    }
}
