package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.places.service.GeoDataChimeraService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: bieb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bieb extends bien {

    /* renamed from: b */
    private final String f120360b;

    /* renamed from: c */
    private final LatLngBounds f120361c;

    /* renamed from: d */
    private final int f120362d;

    /* renamed from: e */
    private final AutocompleteFilter f120363e;

    /* renamed from: f */
    private final aenr f120364f;

    /* renamed from: g */
    private final GeoDataChimeraService f120365g;

    public bieb(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, GeoDataChimeraService geoDataChimeraService, bhpt bhpt) {
        super(65, "GetAutoPredictions", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a((Object) str);
        sdo.m34959a(autocompleteFilter);
        sdo.m34959a(aenr);
        this.f120360b = str;
        this.f120361c = latLngBounds;
        this.f120362d = i;
        this.f120363e = autocompleteFilter;
        this.f120364f = aenr;
        this.f120365g = geoDataChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return 2;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        String str = this.f120360b;
        AutocompleteFilter autocompleteFilter = this.f120363e;
        PlacesParams placesParams = this.f120388a;
        bpqk c = bhqq.m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) c);
        bprg a = bhqq.m101359a(6, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) a);
        bxvd da = bpqa.f138688d.mo74144da();
        if (((double) bhqq.f119344a.nextFloat()) < cgfl.f186724a.mo6606a().mo83595b() && str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpqa bpqa = (bpqa) da.f164949b;
            str.getClass();
            bpqa.f138690a = 1 | bpqa.f138690a;
            bpqa.f138691b = str;
        }
        if (autocompleteFilter != null) {
            bpps bpps = (bpps) bppt.f138657d.mo74144da();
            String b = bhqm.m101336b(autocompleteFilter.f79460e);
            if (b != null) {
                bpps.mo68970a(b);
            }
            bppt bppt = (bppt) bpps.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpqa bpqa2 = (bpqa) da.f164949b;
            bppt.getClass();
            bpqa2.f138692c = bppt;
            bpqa2.f138690a |= 4;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bpqa bpqa3 = (bpqa) da.mo74062i();
        bprg bprg2 = bprg.f138829s;
        bpqa3.getClass();
        bprg.f138839i = bpqa3;
        bprg.f138831a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
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
        return (bpqk) bxvd.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9 A[Catch:{ VolleyError | gid | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fa A[Catch:{ VolleyError | gid | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0101 A[Catch:{ VolleyError | gid | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0107 A[Catch:{ VolleyError | gid | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013e A[Catch:{ VolleyError | gid | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0141 A[Catch:{ VolleyError | gid | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0146 A[Catch:{ VolleyError | gid | TimeoutException -> 0x016f }, LOOP:0: B:20:0x0091->B:69:0x0146, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0154 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        List arrayList;
        ArrayList arrayList2;
        int i;
        bvpg bvpg;
        List list;
        String str;
        List list2;
        String str2;
        String str3;
        super.mo6502a(context);
        bhqr bhqr = new bhqr(this.f120361c, this.f120362d, this.f120388a.f79573c, this.f120360b, this.f120363e);
        List list3 = this.f120388a.f79574d == null ? (List) this.f120365g.f151361a.mo25325a(bhqr) : null;
        if (this.f120360b.isEmpty()) {
            list3 = Collections.emptyList();
        }
        if (list3 == null) {
            biam f = mo64567f();
            try {
                String str4 = this.f120360b;
                LatLngBounds latLngBounds = this.f120361c;
                int i2 = this.f120362d;
                AutocompleteFilter autocompleteFilter = this.f120363e;
                PlacesParams placesParams = this.f120388a;
                bvlf bvlf = (bvlf) f.mo64492a(new bibf(f.f120057e, f.f120053a, f.f120054b, f.f120055c, f.f120056d, str4, latLngBounds, i2, autocompleteFilter, "getAutocompletePredictions", placesParams), placesParams);
                Context context2 = f.f120053a;
                if (bvlf != null) {
                    if (bvlf.f156527b.size() != 0) {
                        bvow bvow = bvlf.f156526a;
                        if (bvow == null) {
                            bvow = bvow.f157230c;
                        }
                        bian.m101877a(context2, bvow);
                        arrayList = new ArrayList(bvlf.f156527b.size());
                        int i3 = 0;
                        while (i3 < bvlf.f156527b.size()) {
                            bvld bvld = (bvld) bvlf.f156527b.get(i3);
                            if (bvld != null) {
                                if (bvld.f156511d.size() != 0) {
                                    ArrayList arrayList3 = new ArrayList(bvld.f156511d.size());
                                    for (int i4 = 0; i4 < bvld.f156511d.size(); i4++) {
                                        arrayList3.add(Integer.valueOf(bhqm.m101333a((String) bvld.f156511d.get(i4))));
                                    }
                                    arrayList2 = arrayList3;
                                    if ((bvld.f156508a & 8) != 0 || (i = bvlc.m121226a(bvld.f156514g)) == 0) {
                                        i = 1;
                                    }
                                    List a = bian.m101876a(bvld.f156512e);
                                    bvpg = bvld.f156513f;
                                    if (bvpg != null) {
                                        bvpg = bvpg.f157286f;
                                    }
                                    if ((1 & bvpg.f157288a) != 0) {
                                        str2 = null;
                                        list2 = null;
                                        str = null;
                                        list = null;
                                    } else {
                                        bvpg bvpg2 = bvld.f156513f;
                                        if (bvpg2 == null) {
                                            bvpg2 = bvpg.f157286f;
                                        }
                                        String str5 = bvpg2.f157289b;
                                        bvpg bvpg3 = bvld.f156513f;
                                        if (bvpg3 == null) {
                                            bvpg3 = bvpg.f157286f;
                                        }
                                        String str6 = bvpg3.f157290c;
                                        bvpg bvpg4 = bvld.f156513f;
                                        if (bvpg4 == null) {
                                            bvpg4 = bvpg.f157286f;
                                        }
                                        List a2 = bian.m101876a(bvpg4.f157291d);
                                        bvpg bvpg5 = bvld.f156513f;
                                        if (bvpg5 == null) {
                                            bvpg5 = bvpg.f157286f;
                                        }
                                        str = str6;
                                        list2 = a2;
                                        list = bian.m101876a(bvpg5.f157292e);
                                        str2 = str5;
                                    }
                                    if ((bvld.f156508a & 2) == 0) {
                                        str3 = bvld.f156510c;
                                    } else {
                                        str3 = null;
                                    }
                                    int i5 = i - 1;
                                    if (i == 0) {
                                        arrayList.add(AutocompletePredictionEntity.m66922a(str3, arrayList2, i5, bvld.f156509b, a, str2, list2, str, list));
                                        i3++;
                                    } else {
                                        throw null;
                                    }
                                }
                            }
                            arrayList2 = new ArrayList();
                            if ((bvld.f156508a & 8) != 0) {
                            }
                            i = 1;
                            List a3 = bian.m101876a(bvld.f156512e);
                            bvpg = bvld.f156513f;
                            if (bvpg != null) {
                            }
                            if ((1 & bvpg.f157288a) != 0) {
                            }
                            if ((bvld.f156508a & 2) == 0) {
                            }
                            int i52 = i - 1;
                            if (i == 0) {
                            }
                        }
                        if (this.f120388a.f79574d == null) {
                            this.f120365g.f151361a.mo25327a(bhqr, list3);
                        }
                    }
                }
                arrayList = new ArrayList();
                if (this.f120388a.f79574d == null) {
                }
            } catch (VolleyError | gid | TimeoutException e) {
                throw bien.m102124a(e);
            }
        }
        bioc.m102650b(0, list3, this.f120364f);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bioc.m102650b(status.f30115i, Collections.emptyList(), this.f120364f);
    }
}
