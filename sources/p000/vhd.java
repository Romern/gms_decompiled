package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: vhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhd implements bknm {

    /* renamed from: a */
    final /* synthetic */ vhs f49254a;

    /* renamed from: b */
    final /* synthetic */ bknj f49255b;

    /* renamed from: c */
    final /* synthetic */ String f49256c;

    /* renamed from: d */
    final /* synthetic */ vhe f49257d;

    /* renamed from: e */
    final /* synthetic */ vhb f49258e;

    /* renamed from: f */
    final /* synthetic */ vhg f49259f;

    public vhd(vhg vhg, vhs vhs, bknj bknj, String str, vhe vhe, vhb vhb) {
        this.f49259f = vhg;
        this.f49254a = vhs;
        this.f49255b = bknj;
        this.f49256c = str;
        this.f49257d = vhe;
        this.f49258e = vhb;
    }

    /* renamed from: a */
    public final void mo28447a(bknn bknn) {
        this.f49257d.mo27246a(new Status(7, "Failed to load document from network.", null));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28448a(Object obj) {
        bkpw bkpw = (bkpw) obj;
        try {
            new vhn(this.f49254a, this.f49259f.f49266f, bkpw).mo6502a(this.f49259f.f49264d);
        } catch (aaaj | RemoteException e) {
            vhg.f49261a.mo25378c("RealtimeLoader", "Failed to get initial snapshot.", e);
        }
        bkmc a = bkmc.m106124a(this.f49255b, bklw.m106118a(bkpw), vhg.f49263c);
        a.mo66106a(this.f49256c);
        this.f49257d.mo27247a(this.f49254a, a, this.f49258e);
    }
}
