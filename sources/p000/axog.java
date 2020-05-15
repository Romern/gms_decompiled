package p000;

import android.content.Intent;

/* renamed from: axog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axog {
    /* renamed from: a */
    public static String m82805a(Intent intent) {
        return intent.getStringExtra("transaction_token");
    }

    /* renamed from: b */
    public static String m82806b(Intent intent) {
        return intent.getStringExtra("memo");
    }

    /* renamed from: c */
    public static String m82807c(Intent intent) {
        return intent.getStringExtra("draft_token");
    }
}
