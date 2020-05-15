package p000;

import android.util.Property;

/* renamed from: afz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afz extends Property {
    public afz(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((aga) obj).getLevel());
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        aga aga = (aga) obj;
        aga.setLevel(((Integer) obj2).intValue());
        aga.invalidateSelf();
    }
}
