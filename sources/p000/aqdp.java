package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: aqdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aqdp {
    INSTANCE;
    

    /* renamed from: b */
    private final File f85783b = new File("/sys/fs/selinux/enforce");

    private aqdp(String str) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC, Splitter:B:23:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e A[SYNTHETIC, Splitter:B:29:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0055 A[Catch:{ IOException -> 0x0037 }] */
    /* renamed from: a */
    static aqdo m71407a() {
        aqdo aqdo = new aqdo();
        aqdo.f85779a = INSTANCE.mo47761b();
        aqdp aqdp = INSTANCE;
        boolean z = true;
        if (aqdp.mo47761b()) {
            InputStreamReader inputStreamReader = null;
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(aqdp.f85783b));
                try {
                    if (((char) inputStreamReader2.read()) == '1') {
                        try {
                            inputStreamReader2.close();
                        } catch (IOException e) {
                        }
                        aqdo.f85780b = z;
                        return aqdo;
                    }
                    try {
                        inputStreamReader2.close();
                    } catch (IOException e2) {
                    }
                } catch (FileNotFoundException e3) {
                    inputStreamReader = inputStreamReader2;
                    if (inputStreamReader != null) {
                    }
                    z = false;
                    aqdo.f85780b = z;
                    return aqdo;
                } catch (IOException e4) {
                    inputStreamReader = inputStreamReader2;
                    if (inputStreamReader != null) {
                    }
                    z = false;
                    aqdo.f85780b = z;
                    return aqdo;
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader = inputStreamReader2;
                    if (inputStreamReader != null) {
                    }
                    throw th;
                }
            } catch (FileNotFoundException e5) {
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                    z = false;
                    aqdo.f85780b = z;
                    return aqdo;
                }
                z = false;
                aqdo.f85780b = z;
                return aqdo;
            } catch (IOException e6) {
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                    z = false;
                    aqdo.f85780b = z;
                    return aqdo;
                }
                z = false;
                aqdo.f85780b = z;
                return aqdo;
            } catch (Throwable th2) {
                th = th2;
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (IOException e7) {
                    }
                }
                throw th;
            }
        }
        z = false;
        aqdo.f85780b = z;
        return aqdo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo47761b() {
        return this.f85783b.exists();
    }
}
