package p000;

import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceRequest;

/* renamed from: aely */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aely {

    /* renamed from: a */
    public PlaceFilter f63498a = null;

    /* renamed from: b */
    public long f63499b = -1;

    /* renamed from: c */
    public int f63500c = -1;

    /* renamed from: a */
    public final PlaceRequest mo34318a() {
        PlaceFilter placeFilter = this.f63498a;
        if (placeFilter == null) {
            placeFilter = new PlaceFilter();
        }
        this.f63498a = placeFilter;
        int i = this.f63500c;
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            return new PlaceRequest(this.f63498a, this.f63499b, i, Long.MAX_VALUE, false, true);
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("invalid priority: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
