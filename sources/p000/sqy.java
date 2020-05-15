package p000;

import java.io.BufferedReader;
import java.util.List;

@Deprecated
/* renamed from: sqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqy {
    /* renamed from: a */
    public static void m36056a(String str, Appendable appendable) {
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            char charAt2 = str.charAt(length - 1);
            if (charAt != ' ' && charAt != 9 && charAt2 != ' ' && charAt2 != 9 && str.indexOf(34) < 0 && str.indexOf(44) < 0 && str.indexOf(13) < 0 && str.indexOf(10) < 0) {
                appendable.append(str);
            } else {
                appendable.append('\"').append(str.replace("\"", "\"\"")).append('\"');
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* renamed from: a */
    public static boolean m36057a(BufferedReader bufferedReader, List list) {
        int indexOf;
        int i;
        int indexOf2;
        String readLine = bufferedReader.readLine();
        int i2 = 0;
        if (readLine == null) {
            return false;
        }
        do {
            StringBuilder sb = new StringBuilder();
            while (true) {
                indexOf = readLine.indexOf(44, i2);
                int indexOf3 = readLine.indexOf(34, i2);
                if (indexOf3 != -1 && (indexOf == -1 || indexOf >= indexOf3)) {
                    if (i2 > 0 && readLine.charAt(i2 - 1) == '\"') {
                        sb.append('\"');
                    }
                    sb.append((CharSequence) readLine, i2, indexOf3);
                    while (true) {
                        i = indexOf3 + 1;
                        indexOf2 = readLine.indexOf(34, i);
                        if (indexOf2 != -1) {
                            break;
                        }
                        sb.append((CharSequence) readLine, i, readLine.length());
                        sb.append(10);
                        readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            indexOf3 = -1;
                        } else {
                            list.add(sb.toString());
                            return true;
                        }
                    }
                }
                sb.append((CharSequence) readLine, i, indexOf2);
                i2 = indexOf2 + 1;
            }
            sb.append((CharSequence) readLine, i2, indexOf != -1 ? readLine.length() : indexOf);
            list.add(sb.toString());
            i2 = indexOf + 1;
        } while (i2 > 0);
        return true;
    }
}
