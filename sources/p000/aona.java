package p000;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: aona */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aona {

    /* renamed from: a */
    public final Bundle f78561a;

    public aona(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        this.f78561a = bundle2;
        bundle2.putString("com.google.android.apps.plus.CONTENT_URL", str);
        this.f78561a.putString("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID", str2);
        this.f78561a.putBundle("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA", bundle);
    }

    /* renamed from: a */
    public static aona m66118a(Bundle bundle) {
        Bundle bundle2 = null;
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("com.google.android.apps.plus.CONTENT_URL");
        String string2 = bundle.getString("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID");
        if (TextUtils.isEmpty(string)) {
            bundle2 = bundle.getBundle("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA");
        }
        return new aona(string, string2, bundle2);
    }

    /* renamed from: b */
    public final boolean mo43070b() {
        return !TextUtils.isEmpty(mo43069a());
    }

    /* renamed from: c */
    public final String mo43071c() {
        return this.f78561a.getString("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID");
    }

    /* renamed from: d */
    public final boolean mo43072d() {
        return !TextUtils.isEmpty(mo43071c());
    }

    /* renamed from: e */
    public final Bundle mo43073e() {
        return this.f78561a.getBundle("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA");
    }

    /* renamed from: f */
    public final boolean mo43074f() {
        Bundle e = mo43073e();
        return e != null && !TextUtils.isEmpty(e.getString("title")) && !TextUtils.isEmpty(e.getString("description"));
    }

    /* renamed from: g */
    public final String mo43075g() {
        return mo43073e().getString("title");
    }

    /* renamed from: h */
    public final boolean mo43076h() {
        Bundle e = mo43073e();
        return e != null && !TextUtils.isEmpty(e.getString("title"));
    }

    /* renamed from: i */
    public final String mo43077i() {
        return mo43073e().getString("description");
    }

    /* renamed from: j */
    public final boolean mo43078j() {
        Bundle e = mo43073e();
        return e != null && !TextUtils.isEmpty(e.getString("description"));
    }

    /* renamed from: k */
    public final String mo43079k() {
        return mo43073e().getString("thumbnailUrl");
    }

    /* renamed from: l */
    public final boolean mo43080l() {
        Bundle e = mo43073e();
        return e != null && !TextUtils.isEmpty(e.getString("thumbnailUrl"));
    }

    /* renamed from: a */
    public final String mo43069a() {
        return this.f78561a.getString("com.google.android.apps.plus.CONTENT_URL");
    }
}
