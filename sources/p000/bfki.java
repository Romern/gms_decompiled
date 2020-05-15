package p000;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: bfki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfki {

    /* renamed from: g */
    public bgmm f114294g;

    /* renamed from: h */
    public bfmf f114295h;

    /* renamed from: i */
    public volatile boolean f114296i;

    /* renamed from: j */
    public int f114297j;

    /* renamed from: k */
    public File f114298k;

    /* renamed from: l */
    protected File[] f114299l;

    /* renamed from: a */
    public final void mo61834a(bgmm bgmm, bfmf bfmf, String str) {
        if (str.isEmpty() || !str.equals(str.replaceAll("[^A-Za-z0-9]", ""))) {
            throw new IllegalArgumentException("The cache directory name must be non-empty and only alpha numeric.");
        }
        this.f114296i = false;
        this.f114294g = bgmm;
        File b = bgmm.mo62782b();
        if (b != null) {
            this.f114294g.mo62786f().execute(new bfkg(this, bfmf, b, str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61401a(byte[] bArr);

    /* renamed from: b */
    public final void mo61835b() {
        this.f114294g.mo62786f().execute(new bfkh(this));
    }

    /* renamed from: c */
    public final void mo61837c() {
        bfkt.m97152b(this.f114299l[0]);
    }

    /* renamed from: b */
    public final void mo61836b(byte[] bArr) {
        if (bfkt.m97151a(this.f114298k)) {
            File file = this.f114299l[0];
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            try {
                this.f114295h.mo61918a(dataOutputStream, bArr);
                bfkt.m97150a(fileOutputStream);
                bfkt.m97150a(dataOutputStream);
            } catch (IOException e) {
                bfkt.m97152b(file);
                throw e;
            } catch (Throwable th) {
                bfkt.m97150a(fileOutputStream);
                bfkt.m97150a(dataOutputStream);
                throw th;
            }
        } else {
            throw new IOException("Cache directory can not be validated.");
        }
    }
}
