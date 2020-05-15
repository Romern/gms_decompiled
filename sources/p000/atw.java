package p000;

import android.util.Property;
import android.view.View;

/* renamed from: atw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atw extends Property {
    public atw(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(aty.m2099a((View) obj));
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        aty.m2100a((View) obj, ((Float) obj2).floatValue());
    }
}
