package p000;

import java.util.EnumSet;
import java.util.Objects;

/* renamed from: asse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asse {

    /* renamed from: a */
    public final long f89557a;

    /* renamed from: b */
    public final int f89558b;

    /* renamed from: c */
    public final long f89559c;

    /* renamed from: d */
    public final String f89560d;

    /* renamed from: e */
    public final int f89561e;

    /* renamed from: f */
    public final EnumSet f89562f;

    public asse(long j, int i, long j2, String str, int i2, EnumSet enumSet) {
        this.f89557a = j;
        this.f89558b = i;
        this.f89559c = j2;
        this.f89560d = str;
        this.f89561e = i2;
        this.f89562f = enumSet;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof asse) {
            asse asse = (asse) obj;
            if (this.f89557a == asse.f89557a && this.f89558b == asse.f89558b && this.f89559c == asse.f89559c && Objects.equals(this.f89560d, asse.f89560d) && Objects.equals(this.f89562f, asse.f89562f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f89557a), Integer.valueOf(this.f89558b), Long.valueOf(this.f89559c), this.f89560d, this.f89562f);
    }
}
