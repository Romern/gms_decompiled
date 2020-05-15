package p000;

import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: bhxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxt {

    /* renamed from: a */
    public final String f119843a;

    /* renamed from: b */
    public final List f119844b;

    /* renamed from: c */
    public final LatLngBounds f119845c;

    /* renamed from: d */
    final /* synthetic */ bhyd f119846d;

    /* renamed from: e */
    private final long f119847e;

    /* renamed from: f */
    private boolean f119848f = false;

    public bhxt(bhyd bhyd, String str, List list, LatLngBounds latLngBounds, long j) {
        this.f119846d = bhyd;
        this.f119843a = str;
        this.f119844b = list;
        this.f119845c = latLngBounds;
        this.f119847e = j;
    }

    /* renamed from: a */
    public final void mo64399a() {
        this.f119848f = true;
    }

    /* renamed from: b */
    public final void mo64401b() {
        if (this.f119846d.f119877h) {
            ArrayList arrayList = new ArrayList(this.f119844b.size());
            ArrayList arrayList2 = new ArrayList(this.f119844b.size());
            for (bhxn bhxn : this.f119844b) {
                String str = bhxn.f119830b.f109594c.f109590c;
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                } else {
                    arrayList2.add(bhxn);
                    if (Log.isLoggable("Places", 5)) {
                        String valueOf = String.valueOf(bhxn);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
                        sb.append("Places will not be fetched for subscription which does not filter by chain: ");
                        sb.append(valueOf);
                        Log.w("Places", sb.toString());
                    }
                }
            }
            this.f119846d.f119870a.removeAll(arrayList2);
            this.f119844b.removeAll(arrayList2);
            if (!arrayList.isEmpty()) {
                PlacesParams placesParams = new PlacesParams("com.google.android.gms", Locale.getDefault(), this.f119843a);
                if (cghh.m145425f()) {
                    this.f119846d.f119874e.mo64490a(new bicc(this.f119846d.f119873d, placesParams, this.f119845c, (int) cgfr.m145053h(), arrayList), new bhxq(this));
                } else {
                    this.f119846d.f119874e.mo64490a(new biax(this.f119846d.f119872c, placesParams, this.f119845c, (int) cgfr.m145053h(), arrayList), new bhxp(this));
                }
                if (cgfl.m145006b()) {
                    this.f119846d.f119876g.mo64139a(bhqq.m101346a(bhqq.m101358a(arrayList, placesParams)));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64400a(int i, Map map) {
        if (!this.f119848f && this.f119846d.f119877h) {
            if (i == 0) {
                if (map.size() != this.f119844b.size()) {
                    if (Log.isLoggable("Places", 6)) {
                        int size = this.f119844b.size();
                        int size2 = map.size();
                        StringBuilder sb = new StringBuilder((int) ErrorInfo.TYPE_SDU_MEMORY_FULL);
                        sb.append("Chains reported by Places Server do not match chains requested. Asked for ");
                        sb.append(size);
                        sb.append(" and got ");
                        sb.append(size2);
                        Log.e("Places", sb.toString());
                    }
                    long k = this.f119847e * cgfr.m145056k();
                    for (bhxn bhxn : this.f119844b) {
                        this.f119846d.f119871b.postDelayed(new bhxs(this, bhxn, k), this.f119847e);
                    }
                    return;
                }
                for (bhxn bhxn2 : this.f119844b) {
                    List list = (List) map.get(bhxn2.f119830b.f109594c.f109590c);
                    if (this.f119846d.f119870a.contains(bhxn2)) {
                        this.f119846d.mo64413a(list, bhxn2, false);
                    }
                }
            } else if (this.f119847e > cgfr.m145055j()) {
                mo64399a();
                this.f119846d.f119870a.removeAll(this.f119844b);
                if (Log.isLoggable("Places", 6)) {
                    StringBuilder sb2 = new StringBuilder(94);
                    sb2.append("Exceeded maximum network back off time, fetching nearby places failed with status: ");
                    sb2.append(i);
                    bioi.m102658a("Places", sb2.toString());
                }
            } else {
                this.f119846d.f119871b.postDelayed(new bhxr(this, this.f119847e * cgfr.m145056k()), this.f119847e);
            }
        }
    }
}
