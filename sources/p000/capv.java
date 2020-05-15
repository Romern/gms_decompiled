package p000;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: capv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class capv implements caof {

    /* renamed from: a */
    private final carj f175520a;

    public capv(casa casa, caov caov, caoy caoy, casf casf, Ccase caseR, List list) {
        List list2 = list;
        capu capu = capu.INSTANCE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new caol("9F7E", 1));
        arrayList.add(new caol("9F1D", 8));
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new caol("9F33", 3));
        carj carj = new carj(capu, casa, caov, caoy, casf, caseR, arrayList, arrayList2);
        this.f175520a = carj;
        carj.mo74791a();
    }

    /* renamed from: a */
    public final caru mo74717a(caro caro) {
        try {
            return this.f175520a.f175670h.mo74786a(caro);
        } catch (capg | GeneralSecurityException e) {
            bqye.m113758a(e);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo74721b() {
        try {
            this.f175520a.f175670h.mo74790b();
        } catch (capt e) {
            bqye.m113758a(e);
        }
    }

    /* renamed from: a */
    public final void mo74718a() {
        this.f175520a.f175670h.mo74787a();
    }

    /* renamed from: a */
    public final void mo74719a(carn carn, caoe caoe) {
        this.f175520a.f175670h.mo74788a(carn);
    }

    /* renamed from: a */
    public final byte[] mo74720a(byte[] bArr) {
        try {
            return this.f175520a.f175670h.mo74789a(bArr);
        } catch (RuntimeException e) {
            bqye.m113758a(e);
            return caor.m126888a(28416);
        }
    }
}
