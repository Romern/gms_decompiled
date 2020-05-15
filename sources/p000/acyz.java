package p000;

import android.content.Intent;
import java.util.Arrays;

/* renamed from: acyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyz {

    /* renamed from: a */
    public final int f61100a;

    /* renamed from: b */
    public final Intent f61101b;

    public acyz(int i, Intent intent) {
        this.f61100a = i;
        this.f61101b = intent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof acyz) {
            acyz acyz = (acyz) obj;
            if (this.f61100a != acyz.f61100a || !bmxi.m108538a(this.f61101b, acyz.f61101b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f61100a), this.f61101b});
    }
}
