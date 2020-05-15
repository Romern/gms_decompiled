package p000;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: bjgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjgh {

    /* renamed from: a */
    public boolean f122654a;

    /* renamed from: b */
    public String f122655b;

    /* renamed from: c */
    public boolean f122656c;

    /* renamed from: d */
    public boolean f122657d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof bjgh)) {
            return false;
        }
        bjgh bjgh = (bjgh) obj;
        return this.f122654a == bjgh.f122654a && this.f122656c == bjgh.f122656c && TextUtils.equals(this.f122655b, bjgh.f122655b) && this.f122657d == bjgh.f122657d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f122654a), this.f122655b, Boolean.valueOf(this.f122656c), Boolean.valueOf(this.f122657d)});
    }

    public bjgh() {
        this(true, null, false, false);
    }

    public bjgh(boolean z, String str, boolean z2, boolean z3) {
        this.f122654a = z;
        this.f122655b = str;
        this.f122656c = z2;
        this.f122657d = z3;
    }
}
