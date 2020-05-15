package p000;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: ajca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajca extends ajbu {
    /* renamed from: b */
    public final UUID mo38475b() {
        ByteBuffer wrap = ByteBuffer.wrap(this.f70352a);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    /* renamed from: c */
    public final Short mo38476c() {
        byte[] bArr = this.f70352a;
        if (bArr.length >= 18) {
            return Short.valueOf(ByteBuffer.wrap(bArr).getShort(16));
        }
        return null;
    }

    /* renamed from: d */
    public final Short mo38477d() {
        byte[] bArr = this.f70352a;
        if (bArr.length == 20) {
            return Short.valueOf(ByteBuffer.wrap(bArr).getShort(18));
        }
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(mo38475b());
        String valueOf2 = String.valueOf(mo38476c());
        String valueOf3 = String.valueOf(mo38477d());
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("IBeaconIdPrefix{proximityUuid=");
        sb.append(valueOf);
        sb.append(", major=");
        sb.append(valueOf2);
        sb.append(", minor=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajca(byte[] bArr) {
        super(bArr);
        int length = bArr.length;
        boolean z = true;
        if (!(length == 16 || length == 18 || length == 20)) {
            z = false;
        }
        sdo.m34975b(z, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
    }
}
