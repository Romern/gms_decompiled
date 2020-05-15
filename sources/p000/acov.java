package p000;

import android.database.Cursor;
import java.nio.charset.Charset;

/* renamed from: acov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acov {
    /* renamed from: a */
    public static long m49640a(Cursor cursor) {
        long j;
        long j2 = 0;
        if (acnv.m49545a()) {
            Charset forName = Charset.forName("UTF-8");
            for (int i = 0; i < cursor.getColumnCount(); i++) {
                int type = cursor.getType(i);
                if (type == 0 || type == 1 || type == 2) {
                    j = 4;
                } else if (type != 3) {
                    if (type == 4) {
                        j2 += (long) cursor.getBlob(i).length;
                    }
                } else {
                    j = (long) cursor.getString(i).getBytes(forName).length;
                }
                j2 += j;
            }
        }
        return j2;
    }

    /* renamed from: a */
    public static String m49641a(long j) {
        int i = 0;
        while (j >= 1024 && i < 3) {
            j /= 1024;
            i++;
        }
        String valueOf = String.valueOf(j);
        String valueOf2 = String.valueOf(i > 0 ? Character.valueOf("KMG".charAt(i - 1)) : "");
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(valueOf2);
        sb.append("B");
        return sb.toString();
    }
}
