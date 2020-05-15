package p000;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: efu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class efu extends dwu {

    /* renamed from: a */
    private final doh f14846a;

    /* renamed from: b */
    private final ArrayList f14847b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public efu(doh doh, SparseArray sparseArray) {
        super("SyncServerInterestRecordsOperation", "WriteInterestRecord", new Object[0]);
        this.f14846a = doh;
        this.f14847b = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            dwg dwg = (dwg) sparseArray.valueAt(i);
            this.f14847b.add(new eft(dwg, dwg.f14266e));
        }
    }

    /* renamed from: a */
    public final void mo9477a(int i) {
        super.mo9477a(i);
        ArrayList arrayList = this.f14847b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((eft) arrayList.get(i2)).f14844a.f14266e = 1;
        }
        dwq.m9682z().mo10071b(cdgp.m133196e());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9478a(Object obj) {
        bxjv bxjv = (bxjv) obj;
        doh doh = this.f14846a;
        bxii[] bxiiArr = (bxii[]) bxjv.f163690c.toArray(new bxii[0]);
        bxwc bxwc = bxjv.f163689b;
        bxjd bxjd = bxjv.f163688a;
        if (bxjd == null) {
            bxjd = bxjd.f163616c;
        }
        bxik bxik = bxjd.f163619b;
        if (bxik == null) {
            bxik = bxik.f163530b;
        }
        efc.m10292a(doh, bxiiArr, bxwc, bxik, 11);
        ArrayList arrayList = this.f14847b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eft eft = (eft) arrayList.get(i);
            dwg dwg = eft.f14844a;
            dwg.f14267f = eft.f14845b;
            dwg.f14266e = 1;
        }
    }
}
