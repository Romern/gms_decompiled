package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cxf implements assf {

    /* renamed from: a */
    private final cys f12364a;

    /* renamed from: b */
    private final cwf f12365b;

    /* renamed from: c */
    private final boolean f12366c;

    /* renamed from: d */
    private final cxc f12367d;

    public cxf(cys cys, cwf cwf, boolean z, cxc cxc) {
        this.f12364a = cys;
        this.f12365b = cwf;
        this.f12366c = z;
        this.f12367d = cxc;
    }

    /* renamed from: a */
    public final int mo3399a() {
        return this.f12367d.f12348h;
    }

    /* renamed from: b */
    public final boolean mo3403b() {
        return this.f12366c;
    }

    /* renamed from: c */
    public final String mo3404c() {
        return this.f12364a.mo8423a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cvz.a(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [java.lang.Long, long]
     candidates:
      cvz.a(char, int):int
      cvz.a(byte, byte):boolean
      cvz.a(byte, int):boolean
      cvz.a(int, byte):byte[]
      cvz.a(byte[], int):byte[]
      cvz.a(java.lang.Object, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final byte[] mo3402a(byte[] bArr) {
        cwf cwf = this.f12365b;
        Map a = cwf.m7757a(bArr);
        HashMap hashMap = new HashMap(cwf.f12231b);
        for (Map.Entry entry : cwf.f12231b.entrySet()) {
            cuz cuz = (cuz) entry.getKey();
            hashMap.put((cuz) entry.getKey(), Long.valueOf(((Long) entry.getValue()).longValue() + (((Long) cvz.m7703a((Object) ((Long) a.remove(cuz)), (Object) 0L)).longValue() - ((Long) cvz.m7703a((Object) ((Long) cwf.f12230a.get(cuz)), (Object) 0L)).longValue())));
        }
        for (Map.Entry entry2 : a.entrySet()) {
            hashMap.put((cuz) entry2.getKey(), (Long) entry2.getValue());
        }
        byte[] bArr2 = cwf.f12232c;
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (Map.Entry entry3 : hashMap.entrySet()) {
            arrayList.add(((cuz) entry3.getKey()).mo8318a(cvz.m7715a(((Long) entry3.getValue()).longValue())));
        }
        if (bArr2 != null) {
            arrayList.add(cuz.PREVIOUS_TRANSACTION_HISTORY.mo8318a(bArr2));
        }
        return cve.m7667a((cvc[]) arrayList.toArray(new cva[arrayList.size()]));
    }
}
