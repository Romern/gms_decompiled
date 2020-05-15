package p000;

import java.util.List;

/* renamed from: bfex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfex extends bfgq {

    /* renamed from: a */
    private final List f113609a;

    public bfex(bfew bfew, bhdb bhdb, List list) {
        super(bfew, bhdb, new bfhd(false));
        this.f113609a = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61567a() {
        List list = this.f113609a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bfgq) list.get(i)).mo61567a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo61568a(bsax bsax, bsax bsax2) {
        List list = this.f113609a;
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            z = ((bfgq) list.get(i)).mo61668b(bsax, bsax2) && z;
        }
        return z;
    }
}
