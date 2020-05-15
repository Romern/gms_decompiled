package p000;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: bfkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfkg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfmf f114289a;

    /* renamed from: b */
    final /* synthetic */ File f114290b;

    /* renamed from: c */
    final /* synthetic */ String f114291c;

    /* renamed from: d */
    final /* synthetic */ bfki f114292d;

    public bfkg(bfki bfki, bfmf bfmf, File file, String str) {
        this.f114292d = bfki;
        this.f114289a = bfmf;
        this.f114290b = file;
        this.f114291c = str;
    }

    public final void run() {
        File file;
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        bfki bfki = this.f114292d;
        bfki.f114295h = this.f114289a;
        bfki.f114298k = new File(this.f114290b, this.f114291c);
        if (bfkt.m97151a(this.f114292d.f114298k)) {
            bfki bfki2 = this.f114292d;
            bfki2.f114299l = new File[1];
            File[] fileArr = bfki2.f114299l;
            File file2 = bfki2.f114298k;
            String str = this.f114291c;
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append(str);
            sb.append(".0");
            fileArr[0] = new File(file2, sb.toString());
            File[] listFiles = this.f114292d.f114298k.listFiles();
            if (listFiles == null) {
                bfkt.m97152b(this.f114292d.f114298k);
                return;
            }
            List asList = Arrays.asList(this.f114292d.f114299l);
            for (File file3 : listFiles) {
                if (!asList.contains(file3)) {
                    bfkt.m97152b(file3);
                }
            }
            try {
                bfki bfki3 = this.f114292d;
                if (bfkt.m97151a(bfki3.f114298k)) {
                    file = bfki3.f114299l[0];
                    if (file == null || !file.exists()) {
                        throw new IOException("Cache file does not exist.");
                    }
                    fileInputStream = new FileInputStream(file);
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    dataInputStream = new DataInputStream(bufferedInputStream);
                    byte[] bArr = bfki3.f114295h.mo61917a(dataInputStream).f114390b;
                    bfkt.m97150a(fileInputStream);
                    bfkt.m97150a(bufferedInputStream);
                    bfkt.m97150a(dataInputStream);
                    this.f114292d.mo61401a(bArr);
                    bfki bfki4 = this.f114292d;
                    bfki4.f114297j = 0;
                    bfki4.f114296i = true;
                    return;
                }
                throw new IOException("Cache directory cannot be validated.");
            } catch (IOException e) {
                bfkt.m97152b(file);
                throw e;
            } catch (IOException e2) {
                this.f114292d.mo61837c();
            } catch (Throwable th) {
                bfkt.m97150a(fileInputStream);
                bfkt.m97150a(bufferedInputStream);
                bfkt.m97150a(dataInputStream);
                throw th;
            }
        }
    }
}
