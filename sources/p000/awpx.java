package p000;

import android.content.Context;

/* renamed from: awpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpx extends bjfk {

    /* renamed from: a */
    private static final bnic f94830a = bnic.m109489a("reauthAction");

    /* renamed from: b */
    private final Context f94831b;

    /* renamed from: c */
    private awxn f94832c;

    public awpx(Context context) {
        this.f94831b = context;
    }

    /* renamed from: a */
    public final bjfd mo52450a(bjfc bjfc) {
        if (this.f94832c == null) {
            this.f94832c = new awxn(this.f94831b);
        }
        return new bjfm(this.f94832c).mo52455a(bjfc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bnic mo52456a() {
        return f94830a;
    }
}
