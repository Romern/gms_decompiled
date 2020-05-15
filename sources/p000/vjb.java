package p000;

import android.database.CursorWindow;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: vjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vjb {
    /* renamed from: a */
    public static blhp m40507a(DataHolder dataHolder, int i, bkqk bkqk) {
        int a = dataHolder.mo17762a(i);
        int b = dataHolder.mo17767b("valueType", i, a);
        if (b == 0) {
            return bkta.f125260a;
        }
        if (b == 1) {
            return ((bksp) bkqk).mo66227a(dataHolder.mo17769c("value", i, a)).mo66248e();
        } else if (b == 2) {
            try {
                return bkta.m106590b((blgm) new bkxi(dataHolder.mo17769c("value", i, a)).mo66427a(bkqh.f125111a));
            } catch (Exception e) {
                throw new IllegalArgumentException("Cannot deserialize JSON value.", e);
            }
        } else {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown object type: ");
            sb.append(b);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public static DataHolder m40508a(bkqk bkqk, Iterable iterable) {
        return new vjc(bkqk).mo28514a(iterable);
    }

    /* renamed from: a */
    public static boolean m40509a(CursorWindow cursorWindow, int i, blhp blhp, bkqk bkqk) {
        blho blho = blho.KIND_NOT_SET;
        int ordinal = blhp.f126558b.ordinal();
        if (ordinal == 1) {
            boolean putLong = cursorWindow.putLong(2, i, 0);
            blgm a = blhp.mo66553a();
            if (a.f126445b == blgl.NULL_VALUE) {
                return cursorWindow.putLong(0, i, 0) & putLong;
            }
            return cursorWindow.putString(bkqg.m106277a(a), i, 1) & putLong;
        } else if (ordinal == 2) {
            bksb b = ((bksp) bkqk).mo66227a(blhp.mo66554b());
            return cursorWindow.putString(b.mo66249f(), i, 2) & cursorWindow.putLong(1, i, 0) & cursorWindow.putString(b.mo66247d(), i, 1);
        } else {
            String valueOf = String.valueOf(blhp.f126558b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Unknown value type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
