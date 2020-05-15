package p000;

import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: aetc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aetc implements Comparator {

    /* renamed from: a */
    public static final aetc f63759a = new aetc();

    /* renamed from: b */
    private static final long f63760b = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: c */
    private static final long f63761c = TimeUnit.DAYS.toMillis(1);

    private aetc() {
    }

    /* renamed from: a */
    public final int compare(LocationShare locationShare, LocationShare locationShare2) {
        int i = -1;
        if (locationShare.f79630d) {
            if (!locationShare2.f79630d) {
                return -1;
            }
        } else if (locationShare2.f79630d) {
            return 1;
        }
        SharingCondition sharingCondition = locationShare.f79628b;
        SharingCondition sharingCondition2 = locationShare2.f79628b;
        int c = sharingCondition.mo43781c();
        int i2 = c - 1;
        if (c != 0) {
            if (i2 == 0) {
                i = sharingCondition2.mo43781c() != 1 ? 1 : 0;
            } else if (i2 == 1) {
                int c2 = sharingCondition2.mo43781c();
                int i3 = c2 - 1;
                if (c2 == 0) {
                    throw null;
                } else if (i3 != 0) {
                    if (i3 != 1) {
                        i = i3 != 2 ? 0 : 1;
                    } else {
                        long b = sharingCondition.mo43780b();
                        long b2 = sharingCondition2.mo43780b();
                        long j = f63760b;
                        if (b >= j) {
                            i = b < f63761c ? ((int) TimeUnit.MILLISECONDS.toMinutes(b)) - ((int) TimeUnit.MILLISECONDS.toMinutes(b2)) : ((int) TimeUnit.MILLISECONDS.toHours(b)) - ((int) TimeUnit.MILLISECONDS.toHours(b2));
                        } else if (b2 < j) {
                            i = 0;
                        }
                    }
                }
            } else if (i2 != 2) {
                i = 0;
            } else if (sharingCondition2.mo43781c() == 3) {
                i = 0;
            }
            return i == 0 ? locationShare.mo43757d().compareTo(locationShare2.mo43757d()) : i;
        }
        throw null;
    }
}
