package p000;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: vfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vfw implements vfv {

    /* renamed from: a */
    private final Collection f49205a;

    /* renamed from: b */
    private final boolean f49206b;

    /* renamed from: c */
    private final boolean f49207c;

    public vfw(boolean z, Collection collection, boolean z2) {
        this.f49207c = z;
        this.f49205a = collection;
        this.f49206b = z2;
    }

    /* renamed from: a */
    public final vfv mo28405a() {
        return new vfw(!this.f49207c, this.f49205a, !this.f49206b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.util.Collection], assign insn: 0x0005: IGET  (r1v0 ? I:java.util.Collection) = (r6v0 'this' vfw A[THIS]) vfw.a java.util.Collection */
    /* renamed from: b */
    public final uog mo28406b() {
        ArrayList arrayList = new ArrayList();
        ? r1 = this.f49205a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            vfv vfv = (vfv) r1.get(i);
            if (this.f49206b) {
                vfv = vfv.mo28405a();
            }
            arrayList.add(vfv.mo28406b());
        }
        return !this.f49207c ? uoh.m39071b(arrayList) : uoh.m39065a(arrayList);
    }
}
