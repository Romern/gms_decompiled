package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.fitness.data.DataType;

/* renamed from: zdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zdk {

    /* renamed from: a */
    private static final srn f54957a = zvt.m46581a();

    /* renamed from: a */
    public static void m45325a(Context context, bnic bnic, ytt ytt) {
        bnic bnic2 = (bnic) ysk.f54541c.mo30787a();
        if (!bnic2.isEmpty() && !((bnic) ysk.f54542d.mo30787a()).contains(ytt.f54617a)) {
            bnrd a = bnic.iterator();
            while (a.hasNext()) {
                String str = (String) a.next();
                if (bnic2.contains(str)) {
                    m45327a(context, ytt, str);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private static int m45329b(Context context, ytt ytt, String str) {
        return C1145kt.m18541a(context, str, ytt.f54619c, ytt.f54618b, ytt.f54617a);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static boolean m45330b(Context context, ytt ytt, DataType dataType) {
        char c;
        String str = dataType.f32064a;
        switch (str.hashCode()) {
            case -2023954015:
                if (str.equals("com.google.location.bounding_box")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1757812901:
                if (str.equals("com.google.location.sample")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1248818137:
                if (str.equals("com.google.distance.delta")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1102520626:
                if (str.equals("com.google.step_count.delta")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1099695423:
                if (str.equals("com.google.activity.sample")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case -886569606:
                if (str.equals("com.google.location.track")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -777285735:
                if (str.equals("com.google.heart_rate.summary")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case -98150574:
                if (str.equals("com.google.heart_rate.bpm")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 269180370:
                if (str.equals("com.google.activity.samples")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case 324760871:
                if (str.equals("com.google.step_count.cadence")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case 657433501:
                if (str.equals("com.google.step_count.cumulative")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case 877955159:
                if (str.equals("com.google.speed.summary")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1921738212:
                if (str.equals("com.google.distance.cumulative")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2053496735:
                if (str.equals("com.google.speed")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return m45328a(context, ytt, str, "android.permission.ACCESS_FINE_LOCATION");
            case 7:
            case 8:
                int i = Build.VERSION.SDK_INT;
                return m45328a(context, ytt, str, "android.permission.BODY_SENSORS");
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return m45327a(context, ytt, str);
            default:
                return true;
        }
    }

    /* renamed from: a */
    public static boolean m45326a(Context context, ytt ytt, DataType dataType) {
        try {
            return m45330b(context, ytt, dataType);
        } catch (SecurityException | zdj e) {
            bnsl bnsl = (bnsl) f54957a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zdk", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Data type not allowed %s", bryx.m114908a(dataType.f32064a));
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m45327a(Context context, ytt ytt, String str) {
        int i = Build.VERSION.SDK_INT;
        try {
            if (context.getPackageManager().getApplicationInfo(ytt.f54617a, 0).targetSdkVersion >= 29 || m45329b(context, ytt, "com.google.android.gms.permission.ACTIVITY_RECOGNITION") == 0) {
                return m45328a(context, ytt, str, "android.permission.ACTIVITY_RECOGNITION");
            }
            if (cdyu.f181962a.mo6606a().mo78521y() && cdyr.m135340b()) {
                throw new zdj("Missing AR install permission.");
            } else if (!cdyr.m135340b()) {
                return true;
            } else {
                return false;
            }
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl = (bnsl) f54957a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zdk", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Can not check client target sdk for data type %s", bryx.m114908a(str));
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m45328a(Context context, ytt ytt, String str, String str2) {
        int b = m45329b(context, ytt, str2);
        if (b == -1) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10 + str2.length());
            sb.append(str);
            sb.append(" requires ");
            sb.append(str2);
            throw new SecurityException(sb.toString());
        } else if (b != 0) {
            return false;
        } else {
            return true;
        }
    }
}
