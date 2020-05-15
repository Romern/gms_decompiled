package p000;

import android.accounts.Account;
import com.google.android.gms.leveldb.LevelDb;
import java.nio.ByteBuffer;

/* renamed from: bgul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgul {

    /* renamed from: a */
    public final long f117581a;

    public bgul(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f117581a = wrap.getLong();
        wrap.getLong();
    }

    /* renamed from: a */
    public static byte[] m99987a(Account account, long j) {
        return m99988a(account, j, 0);
    }

    /* renamed from: b */
    private static long m99991b(Account account) {
        long j = 1125899906842597L;
        for (int i = 0; i < account.name.length(); i++) {
            j = (j * 31) + ((long) account.name.charAt(i));
        }
        return j;
    }

    /* renamed from: a */
    private static byte[] m99988a(Account account, long j, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        allocate.putLong(m99991b(account));
        allocate.putLong(j ^ Long.MAX_VALUE);
        allocate.putInt(i);
        return allocate.array();
    }

    /* renamed from: b */
    static byte[] m99992b(Account account, long j) {
        return m99988a(account, j, -1);
    }

    /* renamed from: a */
    public static byte[] m99989a(Account account, long j, bgvl bgvl) {
        return m99988a(account, j, System.identityHashCode(bgvl));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo63214b() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        allocate.putLong(this.f117581a);
        allocate.putLong(-1);
        allocate.putInt(-1);
        return allocate.array();
    }

    /* renamed from: a */
    public static byte[] m99990a(Account account, long j, bgvm bgvm) {
        return m99988a(account, j, System.identityHashCode(bgvm));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63210a(LevelDb.Iterator iterator) {
        if (this.f117581a != -1) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putLong(this.f117581a + 1);
            iterator.seek(allocate.array());
            return;
        }
        iterator.seekToLast();
        if (iterator.isValid()) {
            iterator.next();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo63211a(Account account) {
        return this.f117581a == m99991b(account);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final boolean mo63212a(Iterable r5) {
        int size = r5.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (mo63211a((Account) r5.get(i))) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo63213a() {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(this.f117581a);
        return allocate.array();
    }
}
