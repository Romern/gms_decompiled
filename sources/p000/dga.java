package p000;

import android.os.Build;
import com.google.android.chimera.ContentProvider;

/* renamed from: dga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dga extends djw {
    public dga() {
        super(ContentProvider.class, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8643a(dju dju, brtm brtm, String str, djv djv) {
        dnd dnd;
        int __offset;
        dgb dgb = (dgb) dju;
        int __offset2 = brtm.__offset(20);
        String str2 = null;
        if (__offset2 != 0) {
            dnd = dnd.m8863a(null, brtm.__vector(__offset2), str, brtm.f143329bb);
        } else {
            dnd = null;
        }
        boolean z = false;
        if (dnd != null) {
            djv.f13364c = dnd.mo9290S();
            int __offset3 = dnd.__offset(6);
            if (__offset3 != 0) {
                str2 = dnd.__string(__offset3 + dnd.bb_pos);
            }
            djv.f13365d = str2;
            String[] strArr = dgb.f13048a;
            if (dgb.f13051c && ((__offset = dnd.__offset(10)) == 0 || dnd.f143329bb.get(__offset + dnd.bb_pos) == 0)) {
                z = true;
            }
            djv.f13368g = z;
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        return false;
    }
}
