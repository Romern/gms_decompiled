package p000;

import java.util.Comparator;

/* renamed from: brje */
public final /* synthetic */ class brje implements Comparator {

    /* renamed from: a */
    public static final Comparator f142894a = new brje();

    private brje() {
    }

    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == null) {
            return str2 != null ? -1 : 0;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
