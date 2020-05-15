package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: aayb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aayb extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ File f56810a;

    /* renamed from: b */
    final /* synthetic */ Bitmap f56811b;

    public aayb(File file, Bitmap bitmap) {
        this.f56810a = file;
        this.f56811b = bitmap;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[SYNTHETIC, Splitter:B:26:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086 A[SYNTHETIC, Splitter:B:36:0x0086] */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Throwable th;
        IOException e;
        FileOutputStream fileOutputStream;
        String valueOf;
        String str;
        Void[] voidArr = (Void[]) objArr;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(this.f56810a);
            try {
                this.f56811b.compress(Bitmap.CompressFormat.JPEG, (int) cdtr.m134940b(), fileOutputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    String valueOf2 = String.valueOf(e.getMessage());
                    Log.e("gH_Screenshot", valueOf2.length() != 0 ? new String("IOException ") : "IOException ".concat(valueOf2));
                    if (fileOutputStream != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e3) {
                            String valueOf3 = String.valueOf(e3.getMessage());
                            Log.e("gH_Screenshot", valueOf3.length() == 0 ? new String("IOException ") : "IOException ".concat(valueOf3));
                        }
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
            } catch (IOException e4) {
                valueOf = String.valueOf(e4.getMessage());
                if (valueOf.length() == 0) {
                    str = new String("IOException ");
                    Log.e("gH_Screenshot", str);
                    return null;
                }
                str = "IOException ".concat(valueOf);
                Log.e("gH_Screenshot", str);
                return null;
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream = null;
            String valueOf22 = String.valueOf(e.getMessage());
            Log.e("gH_Screenshot", valueOf22.length() != 0 ? new String("IOException ") : "IOException ".concat(valueOf22));
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e6) {
                    valueOf = String.valueOf(e6.getMessage());
                    if (valueOf.length() == 0) {
                        str = new String("IOException ");
                        Log.e("gH_Screenshot", str);
                        return null;
                    }
                    str = "IOException ".concat(valueOf);
                    Log.e("gH_Screenshot", str);
                    return null;
                }
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (fileOutputStream2 != null) {
            }
            throw th;
        }
        return null;
    }
}
