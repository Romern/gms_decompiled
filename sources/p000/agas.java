package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: agas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class agas {

    /* renamed from: c */
    protected final String[] f65092c;

    /* renamed from: d */
    public final int f65093d;

    /* renamed from: e */
    public final long f65094e;

    protected agas(String[] strArr, int i, agap agap) {
        this.f65092c = strArr;
        this.f65093d = i;
        agap.mo35147c();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        agap.mo35146b(4);
        byte[] bArr = agap.f65083a;
        int i2 = agap.f65085c;
        int i3 = i2 + 1;
        agap.f65085c = i3;
        byte b = bArr[i2];
        int i4 = i3 + 1;
        agap.f65085c = i4;
        byte b2 = bArr[i3];
        int i5 = i4 + 1;
        agap.f65085c = i5;
        byte b3 = bArr[i4];
        agap.f65085c = i5 + 1;
        this.f65094e = timeUnit.toMillis((((long) (b2 & 255)) << 16) | (((long) (b & 255)) << 24) | (((long) (b3 & 255)) << 8) | ((long) (bArr[i5] & 255)));
        int c = agap.mo35147c();
        SystemClock.elapsedRealtime();
        int i6 = agap.f65085c + c;
        if (i6 <= agap.f65084b) {
            agap.f65086d = i6;
            mo35136a(agap);
            agap.f65086d = -1;
            return;
        }
        throw new IOException(String.format(Locale.ROOT, "attempt to set limit beyond available data: %d exceeds %d", Integer.valueOf(agap.f65085c + c), Integer.valueOf(agap.f65084b)));
    }

    /* renamed from: a */
    public static String m53825a(String[] strArr) {
        if (strArr != null) {
            return TextUtils.join(".", strArr);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35136a(agap agap);

    public boolean equals(Object obj) {
        if (obj instanceof agas) {
            agas agas = (agas) obj;
            if (!Arrays.equals(this.f65092c, agas.f65092c) || this.f65093d != agas.f65093d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f65092c, Integer.valueOf(this.f65093d)});
    }

    /* renamed from: a */
    public static boolean m53826a(String[] strArr, String[] strArr2) {
        int length = strArr2.length - strArr.length;
        if (length <= 0) {
            return false;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals(strArr2[i + length])) {
                return false;
            }
        }
        return true;
    }
}
