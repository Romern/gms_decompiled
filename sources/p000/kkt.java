package p000;

import java.util.Map;
import java.util.function.ToIntFunction;

/* renamed from: kkt */
final /* synthetic */ class kkt implements ToIntFunction {

    /* renamed from: a */
    static final ToIntFunction f24384a = new kkt();

    private kkt() {
    }

    public final int applyAsInt(Object obj) {
        return ((Number) ((Map.Entry) obj).getKey()).intValue();
    }
}
