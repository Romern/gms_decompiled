package p000;

import java.util.List;
import java.util.function.Consumer;

/* renamed from: kvz */
final /* synthetic */ class kvz implements Consumer {

    /* renamed from: a */
    private final List f25241a;

    public kvz(List list) {
        this.f25241a = list;
    }

    public final void accept(Object obj) {
        this.f25241a.add(Integer.valueOf(((kpb) obj).mo3214a()));
    }
}
