package p000;

import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.support.p001v4.graphics.drawable.IconCompat;
import androidx.slice.Slice;

/* renamed from: wue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wue extends wug {

    /* renamed from: a */
    private final apy f51352a;

    /* renamed from: b */
    private int f51353b;

    public wue(apy apy) {
        this.f51352a = apy;
        bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
        bnsl.mo68432a("wue", "<init>", 129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("ListSliceBuilderWrapper: Build with AndroidXListSliceBuilder");
    }

    /* renamed from: a */
    public final Slice mo29408a() {
        return ((aqf) this.f51352a.f1969a).mo2297c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29409a(int i) {
        this.f51353b = i;
        this.f51352a.f1969a.mo2292a();
    }

    /* renamed from: a */
    public final void mo29410a(PendingIntent pendingIntent, IconCompat iconCompat, String str, String str2, boolean z) {
        int i = this.f51353b;
        if (i != 0) {
            iconCompat.mo1109a(i);
            iconCompat.f1037i = PorterDuff.Mode.SRC_IN;
        }
        apy apy = this.f51352a;
        apx apx = new apx();
        boolean z2 = !z;
        apx.f1962b = iconCompat;
        apx.f1961a = z2 ? 1 : 0;
        apx.f1964d = str;
        apx.f1965e = str2;
        apx.f1963c = apz.m1828a(pendingIntent, iconCompat, z2, str);
        apy.f1969a.mo2293a(apx);
    }
}
