package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: cayv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cayv {
    /* renamed from: a */
    public static List m127574a(int i) {
        if (i != 0) {
            return new ArrayList(i);
        }
        return Collections.emptyList();
    }

    /* renamed from: b */
    public static LinkedHashMap m127575b(int i) {
        return new LinkedHashMap(m127576c(i));
    }

    /* renamed from: c */
    public static int m127576c(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
