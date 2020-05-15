package p000;

import com.google.android.gms.drive.events.ChangesAvailableOptions;
import java.util.Set;

/* renamed from: upq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class upq extends uqi {

    /* renamed from: c */
    private final upv f48492c;

    public upq(utr utr, long j, ChangesAvailableOptions changesAvailableOptions, Set set) {
        super(4, utr);
        this.f48492c = new upv(new upp(this), j, changesAvailableOptions, set);
    }

    /* renamed from: a */
    public static uqi m39209a(utr utr) {
        return new uqi(4, utr);
    }

    /* renamed from: a */
    public final boolean mo27833a() {
        return this.f48492c.mo27843b();
    }

    /* renamed from: a */
    public final boolean mo27834a(ujx ujx) {
        return this.f48492c.mo27842a(ujx);
    }
}
