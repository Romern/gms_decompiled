package p000;

import java.io.InputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* renamed from: ncd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ncd implements nca {

    /* renamed from: a */
    public static final /* synthetic */ int f35234a = 0;

    /* renamed from: b */
    private static final lvn f35235b = new lvn("BackupStreamEncryptor");

    /* renamed from: c */
    private final InputStream f35236c;

    public ncd(InputStream inputStream) {
        this.f35236c = inputStream;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ae, code lost:
        r13.mo20449a(java.util.Arrays.copyOf(r5, r4));
        r4 = 0;
     */
    /* renamed from: a */
    public final nbz mo20447a(SecretKey secretKey, byte[] bArr, Set set) {
        InputStream inputStream;
        int i;
        byte b;
        long j;
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        nbg nbg = new nbg(new nbk(), new nbh(secretKey, bArr), new nbj());
        naz naz = new naz(secretKey);
        nay nay = new nay(secretKey, new SecureRandom());
        HashSet hashSet = new HashSet();
        bngs j2 = bngx.m109377j();
        bngs j3 = bngx.m109377j();
        hashSet.addAll(set);
        InputStream inputStream2 = this.f35236c;
        ncc ncc = new ncc(instance, naz, hashSet, j2, nay, j3);
        while (true) {
            int read = inputStream2.read(nbg.f35176a, 0, 2017);
            int i2 = -1;
            if (read != -1) {
                long j4 = 0;
                while (true) {
                    int read2 = inputStream2.read();
                    if (read2 == i2) {
                        inputStream = inputStream2;
                        i = read;
                        break;
                    }
                    byte b2 = (byte) read2;
                    if (read >= 2048) {
                        b = nbg.f35176a[read - 31];
                    } else {
                        b = 0;
                    }
                    int i3 = read + 1;
                    byte[] bArr2 = nbg.f35176a;
                    bArr2[read] = b2;
                    nbk nbk = nbg.f35177b;
                    byte b3 = b2 & 255;
                    inputStream = inputStream2;
                    long j5 = (nbk.f35184a[(int) (j4 >>> 56)] ^ ((j4 << 8) ^ ((long) b3))) ^ nbk.f35185b[b & 255];
                    if (i3 >= 65536) {
                        break;
                    }
                    if (i3 >= 2048) {
                        nbj nbj = nbg.f35179d;
                        nbh nbh = nbg.f35178c;
                        j = j5;
                        if ((nbj.f35183a & ((nbh.f35180a + j5) * nbh.f35181b)) == 0) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    read = i3;
                    inputStream2 = inputStream;
                    j4 = j;
                    i2 = -1;
                }
                if (i > 0) {
                    ncc.mo20449a(Arrays.copyOf(nbg.f35176a, i));
                    inputStream2 = inputStream;
                } else {
                    inputStream2 = inputStream;
                }
            } else {
                bngx a = j2.mo67664a();
                bngx a2 = j3.mo67664a();
                f35235b.mo25414c("Chunks: %d total, %d unique, %d new", Integer.valueOf(a2.size()), Integer.valueOf(bnic.m109495a((Collection) a2).size()), Integer.valueOf(a.size()));
                return new nbz(a2, j2.mo67664a(), instance.digest());
            }
        }
    }
}
