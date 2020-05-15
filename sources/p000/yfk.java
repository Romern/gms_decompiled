package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: yfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfk extends yfe {

    /* renamed from: b */
    private final bngx f53725b;

    public yfk(yga yga, List list) {
        super(yga);
        this.f53725b = bngx.m109368a((Collection) list);
    }

    /* renamed from: a */
    public final List mo30405a(long j, long j2, long j3, List list, ygc ygc, ydw ydw) {
        ArrayList arrayList = new ArrayList();
        if (!this.f53725b.isEmpty()) {
            arrayList.addAll(mo30406a(list, this.f53725b, cadl.TIME_BUCKET, ygc, ydw));
        }
        return arrayList;
    }
}
