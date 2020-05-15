package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SecondaryIdMatcher;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.List;

/* renamed from: afmf */
final /* synthetic */ class afmf implements Runnable {

    /* renamed from: a */
    private final LatestFootprintFilter f64370a;

    /* renamed from: b */
    private final MdhFootprintListSafeParcelable f64371b;

    /* renamed from: c */
    private final afmt f64372c;

    public afmf(afmt afmt, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        this.f64372c = afmt;
        this.f64370a = latestFootprintFilter;
        this.f64371b = mdhFootprintListSafeParcelable;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bast]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    public final void run() {
        afmt afmt = this.f64372c;
        LatestFootprintFilter latestFootprintFilter = this.f64370a;
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = this.f64371b;
        if (afmt.f64402a) {
            basu basu = afmt.f64403b;
            List list = mdhFootprintListSafeParcelable.f80015a;
            basc basc = basu.f101684b;
            if (latestFootprintFilter != null) {
                barz b = basa.m87474b();
                List list2 = latestFootprintFilter.f79982a;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    SecondaryIdMatcher secondaryIdMatcher = (SecondaryIdMatcher) list2.get(i);
                    b.mo55924a(secondaryIdMatcher.f79993a, secondaryIdMatcher.f79994b);
                }
                b.mo55923a();
            }
            bngx.m109355a(bnjd.m109575a((Iterable) list, (bmxj) new bast(basu)));
            basc.mo29377b();
        }
    }
}
