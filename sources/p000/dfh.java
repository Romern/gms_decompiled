package p000;

import com.google.android.chimera.BackupAgent;

/* renamed from: dfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dfh extends djw {
    public dfh() {
        super(BackupAgent.class, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8643a(dju dju, brtm brtm, String str, djv djv) {
        brtm N = brtm.mo69905N();
        int i = 0;
        if (N == null) {
            return false;
        }
        int __offset = N.__offset(6);
        if (__offset != 0) {
            i = N.f143329bb.getInt(__offset + N.bb_pos);
        }
        djv.f13364c = i;
        int __offset2 = N.__offset(4);
        djv.f13365d = __offset2 != 0 ? N.__string(__offset2 + N.bb_pos) : null;
        return true;
    }
}
