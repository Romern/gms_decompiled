package p000;

import android.net.Uri;

/* renamed from: anuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anuc {
    /* renamed from: a */
    public static Uri m65336a(String str) {
        return new Uri.Builder().scheme("content").authority("com.google.android.gms.plus").appendPath("images").appendQueryParameter("url", str).build();
    }
}
