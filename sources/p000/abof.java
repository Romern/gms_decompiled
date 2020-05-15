package p000;

import android.telephony.CellSignalStrengthLte;
import java.lang.reflect.Field;

/* renamed from: abof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abof {
    /* renamed from: a */
    public static int m47993a(String str, CellSignalStrengthLte cellSignalStrengthLte) {
        try {
            Field declaredField = CellSignalStrengthLte.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(cellSignalStrengthLte);
        } catch (Exception e) {
            new Object[1][0] = str;
            int i = eoa.f15378a;
            return 0;
        }
    }
}
