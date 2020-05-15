package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.support.p001v4.graphics.drawable.IconCompat;

/* renamed from: jb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1099jb {

    /* renamed from: a */
    final Bundle f22065a;

    /* renamed from: b */
    public final C1118ju[] f22066b;

    /* renamed from: c */
    public boolean f22067c;

    /* renamed from: d */
    boolean f22068d;
    @Deprecated

    /* renamed from: e */
    public int f22069e;

    /* renamed from: f */
    public CharSequence f22070f;

    /* renamed from: g */
    public PendingIntent f22071g;

    /* renamed from: h */
    private IconCompat f22072h;

    /* JADX WARNING: Illegal instructions before constructor call */
    public C1099jb(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(r2, charSequence, pendingIntent, new Bundle(), null, true, true);
        IconCompat iconCompat;
        if (i != 0) {
            iconCompat = IconCompat.m1175a(null, "", i);
        } else {
            iconCompat = null;
        }
    }

    /* renamed from: a */
    public final IconCompat mo13558a() {
        int i;
        if (this.f22072h == null && (i = this.f22069e) != 0) {
            this.f22072h = IconCompat.m1175a(null, "", i);
        }
        return this.f22072h;
    }

    public C1099jb(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C1118ju[] juVarArr, boolean z, boolean z2) {
        this.f22068d = true;
        this.f22072h = iconCompat;
        if (iconCompat != null && iconCompat.mo1107a() == 2) {
            this.f22069e = iconCompat.mo1111c();
        }
        this.f22070f = C1102je.m16571a(charSequence);
        this.f22071g = pendingIntent;
        this.f22065a = bundle;
        this.f22066b = juVarArr;
        this.f22067c = z;
        this.f22068d = z2;
    }
}
