package p000;

import android.location.Location;
import java.util.Comparator;

/* renamed from: bfyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfyn implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Location f115700a;

    public bfyn(Location location) {
        this.f115700a = location;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Double.compare(((bfwf) obj).mo62350a(this.f115700a), ((bfwf) obj2).mo62350a(this.f115700a));
    }
}
