package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: alzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alzj extends rtr {

    /* renamed from: d */
    private final Bundle f74546d;

    public alzj(DataHolder dataHolder, int i, Bundle bundle) {
        super(dataHolder, i);
        this.f74546d = bundle;
    }

    /* renamed from: c */
    public final String mo41056c() {
        return mo25151d("circle_id");
    }

    /* renamed from: d */
    public final String mo41057d() {
        Bundle bundle;
        int f = mo41058f();
        if (!(f == -1 || (bundle = this.f74546d.getBundle("localized_group_names")) == null)) {
            String string = bundle.getString(String.valueOf(f));
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return mo25151d("name");
    }

    /* renamed from: f */
    public final int mo41058f() {
        int b = mo25146b("type");
        if (b == -1 || b == 1 || b == 2 || b == 3 || b == 4) {
            return b;
        }
        return -2;
    }

    /* renamed from: g */
    public final int mo41059g() {
        Bundle bundle = this.f74546d.getBundle("circlevisibility");
        if (bundle == null || !bundle.containsKey(mo41056c())) {
            return 0;
        }
        return bundle.getInt(mo41056c());
    }

    /* renamed from: h */
    public final int mo41060h() {
        return mo25146b("people_count");
    }
}
