package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: qdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qdw implements Runnable {

    /* renamed from: a */
    private static final sek f41053a = qgn.m32143a("ClearcutEventLogUploadRunnable");

    /* renamed from: b */
    private final DropBoxManager f41054b;

    /* renamed from: c */
    private final Map f41055c;

    /* renamed from: d */
    private final Map f41056d;

    /* renamed from: e */
    private final String f41057e;

    /* renamed from: f */
    private final qws f41058f;

    /* renamed from: g */
    private final Context f41059g;

    /* renamed from: h */
    private final SharedPreferences f41060h;

    /* renamed from: i */
    private final String f41061i = cdci.m132540f();

    /* renamed from: j */
    private final boolean f41062j;

    public qdw(Context context, DropBoxManager dropBoxManager, qws qws, boolean z) {
        boolean z2;
        this.f41059g = context;
        this.f41054b = dropBoxManager;
        ContentResolver contentResolver = context.getContentResolver();
        String g = cdci.m132541g();
        Map a = qer.m32027a(aymn.m84266a(contentResolver, "checkin_dropbox_upload:"), "checkin_dropbox_upload:", z, g);
        String f = cdci.m132540f();
        if (f == null || !aymn.f97982c.matcher(f).matches()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && !z && !TextUtils.isEmpty(g)) {
            for (String str : bmyx.m108640a(',').mo66918a((CharSequence) g)) {
                String valueOf = String.valueOf(str);
                if (!a.containsKey(valueOf.length() == 0 ? new String("checkin_dropbox_upload:") : "checkin_dropbox_upload:".concat(valueOf))) {
                    String valueOf2 = String.valueOf(str);
                    a.put(valueOf2.length() == 0 ? new String("checkin_dropbox_upload:") : "checkin_dropbox_upload:".concat(valueOf2), "true");
                }
            }
        }
        if (z) {
            a.put("checkin_dropbox_upload", String.valueOf(z2).toLowerCase(Locale.US));
        }
        this.f41055c = bnhe.m109413a(a);
        Map a2 = aymn.m84266a(context.getContentResolver(), "checkin_logging_policy:");
        bnha h = bnhe.m109414h();
        for (Map.Entry entry : a2.entrySet()) {
            String str2 = (String) entry.getKey();
            if (!str2.startsWith("checkin_logging_policy:")) {
                f41053a.mo25418e("Unexpected logging policy: %s key.", str2);
            } else {
                h.mo67695b(str2.replaceFirst("checkin_logging_policy:", ""), (String) entry.getValue());
            }
        }
        this.f41056d = h.mo67618b();
        this.f41057e = aymn.m84265a(context.getContentResolver(), "checkin_logging_policy", "TAG_AND_VALUE");
        this.f41062j = cdbz.m132512b();
        this.f41058f = qws;
        this.f41060h = context.getSharedPreferences("EventLogAggregator", 0);
    }

    /* renamed from: a */
    private final long m31989a() {
        return m31990a(this.f41060h, "clearcut_bookmark_shared_preference_key", qdn.m31960l(this.f41059g).getLong("CheckinTask_bookmark", 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021f, code lost:
        r2 = r0;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0223, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0226, code lost:
        r23 = r4;
        r22 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02fe, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x047a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x047b, code lost:
        r2 = r0;
        r14 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x047e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021e A[ExcHandler: all (r0v20 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r15 10  PHI: (r15v18 android.os.DropBoxManager$Entry) = (r15v16 android.os.DropBoxManager$Entry), (r15v16 android.os.DropBoxManager$Entry), (r15v20 android.os.DropBoxManager$Entry), (r15v20 android.os.DropBoxManager$Entry), (r15v20 android.os.DropBoxManager$Entry) binds: [B:3:0x0027, B:4:?, B:9:0x003a, B:42:0x00ab, B:28:0x007d] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027a A[SYNTHETIC, Splitter:B:125:0x027a] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02aa A[LOOP:4: B:144:0x02aa->B:165:0x0301, LOOP_START, PHI: r3 r8 10  PHI: (r3v12 java.lang.String) = (r3v8 java.lang.String), (r3v39 java.lang.String) binds: [B:143:0x02a8, B:165:0x0301] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r8v8 android.os.DropBoxManager$Entry) = (r8v7 android.os.DropBoxManager$Entry), (r8v11 android.os.DropBoxManager$Entry) binds: [B:143:0x02a8, B:165:0x0301] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x047a A[ExcHandler: all (r0v9 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r8 10  PHI: (r8v6 android.os.DropBoxManager$Entry) = (r8v4 android.os.DropBoxManager$Entry), (r8v4 android.os.DropBoxManager$Entry), (r8v8 android.os.DropBoxManager$Entry), (r8v8 android.os.DropBoxManager$Entry), (r8v8 android.os.DropBoxManager$Entry) binds: [B:140:0x02a0, B:141:?, B:195:0x03d8, B:200:0x03f1, B:145:0x02ac] A[DONT_GENERATE, DONT_INLINE], Splitter:B:140:0x02a0] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04ce  */
    public final void run() {
        DropBoxManager.Entry entry;
        Throwable th;
        SharedPreferences sharedPreferences;
        String str;
        qdv qdv;
        long a;
        ArrayList arrayList;
        DropBoxManager.Entry entry2;
        Throwable th2;
        qdv qdv2;
        Throwable th3;
        DropBoxManager.Entry entry3;
        DropBoxManager.Entry entry4;
        boolean z;
        DropBoxManager.Entry nextEntry;
        String str2;
        boolean z2;
        boolean z3;
        bmxv bmxv;
        DropBoxManager.Entry entry5;
        Throwable th4;
        bxvd bxvd;
        BufferedReader bufferedReader;
        InputStream inputStream;
        String str3 = "event_log";
        SharedPreferences sharedPreferences2 = this.f41059g.getSharedPreferences("EventLogAggregator", 0);
        String str4 = "clearcut_event_log_bookmark_shared_preference_key";
        long a2 = m31990a(this.f41060h, str4, m31989a());
        ArrayList arrayList2 = new ArrayList();
        int i = 2;
        try {
            entry5 = this.f41054b.getNextEntry(str3, a2);
            try {
                ArrayList arrayList3 = new ArrayList();
                long j = -1;
                BufferedReader bufferedReader2 = null;
                bxvd bxvd2 = null;
                while (entry5 != null) {
                    long j2 = j;
                    while (true) {
                        if (entry5 != null) {
                            if (arrayList3.size() >= i && j2 > a2) {
                                sharedPreferences = sharedPreferences2;
                                str = str4;
                                break;
                            }
                            if (bufferedReader2 != null || (inputStream = entry5.getInputStream()) == null) {
                                bufferedReader = bufferedReader2;
                            } else {
                                bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 4096);
                            }
                            arrayList3.clear();
                            if (bufferedReader == null) {
                                sharedPreferences = sharedPreferences2;
                                str = str4;
                            } else if (!sqy.m36057a(bufferedReader, arrayList3)) {
                                sharedPreferences = sharedPreferences2;
                                str = str4;
                            } else if (arrayList3.size() < 4) {
                                sharedPreferences = sharedPreferences2;
                                str = str4;
                                f41053a.mo25418e("event_log tagname does not exist", new Object[0]);
                            } else {
                                sharedPreferences = sharedPreferences2;
                                str = str4;
                                if (!arrayList3.isEmpty()) {
                                    try {
                                        String str5 = (String) arrayList3.get(0);
                                        int indexOf = str5.indexOf(46);
                                        if (indexOf != -1) {
                                            str5 = str5.substring(0, indexOf);
                                        }
                                        j2 = Long.parseLong(str5);
                                    } catch (NumberFormatException e) {
                                        NumberFormatException numberFormatException = e;
                                        sek sek = f41053a;
                                        String valueOf = String.valueOf((String) arrayList3.get(0));
                                        sek.mo25417e(valueOf.length() == 0 ? new String("Can't parse event_log timestamp: ") : "Can't parse event_log timestamp: ".concat(valueOf), numberFormatException, new Object[0]);
                                        bufferedReader2 = bufferedReader;
                                        j2 = -1;
                                    }
                                }
                                bufferedReader2 = bufferedReader;
                                str4 = str;
                                sharedPreferences2 = sharedPreferences;
                                i = 2;
                            }
                            long timeMillis = entry5.getTimeMillis();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            entry5.close();
                            arrayList3.clear();
                            entry5 = this.f41054b.getNextEntry(str3, timeMillis);
                            bufferedReader2 = null;
                            str4 = str;
                            sharedPreferences2 = sharedPreferences;
                            i = 2;
                        } else {
                            sharedPreferences = sharedPreferences2;
                            str = str4;
                            break;
                        }
                    }
                    if (entry5 == null) {
                        j = j2;
                        str4 = str;
                        sharedPreferences2 = sharedPreferences;
                        i = 2;
                    } else {
                        bxvd da = qhk.f41362e.mo74144da();
                        String str6 = (String) arrayList3.get(3);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        qhk qhk = (qhk) da.f164949b;
                        str6.getClass();
                        int i2 = qhk.f41364a | 1;
                        qhk.f41364a = i2;
                        qhk.f41365b = str6;
                        qhk.f41364a = i2 | 4;
                        qhk.f41367d = j2;
                        if (arrayList3.size() == 5) {
                            String str7 = (String) arrayList3.get(4);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            qhk qhk2 = (qhk) da.f164949b;
                            str7.getClass();
                            qhk2.f41364a |= 2;
                            qhk2.f41366c = str7;
                        } else if (arrayList3.size() > 5) {
                            StringBuilder sb = new StringBuilder();
                            sqy.m36056a((String) arrayList3.get(4), sb);
                            for (int i3 = 5; i3 < arrayList3.size(); i3++) {
                                sb.append(',');
                                sqy.m36056a((String) arrayList3.get(i3), sb);
                            }
                            String sb2 = sb.toString();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            qhk qhk3 = (qhk) da.f164949b;
                            sb2.getClass();
                            qhk3.f41364a |= 2;
                            qhk3.f41366c = sb2;
                        }
                        bmxv a3 = m31991a((qhk) da.mo74062i());
                        if (a3.mo66813a()) {
                            arrayList2.add((qhk) a3.mo66814b());
                        }
                        arrayList3.clear();
                        bxvd2 = da;
                        j = j2;
                        str4 = str;
                        sharedPreferences2 = sharedPreferences;
                        i = 2;
                    }
                }
                sharedPreferences = sharedPreferences2;
                str = str4;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException | SecurityException e2) {
                        th4 = e2;
                    } catch (Throwable th5) {
                        th = th5;
                        entry = entry5;
                        if (entry != null) {
                        }
                        throw th;
                    }
                }
                if (entry5 != null) {
                    entry5.close();
                }
                qdv = (!arrayList2.isEmpty() && (bxvd = bxvd2) != null) ? new qdv(((qhk) bxvd.f164949b).f41367d, arrayList2) : new qdv(a2, arrayList2);
            } catch (IOException e3) {
                e = e3;
                sharedPreferences = sharedPreferences2;
                str = str4;
                th4 = e;
                try {
                    f41053a.mo25417e("Can't copy dropbox data", th4, new Object[0]);
                    qdv = new qdv(a2, new ArrayList());
                    if (entry5 != null) {
                    }
                    m31992a(qdv.f41052b);
                    sharedPreferences.edit().putLong(str, qdv.f41051a).apply();
                    a = m31990a(this.f41060h, "clearcut_non_event_log_bookmark_shared_preference_key", m31989a());
                    arrayList = new ArrayList();
                    if (this.f41061i != null) {
                    }
                    z = false;
                    try {
                        nextEntry = this.f41054b.getNextEntry(null, a);
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bxvd bxvd3 = null;
                        while (nextEntry != null) {
                        }
                        if (nextEntry != null) {
                        }
                        if (arrayList.isEmpty()) {
                        }
                    } catch (IOException | SecurityException e4) {
                        e = e4;
                        entry3 = null;
                        th3 = e;
                        entry2 = entry3;
                        try {
                            f41053a.mo25417e("Can't copy dropbox data", th3, new Object[0]);
                            qdv2 = new qdv(a, new ArrayList());
                            if (entry2 != null) {
                                entry2.close();
                            }
                            m31992a(qdv2.f41052b);
                            sharedPreferences.edit().putLong("clearcut_non_event_log_bookmark_shared_preference_key", qdv2.f41051a).apply();
                        } catch (Throwable th6) {
                            th2 = th6;
                            if (entry2 != null) {
                                entry2.close();
                            }
                            throw th2;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        entry4 = null;
                        th2 = th;
                        entry2 = entry4;
                        if (entry2 != null) {
                        }
                        throw th2;
                    }
                    m31992a(qdv2.f41052b);
                    sharedPreferences.edit().putLong("clearcut_non_event_log_bookmark_shared_preference_key", qdv2.f41051a).apply();
                } catch (Throwable th8) {
                    th = th8;
                    entry = entry5;
                    if (entry != null) {
                        entry.close();
                    }
                    throw th;
                }
            } catch (SecurityException e5) {
                e = e5;
                sharedPreferences = sharedPreferences2;
                str = str4;
                th4 = e;
                f41053a.mo25417e("Can't copy dropbox data", th4, new Object[0]);
                qdv = new qdv(a2, new ArrayList());
                if (entry5 != null) {
                }
                m31992a(qdv.f41052b);
                sharedPreferences.edit().putLong(str, qdv.f41051a).apply();
                a = m31990a(this.f41060h, "clearcut_non_event_log_bookmark_shared_preference_key", m31989a());
                arrayList = new ArrayList();
                if (this.f41061i != null) {
                }
                z = false;
                nextEntry = this.f41054b.getNextEntry(null, a);
                byte[] bArr2 = new byte[4096];
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                bxvd bxvd32 = null;
                while (nextEntry != null) {
                }
                if (nextEntry != null) {
                }
                if (arrayList.isEmpty()) {
                }
                m31992a(qdv2.f41052b);
                sharedPreferences.edit().putLong("clearcut_non_event_log_bookmark_shared_preference_key", qdv2.f41051a).apply();
            } catch (Throwable th9) {
            }
        } catch (IOException | SecurityException e6) {
            sharedPreferences = sharedPreferences2;
            str = str4;
            th4 = e6;
            entry5 = null;
            f41053a.mo25417e("Can't copy dropbox data", th4, new Object[0]);
            qdv = new qdv(a2, new ArrayList());
            if (entry5 != null) {
                entry5.close();
            }
            m31992a(qdv.f41052b);
            sharedPreferences.edit().putLong(str, qdv.f41051a).apply();
            a = m31990a(this.f41060h, "clearcut_non_event_log_bookmark_shared_preference_key", m31989a());
            arrayList = new ArrayList();
            if (this.f41061i != null) {
            }
            z = false;
            nextEntry = this.f41054b.getNextEntry(null, a);
            byte[] bArr22 = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
            bxvd bxvd322 = null;
            while (nextEntry != null) {
            }
            if (nextEntry != null) {
            }
            if (arrayList.isEmpty()) {
            }
            m31992a(qdv2.f41052b);
            sharedPreferences.edit().putLong("clearcut_non_event_log_bookmark_shared_preference_key", qdv2.f41051a).apply();
        } catch (Throwable th10) {
            th = th10;
            entry = null;
            if (entry != null) {
            }
            throw th;
        }
        m31992a(qdv.f41052b);
        sharedPreferences.edit().putLong(str, qdv.f41051a).apply();
        a = m31990a(this.f41060h, "clearcut_non_event_log_bookmark_shared_preference_key", m31989a());
        arrayList = new ArrayList();
        try {
            if (this.f41061i != null) {
                try {
                    if (aymn.f97982c.matcher(this.f41061i).matches()) {
                        z = true;
                        nextEntry = this.f41054b.getNextEntry(null, a);
                        byte[] bArr222 = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream222 = new ByteArrayOutputStream();
                        bxvd bxvd3222 = null;
                        while (nextEntry != null) {
                            while (true) {
                                if (nextEntry == null) {
                                    str2 = str3;
                                    break;
                                }
                                String tag = nextEntry.getTag();
                                if (!tag.equals(str3) || (nextEntry.getFlags() & 1) != 0) {
                                    String valueOf2 = String.valueOf(tag);
                                    String str8 = (String) this.f41055c.get(valueOf2.length() == 0 ? new String("checkin_dropbox_upload:") : "checkin_dropbox_upload:".concat(valueOf2));
                                    if (str8 == null || !aymn.f97982c.matcher(str8).matches()) {
                                        if (z) {
                                            if (str8 == null) {
                                                break;
                                            } else if (!aymn.f97983d.matcher(str8).matches()) {
                                                str2 = str3;
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                long timeMillis2 = nextEntry.getTimeMillis();
                                nextEntry.close();
                                nextEntry = this.f41054b.getNextEntry(null, timeMillis2);
                                str3 = str3;
                            }
                            if (nextEntry != null) {
                                bxvd3222 = qhk.f41362e.mo74144da();
                                String tag2 = nextEntry.getTag();
                                if (bxvd3222.f164950c) {
                                    bxvd3222.mo74035c();
                                    bxvd3222.f164950c = false;
                                }
                                qhk qhk4 = (qhk) bxvd3222.f164949b;
                                tag2.getClass();
                                qhk4.f41364a |= 1;
                                qhk4.f41365b = tag2;
                                long timeMillis3 = nextEntry.getTimeMillis();
                                if (bxvd3222.f164950c) {
                                    bxvd3222.mo74035c();
                                    bxvd3222.f164950c = false;
                                }
                                qhk qhk5 = (qhk) bxvd3222.f164949b;
                                qhk5.f41364a |= 4;
                                qhk5.f41367d = timeMillis3;
                                byteArrayOutputStream222.reset();
                                InputStream inputStream2 = nextEntry.getInputStream();
                                while (true) {
                                    if (inputStream2 != null) {
                                        int read = inputStream2.read(bArr222);
                                        if (read <= 0) {
                                            z3 = z;
                                            break;
                                        }
                                        int min = Math.min(196608 - byteArrayOutputStream222.size(), read);
                                        byteArrayOutputStream222.write(bArr222, 0, min);
                                        if (min < read) {
                                            sek sek2 = f41053a;
                                            String tag3 = nextEntry.getTag();
                                            z3 = z;
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(tag3).length() + 49);
                                            sb3.append("Truncating ");
                                            sb3.append(tag3);
                                            sb3.append(" entry to ");
                                            sb3.append(196608);
                                            sb3.append(" bytes for upload");
                                            sek2.mo25416d(sb3.toString(), new Object[0]);
                                            if ((nextEntry.getFlags() & 2) != 0) {
                                                byteArrayOutputStream222.write("\n=== TRUNCATED FOR UPLOAD ===\n".getBytes());
                                            }
                                        }
                                    } else {
                                        z3 = z;
                                        break;
                                    }
                                }
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                if (byteArrayOutputStream222.toByteArray().length > 0) {
                                    bmxv = bmxv.m108566b(new String(byteArrayOutputStream222.toByteArray(), "ISO-8859-1"));
                                } else {
                                    bmxv = bmvz.f131120a;
                                }
                                if (bmxv.mo66813a()) {
                                    String str9 = (String) bmxv.mo66814b();
                                    if (bxvd3222.f164950c) {
                                        bxvd3222.mo74035c();
                                        bxvd3222.f164950c = false;
                                    }
                                    qhk qhk6 = (qhk) bxvd3222.f164949b;
                                    str9.getClass();
                                    qhk6.f41364a |= 2;
                                    qhk6.f41366c = str9;
                                }
                                bmxv a4 = m31991a((qhk) bxvd3222.mo74062i());
                                if (a4.mo66813a()) {
                                    arrayList.add((qhk) a4.mo66814b());
                                }
                                long timeMillis4 = nextEntry.getTimeMillis();
                                nextEntry.close();
                                nextEntry = this.f41054b.getNextEntry(null, timeMillis4);
                                str3 = str2;
                                z2 = z3;
                            } else {
                                str3 = str2;
                                z2 = z;
                            }
                        }
                        if (nextEntry != null) {
                            nextEntry.close();
                        }
                        qdv2 = arrayList.isEmpty() ? new qdv(a, arrayList) : new qdv(((qhk) bxvd3222.f164949b).f41367d, arrayList);
                        m31992a(qdv2.f41052b);
                        sharedPreferences.edit().putLong("clearcut_non_event_log_bookmark_shared_preference_key", qdv2.f41051a).apply();
                    }
                } catch (IOException | SecurityException e7) {
                    th3 = e7;
                    entry3 = null;
                    entry2 = entry3;
                    f41053a.mo25417e("Can't copy dropbox data", th3, new Object[0]);
                    qdv2 = new qdv(a, new ArrayList());
                    if (entry2 != null) {
                    }
                    m31992a(qdv2.f41052b);
                    sharedPreferences.edit().putLong("clearcut_non_event_log_bookmark_shared_preference_key", qdv2.f41051a).apply();
                } catch (Throwable th11) {
                    th2 = th11;
                    entry4 = null;
                    entry2 = entry4;
                    if (entry2 != null) {
                    }
                    throw th2;
                }
            }
            z = false;
            nextEntry = this.f41054b.getNextEntry(null, a);
            try {
                byte[] bArr2222 = new byte[4096];
                ByteArrayOutputStream byteArrayOutputStream2222 = new ByteArrayOutputStream();
                bxvd bxvd32222 = null;
                while (nextEntry != null) {
                }
                if (nextEntry != null) {
                }
                if (arrayList.isEmpty()) {
                }
            } catch (UnsupportedEncodingException e8) {
                throw new IllegalStateException("ISO-8859-1 not supported?", e8);
            } catch (IOException e9) {
                e = e9;
                th3 = e;
                entry2 = nextEntry;
                f41053a.mo25417e("Can't copy dropbox data", th3, new Object[0]);
                qdv2 = new qdv(a, new ArrayList());
                if (entry2 != null) {
                }
                m31992a(qdv2.f41052b);
                sharedPreferences.edit().putLong("clearcut_non_event_log_bookmark_shared_preference_key", qdv2.f41051a).apply();
            } catch (SecurityException e10) {
                e = e10;
                th3 = e;
                entry2 = nextEntry;
                f41053a.mo25417e("Can't copy dropbox data", th3, new Object[0]);
                qdv2 = new qdv(a, new ArrayList());
                if (entry2 != null) {
                }
                m31992a(qdv2.f41052b);
                sharedPreferences.edit().putLong("clearcut_non_event_log_bookmark_shared_preference_key", qdv2.f41051a).apply();
            } catch (Throwable th12) {
            }
        } catch (IOException | SecurityException e11) {
            e = e11;
            entry3 = null;
            th3 = e;
            entry2 = entry3;
            f41053a.mo25417e("Can't copy dropbox data", th3, new Object[0]);
            qdv2 = new qdv(a, new ArrayList());
            if (entry2 != null) {
            }
            m31992a(qdv2.f41052b);
            sharedPreferences.edit().putLong("clearcut_non_event_log_bookmark_shared_preference_key", qdv2.f41051a).apply();
        } catch (Throwable th13) {
            th = th13;
            entry4 = null;
            th2 = th;
            entry2 = entry4;
            if (entry2 != null) {
            }
            throw th2;
        }
        m31992a(qdv2.f41052b);
        sharedPreferences.edit().putLong("clearcut_non_event_log_bookmark_shared_preference_key", qdv2.f41051a).apply();
    }

    /* renamed from: a */
    private static long m31990a(SharedPreferences sharedPreferences, String str, long j) {
        try {
            return sharedPreferences.getLong(str, j);
        } catch (ClassCastException | NumberFormatException e) {
            f41053a.mo25418e(str.length() == 0 ? new String("Non-long value in sharedPrefs. key: ") : "Non-long value in sharedPrefs. key: ".concat(str), new Object[0]);
            return j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0121  */
    /* renamed from: a */
    private final bmxv m31991a(qhk qhk) {
        bmxv bmxv;
        String str;
        char c;
        String str2;
        int indexOf;
        if (!cdbz.f180442a.mo6606a().mo77214a()) {
            return bmxv.m108566b(qhk);
        }
        String str3 = qhk.f41365b;
        if (this.f41056d.containsKey(str3)) {
            bmxv = bmxv.m108566b((String) this.f41056d.get(str3));
        } else if (str3.equals("event_data")) {
            String[] split = qhk.f41366c.split("\\r?\\n", 5);
            bmxv bmxv2 = bmvz.f131120a;
            int length = split.length;
            if (length >= 4 && split[0].startsWith("start=") && split[1].startsWith("end=")) {
                if (!split[2].startsWith("log_start=")) {
                    str2 = split[3];
                } else {
                    str2 = length >= 5 ? split[4] : null;
                }
                if (str2 != null && (indexOf = str2.indexOf(",")) > 0) {
                    bmxv2 = bmxv.m108566b(str2.substring(0, indexOf));
                }
            }
            bmxv = bmxv2.mo66813a() ? bmxv.m108567c((String) this.f41056d.get(bmxv2.mo66814b())) : bmvz.f131120a;
        } else {
            bmxv = bmvz.f131120a;
        }
        if (bmxv.mo66813a()) {
            str = (String) bmxv.mo66814b();
        } else {
            str = this.f41057e;
        }
        int hashCode = str.hashCode();
        if (hashCode != 82810) {
            if (hashCode != 2402104) {
                if (hashCode == 702693956 && str.equals("TAG_AND_VALUE")) {
                    c = 0;
                    if (c != 0) {
                        return bmxv.m108566b(qhk);
                    }
                    if (c == 1) {
                        bxvd bxvd = (bxvd) qhk.mo74142c(5);
                        bxvd.mo73625a((bxvk) qhk);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        qhk qhk2 = (qhk) bxvd.f164949b;
                        qhk qhk3 = qhk.f41362e;
                        qhk2.f41364a &= -3;
                        qhk2.f41366c = qhk.f41362e.f41366c;
                        return bmxv.m108566b((qhk) bxvd.mo74062i());
                    } else if (c == 2) {
                        return bmvz.f131120a;
                    } else {
                        f41053a.mo25418e("Unexpected logging policy: %s", str);
                        return bmvz.f131120a;
                    }
                }
            } else if (str.equals("NONE")) {
                c = 2;
                if (c != 0) {
                }
            }
        } else if (str.equals("TAG")) {
            c = 1;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: a */
    private final void m31992a(List list) {
        qgl qgl = new qgl(this.f41058f, qdn.m31960l(this.f41059g));
        long size = (long) list.size();
        if (size > 0 && this.f41062j) {
            f41053a.mo25412b("Clearcut logging start.", new Object[0]);
            bxvd da = qhk.f41362e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhk qhk = (qhk) da.f164949b;
            "clearcut_checkin_event_log_diagnosis".getClass();
            int i = qhk.f41364a | 1;
            qhk.f41364a = i;
            qhk.f41365b = "clearcut_checkin_event_log_diagnosis";
            "clearcut_logging_start".getClass();
            qhk.f41364a = i | 2;
            qhk.f41366c = "clearcut_logging_start";
            long currentTimeMillis = System.currentTimeMillis();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhk qhk2 = (qhk) da.f164949b;
            qhk2.f41364a |= 4;
            qhk2.f41367d = currentTimeMillis;
            qgl.mo24043a((qhk) da.mo74062i());
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            qgl.mo24043a((qhk) list.get(i2));
        }
        if (size > 0 && cdbz.m132512b()) {
            sek sek = f41053a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Clearcut log lines: ");
            sb.append(size);
            sek.mo25412b(sb.toString(), new Object[0]);
            bxvd da2 = qhk.f41362e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qhk qhk3 = (qhk) da2.f164949b;
            "clearcut_checkin_event_log_diagnosis".getClass();
            qhk3.f41364a |= 1;
            qhk3.f41365b = "clearcut_checkin_event_log_diagnosis";
            String valueOf = String.valueOf(size);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qhk qhk4 = (qhk) da2.f164949b;
            valueOf.getClass();
            qhk4.f41364a |= 2;
            qhk4.f41366c = valueOf;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qhk qhk5 = (qhk) da2.f164949b;
            qhk5.f41364a |= 4;
            qhk5.f41367d = currentTimeMillis2;
            qgl.mo24043a((qhk) da2.mo74062i());
        }
    }
}
