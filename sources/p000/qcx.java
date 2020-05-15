package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.DropBoxManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: qcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qcx {

    /* renamed from: a */
    private static final Pattern f40950a = Pattern.compile("^([0-9a-fA-F][0-9a-fA-F][:-]?){5}[0-9a-fA-F][0-9a-fA-F]$");

    /* renamed from: b */
    private static final Map f40951b;

    /* renamed from: c */
    private static final File f40952c = new File("/system/etc/security/otacerts.zip");

    /* renamed from: d */
    private static final Pattern f40953d = Pattern.compile("^(([0-9]{15})|([0-9a-fA-F]{14}))$");

    /* renamed from: e */
    private static final Pattern f40954e = Pattern.compile("^([0-9a-fA-F]{8})$");

    /* renamed from: f */
    private static final Pattern f40955f = Pattern.compile("^([0-9]{0,15})$");

    static {
        HashMap hashMap = new HashMap();
        f40951b = hashMap;
        hashMap.put("client_id", qhq.BASE_CLIENT_ID);
        f40951b.put("search_client_id", qhq.SEARCH_CLIENT_ID);
        f40951b.put("voicesearch_client_id", qhq.VOICESEARCH_CLIENT_ID);
        f40951b.put("maps_client_id", qhq.MAPS_CLIENT_ID);
        f40951b.put("youtube_client_id", qhq.YOUTUBE_CLIENT_ID);
        f40951b.put("market_client_id", qhq.MARKET_CLIENT_ID);
        f40951b.put("shopper_client_id", qhq.SHOPPER_CLIENT_ID);
        f40951b.put("wallet_client_id", qhq.WALLET_CLIENT_ID);
        f40951b.put("chrome_client_id", qhq.CHROME_CLIENT_ID);
    }

    /* renamed from: b */
    public static void m31889b(Context context, bxvd bxvd) {
        qhg qhg = ((qgu) bxvd.f164949b).f41235l;
        if (qhg == null) {
            qhg = qhg.f41336o;
        }
        bxvd bxvd2 = (bxvd) qhg.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) qhg);
        qho h = qdg.m31927h(context);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        qhg qhg2 = (qhg) bxvd2.f164949b;
        qhg2.f41348k = h.f41394i;
        qhg2.f41338a |= 1024;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgu qgu = (qgu) bxvd.f164949b;
        qhg qhg3 = (qhg) bxvd2.mo74062i();
        qgu qgu2 = qgu.f41220A;
        qhg3.getClass();
        qgu.f41235l = qhg3;
        qgu.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    /* renamed from: c */
    public static void m31890c(Context context, bxvd bxvd) {
        String j = qdn.m31958j(context);
        String k = qdn.m31959k(context);
        if (j != null && k != null) {
            bxvd da = qgw.f41264d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qgw qgw = (qgw) da.f164949b;
            j.getClass();
            int i = qgw.f41266a | 1;
            qgw.f41266a = i;
            qgw.f41267b = j;
            k.getClass();
            qgw.f41266a = i | 2;
            qgw.f41268c = k;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qgu qgu = (qgu) bxvd.f164949b;
            qgw qgw2 = (qgw) da.mo74062i();
            qgu qgu2 = qgu.f41220A;
            qgw2.getClass();
            qgu.f41247x = qgw2;
            qgu.f41224a |= 4194304;
        }
    }

    /* renamed from: d */
    public static void m31891d(Context context, bxvd bxvd) {
        if (sre.m36080a(context)) {
            qgt qgt = qgt.SW_DEVICE;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qgu qgu = (qgu) bxvd.f164949b;
            qgu qgu2 = qgu.f41220A;
            qgu.f41246w = qgt.f41219d;
            qgu.f41224a |= 2097152;
        } else if (sre.m36082b(context)) {
            qgt qgt2 = qgt.LATCHSKY_DEVICE;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qgu qgu3 = (qgu) bxvd.f164949b;
            qgu qgu4 = qgu.f41220A;
            qgu3.f41246w = qgt2.f41219d;
            qgu3.f41224a |= 2097152;
        } else {
            qgt qgt3 = qgt.NO_RESTRICTION;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qgu qgu5 = (qgu) bxvd.f164949b;
            qgu qgu6 = qgu.f41220A;
            qgu5.f41246w = qgt3.f41219d;
            qgu5.f41224a |= 2097152;
        }
    }

    /* renamed from: e */
    public static void m31892e(Context context, bxvd bxvd) {
        bxvd bxvd2;
        qgu qgu = (qgu) bxvd.f164949b;
        if ((qgu.f41224a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            qhd qhd = qgu.f41240q;
            if (qhd == null) {
                qhd = qhd.f41286y;
            }
            bxvd2 = (bxvd) qhd.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) qhd);
        } else {
            bxvd2 = qhd.f41286y.mo74144da();
        }
        srd.m36074a(context, bxvd2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgu qgu2 = (qgu) bxvd.f164949b;
        qhd qhd2 = (qhd) bxvd2.mo74062i();
        qgu qgu3 = qgu.f41220A;
        qhd2.getClass();
        qgu2.f41240q = qhd2;
        qgu2.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
    }

    /* renamed from: f */
    public static void m31893f(Context context, bxvd bxvd) {
        int i;
        qgu qgu = (qgu) bxvd.f164949b;
        if (((qgu.f41224a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) == 0 || qgu.f41241r == 0) && Math.random() < cdci.m132551q()) {
            String str = null;
            try {
                qgu qgu2 = (qgu) bxvd.mo74062i();
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                sb.append(qdn.m31947b(context));
                sb.append(':');
                if ((qgu2.f41224a & 1) != 0) {
                    sb.append(qgu2.f41225b);
                    sb.append(':');
                }
                if ((qgu2.f41224a & 2) != 0) {
                    sb.append(qgu2.f41226c);
                    sb.append(':');
                }
                if ((qgu2.f41224a & 8) != 0) {
                    sb.append(qgu2.f41230g);
                    sb.append(':');
                }
                if ((qgu2.f41224a & 4) != 0) {
                    sb.append(qgu2.f41229f);
                    sb.append(':');
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < qgu2.f41227d.size()) {
                    sb.append((String) qgu2.f41227d.get(i));
                    sb.append(':');
                    sb.append((String) qgu2.f41228e.get(i));
                    sb.append(':');
                    i++;
                }
                byte[] bytes = sb.toString().getBytes(bmwy.f131158c);
                MessageDigest b = spn.m35868b("SHA-1");
                if (b != null) {
                    b.update(bytes);
                    hashMap.put("CONTENT_BINDER", Base64.encodeToString(b.digest(), 2));
                } else {
                    Log.e("CheckinRequestBuilder", "no support for SHA-1");
                }
                str = vvp.m41461a(context, "checkin", hashMap);
            } catch (RuntimeException e) {
                Log.i("CheckinRequestBuilder", "Droidguard runtime exception: ", e);
            } catch (NoClassDefFoundError e2) {
                Log.i("CheckinRequestBuilder", "Failed to exercise Droidguard client method", e2);
            }
            if (str != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                qgu qgu3 = (qgu) bxvd.f164949b;
                qgu qgu4 = qgu.f41220A;
                str.getClass();
                qgu3.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                qgu3.f41244u = str;
            }
        }
    }

    /* renamed from: g */
    public static void m31894g(Context context, bxvd bxvd) {
        String string = qdn.m31960l(context).getString("CheckinService_deviceDataVersionInfo", null);
        if (string != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qgu qgu = (qgu) bxvd.f164949b;
            qgu qgu2 = qgu.f41220A;
            string.getClass();
            qgu.f41224a |= 1048576;
            qgu.f41245v = string;
        }
    }

    /* renamed from: h */
    public static void m31895h(Context context, bxvd bxvd) {
        svu a = svu.m36486a();
        String e = a.mo26194e(context);
        if (e != null) {
            m31880a(context, e, bxvd);
            return;
        }
        String d = a.mo26191d(context);
        if (d != null) {
            m31880a(context, d, bxvd);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0293, code lost:
        if (r20.getTimeMillis() > r12) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03d8, code lost:
        throw new java.lang.RuntimeException("ISO-8859-1 not supported?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0123, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0124, code lost:
        r1 = r0;
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0195, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0197, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03e4 A[SYNTHETIC, Splitter:B:182:0x03e4] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03f2 A[Catch:{ IOException -> 0x03ed, SecurityException -> 0x03eb, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x03de A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0123 A[ExcHandler: all (r0v15 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r20 10  PHI: (r20v12 android.os.DropBoxManager$Entry) = (r20v5 android.os.DropBoxManager$Entry), (r20v5 android.os.DropBoxManager$Entry), (r20v5 android.os.DropBoxManager$Entry), (r20v4 android.os.DropBoxManager$Entry), (r20v4 android.os.DropBoxManager$Entry) binds: [B:163:0x0369, B:171:0x038d, B:76:0x0136, B:27:0x0075, B:56:0x00dc] A[DONT_GENERATE, DONT_INLINE], Splitter:B:27:0x0075] */
    /* renamed from: a */
    public static long m31871a(DropBoxManager dropBoxManager, Map map, long j, bxvd bxvd) {
        DropBoxManager.Entry entry;
        DropBoxManager.Entry entry2;
        Throwable th;
        Pair pair;
        bxvd bxvd2;
        qhg qhg;
        bxvd bxvd3;
        qhg qhg2;
        Pair pair2;
        Throwable th2;
        DropBoxManager.Entry entry3;
        Pair pair3;
        Throwable th3;
        DropBoxManager.Entry entry4;
        Throwable th4;
        boolean z;
        DropBoxManager.Entry nextEntry;
        int i;
        BufferedReader bufferedReader;
        bxvd bxvd4;
        DropBoxManager.Entry entry5;
        bxvd bxvd5;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        boolean z2;
        byte[] bArr2;
        BufferedReader bufferedReader2;
        ByteArrayOutputStream byteArrayOutputStream2;
        InputStream inputStream;
        DropBoxManager dropBoxManager2 = dropBoxManager;
        long j2 = j;
        String str = "event_log";
        Pair create = Pair.create(Long.valueOf(j), new ArrayList());
        try {
            String f = cdci.m132540f();
            if (f != null) {
                try {
                    if (aymn.f97982c.matcher(f).matches()) {
                        z = true;
                        nextEntry = dropBoxManager2.getNextEntry(null, j2);
                        entry = dropBoxManager2.getNextEntry(str, j2);
                        try {
                            ArrayList arrayList = new ArrayList();
                            byte[] bArr3 = new byte[4096];
                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                            ArrayList arrayList2 = new ArrayList();
                            pair2 = create;
                            long j3 = -1;
                            bxvd bxvd6 = null;
                            i = 0;
                            bufferedReader = null;
                            while (true) {
                                if (i < 524288) {
                                    bxvd4 = bxvd6;
                                    entry5 = nextEntry;
                                    break;
                                } else if (entry == null && nextEntry == null) {
                                    bxvd4 = bxvd6;
                                    entry5 = nextEntry;
                                    break;
                                } else {
                                    ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream3;
                                    DropBoxManager.Entry entry6 = nextEntry;
                                    long j4 = j3;
                                    while (true) {
                                        bxvd5 = bxvd6;
                                        if (entry == null) {
                                            byteArrayOutputStream = byteArrayOutputStream4;
                                            bArr = bArr3;
                                            break;
                                        }
                                        try {
                                            bArr = bArr3;
                                            if (arrayList.size() >= 2 && j4 > j2) {
                                                byteArrayOutputStream = byteArrayOutputStream4;
                                                break;
                                            }
                                            if (bufferedReader != null || (inputStream = entry.getInputStream()) == null) {
                                                bufferedReader2 = bufferedReader;
                                            } else {
                                                bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream), 4096);
                                            }
                                            arrayList.clear();
                                            if (bufferedReader2 != null && sqy.m36057a(bufferedReader2, arrayList)) {
                                                if (arrayList.size() < 4) {
                                                    Log.e("CheckinRequestBuilder", "event_log tagname does not exist");
                                                } else {
                                                    if (!arrayList.isEmpty()) {
                                                        try {
                                                            String str2 = (String) arrayList.get(0);
                                                            int indexOf = str2.indexOf(46);
                                                            if (indexOf != -1) {
                                                                str2 = str2.substring(0, indexOf);
                                                            }
                                                            j4 = Long.parseLong(str2);
                                                        } catch (NumberFormatException e) {
                                                            NumberFormatException numberFormatException = e;
                                                            String valueOf = String.valueOf((String) arrayList.get(0));
                                                            Log.e("CheckinRequestBuilder", valueOf.length() == 0 ? new String("Can't parse event_log timestamp: ") : "Can't parse event_log timestamp: ".concat(valueOf), numberFormatException);
                                                            byteArrayOutputStream2 = byteArrayOutputStream4;
                                                            bufferedReader = bufferedReader2;
                                                            j4 = -1;
                                                        }
                                                    }
                                                    byteArrayOutputStream2 = byteArrayOutputStream4;
                                                    bufferedReader = bufferedReader2;
                                                    byteArrayOutputStream4 = byteArrayOutputStream2;
                                                    bxvd6 = bxvd5;
                                                    bArr3 = bArr;
                                                    j2 = j;
                                                }
                                            }
                                            byteArrayOutputStream2 = byteArrayOutputStream4;
                                            long timeMillis = entry.getTimeMillis();
                                            if (bufferedReader2 != null) {
                                                bufferedReader2.close();
                                            }
                                            entry.close();
                                            arrayList.clear();
                                            entry = dropBoxManager2.getNextEntry(str, timeMillis);
                                            bufferedReader = null;
                                            byteArrayOutputStream4 = byteArrayOutputStream2;
                                            bxvd6 = bxvd5;
                                            bArr3 = bArr;
                                            j2 = j;
                                        } catch (IOException | SecurityException e2) {
                                            e = e2;
                                            th2 = e;
                                            entry2 = entry6;
                                            try {
                                                Log.e("CheckinRequestBuilder", "Can't copy dropbox data", th2);
                                                if (entry2 != null) {
                                                }
                                                if (entry != null) {
                                                }
                                                pair = pair2;
                                                bxvd2 = bxvd;
                                                qhg = ((qgu) bxvd2.f164949b).f41235l;
                                                if (qhg == null) {
                                                }
                                                bxvd3 = (bxvd) qhg.mo74142c(5);
                                                bxvd3.mo73625a((GeneratedMessageLite) qhg);
                                                if (bxvd3.f164950c) {
                                                }
                                                qhg qhg3 = (qhg) bxvd3.f164949b;
                                                qhg3.f41338a |= 8;
                                                qhg3.f41340c = j;
                                                Iterable iterable = (Iterable) pair.second;
                                                if (bxvd3.f164950c) {
                                                }
                                                qhg2 = (qhg) bxvd3.f164949b;
                                                if (!qhg2.f41342e.mo73666a()) {
                                                }
                                                bxsy.m123078a(iterable, qhg2.f41342e);
                                                if (bxvd2.f164950c) {
                                                }
                                                qgu qgu = (qgu) bxvd2.f164949b;
                                                qhg qhg4 = (qhg) bxvd3.mo74062i();
                                                qgu qgu2 = qgu.f41220A;
                                                qhg4.getClass();
                                                qgu.f41235l = qhg4;
                                                qgu.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                return ((Long) pair.first).longValue();
                                            } catch (Throwable th5) {
                                                th = th5;
                                                if (entry2 != null) {
                                                }
                                                if (entry != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                        }
                                    }
                                    while (true) {
                                        if (entry6 == null) {
                                            break;
                                        }
                                        String tag = entry6.getTag();
                                        if (!tag.equals(str) || (entry6.getFlags() & 1) != 0) {
                                            String valueOf2 = String.valueOf(tag);
                                            String str3 = (String) map.get(valueOf2.length() == 0 ? new String("checkin_dropbox_upload:") : "checkin_dropbox_upload:".concat(valueOf2));
                                            if (str3 != null && aymn.f97982c.matcher(str3).matches()) {
                                                break;
                                            } else if (!z) {
                                                continue;
                                            } else if (str3 == null) {
                                                break;
                                            } else if (!aymn.f97983d.matcher(str3).matches()) {
                                                break;
                                            }
                                        }
                                        long timeMillis2 = entry6.getTimeMillis();
                                        entry6.close();
                                        entry6 = dropBoxManager2.getNextEntry(null, timeMillis2);
                                    }
                                    if (entry != null) {
                                        if (entry6 != null) {
                                            if (j4 >= entry6.getTimeMillis()) {
                                            }
                                        }
                                        bxvd6 = qhk.f41362e.mo74144da();
                                        String str4 = (String) arrayList.get(3);
                                        if (bxvd6.f164950c) {
                                            bxvd6.mo74035c();
                                            bxvd6.f164950c = false;
                                        }
                                        qhk qhk = (qhk) bxvd6.f164949b;
                                        str4.getClass();
                                        int i2 = qhk.f41364a | 1;
                                        qhk.f41364a = i2;
                                        qhk.f41365b = str4;
                                        qhk.f41364a = i2 | 4;
                                        qhk.f41367d = j4;
                                        if (arrayList.size() == 5) {
                                            String str5 = (String) arrayList.get(4);
                                            if (bxvd6.f164950c) {
                                                bxvd6.mo74035c();
                                                bxvd6.f164950c = false;
                                            }
                                            qhk qhk2 = (qhk) bxvd6.f164949b;
                                            str5.getClass();
                                            qhk2.f41364a |= 2;
                                            qhk2.f41366c = str5;
                                        } else if (arrayList.size() > 5) {
                                            StringBuilder sb = new StringBuilder();
                                            sqy.m36056a((String) arrayList.get(4), sb);
                                            for (int i3 = 5; i3 < arrayList.size(); i3++) {
                                                sb.append(',');
                                                sqy.m36056a((String) arrayList.get(i3), sb);
                                            }
                                            String sb2 = sb.toString();
                                            if (bxvd6.f164950c) {
                                                bxvd6.mo74035c();
                                                bxvd6.f164950c = false;
                                            }
                                            qhk qhk3 = (qhk) bxvd6.f164949b;
                                            sb2.getClass();
                                            qhk3.f41364a |= 2;
                                            qhk3.f41366c = sb2;
                                        }
                                        qhk qhk4 = (qhk) bxvd6.mo74062i();
                                        int i4 = qhk4.f164961ai;
                                        if (i4 == -1) {
                                            i4 = bxxm.f165037a.mo74228a(qhk4).mo74223b(qhk4);
                                            qhk4.f164961ai = i4;
                                        }
                                        i += i4 + 1;
                                        arrayList2.add((qhk) bxvd6.mo74062i());
                                        arrayList.clear();
                                        bArr3 = bArr;
                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                        j2 = j;
                                        nextEntry = entry6;
                                        j3 = j4;
                                    }
                                    if (entry6 != null) {
                                        if (entry == null) {
                                        }
                                        bxvd6 = qhk.f41362e.mo74144da();
                                        String tag2 = entry6.getTag();
                                        if (bxvd6.f164950c) {
                                            bxvd6.mo74035c();
                                            bxvd6.f164950c = false;
                                        }
                                        qhk qhk5 = (qhk) bxvd6.f164949b;
                                        tag2.getClass();
                                        qhk5.f41364a |= 1;
                                        qhk5.f41365b = tag2;
                                        long timeMillis3 = entry6.getTimeMillis();
                                        if (bxvd6.f164950c) {
                                            bxvd6.mo74035c();
                                            bxvd6.f164950c = false;
                                        }
                                        qhk qhk6 = (qhk) bxvd6.f164949b;
                                        String str6 = str;
                                        qhk6.f41364a |= 4;
                                        qhk6.f41367d = timeMillis3;
                                        byteArrayOutputStream.reset();
                                        InputStream inputStream2 = entry6.getInputStream();
                                        while (true) {
                                            if (inputStream2 != null) {
                                                bArr2 = bArr;
                                                int read = inputStream2.read(bArr2);
                                                if (read <= 0) {
                                                    z2 = z;
                                                    break;
                                                }
                                                z2 = z;
                                                int min = Math.min(196608 - byteArrayOutputStream.size(), read);
                                                byteArrayOutputStream.write(bArr2, 0, min);
                                                if (min < read) {
                                                    String tag3 = entry6.getTag();
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(tag3).length() + 49);
                                                    sb3.append("Truncating ");
                                                    sb3.append(tag3);
                                                    sb3.append(" entry to ");
                                                    sb3.append(196608);
                                                    sb3.append(" bytes for upload");
                                                    Log.w("CheckinRequestBuilder", sb3.toString());
                                                    if ((entry6.getFlags() & 2) != 0) {
                                                        byteArrayOutputStream.write("\n=== TRUNCATED FOR UPLOAD ===\n".getBytes());
                                                    }
                                                } else {
                                                    bArr = bArr2;
                                                    z = z2;
                                                }
                                            } else {
                                                z2 = z;
                                                bArr2 = bArr;
                                                break;
                                            }
                                        }
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        if (byteArray.length > 0) {
                                            String str7 = new String(byteArray, "ISO-8859-1");
                                            if (bxvd6.f164950c) {
                                                bxvd6.mo74035c();
                                                bxvd6.f164950c = false;
                                            }
                                            qhk qhk7 = (qhk) bxvd6.f164949b;
                                            str7.getClass();
                                            qhk7.f41364a |= 2;
                                            qhk7.f41366c = str7;
                                        }
                                        qhk qhk8 = (qhk) bxvd6.mo74062i();
                                        int i5 = qhk8.f164961ai;
                                        if (i5 == -1) {
                                            i5 = bxxm.f165037a.mo74228a(qhk8).mo74223b(qhk8);
                                            qhk8.f164961ai = i5;
                                        }
                                        i += i5 + 1;
                                        arrayList2.add((qhk) bxvd6.mo74062i());
                                        long timeMillis4 = entry6.getTimeMillis();
                                        entry6.close();
                                        j3 = j4;
                                        z = z2;
                                        bArr3 = bArr2;
                                        str = str6;
                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                        nextEntry = dropBoxManager2.getNextEntry(null, timeMillis4);
                                        j2 = j;
                                    }
                                    bxvd6 = bxvd5;
                                    bArr3 = bArr;
                                    byteArrayOutputStream3 = byteArrayOutputStream;
                                    j2 = j;
                                    nextEntry = entry6;
                                    j3 = j4;
                                }
                            }
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e3) {
                                    e = e3;
                                    th2 = e;
                                    entry2 = entry5;
                                    Log.e("CheckinRequestBuilder", "Can't copy dropbox data", th2);
                                    if (entry2 != null) {
                                        entry2.close();
                                    }
                                    if (entry != null) {
                                        entry.close();
                                    }
                                    pair = pair2;
                                    bxvd2 = bxvd;
                                    qhg = ((qgu) bxvd2.f164949b).f41235l;
                                    if (qhg == null) {
                                    }
                                    bxvd3 = (bxvd) qhg.mo74142c(5);
                                    bxvd3.mo73625a((GeneratedMessageLite) qhg);
                                    if (bxvd3.f164950c) {
                                    }
                                    qhg qhg32 = (qhg) bxvd3.f164949b;
                                    qhg32.f41338a |= 8;
                                    qhg32.f41340c = j;
                                    Iterable iterable2 = (Iterable) pair.second;
                                    if (bxvd3.f164950c) {
                                    }
                                    qhg2 = (qhg) bxvd3.f164949b;
                                    if (!qhg2.f41342e.mo73666a()) {
                                    }
                                    bxsy.m123078a(iterable2, qhg2.f41342e);
                                    if (bxvd2.f164950c) {
                                    }
                                    qgu qgu3 = (qgu) bxvd2.f164949b;
                                    qhg qhg42 = (qhg) bxvd3.mo74062i();
                                    qgu qgu22 = qgu.f41220A;
                                    qhg42.getClass();
                                    qgu3.f41235l = qhg42;
                                    qgu3.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    return ((Long) pair.first).longValue();
                                } catch (SecurityException e4) {
                                    e = e4;
                                    th2 = e;
                                    entry2 = entry5;
                                    Log.e("CheckinRequestBuilder", "Can't copy dropbox data", th2);
                                    if (entry2 != null) {
                                    }
                                    if (entry != null) {
                                    }
                                    pair = pair2;
                                    bxvd2 = bxvd;
                                    qhg = ((qgu) bxvd2.f164949b).f41235l;
                                    if (qhg == null) {
                                    }
                                    bxvd3 = (bxvd) qhg.mo74142c(5);
                                    bxvd3.mo73625a((GeneratedMessageLite) qhg);
                                    if (bxvd3.f164950c) {
                                    }
                                    qhg qhg322 = (qhg) bxvd3.f164949b;
                                    qhg322.f41338a |= 8;
                                    qhg322.f41340c = j;
                                    Iterable iterable22 = (Iterable) pair.second;
                                    if (bxvd3.f164950c) {
                                    }
                                    qhg2 = (qhg) bxvd3.f164949b;
                                    if (!qhg2.f41342e.mo73666a()) {
                                    }
                                    bxsy.m123078a(iterable22, qhg2.f41342e);
                                    if (bxvd2.f164950c) {
                                    }
                                    qgu qgu32 = (qgu) bxvd2.f164949b;
                                    qhg qhg422 = (qhg) bxvd3.mo74062i();
                                    qgu qgu222 = qgu.f41220A;
                                    qhg422.getClass();
                                    qgu32.f41235l = qhg422;
                                    qgu32.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    return ((Long) pair.first).longValue();
                                } catch (Throwable th7) {
                                    th = th7;
                                    entry2 = entry5;
                                    if (entry2 != null) {
                                        entry2.close();
                                    }
                                    if (entry != null) {
                                        entry.close();
                                    }
                                    throw th;
                                }
                            }
                            if (bxvd4 == null) {
                                pair = Pair.create(Long.valueOf(((qhk) bxvd4.f164949b).f41367d), arrayList2);
                            } else {
                                pair = pair2;
                            }
                            if (entry5 != null) {
                                entry5.close();
                            }
                            if (entry != null) {
                                entry.close();
                            }
                        } catch (IOException | SecurityException e5) {
                            pair2 = create;
                            th2 = e5;
                            entry2 = nextEntry;
                            Log.e("CheckinRequestBuilder", "Can't copy dropbox data", th2);
                            if (entry2 != null) {
                            }
                            if (entry != null) {
                            }
                            pair = pair2;
                            bxvd2 = bxvd;
                            qhg = ((qgu) bxvd2.f164949b).f41235l;
                            if (qhg == null) {
                            }
                            bxvd3 = (bxvd) qhg.mo74142c(5);
                            bxvd3.mo73625a((GeneratedMessageLite) qhg);
                            if (bxvd3.f164950c) {
                            }
                            qhg qhg3222 = (qhg) bxvd3.f164949b;
                            qhg3222.f41338a |= 8;
                            qhg3222.f41340c = j;
                            Iterable iterable222 = (Iterable) pair.second;
                            if (bxvd3.f164950c) {
                            }
                            qhg2 = (qhg) bxvd3.f164949b;
                            if (!qhg2.f41342e.mo73666a()) {
                            }
                            bxsy.m123078a(iterable222, qhg2.f41342e);
                            if (bxvd2.f164950c) {
                            }
                            qgu qgu322 = (qgu) bxvd2.f164949b;
                            qhg qhg4222 = (qhg) bxvd3.mo74062i();
                            qgu qgu2222 = qgu.f41220A;
                            qhg4222.getClass();
                            qgu322.f41235l = qhg4222;
                            qgu322.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            return ((Long) pair.first).longValue();
                        } catch (Throwable th8) {
                            th = th8;
                            entry2 = nextEntry;
                            if (entry2 != null) {
                            }
                            if (entry != null) {
                            }
                            throw th;
                        }
                        bxvd2 = bxvd;
                        qhg = ((qgu) bxvd2.f164949b).f41235l;
                        if (qhg == null) {
                            qhg = qhg.f41336o;
                        }
                        bxvd3 = (bxvd) qhg.mo74142c(5);
                        bxvd3.mo73625a((GeneratedMessageLite) qhg);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        qhg qhg32222 = (qhg) bxvd3.f164949b;
                        qhg32222.f41338a |= 8;
                        qhg32222.f41340c = j;
                        Iterable iterable2222 = (Iterable) pair.second;
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        qhg2 = (qhg) bxvd3.f164949b;
                        if (!qhg2.f41342e.mo73666a()) {
                            qhg2.f41342e = GeneratedMessageLite.m124021a(qhg2.f41342e);
                        }
                        bxsy.m123078a(iterable2222, qhg2.f41342e);
                        if (bxvd2.f164950c) {
                            bxvd.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        qgu qgu3222 = (qgu) bxvd2.f164949b;
                        qhg qhg42222 = (qhg) bxvd3.mo74062i();
                        qgu qgu22222 = qgu.f41220A;
                        qhg42222.getClass();
                        qgu3222.f41235l = qhg42222;
                        qgu3222.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        return ((Long) pair.first).longValue();
                    }
                } catch (IOException | SecurityException e6) {
                    th3 = e6;
                    pair3 = create;
                    entry3 = null;
                    entry2 = entry3;
                    entry = entry2;
                    Log.e("CheckinRequestBuilder", "Can't copy dropbox data", th2);
                    if (entry2 != null) {
                    }
                    if (entry != null) {
                    }
                    pair = pair2;
                    bxvd2 = bxvd;
                    qhg = ((qgu) bxvd2.f164949b).f41235l;
                    if (qhg == null) {
                    }
                    bxvd3 = (bxvd) qhg.mo74142c(5);
                    bxvd3.mo73625a((GeneratedMessageLite) qhg);
                    if (bxvd3.f164950c) {
                    }
                    qhg qhg322222 = (qhg) bxvd3.f164949b;
                    qhg322222.f41338a |= 8;
                    qhg322222.f41340c = j;
                    Iterable iterable22222 = (Iterable) pair.second;
                    if (bxvd3.f164950c) {
                    }
                    qhg2 = (qhg) bxvd3.f164949b;
                    if (!qhg2.f41342e.mo73666a()) {
                    }
                    bxsy.m123078a(iterable22222, qhg2.f41342e);
                    if (bxvd2.f164950c) {
                    }
                    qgu qgu32222 = (qgu) bxvd2.f164949b;
                    qhg qhg422222 = (qhg) bxvd3.mo74062i();
                    qgu qgu222222 = qgu.f41220A;
                    qhg422222.getClass();
                    qgu32222.f41235l = qhg422222;
                    qgu32222.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    return ((Long) pair.first).longValue();
                } catch (Throwable th9) {
                    th4 = th9;
                    entry4 = null;
                    entry2 = entry4;
                    entry = entry2;
                    if (entry2 != null) {
                    }
                    if (entry != null) {
                    }
                    throw th;
                }
            }
            z = false;
            nextEntry = dropBoxManager2.getNextEntry(null, j2);
            try {
                entry = dropBoxManager2.getNextEntry(str, j2);
                ArrayList arrayList3 = new ArrayList();
                byte[] bArr32 = new byte[4096];
                ByteArrayOutputStream byteArrayOutputStream32 = new ByteArrayOutputStream();
                ArrayList arrayList22 = new ArrayList();
                pair2 = create;
                long j32 = -1;
                bxvd bxvd62 = null;
                i = 0;
                bufferedReader = null;
                while (true) {
                    if (i < 524288) {
                    }
                }
                if (bufferedReader != null) {
                }
                if (bxvd4 == null) {
                }
                if (entry5 != null) {
                }
                if (entry != null) {
                }
            } catch (IOException | SecurityException e7) {
                pair2 = create;
                th2 = e7;
                entry = null;
                entry2 = nextEntry;
                Log.e("CheckinRequestBuilder", "Can't copy dropbox data", th2);
                if (entry2 != null) {
                }
                if (entry != null) {
                }
                pair = pair2;
                bxvd2 = bxvd;
                qhg = ((qgu) bxvd2.f164949b).f41235l;
                if (qhg == null) {
                }
                bxvd3 = (bxvd) qhg.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) qhg);
                if (bxvd3.f164950c) {
                }
                qhg qhg3222222 = (qhg) bxvd3.f164949b;
                qhg3222222.f41338a |= 8;
                qhg3222222.f41340c = j;
                Iterable iterable222222 = (Iterable) pair.second;
                if (bxvd3.f164950c) {
                }
                qhg2 = (qhg) bxvd3.f164949b;
                if (!qhg2.f41342e.mo73666a()) {
                }
                bxsy.m123078a(iterable222222, qhg2.f41342e);
                if (bxvd2.f164950c) {
                }
                qgu qgu322222 = (qgu) bxvd2.f164949b;
                qhg qhg4222222 = (qhg) bxvd3.mo74062i();
                qgu qgu2222222 = qgu.f41220A;
                qhg4222222.getClass();
                qgu322222.f41235l = qhg4222222;
                qgu322222.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                return ((Long) pair.first).longValue();
            } catch (Throwable th10) {
                th = th10;
                entry = null;
                entry2 = nextEntry;
                if (entry2 != null) {
                }
                if (entry != null) {
                }
                throw th;
            }
        } catch (IOException | SecurityException e8) {
            pair3 = create;
            entry3 = null;
            th3 = e8;
            entry2 = entry3;
            entry = entry2;
            Log.e("CheckinRequestBuilder", "Can't copy dropbox data", th2);
            if (entry2 != null) {
            }
            if (entry != null) {
            }
            pair = pair2;
            bxvd2 = bxvd;
            qhg = ((qgu) bxvd2.f164949b).f41235l;
            if (qhg == null) {
            }
            bxvd3 = (bxvd) qhg.mo74142c(5);
            bxvd3.mo73625a((GeneratedMessageLite) qhg);
            if (bxvd3.f164950c) {
            }
            qhg qhg32222222 = (qhg) bxvd3.f164949b;
            qhg32222222.f41338a |= 8;
            qhg32222222.f41340c = j;
            Iterable iterable2222222 = (Iterable) pair.second;
            if (bxvd3.f164950c) {
            }
            qhg2 = (qhg) bxvd3.f164949b;
            if (!qhg2.f41342e.mo73666a()) {
            }
            bxsy.m123078a(iterable2222222, qhg2.f41342e);
            if (bxvd2.f164950c) {
            }
            qgu qgu3222222 = (qgu) bxvd2.f164949b;
            qhg qhg42222222 = (qhg) bxvd3.mo74062i();
            qgu qgu22222222 = qgu.f41220A;
            qhg42222222.getClass();
            qgu3222222.f41235l = qhg42222222;
            qgu3222222.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            return ((Long) pair.first).longValue();
        } catch (Throwable th11) {
            entry4 = null;
            th4 = th11;
            entry2 = entry4;
            entry = entry2;
            if (entry2 != null) {
            }
            if (entry != null) {
            }
            throw th;
        }
        bxvd2 = bxvd;
        qhg = ((qgu) bxvd2.f164949b).f41235l;
        if (qhg == null) {
        }
        bxvd3 = (bxvd) qhg.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) qhg);
        if (bxvd3.f164950c) {
        }
        qhg qhg322222222 = (qhg) bxvd3.f164949b;
        qhg322222222.f41338a |= 8;
        qhg322222222.f41340c = j;
        Iterable iterable22222222 = (Iterable) pair.second;
        if (bxvd3.f164950c) {
        }
        qhg2 = (qhg) bxvd3.f164949b;
        if (!qhg2.f41342e.mo73666a()) {
        }
        bxsy.m123078a(iterable22222222, qhg2.f41342e);
        if (bxvd2.f164950c) {
        }
        qgu qgu32222222 = (qgu) bxvd2.f164949b;
        qhg qhg422222222 = (qhg) bxvd3.mo74062i();
        qgu qgu222222222 = qgu.f41220A;
        qhg422222222.getClass();
        qgu32222222.f41235l = qhg422222222;
        qgu32222222.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        return ((Long) pair.first).longValue();
    }

    /* renamed from: a */
    private static Object m31872a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr).invoke(obj, objArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(name).length());
            sb.append("Cannot call method ");
            sb.append(str);
            sb.append(" on object ");
            sb.append(name);
            Log.w("CheckinRequestBuilder", sb.toString(), e);
            return null;
        } catch (IllegalAccessException e2) {
            String name2 = cls.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(name2).length());
            sb2.append("Cannot call method ");
            sb2.append(str);
            sb2.append(" on object ");
            sb2.append(name2);
            Log.w("CheckinRequestBuilder", sb2.toString(), e2);
            return null;
        } catch (InvocationTargetException e3) {
            String name3 = cls.getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(name3).length());
            sb3.append("Cannot call method ");
            sb3.append(str);
            sb3.append(" on object ");
            sb3.append(name3);
            Log.w("CheckinRequestBuilder", sb3.toString(), e3);
            return null;
        }
    }

    /* renamed from: a */
    private static String m31873a(Context context, String str) {
        try {
            return aymk.m84258a(context.getContentResolver(), str);
        } catch (SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.w("CheckinRequestBuilder", valueOf.length() == 0 ? new String("Unable to get partner string with key: ") : "Unable to get partner string with key: ".concat(valueOf), e);
            return null;
        }
    }

    /* renamed from: a */
    private static String m31874a(String str) {
        if (TextUtils.isEmpty(str) || !f40955f.matcher(str).matches()) {
            return null;
        }
        int k = (int) cdci.m132545k();
        if (k > str.length()) {
            k = str.length();
        }
        String valueOf = String.valueOf(str.substring(0, str.length() - k));
        String valueOf2 = String.valueOf("000000000000000".substring(0, k));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public static qgu m31875a(qhj qhj) {
        bxvd da = qgu.f41220A.mo74144da();
        qhg qhg = qhg.f41336o;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qgu qgu = (qgu) da.f164949b;
        qhg.getClass();
        qgu.f41235l = qhg;
        qgu.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bxvd da2 = qhg.f41336o.mo74144da();
        if (qhj != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qhg qhg2 = (qhg) da2.f164949b;
            qhj.getClass();
            qhg2.f41349l = qhj;
            qhg2.f41338a |= 2048;
            int a = qhi.m32172a(qhj.f41357b);
            if (a == 0) {
                a = 1;
            }
            int i = qhj.f41358c;
            StringBuilder sb = new StringBuilder(59);
            sb.append("Checkin reason type: ");
            sb.append(a - 1);
            sb.append(" attempt count: ");
            sb.append(i);
            Log.i("CheckinRequestBuilder", sb.toString());
        }
        qhf qhf = qhf.f41317r;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        qhg qhg3 = (qhg) da2.f164949b;
        qhf.getClass();
        qhg3.f41339b = qhf;
        qhg3.f41338a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qgu qgu2 = (qgu) da.f164949b;
        qhg qhg4 = (qhg) da2.mo74062i();
        qhg4.getClass();
        qgu2.f41235l = qhg4;
        qgu2.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qgu qgu3 = (qgu) da.f164949b;
        qgu3.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        qgu3.f41241r = 0;
        return (qgu) da.mo74062i();
    }

    /* renamed from: a */
    static void m31876a(Context context, long j, bxvd bxvd) {
        long b = qdn.m31947b(context);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgu qgu = (qgu) bxvd.f164949b;
        qgu qgu2 = qgu.f41220A;
        int i = qgu.f41224a | 16;
        qgu.f41224a = i;
        qgu.f41231h = b;
        if (j != 0) {
            qgu.f41224a = i | 4096;
            qgu.f41238o = j;
        }
        if (j != 0 || b == 0) {
            qgu.m32152a(qgu);
        }
        long h = qdn.m31956h(context);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgu qgu3 = (qgu) bxvd.f164949b;
        qgu3.f41224a |= 32;
        qgu3.f41232i = h;
    }

    /* renamed from: a */
    public static void m31877a(Context context, TelephonyManager telephonyManager, WifiManager wifiManager, ConnectivityManager connectivityManager, boolean z, bxvd bxvd) {
        String str;
        WifiInfo connectionInfo;
        String macAddress;
        String str2;
        String extraInfo;
        TelephonyManager telephonyManager2 = telephonyManager;
        bxvd bxvd2 = bxvd;
        if (!sre.m36082b(context) || !cdci.m132550p()) {
            qhg qhg = ((qgu) bxvd2.f164949b).f41235l;
            if (qhg == null) {
                qhg = qhg.f41336o;
            }
            bxvd bxvd3 = (bxvd) qhg.mo74142c(5);
            bxvd3.mo73625a((GeneratedMessageLite) qhg);
            if (telephonyManager2 != null) {
                if (!qdg.m31925f(context)) {
                    Log.w("CheckinRequestBuilder", "Gms missing READ_PHONE_STATE permission, cannot read hw info.");
                } else {
                    int a = svu.m36486a().mo26184a(telephonyManager2);
                    int i = Build.VERSION.SDK_INT;
                    if (!cdci.m132555u()) {
                        String deviceId = telephonyManager.getDeviceId();
                        if (deviceId != null) {
                            if (f40954e.matcher(deviceId).matches()) {
                                if (a != 2) {
                                    Log.e("CheckinRequestBuilder", "ESN found on a non-CDMA phone");
                                }
                                if (deviceId.startsWith("80")) {
                                    Log.e("CheckinRequestBuilder", "TelephonyManager.getDeviceId() is returning a pseudo-ESN instead of an MEID");
                                } else if (!z) {
                                    if (bxvd2.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    qgu qgu = (qgu) bxvd2.f164949b;
                                    qgu qgu2 = qgu.f41220A;
                                    deviceId.getClass();
                                    qgu.f41224a |= 8;
                                    qgu.f41230g = deviceId;
                                }
                            } else if (!f40953d.matcher(deviceId).matches()) {
                                if (a == 2 || a == 1) {
                                    Log.e("CheckinRequestBuilder", "TelephonyManager.getDeviceId() must return a 15-decimal-digit IMEI, a 14-hex-digit MEID or an 8-hex-digit ESN ");
                                } else if (a != 0) {
                                    StringBuilder sb = new StringBuilder(deviceId.length() + 35);
                                    sb.append("Unknown phone type: ");
                                    sb.append(a);
                                    sb.append(" id=");
                                    sb.append(deviceId);
                                    Log.w("CheckinRequestBuilder", sb.toString());
                                }
                            } else if (!z) {
                                if (bxvd2.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                qgu qgu3 = (qgu) bxvd2.f164949b;
                                qgu qgu4 = qgu.f41220A;
                                deviceId.getClass();
                                qgu3.f41224a |= 2;
                                qgu3.f41226c = deviceId;
                            }
                        }
                    } else {
                        String imei = telephonyManager.getImei();
                        String meid = telephonyManager.getMeid();
                        if (imei != null) {
                            if (bxvd2.f164950c) {
                                bxvd.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            qgu qgu5 = (qgu) bxvd2.f164949b;
                            qgu qgu6 = qgu.f41220A;
                            imei.getClass();
                            qgu5.f41224a |= 1;
                            qgu5.f41225b = imei;
                        }
                        if (meid != null) {
                            if (bxvd2.f164950c) {
                                bxvd.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            qgu qgu7 = (qgu) bxvd2.f164949b;
                            qgu qgu8 = qgu.f41220A;
                            meid.getClass();
                            qgu7.f41224a |= 2;
                            qgu7.f41226c = meid;
                        }
                        if (imei == null && meid == null) {
                            if (a == 2) {
                                Log.e("CheckinRequestBuilder", "CDMA phone did not return meid");
                            } else if (a == 1) {
                                Log.e("CheckinRequestBuilder", "GSM phone did not return imei");
                            } else if (a != 0) {
                                StringBuilder sb2 = new StringBuilder(31);
                                sb2.append("Unknown phone type: ");
                                sb2.append(a);
                                Log.w("CheckinRequestBuilder", sb2.toString());
                            }
                        }
                    }
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (!TextUtils.isEmpty(networkOperator)) {
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        qhg qhg2 = (qhg) bxvd3.f164949b;
                        networkOperator.getClass();
                        qhg2.f41338a |= 16;
                        qhg2.f41343f = networkOperator;
                    }
                    String simOperator = telephonyManager.getSimOperator();
                    if (!TextUtils.isEmpty(simOperator)) {
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        qhg qhg3 = (qhg) bxvd3.f164949b;
                        simOperator.getClass();
                        qhg3.f41338a |= 32;
                        qhg3.f41344g = simOperator;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                boolean isVoiceCapable = telephonyManager.isVoiceCapable();
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                qhg qhg4 = (qhg) bxvd3.f164949b;
                qhg4.f41338a |= 128;
                qhg4.f41346i = isVoiceCapable;
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(9);
            if (networkInfo != null && !z && (extraInfo = networkInfo.getExtraInfo()) != null && f40950a.matcher(extraInfo).matches()) {
                bxvd2.mo74056g(extraInfo.replace(":", "").replace("-", ""));
                bxvd2.mo74061h("ethernet");
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getTypeName() != null) {
                    String typeName = activeNetworkInfo.getTypeName();
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    qhg qhg5 = (qhg) bxvd3.f164949b;
                    typeName.getClass();
                    qhg5.f41338a |= 4096;
                    qhg5.f41351n = typeName;
                }
                String typeName2 = activeNetworkInfo.getTypeName();
                String subtypeName = activeNetworkInfo.getSubtypeName();
                if (!activeNetworkInfo.isRoaming()) {
                    str2 = "";
                } else {
                    str2 = "r";
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(typeName2).length() + 2 + String.valueOf(subtypeName).length() + str2.length());
                sb3.append(typeName2);
                sb3.append(":");
                sb3.append(subtypeName);
                sb3.append(":");
                sb3.append(str2);
                String sb4 = sb3.toString();
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                qhg qhg6 = (qhg) bxvd3.f164949b;
                sb4.getClass();
                qhg6.f41338a |= 64;
                qhg6.f41345h = sb4;
            }
            if (!(wifiManager == null || z || (connectionInfo = wifiManager.getConnectionInfo()) == null || (macAddress = connectionInfo.getMacAddress()) == null)) {
                bxvd2.mo74056g(macAddress.replace(":", ""));
                bxvd2.mo74061h("wifi");
            }
            if (!qdg.m31925f(context)) {
                Log.w("CheckinRequestBuilder", "Gms missing READ_PHONE_STATE permission, cannot read SIM subscription info");
            } else {
                int i3 = Build.VERSION.SDK_INT;
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                if ((subscriptionManager == null || !m31887a(telephonyManager2, subscriptionManager, bxvd3)) && telephonyManager2 != null) {
                    bxvd da = qhu.f41418i.mo74144da();
                    String simOperator2 = telephonyManager.getSimOperator();
                    if (!TextUtils.isEmpty(simOperator2)) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        qhu qhu = (qhu) da.f164949b;
                        simOperator2.getClass();
                        qhu.f41420a = 1 | qhu.f41420a;
                        qhu.f41421b = simOperator2;
                    }
                    String simOperatorName = telephonyManager.getSimOperatorName();
                    if (telephonyManager.getSimState() == 5 && !TextUtils.isEmpty(simOperatorName)) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        qhu qhu2 = (qhu) da.f164949b;
                        simOperatorName.getClass();
                        qhu2.f41420a |= 2;
                        qhu2.f41422c = simOperatorName;
                    }
                    int i4 = ((qhu) da.f164949b).f41420a;
                    if (!((i4 & 1) == 0 && (i4 & 2) == 0)) {
                        if (!telephonyManager.isNetworkRoaming()) {
                            str = "0";
                        } else {
                            str = "1";
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        qhu qhu3 = (qhu) da.f164949b;
                        str.getClass();
                        qhu3.f41420a |= 4;
                        qhu3.f41423d = str;
                        da.mo74016a(qht.VOICE);
                        da.mo74016a(qht.DATA);
                        da.mo74016a(qht.SMS);
                        boolean e = cdci.m132539e();
                        String subscriberId = telephonyManager.getSubscriberId();
                        if (e) {
                            String a2 = m31874a(subscriberId);
                            if (!TextUtils.isEmpty(a2)) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                qhu qhu4 = (qhu) da.f164949b;
                                a2.getClass();
                                qhu4.f41420a |= 16;
                                qhu4.f41425f = a2;
                            }
                            int i5 = Build.VERSION.SDK_INT;
                            String groupIdLevel1 = telephonyManager.getGroupIdLevel1();
                            if (!TextUtils.isEmpty(groupIdLevel1)) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                qhu qhu5 = (qhu) da.f164949b;
                                groupIdLevel1.getClass();
                                qhu5.f41420a |= 32;
                                qhu5.f41426g = groupIdLevel1;
                            }
                        }
                        try {
                            ByteString a3 = ByteString.m123261a(azoh.m85915a(subscriberId, (int) cdci.m132548n()));
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            qhu qhu6 = (qhu) da.f164949b;
                            a3.getClass();
                            qhu6.f41420a |= 64;
                            qhu6.f41427h = a3;
                        } catch (RuntimeException e2) {
                            Log.w("CheckinRequestBuilder", "Exception while truncating the IMSI", e2);
                        }
                        bxvd3.mo74084m(da);
                    }
                }
            }
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            qgu qgu9 = (qgu) bxvd2.f164949b;
            qhg qhg7 = (qhg) bxvd3.mo74062i();
            qgu qgu10 = qgu.f41220A;
            qhg7.getClass();
            qgu9.f41235l = qhg7;
            qgu9.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
    }

    /* renamed from: a */
    public static void m31878a(Context context, bxvd bxvd) {
        qhg qhg = ((qgu) bxvd.f164949b).f41235l;
        if (qhg == null) {
            qhg = qhg.f41336o;
        }
        qhf qhf = qhg.f41339b;
        if (qhf == null) {
            qhf = qhf.f41317r;
        }
        bxvd bxvd2 = (bxvd) qhf.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) qhf);
        String a = m31873a(context, "client_id");
        ArrayList arrayList = null;
        for (String str : f40951b.keySet()) {
            String a2 = m31873a(context, str);
            if (a2 != null) {
                bxvd da = qhr.f41407d.mo74144da();
                qhq qhq = (qhq) f40951b.get(str);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhr qhr = (qhr) da.f164949b;
                qhr.f41410b = qhq.f41406j;
                int i = qhr.f41409a | 1;
                qhr.f41409a = i;
                a2.getClass();
                qhr.f41409a = i | 2;
                qhr.f41411c = a2;
                qhr qhr2 = (qhr) da.mo74062i();
                if (arrayList == null) {
                    arrayList = new ArrayList(Collections.unmodifiableList(((qhf) bxvd2.f164949b).f41334p));
                }
                arrayList.add(qhr2);
            }
        }
        if (arrayList != null) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            ((qhf) bxvd2.f164949b).f41334p = GeneratedMessageLite.m124030de();
            bxvd2.mo73935B(arrayList);
        }
        if (a != null) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            qhf qhf2 = (qhf) bxvd2.f164949b;
            a.getClass();
            qhf2.f41319a |= 32;
            qhf2.f41325g = a;
        }
        String packageName = context.getPackageName();
        try {
            int i2 = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            qhf qhf3 = (qhf) bxvd2.f164949b;
            qhf3.f41319a |= 128;
            qhf3.f41327i = i2;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(packageName);
            Log.wtf("CheckinRequestBuilder", valueOf.length() == 0 ? new String("Our own package not found: ") : "Our own package not found: ".concat(valueOf), e);
        }
        qhg qhg2 = ((qgu) bxvd.f164949b).f41235l;
        if (qhg2 == null) {
            qhg2 = qhg.f41336o;
        }
        bxvd bxvd3 = (bxvd) qhg2.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) qhg2);
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        qhg qhg3 = (qhg) bxvd3.f164949b;
        qhf qhf4 = (qhf) bxvd2.mo74062i();
        qhf4.getClass();
        qhg3.f41339b = qhf4;
        qhg3.f41338a |= 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgu qgu = (qgu) bxvd.f164949b;
        qhg qhg4 = (qhg) bxvd3.mo74062i();
        qgu qgu2 = qgu.f41220A;
        qhg4.getClass();
        qgu.f41235l = qhg4;
        qgu.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd A[SYNTHETIC, Splitter:B:41:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static void m31879a(Context context, bxvd bxvd, SharedPreferences sharedPreferences) {
        Throwable th;
        ZipFile zipFile;
        qhg qhg = ((qgu) bxvd.f164949b).f41235l;
        if (qhg == null) {
            qhg = qhg.f41336o;
        }
        qhf qhf = qhg.f41339b;
        if (qhf == null) {
            qhf = qhf.f41317r;
        }
        bxvd bxvd2 = (bxvd) qhf.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) qhf);
        srd.m36075a(context, bxvd2, sharedPreferences);
        qhg qhg2 = ((qgu) bxvd.f164949b).f41235l;
        if (qhg2 == null) {
            qhg2 = qhg.f41336o;
        }
        bxvd bxvd3 = (bxvd) qhg2.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) qhg2);
        int i = 0;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        qhg qhg3 = (qhg) bxvd3.f164949b;
        qhf qhf2 = (qhf) bxvd2.mo74062i();
        qhf2.getClass();
        qhg3.f41339b = qhf2;
        qhg3.f41338a |= 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgu qgu = (qgu) bxvd.f164949b;
        qhg qhg4 = (qhg) bxvd3.mo74062i();
        qgu qgu2 = qgu.f41220A;
        qhg4.getClass();
        qgu.f41235l = qhg4;
        qgu.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        try {
            zipFile = new ZipFile(f40952c);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                byte[] bArr = new byte[2048];
                int i2 = 0;
                while (entries.hasMoreElements()) {
                    try {
                        InputStream inputStream = zipFile.getInputStream((ZipEntry) entries.nextElement());
                        MessageDigest b = spn.m35868b("SHA-1");
                        if (b != null) {
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                b.update(bArr, 0, read);
                            }
                            bxvd.mo74066i(Base64.encodeToString(b.digest(), 2));
                            i2++;
                        } else {
                            Log.wtf("CheckinRequestBuilder", "no support for SHA-1?", new Exception());
                            bxvd.mo74066i("--NoSuchAlgorithmException--");
                            i2++;
                        }
                        inputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException e) {
                                e = e;
                                i2 = i;
                                Log.w("CheckinRequestBuilder", "error reading OTA certs", e);
                                bxvd.mo74066i("--IOException--");
                                i2++;
                                if (i2 != 0) {
                                }
                            }
                        }
                        throw th;
                    }
                }
                try {
                    zipFile.close();
                } catch (IOException e2) {
                    e = e2;
                }
                if (i2 != 0) {
                    bxvd.mo74066i("--no-output--");
                }
            } catch (Throwable th3) {
                th = th3;
                if (zipFile != null) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            zipFile = null;
            if (zipFile != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static void m31880a(Context context, String str, bxvd bxvd) {
        bxvd da = qgy.f41275e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qgy qgy = (qgy) da.f164949b;
        str.getClass();
        qgy.f41277a |= 1;
        qgy.f41278b = str;
        byte[] a = m31888a(context, str, "SHA1");
        if (a != null) {
            ByteString a2 = ByteString.m123261a(a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qgy qgy2 = (qgy) da.f164949b;
            a2.getClass();
            qgy2.f41277a |= 2;
            qgy2.f41279c = a2;
        }
        byte[] a3 = m31888a(context, str, "SHA256");
        if (a3 != null) {
            ByteString a4 = ByteString.m123261a(a3);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qgy qgy3 = (qgy) da.f164949b;
            a4.getClass();
            qgy3.f41277a |= 4;
            qgy3.f41280d = a4;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgu qgu = (qgu) bxvd.f164949b;
        qgy qgy4 = (qgy) da.mo74062i();
        qgu qgu2 = qgu.f41220A;
        qgy4.getClass();
        qgu.f41243t = qgy4;
        qgu.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
    }

    /* renamed from: a */
    public static void m31881a(Context context, List list) {
        adyd a = adyd.m51363a(context);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.startsWith("[")) {
                a.mo33921b("com.google", str);
                a.mo33921b("com.google.work", str);
                if (sre.m36080a(context)) {
                    a.mo33921b("cn.google", str);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m31882a(Context context, List list, bxvd bxvd) {
        if (!sre.m36082b(context) || !cdci.m132550p()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Account account = (Account) list.get(i);
                String str = null;
                try {
                    str = gie.m13194b(context, account, "AndroidCheckInServer");
                } catch (C1020gis e) {
                    Log.w("CheckinRequestBuilder", "awaiting user notification for token");
                } catch (gid e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.e("CheckinRequestBuilder", valueOf.length() == 0 ? new String("Unrecoverable authentication exception: ") : "Unrecoverable authentication exception: ".concat(valueOf), e2);
                } catch (IOException e3) {
                    Log.w("CheckinRequestBuilder", "error reading account token", e3);
                }
                String str2 = account.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2);
                sb.append("[");
                sb.append(str2);
                sb.append("]");
                bxvd.mo74052f(sb.toString());
                if (str != null && !str.isEmpty()) {
                    bxvd.mo74052f(str);
                }
            }
            if (list.isEmpty()) {
                bxvd.mo74052f("");
            }
        }
    }

    /* renamed from: a */
    static void m31883a(Context context, boolean z, bxvd bxvd) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        svu a = svu.m36486a();
        String b = bmxx.m108578b(aymn.m84264a(contentResolver, "digest"));
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgu qgu = (qgu) bxvd.f164949b;
        qgu qgu2 = qgu.f41220A;
        b.getClass();
        qgu.f41224a |= 64;
        qgu.f41233j = b;
        if (!Build.SERIAL.equals("unknown")) {
            str = Build.SERIAL;
        } else {
            int i = Build.VERSION.SDK_INT;
            if (qdg.m31925f(context)) {
                try {
                    str = Build.getSerial();
                } catch (SecurityException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.i("CheckinRequestBuilder", valueOf.length() == 0 ? new String("agetSerial method - Security Exception ") : "agetSerial method - Security Exception ".concat(valueOf));
                }
            }
            str = "unknown";
        }
        if (!z && !TextUtils.isEmpty(str) && !str.equalsIgnoreCase("unknown") && !sre.m36082b(context) && cdci.m132550p() && (!sre.m36083c(context) || cdci.f180455a.mo6606a().mo77229F())) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qgu qgu3 = (qgu) bxvd.f164949b;
            str.getClass();
            qgu3.f41224a |= 4;
            qgu3.f41229f = str;
        }
        qhg qhg = ((qgu) bxvd.f164949b).f41235l;
        if (qhg == null) {
            qhg = qhg.f41336o;
        }
        bxvd bxvd2 = (bxvd) qhg.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) qhg);
        int c = a.mo26189c();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        qhg qhg2 = (qhg) bxvd2.f164949b;
        qhg2.f41338a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        qhg2.f41347j = c;
        int c2 = a.mo26190c(context);
        if (c2 >= 0) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qgu qgu4 = (qgu) bxvd.f164949b;
            qgu4.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            qgu4.f41242s = c2;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgu qgu5 = (qgu) bxvd.f164949b;
        qhg qhg3 = (qhg) bxvd2.mo74062i();
        qhg3.getClass();
        qgu5.f41235l = qhg3;
        qgu5.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    /* renamed from: a */
    public static void m31884a(bxvd bxvd) {
        if (svu.m36486a().mo26192d()) {
            qhg qhg = ((qgu) bxvd.f164949b).f41235l;
            if (qhg == null) {
                qhg = qhg.f41336o;
            }
            bxvd bxvd2 = (bxvd) qhg.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) qhg);
            bxvd2.mo74076k("te.bots");
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qgu qgu = (qgu) bxvd.f164949b;
            qhg qhg2 = (qhg) bxvd2.mo74062i();
            qgu qgu2 = qgu.f41220A;
            qhg2.getClass();
            qgu.f41235l = qhg2;
            qgu.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
    }

    /* renamed from: a */
    public static void m31885a(Locale locale, bxvd bxvd) {
        if (locale != null) {
            int i = Build.VERSION.SDK_INT;
            String languageTag = locale.toLanguageTag();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qgu qgu = (qgu) bxvd.f164949b;
            qgu qgu2 = qgu.f41220A;
            languageTag.getClass();
            qgu.f41224a |= 128;
            qgu.f41234k = languageTag;
            return;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgu qgu3 = (qgu) bxvd.f164949b;
        qgu qgu4 = qgu.f41220A;
        qgu3.f41224a &= -129;
        qgu3.f41234k = qgu.f41220A.f41234k;
    }

    /* renamed from: a */
    public static void m31886a(TimeZone timeZone, bxvd bxvd) {
        if (timeZone != null) {
            String id = timeZone.getID();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qgu qgu = (qgu) bxvd.f164949b;
            qgu qgu2 = qgu.f41220A;
            id.getClass();
            qgu.f41224a |= 2048;
            qgu.f41237n = id;
        }
    }

    /* renamed from: a */
    private static boolean m31887a(TelephonyManager telephonyManager, SubscriptionManager subscriptionManager, bxvd bxvd) {
        int i;
        List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null) {
            Log.i("CheckinRequestBuilder", "Unknown state of subscriptions on the device");
            return false;
        }
        if (!activeSubscriptionInfoList.isEmpty()) {
            int[] iArr = new int[3];
            int i2 = Build.VERSION.SDK_INT;
            String[] strArr = {"getDefaultVoiceSubscriptionId", "getDefaultDataSubscriptionId", "getDefaultSmsSubscriptionId"};
            try {
                i = ((Integer) SubscriptionManager.class.getDeclaredField("INVALID_SUBSCRIPTION_ID").get(subscriptionManager)).intValue();
            } catch (NoSuchFieldException e) {
                Log.w("CheckinRequestBuilder", "Error accessing INVALID_SUBSCRIPTION_ID field from SubscriptionManager", e);
                i = 0;
            } catch (IllegalAccessException e2) {
                Log.w("CheckinRequestBuilder", "Error invoking the SubscriptionManager methods for default Subscriptions", e2);
                i = 0;
            }
            iArr[2] = i;
            iArr[1] = i;
            iArr[0] = i;
            for (int i3 = 0; i3 < 3; i3++) {
                Object a = m31872a(SubscriptionManager.class, subscriptionManager, strArr[i3], null, null);
                if (a != null) {
                    iArr[i3] = ((Integer) a).intValue();
                }
            }
            for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                bxvd da = qhu.f41418i.mo74144da();
                int subscriptionId = subscriptionInfo.getSubscriptionId();
                int i4 = Build.VERSION.SDK_INT;
                String simOperator = telephonyManager.createForSubscriptionId(subscriptionId).getSimOperator();
                if (!TextUtils.isEmpty(simOperator)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    qhu qhu = (qhu) da.f164949b;
                    simOperator.getClass();
                    qhu.f41420a |= 1;
                    qhu.f41421b = simOperator;
                }
                if (!TextUtils.isEmpty(subscriptionInfo.getCarrierName())) {
                    String charSequence = subscriptionInfo.getCarrierName().toString();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    qhu qhu2 = (qhu) da.f164949b;
                    charSequence.getClass();
                    qhu2.f41420a |= 2;
                    qhu2.f41422c = charSequence;
                }
                String num = Integer.toString(subscriptionInfo.getDataRoaming());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhu qhu3 = (qhu) da.f164949b;
                num.getClass();
                qhu3.f41420a |= 4;
                qhu3.f41423d = num;
                if (subscriptionId != i) {
                    if (subscriptionId == iArr[0]) {
                        da.mo74016a(qht.VOICE);
                    }
                    if (subscriptionId == iArr[1]) {
                        da.mo74016a(qht.DATA);
                    }
                    if (subscriptionId == iArr[2]) {
                        da.mo74016a(qht.SMS);
                    }
                }
                boolean e3 = cdci.m132539e();
                int i5 = Build.VERSION.SDK_INT;
                String subscriberId = telephonyManager.createForSubscriptionId(subscriptionId).getSubscriberId();
                if (e3 && telephonyManager != null) {
                    String a2 = m31874a(subscriberId);
                    if (!TextUtils.isEmpty(a2)) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        qhu qhu4 = (qhu) da.f164949b;
                        a2.getClass();
                        qhu4.f41420a |= 16;
                        qhu4.f41425f = a2;
                    }
                    String str = (String) m31872a(TelephonyManager.class, telephonyManager, "getGroupIdLevel1", new Class[]{Integer.TYPE}, new Integer[]{Integer.valueOf(subscriptionId)});
                    if (!TextUtils.isEmpty(str)) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        qhu qhu5 = (qhu) da.f164949b;
                        str.getClass();
                        qhu5.f41420a |= 32;
                        qhu5.f41426g = str;
                    }
                }
                try {
                    ByteString a3 = ByteString.m123261a(azoh.m85915a(subscriberId, (int) cdci.m132548n()));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    qhu qhu6 = (qhu) da.f164949b;
                    a3.getClass();
                    qhu6.f41420a |= 64;
                    qhu6.f41427h = a3;
                } catch (RuntimeException e4) {
                    Log.w("CheckinRequestBuilder", "Exception while truncating the IMSI", e4);
                }
                bxvd.mo74084m(da);
            }
        }
        return true;
    }

    /* renamed from: a */
    private static byte[] m31888a(Context context, String str, String str2) {
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray();
            try {
                MessageDigest instance = MessageDigest.getInstance(str2);
                instance.update(byteArray, 0, byteArray.length);
                return instance.digest();
            } catch (NoSuchAlgorithmException e) {
                StringBuilder sb = new StringBuilder(str2.length() + 16);
                sb.append("no support for ");
                sb.append(str2);
                sb.append("?");
                Log.wtf("CheckinRequestBuilder", sb.toString(), e);
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("CheckinRequestBuilder", "package info for managing app not found:", e2);
            return null;
        }
    }
}
