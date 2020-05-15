package p000;

import java.util.Map;
import java.util.function.Function;

/* renamed from: kiy */
final /* synthetic */ class kiy implements Function {

    /* renamed from: a */
    private final kjg f24229a;

    public kiy(kjg kjg) {
        this.f24229a = kjg;
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return new khw((String) entry.getValue(), aih.m807a(new kjb(this.f24229a, (String) entry.getKey())));
    }
}
