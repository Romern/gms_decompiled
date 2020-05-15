package p000;

import android.content.Intent;
import java.util.Arrays;

/* renamed from: aczk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aczk {

    /* renamed from: a */
    public final int f61148a;

    /* renamed from: b */
    public final Intent f61149b;

    public aczk(int i, Intent intent) {
        this.f61148a = i;
        this.f61149b = intent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aczk) {
            aczk aczk = (aczk) obj;
            if (this.f61148a != aczk.f61148a || !bmxi.m108538a(this.f61149b, aczk.f61149b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f61148a), this.f61149b});
    }
}
