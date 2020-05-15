package p000;

import java.util.ArrayList;

/* renamed from: qfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfc {

    /* renamed from: a */
    private final ArrayList f41113a = new ArrayList();

    /* renamed from: a */
    public final qfb mo24004a() {
        return new qfb(this);
    }

    /* renamed from: b */
    public final synchronized void mo24007b(qfb qfb) {
        this.f41113a.remove(qfb);
    }

    /* renamed from: a */
    public final synchronized void mo24005a(qfb qfb) {
        this.f41113a.add(qfb);
    }

    /* renamed from: a */
    public final synchronized void mo24006a(boolean z, long j) {
        ArrayList arrayList = new ArrayList(this.f41113a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qfb) arrayList.get(i)).mo24003a(z, j);
        }
    }
}
