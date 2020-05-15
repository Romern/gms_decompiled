package p000;

import android.util.Property;
import android.view.View;

/* renamed from: bhij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhij extends Property {
    public bhij(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getLayoutParams().height);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.getLayoutParams().height = ((Float) obj2).intValue();
        view.requestLayout();
    }
}
