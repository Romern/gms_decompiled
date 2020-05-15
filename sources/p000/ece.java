package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ece */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ece {
    /* renamed from: a */
    public static List m10100a(List list, Number number) {
        ArrayList arrayList = new ArrayList(list.subList(0, Math.min(list.size(), 5)));
        arrayList.addAll(Collections.nCopies(5 - arrayList.size(), number));
        if (arrayList.size() == 5) {
            return arrayList;
        }
        String valueOf = String.valueOf(arrayList);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Logic error: ");
        sb.append(valueOf);
        sb.append(" should be exactly 5 long ");
        throw new IllegalArgumentException(sb.toString());
    }
}
