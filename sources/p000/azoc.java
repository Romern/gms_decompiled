package p000;

import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.util.HashSet;

/* renamed from: azoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azoc {

    /* renamed from: a */
    static final String f99786a = String.format("file://%s/%s/", Environment.getExternalStorageDirectory().getAbsolutePath(), Environment.DIRECTORY_DOWNLOADS);

    static {
        String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()).concat("/Apppreviewmessages/uploadmedia/");
        new HashSet(bngx.m109358a("android.resource", "content", "file"));
    }

    /* renamed from: a */
    public static String m85903a(String str) {
        if (str != null) {
            return str.replace(f99786a, "content://com.google.android.gms.fileprovider/download/");
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m85904a(Uri uri) {
        azox.m85982b();
        if (uri == null || !"file".equals(uri.getScheme())) {
            azoj.m85933c("fileUtil", "Invalid %s", uri);
            return false;
        }
        try {
            File file = new File(uri.getPath());
            if (!file.exists() || !file.isFile()) {
                return false;
            }
            Object[] objArr = {uri, Boolean.valueOf(file.delete())};
            return true;
        } catch (Exception e) {
            azoj.m85931a("fileUtil", e, "Failed to delete file %s", uri);
            return false;
        }
    }
}
