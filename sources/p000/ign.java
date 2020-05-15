package p000;

import com.google.android.gms.wearable.internal.NodeParcelable;

/* renamed from: ign */
final /* synthetic */ class ign implements aubw {

    /* renamed from: a */
    private final String f20927a;

    /* renamed from: b */
    private final NodeParcelable f20928b;

    public ign(String str, NodeParcelable nodeParcelable) {
        this.f20927a = str;
        this.f20928b = nodeParcelable;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        String str = this.f20927a;
        NodeParcelable nodeParcelable = this.f20928b;
        igs.f20937f.mo25414c("Sending message succeeded. Path: %s, Node: %s, ID: %d", str, nodeParcelable.f110950a, (Integer) obj);
    }
}
