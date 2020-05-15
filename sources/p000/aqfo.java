package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* renamed from: aqfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aqfo {
    INSTANCE;
    

    /* renamed from: b */
    private final File f85983b = new File("/sys/fs/selinux/enforce");

    private aqfo(String str) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC, Splitter:B:19:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b A[SYNTHETIC, Splitter:B:26:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007b  */
    /* renamed from: a */
    static aqfn m71503a() {
        File file;
        String str;
        byte[] b;
        InputStreamReader inputStreamReader;
        aqfn aqfn = new aqfn();
        aqfn.f85977a = INSTANCE.mo47831b();
        aqfo aqfo = INSTANCE;
        boolean z = true;
        z = true;
        byte[] bArr = null;
        InputStreamReader inputStreamReader2 = null;
        if (aqfo.mo47831b()) {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(aqfo.f85983b));
                try {
                    if (((char) inputStreamReader.read()) == '1') {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e) {
                        }
                        aqfn.f85978b = z;
                        file = new File("/selinux_version");
                        if (file.exists() || (b = aqfy.m71564b(file)) == null) {
                            str = null;
                        } else {
                            try {
                                str = new String(b, "UTF-8");
                            } catch (UnsupportedEncodingException e2) {
                                str = null;
                            }
                        }
                        aqfn.f85979c = str;
                        if (aqfy.m71555a()) {
                            File file2 = new File("/sepolicy");
                            if (file2.exists()) {
                                bArr = aqfy.m71560a(file2);
                            }
                            aqfn.f85980d = bArr;
                        }
                        return aqfn;
                    }
                    try {
                        inputStreamReader.close();
                    } catch (IOException e3) {
                    }
                } catch (IOException e4) {
                    if (inputStreamReader != null) {
                    }
                    z = false;
                    aqfn.f85978b = z;
                    file = new File("/selinux_version");
                    if (file.exists()) {
                    }
                    str = null;
                    aqfn.f85979c = str;
                    if (aqfy.m71555a()) {
                    }
                    return aqfn;
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader2 = inputStreamReader;
                    if (inputStreamReader2 != null) {
                    }
                    throw th;
                }
            } catch (IOException e5) {
                inputStreamReader = null;
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                    z = false;
                    aqfn.f85978b = z;
                    file = new File("/selinux_version");
                    if (file.exists()) {
                    }
                    str = null;
                    aqfn.f85979c = str;
                    if (aqfy.m71555a()) {
                    }
                    return aqfn;
                }
                z = false;
                aqfn.f85978b = z;
                file = new File("/selinux_version");
                if (file.exists()) {
                }
                str = null;
                aqfn.f85979c = str;
                if (aqfy.m71555a()) {
                }
                return aqfn;
            } catch (Throwable th2) {
                th = th2;
                if (inputStreamReader2 != null) {
                    try {
                        inputStreamReader2.close();
                    } catch (IOException e6) {
                    }
                }
                throw th;
            }
        }
        z = false;
        aqfn.f85978b = z;
        file = new File("/selinux_version");
        if (file.exists()) {
        }
        str = null;
        aqfn.f85979c = str;
        if (aqfy.m71555a()) {
        }
        return aqfn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo47831b() {
        return this.f85983b.exists();
    }
}
