package p000;

import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

/* renamed from: igp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class igp implements rkl {

    /* renamed from: a */
    final /* synthetic */ igs f20930a;

    public igp(igs igs) {
        this.f20930a = igs;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        List list = ((axsm) rkk).f96306a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            NodeParcelable nodeParcelable = (NodeParcelable) list.get(i);
            igs igs = this.f20930a;
            if (!igs.f20941d || nodeParcelable.f110953d) {
                String str = igs.f20940c;
                axsg.m83138a(igs.f20939b, nodeParcelable.f110950a, str, igs.f20942e).mo9458a(new igq(str, nodeParcelable));
            }
        }
    }
}
