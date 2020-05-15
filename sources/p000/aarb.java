package p000;

import android.content.Context;
import android.util.Log;
import java.util.List;

/* renamed from: aarb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aarb {

    /* renamed from: a */
    private final Context f28971a;

    public aarb(Context context) {
        this.f28971a = context;
    }

    /* renamed from: a */
    public final synchronized List mo17202a() {
        if (aytw.m84813a(this.f28971a)) {
            return bngx.m109376e();
        }
        try {
            buil b = bfoc.m97397a(this.f28971a).mo62030b(this.f28971a);
            if (b != null) {
                return b.f153953c;
            }
            return bngx.m109376e();
        } catch (bfof e) {
            Log.e("GCM", "StorageException while reading file", e);
            return bngx.m109376e();
        }
    }
}
