package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.DropBoxManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: asgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgz {

    /* renamed from: a */
    public static final Set f88957a;

    /* renamed from: b */
    public static final Map f88958b;

    /* renamed from: c */
    private static final Pattern f88959c = Pattern.compile(cgsx.f187685a.mo6606a().mo84437g());

    /* renamed from: d */
    private static final bnic f88960d = bnic.m109494a("system_app_strictmode", "system_server_anr", "data_app_wtf", "system_app_native_crash", "system_app_wtf", "system_app_anr", "data_app_anr", "data_app_crash", "data_app_native_crash", "data_app_strictmode", "system_app_crash");

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("clearcut_dropbox_upload_realtime_data_app_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_data_app_native_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_system_app_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_system_app_native_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_data_app_anr");
        hashSet.add("clearcut_dropbox_upload_realtime_system_app_anr");
        hashSet.add("clearcut_dropbox_upload_realtime_SYSTEM_CRASH_REPORT");
        hashSet.add("clearcut_dropbox_upload_realtime_SYSTEM_LAST_KMSG");
        hashSet.add("clearcut_dropbox_upload_realtime_system_server_anr");
        hashSet.add("clearcut_dropbox_upload_realtime_system_server_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_system_server_native_crash");
        hashSet.add("clearcut_dropbox_upload_realtime_system_server_watchdog");
        hashSet.add("clearcut_dropbox_upload_data_app_strictmode");
        hashSet.add("clearcut_dropbox_upload_data_app_wtf");
        hashSet.add("clearcut_dropbox_upload_system_app_strictmode");
        hashSet.add("clearcut_dropbox_upload_system_app_wtf");
        hashSet.add("clearcut_dropbox_upload_system_server_lowmem");
        hashSet.add("clearcut_dropbox_upload_system_server_wtf");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_data_app_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_data_app_native_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_app_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_app_native_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_data_app_anr");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_app_anr");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_SYSTEM_CRASH_REPORT");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_SYSTEM_LAST_KMSG");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_anr");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_native_crash");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_watchdog");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_data_app_strictmode");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_data_app_wtf");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_app_strictmode");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_app_wtf");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_lowmem");
        hashSet.add("clearcut_dropbox_upload_strip_logcat_system_server_wtf");
        f88957a = hashSet;
        HashMap hashMap = new HashMap();
        hashMap.put("clearcut_dropbox_upload_max_bytes_data_app_crash", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_data_app_native_crash", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_app_crash", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_app_native_crash", 102400);
        hashMap.put("clearcut_dropbox_upload_max_bytes_data_app_anr", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_app_anr", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_SYSTEM_CRASH_REPORT", 196608);
        hashMap.put("clearcut_dropbox_upload_max_bytes_SYSTEM_LAST_KMSG", 196608);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_anr", 196608);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_crash", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_native_crash", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_watchdog", 196608);
        hashMap.put("clearcut_dropbox_upload_max_bytes_data_app_strictmode", 10240);
        hashMap.put("clearcut_dropbox_upload_max_bytes_data_app_wtf", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_app_strictmode", 10240);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_app_wtf", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_lowmem", 51200);
        hashMap.put("clearcut_dropbox_upload_max_bytes_system_server_wtf", 102400);
        hashMap.put("clearcut_dropbox_upload_qos_tier_data_app_crash", 3);
        hashMap.put("clearcut_dropbox_upload_qos_tier_data_app_native_crash", 3);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_app_crash", 3);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_app_native_crash", 3);
        hashMap.put("clearcut_dropbox_upload_qos_tier_data_app_anr", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_app_anr", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_SYSTEM_CRASH_REPORT", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_SYSTEM_LAST_KMSG", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_server_anr", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_server_crash", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_server_native_crash", 0);
        hashMap.put("clearcut_dropbox_upload_qos_tier_system_server_watchdog", 0);
        f88958b = hashMap;
    }

    /* renamed from: a */
    private static int m74108a(SharedPreferences sharedPreferences, String str, int i, qxq qxq) {
        if (cgsx.m146913c() && sharedPreferences != null) {
            try {
                return (int) sharedPreferences.getLong(str, cgsx.f187685a.mo6606a().mo84432b());
            } catch (ClassCastException e) {
                qxq.mo24383c("DropboxClassCastException").mo24359a();
            }
        }
        return f88958b.containsKey(str) ? ((Integer) f88958b.get(str)).intValue() : i;
    }

    /* renamed from: a */
    public static cagz m74109a(calx calx, qxq qxq) {
        SharedPreferences sharedPreferences;
        bxwc bxwc = calx.f175211i;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            calv calv = (calv) bxwc.get(i);
            if (cguq.m147091b()) {
                sharedPreferences = rpr.m34216b().getSharedPreferences("com.google.android.metrics", 0);
            } else {
                sharedPreferences = null;
            }
            String valueOf = String.valueOf(calv.f175183b);
            if (cagz.m126622a(m74108a(sharedPreferences, valueOf.length() == 0 ? new String("clearcut_dropbox_upload_qos_tier_") : "clearcut_dropbox_upload_qos_tier_".concat(valueOf), 0, qxq)) == cagz.FAST_IF_RADIO_AWAKE) {
                int i2 = Build.VERSION.SDK_INT;
                String str = new String(calv.f175184c.getKey());
                if (cguq.m147091b()) {
                    String valueOf2 = String.valueOf(calv.f175183b);
                    if (m74110a(sharedPreferences, valueOf2.length() == 0 ? new String("clearcut_dropbox_background_allowed_") : "clearcut_dropbox_background_allowed_".concat(valueOf2), qxq)) {
                        return cagz.FAST_IF_RADIO_AWAKE;
                    }
                }
                if (str.contains("Foreground: Yes\n")) {
                    return cagz.FAST_IF_RADIO_AWAKE;
                }
                if (!cguq.m147091b()) {
                    return cagz.DEFAULT;
                }
            }
        }
        return cagz.DEFAULT;
    }

    /* renamed from: a */
    static boolean m74110a(SharedPreferences sharedPreferences, String str, qxq qxq) {
        if (cgsx.m146913c() && sharedPreferences != null) {
            try {
                boolean z = sharedPreferences.getBoolean(str, false);
                if (z && str.endsWith("SYSTEM_TOMBSTONE")) {
                    int i = Build.VERSION.SDK_INT;
                }
                return z;
            } catch (ClassCastException e) {
                qxq.mo24383c("DropboxClassCastException").mo24359a();
            }
        }
        return f88957a.contains(str);
    }

    /* renamed from: a */
    public static calv[] m74111a(Context context, SharedPreferences sharedPreferences, DropBoxManager dropBoxManager, String str, long j, long j2, boolean z, qxq qxq) {
        DropBoxManager.Entry nextEntry;
        String str2;
        InputStream inputStream;
        int i;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String str3 = str;
        qxq qxq2 = qxq;
        Pattern compile = Pattern.compile(cgsx.f187685a.mo6606a().mo84434d());
        ArrayList arrayList = new ArrayList();
        long j3 = j;
        while (j3 < j2 && (nextEntry = dropBoxManager.getNextEntry(null, j3)) != null) {
            String tag = nextEntry.getTag();
            long timeMillis = nextEntry.getTimeMillis();
            if (str3.equals("DropboxRealtime")) {
                String valueOf = String.valueOf(tag);
                str2 = valueOf.length() == 0 ? new String("clearcut_dropbox_upload_realtime_") : "clearcut_dropbox_upload_realtime_".concat(valueOf);
            } else if (str3.equals("Dropbox")) {
                String valueOf2 = String.valueOf(tag);
                str2 = valueOf2.length() == 0 ? new String("clearcut_dropbox_upload_") : "clearcut_dropbox_upload_".concat(valueOf2);
            } else {
                String valueOf3 = String.valueOf(tag);
                str2 = valueOf3.length() == 0 ? new String("clearcut_dropbox_upload_strip_logcat_") : "clearcut_dropbox_upload_strip_logcat_".concat(valueOf3);
            }
            if (m74110a(sharedPreferences2, str2, qxq2)) {
                bxvd da = calv.f175180j.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                calv calv = (calv) da.f164949b;
                tag.getClass();
                int i2 = calv.f175182a | 1;
                calv.f175182a = i2;
                calv.f175183b = tag;
                calv.f175182a = i2 | 4;
                calv.f175185d = timeMillis;
                try {
                    String valueOf4 = String.valueOf(tag);
                    int a = m74108a(sharedPreferences2, valueOf4.length() == 0 ? new String("clearcut_dropbox_upload_max_bytes_") : "clearcut_dropbox_upload_max_bytes_".concat(valueOf4), 196608, qxq2);
                    inputStream = nextEntry.getInputStream();
                    if (inputStream != null) {
                        byte[] bArr = new byte[a];
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i3 >= 0) {
                                i = i4 + i3;
                                if (i >= a) {
                                    break;
                                }
                                i3 = inputStream.read(bArr, i, a - i);
                                i4 = i;
                            } else {
                                i = i4;
                                break;
                            }
                        }
                        if (i < a) {
                            bArr = Arrays.copyOf(bArr, i);
                        }
                        inputStream.close();
                        ByteString a2 = ByteString.m123261a(bArr);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        calv calv2 = (calv) da.f164949b;
                        a2.getClass();
                        calv2.f175182a |= 2;
                        calv2.f175184c = a2;
                        String valueOf5 = String.valueOf(tag);
                        if (m74110a(sharedPreferences2, valueOf5.length() == 0 ? new String("clearcut_dropbox_upload_strip_logcat_") : "clearcut_dropbox_upload_strip_logcat_".concat(valueOf5), qxq2)) {
                            String str4 = new String(((calv) da.f164949b).f175184c.getKey());
                            Matcher matcher = compile.matcher(str4);
                            if (matcher.find()) {
                                ByteString a3 = ByteString.m123261a(str4.substring(0, matcher.start()).getBytes());
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                calv calv3 = (calv) da.f164949b;
                                a3.getClass();
                                int i5 = calv3.f175182a | 2;
                                calv3.f175182a = i5;
                                calv3.f175184c = a3;
                                calv3.f175182a = i5 | 8;
                                calv3.f175186e = true;
                            }
                        }
                        if (f88960d.contains(tag)) {
                            try {
                                Matcher matcher2 = f88959c.matcher(new String(((calv) da.f164949b).f175184c.getKey()));
                                if (matcher2.find()) {
                                    String group = matcher2.group(1);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    calv calv4 = (calv) da.f164949b;
                                    group.getClass();
                                    calv4.f175182a |= 16;
                                    calv4.f175187f = group;
                                    int parseInt = Integer.parseInt(matcher2.group(2));
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    calv calv5 = (calv) da.f164949b;
                                    calv5.f175182a |= 32;
                                    calv5.f175188g = parseInt;
                                    String group2 = matcher2.group(3);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    calv calv6 = (calv) da.f164949b;
                                    group2.getClass();
                                    calv6.f175182a |= 64;
                                    calv6.f175189h = group2;
                                    String installerPackageName = context.getPackageManager().getInstallerPackageName(((calv) da.f164949b).f175187f);
                                    if (installerPackageName != null) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        calv calv7 = (calv) da.f164949b;
                                        installerPackageName.getClass();
                                        calv7.f175182a |= 128;
                                        calv7.f175190i = installerPackageName;
                                    }
                                }
                            } catch (IllegalArgumentException e) {
                                Log.e(str3, e.getMessage(), e);
                            }
                        }
                        if (!z) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            calv calv8 = (calv) da.f164949b;
                            calv8.f175182a &= -3;
                            calv8.f175184c = calv.f175180j.f175184c;
                        }
                        arrayList.add((calv) da.mo74062i());
                    } else {
                        throw new IOException("null InputStream");
                    }
                } catch (IOException e2) {
                    Log.e(str3, e2.getMessage(), e2);
                } catch (Throwable th) {
                    inputStream.close();
                    throw th;
                }
            }
            nextEntry.close();
            j3 = timeMillis;
        }
        return (calv[]) arrayList.toArray(new calv[arrayList.size()]);
    }
}
