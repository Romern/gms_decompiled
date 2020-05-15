package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Process;
import android.util.Pair;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.car.CarInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: npe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class npe {

    /* renamed from: a */
    public static final bnsn f36300a = odk.m28481a("CAR.SERVICE");

    /* renamed from: b */
    static final boolean f36301b = true;

    /* renamed from: a */
    public static long m27152a(List list, CarInfo carInfo, long j) {
        if (carInfo == null) {
            bnsi c = f36300a.mo68388c();
            c.mo68432a("npe", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Null car info");
            return j;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (m27159a((String[]) pair.first, carInfo)) {
                return ((Long) pair.second).longValue();
            }
        }
        return j;
    }

    /* renamed from: a */
    public static boolean m27156a(int i) {
        if (i == 222) {
            return true;
        }
        switch (i) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                return true;
            default:
                switch (i) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* renamed from: b */
    public static int m27160b(Context context, String str) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null && packagesForUid.length > 0) {
            String str2 = packagesForUid[0];
            Arrays.toString(packagesForUid);
            return C1145kt.m18541a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), packagesForUid[0]);
        }
        bnsi c = f36300a.mo68388c();
        c.mo68432a("npe", "b", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("No package with that UID, denied!");
        return -1;
    }

    /* renamed from: b */
    public static boolean m27164b(int i) {
        return i == 5 || i == 6;
    }

    /* renamed from: c */
    public static int m27165c(Context context, String str) {
        Binder.getCallingPid();
        Process.myPid();
        if (!f36301b || Binder.getCallingPid() != Process.myPid()) {
            return m27160b(context, str);
        }
        bnsi c = f36300a.mo68388c();
        c.mo68432a("npe", "c", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Caller is self, permission denied");
        return -1;
    }

    /* renamed from: a */
    public static File m27153a(Context context) {
        File file = new File(context.getExternalFilesDir(null), "auto");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        bnsi c = f36300a.mo68388c();
        c.mo68432a("npe", "a", 315, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Failed to create auto-specific file dir");
        return null;
    }

    /* renamed from: a */
    public static List m27154a(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : bmyx.m108640a(':').mo66917a().mo66918a((CharSequence) str)) {
            arrayList.add(m27166c(str2));
        }
        return arrayList;
    }

    /* renamed from: c */
    private static String[] m27166c(String str) {
        return (String[]) bnjd.m109584a(bmyx.m108640a(',').mo66921b(8).mo66918a((CharSequence) str), String.class);
    }

    /* renamed from: a */
    public static void m27155a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("expecting main thread");
        }
    }

    /* renamed from: b */
    public static String m27161b(Context context) {
        return nuu.m27790a(context, ccqx.m131305b());
    }

    /* renamed from: a */
    public static boolean m27157a(Context context, String str) {
        int b = m27160b(context, str);
        if (b == -2 || b == -1) {
            bnsi c = f36300a.mo68388c();
            c.mo68432a("npe", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68424a("Google play services does not have permission for permission: %s%s", str, b != -1 ? " PERMISSION_DENIED_APP_OP" : " PERMISSION_DENIED");
            return false;
        } else if (b == 0) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Unknown result from PermissionChecker: ");
            sb.append(b);
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: b */
    public static List m27162b(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : bmyx.m108640a(':').mo66917a().mo66918a((CharSequence) str)) {
            int indexOf = str2.indexOf("=");
            if (indexOf != -1) {
                String substring = str2.substring(0, indexOf);
                String substring2 = str2.substring(indexOf + 1);
                try {
                    arrayList.add(Pair.create(m27166c(substring), Long.valueOf(substring2)));
                } catch (NumberFormatException e) {
                    bnsi c = f36300a.mo68388c();
                    c.mo68432a("npe", "b", 265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68420a("Unable to parse long value for car info: %s", substring2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m27158a(List list, CarInfo carInfo) {
        if (carInfo == null) {
            bnsi c = f36300a.mo68388c();
            c.mo68432a("npe", "a", 283, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Null car info");
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m27159a((String[]) it.next(), carInfo)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m27159a(String[] strArr, CarInfo carInfo) {
        int length = strArr.length;
        if (length != 0) {
            if (!strArr[0].isEmpty() && !strArr[0].equals(carInfo.f29332a)) {
                return false;
            }
            if (length >= 2) {
                if (!strArr[1].isEmpty() && !strArr[1].equals(carInfo.f29333b)) {
                    return false;
                }
                if (length >= 3) {
                    if (!strArr[2].isEmpty()) {
                        String str = strArr[2];
                        int i = carInfo.f29336e;
                        int i2 = carInfo.f29337f;
                        StringBuilder sb = new StringBuilder(23);
                        sb.append(i);
                        sb.append(".");
                        sb.append(i2);
                        if (!str.equals(sb.toString())) {
                            return false;
                        }
                    }
                    if (length >= 4) {
                        if (!strArr[3].isEmpty() && !strArr[3].equals(carInfo.f29334c)) {
                            return false;
                        }
                        if (length >= 5) {
                            if (!strArr[4].isEmpty() && !strArr[4].equals(carInfo.f29340i)) {
                                return false;
                            }
                            if (length >= 6) {
                                if (!strArr[5].isEmpty() && !strArr[5].equals(carInfo.f29341j)) {
                                    return false;
                                }
                                if (length >= 7) {
                                    if (!strArr[6].isEmpty() && !strArr[6].equals(carInfo.f29342k)) {
                                        return false;
                                    }
                                    if (length < 8 || strArr[7].isEmpty() || strArr[7].equals(carInfo.f29343l)) {
                                        return true;
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m27163b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("unexpected main thread");
        }
    }
}
