package p000;

import android.content.SharedPreferences;
import java.util.List;

/* renamed from: bayy */
final /* synthetic */ class bayy implements bqeh {

    /* renamed from: a */
    private final bbav f102136a;

    /* renamed from: b */
    private final SharedPreferences f102137b;

    public bayy(bbav bbav, SharedPreferences sharedPreferences) {
        this.f102136a = bbav;
        this.f102137b = sharedPreferences;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102136a;
        SharedPreferences sharedPreferences = this.f102137b;
        bqgg a = bqga.m112775a((Object) null);
        for (bavr bavr : (List) obj) {
            if ((bavr.f101918a & 8) == 0) {
                a = bqdx.m112674a(a, new bazg(bbav, bavr), bbav.f102251h);
            }
        }
        return bqdx.m112674a(a, new bazh(sharedPreferences), bbav.f102251h);
    }
}
