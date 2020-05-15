package p000;

import android.content.Context;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: biea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biea extends bien {

    /* renamed from: b */
    private final String f120358b;

    /* renamed from: c */
    private final aeos f120359c;

    public biea(String str, PlacesParams placesParams, aeos aeos, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "DeletePlaceAlias", placesParams, bidi, bidx, "", bhpt);
        boolean z = true;
        if (!"Home".equals(str) && !"Work".equals(str)) {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34959a(aeos);
        this.f120358b = str;
        this.f120359c = aeos;
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
        String str = this.f120358b;
        PlacesParams placesParams = this.f120388a;
        bpqk c = bhqq.m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) c);
        bprg a = bhqq.m101359a(10, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) a);
        bxvd da = bpqg.f138726c.mo74144da();
        if ("Home".equals(str)) {
            bpot bpot = bpot.HOME;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpqg bpqg = (bpqg) da.f164949b;
            bpqg.f138729b = bpot.f138574d;
            bpqg.f138728a |= 1;
        } else if ("Work".equals(str)) {
            bpot bpot2 = bpot.WORK;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpqg bpqg2 = (bpqg) da.f164949b;
            bpqg2.f138729b = bpot2.f138574d;
            bpqg2.f138728a |= 1;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bpqg bpqg3 = (bpqg) da.mo74062i();
        bprg bprg2 = bprg.f138829s;
        bpqg3.getClass();
        bprg.f138843m = bpqg3;
        bprg.f138831a |= 8192;
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

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r0 == 1) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083 A[Catch:{ VolleyError | gid | TimeoutException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        bvls bvls;
        Status status;
        super.mo6502a(context);
        biam f = mo64567f();
        try {
            String str = this.f120358b;
            PlacesParams placesParams = this.f120388a;
            Context context2 = f.f120053a;
            bxvd da = bvls.f156593d.mo74144da();
            bvov a = bian.m101870a(context2, placesParams);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvls bvls2 = (bvls) da.f164949b;
            a.getClass();
            bvls2.f156596b = a;
            bvls2.f156595a |= 1;
            AliasedPlacesResult aliasedPlacesResult = null;
            if ("Home".equals(str)) {
                bvkz bvkz = bvkz.HOME;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvls bvls3 = (bvls) da.f164949b;
                bvls3.f156597c = bvkz.f156498f;
                bvls3.f156595a |= 2;
            } else if ("Work".equals(str)) {
                bvkz bvkz2 = bvkz.WORK;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvls bvls4 = (bvls) da.f164949b;
                bvls4.f156597c = bvkz2.f156498f;
                bvls4.f156595a |= 2;
            } else {
                bvls = null;
                if (bvls != null) {
                    bvlv bvlv = (bvlv) f.mo64492a(new bibd(f.f120057e, f.f120054b, "deleteAlias", bvls.serializeToBytes(), bvlv.f156599d, 3, 10267), placesParams);
                    Context context3 = f.f120053a;
                    if (bvlv != null) {
                        bvow bvow = bvlv.f156602b;
                        if (bvow == null) {
                            bvow = bvow.f157230c;
                        }
                        bian.m101877a(context3, bvow);
                        if ((bvlv.f156601a & 2) != 0) {
                            int a2 = bvlu.m121244a(bvlv.f156603c);
                            if (a2 == 0) {
                            }
                            status = Status.f30107a;
                            aliasedPlacesResult = new AliasedPlacesResult(status, Collections.emptyList());
                        }
                    }
                    status = aemj.m52157b(9051);
                    aliasedPlacesResult = new AliasedPlacesResult(status, Collections.emptyList());
                }
                if (aliasedPlacesResult == null) {
                    this.f120359c.mo34403b(aliasedPlacesResult);
                    return;
                } else {
                    Log.wtf("Places", "PlacesSever.deleteAlias returned null");
                    throw new biem(8);
                }
            }
            bvls = (bvls) da.mo74062i();
            if (bvls != null) {
            }
            if (aliasedPlacesResult == null) {
            }
        } catch (VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f120359c.mo34403b(new AliasedPlacesResult(status, null));
    }
}
