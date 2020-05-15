package p000;

import java.util.ArrayList;

/* renamed from: bcll */
final /* synthetic */ class bcll implements bmxj {

    /* renamed from: a */
    private final ArrayList f104432a;

    public bcll(ArrayList arrayList) {
        this.f104432a = arrayList;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f104432a.add((String) obj));
    }
}
