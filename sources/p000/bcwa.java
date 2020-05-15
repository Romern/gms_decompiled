package p000;

import android.content.Context;

/* renamed from: bcwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwa implements bcjo {

    /* renamed from: a */
    private final Context f105040a;

    /* renamed from: b */
    private final bcwg f105041b;

    public bcwa(Context context, bcwg bcwg) {
        this.f105040a = context;
        this.f105041b = bcwg;
    }

    /* renamed from: a */
    public final bcjo mo56945a(String str) {
        Context context = this.f105040a;
        return new bcwa(context, new bcwg(context, str));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56946a() {
        return this.f105041b;
    }
}
