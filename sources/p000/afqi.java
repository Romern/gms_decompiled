package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.DeleteFileRequest;
import java.io.File;

/* renamed from: afqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afqi extends aaab {

    /* renamed from: a */
    private final DeleteFileRequest f64545a;

    /* renamed from: b */
    private final ahbk f64546b;

    /* renamed from: c */
    private final afqj f64547c;

    /* renamed from: d */
    private final String f64548d;

    /* renamed from: e */
    private final afqr f64549e;

    public afqi(DeleteFileRequest deleteFileRequest, ahbk ahbk, afqj afqj, String str, afqr afqr) {
        super(160, "DeleteFileOperation");
        this.f64545a = deleteFileRequest;
        this.f64546b = ahbk;
        this.f64547c = afqj;
        this.f64548d = str;
        this.f64549e = afqr;
    }

    /* renamed from: a */
    private final void m53444a(int i) {
        bxvd da = bpyj.f139868f.mo74144da();
        String str = this.f64548d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyj bpyj = (bpyj) da.f164949b;
        str.getClass();
        bpyj.f139870a |= 1;
        bpyj.f139871b = str;
        bpyj.f139872c = bqau.m112486a(i);
        bpyj.f139870a |= 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyj bpyj2 = (bpyj) da.f164949b;
        bpyj2.f139873d = bqas.m112484a(5);
        bpyj2.f139870a |= 4;
        this.f64547c.mo34987a((bpyj) da.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Status status;
        Status status2;
        try {
            afqu.m53465a(this.f64545a.f80389a, context);
            this.f64549e.mo35001a(this.f64545a.f80389a);
            File b = befj.m94963a(context).mo60665b(this.f64545a.f80389a);
            if (!b.exists()) {
                bbev.m87909b("%s: file not found: %s", "MobStore.DeleteFileOperation", b);
                m53444a(6);
                String valueOf = String.valueOf(this.f64545a.f80389a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                sb.append("File not found: ");
                sb.append(valueOf);
                status2 = new Status(10, sb.toString());
            } else if (b.isDirectory()) {
                bbev.m87909b("%s: Trying to delete a directory: %s", "MobStore.DeleteFileOperation", b);
                m53444a(6);
                String valueOf2 = String.valueOf(this.f64545a.f80389a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                sb2.append("Uri is not a file: ");
                sb2.append(valueOf2);
                status2 = new Status(10, sb2.toString());
            } else if (!b.delete()) {
                bbev.m87909b("%s: Unable to delete file: %s", "MobStore.DeleteFileOperation", b);
                m53444a(9);
                String valueOf3 = String.valueOf(this.f64545a.f80389a);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 23);
                sb3.append("Unable to delete file: ");
                sb3.append(valueOf3);
                status2 = new Status(13, sb3.toString());
            } else {
                m53444a(3);
                status2 = Status.f30107a;
            }
            try {
                this.f64546b.mo36274a(status2);
            } catch (RemoteException e) {
                m53444a(7);
                bbev.m87911b(e, "%s: Client died during DeleteFileOperation", "MobStore.DeleteFileOperation");
            }
        } catch (afqs e2) {
            Status status3 = e2.f64574a;
            m53444a(e2.f64575b);
            this.f64546b.mo36274a(status3);
        } catch (begt e3) {
            status = new Status(10, e3.getMessage());
            m53444a(4);
            this.f64546b.mo36274a(status);
        } catch (Throwable th) {
            th = th;
            this.f64546b.mo36274a(status);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bbev.m87912c("%s: onFailure: %s", "MobStore.DeleteFileOperation", status);
        this.f64546b.mo36274a(status);
        m53444a(7);
    }
}
