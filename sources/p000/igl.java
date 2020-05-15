package p000;

import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

/* renamed from: igl */
final /* synthetic */ class igl implements aubw {

    /* renamed from: a */
    private final igs f20925a;

    public igl(igs igs) {
        this.f20925a = igs;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        igs igs = this.f20925a;
        igs.f20937f.mo25414c("Successfully retrieved nodes", new Object[0]);
        for (NodeParcelable nodeParcelable : (List) obj) {
            if (!igs.f20941d || nodeParcelable.f110953d) {
                String str = igs.f20940c;
                byte[] bArr = igs.f20942e;
                if (igs.f20943g == null) {
                    igs.f20943g = axoz.m82854b(igs.f20938a);
                }
                aucb a = igs.f20943g.mo24694a(nodeParcelable.f110950a, str, bArr);
                a.mo50373a(new ign(str, nodeParcelable));
                a.mo50372a(igo.f20929a);
            }
        }
    }
}
