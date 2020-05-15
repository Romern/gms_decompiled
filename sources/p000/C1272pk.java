package p000;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: pk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1272pk {

    /* renamed from: a */
    public final Object f26837a;

    private C1272pk(Object obj) {
        this.f26837a = obj;
    }

    /* renamed from: a */
    public static C1272pk m19859a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new C1272pk(PointerIcon.getSystemIcon(context, 1002));
    }
}
