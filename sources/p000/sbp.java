package p000;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: sbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbp {

    /* renamed from: f */
    public static final Uri f44015f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f44016a;

    /* renamed from: b */
    public final String f44017b;

    /* renamed from: c */
    public final ComponentName f44018c;

    /* renamed from: d */
    public final int f44019d;

    /* renamed from: e */
    public final boolean f44020e;

    public sbp(ComponentName componentName) {
        this.f44016a = null;
        this.f44017b = null;
        sdo.m34959a(componentName);
        this.f44018c = componentName;
        this.f44019d = 129;
        this.f44020e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sbp) {
            sbp sbp = (sbp) obj;
            return sdg.m34949a(this.f44016a, sbp.f44016a) && sdg.m34949a(this.f44017b, sbp.f44017b) && sdg.m34949a(this.f44018c, sbp.f44018c) && this.f44019d == sbp.f44019d && this.f44020e == sbp.f44020e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44016a, this.f44017b, this.f44018c, Integer.valueOf(this.f44019d), Boolean.valueOf(this.f44020e)});
    }

    public final String toString() {
        String str = this.f44016a;
        if (str != null) {
            return str;
        }
        sdo.m34959a(this.f44018c);
        return this.f44018c.flattenToString();
    }

    public sbp(String str) {
        this(str, "com.google.android.gms", 129, false);
    }

    public sbp(String str, String str2, int i, boolean z) {
        sdo.m34977c(str);
        this.f44016a = str;
        sdo.m34977c(str2);
        this.f44017b = str2;
        this.f44018c = null;
        this.f44019d = i;
        this.f44020e = z;
    }
}
