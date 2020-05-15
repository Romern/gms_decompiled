package p000;

import java.util.ArrayList;

/* renamed from: atc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atc {
    /* renamed from: a */
    public static ArrayList m2002a(ArrayList arrayList, Object obj) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }
}
