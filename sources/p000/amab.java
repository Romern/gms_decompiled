package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: amab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amab extends alzl {

    /* renamed from: a */
    private final rlf f74560a;

    /* renamed from: a */
    public final void mo40528a(int i, Bundle bundle, Bundle bundle2) {
        String str;
        String str2;
        String str3;
        boolean z;
        Status a = amaz.m62474a(i, bundle);
        if (bundle2 != null) {
            boolean z2 = bundle2.getBoolean("circles.first_time_add_need_consent");
            String string = bundle2.getString("circles.first_time_add_text");
            String string2 = bundle2.getString("circles.first_time_add_title_text");
            z = z2;
            str3 = string;
            str = bundle2.getString("circles.first_time_add_ok_text");
            str2 = string2;
        } else {
            str3 = null;
            str2 = null;
            str = null;
            z = false;
        }
        this.f74560a.mo9482a(new amac(a, z, str3, str2, str));
    }

    public amab(rlf rlf) {
        this.f74560a = rlf;
    }
}
