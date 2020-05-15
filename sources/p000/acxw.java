package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: acxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxw {
    public acxw(acxu acxu) {
        sdo.m34966a(acxu, "Callbacks must not be null.");
    }

    /* renamed from: a */
    public static final boolean m49972a(Context context, Intent intent) {
        sdo.m34966a(context, "Context must not be null.");
        sdo.m34966a(intent, "Intent must not be null.");
        return intent.hasExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
    }
}
