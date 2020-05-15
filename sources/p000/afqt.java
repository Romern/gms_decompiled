package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.RenameRequest;
import java.io.File;

/* renamed from: afqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afqt extends aaab {

    /* renamed from: a */
    private final RenameRequest f64576a;

    /* renamed from: b */
    private final ahbk f64577b;

    /* renamed from: c */
    private final afqj f64578c;

    /* renamed from: d */
    private final String f64579d;

    /* renamed from: e */
    private final afqr f64580e;

    public afqt(RenameRequest renameRequest, ahbk ahbk, afqj afqj, String str, afqr afqr) {
        super(160, "RenameOperation");
        this.f64576a = renameRequest;
        this.f64577b = ahbk;
        this.f64578c = afqj;
        this.f64579d = str;
        this.f64580e = afqr;
    }

    /* renamed from: a */
    private final void m53462a(int i) {
        bxvd da = bpyj.f139868f.mo74144da();
        String str = this.f64579d;
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
        bpyj2.f139873d = bqas.m112484a(6);
        bpyj2.f139870a |= 4;
        this.f64578c.mo34987a((bpyj) da.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Status status;
        Throwable th;
        Status status2;
        Status status3;
        try {
            if (!ceni.f183073a.mo6606a().mo79434k()) {
                this.f64577b.mo36276b(new Status(10, "Feature flag is OFF"));
                m53462a(8);
                return;
            }
            try {
                afqu.m53465a(this.f64576a.f80393a, context);
                afqu.m53465a(this.f64576a.f80394b, context);
                this.f64580e.mo35001a(this.f64576a.f80393a);
                this.f64580e.mo35001a(this.f64576a.f80394b);
                File b = befj.m94963a(context).mo60665b(this.f64576a.f80393a);
                File b2 = befj.m94963a(context).mo60665b(this.f64576a.f80394b);
                if (!b.exists()) {
                    bbev.m87909b("%s: file not found: %s", "MobStore.RenameOperation", b);
                    m53462a(6);
                    String valueOf = String.valueOf(this.f64576a.f80393a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                    sb.append("File not found: ");
                    sb.append(valueOf);
                    status3 = new Status(33500, sb.toString());
                } else if (!b.renameTo(b2)) {
                    Object[] objArr = {"MobStore.RenameOperation", b, b2};
                    if (Log.isLoggable("MDD", 4)) {
                        Log.i("MDD", bbev.m87903a("%s: Unable to rename from %s to %s", objArr));
                    }
                    m53462a(12);
                    String valueOf2 = String.valueOf(this.f64576a.f80393a);
                    String valueOf3 = String.valueOf(this.f64576a.f80394b);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21 + String.valueOf(valueOf3).length());
                    sb2.append("Unable to rename ");
                    sb2.append(valueOf2);
                    sb2.append(" to ");
                    sb2.append(valueOf3);
                    status3 = new Status(13, sb2.toString());
                } else {
                    m53462a(3);
                    status3 = Status.f30107a;
                }
                this.f64577b.mo36276b(status3);
            } catch (afqs e) {
                status2 = e.f64574a;
                m53462a(e.f64575b);
                this.f64577b.mo36276b(status2);
            } catch (begt e2) {
                status = new Status(10, "Malformed URI");
                m53462a(4);
                this.f64577b.mo36276b(status);
            } catch (Throwable th2) {
                th = th2;
                status = status2;
                this.f64577b.mo36276b(status);
                throw th;
            }
        } catch (RemoteException e3) {
            m53462a(7);
            bbev.m87911b(e3, "%s: Client died during RenameOperation", "MobStore.RenameOperation");
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bbev.m87912c("%s: onFailure: %s", "MobStore.RenameOperation", status);
        this.f64577b.mo36276b(status);
        m53462a(7);
    }
}
