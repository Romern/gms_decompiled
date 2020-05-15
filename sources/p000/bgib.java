package p000;

import android.location.LocationListener;
import java.lang.ref.WeakReference;

/* renamed from: bgib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgib {

    /* renamed from: a */
    public final WeakReference f116475a;

    /* renamed from: b */
    public final int f116476b;

    /* renamed from: c */
    final LocationListener f116477c = new bgia(this, "location", "CallbackRunner");

    public bgib(bgid bgid, int i) {
        this.f116475a = new WeakReference(bgid);
        this.f116476b = i;
    }
}
