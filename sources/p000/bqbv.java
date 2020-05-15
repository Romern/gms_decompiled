package p000;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* renamed from: bqbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqbv {

    /* renamed from: a */
    private static final bmyx f140434a = bmyx.m108640a('.').mo66921b(4);

    /* renamed from: b */
    private static final bmyx f140435b = bmyx.m108640a(':').mo66921b(10);

    static {
        Inet4Address inet4Address = (Inet4Address) m112536a("127.0.0.1");
        Inet4Address inet4Address2 = (Inet4Address) m112536a("0.0.0.0");
    }

    /* renamed from: a */
    public static InetAddress m112536a(String str) {
        byte[] b = m112538b(str);
        if (b != null) {
            return m112537a(b);
        }
        throw new IllegalArgumentException(String.format(Locale.ROOT, "'%s' is not an IP string literal.", str));
    }

    /* renamed from: b */
    public static byte[] m112538b(String str) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i4 >= str.length()) {
                i4 = -1;
                break;
            }
            char charAt = str.charAt(i4);
            if (charAt == '.') {
                z2 = true;
            } else if (charAt != ':') {
                if (charAt == '%') {
                    break;
                } else if (Character.digit(charAt, 16) == -1) {
                    return null;
                }
            } else if (z2) {
                return null;
            } else {
                z = true;
            }
            i4++;
        }
        if (z) {
            if (z2) {
                int lastIndexOf = str.lastIndexOf(58) + 1;
                String substring = str.substring(0, lastIndexOf);
                byte[] c = m112539c(str.substring(lastIndexOf));
                if (c != null) {
                    String hexString = Integer.toHexString(((c[0] & 255) << 8) | (c[1] & 255));
                    String hexString2 = Integer.toHexString((c[3] & 255) | ((c[2] & 255) << 8));
                    StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(hexString).length() + String.valueOf(hexString2).length());
                    sb.append(substring);
                    sb.append(hexString);
                    sb.append(":");
                    sb.append(hexString2);
                    str = sb.toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
            }
            if (i4 != -1) {
                str = str.substring(0, i4);
            }
            List c2 = f140435b.mo66925c((CharSequence) str);
            if (c2.size() < 3 || c2.size() > 9) {
                return null;
            }
            int i5 = -1;
            for (i = 1; i < c2.size() - 1; i++) {
                if (((String) c2.get(i)).length() == 0) {
                    if (i5 >= 0) {
                        return null;
                    }
                    i5 = i;
                }
            }
            if (i5 >= 0) {
                i3 = (c2.size() - i5) - 1;
                if (((String) c2.get(0)).length() == 0) {
                    i2 = i5 - 1;
                    if (i2 != 0) {
                        return null;
                    }
                } else {
                    i2 = i5;
                }
                if (((String) bnjd.m109595d(c2)).length() == 0 && i3 - 1 != 0) {
                    return null;
                }
            } else {
                i2 = c2.size();
                i3 = 0;
            }
            int i6 = 8 - (i2 + i3);
            if (i5 < 0) {
                if (i6 != 0) {
                    return null;
                }
            } else if (i6 <= 0) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(16);
            int i7 = 0;
            while (i7 < i2) {
                try {
                    allocate.putShort(m112540d((String) c2.get(i7)));
                    i7++;
                } catch (NumberFormatException e) {
                    return null;
                }
            }
            for (int i8 = 0; i8 < i6; i8++) {
                allocate.putShort(0);
            }
            while (i3 > 0) {
                allocate.putShort(m112540d((String) c2.get(c2.size() - i3)));
                i3--;
            }
            return allocate.array();
        } else if (z2) {
            return m112539c(str);
        } else {
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m112539c(String str) {
        byte[] bArr = new byte[4];
        try {
            int i = 0;
            for (String str2 : f140434a.mo66918a((CharSequence) str)) {
                int i2 = i + 1;
                int parseInt = Integer.parseInt(str2);
                if (parseInt > 255 || (str2.startsWith("0") && str2.length() > 1)) {
                    throw new NumberFormatException();
                }
                bArr[i] = (byte) parseInt;
                i = i2;
            }
            if (i == 4) {
                return bArr;
            }
            return null;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: d */
    private static short m112540d(String str) {
        int parseInt = Integer.parseInt(str, 16);
        if (parseInt <= 65535) {
            return (short) parseInt;
        }
        throw new NumberFormatException();
    }

    /* renamed from: a */
    private static InetAddress m112537a(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }
}
