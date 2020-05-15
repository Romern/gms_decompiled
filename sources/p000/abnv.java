package p000;

import android.os.Build;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import java.util.Comparator;

/* renamed from: abnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abnv implements Comparator {
    /* renamed from: a */
    private static final int m47968a(Object obj) {
        int i = Build.VERSION.SDK_INT;
        if (cele.m137151c()) {
            int i2 = Build.VERSION.SDK_INT;
            if (obj instanceof CellInfoNr) {
                return 1;
            }
        }
        if (obj instanceof CellInfoLte) {
            return 2;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (obj instanceof CellInfoWcdma) {
            return 3;
        }
        if (!(obj instanceof CellInfoCdma)) {
            return !(obj instanceof CellInfoGsm) ? Integer.MAX_VALUE : 5;
        }
        return 4;
    }

    public final int compare(Object obj, Object obj2) {
        int a = m47968a(obj);
        int a2 = m47968a(obj2);
        if (a >= a2) {
            return a != a2 ? 1 : 0;
        }
        return -1;
    }
}
