package p000;

import android.content.Context;

/* renamed from: adpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adpp implements cayy {

    /* renamed from: a */
    private final adpo f62464a;

    public adpp(adpo adpo) {
        this.f62464a = adpo;
    }

    /* renamed from: a */
    public static adpp m50947a(adpo adpo) {
        return new adpp(adpo);
    }

    /* renamed from: b */
    public final Context mo6445a() {
        Context context = this.f62464a.f62461c;
        cazf.m127593a(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
