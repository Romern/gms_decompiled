package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: qe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class C1293qe extends C1292qd {
    public C1293qe(C1296qh qhVar, WindowInsets windowInsets) {
        super(qhVar, windowInsets);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1293qe) {
            return Objects.equals(this.f26850a, ((C1293qe) obj).f26850a);
        }
        return false;
    }

    /* renamed from: g */
    public final C1253os mo15727g() {
        DisplayCutout displayCutout = this.f26850a.getDisplayCutout();
        if (displayCutout != null) {
            return new C1253os(displayCutout);
        }
        return null;
    }

    /* renamed from: h */
    public final C1296qh mo15728h() {
        return C1296qh.m19996a(this.f26850a.consumeDisplayCutout());
    }

    public final int hashCode() {
        return this.f26850a.hashCode();
    }

    public C1293qe(C1296qh qhVar, C1293qe qeVar) {
        super(qhVar, qeVar);
    }
}
