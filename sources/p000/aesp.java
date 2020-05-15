package p000;

import android.content.Context;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.LocationSharingSettings;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: aesp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aesp extends aesx {
    public aesp(Context context, String str) {
        super(context, str);
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        LocationSharingSettings locationSharingSettings;
        boolean z;
        int i;
        aeuc aeuc = new aeuc(((aesx) this).f63753a, getContext());
        bzmf a = aexp.m52655a(aeuc.f63812c, aeuc.f63811b);
        bxvd da = bzmv.f170662d.mo74144da();
        int i2 = 0;
        if (a.f170611a.size() > 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzmv bzmv = (bzmv) da.f164949b;
            a.getClass();
            bzmv.f170665b = a;
            bzmv.f170664a |= 2;
        }
        bxvd da2 = bzmg.f170612a.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzmg.m125927a((bzmg) da2.f164949b);
        bzmg bzmg = (bzmg) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzmv bzmv2 = (bzmv) da.f164949b;
        bzmg.getClass();
        bzmv2.f170666c = bzmg;
        bzmv2.f170664a |= 4;
        int i3 = 5;
        try {
            bzmw bzmw = (bzmw) aeuc.mo34565a((bzmv) da.mo74062i(), bzmw.f170667d, "readshares");
            if (bzmw == null) {
                locationSharingSettings = LocationSharingSettings.m66999a(7);
            } else {
                bzmm bzmm = bzmw.f170669a;
                if (bzmm == null) {
                    bzmm = bzmm.f170622e;
                }
                int a2 = bzmj.m125931a(bzmm.f170625b);
                if (a2 == 0) {
                    z = false;
                } else {
                    z = a2 == 2;
                }
                bxwc bxwc = bzmw.f170670b;
                bzln bzln = bzmw.f170671c;
                if (bzln == null) {
                    bzln = bzln.f170550f;
                }
                ArrayList arrayList = new ArrayList();
                int size = bxwc.size();
                while (i2 < size) {
                    bzlx bzlx = (bzlx) bxwc.get(i2);
                    Context context = aeuc.f63812c;
                    bxvd bxvd = (bxvd) bzlx.mo74142c(i3);
                    bxvd.mo73625a((GeneratedMessageLite) bzlx);
                    LocationShare a3 = aexx.m52668a(context, bxvd, bzln);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                    i2++;
                    i3 = 5;
                }
                bzmm bzmm2 = bzmw.f170669a;
                if (bzmm2 == null) {
                    bzmm2 = bzmm.f170622e;
                }
                if ((bzmm2.f170624a & 2) == 0) {
                    bnsl bnsl = (bnsl) aeuc.f63815a.mo68387b();
                    bnsl.mo68432a("aeuc", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("No TOS state given in sharing state");
                    i = 1;
                } else {
                    int a4 = bzml.m125933a(bzmm2.f170626c);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i4 = a4 - 1;
                    if (i4 == 1) {
                        int a5 = bzmj.m125931a(bzmm2.f170625b);
                        i = (a5 != 0 && a5 == 2) ? 4 : 2;
                    } else if (i4 != 2) {
                        if (i4 != 3) {
                            bnsl bnsl2 = (bnsl) aeuc.f63815a.mo68387b();
                            bnsl2.mo68432a("aeuc", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Unknown TOS state given in sharing state");
                        }
                        i = 1;
                    } else {
                        int a6 = bzmj.m125931a(bzmm2.f170625b);
                        i = (a6 != 0 && a6 == 2) ? 4 : 3;
                    }
                }
                bzmm bzmm3 = bzmw.f170669a;
                if (bzmm3 == null) {
                    bzmm3 = bzmm.f170622e;
                }
                LocationSharingSettings locationSharingSettings2 = new LocationSharingSettings(z, arrayList, i, bzmm3.f170627d.toLowerCase(Locale.US).equals(Locale.KOREA.getCountry().toLowerCase(Locale.US)));
                aexo.m52653a(aeuc.f63812c, aeuc.f63811b, locationSharingSettings2);
                locationSharingSettings = locationSharingSettings2;
            }
        } catch (ServerError e) {
            bqye.m113758a(e);
            bnsl bnsl3 = (bnsl) aeuc.f63815a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("aeuc", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Error in executing read shares");
            locationSharingSettings = LocationSharingSettings.m66999a(6);
        } catch (NoConnectionError e2) {
            bnsl bnsl4 = (bnsl) aeuc.f63815a.mo68388c();
            bnsl4.mo68437a(e2);
            bnsl4.mo68432a("aeuc", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Error in executing read shares");
            bqye.m113758a(e2);
            locationSharingSettings = LocationSharingSettings.m66999a(5);
        } catch (NetworkError e3) {
            bnsl bnsl5 = (bnsl) aeuc.f63815a.mo68388c();
            bnsl5.mo68437a(e3);
            bnsl5.mo68432a("aeuc", "a", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Error in executing read shares");
            bqye.m113758a(e3);
            locationSharingSettings = LocationSharingSettings.m66999a(5);
        } catch (VolleyError e4) {
            bnsl bnsl6 = (bnsl) aeuc.f63815a.mo68388c();
            bnsl6.mo68437a(e4);
            bnsl6.mo68432a("aeuc", "a", 67, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Error in executing read shares");
            bqye.m113758a(e4);
            locationSharingSettings = LocationSharingSettings.m66999a(5);
        } catch (Exception e5) {
            bqye.m113758a(e5);
            bnsl bnsl7 = (bnsl) aeuc.f63815a.mo68388c();
            bnsl7.mo68437a(e5);
            bnsl7.mo68432a("aeuc", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("Error in executing read shares");
            locationSharingSettings = LocationSharingSettings.m66999a(7);
        }
        if (!locationSharingSettings.mo43767b() && !locationSharingSettings.f79631a.booleanValue() && locationSharingSettings.mo43766a().isEmpty()) {
            locationSharingSettings = new LocationSharingSettings(true, locationSharingSettings.mo43766a(), 2, locationSharingSettings.f79637g.booleanValue());
        }
        if (soz.m35808f(getContext(), ((aesx) this).f63753a)) {
            locationSharingSettings.f79634d = true;
        }
        return locationSharingSettings;
    }
}
