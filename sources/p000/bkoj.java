package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bkoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkoj {

    /* renamed from: a */
    public final String f125006a;

    /* renamed from: b */
    public final Map f125007b;

    /* renamed from: c */
    public final Map f125008c;

    /* renamed from: d */
    public final bkof f125009d;

    /* renamed from: e */
    public final List f125010e;

    public bkoj(bkoh bkoh) {
        String str = bkoh.f125001a;
        if (str != null) {
            this.f125006a = str;
            this.f125007b = Collections.unmodifiableMap(bkoh.f125002b);
            this.f125008c = Collections.unmodifiableMap(bkoh.f125005e);
            this.f125009d = bkoh.f125003c;
            this.f125010e = Collections.unmodifiableList(bkoh.f125004d);
            return;
        }
        throw new NullPointerException("baseUri");
    }
}
