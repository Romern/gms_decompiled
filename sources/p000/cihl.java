package p000;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: cihl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cihl {

    /* renamed from: a */
    public static final String[] f190321a = new String[0];

    /* renamed from: b */
    public static final Charset f190322b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static List m150312a(Object[] objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* renamed from: a */
    public static Object[] m150313a(Class cls, Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr2[i];
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
                i++;
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, arrayList.size()));
    }
}
