package p000;

import java.util.Arrays;
import java.util.UUID;

/* renamed from: zhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zhp {

    /* renamed from: a */
    private final UUID f55095a;

    /* renamed from: b */
    private final caah f55096b;

    public zhp(UUID uuid, caah caah) {
        this.f55095a = uuid;
        this.f55096b = caah;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zhp) {
            zhp zhp = (zhp) obj;
            return bmxi.m108538a(this.f55095a, zhp.f55095a) && bmxi.m108538a(this.f55096b, zhp.f55096b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55095a, this.f55096b});
    }

    public final String toString() {
        return String.format("CharacteristicIdentifier{characteristicUuid=%s, dataType=%s}", this.f55095a, this.f55096b.f172336b);
    }
}
