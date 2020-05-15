package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aahn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aahn {

    /* renamed from: a */
    public final SharedPreferences f28140a;

    /* renamed from: b */
    public final Context f28141b;

    public aahn(Context context) {
        this.f28141b = context;
        this.f28140a = context.getSharedPreferences("spptach", 0);
    }
}
