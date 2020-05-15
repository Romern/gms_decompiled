package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: acsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acsy {

    /* renamed from: a */
    private final Context f60714a;

    public acsy(Context context) {
        this.f60714a = context;
    }

    /* renamed from: a */
    public final SharedPreferences mo33066a() {
        return this.f60714a.getSharedPreferences("ActionsUploadSharedPrefs", 0);
    }
}
