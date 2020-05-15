package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: kfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kfh {

    /* renamed from: a */
    public final kfe f23980a;

    /* renamed from: b */
    public final kfe f23981b;

    /* renamed from: c */
    public final kfe f23982c;

    /* renamed from: d */
    private final Context f23983d;

    public kfh(Context context, kfe kfe, kfe kfe2, kfe kfe3) {
        this.f23983d = context;
        this.f23980a = kfe;
        this.f23981b = kfe2;
        this.f23982c = kfe3;
    }

    /* renamed from: b */
    private final Intent m17753b() {
        return new Intent().setPackage(this.f23983d.getPackageName());
    }

    @Deprecated
    /* renamed from: a */
    public final void mo14447a() {
        this.f23981b.mo14445a(m17753b());
        this.f23982c.mo14445a(m17753b());
    }
}
