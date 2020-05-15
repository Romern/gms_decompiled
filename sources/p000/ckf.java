package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ckf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ckf implements ccv {

    /* renamed from: a */
    private final cgr f6978a;

    public ckf(cgr cgr) {
        this.f6978a = cgr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a A[SYNTHETIC, Splitter:B:19:0x003a] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3725a(Object obj, File file, cdk cdk) {
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) this.f6978a.mo3870a(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                } catch (IOException e) {
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                    }
                    this.f6978a.mo3874a(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException e2) {
            }
            this.f6978a.mo3874a(bArr);
            return true;
        } catch (IOException e3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                }
            }
            this.f6978a.mo3874a(bArr);
            return false;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                }
            }
            this.f6978a.mo3874a(bArr);
            throw th;
        }
    }
}
