package p000;

import android.os.Bundle;
import java.util.List;

/* renamed from: pal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pal extends omn {

    /* renamed from: a */
    final /* synthetic */ pam f38716a;

    public pal(pam pam) {
        this.f38716a = pam;
    }

    /* renamed from: a */
    public final void mo22305a() {
        if (ccpv.m131193b()) {
            bnsi d = pam.f38717a.mo68390d();
            d.mo68432a("pal", "a", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Startup service tearing down");
            this.f38716a.mo22809a();
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo22307a(List list, int i, int i2, byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo22308a(List list, byte[] bArr, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo22309a(boolean z) {
    }

    /* renamed from: a */
    public final void mo22306a(int i, int i2, String str) {
        if (ccpv.m131193b()) {
            bnsi c = pam.f38717a.mo68388c();
            c.mo68432a("pal", "a", 409, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68425a("Startup service protocol error %d (%d): %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            this.f38716a.f38720d.post(new paj(this, i, i2));
            this.f38716a.mo22809a();
        }
    }

    /* renamed from: a */
    public final void mo22310a(boolean z, List list, int i, int i2, byte[] bArr) {
        pam pam = this.f38716a;
        bnsn bnsn = pam.f38717a;
        pam.f38719c.post(new pak(this, z, list));
    }
}
