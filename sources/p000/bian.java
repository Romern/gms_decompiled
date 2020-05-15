package p000;

import android.content.Context;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: bian */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bian {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if ((r0 & 2) == 0) goto L_0x000e;
     */
    /* renamed from: a */
    public static bhzs m101864a(bvog bvog) {
        float f;
        if (bvog != null) {
            int i = bvog.f157032a;
            if ((i & 1) != 0) {
            }
        }
        if (Log.isLoggable("Places", 6)) {
            bioi.m102658a("Places", "PlaceLocation does not have placeId or location");
        }
        float f2 = bvog.f157035d;
        if (f2 != 0.0f) {
            f = f2;
        } else {
            f = 80.0f;
        }
        String str = bvog.f157033b;
        bzrv bzrv = bvog.f157034c;
        if (bzrv == null) {
            bzrv = bzrv.f171206c;
        }
        double d = bzrv.f171208a;
        bzrv bzrv2 = bvog.f157034c;
        if (bzrv2 == null) {
            bzrv2 = bzrv.f171206c;
        }
        return new bhzs(str, d, bzrv2.f171209b, f);
    }

    /* renamed from: b */
    public static List m101878b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlaceOpeningHoursEntity.BusinessHoursInterval businessHoursInterval = (PlaceOpeningHoursEntity.BusinessHoursInterval) it.next();
            bxvd da = bvon.f157057d.mo74144da();
            int i = businessHoursInterval.f79562a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvon bvon = (bvon) da.f164949b;
            int i2 = bvon.f157059a | 1;
            bvon.f157059a = i2;
            bvon.f157060b = i;
            int i3 = businessHoursInterval.f79563b;
            bvon.f157059a = i2 | 2;
            bvon.f157061c = i3;
            arrayList.add((bvon) da.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static bvle m101865a(Context context, String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, PlacesParams placesParams) {
        bxvd da = bvle.f156515h.mo74144da();
        bvov a = m101870a(context, placesParams);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvle bvle = (bvle) da.f164949b;
        a.getClass();
        bvle.f156518b = a;
        int i2 = bvle.f156517a | 1;
        bvle.f156517a = i2;
        str.getClass();
        bvle.f156517a = i2 | 8;
        bvle.f156521e = str;
        if (placesParams.f79577g == 3) {
            int b = (int) cggj.m145235b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvle bvle2 = (bvle) da.f164949b;
            bvle2.f156517a |= 16;
            bvle2.f156522f = b;
        }
        if (latLngBounds != null) {
            bvme a2 = m101869a(latLngBounds);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvle bvle3 = (bvle) da.f164949b;
            a2.getClass();
            bvle3.f156520d = a2;
            bvle3.f156517a |= 4;
        }
        if (i == 2) {
            bvle bvle4 = (bvle) da.f164949b;
            bvle4.f156517a |= 32;
            bvle4.f156523g = true;
        }
        if (autocompleteFilter != null) {
            bxvd da2 = bvla.f156499e.mo74144da();
            boolean z = !autocompleteFilter.f79457b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvla bvla = (bvla) da2.f164949b;
            bvla.f156501a |= 1;
            bvla.f156502b = z;
            String b2 = bhqm.m101336b(autocompleteFilter.f79460e);
            if (b2 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvla bvla2 = (bvla) da2.f164949b;
                b2.getClass();
                if (!bvla2.f156503c.mo73666a()) {
                    bvla2.f156503c = GeneratedMessageLite.m124021a(bvla2.f156503c);
                }
                bvla2.f156503c.add(b2);
            }
            String str2 = autocompleteFilter.f79459d;
            if (str2 != null && str2.length() > 0) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvla bvla3 = (bvla) da2.f164949b;
                str2.getClass();
                bvla3.f156501a |= 2;
                bvla3.f156504d = str2;
            }
            bvla bvla4 = (bvla) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvle bvle5 = (bvle) da.f164949b;
            bvla4.getClass();
            bvle5.f156519c = bvla4;
            bvle5.f156517a = 2 | bvle5.f156517a;
        }
        return (bvle) da.mo74062i();
    }

    /* renamed from: a */
    public static bvli m101866a(Context context, LatLngBounds latLngBounds, int i, List list, PlacesParams placesParams) {
        bxvd da = bvli.f156540f.mo74144da();
        bvov a = m101870a(context, placesParams);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvli bvli = (bvli) da.f164949b;
        a.getClass();
        bvli.f156543b = a;
        bvli.f156542a |= 1;
        if (!bvli.f156544c.mo73666a()) {
            bvli.f156544c = GeneratedMessageLite.m124021a(bvli.f156544c);
        }
        bxsy.m123078a(list, bvli.f156544c);
        bvme a2 = m101869a(latLngBounds);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvli bvli2 = (bvli) da.f164949b;
        a2.getClass();
        bvli2.f156545d = a2;
        int i2 = bvli2.f156542a | 2;
        bvli2.f156542a = i2;
        bvli2.f156542a = i2 | 4;
        bvli2.f156546e = i;
        return (bvli) da.mo74062i();
    }

    /* renamed from: a */
    public static bvlm m101867a(Context context, List list, int i, PlacesParams placesParams) {
        bxvd da = bvlm.f156564e.mo74144da();
        bvov a = m101870a(context, placesParams);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvlm bvlm = (bvlm) da.f164949b;
        a.getClass();
        bvlm.f156567b = a;
        bvlm.f156566a |= 1;
        if (!bvlm.f156568c.mo73666a()) {
            bvlm.f156568c = GeneratedMessageLite.m124021a(bvlm.f156568c);
        }
        bxsy.m123078a(list, bvlm.f156568c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvlm bvlm2 = (bvlm) da.f164949b;
        bvlm2.f156566a |= 2;
        bvlm2.f156569d = i;
        return (bvlm) da.mo74062i();
    }

    /* renamed from: a */
    public static bvlx m101868a(Context context, LatLng latLng, int i, boolean z, PlacesParams placesParams) {
        bxvd da = bvlx.f156613f.mo74144da();
        bvov a = m101870a(context, placesParams);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvlx bvlx = (bvlx) da.f164949b;
        a.getClass();
        bvlx.f156616b = a;
        bvlx.f156615a |= 1;
        bzrv a2 = m101871a(latLng);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvlx bvlx2 = (bvlx) da.f164949b;
        a2.getClass();
        bvlx2.f156617c = a2;
        int i2 = bvlx2.f156615a | 2;
        bvlx2.f156615a = i2;
        bvlx2.f156615a = i2 | 4;
        bvlx2.f156618d = i;
        if (z && m101874a(context) != null) {
            List a3 = m101874a(context);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvlx bvlx3 = (bvlx) da.f164949b;
            if (!bvlx3.f156619e.mo73666a()) {
                bvlx3.f156619e = GeneratedMessageLite.m124021a(bvlx3.f156619e);
            }
            bxsy.m123078a(a3, bvlx3.f156619e);
        }
        return (bvlx) da.mo74062i();
    }

    /* renamed from: a */
    public static bvme m101869a(LatLngBounds latLngBounds) {
        bxvd da = bvme.f156645d.mo74144da();
        bzrv a = m101871a(latLngBounds.f79897b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvme bvme = (bvme) da.f164949b;
        a.getClass();
        bvme.f156649c = a;
        bvme.f156647a |= 2;
        bzrv a2 = m101871a(latLngBounds.f79896a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvme bvme2 = (bvme) da.f164949b;
        a2.getClass();
        bvme2.f156648b = a2;
        bvme2.f156647a |= 1;
        return (bvme) da.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4  */
    /* renamed from: a */
    public static bvov m101870a(Context context, PlacesParams placesParams) {
        String a;
        bxvd da = bvov.f157222g.mo74144da();
        String str = placesParams.f79573c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvov bvov = (bvov) da.f164949b;
        str.getClass();
        int i = 4;
        bvov.f157224a |= 4;
        bvov.f157227d = str;
        String valueOf = String.valueOf(Build.FINGERPRINT);
        String str2 = valueOf.length() == 0 ? new String("android/") : "android/".concat(valueOf);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvov bvov2 = (bvov) da.f164949b;
        str2.getClass();
        bvov2.f157224a |= 1;
        bvov2.f157225b = str2;
        bxvd da2 = bvou.f157218c.mo74144da();
        int i2 = placesParams.f79577g;
        if (i2 != 0) {
            if (i2 == 1) {
                i = 2;
            } else if (i2 == 2) {
                i = 3;
            } else if (i2 != 3) {
                if (Log.isLoggable("Places", 6)) {
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Unknown request source ");
                    sb.append(i2);
                    bioi.m102658a("Places", sb.toString());
                    i = 1;
                }
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvou bvou = (bvou) da2.f164949b;
            bvou.f157221b = i - 1;
            bvou.f157220a |= 1;
            bvou bvou2 = (bvou) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvov bvov3 = (bvov) da.f164949b;
            bvou2.getClass();
            bvov3.f157228e = bvou2;
            bvov3.f157224a |= 8;
            int i3 = ModuleManager.get(context).getCurrentModule().moduleVersion;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvov bvov4 = (bvov) da.f164949b;
            bvov4.f157224a |= 32;
            bvov4.f157229f = i3;
            a = bhqp.m101339a(context.getApplicationContext()).mo64167a();
            if (!TextUtils.isEmpty(a)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvov bvov5 = (bvov) da.f164949b;
                a.getClass();
                bvov5.f157224a |= 2;
                bvov5.f157226c = a;
            }
            return (bvov) da.mo74062i();
        }
        i = 1;
        if (da2.f164950c) {
        }
        bvou bvou3 = (bvou) da2.f164949b;
        bvou3.f157221b = i - 1;
        bvou3.f157220a |= 1;
        bvou bvou22 = (bvou) da2.mo74062i();
        if (da.f164950c) {
        }
        bvov bvov32 = (bvov) da.f164949b;
        bvou22.getClass();
        bvov32.f157228e = bvou22;
        bvov32.f157224a |= 8;
        int i32 = ModuleManager.get(context).getCurrentModule().moduleVersion;
        if (da.f164950c) {
        }
        bvov bvov42 = (bvov) da.f164949b;
        bvov42.f157224a |= 32;
        bvov42.f157229f = i32;
        a = bhqp.m101339a(context.getApplicationContext()).mo64167a();
        if (!TextUtils.isEmpty(a)) {
        }
        return (bvov) da.mo74062i();
    }

    /* renamed from: a */
    public static bzrv m101871a(LatLng latLng) {
        bxvd da = bzrv.f171206c.mo74144da();
        double d = latLng.f79894a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzrv bzrv = (bzrv) da.f164949b;
        bzrv.f171208a = d;
        bzrv.f171209b = latLng.f79895b;
        return (bzrv) da.mo74062i();
    }

    /* renamed from: a */
    public static PlaceEntity m101872a(bvmv bvmv) {
        LatLngBounds latLngBounds;
        Uri uri;
        boolean z;
        float f;
        int i;
        float f2;
        int i2;
        Locale locale;
        char c;
        bvoh bvoh;
        float f3;
        int i3;
        int i4;
        int i5;
        int i6;
        bvmv bvmv2 = bvmv;
        PlaceOpeningHoursEntity placeOpeningHoursEntity = null;
        if (bvmv2 != null) {
            int i7 = bvmv2.f156800a;
            if ((i7 & 1) == 0) {
                if (Log.isLoggable("Places", 6)) {
                    bioi.m102658a("Places", "received place lacks id");
                }
                return null;
            } else if ((i7 & 32) != 0) {
                bvmx bvmx = bvmv2.f156808i;
                if (bvmx == null) {
                    bvmx = bvmx.f156821d;
                }
                int i8 = 1;
                if ((bvmx.f156823a & 1) == 0) {
                    if (Log.isLoggable("Places", 6)) {
                        bioi.m102658a("Places", "received place lacks latlng");
                    }
                    return null;
                }
                String str = bvmv2.f156801b;
                int size = bvmv2.f156802c.size();
                List arrayList = new ArrayList(size);
                int i9 = 0;
                if (size != 0) {
                    bxwc bxwc = bvmv2.f156802c;
                    int size2 = bxwc.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        arrayList.add(Integer.valueOf(bhqm.m101333a((String) bxwc.get(i10))));
                    }
                } else {
                    if (Log.isLoggable("Places", 5)) {
                        bioi.m102662c("Places", "place is missing type. Defaulting to 'other'");
                    }
                    arrayList = Collections.singletonList(0);
                }
                bvmx bvmx2 = bvmv2.f156808i;
                if (bvmx2 == null) {
                    bvmx2 = bvmx.f156821d;
                }
                bzrv bzrv = bvmx2.f156824b;
                if (bzrv == null) {
                    bzrv = bzrv.f171206c;
                }
                LatLng a = m101873a(bzrv);
                if ((bvmx2.f156823a & 2) != 0) {
                    bvme bvme = bvmx2.f156825c;
                    if (bvme == null) {
                        bvme = bvme.f156645d;
                    }
                    bzrv bzrv2 = bvme.f156648b;
                    if (bzrv2 == null) {
                        bzrv2 = bzrv.f171206c;
                    }
                    LatLng a2 = m101873a(bzrv2);
                    bzrv bzrv3 = bvme.f156649c;
                    if (bzrv3 == null) {
                        bzrv3 = bzrv.f171206c;
                    }
                    latLngBounds = new LatLngBounds(a2, m101873a(bzrv3));
                } else {
                    latLngBounds = null;
                }
                if ((bvmv2.f156800a & 64) != 0) {
                    uri = Uri.parse(bvmv2.f156809j);
                } else {
                    uri = null;
                }
                int i11 = bvmv2.f156800a;
                if ((i11 & 128) == 0 || !bvmv2.f156810k) {
                    z = false;
                } else {
                    z = true;
                }
                if ((i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    f = bvmv2.f156811l;
                } else {
                    f = -1.0f;
                }
                if ((i11 & 512) != 0) {
                    i = bvmv2.f156812m;
                } else {
                    i = -1;
                }
                if ((i11 & 4096) != 0) {
                    bvoh bvoh2 = bvmv2.f156814o;
                    if (bvoh2 != null) {
                        bvoh = bvoh2;
                    } else {
                        bvoh = bvoh.f157036c;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    bxwc bxwc2 = bvoh.f157038a;
                    int size3 = bxwc2.size();
                    while (i9 < size3) {
                        float f4 = f;
                        int i12 = i;
                        bvon bvon = (bvon) bxwc2.get(i9);
                        int i13 = bvon.f157059a;
                        if (!((i13 & 1) == 0 || (i13 & 2) == 0)) {
                            arrayList2.add(PlaceOpeningHoursEntity.BusinessHoursInterval.m66966a(bvon.f157060b, bvon.f157061c));
                        }
                        i9++;
                        i = i12;
                        f = f4;
                        i8 = 1;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    bxwc bxwc3 = bvoh.f157039b;
                    int size4 = bxwc3.size();
                    int i14 = 0;
                    while (i14 < size4) {
                        bvom bvom = (bvom) bxwc3.get(i14);
                        bxwc bxwc4 = bxwc3;
                        if ((bvom.f157054a & i8) == 0) {
                            i4 = size4;
                            f3 = f;
                            i3 = i;
                        } else {
                            bvol bvol = bvom.f157055b;
                            if (bvol == null) {
                                bvol = bvol.f157047d;
                            }
                            int i15 = bvol.f157049a;
                            if ((i15 & 1) == 0 || (i15 & 2) == 0) {
                                i4 = size4;
                            } else {
                                bvok bvok = bvol.f157050b;
                                if (bvok == null) {
                                    bvok = bvok.f157041e;
                                }
                                bvok bvok2 = bvol.f157051c;
                                if (bvok2 == null) {
                                    bvok2 = bvok.f157041e;
                                }
                                i4 = size4;
                                int i16 = bvok.f157043a;
                                if (!((i16 & 1) == 0 || (i16 & 2) == 0 || (i16 & 4) == 0)) {
                                    int i17 = bvok2.f157043a;
                                    if (!((i17 & 1) == 0 || (i17 & 2) == 0 || (i17 & 4) == 0)) {
                                        ArrayList arrayList4 = new ArrayList();
                                        bxwc bxwc5 = bvom.f157056c;
                                        i3 = i;
                                        int size5 = bxwc5.size();
                                        f3 = f;
                                        int i18 = 0;
                                        while (i18 < size5) {
                                            bxwc bxwc6 = bxwc5;
                                            bvon bvon2 = (bvon) bxwc5.get(i18);
                                            int i19 = size5;
                                            int i20 = bvon2.f157059a;
                                            if (!((i20 & 1) == 0 || (i20 & 2) == 0)) {
                                                arrayList4.add(PlaceOpeningHoursEntity.BusinessHoursInterval.m66966a(bvon2.f157060b, bvon2.f157061c));
                                            }
                                            i18++;
                                            size5 = i19;
                                            bxwc5 = bxwc6;
                                        }
                                        int i21 = bvok.f157046d;
                                        int a3 = bvoj.m121317a(bvok.f157045c);
                                        if (a3 != 0) {
                                            i5 = a3;
                                        } else {
                                            i5 = 1;
                                        }
                                        int i22 = bvok.f157044b;
                                        int i23 = bvok2.f157046d;
                                        int a4 = bvoj.m121317a(bvok2.f157045c);
                                        if (a4 != 0) {
                                            i6 = a4;
                                        } else {
                                            i6 = 1;
                                        }
                                        arrayList3.add(PlaceOpeningHoursEntity.ExceptionalHours.m66967a(i21, i5, i22, i23, i6, bvok2.f157044b, arrayList4));
                                    }
                                }
                            }
                            f3 = f;
                            i3 = i;
                        }
                        i14++;
                        bxwc3 = bxwc4;
                        size4 = i4;
                        i = i3;
                        f = f3;
                        i8 = 1;
                    }
                    f2 = f;
                    i2 = i;
                    placeOpeningHoursEntity = PlaceOpeningHoursEntity.m66965a(arrayList2, arrayList3);
                } else {
                    f2 = f;
                    i2 = i;
                }
                String str2 = bvmv2.f156804e;
                String str3 = bvmv2.f156805f;
                String str4 = bvmv2.f156806g;
                bxwc bxwc7 = bvmv2.f156807h;
                String str5 = bvmv2.f156813n;
                String str6 = bvmv2.f156815p;
                aeob aeob = new aeob();
                aeob.f63547a = str;
                aeob.f63557k = arrayList;
                aeob.f63548b = str2;
                aeob.f63558l = str3;
                aeob.f63559m = str4;
                aeob.f63560n = bxwc7;
                aeob.f63549c = a;
                aeob.f63551e = latLngBounds;
                aeob.f63553g = uri;
                aeob.f63554h = z;
                aeob.f63555i = f2;
                aeob.f63556j = i2;
                aeob.f63552f = str5;
                aeob.f63561o = placeOpeningHoursEntity;
                aeob.f63563q = str6;
                PlaceEntity a5 = aeob.mo34381a();
                if ((bvmv2.f156800a & 2) == 0 || TextUtils.isEmpty(bvmv2.f156803d)) {
                    a5.f79552r = Locale.getDefault();
                } else {
                    String[] split = bvmv2.f156803d.split("[-_]");
                    if (split.length < 2) {
                        c = 0;
                    } else if (split[1].length() != 2) {
                        c = 0;
                    } else {
                        locale = new Locale(split[0], split[1]);
                        a5.f79552r = locale;
                    }
                    locale = split[c].length() > 0 ? new Locale(split[c]) : Locale.getDefault();
                    a5.f79552r = locale;
                }
                return a5;
            } else {
                if (Log.isLoggable("Places", 6)) {
                    bioi.m102658a("Places", "received place lacks geometry");
                }
                return null;
            }
        } else {
            if (Log.isLoggable("Places", 6)) {
                bioi.m102658a("Places", "received null place");
            }
            return null;
        }
    }

    /* renamed from: a */
    public static LatLng m101873a(bzrv bzrv) {
        double d = 0.0d;
        double d2 = bzrv != null ? bzrv.f171208a : 0.0d;
        if (bzrv != null) {
            d = bzrv.f171209b;
        }
        return new LatLng(d2, d);
    }

    /* renamed from: a */
    private static List m101874a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (svr.m36484b(context).mo26169a("android.permission.ACCESS_WIFI_STATE") == 0) {
            long d = cggm.m145258d();
            if (d > 0) {
                long j = d * 1000000;
                int e = (int) cggm.m145259e();
                if (e > 0) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager.isWifiEnabled()) {
                        ArrayList arrayList = new ArrayList(e);
                        long j2 = 1000;
                        long currentTimeMillis = (System.currentTimeMillis() - SystemClock.elapsedRealtime()) * 1000;
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        if (scanResults != null) {
                            int i2 = 0;
                            for (ScanResult scanResult : scanResults) {
                                if (!bebi.m91719b(scanResult.SSID)) {
                                    long j3 = scanResult.timestamp;
                                    if ((SystemClock.elapsedRealtime() * j2) - j3 <= j) {
                                        bxvd da = bvlw.f156604h.mo74144da();
                                        String str = scanResult.SSID;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bvlw bvlw = (bvlw) da.f164949b;
                                        str.getClass();
                                        bvlw.f156606a |= 1;
                                        bvlw.f156607b = str;
                                        String str2 = scanResult.BSSID;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bvlw bvlw2 = (bvlw) da.f164949b;
                                        str2.getClass();
                                        bvlw2.f156606a |= 2;
                                        bvlw2.f156608c = str2;
                                        String str3 = scanResult.capabilities;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bvlw bvlw3 = (bvlw) da.f164949b;
                                        str3.getClass();
                                        bvlw3.f156606a |= 4;
                                        bvlw3.f156609d = str3;
                                        int i3 = scanResult.frequency;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bvlw bvlw4 = (bvlw) da.f164949b;
                                        bvlw4.f156606a |= 16;
                                        bvlw4.f156611f = i3;
                                        int i4 = scanResult.level;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bvlw bvlw5 = (bvlw) da.f164949b;
                                        int i5 = bvlw5.f156606a | 8;
                                        bvlw5.f156606a = i5;
                                        bvlw5.f156610e = i4;
                                        bvlw5.f156606a = i5 | 32;
                                        bvlw5.f156612g = j3 + currentTimeMillis;
                                        arrayList.add((bvlw) da.mo74062i());
                                        i2++;
                                        if (i2 >= e) {
                                            break;
                                        }
                                        j2 = 1000;
                                    }
                                }
                                j2 = 1000;
                            }
                            return arrayList;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List m101875a(Context context, bvmb bvmb) {
        if (bvmb == null || bvmb.f156633b.size() == 0) {
            return new ArrayList();
        }
        bvow bvow = bvmb.f156632a;
        if (bvow == null) {
            bvow = bvow.f157230c;
        }
        m101877a(context, bvow);
        ArrayList arrayList = new ArrayList(bvmb.f156633b.size());
        bxwc bxwc = bvmb.f156633b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bvkx bvkx = (bvkx) bxwc.get(i);
            int i2 = bvkx.f156487a;
            if (!((i2 & 1) == 0 || (i2 & 2) == 0)) {
                bvkz a = bvkz.m121221a(bvkx.f156488b);
                if (a == null) {
                    a = bvkz.HOME;
                }
                String str = null;
                if (a == bvkz.HOME) {
                    str = "Home";
                } else if (a == bvkz.WORK) {
                    str = "Work";
                } else if (a == bvkz.NICKNAME && (bvkx.f156487a & 4) != 0) {
                    str = bvkx.f156490d;
                }
                arrayList.add(AliasedPlace.m66969a(bvkx.f156489c, Arrays.asList(str)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m101876a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            bvph bvph = (bvph) list.get(i);
            int i2 = bvph.f157295a;
            if (!((i2 & 1) == 0 || (i2 & 2) == 0)) {
                arrayList.add(new AutocompletePredictionEntity.SubstringEntity(bvph.f157296b, bvph.f157297c));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m101877a(Context context, bvow bvow) {
        String str = (bvow.f157232a & 1) != 0 ? bvow.f157233b : "";
        if (!TextUtils.isEmpty(str)) {
            bhqp.m101339a(context.getApplicationContext()).mo64168a(str);
        }
    }
}
