package p000;

import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: abwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abwx {
    /* renamed from: a */
    static abww m48420a(Thing thing, String str, abxt abxt) {
        return new abww(abxt.mo32425b(thing.f152373e), str, abxr.m48493c(thing));
    }

    /* renamed from: a */
    public static Map m48421a(Thing[] thingArr, String str, abxt abxt) {
        HashMap hashMap = new HashMap();
        for (Thing thing : thingArr) {
            abww a = m48420a(thing, str, abxt);
            List list = (List) hashMap.get(a);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(a, list);
            }
            list.add(thing);
        }
        return hashMap;
    }
}
