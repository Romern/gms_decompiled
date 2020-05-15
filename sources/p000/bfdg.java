package p000;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* renamed from: bfdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdg {

    /* renamed from: a */
    private final String f113477a;

    /* renamed from: b */
    private int f113478b = 0;

    /* renamed from: c */
    private String f113479c;

    /* renamed from: d */
    private final bfmf f113480d;

    public bfdg(String str, bfmf bfmf) {
        this.f113477a = str;
        this.f113480d = bfmf;
        int i = bfib.f113998b;
    }

    /* renamed from: a */
    private final void m96433a() {
        this.f113478b = 0;
        this.f113479c = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092 A[SYNTHETIC, Splitter:B:35:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2 A[SYNTHETIC, Splitter:B:42:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab A[SYNTHETIC, Splitter:B:47:0x00ab] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0086=Splitter:B:32:0x0086, B:39:0x0099=Splitter:B:39:0x0099} */
    /* renamed from: a */
    public final synchronized bfgp mo61462a(bsax bsax) {
        boolean z;
        bfgp bfgp;
        int b = bsax.mo70129e(6).mo70114b(3);
        if (this.f113479c == null) {
            this.f113479c = String.valueOf(b);
            z = true;
        } else {
            z = false;
        }
        File file = new File(this.f113477a, this.f113479c);
        String absolutePath = file.getAbsolutePath();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file, true)));
            if (z) {
                try {
                    dataOutputStream2.writeInt(3);
                } catch (FileNotFoundException e) {
                    dataOutputStream = dataOutputStream2;
                    bfgp = new bfgp(false, absolutePath, "File not found.");
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e2) {
                        }
                    }
                    return bfgp;
                } catch (IOException e3) {
                    dataOutputStream = dataOutputStream2;
                    try {
                        m96433a();
                        bfgp = new bfgp(false, absolutePath, "Failed to write data to file");
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        return bfgp;
                    } catch (Throwable th) {
                        th = th;
                        if (dataOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e5) {
                        }
                    }
                    throw th;
                }
            }
            this.f113480d.mo61918a(dataOutputStream2, bfib.m96841a(bsax.mo70120b()));
            Locale locale = Locale.US;
            Object[] objArr = {Integer.valueOf(b), file.getAbsoluteFile()};
            int i = this.f113478b + 1;
            this.f113478b = i;
            if (i >= 50) {
                m96433a();
            }
            bfgp = new bfgp(true, absolutePath, "");
            try {
                dataOutputStream2.close();
            } catch (IOException e6) {
            }
        } catch (FileNotFoundException e7) {
            bfgp = new bfgp(false, absolutePath, "File not found.");
            if (dataOutputStream != null) {
            }
            return bfgp;
        } catch (IOException e8) {
            m96433a();
            bfgp = new bfgp(false, absolutePath, "Failed to write data to file");
            if (dataOutputStream != null) {
            }
            return bfgp;
        } catch (Throwable th3) {
            th = th3;
            if (dataOutputStream != null) {
            }
            throw th;
        }
        return bfgp;
    }
}
