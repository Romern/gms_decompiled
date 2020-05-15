package p000;

import android.content.Intent;
import android.os.Bundle;

@Deprecated
/* renamed from: fur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fur {
    /* renamed from: a */
    public static Bundle m12411a(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.appinvite.INVITATION_ID", str);
        if (str2 != null) {
            bundle.putString("com.google.android.gms.appinvite.DEEP_LINK", str2);
        }
        bundle.putBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", z);
        return bundle;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fur.a(java.lang.String, java.lang.String, boolean):android.os.Bundle
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      fur.a(java.lang.String, java.lang.String, android.content.Intent):void
      fur.a(java.lang.String, java.lang.String, boolean):android.os.Bundle */
    @Deprecated
    /* renamed from: a */
    public static void m12412a(String str, String str2, Intent intent) {
        if (intent != null) {
            intent.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", m12411a(str, str2, false));
        }
    }
}
