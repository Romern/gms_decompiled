package p000;

import com.google.android.chimera.Service;

/* renamed from: dic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dic extends djw {
    public dic() {
        super(Service.class, 100);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8643a(dju dju, brtm brtm, String str, djv djv) {
        dnf b = brtm.mo69920b(str);
        if (b == null) {
            return false;
        }
        djv.f13364c = b.mo9290S();
        int __offset = b.__offset(6);
        djv.f13365d = __offset != 0 ? b.__string(__offset + b.bb_pos) : null;
        return true;
    }
}
