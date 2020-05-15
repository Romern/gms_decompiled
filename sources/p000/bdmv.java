package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.StrictMode;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bdmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdmv {

    /* renamed from: a */
    private static final bnrt f106004a = bnrt.m110178a("bdmv");

    /* renamed from: b */
    private static final Pattern f106005b = Pattern.compile("VmHWM:\\s*(\\d+)\\s*kB");

    /* renamed from: c */
    private static final Pattern f106006c = Pattern.compile("VmRSS:\\s*(\\d+)\\s*kB");

    /* renamed from: d */
    private static final Pattern f106007d = Pattern.compile("RssAnon:\\s*(\\d+)\\s*kB");

    /* renamed from: e */
    private static final Pattern f106008e = Pattern.compile("VmSwap:\\s*(\\d+)\\s*kB");

    /* renamed from: f */
    private static final Pattern f106009f = Pattern.compile("VmSize:\\s*(\\d+)\\s*kB");

    /* renamed from: g */
    private static bmzi f106010g = bmzn.m108681a(bdmt.f105998a);

    /* renamed from: h */
    private final cijl f106011h;

    /* renamed from: i */
    private final Context f106012i;

    public bdmv(cijl cijl, Application application) {
        this.f106011h = cijl;
        this.f106012i = application;
    }

    /* renamed from: a */
    private static int m91108a(Debug.MemoryInfo memoryInfo) {
        Method method = (Method) ((bmxv) f106010g.mo6606a()).mo66815c();
        if (method == null) {
            return -1;
        }
        try {
            return ((Integer) method.invoke(memoryInfo, 14)).intValue();
        } catch (Error | Exception e) {
            f106010g = bdms.f105997a;
            bnrq bnrq = (bnrq) f106004a.mo68387b();
            bnrq.mo68437a(e);
            bnrq.mo68432a("bdmv", "a", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("MemoryInfo.getOtherPss(which) invocation failure");
            return -1;
        }
    }

    /* renamed from: a */
    private static bdmu m91109a(bdmd bdmd) {
        bdmu bdmu = null;
        if (!bdmd.mo58167f() && !bdmd.mo58168g() && !bdmd.mo58169h() && !bdmd.mo58171i()) {
            return null;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            String a = bobi.m111039a(new File("/proc/self/status"), Charset.defaultCharset()).mo68797a();
            if (a.isEmpty()) {
                bnrq bnrq = (bnrq) f106004a.mo68387b();
                bnrq.mo68432a("bdmv", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Null or empty proc status");
            } else {
                bdmu bdmu2 = new bdmu();
                if (bdmd.mo58167f()) {
                    bdmu2.f105999a = m91113a(f106005b, a);
                }
                if (bdmd.mo58168g()) {
                    bdmu2.f106000b = m91113a(f106006c, a);
                }
                if (bdmd.mo58169h()) {
                    bdmu2.f106001c = m91113a(f106007d, a);
                }
                if (bdmd.mo58171i()) {
                    bdmu2.f106002d = m91113a(f106008e, a);
                }
                if (bdmd.mo58172j()) {
                    bdmu2.f106003e = m91113a(f106009f, a);
                }
                bdmu = bdmu2;
            }
        } catch (IOException e) {
            bnrq bnrq2 = (bnrq) f106004a.mo68387b();
            bnrq2.mo68437a(e);
            bnrq2.mo68432a("bdmv", "a", 253, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq2.mo68405a("Error reading proc status");
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return bdmu;
    }

    /* renamed from: a */
    static bdmu m91110a(String str, bdmd bdmd) {
        if (str.isEmpty()) {
            bnrq bnrq = (bnrq) f106004a.mo68387b();
            bnrq.mo68432a("bdmv", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Null or empty proc status");
            return null;
        }
        bdmu bdmu = new bdmu();
        if (bdmd.mo58167f()) {
            bdmu.f105999a = m91113a(f106005b, str);
        }
        if (bdmd.mo58168g()) {
            bdmu.f106000b = m91113a(f106006c, str);
        }
        if (bdmd.mo58169h()) {
            bdmu.f106001c = m91113a(f106007d, str);
        }
        if (bdmd.mo58171i()) {
            bdmu.f106002d = m91113a(f106008e, str);
        }
        if (bdmd.mo58172j()) {
            bdmu.f106003e = m91113a(f106009f, str);
        }
        return bdmu;
    }

    /* renamed from: a */
    static final /* synthetic */ bmxv m91111a() {
        try {
            return bmxv.m108566b(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (NoSuchMethodException e) {
            return bmvz.f131120a;
        } catch (Error | Exception e2) {
            bnrq bnrq = (bnrq) f106004a.mo68387b();
            bnrq.mo68437a(e2);
            bnrq.mo68432a("bdmv", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("MemoryInfo.getOtherPss(which) failure");
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    private static Integer m91112a(String str) {
        if (str != null) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        return null;
    }

    /* renamed from: a */
    private static Long m91113a(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                return Long.valueOf(Long.parseLong(matcher.group(1)));
            }
            return null;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m91114a(bxvd bxvd, Debug.MemoryInfo memoryInfo) {
        if (memoryInfo != null) {
            int i = memoryInfo.dalvikPss;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cina cina = (cina) bxvd.f164949b;
            cina cina2 = cina.f190884z;
            cina.f190885a |= 1;
            cina.f190886b = i;
            int i2 = memoryInfo.nativePss;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cina cina3 = (cina) bxvd.f164949b;
            cina3.f190885a |= 2;
            cina3.f190887c = i2;
            int i3 = memoryInfo.otherPss;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cina cina4 = (cina) bxvd.f164949b;
            cina4.f190885a |= 4;
            cina4.f190888d = i3;
            int i4 = memoryInfo.dalvikPrivateDirty;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cina cina5 = (cina) bxvd.f164949b;
            cina5.f190885a |= 8;
            cina5.f190889e = i4;
            int i5 = memoryInfo.nativePrivateDirty;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cina cina6 = (cina) bxvd.f164949b;
            cina6.f190885a |= 16;
            cina6.f190890f = i5;
            int i6 = memoryInfo.otherPrivateDirty;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cina cina7 = (cina) bxvd.f164949b;
            cina7.f190885a |= 32;
            cina7.f190891g = i6;
            int totalPss = memoryInfo.getTotalPss();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cina cina8 = (cina) bxvd.f164949b;
            cina8.f190885a |= 64;
            cina8.f190892h = totalPss;
            int i7 = Build.VERSION.SDK_INT;
            int totalPrivateClean = memoryInfo.getTotalPrivateClean();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cina cina9 = (cina) bxvd.f164949b;
            cina9.f190885a |= 128;
            cina9.f190893i = totalPrivateClean;
            int totalSwappablePss = memoryInfo.getTotalSwappablePss();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cina cina10 = (cina) bxvd.f164949b;
            cina10.f190885a |= 512;
            cina10.f190895k = totalSwappablePss;
            int totalSharedDirty = memoryInfo.getTotalSharedDirty();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cina cina11 = (cina) bxvd.f164949b;
            cina11.f190885a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cina11.f190894j = totalSharedDirty;
            int i8 = Build.VERSION.SDK_INT;
            int a = m91108a(memoryInfo);
            if (a != -1) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cina cina12 = (cina) bxvd.f164949b;
                cina12.f190885a |= 1024;
                cina12.f190896l = a;
            }
            int i9 = Build.VERSION.SDK_INT;
            try {
                Map<String, String> memoryStats = memoryInfo.getMemoryStats();
                Integer a2 = m91112a(memoryStats.get("summary.code"));
                if (a2 != null) {
                    int intValue = a2.intValue();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    cina cina13 = (cina) bxvd.f164949b;
                    cina13.f190885a |= 4096;
                    cina13.f190898n = intValue;
                }
                Integer a3 = m91112a(memoryStats.get("summary.stack"));
                if (a3 != null) {
                    int intValue2 = a3.intValue();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    cina cina14 = (cina) bxvd.f164949b;
                    cina14.f190885a |= 8192;
                    cina14.f190899o = intValue2;
                }
                Integer a4 = m91112a(memoryStats.get("summary.graphics"));
                if (a4 != null) {
                    int intValue3 = a4.intValue();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    cina cina15 = (cina) bxvd.f164949b;
                    cina15.f190885a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    cina15.f190900p = intValue3;
                }
                Integer a5 = m91112a(memoryStats.get("summary.system"));
                if (a5 != null) {
                    int intValue4 = a5.intValue();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    cina cina16 = (cina) bxvd.f164949b;
                    cina16.f190885a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    cina16.f190902r = intValue4;
                }
                Integer a6 = m91112a(memoryStats.get("summary.java-heap"));
                if (a6 != null) {
                    int intValue5 = a6.intValue();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    cina cina17 = (cina) bxvd.f164949b;
                    cina17.f190885a |= 2048;
                    cina17.f190897m = intValue5;
                }
                Integer a7 = m91112a(memoryStats.get("summary.private-other"));
                if (a7 != null) {
                    int intValue6 = a7.intValue();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    cina cina18 = (cina) bxvd.f164949b;
                    cina18.f190885a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    cina18.f190901q = intValue6;
                }
            } catch (NumberFormatException e) {
                bnrq bnrq = (bnrq) f106004a.mo68387b();
                bnrq.mo68437a(e);
                bnrq.mo68432a("bdmv", "a", 329, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("failed to collect memory summary stats");
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final cine mo58189a(int i, int i2, String str, String str2) {
        Debug.MemoryInfo memoryInfo;
        ActivityManager.MemoryInfo memoryInfo2;
        bdmu bdmu;
        String str3 = str2;
        bdmd bdmd = (bdmd) this.f106011h.mo6445a();
        beel.m91856c();
        if (bdmd.mo58173k()) {
            memoryInfo = bdjb.m90889a(this.f106012i).getProcessMemoryInfo(new int[]{i2})[0];
        } else {
            memoryInfo = null;
        }
        if (bdmd.mo58174l()) {
            memoryInfo2 = new ActivityManager.MemoryInfo();
            bdjb.m90889a(this.f106012i).getMemoryInfo(memoryInfo2);
        } else {
            memoryInfo2 = null;
        }
        if (bdmd.mo58167f() || bdmd.mo58168g() || bdmd.mo58169h() || bdmd.mo58171i()) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                String a = bobi.m111039a(new File("/proc/self/status"), Charset.defaultCharset()).mo68797a();
                if (a.isEmpty()) {
                    bnrq bnrq = (bnrq) f106004a.mo68387b();
                    bnrq.mo68432a("bdmv", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnrq.mo68405a("Null or empty proc status");
                    bdmu = null;
                } else {
                    bdmu = new bdmu();
                    if (bdmd.mo58167f()) {
                        bdmu.f105999a = m91113a(f106005b, a);
                    }
                    if (bdmd.mo58168g()) {
                        bdmu.f106000b = m91113a(f106006c, a);
                    }
                    if (bdmd.mo58169h()) {
                        bdmu.f106001c = m91113a(f106007d, a);
                    }
                    if (bdmd.mo58171i()) {
                        bdmu.f106002d = m91113a(f106008e, a);
                    }
                    if (bdmd.mo58172j()) {
                        bdmu.f106003e = m91113a(f106009f, a);
                    }
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            } catch (IOException e) {
                bnrq bnrq2 = (bnrq) f106004a.mo68387b();
                bnrq2.mo68437a(e);
                bnrq2.mo68432a("bdmv", "a", 253, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq2.mo68405a("Error reading proc status");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                bdmu = null;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        } else {
            bdmu = null;
        }
        bxvf bxvf = (bxvf) cine.f190919g.mo74144da();
        bxvd da = cinc.f190914c.mo74144da();
        bxvd da2 = cina.f190884z.mo74144da();
        if (memoryInfo != null) {
            int i3 = memoryInfo.dalvikPss;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina = (cina) da2.f164949b;
            cina.f190885a |= 1;
            cina.f190886b = i3;
            int i4 = memoryInfo.nativePss;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina2 = (cina) da2.f164949b;
            cina2.f190885a |= 2;
            cina2.f190887c = i4;
            int i5 = memoryInfo.otherPss;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina3 = (cina) da2.f164949b;
            cina3.f190885a |= 4;
            cina3.f190888d = i5;
            int i6 = memoryInfo.dalvikPrivateDirty;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina4 = (cina) da2.f164949b;
            cina4.f190885a |= 8;
            cina4.f190889e = i6;
            int i7 = memoryInfo.nativePrivateDirty;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina5 = (cina) da2.f164949b;
            cina5.f190885a |= 16;
            cina5.f190890f = i7;
            int i8 = memoryInfo.otherPrivateDirty;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina6 = (cina) da2.f164949b;
            cina6.f190885a |= 32;
            cina6.f190891g = i8;
            int totalPss = memoryInfo.getTotalPss();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina7 = (cina) da2.f164949b;
            cina7.f190885a |= 64;
            cina7.f190892h = totalPss;
            int i9 = Build.VERSION.SDK_INT;
            int totalPrivateClean = memoryInfo.getTotalPrivateClean();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina8 = (cina) da2.f164949b;
            cina8.f190885a |= 128;
            cina8.f190893i = totalPrivateClean;
            int totalSwappablePss = memoryInfo.getTotalSwappablePss();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina9 = (cina) da2.f164949b;
            cina9.f190885a |= 512;
            cina9.f190895k = totalSwappablePss;
            int totalSharedDirty = memoryInfo.getTotalSharedDirty();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina10 = (cina) da2.f164949b;
            cina10.f190885a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cina10.f190894j = totalSharedDirty;
            int i10 = Build.VERSION.SDK_INT;
            int a2 = m91108a(memoryInfo);
            if (a2 != -1) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cina cina11 = (cina) da2.f164949b;
                cina11.f190885a |= 1024;
                cina11.f190896l = a2;
            }
            int i11 = Build.VERSION.SDK_INT;
            try {
                Map<String, String> memoryStats = memoryInfo.getMemoryStats();
                Integer a3 = m91112a(memoryStats.get("summary.code"));
                if (a3 != null) {
                    int intValue = a3.intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cina cina12 = (cina) da2.f164949b;
                    cina12.f190885a |= 4096;
                    cina12.f190898n = intValue;
                }
                Integer a4 = m91112a(memoryStats.get("summary.stack"));
                if (a4 != null) {
                    int intValue2 = a4.intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cina cina13 = (cina) da2.f164949b;
                    cina13.f190885a |= 8192;
                    cina13.f190899o = intValue2;
                }
                Integer a5 = m91112a(memoryStats.get("summary.graphics"));
                if (a5 != null) {
                    int intValue3 = a5.intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cina cina14 = (cina) da2.f164949b;
                    cina14.f190885a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    cina14.f190900p = intValue3;
                }
                Integer a6 = m91112a(memoryStats.get("summary.system"));
                if (a6 != null) {
                    int intValue4 = a6.intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cina cina15 = (cina) da2.f164949b;
                    cina15.f190885a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    cina15.f190902r = intValue4;
                }
                Integer a7 = m91112a(memoryStats.get("summary.java-heap"));
                if (a7 != null) {
                    int intValue5 = a7.intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cina cina16 = (cina) da2.f164949b;
                    cina16.f190885a |= 2048;
                    cina16.f190897m = intValue5;
                }
                Integer a8 = m91112a(memoryStats.get("summary.private-other"));
                if (a8 != null) {
                    int intValue6 = a8.intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cina cina17 = (cina) da2.f164949b;
                    cina17.f190885a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    cina17.f190901q = intValue6;
                }
            } catch (NumberFormatException e2) {
                bnrq bnrq3 = (bnrq) f106004a.mo68387b();
                bnrq3.mo68437a(e2);
                bnrq3.mo68432a("bdmv", "a", 329, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq3.mo68405a("failed to collect memory summary stats");
            }
        }
        if (memoryInfo2 != null) {
            int i12 = (int) (memoryInfo2.availMem >> 10);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina18 = (cina) da2.f164949b;
            cina18.f190885a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            cina18.f190903s = i12;
            int i13 = (int) (memoryInfo2.totalMem >> 20);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cina cina19 = (cina) da2.f164949b;
            cina19.f190885a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            cina19.f190904t = i13;
        }
        if (bdmu != null) {
            Long l = bdmu.f105999a;
            if (l != null) {
                long longValue = l.longValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cina cina20 = (cina) da2.f164949b;
                cina20.f190885a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                cina20.f190905u = longValue;
            }
            Long l2 = bdmu.f106000b;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cina cina21 = (cina) da2.f164949b;
                cina21.f190885a |= 1048576;
                cina21.f190906v = longValue2;
            }
            Long l3 = bdmu.f106001c;
            if (l3 != null) {
                long longValue3 = l3.longValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cina cina22 = (cina) da2.f164949b;
                cina22.f190885a |= 2097152;
                cina22.f190907w = longValue3;
            }
            Long l4 = bdmu.f106002d;
            if (l4 != null) {
                long longValue4 = l4.longValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cina cina23 = (cina) da2.f164949b;
                cina23.f190885a |= 4194304;
                cina23.f190908x = longValue4;
            }
            Long l5 = bdmu.f106003e;
            if (l5 != null) {
                long longValue5 = l5.longValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cina cina24 = (cina) da2.f164949b;
                cina24.f190885a |= 8388608;
                cina24.f190909y = longValue5;
            }
        }
        cina cina25 = (cina) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cinc cinc = (cinc) da.f164949b;
        cina25.getClass();
        cinc.f190917b = cina25;
        cinc.f190916a |= 1;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cine cine = (cine) bxvf.f164949b;
        cinc cinc2 = (cinc) da.mo74062i();
        cinc2.getClass();
        cine.f190922b = cinc2;
        cine.f190921a |= 1;
        bxvd da3 = ciob.f191036c.mo74144da();
        cioa a9 = bdjc.m90894a(str, this.f106012i);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ciob ciob = (ciob) da3.f164949b;
        a9.getClass();
        ciob.f191039b = a9;
        ciob.f191038a |= 1;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cine cine2 = (cine) bxvf.f164949b;
        ciob ciob2 = (ciob) da3.mo74062i();
        ciob2.getClass();
        cine2.f190923c = ciob2;
        cine2.f190921a |= 2;
        bxvd da4 = cinb.f190910c.mo74144da();
        boolean c = bdjb.m90892c(this.f106012i);
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cinb cinb = (cinb) da4.f164949b;
        cinb.f190912a = 1 | cinb.f190912a;
        cinb.f190913b = c;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cine cine3 = (cine) bxvf.f164949b;
        cinb cinb2 = (cinb) da4.mo74062i();
        cinb2.getClass();
        cine3.f190925e = cinb2;
        cine3.f190921a |= 8;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cine cine4 = (cine) bxvf.f164949b;
        int i14 = i - 1;
        if (i != 0) {
            cine4.f190924d = i14;
            int i15 = cine4.f190921a | 4;
            cine4.f190921a = i15;
            if (str3 != null) {
                str2.getClass();
                cine4.f190921a = i15 | 16;
                cine4.f190926f = str3;
            }
            return (cine) bxvf.mo74062i();
        }
        throw null;
    }
}
