package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* renamed from: gmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class gmg {

    /* renamed from: r */
    protected final Map f18627r;

    protected gmg(String str) {
        Map map;
        sdo.m34959a((Object) str);
        if (TextUtils.isEmpty(str)) {
            map = Collections.emptyMap();
        } else {
            try {
                map = bmyx.m108640a(10).mo66917a().mo66916a(bmyx.m108640a('=').mo66921b(2)).mo66915a(str);
            } catch (IllegalArgumentException e) {
                map = Collections.emptyMap();
            }
        }
        this.f18627r = map;
    }

    /* renamed from: a */
    public final Object mo12063a(gmd gmd) {
        return gmd.mo12048a(this);
    }
}
