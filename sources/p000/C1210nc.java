package p000;

/* renamed from: nc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1210nc {

    /* renamed from: e */
    private static final byte[] f26726e = new byte[1792];

    /* renamed from: a */
    public final CharSequence f26727a;

    /* renamed from: b */
    public final int f26728b;

    /* renamed from: c */
    public int f26729c;

    /* renamed from: d */
    public char f26730d;

    static {
        for (int i = 0; i < 1792; i++) {
            f26726e[i] = Character.getDirectionality(i);
        }
    }

    public C1210nc(CharSequence charSequence) {
        this.f26727a = charSequence;
        this.f26728b = charSequence.length();
    }

    /* renamed from: a */
    public static byte m19658a(char c) {
        return c < 1792 ? f26726e[c] : Character.getDirectionality(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte mo15490a() {
        char charAt = this.f26727a.charAt(this.f26729c - 1);
        this.f26730d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(this.f26727a, this.f26729c);
            this.f26729c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f26729c--;
        return m19658a(this.f26730d);
    }
}
