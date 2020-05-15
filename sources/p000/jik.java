package p000;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: jik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jik {

    /* renamed from: a */
    static final long f22555a = TimeUnit.DAYS.toMillis(14);

    /* renamed from: b */
    private final SecureRandom f22556b = new SecureRandom();

    /* renamed from: a */
    private final jto m16761a(long j, int i) {
        bxvd da = jto.f23186d.mo74144da();
        long j2 = f22555a;
        long j3 = ((j / j2) + ((long) i)) * j2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        jto jto = (jto) da.f164949b;
        jto.f23189b = j3;
        jto.f23190c = j3 + j2;
        byte[] bArr = new byte[32];
        this.f22556b.nextBytes(bArr);
        ByteString a = ByteString.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((jto) da.f164949b).f23188a = a;
        return (jto) da.mo74062i();
    }

    /* renamed from: a */
    public final List mo13761a() {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        long j = f22555a;
        long j2 = currentTimeMillis % j;
        double d = (double) j;
        Double.isNaN(d);
        long round = Math.round(d * 0.3333333333333333d);
        if (j2 < round) {
            arrayList.add(m16761a(currentTimeMillis, -1));
        }
        arrayList.add(m16761a(currentTimeMillis, 0));
        arrayList.add(m16761a(currentTimeMillis, 1));
        arrayList.add(m16761a(currentTimeMillis, 2));
        if (j2 >= round) {
            arrayList.add(m16761a(currentTimeMillis, 3));
        }
        return arrayList;
    }
}
