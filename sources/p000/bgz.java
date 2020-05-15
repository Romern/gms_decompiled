package p000;

import java.util.ArrayList;

/* renamed from: bgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgz {
    /* renamed from: a */
    public static String m3018a(String str) {
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
    public static byte[] m3019a() {
        return "10".getBytes();
    }

    /* renamed from: a */
    public static byte[] m3020a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        sb.append(m3018a(String.valueOf(length)));
        for (Object obj : objArr) {
            String str = (String) obj;
            if (str == null || str.length() == 0 || str.charAt(0) == '0') {
                sb.append("110");
            } else {
                char charAt = str.charAt(0);
                if (charAt == '1' || charAt == '2') {
                    sb.append(m3018a(str));
                } else {
                    throw new IllegalArgumentException("Not correct format");
                }
            }
        }
        sb.append("10");
        return sb.toString().getBytes();
    }

    /* renamed from: a */
    public static Object[] m3021a(byte[] bArr) {
        String str;
        String str2;
        char[] charArray = new String(bArr).toCharArray();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = charArray.length;
            if (i >= length) {
                break;
            }
            if (Character.isDigit(charArray[i])) {
                int numericValue = Character.getNumericValue(charArray[i]);
                String str3 = "";
                if (length < numericValue) {
                    str2 = str3;
                } else {
                    str2 = str3;
                    for (int i2 = 0; i2 < numericValue; i2++) {
                        String valueOf = String.valueOf(str2);
                        i++;
                        char c = charArray[i];
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
                        sb.append(valueOf);
                        sb.append(c);
                        str2 = sb.toString();
                    }
                }
                int parseInt = Integer.parseInt(str2);
                if (charArray.length >= parseInt) {
                    for (int i3 = 0; i3 < parseInt; i3++) {
                        String valueOf2 = String.valueOf(str3);
                        i++;
                        char c2 = charArray[i];
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1);
                        sb2.append(valueOf2);
                        sb2.append(c2);
                        str3 = sb2.toString();
                    }
                }
                arrayList.add(str3);
            }
            i++;
        }
        arrayList.remove(arrayList.size() - 1);
        if (Integer.parseInt((String) arrayList.remove(0)) != arrayList.size()) {
            return null;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            String str4 = (String) arrayList.get(i4);
            if (str4 != null) {
                if (str4.charAt(0) == '2') {
                    StringBuilder sb3 = new StringBuilder();
                    for (int i5 = 1; i5 < str4.length(); i5 += 2) {
                        StringBuilder sb4 = new StringBuilder(2);
                        sb4.append(str4.charAt(i5));
                        sb4.append(str4.charAt(i5 + 1));
                        sb3.append((char) Integer.parseInt(sb4.toString(), 16));
                    }
                    str = sb3.toString();
                } else {
                    str = str4.substring(1);
                }
                arrayList.set(i4, str);
                i4++;
            } else {
                String valueOf3 = String.valueOf((Object) null);
                throw new IllegalArgumentException(valueOf3.length() == 0 ? new String("Empty Or Null Input: ") : "Empty Or Null Input: ".concat(valueOf3));
            }
        }
        return arrayList.toArray();
    }
}
