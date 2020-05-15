package p000;

import java.util.List;

/* renamed from: bnvz */
final /* synthetic */ class bnvz implements bmxj {

    /* renamed from: a */
    private final List f132270a;

    public bnvz(List list) {
        this.f132270a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f132270a;
        bnvt bnvt = (bnvt) obj;
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int a = bqda.m112612a(((bnwa) list.get(i2)).mo68606a(), bnvt.f132250b);
            if (a > 0) {
                i2--;
            } else if (a < 0) {
                i = i2 + 1;
            } else if (i == i2) {
                return Integer.valueOf(i2);
            }
            size = i2;
        }
        return Integer.valueOf(i);
    }
}
