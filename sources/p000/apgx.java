package p000;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: apgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apgx {

    /* renamed from: a */
    private static final char[] f84357a = "0123456789ABCDEF".toCharArray();

    /* renamed from: b */
    private final String f84358b;

    /* renamed from: c */
    private final String f84359c;

    /* renamed from: d */
    private final String f84360d;

    /* renamed from: e */
    private final int f84361e;

    /* renamed from: f */
    private final String f84362f;

    /* renamed from: g */
    private final String f84363g;

    static {
        apgx.class.getSimpleName();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0100  */
    public apgx(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Byte b;
        int i = -1;
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = str.replaceAll("^\\s+", "").replaceAll("\\s+$", "").replaceAll("[\\t\\n\\r]", "");
            int indexOf = replaceAll.indexOf(35);
            replaceAll = indexOf != -1 ? replaceAll.substring(0, indexOf) : replaceAll;
            apgw apgw = new apgw(replaceAll);
            if (apgw.mo47198b()) {
                this.f84359c = apgw.mo47197a();
                this.f84361e = apgw.f84352a.intValue();
                String str8 = this.f84359c;
                if (str8 != null) {
                    StringBuilder sb = new StringBuilder(str8.length() + 2);
                    sb.append("^");
                    sb.append(str8);
                    sb.append(":");
                    replaceAll = replaceAll.replaceAll(sb.toString(), "");
                }
                String replaceAll2 = replaceAll.replaceAll("^/+", "");
                if (!TextUtils.isEmpty(replaceAll2)) {
                    str3 = replaceAll2;
                    int i2 = 0;
                    for (String str9 = null; !str3.equals(str9) && i2 < 1024; str9 = str3) {
                        try {
                            byte[] bytes = str3.replace("\\x", "%").getBytes("UTF-8");
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);
                            int i3 = 0;
                            while (true) {
                                int length = bytes.length;
                                if (i3 >= length) {
                                    break;
                                }
                                byte b2 = bytes[i3];
                                byte b3 = b2 & 255;
                                if (b3 < 128) {
                                    int i4 = i3 + 2;
                                    if (i4 < length && b3 == 37) {
                                        byte b4 = bytes[i3 + 1];
                                        byte b5 = bytes[i4];
                                        char c = (char) (b4 & 255);
                                        if (m70261a(c)) {
                                            char c2 = (char) (b5 & 255);
                                            if (m70261a(c2)) {
                                                StringBuilder sb2 = new StringBuilder(1);
                                                sb2.append(c);
                                                int parseInt = Integer.parseInt(sb2.toString(), 16);
                                                StringBuilder sb3 = new StringBuilder(1);
                                                sb3.append(c2);
                                                b = Byte.valueOf((byte) ((parseInt * 16) + Integer.parseInt(sb3.toString(), 16)));
                                                if (b == null) {
                                                    byteArrayOutputStream.write(b.byteValue());
                                                    i3 = i4;
                                                } else {
                                                    byteArrayOutputStream.write(b2);
                                                }
                                            }
                                        }
                                    }
                                    b = null;
                                    if (b == null) {
                                    }
                                } else {
                                    byteArrayOutputStream.write(b2);
                                }
                                i3++;
                            }
                            str7 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            str7 = null;
                        }
                        i2++;
                        str3 = str7;
                    }
                } else {
                    str3 = null;
                }
                int indexOf2 = str3.indexOf(63);
                if (indexOf2 != -1) {
                    int i5 = indexOf2 + 1;
                    if (i5 >= str3.length()) {
                        str4 = "";
                    } else {
                        str4 = str3.substring(i5);
                    }
                    str3 = str3.substring(0, indexOf2);
                } else {
                    str4 = null;
                }
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf3 = str3.indexOf(47);
                    if (indexOf3 != -1) {
                        str6 = str3.substring(0, indexOf3);
                    } else {
                        str6 = str3;
                    }
                    int indexOf4 = str6.indexOf(64);
                    str6 = indexOf4 != -1 ? str6.substring(indexOf4 + 1) : str6;
                    int i6 = this.f84361e;
                    if (i6 != -1) {
                        StringBuilder sb4 = new StringBuilder(13);
                        sb4.append(":");
                        sb4.append(i6);
                        sb4.append("$");
                        str6 = str6.replaceAll(sb4.toString(), "");
                    }
                    String replaceAll3 = str6.replaceAll("^\\.*", "").replaceAll("\\.*$", "").replaceAll("\\.+", ".");
                    String a = m70260a(replaceAll3);
                    str5 = (a != null ? a : replaceAll3).toLowerCase(Locale.getDefault());
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    String c3 = m70263c(str3);
                    this.f84360d = m70264d(str5);
                    this.f84362f = m70264d(c3);
                    this.f84363g = !TextUtils.isEmpty(str4) ? m70264d(str4) : str4;
                    this.f84358b = str3;
                    return;
                }
                this.f84358b = null;
                this.f84360d = null;
                this.f84362f = null;
                this.f84363g = null;
                return;
            }
            str2 = null;
            this.f84358b = null;
            this.f84359c = null;
            this.f84360d = null;
            i = -1;
        } else {
            str2 = null;
            this.f84358b = null;
            this.f84359c = null;
            this.f84360d = null;
        }
        this.f84361e = i;
        this.f84362f = str2;
        this.f84363g = str2;
    }

    /* renamed from: a */
    private static String m70260a(String str) {
        int i;
        String str2;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replaceAll = str.replaceAll("^\\[", "").replaceAll("\\]$", "");
        if (apgs.m70251a(replaceAll) != null) {
            byte[] a = apgs.m70251a(replaceAll);
            if (a != null) {
                InetAddress a2 = apgs.m70250a(a);
                if (a2 instanceof Inet4Address) {
                    str2 = a2.getHostAddress();
                } else {
                    byte[] address = a2.getAddress();
                    int[] iArr = new int[8];
                    for (int i2 = 0; i2 < 8; i2++) {
                        int i3 = i2 + i2;
                        iArr[i2] = (address[i3 + 1] & 255) | ((address[i3] & 255) << 8);
                    }
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = -1;
                    for (int i7 = 0; i7 < 9; i7++) {
                        if (i7 >= 8 || iArr[i7] != 0) {
                            if (i6 >= 0) {
                                int i8 = i7 - i6;
                                int i9 = i8 > i4 ? i8 : i4;
                                if (i8 > i4) {
                                    i5 = i6;
                                }
                                i4 = i9;
                                i6 = -1;
                            }
                        } else if (i6 < 0) {
                            i6 = i7;
                        }
                    }
                    if (i4 >= 2) {
                        Arrays.fill(iArr, i5, i4 + i5, -1);
                    }
                    StringBuilder sb = new StringBuilder(39);
                    int i10 = 0;
                    boolean z2 = false;
                    while (i10 < 8) {
                        if (iArr[i10] >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (z2) {
                                sb.append(':');
                            }
                            sb.append(Integer.toHexString(iArr[i10]));
                        } else if (i10 == 0 || z2) {
                            sb.append("::");
                        }
                        i10++;
                        z2 = z;
                    }
                    str2 = sb.toString();
                }
                if (!str2.contains(":")) {
                    return str2;
                }
                return String.format("[%s]", str2);
            }
            throw new IllegalArgumentException(String.format(Locale.ROOT, "'%s' is not an IP string literal.", replaceAll));
        } else if (TextUtils.isDigitsOnly(str)) {
            String b = m70262b(str);
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
            return null;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            String[] split = replaceAll.split("\\.");
            try {
                for (String str3 : split) {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append(".");
                    }
                    if (!str3.toLowerCase(Locale.getDefault()).startsWith("0x")) {
                        if (!str3.startsWith("0")) {
                            i = Integer.parseInt(str3);
                        } else {
                            i = str3.length() > 1 ? Integer.parseInt(str3, 8) : 0;
                        }
                    } else if (str3.length() <= 2) {
                        return null;
                    } else {
                        i = Integer.parseInt(str3.substring(2), 16);
                    }
                    stringBuffer.append(i);
                }
                return stringBuffer.toString();
            } catch (NumberFormatException e) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private static boolean m70261a(char c) {
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f');
    }

    /* renamed from: b */
    private static String m70262b(String str) {
        byte[] bArr;
        if (!TextUtils.isEmpty(str)) {
            try {
                BigInteger bigInteger = new BigInteger(str);
                byte[] byteArray = bigInteger.toByteArray();
                int length = byteArray.length;
                if (length < 4) {
                    return null;
                }
                byte[] copyOfRange = Arrays.copyOfRange(byteArray, length - 4, length);
                if (bigInteger.equals(new BigInteger(new byte[]{0, copyOfRange[0], copyOfRange[1], copyOfRange[2], copyOfRange[3]}))) {
                    return Inet4Address.getByAddress(copyOfRange).getHostAddress();
                }
                if (length >= 16) {
                    bArr = Arrays.copyOfRange(byteArray, length - 16, length);
                } else {
                    byte[] bArr2 = new byte[16];
                    int i = 16 - length;
                    int i2 = 1;
                    int i3 = 0;
                    while (i2 <= i) {
                        bArr2[i3] = 0;
                        i2++;
                        i3++;
                    }
                    int i4 = 0;
                    while (i4 < byteArray.length) {
                        bArr2[i3] = byteArray[i4];
                        i4++;
                        i3++;
                    }
                    bArr = bArr2;
                }
                return String.format("[%s]", Inet6Address.getByAddress(bArr).getHostAddress());
            } catch (NumberFormatException e) {
            } catch (ArrayIndexOutOfBoundsException e2) {
                return null;
            } catch (UnknownHostException e3) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    private final String m70263c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(47);
        String replaceAll = (indexOf == -1 ? "/" : str.substring(indexOf)).replaceAll("/\\./", "/").replaceAll("/\\.$", "/");
        if (replaceAll.contains("..")) {
            try {
                replaceAll = new URI(this.f84359c, "host", replaceAll, null).normalize().getRawPath();
            } catch (URISyntaxException e) {
            }
        }
        return replaceAll.replaceAll("/+", "/");
    }

    /* renamed from: d */
    private static String m70264d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                StringBuilder sb = new StringBuilder();
                for (byte b : bytes) {
                    byte b2 = b & 255;
                    if (b2 > 32 && b2 <= 126 && b2 != 35 && b2 != 37) {
                        sb.append((char) b2);
                    } else {
                        sb.append("%");
                        sb.append(f84357a[b2 >>> 4]);
                        sb.append(f84357a[b2 & 15]);
                    }
                }
                return sb.toString();
            } catch (UnsupportedEncodingException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final List mo47199a() {
        ArrayList arrayList;
        MessageDigest messageDigest;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        if (!TextUtils.isEmpty(this.f84358b)) {
            String a = m70260a(this.f84360d);
            if (a != null) {
                arrayList2 = new ArrayList();
                arrayList2.add(a);
            } else if (!TextUtils.isEmpty(this.f84360d)) {
                arrayList2 = new ArrayList();
                char[] charArray = this.f84360d.toCharArray();
                boolean z = false;
                for (int length = charArray.length - 2; length > 0 && arrayList2.size() < 4; length--) {
                    if (charArray[length] == '.') {
                        if (z) {
                            arrayList2.add(this.f84360d.substring(length + 1));
                        } else {
                            z = true;
                        }
                    }
                }
                arrayList2.add(this.f84360d);
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(this.f84362f)) {
                    arrayList3 = new ArrayList();
                    char[] charArray2 = this.f84362f.toCharArray();
                    for (int i2 = 0; i2 < charArray2.length && arrayList3.size() < 4; i2++) {
                        if (charArray2[i2] == '/') {
                            arrayList3.add(this.f84362f.substring(0, i2 + 1));
                        }
                    }
                    if (!arrayList3.isEmpty() && !((String) arrayList3.get(arrayList3.size() - 1)).equals(this.f84362f)) {
                        arrayList3.add(this.f84362f);
                    }
                    if (!TextUtils.isEmpty(this.f84363g)) {
                        String str = this.f84362f;
                        String str2 = this.f84363g;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                        sb.append(str);
                        sb.append('?');
                        sb.append(str2);
                        arrayList3.add(sb.toString());
                    }
                } else {
                    arrayList3 = null;
                }
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    arrayList = new ArrayList();
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        String str3 = (String) arrayList2.get(i3);
                        int size2 = arrayList3.size();
                        int i4 = 0;
                        while (true) {
                            i = i3 + 1;
                            if (i4 >= size2) {
                                break;
                            }
                            String valueOf = String.valueOf(str3);
                            String valueOf2 = String.valueOf((String) arrayList3.get(i4));
                            arrayList.add(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
                            i4++;
                        }
                        i3 = i;
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
                messageDigest = null;
            }
            if (messageDigest != null) {
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    String str4 = (String) arrayList.get(i5);
                    if (!TextUtils.isEmpty(str4)) {
                        try {
                            arrayList4.add(new apgr(messageDigest.digest(str4.getBytes("UTF-8"))));
                        } catch (UnsupportedEncodingException e2) {
                        }
                        messageDigest.reset();
                    }
                }
                if (!arrayList4.isEmpty()) {
                    return arrayList4;
                }
            }
        }
        return null;
    }
}
