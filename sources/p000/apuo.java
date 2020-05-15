package p000;

import android.app.PendingIntent;
import android.os.Bundle;

/* renamed from: apuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apuo {

    /* renamed from: a */
    public final String f84933a;

    /* renamed from: b */
    public final String f84934b;

    /* renamed from: c */
    public final int f84935c;

    /* renamed from: d */
    public final PendingIntent f84936d;

    /* renamed from: e */
    public final String f84937e;

    public apuo(boolean z, Bundle bundle) {
        int i;
        this.f84933a = bundle.getString("package_name");
        String string = bundle.getString("warning_string_text");
        this.f84934b = string;
        if (string == null) {
            i = bundle.getInt("warning_string_id");
        } else {
            i = 0;
        }
        this.f84935c = i;
        long j = -1;
        if (z) {
            this.f84937e = bundle.getString("app_title");
            this.f84936d = (PendingIntent) bundle.getParcelable("hide_removed_app_intent");
            j = bundle.getLong("removed_time_ms", -1);
        } else {
            this.f84937e = null;
            this.f84936d = (PendingIntent) bundle.getParcelable("remove_app_intent");
        }
        if (!(this.f84933a == null || this.f84936d == null)) {
            if (!z) {
                return;
            }
            if (this.f84937e != null && j >= 0) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
