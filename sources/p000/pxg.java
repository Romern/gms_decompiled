package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.android.volley.DefaultRetryPolicy;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

/* renamed from: pxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pxg extends ptu implements aaai {

    /* renamed from: a */
    private final pwp f40562a;

    /* renamed from: b */
    private final aaag f40563b;

    /* renamed from: c */
    private final phy f40564c;

    public pxg(pwp pwp, aaag aaag, phy phy) {
        this.f40562a = pwp;
        this.f40563b = aaag;
        this.f40564c = phy;
    }

    /* renamed from: a */
    public final void mo23664a(ptn ptn, String[] strArr) {
        try {
            Bundle bundle = new Bundle();
            for (String str : strArr) {
                int hashCode = str.hashCode();
                char c = 65535;
                if (hashCode != -1725214057) {
                    if (hashCode != -468278332) {
                        if (hashCode == -346381191) {
                            if (str.equals("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED")) {
                                c = 2;
                            }
                        }
                    } else if (str.equals("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE")) {
                        c = 1;
                    }
                } else if (str.equals("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED")) {
                    c = 0;
                }
                if (c == 0) {
                    bundle.putBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", ccxd.f180145a.mo6606a().mo76966b());
                } else if (c == 1) {
                    bundle.putLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", ccxd.f180145a.mo6606a().mo76970f());
                } else if (c == 2) {
                    bundle.putBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", ccxd.f180145a.mo6606a().mo76965a());
                }
            }
            ptn.mo23644a(bundle);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: b */
    public final void mo23668b(ptn ptn, String[] strArr) {
        String[] strArr2 = strArr;
        try {
            Bundle bundle = new Bundle();
            phz phz = new phz();
            for (String str : strArr2) {
                int hashCode = str.hashCode();
                char c = 65535;
                if (hashCode != 955451728) {
                    if (hashCode == 2009488005) {
                        if (str.equals("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR")) {
                            c = 0;
                        }
                    }
                } else if (str.equals("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON")) {
                    c = 1;
                }
                if (c == 0) {
                    if (phz.f39169a) {
                        bnha h = bnhe.m109414h();
                        h.mo67695b(0, 34);
                        h.mo67695b(7, 2);
                        h.mo67695b(15, 4);
                        h.mo67695b(2000, 6);
                        h.mo67695b(2002, 14);
                        h.mo67695b(2003, 20);
                        h.mo67695b(2004, 21);
                        h.mo67695b(2005, 22);
                        h.mo67695b(2100, 35);
                        h.mo67695b(2103, 35);
                        h.mo67695b(2104, 35);
                        h.mo67695b(2200, 32);
                        h.mo67695b(2201, 32);
                        h.mo67695b(2202, 32);
                        h.mo67695b(2203, 32);
                        h.mo67695b(2204, 32);
                        h.mo67695b(2205, 32);
                        h.mo67695b(2206, 32);
                        h.mo67695b(2207, 32);
                        h.mo67695b(2208, 32);
                        h.mo67695b(2209, 32);
                        h.mo67695b(2210, 32);
                        h.mo67695b(2300, 34);
                        h.mo67695b(2301, 36);
                        h.mo67695b(2400, 5);
                        h.mo67695b(2401, 5);
                        h.mo67695b(2402, 5);
                        h.mo67695b(2403, 5);
                        h.mo67695b(2404, 5);
                        h.mo67695b(2405, 5);
                        h.mo67695b(2406, 5);
                        h.mo67695b(Integer.valueOf((int) DefaultRetryPolicy.DEFAULT_TIMEOUT_MS), 37);
                        h.mo67695b(2501, 37);
                        h.mo67695b(2502, 13);
                        h.mo67695b(2503, 13);
                        h.mo67695b(2504, 13);
                        h.mo67695b(2505, 13);
                        h.mo67695b(2506, 13);
                        h.mo67695b(2507, 13);
                        h.mo67695b(2508, 13);
                        h.mo67695b(2509, 13);
                        h.mo67695b(2600, 38);
                        h.mo67695b(2601, 39);
                        h.mo67695b(2602, 39);
                        h.mo67695b(2603, 39);
                        h.mo67695b(2604, 39);
                        h.mo67695b(2605, 39);
                        h.mo67695b(2606, 39);
                        h.mo67695b(2607, 39);
                        h.mo67695b(2608, 39);
                        h.mo67695b(2700, 40);
                        h.mo67695b(2701, 40);
                        h.mo67695b(2702, 40);
                        h.mo67695b(2703, 40);
                        h.mo67695b(2704, 40);
                        h.mo67695b(2705, 40);
                        h.mo67695b(2706, 40);
                        h.mo67695b(2707, 40);
                        h.mo67695b(2708, 40);
                        h.mo67695b(2800, 28);
                        h.mo67695b(2801, 28);
                        h.mo67695b(2802, 26);
                        h.mo67695b(2803, 27);
                        h.mo67695b(2804, 28);
                        h.mo67695b(2805, 28);
                        h.mo67695b(2806, 28);
                        h.mo67695b(2900, 41);
                        h.mo67695b(2901, 42);
                        h.mo67695b(2902, 42);
                        h.mo67695b(2903, 42);
                        h.mo67695b(3000, 33);
                        h.mo67695b(3001, 33);
                        h.mo67695b(3002, 33);
                        h.mo67695b(3003, 33);
                        h.mo67695b(3100, 43);
                        h.mo67695b(3101, 44);
                        h.mo67695b(3102, 45);
                        h.mo67695b(3103, 46);
                        phz.f39170b = h.mo67618b();
                    }
                    bundle.putSerializable("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", phz.f39170b);
                } else if (c == 1) {
                    if (phz.f39169a) {
                        bnha h2 = bnhe.m109414h();
                        h2.mo67695b(2, 12);
                        h2.mo67695b(1, 13);
                        h2.mo67695b(2005, 8);
                        h2.mo67695b(2900, 14);
                        h2.mo67695b(2016, 15);
                        phz.f39171c = h2.mo67618b();
                    }
                    bundle.putSerializable("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", phz.f39171c);
                }
            }
            ptn.mo23644a(bundle);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo23665a(rnt rnt) {
        int i;
        try {
            if (!ccyt.f180279a.mo6606a().mo77085d()) {
                i = 2003;
            } else {
                i = 0;
            }
            rnt.mo11797a(new Status(i));
        } catch (RemoteException e) {
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo23666a(rnt rnt, String[] strArr, String str) {
        mo23667a(rnt, strArr, str, null);
    }

    /* renamed from: a */
    public final void mo23667a(rnt rnt, String[] strArr, String str, List list) {
        if ((list == null || list.isEmpty()) && str == null) {
            rnt.mo11797a(new Status(3000));
        }
        if (!cdav.f180395a.mo6606a().mo77177a()) {
            try {
                rnt.mo11797a(new Status(3001));
            } catch (RemoteException e) {
            }
        } else {
            this.f40563b.mo16658a(new pxf(this.f40562a, Arrays.asList(strArr), str, list, rnt, this.f40564c));
        }
    }
}
