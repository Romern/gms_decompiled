package p000;

import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import java.util.Comparator;

/* renamed from: afac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afac implements Comparator {
    /* renamed from: a */
    private static final int m52776a(Object obj) {
        if (obj instanceof CellInfoLte) {
            return 1;
        }
        if (obj instanceof CellInfoWcdma) {
            return 2;
        }
        if (!(obj instanceof CellInfoCdma)) {
            return !(obj instanceof CellInfoGsm) ? Integer.MAX_VALUE : 4;
        }
        return 3;
    }

    public final int compare(Object obj, Object obj2) {
        return m52776a(obj) - m52776a(obj2);
    }
}
