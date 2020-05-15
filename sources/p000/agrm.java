package p000;

/* renamed from: agrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrm implements agrn {
    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    /* renamed from: a */
    public final boolean mo36017a() {
        boolean a;
        Long l = 1L;
        agpl agpl = agpk.m54726a().f66242a;
        synchronized (agpl.f66245b) {
            a = agpl.f66244a.mo35865a(l.longValue());
        }
        agrl.m54942a().mo36003a(a ? bygd.CACHING_FLUSH_DEVICE_TABLE : bygd.CACHING_ERROR_FLUSHING_DEVICE_TABLE, 19, "Local_Cache", "MDP_Notification");
        return a;
    }

    /* renamed from: b */
    public final boolean mo36019b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo36020c() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo36018a(bwbv bwbv) {
        bwbx bwbx;
        if (cfmj.f184370a.mo6606a().mo81482e()) {
            bszx bszx = bszx.GCORE_MSG_TYPE_HIDDEN;
            bszx a = bszx.m116352a(bwbv.f158782d);
            if (a == null) {
                a = bszx.UNRECOGNIZED;
            }
            if (bszx == a && bwbu.OPERATION == bwbu.m121732a(bwbv.f158779a)) {
                if (bwbv.f158779a == 5) {
                    bwbx = (bwbx) bwbv.f158780b;
                } else {
                    bwbx = bwbx.f158789c;
                }
                int i = bwbx.f158791a;
                char c = i != 0 ? i != 1 ? (char) 0 : 3 : 2;
                if (c == 0 || c != 3) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
