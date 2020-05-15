package p000;

import android.os.StrictMode;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: bdzk */
final /* synthetic */ class bdzk implements bmzi {

    /* renamed from: a */
    private final bdzo f106694a;

    public bdzk(bdzo bdzo) {
        this.f106694a = bdzo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        p000.bqye.m113761a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        android.os.StrictMode.setThreadPolicy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* renamed from: a */
    public final Object mo6606a() {
        beaf beaf;
        bdzo bdzo = this.f106694a;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            FileInputStream fileInputStream = new FileInputStream(bdzo.mo58467b());
            beaf = (beaf) GeneratedMessageLite.m124010a(beaf.f106724g, fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
        } catch (Throwable th) {
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (beaf == null || beaf.f106727b.isEmpty()) {
            bdzo.mo58466a();
        } else {
            anef.m64089a(bdzo.f106699b.f106636d).mo25233a(beaf.f106727b).mo50378a(bdzo.f106699b.mo58441a(), bdzu.m91646a(new bdzm(bdzo)));
        }
        if (beaf == null) {
            return bnoj.f131912b;
        }
        return bdzo.m91642a(beaf);
        throw th;
    }
}
