package p000;

import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* renamed from: tcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tcy extends tdl {

    /* renamed from: a */
    UUID f45663a;

    /* renamed from: b */
    final /* synthetic */ ConstellationDebugChimeraActivity f45664b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tcy(ConstellationDebugChimeraActivity constellationDebugChimeraActivity) {
        super(new snr(new sns(9)));
        this.f45664b = constellationDebugChimeraActivity;
    }

    /* renamed from: a */
    public final void mo26315a(String str, ArrayList arrayList) {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45664b;
        sek sek = ConstellationDebugChimeraActivity.f30575b;
        constellationDebugChimeraActivity.f30583e = str;
        constellationDebugChimeraActivity.f30584f = arrayList;
        constellationDebugChimeraActivity.f30581c.post(new tcx(this));
    }

    /* renamed from: a */
    public final void mo11624a(tdw tdw) {
        sek sek = ConstellationDebugChimeraActivity.f30575b;
        String valueOf = String.valueOf(tdw.getMessage());
        sek.mo25412b(valueOf.length() == 0 ? new String("fail:") : "fail:".concat(valueOf), new Object[0]);
        this.f45664b.f30582d.mo26404a(this.f45663a, 3, tdw);
        this.f45664b.f30581c.post(new tcw(this));
    }

    /* renamed from: a */
    public final void mo11625a(boolean z, Map map) {
        ConstellationDebugChimeraActivity.f30575b.mo25412b("success", new Object[0]);
        this.f45664b.f30582d.mo26405a(this.f45663a, 3, z);
        this.f45664b.f30581c.post(new tcv(this));
    }
}
