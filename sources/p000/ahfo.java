package p000;

import android.bluetooth.le.ScanRecord;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.SparseArray;
import com.google.android.gms.beacon.BleFilter;
import java.util.Arrays;

/* renamed from: ahfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfo extends ney {

    /* renamed from: a */
    public static final ParcelUuid f67117a = ParcelUuid.fromString("0000FE2C-0000-1000-8000-00805F9B34FB");

    /* renamed from: b */
    public static final BleFilter f67118b;

    static {
        neh neh = new neh();
        neh.mo20518a(f67117a, new byte[0]);
        f67118b = neh.mo20515a();
    }

    /* renamed from: b */
    public static boolean m55650b(byte[] bArr) {
        int d;
        if (bArr != null) {
            int length = bArr.length;
            if (length == 3) {
                return true;
            }
            if (length <= 3 || m55652c(bArr) != 0 || (d = m55654d(bArr)) < 3 || d > 14 || d + 1 > length) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static int m55652c(byte[] bArr) {
        if (bArr.length != 3) {
            return (bArr[0] & 224) >> 5;
        }
        return 0;
    }

    /* renamed from: d */
    private static int m55654d(byte[] bArr) {
        if (bArr.length != 3) {
            return (bArr[0] & 30) >> 1;
        }
        return 3;
    }

    /* renamed from: e */
    public static byte[] m55656e(ScanRecord scanRecord) {
        if (cfoj.m141535P()) {
            return m55649a(scanRecord.getServiceData(f67117a), 4);
        }
        return null;
    }

    /* renamed from: f */
    public static byte[] m55658f(nek nek) {
        if (cfoj.m141535P()) {
            return m55649a(nek.mo20526a(f67117a), 3);
        }
        return null;
    }

    /* renamed from: g */
    public static byte[] m55659g(nek nek) {
        if (cfoj.m141535P()) {
            return m55649a(nek.mo20526a(f67117a), 4);
        }
        return null;
    }

    /* renamed from: a */
    public final int mo20552a() {
        return 106;
    }

    /* renamed from: b */
    public final Integer mo20555b(nek nek) {
        return null;
    }

    /* renamed from: a */
    public static boolean m55646a(Context context) {
        if (context.getPackageManager().hasSystemFeature("org.chromium.arc")) {
            return cfoj.f184966a.mo6606a().mo82066Q();
        }
        int i = Build.VERSION.SDK_INT;
        return cfoj.m141522C();
    }

    /* renamed from: c */
    public static byte[] m55653c(ScanRecord scanRecord) {
        if (cfoj.m141547ab()) {
            return m55649a(scanRecord.getServiceData(f67117a), 2);
        }
        return null;
    }

    /* renamed from: d */
    public static byte[] m55655d(ScanRecord scanRecord) {
        if (cfoj.m141535P()) {
            return m55649a(scanRecord.getServiceData(f67117a), 3);
        }
        return null;
    }

    /* renamed from: b */
    public static byte[] m55651b(ScanRecord scanRecord) {
        return m55649a(scanRecord.getServiceData(f67117a), 1);
    }

    /* renamed from: e */
    public static byte[] m55657e(nek nek) {
        if (cfoj.m141547ab()) {
            return m55649a(nek.mo20526a(f67117a), 2);
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m55647a(ScanRecord scanRecord) {
        return m55649a(scanRecord.getServiceData(f67117a), 0);
    }

    /* renamed from: a */
    public static byte[] m55648a(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) < 3) {
            return null;
        }
        if (length == 3) {
            return bArr;
        }
        int i = 1;
        int d = m55654d(bArr) + 1;
        while (bArr[i] == 0 && d - i > 3) {
            i++;
        }
        return Arrays.copyOfRange(bArr, i, d);
    }

    /* renamed from: a */
    public static byte[] m55649a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            SparseArray sparseArray = new SparseArray();
            if (m55652c(bArr) == 0) {
                int d = m55654d(bArr) + 1;
                while (true) {
                    int length = bArr.length;
                    if (d >= length) {
                        break;
                    }
                    byte b = bArr[d];
                    int i2 = d + 1;
                    byte b2 = b & 15;
                    int i3 = ((b & 240) >> 4) + i2;
                    if (sparseArray.get(b2) == null) {
                        if (i3 <= length) {
                            sparseArray.put(b2, Arrays.copyOfRange(bArr, i2, i3));
                        } else {
                            StringBuilder sb = new StringBuilder(72);
                            sb.append("Invalid length, ");
                            sb.append(i3);
                            sb.append(" is longer than service data size ");
                            sb.append(length);
                            throw new ahfn(sb.toString());
                        }
                    }
                    d = i3;
                }
            }
            return (byte[]) sparseArray.get(i);
        } catch (ahfn e) {
            srn srn = ahfp.f67119a;
            return null;
        }
    }

    /* renamed from: a */
    public final Integer mo20553a(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public final byte[] mo20554a(nek nek) {
        return m55648a(nek.mo20526a(f67117a));
    }
}
