package p000;

/* renamed from: cgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cgc implements Appendable {

    /* renamed from: a */
    private final Appendable f6778a;

    /* renamed from: b */
    private boolean f6779b = true;

    public cgc(Appendable appendable) {
        this.f6778a = appendable;
    }

    /* renamed from: a */
    private static final CharSequence m4173a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public final Appendable append(char c) {
        boolean z = false;
        if (this.f6779b) {
            this.f6779b = false;
            this.f6778a.append("  ");
        }
        if (c == 10) {
            z = true;
        }
        this.f6779b = z;
        this.f6778a.append(c);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        CharSequence a = m4173a(charSequence);
        append(a, 0, a.length());
        return this;
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence a = m4173a(charSequence);
        boolean z = false;
        if (this.f6779b) {
            this.f6779b = false;
            this.f6778a.append("  ");
        }
        if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
            z = true;
        }
        this.f6779b = z;
        this.f6778a.append(a, i, i2);
        return this;
    }
}
