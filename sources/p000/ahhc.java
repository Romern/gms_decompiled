package p000;

import android.os.ParcelUuid;
import java.util.UUID;

/* renamed from: ahhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahhc {
    /* renamed from: a */
    public static ParcelUuid m55765a(String str) {
        if (str.length() == 36) {
            return new ParcelUuid(UUID.fromString(str));
        }
        if (str.length() == 4) {
            StringBuilder sb = new StringBuilder(str.length() + 32);
            sb.append("0000");
            sb.append(str);
            sb.append("-0000-1000-8000-00805F9B34FB");
            return new ParcelUuid(UUID.fromString(sb.toString()));
        }
        throw new IllegalStateException(String.format("Failed to getParcelUuid from UUID string %s. UUID is expected to be either 4 (e.g.  or 36 (e.g. 0000XXXX-0000-1000-8000-00805F9B34FB) characters", str));
    }
}
