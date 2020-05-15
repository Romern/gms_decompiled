package p000;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: pav */
final /* synthetic */ class pav implements Callable {

    /* renamed from: a */
    private final pbm f38735a;

    /* renamed from: b */
    private final int f38736b;

    /* renamed from: c */
    private final pbs f38737c;

    /* renamed from: d */
    private final omm f38738d;

    public pav(pbm pbm, omm omm, int i, pbs pbs) {
        this.f38735a = pbm;
        this.f38738d = omm;
        this.f38736b = i;
        this.f38737c = pbs;
    }

    public final Object call() {
        ParcelFileDescriptor parcelFileDescriptor;
        byte[] bArr;
        pbm pbm = this.f38735a;
        omm omm = this.f38738d;
        int i = this.f38736b;
        pbs pbs = this.f38737c;
        Context context = pbm.f38777c;
        ofd.m28611a(context, pbs.mo22876b(), oev.QUERY_CANDIDATE);
        boolean a = omm.mo22301a(pbs.mo22873a(), i);
        bnsi d = pbm.f38775a.mo68390d();
        d.mo68432a("pbm", "a", (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("migration: filetype=%d iteration=%d shouldMigrate=%b", Integer.valueOf(pbs.mo22873a()), Integer.valueOf(i), Boolean.valueOf(a));
        boolean z = false;
        if (!a) {
            ofd.m28611a(context, pbs.mo22876b(), oev.NOT_NEEDED);
            z = true;
        } else {
            File a2 = pbs.mo22874a(context);
            try {
                parcelFileDescriptor = ParcelFileDescriptor.open(a2, 268435456);
            } catch (FileNotFoundException e) {
                parcelFileDescriptor = null;
            }
            try {
                bArr = pbs.m30177a(new FileInputStream(a2));
            } catch (FileNotFoundException e2) {
                try {
                    bnsi d2 = pbm.f38775a.mo68390d();
                    d2.mo68432a("pbm", "a", 252, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68405a("Unable to read source file for SHA1 sum computation.");
                    bArr = new byte[0];
                } catch (IOException e3) {
                    bnsi c = pbm.f38775a.mo68388c();
                    c.mo68437a(e3);
                    c.mo68432a("pbm", "a", 232, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Failed to close the file descriptor.");
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
            if (parcelFileDescriptor != null) {
                ofd.m28611a(context, pbs.mo22876b(), oev.STARTED_WITH_DIGEST);
                bnsi d3 = pbm.f38775a.mo68390d();
                d3.mo68432a("pbm", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d3.mo68420a("Starting migration: sha1Sum=%s", boan.f132472f.mo68794a(bArr));
            } else {
                ofd.m28611a(context, pbs.mo22876b(), oev.STARTED_WITH_NULL);
                bnsi d4 = pbm.f38775a.mo68390d();
                d4.mo68432a("pbm", "a", 220, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d4.mo68405a("Source file does not exist. Performing a null-migration");
            }
            boolean a3 = omm.mo22302a(pbs.mo22873a(), i, parcelFileDescriptor, bArr);
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            z = a3;
        }
        return Boolean.valueOf(z);
        throw th;
    }
}
