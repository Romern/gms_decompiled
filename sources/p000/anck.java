package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: anck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anck {

    /* renamed from: c */
    private static anck f76627c;

    /* renamed from: a */
    private final Context f76628a;

    /* renamed from: b */
    private final String f76629b;

    public anck(Context context, String str) {
        this.f76628a = context.getApplicationContext();
        this.f76629b = str;
    }

    /* renamed from: a */
    public static synchronized anck m63990a(Context context) {
        anck anck;
        synchronized (anck.class) {
            if (f76627c == null) {
                f76627c = new anck(context, "images/people-cover-photos");
            }
            anck = f76627c;
        }
        return anck;
    }

    /* renamed from: b */
    private final File m63992b(String str, String str2, String str3) {
        File c = m63994c(str, str2, str3);
        if (c.listFiles() == null || c.listFiles().length <= 0) {
            return null;
        }
        return c.listFiles()[0];
    }

    /* renamed from: c */
    private final File m63994c(String str, String str2, String str3) {
        String b = m63993b(str, str2);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(str3).length());
        sb.append(b);
        sb.append("/");
        sb.append(str3);
        return new File(sb.toString());
    }

    /* renamed from: a */
    private static final String m63991a(String str) {
        String replace = str.replace(":", "");
        sdo.m34977c(replace);
        return replace;
    }

    /* renamed from: b */
    private final String m63993b(String str, String str2) {
        String str3;
        String c = m63995c();
        if (!TextUtils.isEmpty(str2)) {
            String valueOf = String.valueOf(str2);
            str3 = valueOf.length() == 0 ? new String("~") : "~".concat(valueOf);
        } else {
            str3 = "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append(c);
        sb.append(str);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: c */
    private final String m63995c() {
        String valueOf = String.valueOf(this.f76628a.getFilesDir());
        String str = this.f76629b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + str.length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return null;
     */
    /* renamed from: a */
    public final synchronized anci mo41698a(String str, String str2, String str3) {
        sdo.m34977c(str);
        sdo.m34977c(str3);
        File b = m63992b(str, str2, m63991a(str3));
        if (b != null && b.exists()) {
            try {
                return anci.m63989a(b);
            } catch (IOException e) {
                Log.w("PeopleCoverPhotoFileUtils", "Couldn't load cover photo", e);
                return null;
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo41703b() {
        String valueOf = String.valueOf(this.f76628a.getFilesDir());
        String str = this.f76629b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + str.length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(str);
        srj.m36120a(new File(sb.toString()));
        aluj.m61904b(this.f76628a, "PeopleCoverPhotoFileUtils", "Cover photo size changed.  Wiped cache.");
    }

    /* renamed from: a */
    public final synchronized List mo41699a() {
        File file = new File(m63995c());
        if (!file.exists()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] list = file.list();
        for (String str : list) {
            int indexOf = str.indexOf("~");
            if (indexOf != -1) {
                arrayList.add(new ancj(str.substring(0, indexOf), str.substring(indexOf + 1)));
            } else {
                arrayList.add(new ancj(str, null));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo41700a(String str, String str2, String str3, byte[] bArr, int i) {
        FileOutputStream fileOutputStream;
        sdo.m34977c(str);
        sdo.m34977c(str3);
        sdo.m34974b(true);
        String a = m63991a(str3);
        boolean a2 = mo41701a(str, str2);
        String path = m63994c(str, str2, a).getPath();
        String valueOf = String.valueOf(i);
        StringBuilder sb = new StringBuilder(String.valueOf(path).length() + 1 + String.valueOf(valueOf).length());
        sb.append(path);
        sb.append("/");
        sb.append(valueOf);
        File file = new File(sb.toString());
        if (file.getParentFile().mkdirs()) {
            try {
                fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                Log.w("PeopleCoverPhotoFileUtils", "Couldn't update cover photo", e);
            } catch (IOException e2) {
                throw new RuntimeException("Couldn't update cover photo", e2);
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } else {
            throw new RuntimeException(String.format("Could not create a directory in dir=%s . Delete succeeded=%b, parent directory already exists=%b.", file.getAbsolutePath(), Boolean.valueOf(a2), Boolean.valueOf(file.getParentFile().exists())));
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo41701a(String str, String str2) {
        sdo.m34977c(str);
        return srj.m36120a(new File(m63993b(str, str2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo41702a(String str, String str2, String str3, int i) {
        File b;
        sdo.m34977c(str);
        sdo.m34977c(str3);
        String a = m63991a(str3);
        if (m63994c(str, str2, a).exists() && (b = m63992b(str, str2, a)) != null && b.exists()) {
            if (Integer.valueOf(b.getName()).intValue() >= i) {
                return true;
            }
            return false;
        }
    }
}
