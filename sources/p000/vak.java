package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Date;

/* renamed from: vak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vak implements vaf {

    /* renamed from: a */
    final /* synthetic */ val f48844a;

    /* renamed from: b */
    private final uzt f48845b;

    /* renamed from: c */
    private final Date f48846c;

    /* renamed from: d */
    private final uei f48847d;

    public vak(val val, uzt uzt, Date date, uei uei) {
        this.f48844a = val;
        this.f48845b = uzt;
        this.f48846c = date;
        this.f48847d = uei;
    }

    /* renamed from: a */
    public final void mo28158a(vag vag) {
        int i;
        if (vag.f48825a) {
            val val = this.f48844a;
            this.f48847d.mo27256a(!val.f48850b.mo27405a(val.f48851c, vab.m39867a(this.f48845b), this.f48846c.getTime()).mo27691c(), vag.f48826b);
            return;
        }
        uei uei = this.f48847d;
        boolean z = vag.f48827c;
        vcv g = uei.f47354b.mo28306g();
        if (!z) {
            i = 8;
        } else {
            i = 7;
        }
        g.mo28257b(i);
        try {
            uei.f47353a.mo27107a(new Status(i, "Sync more failed.", null));
        } catch (RemoteException e) {
            uej.f47355f.mo25378c("SyncMoreOperation", "Unable to report sync more result.", e);
            g.mo28256b();
        }
        g.mo28254a();
        vcy vcy = uei.f47354b;
        vcy.mo28307h();
        vcy.mo28274a();
    }
}
