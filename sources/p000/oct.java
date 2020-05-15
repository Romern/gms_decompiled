package p000;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: oct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oct implements ocp {

    /* renamed from: a */
    final /* synthetic */ ocx f37193a;

    public oct(ocx ocx) {
        this.f37193a = ocx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [bpcy, java.lang.Integer]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final void mo21974a() {
        ocx ocx = this.f37193a;
        ocq b = ocx.f37203d.mo21978b();
        ocq ocq = ocq.ENABLED;
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            ocx.f37204e.drainTo(arrayList);
            if (arrayList.isEmpty()) {
                ocx.mo21982a(bpcy.GEARHEAD, 0);
                return;
            }
            EnumMap enumMap = new EnumMap(bpcy.class);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ocw ocw = (ocw) arrayList.get(i);
                ocx.f37205f.mo21983a(ocw.f37196c, ocw.f37194a, ocw.f37195b);
                bpcx bpcx = ocw.f37194a.f135765E;
                if (bpcx == null) {
                    bpcx = bpcx.f135883d;
                }
                bpcy a = bpcy.m111790a(bpcx.f135886b);
                if (!(a == null || a == bpcy.DOMAIN_UNSPECIFIED)) {
                    enumMap.put((Enum) a, (Object) Integer.valueOf((enumMap.get(a) != null ? ((Integer) enumMap.get(a)).intValue() : 0) + 1));
                }
            }
            for (Map.Entry entry : enumMap.entrySet()) {
                ocx.mo21982a((bpcy) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
        } else if (ordinal == 1) {
            ocx.f37204e.clear();
        } else if (ordinal != 2) {
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Impossible enabledFlag: ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        }
    }
}
