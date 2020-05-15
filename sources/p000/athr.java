package p000;

import android.content.Context;
import com.google.android.chimera.IntentOperation;

/* renamed from: athr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class athr {
    /* renamed from: a */
    public static void m75911a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.security.FetchStorageKeyIntentOperation", "com.google.android.gms.tapandpay.security.FETCH_STORAGE_KEY_ACTION"));
    }
}
