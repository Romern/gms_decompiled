package p000;

import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

/* renamed from: bhqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqr {

    /* renamed from: a */
    public final LatLngBounds f119345a;

    /* renamed from: b */
    public final int f119346b;

    /* renamed from: c */
    public final String f119347c;

    /* renamed from: d */
    public final String f119348d;

    /* renamed from: e */
    public final AutocompleteFilter f119349e;

    public bhqr(LatLngBounds latLngBounds, int i, String str, String str2, AutocompleteFilter autocompleteFilter) {
        this.f119345a = latLngBounds;
        this.f119346b = i;
        this.f119347c = str;
        this.f119348d = str2;
        this.f119349e = autocompleteFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhqr) {
            bhqr bhqr = (bhqr) obj;
            return sdg.m34949a(this.f119345a, bhqr.f119345a) && this.f119347c.equals(bhqr.f119347c) && sdg.m34949a(this.f119348d, bhqr.f119348d) && sdg.m34949a(this.f119349e, bhqr.f119349e) && this.f119346b == bhqr.f119346b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119345a, Integer.valueOf(this.f119346b), this.f119347c, this.f119348d, this.f119349e});
    }
}
