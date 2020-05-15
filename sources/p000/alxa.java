package p000;

import java.util.List;

/* renamed from: alxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alxa {

    /* renamed from: a */
    final /* synthetic */ List f74486a;

    /* renamed from: b */
    final /* synthetic */ List f74487b;

    public alxa(List list, List list2) {
        this.f74486a = list;
        this.f74487b = list2;
    }

    /* renamed from: a */
    public final int mo40836a() {
        return this.f74486a.size() + this.f74487b.size();
    }

    /* renamed from: a */
    public final Object mo40837a(int i) {
        if (i < this.f74486a.size()) {
            return this.f74486a.get(i);
        }
        return this.f74487b.get(i - this.f74486a.size());
    }
}
