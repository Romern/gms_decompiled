package p000;

import java.util.ArrayList;

/* renamed from: bjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjd {
    /* renamed from: a */
    public static String m3177a(String str) {
        StringBuilder sb;
        if (str == null) {
            sb = null;
        } else if (str.length() != 0) {
            str.trim();
            String valueOf = String.valueOf(str.length());
            sb = new StringBuilder(String.valueOf(valueOf.length()));
            sb.append(valueOf);
            sb.append(str);
        } else {
            sb = new StringBuilder("10");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m3178a() {
        return "10".getBytes();
    }

    /* renamed from: a */
    public static byte[] m3179a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        sb.append(m3177a(String.valueOf(length)));
        for (Object obj : objArr) {
            String str = (String) obj;
            if (str == null || str.length() == 0 || str.charAt(0) == '0') {
                sb.append("110");
            } else {
                char charAt = str.charAt(0);
                if (charAt == '1' || charAt == '2') {
                    sb.append(m3177a(str));
                } else {
                    throw new IllegalArgumentException("Not correct format");
                }
            }
        }
        sb.append("10");
        return sb.toString().getBytes();
    }

    /* renamed from: a */
    public static Object[] m3180a(byte[] bArr) {
        String str;
        String str2;
        String str3 = new String(bArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str3.length()) {
            if (Character.isDigit(str3.charAt(i))) {
                int numericValue = Character.getNumericValue(str3.charAt(i));
                String str4 = "";
                if (str3.length() >= numericValue) {
                    int i2 = i + 1;
                    str2 = str3.substring(i2, i2 + numericValue);
                    i += numericValue;
                } else {
                    str2 = str4;
                }
                int parseInt = Integer.parseInt(str2);
                if (str3.length() >= parseInt) {
                    int i3 = i + 1;
                    str4 = str3.substring(i3, i3 + parseInt);
                    i += parseInt;
                }
                arrayList.add(str4);
            }
            i++;
        }
        arrayList.remove(arrayList.size() - 1);
        if (Integer.parseInt((String) arrayList.remove(0)) != arrayList.size()) {
            return null;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            String str5 = (String) arrayList.get(i4);
            if (str5 != null) {
                if (str5.charAt(0) == '2') {
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 1; i5 < str5.length(); i5 += 2) {
                        StringBuilder sb2 = new StringBuilder(2);
                        sb2.append(str5.charAt(i5));
                        sb2.append(str5.charAt(i5 + 1));
                        sb.append((char) Integer.parseInt(sb2.toString(), 16));
                    }
                    str = sb.toString();
                } else {
                    str = str5.substring(1);
                }
                arrayList.set(i4, str);
                i4++;
            } else {
                String valueOf = String.valueOf((Object) null);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Empty Or Null Input: ") : "Empty Or Null Input: ".concat(valueOf));
            }
        }
        return arrayList.toArray();
    }
}
