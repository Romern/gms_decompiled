package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import com.google.android.gms.mdh.SecondaryIdMatcher;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import java.util.List;

/* renamed from: acfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acfw {
    /* renamed from: a */
    public static badj m49036a(LatestFootprintFilter latestFootprintFilter) {
        if (latestFootprintFilter == null) {
            return null;
        }
        badi b = badj.m86640b();
        List list = latestFootprintFilter.f79982a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SecondaryIdMatcher secondaryIdMatcher = (SecondaryIdMatcher) list.get(i);
            b.mo55646a(secondaryIdMatcher.f79993a, secondaryIdMatcher.f79994b);
        }
        return b.mo55645a();
    }

    /* renamed from: a */
    public static badr m49037a(TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter) {
        return badr.m86659a(timeSeriesFootprintsSubscriptionFilter.f80011a, timeSeriesFootprintsSubscriptionFilter.f80012b, timeSeriesFootprintsSubscriptionFilter.f80013c);
    }

    /* renamed from: a */
    public static MdhFootprint m49038a(badk badk) {
        if (badk != null) {
            return new MdhFootprint(badk.mo55612a(), badk.mo55613b(), badk.mo55614c());
        }
        return null;
    }

    /* renamed from: a */
    public static MdhFootprintsReadResult m49039a(badl badl) {
        if (badl != null) {
            return new MdhFootprintsReadResult(bnkn.m109668a(badl.mo55618a(), acfv.f59731a), accu.m48909a(badl.mo55619b()));
        }
        return null;
    }
}
