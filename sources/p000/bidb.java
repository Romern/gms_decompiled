package p000;

import android.util.Log;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* renamed from: bidb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidb implements bhqx {

    /* renamed from: d */
    private static final Comparator f120282d = bida.f120281a;

    /* renamed from: a */
    private final SemanticLocationEventRequest f120283a;

    /* renamed from: b */
    private int f120284b = 0;

    /* renamed from: c */
    private List f120285c = null;

    /* renamed from: e */
    private final bjdb f120286e;

    public bidb(bjdb bjdb, SemanticLocationEventRequest semanticLocationEventRequest) {
        this.f120286e = bjdb;
        this.f120283a = semanticLocationEventRequest;
    }

    /* renamed from: a */
    public final void mo64174a(bhqz bhqz) {
        boolean z;
        int i = bhqz.f119365g;
        if (i != 0) {
            z = i == 18;
        } else {
            z = true;
        }
        int i2 = !z ? 13 : 0;
        List list = bhqz.f119361c.f119318b;
        if (cghb.f186922a.mo6606a().mo83778a()) {
            if (Log.isLoggable("Places", 5)) {
                Log.w("Places", String.format(Locale.US, "Due to flag, forgoing Place Update for %d places, with status: %d.", Integer.valueOf(list.size()), Integer.valueOf(i2)));
            }
        } else if (i2 == 0) {
            if (this.f120284b != 0) {
                List list2 = this.f120285c;
                int size = list.size();
                int size2 = list2.size();
                StringBuilder sb = new StringBuilder(55);
                sb.append("PlaceLikelihoods list sizes: ");
                sb.append(size);
                sb.append(" vs ");
                sb.append(size2);
                bioi.m102657a(sb.toString());
                if (list.isEmpty() == list2.isEmpty()) {
                    if (!list.isEmpty() || !list2.isEmpty()) {
                        int c = (int) cggm.m145257c();
                        if (list.size() == list2.size() || Math.min(list.size(), list2.size()) >= c) {
                            ArrayList arrayList = new ArrayList(list);
                            ArrayList arrayList2 = new ArrayList(list2);
                            Collections.sort(arrayList, f120282d);
                            Collections.sort(arrayList2, f120282d);
                            int min = Math.min(c, Math.min(arrayList2.size(), arrayList.size()));
                            int i3 = 0;
                            while (true) {
                                if (i3 >= min) {
                                    float f = ((bhqh) arrayList.get(0)).f119311e;
                                    float f2 = ((bhqh) arrayList2.get(0)).f119311e;
                                    StringBuilder sb2 = new StringBuilder(60);
                                    sb2.append("Likelihood: ");
                                    sb2.append(f);
                                    sb2.append(" other likelihood:");
                                    sb2.append(f2);
                                    bioi.m102657a(sb2.toString());
                                    if (((double) Math.abs(f - f2)) <= cggm.m145262h()) {
                                        return;
                                    }
                                } else if (!((bhqh) arrayList.get(i3)).f119308b.equals(((bhqh) arrayList2.get(i3)).f119308b)) {
                                    StringBuilder sb3 = new StringBuilder(63);
                                    sb3.append("Sorted PlaceLikelihoods lists are different at item ");
                                    sb3.append(i3);
                                    bioi.m102657a(sb3.toString());
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            this.f120284b++;
            this.f120285c = list;
            bjdb bjdb = this.f120286e;
            bjdb.f122529a.mo71739a(bjdb.f122530b, bjdb.f122531c, bhqz);
        }
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("placeRequest", this.f120283a);
        return a.toString();
    }
}
