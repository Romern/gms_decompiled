package p000;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: bbgb */
final /* synthetic */ class bbgb implements bmzi {

    /* renamed from: a */
    private final File f102577a;

    /* renamed from: b */
    private final int f102578b;

    public bbgb(File file, int i) {
        this.f102577a = file;
        this.f102578b = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileWriter.<init>(java.lang.String, boolean):void throws java.io.IOException}
      ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException} */
    /* renamed from: a */
    public final Object mo6606a() {
        File file = this.f102577a;
        int i = this.f102578b;
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (!file2.getName().equals("DiskLruCache") || !file2.isDirectory()) {
                        bbgf.m87984a(file2);
                    }
                }
                File file3 = new File(file, "DiskLruCache");
                long j = (long) i;
                if (j > 0) {
                    beeq beeq = new beeq(file3, j);
                    if (beeq.f111438c.exists()) {
                        try {
                            beeq.mo60617a();
                            beeq.m94901b(beeq.f111439d);
                            Iterator it = beeq.f111443h.values().iterator();
                            while (it.hasNext()) {
                                beeo beeo = (beeo) it.next();
                                if (beeo.f111433d != null) {
                                    beeo.f111433d = null;
                                    for (int i2 = 0; i2 < beeq.f111440e; i2++) {
                                        beeq.m94901b(beeo.mo60612a(i2));
                                        beeq.m94901b(beeo.mo60614b(i2));
                                    }
                                    it.remove();
                                } else {
                                    for (int i3 = 0; i3 < beeq.f111440e; i3++) {
                                        beeq.f111441f += beeo.f111431b[i3];
                                    }
                                }
                            }
                            beeq.f111442g = new BufferedWriter(new FileWriter(beeq.f111438c, true), 8192);
                            return beeq;
                        } catch (IOException e) {
                            beeq.close();
                            beeq.m94900a(beeq.f111437b);
                        }
                    }
                    file3.mkdirs();
                    beeq beeq2 = new beeq(file3, j);
                    beeq2.mo60620b();
                    return beeq2;
                }
                throw new IllegalArgumentException("maxSize <= 0");
            }
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Couldn't list files in directory ");
            sb.append(valueOf);
            throw new bbge(new IOException(sb.toString()));
        } catch (IOException e2) {
            throw new bbge(e2);
        }
    }
}
