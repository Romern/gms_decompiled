package p000;

/* renamed from: bmwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmwl extends bmwx {

    /* renamed from: a */
    static final bmwx f131141a = new bmwl();

    private bmwl() {
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        if (!(c == ' ' || c == 133 || c == 5760)) {
            if (c != 8199) {
                if (!(c == 8287 || c == 12288 || c == 8232 || c == 8233)) {
                    switch (c) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}
