package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: bhta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhta extends bhsy {

    /* renamed from: a */
    private final bhsx f119527a;

    public bhta(bhsx bhsx) {
        this.f119527a = bhsx;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo64249a(Object obj) {
        Long l = (Long) obj;
        return 8;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo64252b(Object obj) {
        return bhsx.m101497a((((long[]) obj).length * 8) + 4) + 4;
    }

    /* renamed from: c */
    public final long[] mo64253b(bxuc bxuc) {
        try {
            byte[] b = this.f119527a.mo64248b(bxuc.mo73795e(bxuc.mo73799h()));
            if (b.length != 0) {
                ByteBuffer wrap = ByteBuffer.wrap(b);
                int i = wrap.getInt();
                long[] jArr = new long[i];
                for (int i2 = 0; i2 < i; i2++) {
                    jArr[i2] = wrap.getLong();
                }
                return jArr;
            }
            bhuj.m101555a().mo64361c("Tried to read from empty decrypted buffer");
            return new long[0];
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Failed to read value");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo64250a(bxuc bxuc) {
        return Long.valueOf(bxuc.mo73798g());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64251a(Object obj, bxuk bxuk) {
        bxuk.mo73857d(((Long) obj).longValue());
    }

    /* renamed from: a */
    public final void mo64254b(long[] jArr, bxuk bxuk) {
        int length = jArr.length;
        ByteBuffer allocate = ByteBuffer.allocate((length * 8) + 4);
        allocate.putInt(length);
        for (long j : jArr) {
            allocate.putLong(j);
        }
        try {
            byte[] a = this.f119527a.mo64247a(allocate.array());
            bxuk.mo73858e(a.length);
            bxuk.mo73865b(a);
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to write value");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }
}
