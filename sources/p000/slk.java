package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: slk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class slk implements srl {
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0211 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e8 A[Catch:{ IllegalArgumentException -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e9 A[Catch:{ IllegalArgumentException -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0208 A[Catch:{ IllegalArgumentException -> 0x0346 }] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21850a(Object obj) {
        int i;
        ArrayList arrayList;
        String str;
        bpvs bpvs;
        String str2 = (String) obj;
        String[] split = str2.trim().split("\t");
        if (split.length < 7) {
            String valueOf = String.valueOf(str2);
            Log.w("StatsUploader", valueOf.length() == 0 ? new String("Invaid data: ") : "Invaid data: ".concat(valueOf));
            return null;
        }
        bxvd da = bpvt.f139418o.mo74144da();
        boolean z = false;
        try {
            long parseLong = Long.parseLong(split[0]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpvt bpvt = (bpvt) da.f164949b;
            int i2 = 1;
            bpvt.f139420a |= 1;
            bpvt.f139421b = parseLong;
            int parseInt = Integer.parseInt(split[1]);
            PackageManager packageManager = slo.f44685a;
            if (parseInt != 16) {
                switch (parseInt) {
                    case 7:
                        i = 2;
                        break;
                    case 8:
                        i = 3;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                    case 11:
                        i = 6;
                        break;
                    case 12:
                        i = 7;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Wrong WakeLockEventType: ");
                        sb.append(parseInt);
                        Log.e("StatsUploader", sb.toString());
                        throw new IllegalArgumentException("Wrong WakeLockEventType");
                }
            } else {
                i = 8;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpvt bpvt2 = (bpvt) da.f164949b;
            bpvt2.f139422c = i - 1;
            bpvt2.f139420a |= 2;
            String str3 = "StatsUploader";
            long parseLong2 = Long.parseLong(split[2]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpvt bpvt3 = (bpvt) da.f164949b;
            int i3 = bpvt3.f139420a | 4;
            bpvt3.f139420a = i3;
            bpvt3.f139423d = parseLong2;
            String str4 = split[3];
            str4.getClass();
            bpvt3.f139420a = i3 | 8;
            bpvt3.f139424e = str4;
            long parseLong3 = Long.parseLong(split[4]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpvt bpvt4 = (bpvt) da.f164949b;
            bpvt4.f139420a |= 64;
            bpvt4.f139427h = parseLong3;
            if (!TextUtils.isEmpty(split[5])) {
                if (((Boolean) skl.f44628c.mo58455c()).booleanValue()) {
                    String str5 = split[5];
                    long j = ((bpvt) da.f164949b).f139421b;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    String[] split2 = TextUtils.split(str5, ",");
                    int length = split2.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str6 = split2[i4];
                        bxvd da2 = bpvs.f139413d.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = z;
                        }
                        bpvs bpvs2 = (bpvs) da2.f164949b;
                        str6.getClass();
                        bpvs2.f139415a |= i2;
                        bpvs2.f139416b = str6;
                        if (hashMap.get(str6) != null) {
                            int intValue = ((Integer) hashMap.get(str6)).intValue();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bpvs bpvs3 = (bpvs) da2.f164949b;
                            bpvs3.f139415a |= 2;
                            bpvs3.f139417c = intValue;
                            arrayList = arrayList2;
                            str = str3;
                        } else {
                            try {
                                PackageInfo packageInfo = slo.f44685a.getPackageInfo(str6, 0);
                                arrayList = arrayList2;
                                try {
                                    if (packageInfo.lastUpdateTime > j) {
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bpvs bpvs4 = (bpvs) da2.f164949b;
                                        bpvs4.f139415a |= 2;
                                        bpvs4.f139417c = -2;
                                        str = str3;
                                    } else {
                                        int i5 = packageInfo.versionCode;
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bpvs bpvs5 = (bpvs) da2.f164949b;
                                        bpvs5.f139415a |= 2;
                                        bpvs5.f139417c = i5;
                                        str = str3;
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    String valueOf2 = String.valueOf(e);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
                                    sb2.append("Package not found at upload time: ");
                                    sb2.append(valueOf2);
                                    str = str3;
                                    Log.w(str, sb2.toString());
                                    if (!da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bpvs bpvs6 = (bpvs) da2.f164949b;
                                    bpvs6.f139415a |= 2;
                                    bpvs6.f139417c = -1;
                                    bpvs = (bpvs) da2.f164949b;
                                    if ((bpvs.f139415a & 2) != 0) {
                                    }
                                    arrayList.add((bpvs) da2.mo74062i());
                                    i4++;
                                    str3 = str;
                                    arrayList2 = arrayList;
                                    z = false;
                                    i2 = 1;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                arrayList = arrayList2;
                                String valueOf22 = String.valueOf(e);
                                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 34);
                                sb22.append("Package not found at upload time: ");
                                sb22.append(valueOf22);
                                str = str3;
                                Log.w(str, sb22.toString());
                                if (!da2.f164950c) {
                                }
                                bpvs bpvs62 = (bpvs) da2.f164949b;
                                bpvs62.f139415a |= 2;
                                bpvs62.f139417c = -1;
                                bpvs = (bpvs) da2.f164949b;
                                if ((bpvs.f139415a & 2) != 0) {
                                }
                                arrayList.add((bpvs) da2.mo74062i());
                                i4++;
                                str3 = str;
                                arrayList2 = arrayList;
                                z = false;
                                i2 = 1;
                            }
                            bpvs = (bpvs) da2.f164949b;
                            if ((bpvs.f139415a & 2) != 0) {
                                hashMap.put(str6, Integer.valueOf(bpvs.f139417c));
                            }
                        }
                        arrayList.add((bpvs) da2.mo74062i());
                        i4++;
                        str3 = str;
                        arrayList2 = arrayList;
                        z = false;
                        i2 = 1;
                    }
                    ArrayList arrayList3 = arrayList2;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpvt bpvt5 = (bpvt) da.f164949b;
                    if (!bpvt5.f139429j.mo73666a()) {
                        bpvt5.f139429j = bxvk.m124021a(bpvt5.f139429j);
                    }
                    bxsy.m123078a(arrayList3, bpvt5.f139429j);
                }
                List asList = Arrays.asList(TextUtils.split(split[5], ","));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpvt bpvt6 = (bpvt) da.f164949b;
                if (!bpvt6.f139428i.mo73666a()) {
                    bpvt6.f139428i = bxvk.m124021a(bpvt6.f139428i);
                }
                bxsy.m123078a(asList, bpvt6.f139428i);
            }
            long parseLong4 = Long.parseLong(split[6]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpvt bpvt7 = (bpvt) da.f164949b;
            int i6 = bpvt7.f139420a | 512;
            bpvt7.f139420a = i6;
            bpvt7.f139431l = parseLong4;
            int length2 = split.length;
            if (length2 > 7) {
                String str7 = split[7];
                str7.getClass();
                bpvt7.f139420a = i6 | 16;
                bpvt7.f139425f = str7;
            }
            if (length2 > 8 && !TextUtils.isEmpty(split[8])) {
                String str8 = split[8];
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpvt bpvt8 = (bpvt) da.f164949b;
                str8.getClass();
                bpvt8.f139420a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bpvt8.f139430k = str8;
            }
            if (length2 > 9) {
                float parseFloat = Float.parseFloat(split[9]);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpvt bpvt9 = (bpvt) da.f164949b;
                bpvt9.f139420a |= 1024;
                bpvt9.f139432m = parseFloat;
            }
            if (length2 > 10 && !TextUtils.isEmpty(split[10])) {
                String str9 = split[10];
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpvt bpvt10 = (bpvt) da.f164949b;
                str9.getClass();
                bpvt10.f139420a |= 32;
                bpvt10.f139426g = str9;
            }
            if (length2 > 11) {
                boolean parseBoolean = Boolean.parseBoolean(split[11]);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpvt bpvt11 = (bpvt) da.f164949b;
                bpvt11.f139420a |= 2048;
                bpvt11.f139433n = parseBoolean;
            }
            return (bpvt) da.mo74062i();
        } catch (IllegalArgumentException e3) {
            return null;
        }
    }
}
