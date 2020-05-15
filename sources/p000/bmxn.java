package p000;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: bmxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmxn extends bmxa implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Pattern f131172a;

    public bmxn(Pattern pattern) {
        bmxy.m108581a(pattern);
        this.f131172a = pattern;
    }

    /* renamed from: a */
    public final bmwz mo66849a(CharSequence charSequence) {
        return new bmwz(this.f131172a.matcher(charSequence));
    }

    public final String toString() {
        return this.f131172a.toString();
    }
}
