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

/* renamed from: aeuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeuc extends aeub {

    /* renamed from: a */
    public static final srn f63815a = srn.m36127a(sgj.LOCATION_SHARING);

    public aeuc(String str, Context context) {
        super(str, context);
    }

    /* renamed from: a */
    private static int m52556a(bzmm bzmm) {
        if ((bzmm.f170624a & 2) != 0) {
            int a = bzml.m125933a(bzmm.f170626c);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                int a2 = bzmj.m125931a(bzmm.f170625b);
                if (a2 == 0 || a2 != 2) {
                    return 2;
                }
                return 4;
            } else if (i == 2) {
                int a3 = bzmj.m125931a(bzmm.f170625b);
                return (a3 != 0 && a3 == 2) ? 4 : 3;
            } else if (i == 3) {
                return 1;
            } else {
                bnsl bnsl = (bnsl) f63815a.mo68387b();
                bnsl.mo68432a("aeuc", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unknown TOS state given in sharing state");
                return 1;
            }
        } else {
            bnsl bnsl2 = (bnsl) f63815a.mo68387b();
            bnsl2.mo68432a("aeuc", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("No TOS state given in sharing state");
            return 1;
        }
    }

    /* renamed from: a */
    public final LocationSharingSettings mo34567a() {
        boolean z;
        bzmf a = aexp.m52655a(this.f63812c, this.f63811b);
        bxvd da = bzmv.f170662d.mo74144da();
        int i = 0;
        int i2 = 2;
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
            bzmw bzmw = (bzmw) mo34565a((bzmv) da.mo74062i(), bzmw.f170667d, "readshares");
            if (bzmw == null) {
                return LocationSharingSettings.m66999a(7);
            }
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
            while (i < size) {
                bzlx bzlx = (bzlx) bxwc.get(i);
                Context context = this.f63812c;
                bxvd bxvd = (bxvd) bzlx.mo74142c(i3);
                bxvd.mo73625a((GeneratedMessageLite) bzlx);
                LocationShare a3 = aexx.m52668a(context, bxvd, bzln);
                if (a3 != null) {
                    arrayList.add(a3);
                }
                i++;
                i3 = 5;
            }
            bzmm bzmm2 = bzmw.f170669a;
            if (bzmm2 == null) {
                bzmm2 = bzmm.f170622e;
            }
            if ((bzmm2.f170624a & 2) == 0) {
                bnsl bnsl = (bnsl) f63815a.mo68387b();
                bnsl.mo68432a("aeuc", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("No TOS state given in sharing state");
                i2 = 1;
            } else {
                int a4 = bzml.m125933a(bzmm2.f170626c);
                if (a4 == 0) {
                    a4 = 1;
                }
                int i4 = a4 - 1;
                if (i4 == 1) {
                    int a5 = bzmj.m125931a(bzmm2.f170625b);
                    if (a5 != 0 && a5 == 2) {
                        i2 = 4;
                    }
                } else if (i4 != 2) {
                    if (i4 != 3) {
                        bnsl bnsl2 = (bnsl) f63815a.mo68387b();
                        bnsl2.mo68432a("aeuc", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Unknown TOS state given in sharing state");
                    }
                    i2 = 1;
                } else {
                    int a6 = bzmj.m125931a(bzmm2.f170625b);
                    i2 = (a6 != 0 && a6 == 2) ? 4 : 3;
                }
            }
            bzmm bzmm3 = bzmw.f170669a;
            if (bzmm3 == null) {
                bzmm3 = bzmm.f170622e;
            }
            LocationSharingSettings locationSharingSettings = new LocationSharingSettings(z, arrayList, i2, bzmm3.f170627d.toLowerCase(Locale.US).equals(Locale.KOREA.getCountry().toLowerCase(Locale.US)));
            aexo.m52653a(this.f63812c, this.f63811b, locationSharingSettings);
            return locationSharingSettings;
        } catch (ServerError e) {
            bqye.m113758a(e);
            bnsl bnsl3 = (bnsl) f63815a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("aeuc", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Error in executing read shares");
            return LocationSharingSettings.m66999a(6);
        } catch (NoConnectionError e2) {
            bnsl bnsl4 = (bnsl) f63815a.mo68388c();
            bnsl4.mo68437a(e2);
            bnsl4.mo68432a("aeuc", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Error in executing read shares");
            bqye.m113758a(e2);
            return LocationSharingSettings.m66999a(5);
        } catch (NetworkError e3) {
            bnsl bnsl5 = (bnsl) f63815a.mo68388c();
            bnsl5.mo68437a(e3);
            bnsl5.mo68432a("aeuc", "a", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Error in executing read shares");
            bqye.m113758a(e3);
            return LocationSharingSettings.m66999a(5);
        } catch (VolleyError e4) {
            bnsl bnsl6 = (bnsl) f63815a.mo68388c();
            bnsl6.mo68437a(e4);
            bnsl6.mo68432a("aeuc", "a", 67, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Error in executing read shares");
            bqye.m113758a(e4);
            return LocationSharingSettings.m66999a(5);
        } catch (Exception e5) {
            bqye.m113758a(e5);
            bnsl bnsl7 = (bnsl) f63815a.mo68388c();
            bnsl7.mo68437a(e5);
            bnsl7.mo68432a("aeuc", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("Error in executing read shares");
            return LocationSharingSettings.m66999a(7);
        }
    }
}
