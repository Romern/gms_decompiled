package p000;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: pek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pek implements rjh {

    /* renamed from: a */
    final CastDevice f38966a;

    /* renamed from: b */
    final pel f38967b;

    /* renamed from: c */
    final Bundle f38968c = null;

    /* renamed from: d */
    final int f38969d = 0;

    /* renamed from: e */
    final String f38970e = UUID.randomUUID().toString();

    public pek(pej pej) {
        this.f38966a = pej.f38964a;
        this.f38967b = pej.f38965b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pek) {
            pek pek = (pek) obj;
            if (sdg.m34949a(this.f38966a, pek.f38966a)) {
                Bundle bundle = pek.f38968c;
                int i = pek.f38969d;
                if (sdg.m34949a(this.f38970e, pek.f38970e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38966a, null, 0, this.f38970e});
    }
}
