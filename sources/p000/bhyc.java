package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: bhyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhyc {

    /* renamed from: a */
    public final bhxn f119863a;

    /* renamed from: b */
    public final LatLngBounds f119864b;

    /* renamed from: c */
    public final long f119865c;

    /* renamed from: d */
    final /* synthetic */ bhyd f119866d;

    /* renamed from: e */
    private boolean f119867e;

    /* renamed from: f */
    private final bial f119868f = new bhya(this);

    /* renamed from: g */
    private final bhyb f119869g = new bhyb(this);

    public bhyc(bhyd bhyd, bhxn bhxn, LatLngBounds latLngBounds, long j) {
        this.f119866d = bhyd;
        this.f119863a = bhxn;
        this.f119864b = latLngBounds;
        this.f119865c = j;
        this.f119867e = false;
    }

    /* renamed from: a */
    public final void mo64407a() {
        this.f119867e = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhqq.a(java.util.Collection, boolean):bppt
     arg types: [java.util.List, int]
     candidates:
      bhqq.a(int, java.lang.String):bpov
      bhqq.a(int, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(com.google.android.gms.location.places.PlaceFilter, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, int):bpqk
      bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, java.util.List):bpqk
      bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk
      bhqq.a(java.util.List, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(java.util.Collection, boolean):bppt */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo64410b() {
        String str;
        if (this.f119866d.f119877h) {
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = this.f119863a.f119830b.f109594c;
            if (!userLocationNearbyAlertFilter.f109588a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(userLocationNearbyAlertFilter.f109588a);
                bhqg bhqg = this.f119866d.f119875f;
                PlacesParams placesParams = PlacesParams.f79571a;
                bhyb bhyb = this.f119869g;
                aemh aemh = new aemh();
                aemh.f63518d = placesParams.f79574d;
                aemh.f63515a = placesParams.f79572b;
                aemh.f63517c = placesParams.f79577g;
                aema.m52142b(bhqg.f119305a, aemh.mo34328a()).mo34288a((String[]) arrayList.toArray(new String[arrayList.size()])).mo50378a(bhqg.f119306b, new bhqf(bhyb));
                if (cgfl.m145006b()) {
                    this.f119866d.f119876g.mo64139a(bhqq.m101346a(bhqq.m101349a(arrayList.size(), 2, PlacesParams.f79571a)));
                }
            } else if (userLocationNearbyAlertFilter.f109590c != null) {
                if (!cgga.m145169b() || TextUtils.isEmpty(this.f119863a.mo64392a().f79574d)) {
                    str = "";
                } else {
                    str = this.f119863a.mo64392a().f79574d;
                }
                PlacesParams placesParams2 = new PlacesParams("com.google.android.gms", Locale.getDefault(), str);
                List singletonList = Collections.singletonList(userLocationNearbyAlertFilter.f109590c);
                if (cghh.m145425f()) {
                    this.f119866d.f119874e.mo64490a(new bicc(this.f119866d.f119873d, placesParams2, this.f119864b, (int) cgfr.m145053h(), singletonList), new bhxy(this));
                } else {
                    this.f119866d.f119874e.mo64490a(new biax(this.f119866d.f119872c, placesParams2, this.f119864b, (int) cgfr.m145053h(), singletonList), new bhxx(this));
                }
                if (cgfl.m145006b()) {
                    this.f119866d.f119876g.mo64139a(bhqq.m101346a(bhqq.m101358a(singletonList, placesParams2)));
                }
            } else if (userLocationNearbyAlertFilter.f109591d) {
                if (cghh.f186930a.mo6606a().mo83792i()) {
                    this.f119866d.f119874e.mo64490a(new bicb(this.f119866d.f119873d, PlacesParams.f79571a, this.f119864b, (int) cgfr.m145053h()), new bibv(this));
                } else {
                    this.f119866d.f119874e.mo64490a(new biaw(this.f119866d.f119872c, PlacesParams.f79571a, this.f119864b, (int) cgfr.m145053h()), new biaq(this));
                }
                if (cgfl.m145006b()) {
                    int h = (int) cgfr.m145053h();
                    PlacesParams placesParams3 = PlacesParams.f79571a;
                    bpqk c = bhqq.m101365c(1, placesParams3);
                    bxvd bxvd = (bxvd) c.mo74142c(5);
                    bxvd.mo73625a((bxvk) c);
                    bprg a = bhqq.m101359a(11, placesParams3.f79573c, Locale.getDefault().toString());
                    bxvd bxvd2 = (bxvd) a.mo74142c(5);
                    bxvd2.mo73625a((bxvk) a);
                    bxvd da = bprh.f138851c.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bprh bprh = (bprh) da.f164949b;
                    bprh.f138853a |= 1;
                    bprh.f138854b = h;
                    bprh bprh2 = (bprh) da.mo74062i();
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bprg bprg = (bprg) bxvd2.f164949b;
                    bprg bprg2 = bprg.f138829s;
                    bprh2.getClass();
                    bprg.f138844n = bprh2;
                    bprg.f138831a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpqk bpqk = (bpqk) bxvd.f164949b;
                    bprg bprg3 = (bprg) bxvd2.mo74062i();
                    bpqk bpqk2 = bpqk.f138732w;
                    bprg3.getClass();
                    bpqk.f138742i = bprg3;
                    bpqk.f138734a |= 64;
                    this.f119866d.f119876g.mo64139a(bhqq.m101346a((bpqk) bxvd.mo74062i()));
                }
            } else {
                this.f119866d.f119874e.mo64490a(new biaz(this.f119866d.f119872c, PlacesParams.f79571a, this.f119864b, (int) cgfr.m145053h(), "*", userLocationNearbyAlertFilter), this.f119868f);
                if (cgfl.m145006b()) {
                    PlacesParams placesParams4 = PlacesParams.f79571a;
                    bpqk c2 = bhqq.m101365c(1, placesParams4);
                    bxvd bxvd3 = (bxvd) c2.mo74142c(5);
                    bxvd3.mo73625a((bxvk) c2);
                    bprg a2 = bhqq.m101359a(2, placesParams4.f79573c, Locale.getDefault().toString());
                    bxvd bxvd4 = (bxvd) a2.mo74142c(5);
                    bxvd4.mo73625a((bxvk) a2);
                    bxvd da2 = bprl.f138862d.mo74144da();
                    bppt a3 = bhqq.m101348a((Collection) userLocationNearbyAlertFilter.f109589b, false);
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    bprg bprg4 = (bprg) bxvd4.f164949b;
                    bprg bprg5 = bprg.f138829s;
                    a3.getClass();
                    bprg4.f138835e = a3;
                    bprg4.f138831a |= 8;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bprl bprl = (bprl) da2.f164949b;
                    bprl.f138866c = 1;
                    bprl.f138864a |= 16;
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    bprg bprg6 = (bprg) bxvd4.f164949b;
                    bprl bprl2 = (bprl) da2.mo74062i();
                    bprl2.getClass();
                    bprg6.f138836f = bprl2;
                    bprg6.f138831a |= 16;
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bpqk bpqk3 = (bpqk) bxvd3.f164949b;
                    bprg bprg7 = (bprg) bxvd4.mo74062i();
                    bpqk bpqk4 = bpqk.f138732w;
                    bprg7.getClass();
                    bpqk3.f138742i = bprg7;
                    bpqk3.f138734a |= 64;
                    this.f119866d.f119876g.mo64139a(bhqq.m101346a((bpqk) bxvd3.mo74062i()));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64408a(int i, List list) {
        if (!this.f119867e) {
            bhyd bhyd = this.f119866d;
            if (bhyd.f119877h && bhyd.f119870a.contains(this.f119863a)) {
                if (i == 0) {
                    this.f119866d.mo64413a(list, this.f119863a, false);
                } else if (this.f119865c > cgfr.m145055j()) {
                    mo64407a();
                    this.f119866d.f119870a.remove(this.f119863a);
                    if (Log.isLoggable("Places", 6)) {
                        StringBuilder sb = new StringBuilder(93);
                        sb.append("Exceeded maximum network backoff time, fetching nearby places failed with status: ");
                        sb.append(i);
                        bioi.m102658a("Places", sb.toString());
                    }
                } else {
                    this.f119866d.f119871b.postDelayed(new bhxz(this), this.f119865c);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64409a(int i, Map map) {
        if (i != 0) {
            mo64408a(i, bngx.m109376e());
        } else if (map.size() != 1) {
            bioi.m102658a("Places", "Chains reported by Semantic Location Server do not match chains requested");
            mo64408a(0, bngx.m109376e());
        } else {
            mo64408a(0, (List) map.values().iterator().next());
        }
    }
}
