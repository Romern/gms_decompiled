package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.ulr.ApiActivity;
import com.google.android.ulr.ApiActivityExtraRow;
import com.google.android.ulr.ApiActivityReading;
import com.google.android.ulr.ApiBatteryCondition;
import com.google.android.ulr.ApiExperiment;
import com.google.android.ulr.ApiExperimentTokens;
import com.google.android.ulr.ApiLocation;
import com.google.android.ulr.ApiLocationReading;
import com.google.android.ulr.ApiReadingInfo;
import com.google.android.ulr.RttRangingProto;
import com.google.android.ulr.WifiStrengthProto;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: bgzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzt {

    /* renamed from: a */
    public static ArrayList f118166a = null;

    /* renamed from: b */
    public static bgun f118167b = null;

    /* renamed from: c */
    public static bgun f118168c = null;

    /* renamed from: d */
    public static bgun f118169d = null;

    /* renamed from: e */
    private static Map f118170e = null;

    /* renamed from: f */
    private static bgzg f118171f = null;

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ed A[Catch:{ RuntimeException -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02d0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ae A[Catch:{ RuntimeException -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b7 A[Catch:{ RuntimeException -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01bd A[Catch:{ RuntimeException -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e3 A[Catch:{ RuntimeException -> 0x021a }] */
    /* renamed from: a */
    public static ArrayList m100495a(List list) {
        ArrayList arrayList;
        Integer num;
        Boolean bool;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        String str;
        int i;
        ArrayList arrayList2;
        Integer num6;
        Integer num7;
        Integer num8;
        String str2;
        ArrayList arrayList3;
        Boolean bool2;
        ApiBatteryCondition apiBatteryCondition;
        Long l;
        Long l2;
        String str3;
        bxwc<bgvz> bxwc;
        String str4;
        Boolean bool3;
        String str5;
        String str6;
        if (list.size() > 0) {
            ArrayList arrayList4 = new ArrayList(list.size());
            int i2 = 0;
            for (int size = list.size(); i2 < size; size = i) {
                bgvr bgvr = (bgvr) list.get(i2);
                if ((bgvr.f117715a & 32) != 0) {
                    num = Integer.valueOf((int) Math.round(bgvr.f117721g));
                } else {
                    num = null;
                }
                if ((bgvr.f117715a & 1024) != 0) {
                    bool = Boolean.valueOf(bgvr.f117725k);
                } else {
                    bool = null;
                }
                if ((bgvr.f117715a & 16) != 0) {
                    num2 = Integer.valueOf((int) bgvr.f117720f);
                } else {
                    num2 = null;
                }
                if ((bgvr.f117715a & 64) != 0) {
                    num3 = Integer.valueOf((int) bgvr.f117722h);
                } else {
                    num3 = null;
                }
                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
                    num4 = Integer.valueOf(Math.round(bgvr.f117734t));
                } else {
                    num4 = null;
                }
                if ((bgvr.f117715a & 4096) != 0) {
                    num5 = Integer.valueOf(bgvr.f117727m);
                } else {
                    num5 = null;
                }
                int i3 = bgvr.f117715a;
                if ((i3 & 2048) != 0) {
                    str = bgvr.f117726l;
                } else {
                    str = null;
                }
                if ((i3 & 1) == 0) {
                    arrayList2 = arrayList4;
                    long j = bgvr.f117718d;
                    bgvq a = bgvq.m100134a(bgvr.f117717c);
                    if (a == null) {
                        a = bgvq.WIFI;
                    }
                    int i4 = a.f117712f;
                    i = size;
                    StringBuilder sb = new StringBuilder(77);
                    sb.append("Location missing position; timestamp=");
                    sb.append(j);
                    sb.append("; source=");
                    sb.append(i4);
                    bgur.m100022b("GCoreUlr", new IllegalStateException(sb.toString()));
                    num7 = null;
                    num6 = null;
                } else {
                    arrayList2 = arrayList4;
                    i = size;
                    bgvu bgvu = bgvr.f117716b;
                    if (bgvu == null) {
                        bgvu = bgvu.f117746d;
                    }
                    Integer valueOf = Integer.valueOf(bgvu.f117749b);
                    num7 = Integer.valueOf(bgvu.f117750c);
                    num6 = valueOf;
                }
                if ((bgvr.f117715a & 8) != 0) {
                    num8 = Integer.valueOf((int) bgvr.f117719e);
                } else {
                    num8 = null;
                }
                String str7 = "GCoreUlr";
                ApiLocation apiLocation = new ApiLocation(num, bool, num2, num3, num5, str, num6, num7, num8, num4);
                if ((bgvr.f117715a & 2) != 0) {
                    bgvq a2 = bgvq.m100134a(bgvr.f117717c);
                    if (a2 == null) {
                        a2 = bgvq.WIFI;
                    }
                    str2 = a2.name().toLowerCase(Locale.US);
                } else {
                    str2 = null;
                }
                ArrayList arrayList5 = f118166a;
                if (bgvr.f117728n.size() > 0 && (bxwc = bgvr.f117728n) != null) {
                    try {
                        if (!bxwc.isEmpty()) {
                            arrayList3 = new ArrayList(bxwc.size());
                            for (bgvz bgvz : bxwc) {
                                int i5 = bgvz.f117771a;
                                if (!((i5 & 1) == 0 || (i5 & 2) == 0)) {
                                    if ((i5 & 4) != 0) {
                                        int a3 = bgvy.m100144a(bgvz.f117774d);
                                        if (a3 == 0) {
                                            a3 = 1;
                                        }
                                        int i6 = a3 - 1;
                                        if (i6 != 0) {
                                            if (i6 == 1) {
                                                str6 = "none";
                                            } else if (i6 == 2) {
                                                str6 = "wpaPsk";
                                            } else if (i6 != 3) {
                                                str4 = "securedOther";
                                                if ((bgvz.f117771a & 8) != 0) {
                                                    bool3 = Boolean.valueOf(bgvz.f117775e);
                                                } else {
                                                    bool3 = null;
                                                }
                                                int i7 = bgvz.f117777g;
                                                RttRangingProto rttRangingProto = i7 != 0 ? new RttRangingProto(Integer.valueOf(i7), Integer.valueOf(bgvz.f117781k), Integer.valueOf(bgvz.f117780j), Integer.valueOf(bgvz.f117779i), Integer.valueOf(bgvz.f117778h)) : null;
                                                String str8 = bgvz.f117782l;
                                                if (chcj.m148166d()) {
                                                    if ((bgvz.f117771a & 1024) != 0) {
                                                        str8 = bgvz.f117782l;
                                                    } else {
                                                        str5 = null;
                                                        arrayList3.add(new WifiStrengthProto(Integer.valueOf(bgvz.f117776f), bool3, Long.valueOf(bgvz.f117772b), rttRangingProto, str5, Integer.valueOf(bgvz.f117773c), str4));
                                                    }
                                                }
                                                str5 = str8;
                                                arrayList3.add(new WifiStrengthProto(Integer.valueOf(bgvz.f117776f), bool3, Long.valueOf(bgvz.f117772b), rttRangingProto, str5, Integer.valueOf(bgvz.f117773c), str4));
                                            } else {
                                                str6 = "wpaEap";
                                            }
                                            str4 = str6;
                                            if ((bgvz.f117771a & 8) != 0) {
                                            }
                                            int i72 = bgvz.f117777g;
                                            if (i72 != 0) {
                                            }
                                            String str82 = bgvz.f117782l;
                                            if (chcj.m148166d()) {
                                            }
                                            str5 = str82;
                                            arrayList3.add(new WifiStrengthProto(Integer.valueOf(bgvz.f117776f), bool3, Long.valueOf(bgvz.f117772b), rttRangingProto, str5, Integer.valueOf(bgvz.f117773c), str4));
                                        } else {
                                            int a4 = bgvy.m100144a(bgvz.f117774d);
                                            if (a4 == 0) {
                                                a4 = 1;
                                            }
                                            StringBuilder sb2 = new StringBuilder(35);
                                            sb2.append("Unknown wifi auth type: ");
                                            sb2.append(a4 - 1);
                                            sb2.toString();
                                        }
                                    }
                                    str4 = "unknown";
                                    if ((bgvz.f117771a & 8) != 0) {
                                    }
                                    int i722 = bgvz.f117777g;
                                    if (i722 != 0) {
                                    }
                                    String str822 = bgvz.f117782l;
                                    if (chcj.m148166d()) {
                                    }
                                    str5 = str822;
                                    arrayList3.add(new WifiStrengthProto(Integer.valueOf(bgvz.f117776f), bool3, Long.valueOf(bgvz.f117772b), rttRangingProto, str5, Integer.valueOf(bgvz.f117773c), str4));
                                }
                            }
                            if ((bgvr.f117715a & 512) == 0) {
                                bool2 = Boolean.valueOf(bgvr.f117724j);
                            } else {
                                bool2 = null;
                            }
                            if ((bgvr.f117715a & 8192) == 0) {
                                bgvj bgvj = bgvr.f117729o;
                                if (bgvj == null) {
                                    bgvj = bgvj.f117660f;
                                }
                                if ((bgvj.f117662a & 1) != 0) {
                                    int a5 = bgvi.m100126a(bgvj.f117663b);
                                    if (a5 == 0) {
                                        a5 = 1;
                                    }
                                    int i8 = a5 - 1;
                                    if (i8 == 0) {
                                        str3 = "notCharging";
                                    } else if (i8 == 1) {
                                        str3 = "ac";
                                    } else if (i8 == 2) {
                                        str3 = "usb";
                                    } else if (i8 != 3) {
                                        str3 = "wireless";
                                    }
                                    apiBatteryCondition = new ApiBatteryCondition(str3, Integer.valueOf(bgvj.f117664c), Integer.valueOf(bgvj.f117665d), Integer.valueOf(bgvj.f117666e));
                                }
                                str3 = null;
                                apiBatteryCondition = new ApiBatteryCondition(str3, Integer.valueOf(bgvj.f117664c), Integer.valueOf(bgvj.f117665d), Integer.valueOf(bgvj.f117666e));
                            } else {
                                apiBatteryCondition = null;
                            }
                            ApiReadingInfo apiReadingInfo = new ApiReadingInfo(bool2, apiBatteryCondition, str2, arrayList3);
                            if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 0) {
                                l = Long.valueOf(bgvr.f117732r);
                            } else {
                                l = null;
                            }
                            if ((bgvr.f117715a & 4) == 0) {
                                l2 = Long.valueOf(bgvr.f117718d);
                            } else {
                                l2 = null;
                            }
                            if (l2 == null) {
                                bgvq a6 = bgvq.m100134a(bgvr.f117717c);
                                if (a6 == null) {
                                    a6 = bgvq.WIFI;
                                }
                                int i9 = a6.f117712f;
                                StringBuilder sb3 = new StringBuilder(46);
                                sb3.append("Location missing timestamp; source=");
                                sb3.append(i9);
                                bgur.m100022b(str7, new IllegalStateException(sb3.toString()));
                            }
                            arrayList4 = arrayList2;
                            arrayList4.add(new ApiLocationReading(l, arrayList5, apiLocation, apiReadingInfo, Integer.valueOf(bgvr.f117730p), Integer.valueOf(bgvr.f117731q), l2));
                            i2++;
                        }
                    } catch (RuntimeException e) {
                        bgur.m100021b(str7, "Best-effort Wifi scan conversion failed", e);
                        arrayList3 = null;
                    }
                }
                arrayList3 = null;
                if ((bgvr.f117715a & 512) == 0) {
                }
                if ((bgvr.f117715a & 8192) == 0) {
                }
                ApiReadingInfo apiReadingInfo2 = new ApiReadingInfo(bool2, apiBatteryCondition, str2, arrayList3);
                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 0) {
                }
                if ((bgvr.f117715a & 4) == 0) {
                }
                if (l2 == null) {
                }
                arrayList4 = arrayList2;
                arrayList4.add(new ApiLocationReading(l, arrayList5, apiLocation, apiReadingInfo2, Integer.valueOf(bgvr.f117730p), Integer.valueOf(bgvr.f117731q), l2));
                i2++;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        String valueOf2 = String.valueOf(arrayList);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
        sb4.append("Locations: ");
        sb4.append(valueOf2);
        sb4.toString();
        return arrayList;
    }

    /* renamed from: b */
    public static ApiExperimentTokens m100499b(Context context) {
        bgun bgun = f118167b;
        if (bgun != null) {
            return bgun.mo63216a(context);
        }
        return null;
    }

    /* renamed from: c */
    public static ApiExperimentTokens m100501c(Context context) {
        bgun bgun = f118168c;
        if (bgun != null) {
            return bgun.mo63216a(context);
        }
        return null;
    }

    /* renamed from: d */
    public static ApiExperimentTokens m100502d(Context context) {
        bgun bgun = f118169d;
        if (bgun != null) {
            return bgun.mo63216a(context);
        }
        return null;
    }

    /* renamed from: b */
    public static ArrayList m100500b(List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        Long l;
        Integer num;
        Float f;
        Double d;
        Boolean bool;
        String str2;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) list.get(i);
            List<DetectedActivity> list2 = activityRecognitionResult.f79300a;
            Bundle c = activityRecognitionResult.mo43493c();
            if (list2.size() > 0 || (c != null && c.size() > 0)) {
                if (list2.size() > 0) {
                    arrayList = new ArrayList(list2.size());
                    for (DetectedActivity detectedActivity : list2) {
                        int a = detectedActivity.mo43513a();
                        switch (a) {
                            case 0:
                                str2 = "inVehicle";
                                break;
                            case 1:
                                str2 = "onBicycle";
                                break;
                            case 2:
                                str2 = "onFoot";
                                break;
                            case 3:
                                str2 = "still";
                                break;
                            case 4:
                                str2 = "unknown";
                                break;
                            case 5:
                                str2 = "tilting";
                                break;
                            case 6:
                                str2 = "exitingVehicle";
                                break;
                            case 7:
                                str2 = "walking";
                                break;
                            case 8:
                                str2 = "running";
                                break;
                            default:
                                switch (a) {
                                    case 16:
                                        str2 = "inRoadVehicle";
                                        break;
                                    case 17:
                                        str2 = "inRailVehicle";
                                        break;
                                    case 18:
                                        str2 = "inTwoWheelerVehicle";
                                        break;
                                    case 19:
                                        str2 = "inFourWheelerVehicle";
                                        break;
                                    case 20:
                                        str2 = "inCar";
                                        break;
                                    case 21:
                                        str2 = "inBus";
                                        break;
                                    default:
                                        str2 = "_unsupported";
                                        break;
                                }
                        }
                        if (!str2.equals("_unsupported")) {
                            arrayList.add(new ApiActivity(Integer.valueOf(detectedActivity.f79320e), str2));
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (c == null || c.size() == 0) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(c.size());
                    for (String str3 : c.keySet()) {
                        Object obj = c.get(str3);
                        if (obj != null) {
                            if (obj instanceof Integer) {
                                bool = null;
                                d = null;
                                f = null;
                                l = null;
                                str = null;
                                num = (Integer) obj;
                            } else if (obj instanceof Boolean) {
                                d = null;
                                f = null;
                                num = null;
                                l = null;
                                str = null;
                                bool = (Boolean) obj;
                            } else if (obj instanceof Double) {
                                bool = null;
                                f = null;
                                num = null;
                                l = null;
                                str = null;
                                d = (Double) obj;
                            } else if (obj instanceof Float) {
                                bool = null;
                                d = null;
                                num = null;
                                l = null;
                                str = null;
                                f = (Float) obj;
                            } else if (obj instanceof Long) {
                                bool = null;
                                d = null;
                                f = null;
                                num = null;
                                str = null;
                                l = (Long) obj;
                            } else if (obj instanceof String) {
                                bool = null;
                                d = null;
                                f = null;
                                num = null;
                                l = null;
                                str = (String) obj;
                            } else {
                                bgur.m100024c("GCoreUlr", 27, String.format(Locale.US, "ActivityRecognitionResult extras bundle contains object (%s) with unsupported type.", obj.toString()));
                            }
                            arrayList2.add(new ApiActivityExtraRow(bool, d, f, num, l, str3, str, "value"));
                        }
                    }
                }
                arrayList3.add(new ApiActivityReading(arrayList, arrayList2, Long.valueOf(activityRecognitionResult.f79301b)));
            }
        }
        return arrayList3;
    }

    /* renamed from: a */
    public static synchronized void m100496a() {
        ApiExperiment apiExperiment;
        Integer num;
        synchronized (bgzt.class) {
            if (f118171f != null) {
                Map a = aymn.m84266a(f118171f.f118157a, "user_location_reporting:experiment:");
                if (a.isEmpty()) {
                    f118166a = null;
                    f118170e = a;
                    return;
                }
                if (f118170e != null) {
                    if (f118170e.keySet().equals(a.keySet())) {
                        return;
                    }
                }
                f118170e = a;
                HashMap hashMap = new HashMap();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (String str : a.keySet()) {
                    String[] split = str.split(":");
                    int length = split.length;
                    if (length < 4) {
                        String valueOf = String.valueOf(str);
                        bgur.m100025c("GCoreUlr", valueOf.length() == 0 ? new String("Incomplete experiment specification: ") : "Incomplete experiment specification: ".concat(valueOf));
                        apiExperiment = null;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(split[2]);
                            String str2 = split[3];
                            if ("experiment".equals(str2) || "control".equals(str2)) {
                                if (length > 4) {
                                    try {
                                        num = Integer.valueOf(split[4]);
                                    } catch (NumberFormatException e) {
                                        String str3 = split[4];
                                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 32 + String.valueOf(str).length());
                                        sb.append("Bad subgroup ");
                                        sb.append(str3);
                                        sb.append(" in specification: ");
                                        sb.append(str);
                                        bgur.m100025c("GCoreUlr", sb.toString());
                                        apiExperiment = null;
                                    }
                                } else {
                                    num = null;
                                }
                                apiExperiment = new ApiExperiment(str2, Integer.valueOf(parseInt), num);
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 29 + String.valueOf(str).length());
                                sb2.append("Bad group ");
                                sb2.append(str2);
                                sb2.append(" in specification: ");
                                sb2.append(str);
                                bgur.m100025c("GCoreUlr", sb2.toString());
                                apiExperiment = null;
                            }
                        } catch (NumberFormatException e2) {
                            String str4 = split[2];
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 37 + String.valueOf(str).length());
                            sb3.append("Bad experiment ID ");
                            sb3.append(str4);
                            sb3.append(" in specification: ");
                            sb3.append(str);
                            bgur.m100025c("GCoreUlr", sb3.toString());
                            apiExperiment = null;
                        }
                    }
                    if (apiExperiment != null) {
                        Integer c = apiExperiment.mo71512c();
                        if ("control".equalsIgnoreCase(apiExperiment.mo71511b())) {
                            hashMap.put(c, apiExperiment);
                        } else {
                            hashSet.add(c);
                            arrayList.add(apiExperiment);
                        }
                    }
                }
                int size = hashMap.size();
                hashMap.keySet().removeAll(hashSet);
                if (size != hashMap.size()) {
                    bgur.m100018b("GCoreUlr", 6, "experiment and control groups overlap");
                }
                arrayList.addAll(hashMap.values());
                f118166a = arrayList;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m100497a(Context context) {
        synchronized (bgzt.class) {
            m100498a(new bgzg(context.getContentResolver()));
            if (f118167b == null) {
                f118167b = new bgun("com.google.android.gms.ulr");
            }
            if (f118168c == null) {
                f118168c = new bgun("com.google.android.location");
            }
            if (f118169d == null) {
                f118169d = new bgun("com.google.android.gms.beacon");
            }
        }
    }

    /* renamed from: a */
    static synchronized void m100498a(bgzg bgzg) {
        synchronized (bgzt.class) {
            f118171f = bgzg;
            if (f118170e == null) {
                m100496a();
            }
        }
    }
}
