package p000;

import android.content.IntentFilter;

/* renamed from: axta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axta {
    /* renamed from: a */
    public static IntentFilter m83152a(String str) {
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addDataScheme("wear");
        intentFilter.addDataAuthority("*", null);
        return intentFilter;
    }
}
