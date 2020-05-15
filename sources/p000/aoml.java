package p000;

import android.os.ParcelFileDescriptor;

/* renamed from: aoml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoml implements rkl {

    /* renamed from: a */
    final /* synthetic */ aomu f78480a;

    public aoml(aomu aomu) {
        this.f78480a = aomu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        allh allh = (allh) rkk;
        ParcelFileDescriptor b = allh.mo40486b();
        if (allh.mo7183bo().mo17710c() && b != null) {
            try {
                this.f78480a.f78520r = ssa.m36185a(alls.m61238a(b));
                aomu aomu = this.f78480a;
                aomt aomt = aomu.f78508f;
                if (aomt != null) {
                    aomt.mo43030a(aomu.f78520r);
                }
            } finally {
                srz.m36170a(b);
            }
        }
    }
}
