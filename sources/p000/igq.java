package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.NodeParcelable;

/* renamed from: igq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class igq implements rkl {

    /* renamed from: a */
    final /* synthetic */ String f20931a;

    /* renamed from: b */
    final /* synthetic */ NodeParcelable f20932b;

    public igq(String str, NodeParcelable nodeParcelable) {
        this.f20931a = str;
        this.f20932b = nodeParcelable;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = ((axsf) rkk).f96299a;
        if (status.f30115i != 0) {
            igs.f20937f.mo25416d("Sending message failed. Path: %s, Node: %s, Status code: %d", this.f20931a, this.f20932b.f110950a, Integer.valueOf(status.f30115i));
            return;
        }
        igs.f20937f.mo25414c("Sending message succeeded. Path: %s, Node: %s, Status code: %d", this.f20931a, this.f20932b.f110950a, Integer.valueOf(status.f30115i));
    }
}
