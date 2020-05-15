package p000;

import android.util.Pair;
import java.util.function.Function;

/* renamed from: kbw */
final /* synthetic */ class kbw implements Function {

    /* renamed from: a */
    static final Function f23726a = new kbw();

    private kbw() {
    }

    public final Object apply(Object obj) {
        Pair pair = (Pair) obj;
        bxvd da = kce.f23741c.mo74144da();
        if (pair.first != null) {
            String str = (String) pair.first;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((kce) da.f164949b).f23743a = str;
        }
        if (pair.second != null) {
            String str2 = (String) pair.second;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((kce) da.f164949b).f23744b = str2;
        }
        return (kce) da.mo74062i();
    }
}
