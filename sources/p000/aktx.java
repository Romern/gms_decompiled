package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.download.DownloadDetails;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.zip.GZIPInputStream;

/* renamed from: aktx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktx {

    /* renamed from: a */
    private static final byte[] f72792a = new byte[0];

    /* renamed from: a */
    public static final byte[] m60454a(Context context, int i) {
        DownloadDetails downloadDetails;
        GZIPInputStream gZIPInputStream;
        if (i != 1) {
            try {
                downloadDetails = aktw.f72789a;
            } catch (IOException e) {
                Log.e("OcrModelManager", "Caught IOException while reading model", e);
                return f72792a;
            }
        } else {
            downloadDetails = aktw.f72790b;
        }
        aucb a = rxl.m34617a(context).mo25245a(downloadDetails.f30175a);
        File file = null;
        try {
            aucu.m76782a(a);
            if (((Status) a.mo50386d()).mo17710c()) {
                file = rye.m34650a(context, downloadDetails);
            }
        } catch (InterruptedException | ExecutionException e2) {
        }
        if (file == null) {
            String str = downloadDetails.f30175a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
            sb.append("Model file ");
            sb.append(str);
            sb.append(" is unavailable");
            Log.w("OcrModelManager", sb.toString());
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    gZIPInputStream = new GZIPInputStream(fileInputStream);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = gZIPInputStream.read(bArr);
                        if (read == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e3) {
                Log.e("OcrModelManager", "Caught IOException unzipping the downloaded model", e3);
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        }
        return f72792a;
        throw th;
    }
}
