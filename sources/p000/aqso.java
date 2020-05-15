package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aqso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqso {

    /* renamed from: a */
    private final List f86708a;

    /* renamed from: b */
    private final aqsp f86709b;

    public aqso(aqsp aqsp, aqsv... aqsvArr) {
        this.f86708a = Arrays.asList(aqsvArr);
        this.f86709b = aqsp;
        for (int i = 0; i < 3; i++) {
            aqsvArr[i].f86722a.add(this);
        }
        mo48132a();
    }

    /* renamed from: a */
    public final void mo48132a() {
        for (aqsv aqsv : this.f86708a) {
            if (aqsv.f86723b != 2) {
                return;
            }
        }
        aqsp aqsp = this.f86709b;
        aqsu aqsu = aqsp.f86710a;
        aqpx aqpx = aqsp.f86711b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aqsu.f86719e.f86724c);
        arrayList.addAll(aqsu.f86720f.f86724c);
        arrayList.addAll(aqsu.f86721g.f86724c);
        aqpy aqpy = aqpx.f86567a;
        if (!aqpy.f86569b) {
            aqpy.f86568a = arrayList;
            aqpy.f86569b = true;
            aqpy.mo48055a();
        }
    }
}
