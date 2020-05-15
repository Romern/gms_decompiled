package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bqcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcg {
    /* renamed from: a */
    public static int m112563a(char[] cArr, char c, int i, int i2) {
        while (i < i2) {
            if (cArr[i] == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static List m112564a(char... cArr) {
        int length = cArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new bqcf(cArr, 0, length);
    }
}
