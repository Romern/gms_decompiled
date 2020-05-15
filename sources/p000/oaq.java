package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: oaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oaq {

    /* renamed from: a */
    private static final bnsn f37083a = odk.m28481a("CAR.AUDIO");

    /* renamed from: b */
    private final OutputStream f37084b;

    public oaq(Context context, int i, int i2) {
        String str;
        String str2 = (i & 2) == 0 ? (i & 1) == 0 ? "pcm_16k_mono.raw" : "pcm_48k_stereo.raw" : (i & 1) == 0 ? "aac_16k_mono.aac" : "aac_48k_stereo.aac";
        if ((i & 4) == 0) {
            StringBuilder sb = new StringBuilder(18);
            sb.append("stream-");
            sb.append(i2);
            str = sb.toString();
        } else {
            str = "mic";
        }
        File a = npe.m27153a(context);
        BufferedOutputStream bufferedOutputStream = null;
        if (a == null) {
            bnsi d = f37083a.mo68390d();
            d.mo68432a("oaq", "<init>", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Failed to get directory");
            this.f37084b = null;
            return;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(format).length() + str2.length());
        sb2.append(str);
        sb2.append("-");
        sb2.append(format);
        sb2.append(".");
        sb2.append(str2);
        File file = new File(a, sb2.toString());
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (IOException e) {
            bnsi d2 = f37083a.mo68390d();
            d2.mo68432a("oaq", "<init>", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("Cannot create file for audio saving: %s", file);
        }
        this.f37084b = bufferedOutputStream;
    }

    /* renamed from: a */
    public static void m28297a(File file) {
        if (file == null) {
            bnsi b = f37083a.mo68387b();
            b.mo68432a("oaq", "a", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Failed to get directory");
        } else if (file.isDirectory()) {
            long a = ccsk.f179847a.mo6606a().mo76718a();
            File[] listFiles = file.listFiles();
            long j = 0;
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j += file2.length();
                }
            }
            bnsi d = f37083a.mo68390d();
            d.mo68432a("oaq", "b", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68425a("Directory %s has size (in bytes): %d, clean up limit: %d", file.getPath(), Long.valueOf(j), Long.valueOf(a));
            if (j > a) {
                bnsi d2 = f37083a.mo68390d();
                d2.mo68432a("oaq", "a", (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68420a("Remove all contents from directory: %s", file.getPath());
                File[] listFiles2 = file.listFiles();
                if (listFiles2 != null) {
                    for (File file3 : listFiles2) {
                        file3.delete();
                    }
                }
            }
        } else {
            bnsi b2 = f37083a.mo68387b();
            b2.mo68432a("oaq", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68420a("File %s is not directory", file.getPath());
        }
    }

    /* renamed from: b */
    private static boolean m28298b(File file) {
        long a = ccsk.f179847a.mo6606a().mo76718a();
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += file2.length();
            }
        }
        bnsi d = f37083a.mo68390d();
        d.mo68432a("oaq", "b", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("Directory %s has size (in bytes): %d, clean up limit: %d", file.getPath(), Long.valueOf(j), Long.valueOf(a));
        if (j > a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo21907a() {
        OutputStream outputStream = this.f37084b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo21908a(byte[] bArr, int i, int i2) {
        OutputStream outputStream = this.f37084b;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
            } catch (IOException e) {
            }
        }
    }
}
