package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: anbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anbt {

    /* renamed from: a */
    public static anbt f76594a;

    /* renamed from: b */
    private static final int[] f76595b = {0, 1, 2, 3, 4};

    /* renamed from: c */
    private final Context f76596c;

    /* renamed from: d */
    private final String f76597d;

    public anbt(Context context, String str) {
        this.f76596c = context.getApplicationContext();
        this.f76597d = str;
    }

    /* renamed from: a */
    public static synchronized anbt m63940a(Context context) {
        anbt anbt;
        synchronized (anbt.class) {
            if (f76594a == null) {
                f76594a = new anbt(context, "images/people");
            }
            anbt = f76594a;
        }
        return anbt;
    }

    /* renamed from: b */
    private final File m63943b(String str, String str2, String str3) {
        String b = m63945b(str, str2);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(str3).length());
        sb.append(b);
        sb.append("/");
        sb.append(str3);
        return new File(sb.toString());
    }

    /* renamed from: a */
    private static final String m63941a(String str) {
        String replace = str.replace(":", "");
        sdo.m34977c(replace);
        return replace;
    }

    /* renamed from: b */
    private final String m63944b() {
        String valueOf = String.valueOf(this.f76596c.getFilesDir());
        String str = this.f76597d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + str.length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m63942a(String str, boolean z, Context context) {
        rzg rzg = new rzg();
        rzg.mo25264a(ancc.m63967a(context, 3));
        rzg.mo25263a();
        rzg.f43886a = z;
        return rzg.mo25262a(str);
    }

    /* renamed from: b */
    private final String m63945b(String str, String str2) {
        String str3;
        String b = m63944b();
        if (!TextUtils.isEmpty(str2)) {
            String valueOf = String.valueOf(str2);
            str3 = valueOf.length() == 0 ? new String("~") : "~".concat(valueOf);
        } else {
            str3 = "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append(b);
        sb.append(str);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055 A[DONT_GENERATE] */
    /* renamed from: a */
    public final synchronized anci mo41667a(String str, String str2, String str3, int i) {
        sdo.m34977c(str);
        allt.m61239a(i, "avatarSize");
        sdo.m34977c(str3);
        File file = new File(m63943b(str, str2, m63941a(str3)), String.valueOf(i));
        if (!file.exists()) {
            File file2 = new File(m63945b(str, str2));
            if (file2.exists()) {
                File[] listFiles = file2.listFiles();
                int length = listFiles.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    File file3 = new File(listFiles[i2], String.valueOf(i));
                    if (file3.exists()) {
                        file = file3;
                        break;
                    }
                    i2++;
                }
                if (file == null) {
                    return null;
                }
            }
            file = null;
            if (file == null) {
            }
        }
        try {
            return anci.m63989a(file);
        } catch (IOException e) {
            Log.w("PeopleAvatarFileServer", "Couldn't load avatar", e);
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized List mo41668a() {
        File file = new File(m63944b());
        if (!file.exists()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] list = file.list();
        for (String str : list) {
            int indexOf = str.indexOf("~");
            if (indexOf != -1) {
                arrayList.add(new anbs(str.substring(0, indexOf), str.substring(indexOf + 1)));
            } else {
                arrayList.add(new anbs(str, null));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo41669a(String str, String str2) {
        sdo.m34977c(str);
        srj.m36120a(new File(m63945b(str, str2)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anbt.a(java.lang.String, boolean, android.content.Context):java.lang.String
     arg types: [java.lang.String, int, android.content.Context]
     candidates:
      anbt.a(java.lang.String, java.lang.String, java.lang.String):boolean
      anbt.a(java.lang.String, boolean, android.content.Context):java.lang.String */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010a A[Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011a A[SYNTHETIC, Splitter:B:63:0x011a] */
    /* renamed from: a */
    public final synchronized void mo41670a(String str, String str2, String str3, byte[] bArr) {
        sdo.m34977c(str);
        sdo.m34977c(str3);
        int i = 0;
        sdo.m34974b(bArr != null);
        String a = m63941a(str3);
        mo41669a(str, str2);
        File b = m63943b(str, str2, a);
        if (!b.mkdirs()) {
            String valueOf = String.valueOf(b.getAbsolutePath());
            throw new RuntimeException(valueOf.length() == 0 ? new String("Could not create a directory in dir=") : "Could not create a directory in dir=".concat(valueOf));
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            byte[] bytes = m63942a(ancc.m63973b(a), false, this.f76596c).getBytes(Charset.forName("US-ASCII"));
            File file = new File(m63943b(str, str2, m63941a(a)), "metadata.txt");
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bytes);
                    fileOutputStream2.close();
                    file.getAbsolutePath();
                    int[] iArr = f76595b;
                    int length = iArr.length;
                    while (i < length) {
                        int i2 = iArr[i];
                        File file2 = new File(b, String.valueOf(i2));
                        int a2 = ancc.m63967a(this.f76596c, i2);
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a2, a2, true);
                        String str4 = options.outMimeType;
                        try {
                            File file3 = new File(this.f76596c.getFilesDir(), this.f76597d);
                            if (!file3.exists() && !file3.mkdirs()) {
                                String valueOf2 = String.valueOf(file3.getAbsolutePath());
                                throw new RuntimeException(valueOf2.length() == 0 ? new String("Could not create an avatar directory in dir=") : "Could not create an avatar directory in dir=".concat(valueOf2));
                            }
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file2);
                            try {
                                if (!"image/jpeg".equals(str4)) {
                                    createScaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream3);
                                } else {
                                    createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, (int) cgbe.m144181j(), fileOutputStream3);
                                }
                                fileOutputStream3.close();
                                file2.getAbsolutePath();
                                if (createScaledBitmap != decodeByteArray) {
                                    createScaledBitmap.recycle();
                                }
                                i++;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream3;
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileOutputStream != null) {
                            }
                            throw th;
                        }
                    }
                    decodeByteArray.recycle();
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                if (fileOutputStream != null) {
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            Log.w("PeopleAvatarFileServer", "Couldn't update avatar", e);
        } catch (IOException e2) {
            throw new RuntimeException("Couldn't update avatar", e2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anbt.a(java.lang.String, boolean, android.content.Context):java.lang.String
     arg types: [java.lang.String, int, android.content.Context]
     candidates:
      anbt.a(java.lang.String, java.lang.String, java.lang.String):boolean
      anbt.a(java.lang.String, boolean, android.content.Context):java.lang.String */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo41671a(String str, String str2, String str3) {
        sdo.m34977c(str);
        sdo.m34977c(str3);
        String a = m63941a(str3);
        File b = m63943b(str, str2, a);
        if (b.exists() && b.list().length == f76595b.length + 1) {
            File file = new File(m63943b(str, str2, a), "metadata.txt");
            String str4 = "";
            if (file.exists()) {
                try {
                    str4 = new String(srz.m36174a(file), Charset.forName("US-ASCII"));
                } catch (IOException e) {
                    Log.w("PeopleAvatarFileServer", "Couldn't read metadata file", e);
                }
            }
            if (str4.equals(m63942a(ancc.m63973b(a), false, this.f76596c))) {
                return true;
            }
        }
    }
}
