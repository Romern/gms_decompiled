package p000;

import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: aayg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aayg extends soa {

    /* renamed from: a */
    final /* synthetic */ File f56819a;

    /* renamed from: b */
    final /* synthetic */ Pair f56820b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aayg(File file, Pair pair) {
        super(10);
        this.f56819a = file;
        this.f56820b = pair;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[Catch:{ all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[Catch:{ all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065 A[SYNTHETIC, Splitter:B:28:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085 A[SYNTHETIC, Splitter:B:39:0x0085] */
    public final void run() {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        String valueOf;
        String str;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(this.f56819a);
            try {
                fileOutputStream.write((byte[]) ((Pair) this.f56820b.second).second);
            } catch (IOException e2) {
                e = e2;
                try {
                    String valueOf2 = String.valueOf(e.getMessage());
                    Log.e("gH_SharedFbUtils", valueOf2.length() != 0 ? new String("IOException ") : "IOException ".concat(valueOf2));
                    if (fileOutputStream == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                }
                throw th;
            }
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
                valueOf = String.valueOf(e3.getMessage());
                if (valueOf.length() == 0) {
                    str = new String("IOException ");
                    Log.e("gH_SharedFbUtils", str);
                }
                str = "IOException ".concat(valueOf);
                Log.e("gH_SharedFbUtils", str);
            }
        } catch (IOException e4) {
            fileOutputStream = null;
            e = e4;
            String valueOf22 = String.valueOf(e.getMessage());
            Log.e("gH_SharedFbUtils", valueOf22.length() != 0 ? new String("IOException ") : "IOException ".concat(valueOf22));
            if (fileOutputStream == null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                    valueOf = String.valueOf(e5.getMessage());
                    if (valueOf.length() == 0) {
                        str = new String("IOException ");
                        Log.e("gH_SharedFbUtils", str);
                    }
                    str = "IOException ".concat(valueOf);
                    Log.e("gH_SharedFbUtils", str);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e6) {
                    String valueOf3 = String.valueOf(e6.getMessage());
                    Log.e("gH_SharedFbUtils", valueOf3.length() == 0 ? new String("IOException ") : "IOException ".concat(valueOf3));
                }
            }
            throw th;
        }
    }
}
