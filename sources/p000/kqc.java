package p000;

/* renamed from: kqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqc {

    /* renamed from: a */
    public final kqk f24786a;

    /* renamed from: b */
    public final CharSequence f24787b;

    /* renamed from: c */
    public final CharSequence f24788c;

    /* renamed from: d */
    public final kcz f24789d;

    /* renamed from: e */
    public final kqo f24790e;

    /* renamed from: f */
    public final boolean f24791f;

    public kqc(kqk kqk, CharSequence charSequence, CharSequence charSequence2, kcz kcz) {
        this(kqk, charSequence, charSequence2, kcz, kqo.f24805b);
    }

    /* renamed from: a */
    public static kqc m18316a() {
        return new kqc(kqk.m18332b(""), "", null, null, kqo.f24804a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24786a);
        String valueOf2 = String.valueOf(this.f24787b);
        String valueOf3 = String.valueOf(this.f24788c);
        String valueOf4 = String.valueOf(this.f24789d);
        String valueOf5 = String.valueOf(this.f24790e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 74 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("FillEntry{fillValue=");
        sb.append(valueOf);
        sb.append(", primaryText=");
        sb.append(valueOf2);
        sb.append(", secondaryText=");
        sb.append(valueOf3);
        sb.append(", icon=");
        sb.append(valueOf4);
        sb.append(", filterOptions=");
        sb.append(valueOf5);
        sb.append('}');
        return sb.toString();
    }

    public kqc(kqk kqk, CharSequence charSequence, CharSequence charSequence2, kcz kcz, kqo kqo) {
        this(kqk, charSequence, charSequence2, kcz, kqo, false);
    }

    public kqc(kqk kqk, CharSequence charSequence, CharSequence charSequence2, kcz kcz, kqo kqo, boolean z) {
        this.f24786a = kqk;
        this.f24787b = charSequence;
        this.f24788c = charSequence2;
        this.f24789d = kcz;
        this.f24790e = kqo;
        this.f24791f = z;
    }
}
