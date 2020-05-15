package p000;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: flc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class flc implements Callable {

    /* renamed from: a */
    final /* synthetic */ fle f16846a;

    public flc(fle fle) {
        this.f16846a = fle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083 A[SYNTHETIC, Splitter:B:40:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b A[SYNTHETIC, Splitter:B:45:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0098 A[SYNTHETIC, Splitter:B:53:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a8 A[RETURN] */
    public final /* bridge */ /* synthetic */ Object call() {
        FileInputStream fileInputStream;
        fle fle = this.f16846a;
        Context context = fle.mo10944i().f16707b;
        sdo.m34973b("ClientId should be loaded from worker thread");
        Object obj = null;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        FileInputStream fileInputStream2 = null;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        try {
            fileInputStream = context.openFileInput("gaClientId");
            try {
                byte[] bArr = new byte[36];
                int read = fileInputStream.read(bArr, 0, 36);
                if (fileInputStream.available() > 0) {
                    fle.mo10940f("clientId file seems corrupted, deleting it.");
                    fileInputStream.close();
                    context.deleteFile("gaClientId");
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            e = e;
                        }
                    }
                } else if (read >= 14) {
                    fileInputStream.close();
                    Object str = new String(bArr, 0, read);
                    fle.mo10926a("Read client id from disk", str);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            fle.mo10938e("Failed to close client id reading stream", e2);
                        }
                    }
                    obj = str;
                } else {
                    fle.mo10940f("clientId file is empty, deleting it.");
                    fileInputStream.close();
                    context.deleteFile("gaClientId");
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e = e3;
                        }
                    }
                }
            } catch (FileNotFoundException e4) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (obj != null) {
                }
            } catch (IOException e5) {
                e = e5;
                try {
                    fle.mo10938e("Error reading client id file, deleting it", e);
                    context.deleteFile("gaClientId");
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (obj != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e6) {
                            fle.mo10938e("Failed to close client id reading stream", e6);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                }
                throw th;
            }
        } catch (FileNotFoundException e7) {
            fileInputStream = null;
            if (fileInputStream != null) {
            }
            if (obj != null) {
            }
        } catch (IOException e8) {
            e = e8;
            fileInputStream = null;
            fle.mo10938e("Error reading client id file, deleting it", e);
            context.deleteFile("gaClientId");
            if (fileInputStream != null) {
            }
            if (obj != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream2 != null) {
            }
            throw th;
        }
        return obj != null ? fle.mo11001c() : obj;
        fle.mo10938e("Failed to close client id reading stream", e);
        if (obj != null) {
        }
    }
}
