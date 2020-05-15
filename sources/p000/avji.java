package p000;

import android.net.Uri;

/* renamed from: avji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avji {
    /* renamed from: a */
    public static Uri m78610a(String str, String str2) {
        return Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("Email", str).appendQueryParameter("continue", str2).build();
    }
}
