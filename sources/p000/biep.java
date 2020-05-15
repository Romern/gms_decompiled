package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: biep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biep extends bien {

    /* renamed from: b */
    private final String f120399b;

    /* renamed from: c */
    private final String f120400c;

    /* renamed from: d */
    private final String f120401d;

    /* renamed from: e */
    private final aeos f120402e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public biep(String str, String str2, String str3, PlacesParams placesParams, aeos aeos, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "SetPlaceAlias", placesParams, bidi, bidx, "", bhpt);
        String str4 = str;
        String str5 = str3;
        boolean z = true;
        if (!"Home".equals(str) && !"Work".equals(str)) {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34959a(aeos);
        if (TextUtils.isEmpty(str2)) {
            sdo.m34969a(str3, (Object) "Either address or placeId must be given.");
        }
        this.f120399b = str4;
        this.f120400c = str2;
        this.f120401d = str5;
        this.f120402e = aeos;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return 3;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        String str = this.f120399b;
        PlacesParams placesParams = this.f120388a;
        bpqk c = bhqq.m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bprg a = bhqq.m101359a(8, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        bxvd da = bprm.f138869c.mo74144da();
        if ("Home".equals(str)) {
            bpot bpot = bpot.HOME;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bprm bprm = (bprm) da.f164949b;
            bprm.f138872b = bpot.f138574d;
            bprm.f138871a |= 1;
        } else if ("Work".equals(str)) {
            bpot bpot2 = bpot.WORK;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bprm bprm2 = (bprm) da.f164949b;
            bprm2.f138872b = bpot2.f138574d;
            bprm2.f138871a |= 1;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bprm bprm3 = (bprm) da.mo74062i();
        bprg bprg2 = bprg.f138829s;
        bprm3.getClass();
        bprg.f138841k = bprm3;
        bprg.f138831a |= 1024;
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

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0 A[Catch:{ VolleyError | gid | TimeoutException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0147  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        bvpk bvpk;
        super.mo6502a(context);
        biam f = mo64567f();
        try {
            String str = this.f120399b;
            String str2 = this.f120400c;
            String str3 = this.f120401d;
            PlacesParams placesParams = this.f120388a;
            Context context2 = f.f120053a;
            bxvd da = bvpk.f157305f.mo74144da();
            bvov a = bian.m101870a(context2, placesParams);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvpk bvpk2 = (bvpk) da.f164949b;
            a.getClass();
            bvpk2.f157308b = a;
            int i = bvpk2.f157307a | 1;
            bvpk2.f157307a = i;
            if (str2 != null) {
                str2.getClass();
                i |= 4;
                bvpk2.f157307a = i;
                bvpk2.f157310d = str2;
            }
            if (str3 != null) {
                str3.getClass();
                bvpk2.f157307a = i | 8;
                bvpk2.f157311e = str3;
            }
            AliasedPlace aliasedPlace = null;
            if ("Home".equals(str)) {
                bvkz bvkz = bvkz.HOME;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvpk bvpk3 = (bvpk) da.f164949b;
                bvpk3.f157309c = bvkz.f156498f;
                bvpk3.f157307a |= 2;
            } else if ("Work".equals(str)) {
                bvkz bvkz2 = bvkz.WORK;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvpk bvpk4 = (bvpk) da.f164949b;
                bvpk4.f157309c = bvkz2.f156498f;
                bvpk4.f157307a |= 2;
            } else {
                bvpk = null;
                if (bvpk != null) {
                    bvpl bvpl = (bvpl) f.mo64492a(new bibd(f.f120057e, f.f120054b, "writeAlias", bvpk.mo73642k(), bvpl.f157312d, 13, 10245), placesParams);
                    Context context3 = f.f120053a;
                    bvow bvow = bvpl.f157315b;
                    if (bvow == null) {
                        bvow = bvow.f157230c;
                    }
                    bian.m101877a(context3, bvow);
                    if (!(bvpl == null || (bvpl.f157314a & 2) == 0)) {
                        bvkx bvkx = bvpl.f157316c;
                        if (bvkx == null) {
                            bvkx = bvkx.f156485e;
                        }
                        if ((bvkx.f156487a & 1) != 0) {
                            bvkx bvkx2 = bvpl.f157316c;
                            if (bvkx2 == null) {
                                bvkx2 = bvkx.f156485e;
                            }
                            if ((bvkx2.f156487a & 2) != 0) {
                                ArrayList arrayList = new ArrayList(2);
                                bvkx bvkx3 = bvpl.f157316c;
                                if (bvkx3 == null) {
                                    bvkx3 = bvkx.f156485e;
                                }
                                bvkz a2 = bvkz.m121221a(bvkx3.f156488b);
                                if (a2 == null) {
                                    a2 = bvkz.HOME;
                                }
                                if (a2 == bvkz.HOME) {
                                    arrayList.add("Home");
                                } else {
                                    bvkx bvkx4 = bvpl.f157316c;
                                    if (bvkx4 == null) {
                                        bvkx4 = bvkx.f156485e;
                                    }
                                    bvkz a3 = bvkz.m121221a(bvkx4.f156488b);
                                    if (a3 == null) {
                                        a3 = bvkz.HOME;
                                    }
                                    if (a3 == bvkz.WORK) {
                                        arrayList.add("Work");
                                    }
                                }
                                bvkx bvkx5 = bvpl.f157316c;
                                if (bvkx5 == null) {
                                    bvkx5 = bvkx.f156485e;
                                }
                                aliasedPlace = AliasedPlace.m66969a(bvkx5.f156489c, arrayList);
                            }
                        }
                    }
                }
                if (aliasedPlace == null) {
                    this.f120402e.mo34402a(new AliasedPlacesResult(aemj.m52157b(0), Arrays.asList(aliasedPlace)));
                    return;
                }
                Log.wtf("Places", "PlacesServer.getAliases returned null");
                throw new biem(8);
            }
            bvpk = (bvpk) da.mo74062i();
            if (bvpk != null) {
            }
            if (aliasedPlace == null) {
            }
        } catch (VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f120402e.mo34402a(new AliasedPlacesResult(status, null));
    }
}
