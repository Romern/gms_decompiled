package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: fsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsy {

    /* renamed from: a */
    public static final List f17203a = Collections.unmodifiableList(Arrays.asList("seqno", "action", "uri", "tag"));

    /* renamed from: b */
    private static final List f17204b = Collections.unmodifiableList(Arrays.asList("seqno", "action", "uri", "doc_score"));

    /* renamed from: a */
    public static String m12264a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("section_") : "section_".concat(valueOf);
    }

    /* renamed from: a */
    public static List m12265a(Iterable iterable) {
        ArrayList arrayList = new ArrayList(f17204b.size() + 17);
        arrayList.addAll(f17204b);
        arrayList.add("created_timestamp");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m12264a((String) it.next()));
        }
        return arrayList;
    }
}
