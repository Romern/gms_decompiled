package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bujz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bujz {

    /* renamed from: a */
    final int f154058a;

    /* renamed from: b */
    final ArrayList f154059b;

    /* renamed from: c */
    int f154060c = 0;

    public bujz(int i) {
        this.f154058a = i;
        this.f154059b = new ArrayList(i);
    }

    /* renamed from: a */
    public final List mo72751a() {
        ArrayList arrayList = new ArrayList(this.f154058a);
        ArrayList arrayList2 = this.f154059b;
        arrayList.addAll(arrayList2.subList(this.f154060c, arrayList2.size()));
        arrayList.addAll(this.f154059b.subList(0, this.f154060c));
        return arrayList;
    }

    /* renamed from: a */
    public final void mo72752a(Object obj) {
        if (this.f154059b.size() < this.f154058a) {
            this.f154059b.add(obj);
        } else {
            this.f154059b.set(this.f154060c, obj);
        }
        this.f154060c = (this.f154060c + 1) % this.f154058a;
    }
}
