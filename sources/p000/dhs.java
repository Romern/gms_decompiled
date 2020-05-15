package p000;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: dhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dhs extends dhr {

    /* renamed from: a */
    public final String f13182a;

    /* renamed from: b */
    public final String f13183b;

    public dhs(String str, String str2) {
        this.f13182a = str;
        this.f13183b = str2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0027=Splitter:B:11:0x0027, B:62:0x009f=Splitter:B:62:0x009f} */
    /* renamed from: a */
    public static dhs m8523a(String str) {
        String str2;
        String str3;
        BufferedReader bufferedReader;
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                ZipEntry entry = zipFile.getEntry("assets/module.yaml");
                if (entry == null) {
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() == 0) {
                        new String("assets/module.yaml not present in ");
                    } else {
                        "assets/module.yaml not present in ".concat(valueOf);
                    }
                    zipFile.close();
                    return null;
                }
                InputStream inputStream = zipFile.getInputStream(entry);
                if (inputStream != null) {
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader);
                            Pattern compile = Pattern.compile("^\\s*(.+?): \"(.*?)\"$");
                            str3 = null;
                            str2 = null;
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                Matcher matcher = compile.matcher(readLine);
                                if (matcher.matches()) {
                                    String group = matcher.group(1);
                                    String group2 = matcher.group(2);
                                    if ("module_name".equals(group)) {
                                        str2 = group2;
                                    } else if ("module_version".equals(group)) {
                                        str3 = group2;
                                    }
                                }
                            }
                            bufferedReader.close();
                            inputStreamReader.close();
                        } catch (Throwable th) {
                            inputStreamReader.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        inputStream.close();
                        throw th2;
                    }
                } else {
                    str3 = null;
                    str2 = null;
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                zipFile.close();
                if (str2 != null && str3 != null) {
                    return new dhs(str2, str3);
                }
                String valueOf2 = String.valueOf(str);
                Log.w("ChimeraModuleApk", valueOf2.length() == 0 ? new String("Failed parsing module.yaml from apk ") : "Failed parsing module.yaml from apk ".concat(valueOf2));
                return null;
                throw th;
            } catch (Throwable th3) {
                zipFile.close();
                throw th3;
            }
        } catch (IOException e) {
            String valueOf3 = String.valueOf(str);
            Log.e("ChimeraModuleApk", valueOf3.length() == 0 ? new String("Failed parsing module.yaml from apk ") : "Failed parsing module.yaml from apk ".concat(valueOf3), e);
            return null;
        } catch (Throwable th4) {
            bqye.m113761a(th3, th4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo8997a() {
        return this.f13182a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo8998b() {
        return this.f13183b;
    }
}
