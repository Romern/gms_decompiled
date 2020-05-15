package p000;

import java.util.AbstractList;
import java.util.List;

/* renamed from: bxvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxvv extends AbstractList {

    /* renamed from: a */
    private final List f164968a;

    /* renamed from: b */
    private final bxvu f164969b;

    public bxvv(List list, bxvu bxvu) {
        this.f164968a = list;
        this.f164969b = bxvu;
    }

    public final Object get(int i) {
        return this.f164969b.mo14948a(this.f164968a.get(i));
    }

    public final int size() {
        return this.f164968a.size();
    }
}
