package p000;

import java.util.UUID;

/* renamed from: aynt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aynt {

    /* renamed from: a */
    private static final UUID f98089a = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* renamed from: b */
    private static final UUID f98090b = UUID.fromString("FE2C0000-8366-4814-8EB0-01DE32100BEA");

    /* renamed from: a */
    public static UUID m84375a(short s) {
        return new UUID(((((long) s) & 65535) << 32) | f98089a.getMostSignificantBits(), f98089a.getLeastSignificantBits());
    }

    /* renamed from: b */
    public static void m84377b(short s) {
        new UUID((((long) s) << 32) | f98090b.getMostSignificantBits(), f98090b.getLeastSignificantBits());
    }

    /* renamed from: a */
    public static short m84376a(UUID uuid) {
        if (m84378b(uuid)) {
            return (short) ((int) (uuid.getMostSignificantBits() >> 32));
        }
        String valueOf = String.valueOf(uuid);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("Not a 16-bit Bluetooth UUID: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static boolean m84378b(UUID uuid) {
        return uuid.getLeastSignificantBits() == f98089a.getLeastSignificantBits() && (uuid.getMostSignificantBits() & -281470681743361L) == f98089a.getMostSignificantBits();
    }
}
