package p000;

/* renamed from: bmww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmww extends bmws {

    /* renamed from: a */
    static final int f131154a = Integer.numberOfLeadingZeros(31);

    /* renamed from: b */
    public static final bmww f131155b = new bmww();

    public bmww() {
        super("CharMatcher.whitespace()");
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> f131154a) == c;
    }
}
