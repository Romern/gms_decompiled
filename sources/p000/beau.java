package p000;

import java.util.regex.Matcher;

/* renamed from: beau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beau {

    /* renamed from: a */
    private final beax f106852a = new beax();

    /* renamed from: a */
    public final boolean mo58510a(CharSequence charSequence, beas beas) {
        String str = beas.f106835a;
        if (str.length() != 0) {
            Matcher matcher = this.f106852a.mo58514a(str).matcher(charSequence);
            if (!matcher.lookingAt() || !matcher.matches()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
