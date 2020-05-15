package p000;

import com.google.android.chimera.Activity;

/* renamed from: dfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dfa extends djw {
    public dfa() {
        super(Activity.class, 25);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8643a(dju dju, brtm brtm, String str, djv djv) {
        dmx dmx;
        int __offset = brtm.__offset(22);
        String str2 = null;
        if (__offset != 0) {
            dmx = dmx.m8846a(null, brtm.__vector(__offset), str, brtm.f143329bb);
        } else {
            dmx = null;
        }
        if (dmx == null) {
            return false;
        }
        djv.f13364c = dmx.mo9290S();
        int __offset2 = dmx.__offset(6);
        if (__offset2 != 0) {
            str2 = dmx.__string(__offset2 + dmx.bb_pos);
        }
        djv.f13365d = str2;
        return true;
    }
}
