package p000;

import android.content.Context;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: bcka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcka {
    /* renamed from: a */
    public static bxvd m89175a(Context context, UUID uuid) {
        bbqj a = bbqj.m88406a(context);
        bxvd da = cbly.f177579g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbly) da.f164949b).f177584d = 4;
        int i = a.f103070a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbly cbly = (cbly) da.f164949b;
        cbly.f177581a = i;
        cbly.f177582b = 0;
        cbly.f177583c = a.f103071b;
        cbly.f177586f = 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbly) da.f164949b).f177585e = cipk.m150695a(67);
        cbly cbly2 = (cbly) da.mo74062i();
        bxvd da2 = cbmo.f177654h.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbly2.getClass();
        ((cbmo) da2.f164949b).f177660e = cbly2;
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        bxtx a2 = bxtx.m123261a(allocate.array());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a2.getClass();
        ((cbmo) da2.f164949b).f177657b = a2;
        return da2;
    }

    /* renamed from: a */
    public static bxvd m89176a(Context context, byte[] bArr, UUID uuid) {
        bxvd a = m89175a(context, uuid);
        bxtx a2 = bxtx.m123261a(bArr);
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        cbmo cbmo = cbmo.f177654h;
        a2.getClass();
        ((cbmo) a.f164949b).f177659d = a2;
        return a;
    }
}
