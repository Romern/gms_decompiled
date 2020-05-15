package p000;

import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: bibp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bibp {

    /* renamed from: a */
    public final String f120153a;

    public bibp(String str) {
        this.f120153a = str;
    }

    /* renamed from: a */
    protected static final bonq m101914a(int i, int i2, long j, PlacesParams placesParams) {
        return bhqq.m101345a(i, i2, Long.valueOf(System.currentTimeMillis() - j).intValue(), placesParams, 2);
    }

    /* renamed from: a */
    public abstract bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj);

    /* renamed from: a */
    public abstract Object mo64507a();
}
