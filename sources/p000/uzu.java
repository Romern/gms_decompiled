package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: uzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzu extends uzx {

    /* renamed from: a */
    public final Set f48783a;

    public uzu(Set set) {
        super(uzz.APPDATA);
        this.f48783a = set;
    }

    /* renamed from: a */
    public final String mo28138a() {
        ArrayList arrayList = new ArrayList(this.f48783a);
        Collections.sort(arrayList);
        return TextUtils.join(",", arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return sdg.m34949a(this.f48783a, ((uzu) obj).f48783a);
    }

    public final int hashCode() {
        return this.f48783a.hashCode();
    }
}
