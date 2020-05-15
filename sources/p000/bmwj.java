package p000;

import java.util.Arrays;

/* renamed from: bmwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmwj extends bmwx {

    /* renamed from: a */
    private final char[] f131139a;

    public bmwj(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.f131139a = charArray;
        Arrays.sort(charArray);
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        return Arrays.binarySearch(this.f131139a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.f131139a) {
            sb.append(bmwx.m108503d(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
