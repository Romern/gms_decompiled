package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: wdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wdj extends cazu {

    /* renamed from: b */
    private final cazn f50546b;

    /* renamed from: c */
    private final cazn f50547c;

    public wdj(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(wdj.class), cijl);
        this.f50546b = cbac.m127643a(cazn);
        this.f50547c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f50546b.mo75201b(), this.f50547c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        Uri.Builder buildUpon = Uri.parse((String) list.get(0)).buildUpon();
        for (Map.Entry entry : Collections.unmodifiableMap(((bycs) list.get(1)).f165695n).entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return bqga.m112775a(buildUpon.build());
    }
}
