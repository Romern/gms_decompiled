package p000;

import android.app.PendingIntent;
import android.support.p001v4.graphics.drawable.IconCompat;

/* renamed from: apz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apz implements aqh {

    /* renamed from: a */
    public final aqi f1970a;

    public apz(PendingIntent pendingIntent, IconCompat iconCompat, int i, CharSequence charSequence) {
        this.f1970a = new aqi(pendingIntent, iconCompat, i, charSequence);
    }

    /* renamed from: a */
    public static apz m1828a(PendingIntent pendingIntent, IconCompat iconCompat, int i, CharSequence charSequence) {
        return new apz(pendingIntent, iconCompat, i, charSequence);
    }

    /* renamed from: a */
    public final IconCompat mo2286a() {
        return this.f1970a.f1991b;
    }

    /* renamed from: b */
    public final CharSequence mo2288b() {
        return this.f1970a.f1992c;
    }

    /* renamed from: c */
    public final boolean mo2289c() {
        return this.f1970a.f1993d;
    }

    /* renamed from: a */
    public final void mo2287a(apg apg) {
        PendingIntent a = this.f1970a.mo2299a();
        apg a2 = this.f1970a.mo2300a(apg);
        a2.mo2267a("shortcut", "title");
        apg.mo2260a(a, a2.mo2257a(), this.f1970a.mo2301b());
    }
}
