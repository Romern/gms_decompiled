package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: ncp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ncp {

    /* renamed from: a */
    private final mze f35293a;

    /* renamed from: a */
    public final void mo20455a(File file) {
        BufferedOutputStream bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT];
            int a = this.f35293a.mo20345a(bArr);
            while (a != -1) {
                bufferedOutputStream.write(bArr, 0, a);
                a = this.f35293a.mo20345a(bArr);
            }
            bufferedOutputStream.flush();
            this.f35293a.mo20346a(2);
            bufferedOutputStream.close();
            return;
        } catch (mbb | mbh e) {
            this.f35293a.mo20346a(4);
            throw e;
        } catch (IOException | mbf e2) {
            this.f35293a.mo20346a(3);
            throw e2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public ncp(mze mze) {
        sdo.m34975b(true, "Buffer must have positive size");
        this.f35293a = mze;
    }
}
