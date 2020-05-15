package p000;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: bcla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcla {
    /* renamed from: a */
    public static UUID m89213a(ByteString bxtx) {
        ByteBuffer wrap = ByteBuffer.wrap(bxtx.getKey());
        return new UUID(wrap.getLong(), wrap.getLong());
    }
}
