package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bkvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkvg extends bkvh {

    /* renamed from: d */
    private final Map f125315d = new HashMap();

    public bkvg(bkvk bkvk, blgm blgm) {
        super(blgm);
        for (Map.Entry entry : mo66374a("value").mo66493d().mo66481a().entrySet()) {
            this.f125315d.put((String) entry.getKey(), bkvk.mo66375a((blgm) entry.getValue()));
        }
    }

    /* renamed from: a */
    public final List mo66373a() {
        ArrayList arrayList = new ArrayList(this.f125315d.size());
        for (Map.Entry entry : this.f125315d.entrySet()) {
            arrayList.add(bksz.m106577a(this.f125316a, (String) entry.getKey(), (blhp) entry.getValue()));
        }
        return arrayList;
    }
}
