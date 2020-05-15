package p000;

import android.os.Environment;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: mme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mme implements mmh {

    /* renamed from: a */
    private static final lvn f34004a = new lvn("CommonDirectoryFlavorHandler");

    /* renamed from: b */
    private final File f34005b;

    public mme(String str) {
        this.f34005b = Environment.getExternalStoragePublicDirectory(str);
    }

    /* renamed from: a */
    private final void m25325a(File file, int i, mmd mmd) {
        File[] listFiles;
        if (i < 8 && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m25325a(file2, i + 1, mmd);
                } else if (file2.isFile()) {
                    bxvd da = mpf.f34120d.mo74144da();
                    String path = mmd.f34002b.relativize(file2.toURI()).getPath();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mpf mpf = (mpf) da.f164949b;
                    path.getClass();
                    mpf.f34122a |= 1;
                    mpf.f34123b = path;
                    long lastModified = file2.lastModified();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mpf mpf2 = (mpf) da.f164949b;
                    mpf2.f34122a |= 2;
                    mpf2.f34124c = lastModified;
                    bxvd da2 = mph.f34141f.mo74144da();
                    int i2 = mmd.f34003c;
                    mmd.f34003c = i2 + 1;
                    String num = Integer.toString(i2);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    mph mph = (mph) da2.f164949b;
                    num.getClass();
                    mph.f34143a |= 1;
                    mph.f34146d = num;
                    long length = file2.length();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    mph mph2 = (mph) da2.f164949b;
                    mph2.f34143a |= 2;
                    mph2.f34147e = length;
                    mpf mpf3 = (mpf) da.mo74062i();
                    mpf3.getClass();
                    mph2.f34145c = mpf3;
                    mph2.f34144b = 100;
                    mmd.f34001a.add((mph) da2.mo74062i());
                }
            }
        }
    }

    /* renamed from: a */
    public final InputStream mo20162a(mph mph) {
        mpf mpf;
        if (mph.f34144b == 100) {
            mpf = (mpf) mph.f34145c;
        } else {
            mpf = mpf.f34120d;
        }
        String str = mpf.f34123b;
        File file = new File(this.f34005b, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            String canonicalPath2 = this.f34005b.getCanonicalPath();
            if (!canonicalPath2.endsWith("/")) {
                canonicalPath2 = String.valueOf(canonicalPath2).concat("/");
            }
            if (!canonicalPath.startsWith(canonicalPath2)) {
                f34004a.mo25416d("Possible security issue; unable to transfer item: %s", str);
                String valueOf = String.valueOf(str);
                throw new mmq(valueOf.length() == 0 ? new String("Unable to transfer item: ") : "Unable to transfer item: ".concat(valueOf));
            }
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException e) {
                f34004a.mo25415d("Unable to open file for reading; skipping backup: %s", e, str);
                String valueOf2 = String.valueOf(str);
                throw new mmq(valueOf2.length() == 0 ? new String("Unable to open for reading: ") : "Unable to open for reading: ".concat(valueOf2));
            }
        } catch (IOException e2) {
            f34004a.mo25415d("Unable to open file for writing; skipping restoring: %s", e2, str);
            String valueOf3 = String.valueOf(str);
            throw new mmq(valueOf3.length() == 0 ? new String("Unable to open file: ") : "Unable to open file: ".concat(valueOf3), e2);
        }
    }

    /* renamed from: a */
    public final List mo20163a() {
        f34004a.mo25412b("Starting directory crawl...", new Object[0]);
        mmd mmd = new mmd(this.f34005b);
        if (this.f34005b.exists() && this.f34005b.isDirectory()) {
            m25325a(this.f34005b, 0, mmd);
        }
        f34004a.mo25412b("Directory crawl finished. Files count: %d", Integer.valueOf(mmd.f34001a.size()));
        return mmd.f34001a;
    }

    /* renamed from: a */
    public final void mo20164a(mph mph, InputStream inputStream) {
        mpf mpf;
        lvn lvn = f34004a;
        Object[] objArr = new Object[1];
        if (mph.f34144b == 100) {
            mpf = (mpf) mph.f34145c;
        } else {
            mpf = mpf.f34120d;
        }
        objArr[0] = mpf.f34123b;
        lvn.mo25412b("Closing stream to file: %s", objArr);
        srz.m36171a((Closeable) inputStream);
    }
}
