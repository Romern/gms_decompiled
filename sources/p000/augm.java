package p000;

import android.app.PendingIntent;
import android.os.Build;
import android.telephony.SmsManager;
import java.nio.charset.Charset;

/* renamed from: augm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class augm extends augl {

    /* renamed from: f */
    private static final String[] f91774f = {"", "000000", "00000", "0000", "000", "00", "0", ""};

    /* renamed from: g */
    private static final String[] f91775g = {"", "0001101", "000000", "00000", "0000", "000", "00", "0", ""};

    /* renamed from: d */
    final short f91776d;

    /* renamed from: e */
    final boolean f91777e;

    public augm(String str, String str2, short s, boolean z) {
        super(str, str2);
        this.f91776d = s;
        this.f91777e = z;
    }

    /* renamed from: a */
    public static augm m77028a(aufk aufk) {
        String str;
        int a = aufj.m76984a(aufk.f91687b);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 2) {
            z = false;
        } else if (i != 3) {
            throw new IllegalArgumentException();
        }
        String str2 = aufk.f91689d;
        if ((aufk.f91686a & 16) != 0) {
            str = aufk.f91691f;
        } else {
            str = null;
        }
        return new augm(str2, str, (short) aufk.f91690e, z);
    }

    /* renamed from: b */
    public final aufk mo50500b() {
        bxvd da = aufk.f91684h.mo74144da();
        if (!this.f91777e) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aufk aufk = (aufk) da.f164949b;
            aufk.f91687b = 2;
            aufk.f91686a |= 1;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aufk aufk2 = (aufk) da.f164949b;
            aufk2.f91687b = 3;
            aufk2.f91686a |= 1;
        }
        String str = this.f91772b;
        aufk aufk3 = (aufk) da.f164949b;
        str.getClass();
        int i = aufk3.f91686a | 4;
        aufk3.f91686a = i;
        aufk3.f91689d = str;
        String str2 = this.f91773c;
        if (str2 != null) {
            str2.getClass();
            i |= 16;
            aufk3.f91686a = i;
            aufk3.f91691f = str2;
        }
        short s = this.f91776d;
        aufk3.f91686a = i | 8;
        aufk3.f91690e = s;
        return (aufk) da.mo74062i();
    }

    /* renamed from: c */
    public final int mo50501c() {
        return 3;
    }

    /* renamed from: a */
    private static byte[] m77029a(StringBuilder sb) {
        if (sb.length() % 8 == 0) {
            int length = sb.length() / 8;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 8;
                bArr[i] = (byte) Integer.parseInt(sb.substring(i2, i2 + 8), 2);
            }
            return bArr;
        }
        int length2 = sb.length();
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("bit sequence length [");
        sb2.append(length2);
        sb2.append("] is not a multiple of 8");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public final String mo50499a() {
        String str = !this.f91777e ? "data" : "datale";
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("AmlV1DataSmsReporter[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* renamed from: a */
    public final void mo50512a(int i, String str, String str2, String str3, PendingIntent pendingIntent) {
        SmsManager smsManager;
        byte[] bArr;
        byte[] bytes = str3.getBytes(Charset.forName("GSM0338"));
        int i2 = Build.VERSION.SDK_INT;
        if (i == Integer.MAX_VALUE) {
            smsManager = SmsManager.getDefault();
        } else {
            smsManager = SmsManager.getSmsManagerForSubscriptionId(i);
        }
        short s = this.f91776d;
        int i3 = 0;
        if (!this.f91777e) {
            int length = bytes.length;
            StringBuilder sb = new StringBuilder(((int) Math.ceil((double) (((float) (length * 7)) / 8.0f))) * 8);
            while (i3 < length) {
                String binaryString = Integer.toBinaryString(bytes[i3]);
                if (binaryString.length() <= 7) {
                    sb.append(f91774f[binaryString.length()]);
                    sb.append(binaryString);
                    i3++;
                } else {
                    String substring = binaryString.substring(binaryString.length() - 8);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 28);
                    sb2.append("input has 8 bit component [");
                    sb2.append(substring);
                    sb2.append("]");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            sb.append(f91775g[sb.length() % 8]);
            bArr = m77029a(sb);
        } else {
            StringBuilder sb3 = new StringBuilder(((int) Math.ceil((double) (((float) (bytes.length * 7)) / 8.0f))) * 8);
            int i4 = 0;
            while (i4 < bytes.length) {
                String binaryString2 = Integer.toBinaryString(bytes[i4]);
                if (binaryString2.length() <= 7) {
                    if (binaryString2.length() < 7) {
                        String valueOf = String.valueOf(f91774f[binaryString2.length()]);
                        String valueOf2 = String.valueOf(binaryString2);
                        binaryString2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                    }
                    int i5 = 7 - (i4 % 8);
                    if (i5 < 7) {
                        int length2 = sb3.length() - 8;
                        sb3.replace(length2, (length2 + 7) - i5, binaryString2.substring(i5, 7));
                    }
                    sb3.append(f91775g[i5]);
                    sb3.append((CharSequence) binaryString2, 0, i5);
                    i4++;
                } else {
                    String substring2 = binaryString2.substring(binaryString2.length() - 8);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(substring2).length() + 28);
                    sb4.append("input has 8 bit component [");
                    sb4.append(substring2);
                    sb4.append("]");
                    throw new IllegalArgumentException(sb4.toString());
                }
            }
            bArr = m77029a(sb3);
        }
        smsManager.sendDataMessage(str, str2, s, bArr, pendingIntent, null);
    }
}
