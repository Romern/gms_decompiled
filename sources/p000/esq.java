package p000;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: esq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class esq {

    /* renamed from: a */
    public final Context f15636a;

    /* renamed from: b */
    public final UserManager f15637b;

    static {
        ffw.m11631a("UserManagerUtil");
    }

    public esq(Context context) {
        int i = Build.VERSION.SDK_INT;
        this.f15636a = context;
        this.f15637b = (UserManager) context.getSystemService("user");
    }
}
