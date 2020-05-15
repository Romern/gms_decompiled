package p000;

import java.util.Map;

/* renamed from: wbr */
final /* synthetic */ class wbr implements bmxj {

    /* renamed from: a */
    private final int f50468a;

    public wbr(int i) {
        this.f50468a = i;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(Math.abs(this.f50468a - ((Integer) ((Map.Entry) obj).getKey()).intValue()));
    }
}
