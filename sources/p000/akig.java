package p000;

import android.content.Context;
import android.os.Debug;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akig extends wvd {

    /* renamed from: a */
    private final Context f72055a;

    /* renamed from: b */
    private final String[] f72056b;

    public akig(Context context, String... strArr) {
        this.f72055a = context;
        this.f72056b = strArr;
    }

    /* renamed from: a */
    private final File m59815a(String str) {
        String[] strArr;
        FileOutputStream fileOutputStream;
        File fileStreamPath = this.f72055a.getFileStreamPath(String.valueOf(str).concat(".tmp"));
        if (fileStreamPath.exists()) {
            fileStreamPath.delete();
        }
        if (str.endsWith("Service")) {
            String packageName = this.f72055a.getPackageName();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str).length());
            sb.append(packageName);
            sb.append("/");
            sb.append(str);
            strArr = new String[]{"service", sb.toString()};
        } else {
            String packageName2 = this.f72055a.getPackageName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName2).length() + 1 + String.valueOf(str).length());
            sb2.append(packageName2);
            sb2.append("/");
            sb2.append(str);
            strArr = new String[]{sb2.toString()};
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(fileStreamPath);
            try {
                if (!Debug.dumpService("activity", fileOutputStream.getFD(), strArr)) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl.mo68432a("akig", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to invoke dumpsys on %s", str);
                    srz.m36171a(fileOutputStream);
                    return null;
                }
                srn srn = ajvp.f71371a;
                srz.m36171a(fileOutputStream);
                return fileStreamPath;
            } catch (IOException | NullPointerException | SecurityException e) {
                e = e;
                try {
                    bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("akig", "a", 239, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Failed to invoke dumpsys on %s", str);
                    srz.m36171a(fileOutputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                }
            }
        } catch (IOException | NullPointerException | SecurityException e2) {
            e = e2;
            fileOutputStream = null;
            bnsl bnsl22 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl22.mo68437a(e);
            bnsl22.mo68432a("akig", "a", 239, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl22.mo68420a("Failed to invoke dumpsys on %s", str);
            srz.m36171a(fileOutputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            srz.m36171a(fileOutputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public final List mo14944a() {
        String[] strArr;
        String[] strArr2;
        FileOutputStream fileOutputStream;
        File file;
        byte[] b;
        FileOutputStream fileOutputStream2;
        akig akig = this;
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = akig.f72056b;
        int length = strArr3.length;
        char c = 0;
        int i = 0;
        while (i < length) {
            String str = strArr3[i];
            File fileStreamPath = akig.f72055a.getFileStreamPath(String.valueOf(str).concat(".tmp"));
            if (fileStreamPath.exists()) {
                fileStreamPath.delete();
            }
            if (str.endsWith("Service")) {
                strArr2 = new String[2];
                strArr2[c] = "service";
                String packageName = akig.f72055a.getPackageName();
                strArr = strArr3;
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str).length());
                sb.append(packageName);
                sb.append("/");
                sb.append(str);
                strArr2[1] = sb.toString();
            } else {
                strArr = strArr3;
                String packageName2 = akig.f72055a.getPackageName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName2).length() + 1 + String.valueOf(str).length());
                sb2.append(packageName2);
                sb2.append("/");
                sb2.append(str);
                strArr2 = new String[]{sb2.toString()};
            }
            try {
                fileOutputStream2 = new FileOutputStream(fileStreamPath);
                try {
                    if (!Debug.dumpService("activity", fileOutputStream2.getFD(), strArr2)) {
                        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl.mo68432a("akig", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Failed to invoke dumpsys on %s", str);
                        srz.m36171a(fileOutputStream2);
                        file = null;
                        if (!(file == null || (b = akif.m59811b(file)) == null)) {
                            arrayList.add(new FileTeleporter(b, "text/plain", file.getName()));
                        }
                        i++;
                        akig = this;
                        strArr3 = strArr;
                        c = 0;
                    } else {
                        srn srn = ajvp.f71371a;
                        srz.m36171a(fileOutputStream2);
                        file = fileStreamPath;
                        arrayList.add(new FileTeleporter(b, "text/plain", file.getName()));
                        i++;
                        akig = this;
                        strArr3 = strArr;
                        c = 0;
                    }
                } catch (IOException | NullPointerException | SecurityException e) {
                    e = e;
                    try {
                        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl2.mo68437a(e);
                        bnsl2.mo68432a("akig", "a", 239, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("Failed to invoke dumpsys on %s", str);
                        srz.m36171a(fileOutputStream2);
                        file = null;
                        arrayList.add(new FileTeleporter(b, "text/plain", file.getName()));
                        i++;
                        akig = this;
                        strArr3 = strArr;
                        c = 0;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        srz.m36171a(fileOutputStream);
                        throw th;
                    }
                }
            } catch (IOException | NullPointerException | SecurityException e2) {
                e = e2;
                fileOutputStream2 = null;
                bnsl bnsl22 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl22.mo68437a(e);
                bnsl22.mo68432a("akig", "a", 239, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl22.mo68420a("Failed to invoke dumpsys on %s", str);
                srz.m36171a(fileOutputStream2);
                file = null;
                arrayList.add(new FileTeleporter(b, "text/plain", file.getName()));
                i++;
                akig = this;
                strArr3 = strArr;
                c = 0;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                srz.m36171a(fileOutputStream);
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
