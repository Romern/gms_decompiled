package p000;

import android.util.Pair;
import java.util.List;

/* renamed from: bays */
final /* synthetic */ class bays implements bmxj {

    /* renamed from: a */
    private final bnia f102120a;

    public bays(bnia bnia) {
        this.f102120a = bnia;
    }

    public final Object apply(Object obj) {
        bnia bnia = this.f102120a;
        for (Pair pair : (List) obj) {
            bavd bavd = (bavd) pair.second;
            bxwc bxwc = bavd.f101880j;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bauy bauy = (bauy) bxwc.get(i);
                int a = bavb.m87594a(bavd.f101876f);
                if (a == 0) {
                    a = 1;
                }
                bnia.mo67629b(bbdd.m87829a(bauy, a));
            }
        }
        return bnia.mo67751a();
    }
}
