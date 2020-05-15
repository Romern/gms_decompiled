package p000;

import android.content.Context;
import android.net.Uri;
import java.io.PrintWriter;

/* renamed from: bbcl */
final /* synthetic */ class bbcl implements bqeh {

    /* renamed from: a */
    private final bbda f102335a;

    /* renamed from: b */
    private final PrintWriter f102336b;

    /* renamed from: c */
    private final bavt f102337c;

    public bbcl(bbda bbda, PrintWriter printWriter, bavt bavt) {
        this.f102335a = bbda;
        this.f102336b = printWriter;
        this.f102337c = bavt;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbda bbda = this.f102335a;
        PrintWriter printWriter = this.f102336b;
        bavt bavt = this.f102337c;
        bavu bavu = (bavu) obj;
        if (bavu != null) {
            printWriter.format("FileKey: %s\nFileName: %s\nSharedFile: %s\n", bavt, bavu.f101938b, bavu.toString());
            Context context = bbda.f102391a;
            int a = bavb.m87594a(bavt.f101933e);
            if (a == 0) {
                a = 1;
            }
            Uri a2 = bbfd.m87917a(context, a, bavu.f101938b, bbda.f102392b, bbda.f102400j);
            if (a2 != null) {
                printWriter.format("Checksum downloaded file: %s\n", bbeh.m87879a(bbda.f102395e, a2));
            }
            return bqgd.f140614a;
        }
        bbev.m87905a("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
        return bqgd.f140614a;
    }
}
