package p000;

import java.io.File;
import java.util.Comparator;

/* renamed from: zxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxu implements Comparator {
    /* renamed from: a */
    private static final int m46646a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            zyh.m46680a("FontDisk", "Invalid directory with version %s exists under directoryDir", str);
            return -1;
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m46646a(((File) obj2).getName()) - m46646a(((File) obj).getName());
    }
}
