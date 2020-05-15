package p000;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: bjtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtf {

    /* renamed from: a */
    public static final char[] f123269a = {'S', 'C', 'N', 'O', '1', '2', '3', 'D', 'Z', 'X', 'A', 'U', 'F', 'P', 'T', 'B', 'R'};

    /* renamed from: b */
    private static final HashSet f123270b = new HashSet(f123269a.length);

    static {
        for (char c : f123269a) {
            f123270b.add(Character.valueOf(c));
        }
    }

    /* renamed from: a */
    public static boolean m104553a(char c) {
        return f123270b.contains(Character.valueOf(c));
    }

    /* renamed from: a */
    public static char[] m104554a() {
        char[] cArr = f123269a;
        return Arrays.copyOf(cArr, cArr.length);
    }
}
