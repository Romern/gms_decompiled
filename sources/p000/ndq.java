package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ndq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ndq {

    /* renamed from: a */
    private static final lvn f35356a = new lvn("LocalBackupStats");

    /* renamed from: b */
    private static long f35357b = 0;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[Catch:{ NumberFormatException -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080 A[Catch:{ NumberFormatException -> 0x0091 }] */
    /* renamed from: a */
    private static ApplicationBackupStats m25976a(String str, String str2, BackupStatsRequestConfig backupStatsRequestConfig) {
        char c;
        BackupStatsRequestConfig backupStatsRequestConfig2 = backupStatsRequestConfig;
        String[] split = str2.split(",");
        int length = split.length;
        char c2 = 0;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            String str3 = split[i];
            String[] split2 = str3.split(":", 2);
            if (split2.length == 2) {
                try {
                    String str4 = split2[c2];
                    int hashCode = str4.hashCode();
                    if (hashCode != -1888219645) {
                        if (hashCode != -1636647380) {
                            if (hashCode == 1880191170 && str4.equals("[TIMESTAMP]")) {
                                c = 0;
                                if (c == 0) {
                                    if (c != 1) {
                                        if (c != 2) {
                                            f35356a.mo25416d("Unrecognized local backup stats attributes", new Object[0]);
                                        } else if (backupStatsRequestConfig2.f28988a) {
                                            i3 = Integer.parseInt(split2[1]);
                                        }
                                    } else if (backupStatsRequestConfig2.f28988a) {
                                        i2 = Integer.parseInt(split2[1]);
                                    }
                                } else if (backupStatsRequestConfig2.f28989b) {
                                    j = Long.parseLong(split2[1]);
                                }
                                i++;
                                c2 = 0;
                            }
                        } else if (str4.equals("[DRIVE_SIZE]")) {
                            c = 2;
                            if (c == 0) {
                            }
                            i++;
                            c2 = 0;
                        }
                    } else if (str4.equals("[KV_SIZE]")) {
                        c = 1;
                        if (c == 0) {
                        }
                        i++;
                        c2 = 0;
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    i++;
                    c2 = 0;
                } catch (NumberFormatException e) {
                    lvn lvn = f35356a;
                    String valueOf = String.valueOf(str3);
                    lvn.mo25416d(valueOf.length() == 0 ? new String("Can not parse local backup stats : ") : "Can not parse local backup stats : ".concat(valueOf), new Object[0]);
                    return null;
                }
            } else {
                lvn lvn2 = f35356a;
                String valueOf2 = String.valueOf(str3);
                lvn2.mo25416d(valueOf2.length() == 0 ? new String("Can not parse local backup stats : ") : "Can not parse local backup stats : ".concat(valueOf2), new Object[0]);
                return null;
            }
        }
        return new ApplicationBackupStats(str, i2, i3, j);
    }

    /* renamed from: b */
    public static boolean m25983b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (System.currentTimeMillis() - f35357b < ccnf.f179489a.mo6606a().mo76409C() * 3600000 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m25977a(ApplicationBackupStats applicationBackupStats) {
        long j = applicationBackupStats.f28977d;
        StringBuilder sb = new StringBuilder(32);
        sb.append("[TIMESTAMP]:");
        sb.append(j);
        int i = applicationBackupStats.f28975b;
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append("[KV_SIZE]:");
        sb2.append(i);
        int i2 = applicationBackupStats.f28976c;
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append("[DRIVE_SIZE]:");
        sb3.append(i2);
        return bmxr.m108544a(",").mo66874a((Iterable) sqw.m36034a((Object[]) new String[]{sb.toString(), sb2.toString(), sb3.toString()}));
    }

    /* renamed from: a */
    public static void m25978a(Context context) {
        context.getSharedPreferences("CurrentDeviceBackupStats", 0).edit().clear().commit();
        f35357b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static void m25979a(Context context, ApplicationBackupStats applicationBackupStats) {
        SharedPreferences.Editor edit = context.getSharedPreferences("CurrentDeviceBackupStats", 0).edit();
        edit.putString(applicationBackupStats.f28974a, m25977a(applicationBackupStats));
        edit.commit();
    }

    /* renamed from: a */
    public static void m25980a(Context context, String str, long j) {
        int i;
        int i2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("CurrentDeviceBackupStats", 0);
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            ApplicationBackupStats a = m25976a(str, string, new BackupStatsRequestConfig(true, true));
            int i3 = a.f28975b;
            i = a.f28976c;
            i2 = i3;
        } else {
            i2 = 0;
            i = 0;
        }
        ApplicationBackupStats applicationBackupStats = new ApplicationBackupStats(str, i2, i, j);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, m25977a(applicationBackupStats));
        edit.commit();
    }

    /* renamed from: a */
    public static void m25981a(Context context, ApplicationBackupStats[] applicationBackupStatsArr) {
        SharedPreferences.Editor edit = context.getSharedPreferences("CurrentDeviceBackupStats", 0).edit();
        edit.clear();
        for (ApplicationBackupStats applicationBackupStats : applicationBackupStatsArr) {
            edit.putString(applicationBackupStats.f28974a, m25977a(applicationBackupStats));
        }
        edit.commit();
        f35357b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static ApplicationBackupStats[] m25982a(Context context, BackupStatsRequestConfig backupStatsRequestConfig) {
        if (backupStatsRequestConfig.f28988a || backupStatsRequestConfig.f28989b) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("CurrentDeviceBackupStats", 0);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                ApplicationBackupStats a = m25976a(entry.getKey(), (String) entry.getValue(), backupStatsRequestConfig);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return (ApplicationBackupStats[]) arrayList.toArray(new ApplicationBackupStats[0]);
        }
        f35356a.mo25416d("Client should request either backup data size or backup timestamp", new Object[0]);
        return null;
    }
}
