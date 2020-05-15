package p000;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* renamed from: bbeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbeo implements beez {

    /* renamed from: a */
    private final Uri f102494a;

    public bbeo(Uri uri) {
        this.f102494a = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        OutputStream outputStream;
        befa befa = beey.f111467a;
        try {
            ZipInputStream zipInputStream = new ZipInputStream(behs.m95064b(beey));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (name.contains("..")) {
                            for (File file = new File(name); file != null; file = file.getParentFile()) {
                                if (file.getName().equals("..")) {
                                    String valueOf = String.valueOf(name);
                                    throw new ZipException(valueOf.length() == 0 ? new String("Illegal name: ") : "Illegal name: ".concat(valueOf));
                                }
                            }
                        }
                        Uri build = this.f102494a.buildUpon().appendPath(name).build();
                        if (!nextEntry.isDirectory()) {
                            outputStream = (OutputStream) befa.mo60643a(build, behw.m95072a(), new beer[0]);
                            boav.m111013a(zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } else {
                            befa.mo60642a(build.getScheme()).mo36270h(befa.m94920g(build));
                        }
                    } else {
                        zipInputStream.close();
                        return null;
                    }
                } catch (Throwable th) {
                    zipInputStream.close();
                    throw th;
                }
            }
            throw th;
        } catch (IOException e) {
            befa.mo60651h(this.f102494a);
            throw e;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }
}
