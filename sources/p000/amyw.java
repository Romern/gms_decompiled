package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import java.util.zip.CRC32;

/* renamed from: amyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyw {

    /* renamed from: a */
    public final Account f76415a;

    /* renamed from: b */
    public final ContentResolver f76416b;

    /* renamed from: c */
    public final amvt f76417c;

    /* renamed from: d */
    public final amvm f76418d;

    public amyw(Account account, ContentResolver contentResolver, amvt amvt, amvm amvm) {
        this.f76415a = account;
        this.f76416b = contentResolver;
        this.f76417c = amvt;
        this.f76418d = amvm;
    }

    /* renamed from: a */
    public static long m63743a(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return crc32.getValue();
    }
}
