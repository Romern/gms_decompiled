package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: qdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdg {
    /* renamed from: a */
    static String m31916a(Context context) {
        try {
            return new String(srz.m36178b((InputStream) context.openFileInput("checkin_id_token")), bmwy.f131158c);
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e2) {
            Log.w("CheckinUtil", "Error reading file: checkin_id_token", e2);
            return null;
        }
    }

    /* renamed from: b */
    public static long m31920b(Context context) {
        long j;
        if (cdci.m132542h()) {
            j = m31922c(context);
        } else {
            j = 0;
        }
        if (j == 0) {
            j = m31923d(context);
        }
        return j == 0 ? m31924e(context) : j;
    }

    /* renamed from: c */
    static long m31922c(Context context) {
        String a = m31916a(context);
        if (a == null || !m31919a(a)) {
            return 0;
        }
        try {
            return Long.parseLong(a.split(":")[1]);
        } catch (Exception e) {
            Log.w("CheckinUtil", "Exception while parsing Security token from id", e);
            return 0;
        }
    }

    /* renamed from: d */
    static long m31923d(Context context) {
        try {
            return qdh.m31930a(context).getSharedPreferences("CheckinService", 0).getLong("CheckinTask_securityToken", 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("CheckinUtil", "Cannot read token, failed to find GoogleServicesFramework package");
            return 0;
        }
    }

    /* renamed from: g */
    public static String m31926g(Context context) {
        return context.getSharedPreferences("Checkin", 0).getString("CheckinService_deviceDataVersionInfo", null);
    }

    /* renamed from: h */
    public static qho m31927h(Context context) {
        try {
            if (!TextUtils.isEmpty(Build.PRODUCT)) {
                if (Build.PRODUCT.startsWith("glass_")) {
                    Log.i("CheckinUtil", "Classify the device as Glass.");
                    return qho.GLASS;
                }
            }
            sre.m36088h(context);
            sre.m36089i(context);
            sre.m36087g(context);
            if (!sre.m36083c(context)) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                boolean z = false;
                if (telephonyManager != null) {
                    int phoneType = telephonyManager.getPhoneType();
                    if (phoneType == 2) {
                        z = true;
                    } else if (phoneType == 1) {
                        z = true;
                    }
                }
                boolean a = sre.m36081a(context.getResources());
                if (z || !a) {
                    if (z) {
                        if (!a) {
                            Log.i("CheckinUtil", "Classify the device as Phone.");
                            return qho.PHONE;
                        }
                    }
                    return qho.OTHER;
                }
                Log.i("CheckinUtil", "Classify the device as Tablet.");
                return qho.TABLET;
            }
            Log.i("CheckinUtil", "Classify the device as Things.");
            return qho.THINGS;
        } catch (Exception e) {
            Log.e("CheckinUtil", "Could not determinate device sub type!", e);
            return qho.OTHER;
        }
    }

    /* renamed from: i */
    public static String m31928i(Context context) {
        return context.getSharedPreferences("Checkin", 0).getString("CheckinService_lastSimOperator", "");
    }

    /* renamed from: j */
    public static long m31929j(Context context) {
        return context.getSharedPreferences("Checkin", 0).getLong("CheckinService_lastCheckinSuccessTime", 0);
    }

    /* renamed from: e */
    static long m31924e(Context context) {
        long j = 0;
        try {
            DataInputStream dataInputStream = new DataInputStream(qdh.m31930a(context).openFileInput("security_token"));
            j = dataInputStream.readLong();
            try {
                dataInputStream.close();
            } catch (PackageManager.NameNotFoundException e) {
            } catch (FileNotFoundException e2) {
            } catch (IOException e3) {
                e = e3;
                Log.w("CheckinUtil", "Error reading backup security token file", e);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("CheckinUtil", "Cannot read token from Backup file, failed to find GoogleServicesFramework package");
        } catch (FileNotFoundException e5) {
        } catch (IOException e6) {
            e = e6;
            Log.w("CheckinUtil", "Error reading backup security token file", e);
        }
        return j;
    }

    /* renamed from: f */
    public static boolean m31925f(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0;
    }

    /* renamed from: b */
    public static void m31921b(String str) {
        EventLog.writeEvent(70220, str);
    }

    /* renamed from: a */
    public static void m31917a(int i) {
        EventLog.writeEvent(70220, i);
    }

    /* renamed from: a */
    public static void m31918a(Object... objArr) {
        EventLog.writeEvent(70220, objArr);
    }

    /* renamed from: a */
    public static boolean m31919a(String str) {
        String[] split = str.split(":");
        if (split.length != 2) {
            Log.w("CheckinUtil", str.length() == 0 ? new String("Invalid id-token:") : "Invalid id-token:".concat(str));
            m31921b("Invalid id-token");
            return false;
        }
        try {
            Long.parseLong(split[0]);
            Long.parseLong(split[1]);
            return true;
        } catch (NumberFormatException e) {
            Log.w("CheckinUtil", "NumberFormatException while parsing id-token", e);
            m31921b(str.length() == 0 ? new String("NumberFormatException while parsing id-token:") : "NumberFormatException while parsing id-token:".concat(str));
            return false;
        }
    }
}
