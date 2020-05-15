package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: anta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anta {

    /* renamed from: a */
    public final Bundle f77709a;

    public anta(Bundle bundle) {
        this.f77709a = bundle;
    }

    /* renamed from: a */
    public final boolean mo42211a() {
        return this.f77709a.getBoolean("has_plus_one", false);
    }

    /* renamed from: b */
    public final String mo42212b() {
        return this.f77709a.getString("token");
    }

    /* renamed from: c */
    public final String mo42213c() {
        return this.f77709a.getString("confirmation_message");
    }

    public anta(String str, boolean z, String str2, String[] strArr, Uri[] uriArr, Intent intent, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        this.f77709a = bundle;
        bundle.putString("url", str);
        this.f77709a.putBoolean("has_plus_one", z);
        this.f77709a.putString("bubble_text", str2);
        this.f77709a.putStringArray("inline_annotations", strArr);
        this.f77709a.putParcelableArray("profile_photo_uris", uriArr);
        this.f77709a.putParcelable("intent", intent);
        this.f77709a.putString("token", str3);
        this.f77709a.putString("confirmation_message", str4);
        this.f77709a.putString("visibility", str5);
    }
}
