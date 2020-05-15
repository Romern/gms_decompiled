package p000;

import com.google.android.gms.mdh.MdhFootprintsReadResult;
import java.util.Collection;

/* renamed from: basq */
public final /* synthetic */ class basq implements bmxj {

    /* renamed from: a */
    private final bass f101669a;

    public basq(bass bass) {
        this.f101669a = bass;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [java.util.List, basm]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    public final Object apply(Object obj) {
        MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) obj;
        bxuq bxuq = this.f101669a.f101674d;
        if (mdhFootprintsReadResult != null) {
            return new azzk(bngx.m109368a((Collection) bnkn.m109668a(mdhFootprintsReadResult.f79990a, (bmxj) new basm(bxuq))), basj.m87490a(mdhFootprintsReadResult.f79991b));
        }
        return null;
    }
}
