package p000;

import android.content.Context;
import android.os.Build;
import android.util.Log;

/* renamed from: aas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aas extends aap implements aaq {

    /* renamed from: a */
    public aaq f85a;

    static {
        try {
            int i = Build.VERSION.SDK_INT;
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public aas(Context context, int i) {
        super(context, null, i, null);
    }

    /* renamed from: a */
    public final C1543zl mo95a(Context context, boolean z) {
        aar aar = new aar(context, z);
        aar.f83e = this;
        return aar;
    }
}
