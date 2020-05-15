package p000;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.location.WifiScan;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

/* renamed from: bhqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqq {

    /* renamed from: a */
    public static final Random f119344a = new Random();

    /* renamed from: a */
    public static int m101344a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 2) {
            return i != 4 ? 0 : 5;
        }
        return 3;
    }

    /* renamed from: b */
    public static int m101362b(String str) {
        return biag.m101853a(str) ? 3 : 2;
    }

    /* renamed from: c */
    public static bpqk m101365c(int i, PlacesParams placesParams) {
        return m101351a(i, placesParams.f79572b, 0, placesParams.f79576f, placesParams.f79575e, placesParams.f79577g);
    }

    /* renamed from: a */
    public static bonq m101345a(int i, int i2, int i3, PlacesParams placesParams, int i4) {
        bpqk c = m101365c(16, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bxvd da = bppp.f138633q.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bppp bppp = (bppp) da.f164949b;
        int i5 = bppp.f138635a | 4;
        bppp.f138635a = i5;
        bppp.f138638d = i3;
        bppp.f138636b = i - 1;
        int i6 = i5 | 1;
        bppp.f138635a = i6;
        if (i2 != 0) {
            bppp.f138637c = i2 - 1;
            i6 |= 2;
            bppp.f138635a = i6;
        }
        bppp.f138639e = 0;
        int i7 = i6 | 8;
        bppp.f138635a = i7;
        bppp.f138640f = 0;
        int i8 = i7 | 16;
        bppp.f138635a = i8;
        bppp.f138650p = i4 - 1;
        bppp.f138635a = i8 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bppp bppp2 = (bppp) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bpqk bpqk2 = bpqk.f138732w;
        bppp2.getClass();
        bpqk.f138755v = bppp2;
        bpqk.f138734a |= 8388608;
        return m101346a((bpqk) bxvd.mo74062i());
    }

    /* renamed from: b */
    public static bpqk m101363b(int i, PlacesParams placesParams) {
        bpqk c = m101365c(14, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bxvd da = bppy.f138674c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bppy bppy = (bppy) da.f164949b;
        bppy.f138677b = i - 1;
        bppy.f138676a |= 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bppy bppy2 = (bppy) da.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bppy2.getClass();
        bpqk.f138752s = bppy2;
        bpqk.f138734a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: b */
    public static bpqk m101364b(PlacesParams placesParams, boolean z) {
        return m101354a(placesParams, !z ? 5 : 4);
    }

    /* renamed from: a */
    public static bonq m101346a(bpqk bpqk) {
        bxvd da = bonq.f133833p.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bonq bonq = (bonq) da.f164949b;
        bonq.f133836b = 1;
        int i = 1 | bonq.f133835a;
        bonq.f133835a = i;
        bpqk.getClass();
        bonq.f133837c = bpqk;
        bonq.f133835a = i | 2;
        return (bonq) da.mo74062i();
    }

    /* renamed from: a */
    public static bpov m101347a(int i, String str) {
        bxvd da = bpov.f138576d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpov bpov = (bpov) da.f164949b;
        bpov.f138580c = i - 1;
        bpov.f138578a |= 2;
        if (str != null) {
            bpov bpov2 = (bpov) da.f164949b;
            str.getClass();
            bpov2.f138578a |= 1;
            bpov2.f138579b = str;
        }
        return (bpov) da.mo74062i();
    }

    /* renamed from: a */
    public static bppt m101348a(Collection collection, boolean z) {
        bpps bpps = (bpps) bppt.f138657d.mo74144da();
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                bpps.mo68970a(bhqm.m101334a(((Integer) it.next()).intValue()));
            }
        }
        if (bpps.f164950c) {
            bpps.mo74035c();
            bpps.f164950c = false;
        }
        bppt bppt = (bppt) bpps.f164949b;
        bppt.f138659a |= 8;
        bppt.f138661c = z;
        return (bppt) bpps.mo74062i();
    }

    /* renamed from: a */
    public static bpqk m101349a(int i, int i2, PlacesParams placesParams) {
        bpqk c = m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bprg a = m101359a(5, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        bxvd da = bpqo.f138768d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpqo bpqo = (bpqo) da.f164949b;
        int i3 = bpqo.f138770a | 2;
        bpqo.f138770a = i3;
        bpqo.f138772c = i;
        bpqo.f138771b = i2 - 1;
        bpqo.f138770a = i3 | 1;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bpqo bpqo2 = (bpqo) da.mo74062i();
        bprg bprg2 = bprg.f138829s;
        bpqo2.getClass();
        bprg.f138838h = bpqo2;
        bprg.f138831a |= 128;
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

    /* renamed from: a */
    public static bpqk m101350a(int i, PlacesParams placesParams) {
        bpqk c = m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bprg a = m101359a(13, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        bxvd da = bpqz.f138811c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpqz bpqz = (bpqz) da.f164949b;
        bpqz.f138813a = 1 | bpqz.f138813a;
        bpqz.f138814b = i;
        bpqz bpqz2 = (bpqz) da.mo74062i();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bprg bprg2 = bprg.f138829s;
        bpqz2.getClass();
        bprg.f138846p = bpqz2;
        bprg.f138831a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
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

    /* renamed from: a */
    public static bpqk m101351a(int i, String str, int i2, int i3, String str2, int i4) {
        bxvd da = bpqk.f138732w.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpqk bpqk = (bpqk) da.f164949b;
        bpqk.f138736c = i;
        bpqk.f138734a |= 2;
        bxvd da2 = bpkf.f137938j.mo74144da();
        if (str != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpkf bpkf = (bpkf) da2.f164949b;
            str.getClass();
            bpkf.f137940a |= 1;
            bpkf.f137941b = str;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpkf bpkf2 = (bpkf) da2.f164949b;
        int i5 = bpkf2.f137940a | 2;
        bpkf2.f137940a = i5;
        bpkf2.f137942c = i2;
        int i6 = i5 | 4;
        bpkf2.f137940a = i6;
        bpkf2.f137943d = i3;
        if (str2 != null) {
            str2.getClass();
            i6 |= 8;
            bpkf2.f137940a = i6;
            bpkf2.f137944e = str2;
        }
        bpkf2.f137940a = i6 | 16;
        bpkf2.f137945f = i4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpqk bpqk2 = (bpqk) da.f164949b;
        bpkf bpkf3 = (bpkf) da2.mo74062i();
        bpkf3.getClass();
        bpqk2.f138737d = bpkf3;
        bpqk2.f138734a |= 4;
        return (bpqk) da.mo74062i();
    }

    /* renamed from: a */
    public static bpqk m101352a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, boolean z) {
        bpph bpph;
        bpqk c = m101365c(7, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bxvd da = bpqy.f138801i.mo74144da();
        int i = 2;
        if (nearbyAlertRequest != null) {
            NearbyAlertFilter nearbyAlertFilter = nearbyAlertRequest.f79469c;
            bxvd da2 = bpph.f138620f.mo74144da();
            int i2 = 1;
            if (nearbyAlertFilter == null) {
                bpph = (bpph) da2.mo74062i();
            } else {
                String str = nearbyAlertFilter.f79463c;
                if (str != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpph bpph2 = (bpph) da2.f164949b;
                    str.getClass();
                    bpph2.f138622a |= 1;
                    bpph2.f138624c = str;
                }
                boolean z2 = nearbyAlertFilter.f79464d;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpph bpph3 = (bpph) da2.f164949b;
                bpph3.f138622a |= 2;
                bpph3.f138625d = z2;
                if (!nearbyAlertFilter.f79465e.isEmpty()) {
                    int size = nearbyAlertFilter.f79465e.size();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpph bpph4 = (bpph) da2.f164949b;
                    bpph4.f138622a |= 4;
                    bpph4.f138626e = size;
                }
                if (!nearbyAlertFilter.f79466f.isEmpty()) {
                    Set set = nearbyAlertFilter.f79466f;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpph bpph5 = (bpph) da2.f164949b;
                    if (!bpph5.f138623b.mo73666a()) {
                        bpph5.f138623b = bxvk.m124019a(bpph5.f138623b);
                    }
                    bxsy.m123078a(set, bpph5.f138623b);
                }
                bpph = (bpph) da2.mo74062i();
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpqy bpqy = (bpqy) da.f164949b;
            bpph.getClass();
            bpqy.f138804b = bpph;
            bpqy.f138803a |= 1;
            int a = m101344a(nearbyAlertRequest.f79471e);
            if (a != 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpqy bpqy2 = (bpqy) da.f164949b;
                bpqy2.f138805c = a - 1;
                bpqy2.f138803a |= 4;
            }
            int i3 = nearbyAlertRequest.f79467a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpqy bpqy3 = (bpqy) da.f164949b;
            int i4 = bpqy3.f138803a | 64;
            bpqy3.f138803a = i4;
            bpqy3.f138809g = i3;
            boolean z3 = nearbyAlertRequest.f79470d;
            int i5 = i4 | 8;
            bpqy3.f138803a = i5;
            bpqy3.f138806d = z3;
            int i6 = nearbyAlertRequest.f79468b;
            int i7 = i5 | 16;
            bpqy3.f138803a = i7;
            bpqy3.f138807e = (long) i6;
            int i8 = nearbyAlertRequest.f79472f;
            if (i8 != -1) {
                if (i8 != 100) {
                    i2 = i8 != 110 ? 2 : AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                } else {
                    i2 = 102;
                }
            }
            bpqy3.f138808f = i2 - 2;
            bpqy3.f138803a = i7 | 32;
        }
        if (!z) {
            i = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpqy bpqy4 = (bpqy) da.f164949b;
        bpqy4.f138810h = i - 1;
        bpqy4.f138803a |= 128;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bpqy bpqy5 = (bpqy) da.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bpqy5.getClass();
        bpqk.f138747n = bpqy5;
        bpqk.f138734a |= 2048;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static bpqk m101353a(PlaceFilter placeFilter, PlacesParams placesParams) {
        bpqk c = m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bprg a = m101359a(3, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        bppt a2 = m101348a(placeFilter.f79477e, placeFilter.f79474b);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bprg bprg2 = bprg.f138829s;
        a2.getClass();
        bprg.f138835e = a2;
        bprg.f138831a |= 8;
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

    /* renamed from: a */
    public static bpqk m101354a(PlacesParams placesParams, int i) {
        bpqk c = m101365c(17, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bxvd da = bprw.f138909d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bprw bprw = (bprw) da.f164949b;
        bprw.f138912b = i - 1;
        bprw.f138911a |= 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bprw bprw2 = (bprw) da.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bprw2.getClass();
        bpqk.f138754u = bprw2;
        bpqk.f138734a |= 1048576;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static bpqk m101355a(PlacesParams placesParams, List list) {
        bpqk c = m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bprg a = m101359a(7, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        bpqm bpqm = (bpqm) bpqn.f138765b.mo74144da();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ("Home".equals(str)) {
                bpqm.mo68972a(bpot.HOME);
            } else if ("Work".equals(str)) {
                bpqm.mo68972a(bpot.WORK);
            } else {
                bpqm.mo68972a(bpot.NICKNAME);
            }
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bpqn bpqn = (bpqn) bpqm.mo74062i();
        bprg bprg2 = bprg.f138829s;
        bpqn.getClass();
        bprg.f138840j = bpqn;
        bprg.f138831a |= 512;
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

    /* renamed from: a */
    public static bpqk m101356a(PlacesParams placesParams, boolean z) {
        return m101354a(placesParams, !z ? 3 : 2);
    }

    /* renamed from: a */
    public static bpqk m101357a(Integer num, Long l, PlacesParams placesParams, boolean z) {
        bpqk c = m101365c(9, placesParams);
        int i = 5;
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bxvd da = bprd.f138822e.mo74144da();
        int i2 = 3;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 100) {
                i = 2;
            } else if (intValue == 102) {
                i = 3;
            } else if (intValue == 104) {
                i = 4;
            } else if (intValue != 105) {
                i = 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bprd bprd = (bprd) da.f164949b;
            bprd.f138825b = i - 1;
            bprd.f138824a |= 1;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bprd bprd2 = (bprd) da.f164949b;
            bprd2.f138824a |= 2;
            bprd2.f138826c = longValue;
        }
        if (z) {
            i2 = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bprd bprd3 = (bprd) da.f164949b;
        bprd3.f138827d = i2 - 1;
        bprd3.f138824a |= 4;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bprd bprd4 = (bprd) da.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bprd4.getClass();
        bpqk.f138749p = bprd4;
        bpqk.f138734a |= 8192;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static bpqk m101358a(List list, PlacesParams placesParams) {
        bpqk c = m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bprg a = m101359a(12, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        bxvd da = bpri.f138855b.mo74144da();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpri bpri = (bpri) da.f164949b;
                str.getClass();
                if (!bpri.f138857a.mo73666a()) {
                    bpri.f138857a = bxvk.m124021a(bpri.f138857a);
                }
                bpri.f138857a.add(str);
            }
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bpri bpri2 = (bpri) da.mo74062i();
        bprg bprg2 = bprg.f138829s;
        bpri2.getClass();
        bprg.f138845o = bpri2;
        bprg.f138831a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
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

    /* renamed from: a */
    public static bprg m101359a(int i, String str, String str2) {
        bxvd da = bprg.f138829s.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bprg bprg = (bprg) da.f164949b;
        bprg.f138832b = i - 1;
        bprg.f138831a |= 1;
        if (str != null) {
            bprg bprg2 = (bprg) da.f164949b;
            str.getClass();
            bprg2.f138831a |= 2;
            bprg2.f138833c = str;
        }
        if (str != null && !str.equals(str2)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bprg bprg3 = (bprg) da.f164949b;
            str2.getClass();
            bprg3.f138831a |= 4;
            bprg3.f138834d = str2;
        }
        return (bprg) da.mo74062i();
    }

    /* renamed from: a */
    public static String m101360a(String str) {
        return !str.matches("_.+_") ? "realchain" : str;
    }

    /* renamed from: a */
    public static void m101361a(bxvd bxvd, Location location, WifiScan wifiScan) {
        bxvd da = bplh.f138088d.mo74144da();
        int latitude = (int) (location.getLatitude() * 1.0E7d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bplh bplh = (bplh) da.f164949b;
        bplh.f138090a |= 1;
        bplh.f138091b = latitude;
        int longitude = (int) (location.getLongitude() * 1.0E7d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bplh bplh2 = (bplh) da.f164949b;
        bplh2.f138090a |= 2;
        bplh2.f138092c = longitude;
        bplh bplh3 = (bplh) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bpqk bpqk2 = bpqk.f138732w;
        bplh3.getClass();
        bpqk.f138738e = bplh3;
        bpqk.f138734a |= 8;
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpqk bpqk3 = (bpqk) bxvd.f164949b;
            bpqk3.f138734a |= 32;
            bpqk3.f138740g = accuracy;
        }
        Bundle extras = location.getExtras();
        if (extras != null && extras.containsKey("locationType")) {
            int i = extras.getInt("locationType");
            int i2 = 3;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = 4;
            } else if (i != 3) {
                i2 = 1;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpqk bpqk4 = (bpqk) bxvd.f164949b;
            bpqk4.f138739f = i2 - 1;
            bpqk4.f138734a |= 16;
        }
        if (wifiScan != null) {
            bprz[] bprzArr = new bprz[wifiScan.mo43592a()];
            for (int i3 = 0; i3 < wifiScan.mo43592a(); i3++) {
                bxvd da2 = bprz.f138920d.mo74144da();
                long a = wifiScan.mo43593a(i3);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bprz bprz = (bprz) da2.f164949b;
                bprz.f138922a |= 1;
                bprz.f138923b = a;
                byte b = wifiScan.mo43594b(i3);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bprz bprz2 = (bprz) da2.f164949b;
                bprz2.f138922a |= 2;
                bprz2.f138924c = b;
                bprzArr[i3] = (bprz) da2.mo74062i();
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((bpqk) bxvd.f164949b).f138741h = bxvk.m124030de();
            List asList = Arrays.asList(bprzArr);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpqk bpqk5 = (bpqk) bxvd.f164949b;
            if (!bpqk5.f138741h.mo73666a()) {
                bpqk5.f138741h = bxvk.m124021a(bpqk5.f138741h);
            }
            bxsy.m123078a(asList, bpqk5.f138741h);
        }
    }
}
