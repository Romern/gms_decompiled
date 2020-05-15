package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.BroadcastReceiver;

/* renamed from: dfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dfm extends djw {
    public dfm() {
        super(BroadcastReceiver.class, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8643a(dju dju, brtm brtm, String str, djv djv) {
        dne dne;
        int __offset = brtm.__offset(18);
        String str2 = null;
        if (__offset != 0) {
            dne = dne.m8865a(null, brtm.__vector(__offset), str, brtm.f143329bb);
        } else {
            dne = null;
        }
        if (dne == null) {
            return false;
        }
        djv.f13364c = dne.mo9290S();
        int __offset2 = dne.__offset(6);
        if (__offset2 != 0) {
            str2 = dne.__string(__offset2 + dne.bb_pos);
        }
        djv.f13365d = str2;
        return true;
    }
}
