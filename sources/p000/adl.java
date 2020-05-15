package p000;

import android.support.p002v7.widget.SwitchCompat;
import android.util.Property;

/* renamed from: adl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adl extends Property {
    public adl(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).f1297c);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).mo1654a(((Float) obj2).floatValue());
    }
}
