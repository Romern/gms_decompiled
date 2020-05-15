package p000;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: aoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoh {

    /* renamed from: a */
    final int f1867a;

    /* renamed from: b */
    final int f1868b;

    /* renamed from: c */
    final String f1869c;

    public aoh(Preference preference) {
        this.f1869c = preference.getClass().getName();
        this.f1867a = preference.f1571A;
        this.f1868b = preference.f1572B;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aoh) {
            aoh aoh = (aoh) obj;
            if (this.f1867a == aoh.f1867a && this.f1868b == aoh.f1868b && TextUtils.equals(this.f1869c, aoh.f1869c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1867a + 527) * 31) + this.f1868b) * 31) + this.f1869c.hashCode();
    }
}
