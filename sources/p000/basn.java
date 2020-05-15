package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhFootprint;
import java.util.List;

/* renamed from: basn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class basn {
    /* renamed from: a */
    public static basd m87493a(MdhFootprint mdhFootprint, bxuq bxuq) {
        if (mdhFootprint != null) {
            return new basd(mdhFootprint.f79987a, mdhFootprint.f79988b, mdhFootprint.f79989c, bxuq);
        }
        return null;
    }

    /* renamed from: a */
    public static LatestFootprintFilter m87494a(basa basa) {
        if (basa == null) {
            return null;
        }
        afkp a = LatestFootprintFilter.m67177a();
        List list = ((barx) basa).f101647a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1660base base = (C1660base) list.get(i);
            a.mo34926a(base.mo55918a(), base.mo55919b());
        }
        return a.mo34925a();
    }
}
