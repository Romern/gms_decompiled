package p000;

import java.util.List;

/* renamed from: xcw */
final /* synthetic */ class xcw implements bmxj {

    /* renamed from: a */
    private final List f51976a;

    public xcw(List list) {
        this.f51976a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f51976a;
        List list2 = (List) obj;
        Logger Logger = xdc.f51982b;
        if (!list2.isEmpty()) {
            list.addAll(list2);
        }
        return list;
    }
}
