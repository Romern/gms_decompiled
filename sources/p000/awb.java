package p000;

import android.util.Property;

/* renamed from: awb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awb extends Property {
    public awb(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((awc) obj).getLevel());
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        awc awc = (awc) obj;
        awc.setLevel(((Integer) obj2).intValue());
        awc.invalidateSelf();
    }
}
