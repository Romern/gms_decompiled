package p000;

import java.util.UUID;

/* renamed from: aynd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aynd {

    /* renamed from: a */
    public static final UUID f98004a = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    public static UUID m84289a(short s) {
        return new UUID(((((long) s) << 32) & 281470681743360L) | f98004a.getMostSignificantBits(), f98004a.getLeastSignificantBits());
    }
}
