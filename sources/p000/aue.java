package p000;

import android.view.View;
import android.view.WindowId;

/* renamed from: aue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aue {

    /* renamed from: a */
    private final WindowId f2258a;

    public aue(View view) {
        this.f2258a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aue) && ((aue) obj).f2258a.equals(this.f2258a);
    }

    public final int hashCode() {
        return this.f2258a.hashCode();
    }
}
