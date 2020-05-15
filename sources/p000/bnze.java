package p000;

import java.util.zip.Adler32;
import java.util.zip.CRC32;

/* renamed from: bnze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum bnze implements bnzk {
    CRC_32("Hashing.crc32()"),
    ADLER_32("Hashing.adler32()");
    

    /* renamed from: c */
    public final bnzc f132396c;

    private bnze(String str) {
        this.f132396c = new bnyw(this, str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6606a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return new CRC32();
        }
        if (ordinal == 1) {
            return new Adler32();
        }
        throw null;
    }
}
