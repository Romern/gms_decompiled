package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: alzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alzz extends alzl {

    /* renamed from: a */
    private final rlf f74555a;

    /* renamed from: a */
    public final void mo40528a(int i, Bundle bundle, Bundle bundle2) {
        String str;
        String str2;
        Status a = amaz.m62474a(i, bundle);
        String[] strArr = null;
        if (bundle2 != null) {
            str = bundle2.getString("circle_id");
        } else {
            str = null;
        }
        if (bundle2 != null) {
            str2 = bundle2.getString("circle_name");
        } else {
            str2 = null;
        }
        if (bundle2 != null) {
            strArr = bundle2.getStringArray("added_people");
        }
        this.f74555a.mo9482a(new amaa(a, str, str2, strArr));
    }

    public alzz(rlf rlf) {
        this.f74555a = rlf;
    }
}
