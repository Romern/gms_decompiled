package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: amio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amio {
    /* renamed from: a */
    public static final Uri m62946a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            File a = m62947a(context.getCacheDir(), "avatars", str);
            if (a == null) {
                a = m62947a(context.getFilesDir(), "avatars", str);
            }
            if (a == null && "mounted".equals(Environment.getExternalStorageState())) {
                a = m62947a(Environment.getExternalStorageDirectory(), "avatars", str);
            }
            if (a != null) {
                return C1136kk.m17966a(context, "com.google.android.gms.fileprovider", a);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static File m62947a(File file, String str, String str2) {
        File file2 = new File(file, str);
        File file3 = new File(file2, str2);
        try {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (file3.exists()) {
                file3.delete();
            }
            file3.createNewFile();
            return file3;
        } catch (IOException e) {
            amdk.m62658a("People.Avatar", "Failed to create file in %s: %s", file2.getAbsolutePath(), e.getMessage());
            return null;
        }
    }
}
