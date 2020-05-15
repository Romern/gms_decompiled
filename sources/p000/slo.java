package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: slo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class slo {

    /* renamed from: a */
    public static PackageManager f44685a;

    /* renamed from: b */
    private static final int f44686b = ((Integer) skm.f44635d.mo58455c()).intValue();

    /* renamed from: c */
    private static final int f44687c = ((Integer) skm.f44636e.mo58455c()).intValue();

    /* renamed from: o */
    private static final srl f44688o = new slj();

    /* renamed from: p */
    private static final srl f44689p = new slk();

    /* renamed from: q */
    private static final srl f44690q = new sll();

    /* renamed from: r */
    private static final srl f44691r = new slm();

    /* renamed from: d */
    private RandomAccessFile f44692d;

    /* renamed from: e */
    private InputStream f44693e;

    /* renamed from: f */
    private FileChannel f44694f;

    /* renamed from: g */
    private FileLock f44695g;

    /* renamed from: h */
    private BufferedReader f44696h;

    /* renamed from: i */
    private File f44697i;

    /* renamed from: j */
    private final Context f44698j;

    /* renamed from: k */
    private Cursor f44699k;

    /* renamed from: l */
    private boolean f44700l;

    /* renamed from: m */
    private List f44701m;

    /* renamed from: n */
    private Iterator f44702n;

    /* renamed from: s */
    private final int f44703s;

    public slo(Context context, int i) {
        this.f44692d = null;
        this.f44693e = null;
        this.f44694f = null;
        this.f44695g = null;
        this.f44696h = null;
        sdo.m34959a(context);
        Context d = aytw.m84817d(context);
        this.f44698j = d;
        this.f44703s = i;
        f44685a = d.getPackageManager();
    }

    /* renamed from: a */
    public static slo m35585a(Context context, int i, File file) {
        if (file.exists()) {
            slo slo = new slo(context, i, file);
            try {
                File file2 = slo.f44697i;
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                slo.f44692d = randomAccessFile;
                FileChannel channel = randomAccessFile.getChannel();
                slo.f44694f = channel;
                FileLock tryLock = channel.tryLock();
                slo.f44695g = tryLock;
                if (tryLock == null) {
                    String valueOf = String.valueOf(file2.getName());
                    Log.w("StatsUploader", valueOf.length() == 0 ? new String("Not able to lock file") : "Not able to lock file".concat(valueOf));
                    throw new IOException("Unable to obtain exclusive lock");
                }
                slo.f44693e = Channels.newInputStream(slo.f44694f);
                slo.f44696h = new BufferedReader(new InputStreamReader(slo.f44693e));
                slo.f44700l = false;
                return slo;
            } catch (IOException | OverlappingFileLockException e) {
                slo.mo25706a();
                throw new sln(e);
            }
        } else {
            String absolutePath = file.getAbsolutePath();
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 20);
            sb.append("File ");
            sb.append(absolutePath);
            sb.append(" does not exist");
            throw new sln(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (!this.f44700l) {
            mo25706a();
        }
    }

    private slo(Context context, int i, File file) {
        this(context, i);
        this.f44697i = file;
        this.f44700l = true;
    }

    /* renamed from: a */
    private static final void m35586a(long j) {
        smv a = smv.m35679a();
        RadiosTracingLoggerProvider.NetworkActivityLogger networkActivityLogger = rpr.m34216b().getNetworkActivityLogger();
        if (a != null && !networkActivityLogger.isNopLogger()) {
            a.f44778a.mo25969a("radio_activity", "event_time_ms BETWEEN ? AND ?", new String[]{"0", String.valueOf(j)});
            networkActivityLogger.deleteEntries("event_time_ms", 0, j);
            RadiosTracingLoggerProvider.NetworkLatencyLogger networkLatencyLogger = rpr.m34216b().getNetworkLatencyLogger();
            if (!networkLatencyLogger.isNopLogger()) {
                networkLatencyLogger.deleteEntries("event_time_ms", 0, j);
            }
        }
    }

    /* renamed from: a */
    private final boolean m35587a(srl srl, List list) {
        try {
            if (this.f44696h == null) {
                Log.e("StatsUploader", "mBufferedReader is null!!! Try again later.");
                return false;
            }
            String str = null;
            int i = 0;
            while (i < f44686b) {
                BufferedReader bufferedReader = this.f44696h;
                sdo.m34959a(bufferedReader);
                str = bufferedReader.readLine();
                if (str == null) {
                    break;
                }
                Object a = srl.mo21850a(str);
                if (a != null) {
                    list.add(a);
                    i++;
                }
            }
            if (str != null) {
                return true;
            }
            return false;
        } catch (IOException e) {
            Log.e("StatsUploader", e.toString());
            return false;
        }
    }

    /* renamed from: a */
    public final void mo25706a() {
        try {
            FileLock fileLock = this.f44695g;
            if (fileLock != null) {
                if (fileLock.isValid()) {
                    FileChannel fileChannel = this.f44694f;
                    if (fileChannel != null) {
                        fileChannel.truncate(0L);
                    }
                }
                FileLock fileLock2 = this.f44695g;
                sdo.m34959a(fileLock2);
                fileLock2.release();
            }
            RandomAccessFile randomAccessFile = this.f44692d;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            FileChannel fileChannel2 = this.f44694f;
            if (fileChannel2 != null && fileChannel2.isOpen()) {
                this.f44694f.close();
            }
            InputStream inputStream = this.f44693e;
            if (inputStream != null) {
                inputStream.close();
            }
            BufferedReader bufferedReader = this.f44696h;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            Cursor cursor = this.f44699k;
            if (cursor != null) {
                if (!cursor.isClosed()) {
                    this.f44699k.close();
                }
                this.f44699k = null;
            }
            this.f44702n = null;
            this.f44701m = null;
        } catch (IOException e) {
            String valueOf = String.valueOf(e.toString());
            Log.e("StatsUploader", valueOf.length() == 0 ? new String("cleanup - try: ") : "cleanup - try: ".concat(valueOf));
        }
        this.f44700l = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06b6, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:?, code lost:
        throw null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x054f A[Catch:{ all -> 0x0544, all -> 0x05a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x06c3 A[LOOP:7: B:303:0x06bd->B:305:0x06c3, LOOP_END] */
    /* renamed from: a */
    public final void mo25707a(sli sli, List list, bpvc bpvc) {
        ArrayDeque arrayDeque;
        ArrayDeque arrayDeque2;
        boolean z;
        bxvd bxvd;
        ArrayDeque arrayDeque3;
        bxvd bxvd2;
        ArrayList arrayList;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        Cursor cursor;
        Iterator it;
        slo slo = this;
        int i = 1;
        boolean z2 = false;
        sdo.m34971a(slo.f44697i == null || slo.f44696h != null, (Object) "Uploader's file has not been opened");
        int i2 = 5;
        ArrayDeque arrayDeque4 = new ArrayDeque(5);
        while (true) {
            try {
                bxvd da = bpvf.f139321t.mo74144da();
                sdo.m34959a(da);
                int i3 = slo.f44703s;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    break;
                }
                if (i4 == 3) {
                    arrayDeque2 = arrayDeque4;
                    bxvd = da;
                    slo = this;
                    try {
                        if (!slo.f44697i.exists() || !slo.f44697i.getName().endsWith("wakelocks")) {
                            z = false;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            z = slo.m35587a(f44689p, arrayList2);
                            if (!arrayList2.isEmpty()) {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                ((bpvf) bxvd.f164949b).f139327e = GeneratedMessageLite.m124030de();
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bpvf bpvf = (bpvf) bxvd.f164949b;
                                if (!bpvf.f139327e.mo73666a()) {
                                    bpvf.f139327e = GeneratedMessageLite.m124021a(bpvf.f139327e);
                                }
                                bxsy.m123078a(arrayList2, bpvf.f139327e);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        arrayDeque = arrayDeque2;
                        while (!arrayDeque.isEmpty()) {
                            ((rke) arrayDeque.removeFirst()).mo9455a();
                        }
                        throw th;
                    }
                } else if (i4 == 4) {
                    try {
                        int i5 = Build.VERSION.SDK_INT;
                        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                            ArrayList arrayList3 = new ArrayList();
                            int i6 = Build.VERSION.SDK_INT;
                            if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                                if (slo.f44699k == null) {
                                    slo.f44699k = (Cursor) f44690q.mo21850a(slo.f44698j);
                                }
                                cursor = slo.f44699k;
                                if (cursor != null) {
                                    int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("tag_androidN");
                                    int columnIndexOrThrow13 = cursor.getColumnIndexOrThrow("uid_androidN");
                                    int columnIndexOrThrow14 = cursor.getColumnIndexOrThrow("device_state_androidN");
                                    int columnIndexOrThrow15 = cursor.getColumnIndexOrThrow("transport_type_androidN");
                                    int columnIndexOrThrow16 = cursor.getColumnIndexOrThrow("rxbytes_androidN");
                                    int columnIndexOrThrow17 = cursor.getColumnIndexOrThrow("rxpackets_androidN");
                                    int columnIndexOrThrow18 = cursor.getColumnIndexOrThrow("txbytes_androidN");
                                    int columnIndexOrThrow19 = cursor.getColumnIndexOrThrow("txpackets_androidN");
                                    while (f44687c > 0 && cursor.moveToNext()) {
                                        bxvd da2 = bpvi.f139343s.mo74144da();
                                        int i7 = cursor.getInt(columnIndexOrThrow12);
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bpvi bpvi = (bpvi) da2.f164949b;
                                        int i8 = columnIndexOrThrow12;
                                        bpvi.f139345a |= 4;
                                        bpvi.f139348d = i7;
                                        int i9 = cursor.getInt(columnIndexOrThrow13);
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bpvi bpvi2 = (bpvi) da2.f164949b;
                                        bpvi2.f139345a |= 2;
                                        bpvi2.f139347c = i9;
                                        int i10 = cursor.getInt(columnIndexOrThrow14);
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bpvi bpvi3 = (bpvi) da2.f164949b;
                                        bpvi3.f139345a |= 2048;
                                        bpvi3.f139357m = i10;
                                        int a = bpvh.m112321a(cursor.getInt(columnIndexOrThrow15));
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bpvi bpvi4 = (bpvi) da2.f164949b;
                                        int i11 = a - 2;
                                        if (a != 0) {
                                            bpvi4.f139358n = i11;
                                            bpvi4.f139345a |= 4096;
                                            int i12 = columnIndexOrThrow13;
                                            long j = cursor.getLong(columnIndexOrThrow16);
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bpvi bpvi5 = (bpvi) da2.f164949b;
                                            int i13 = i12;
                                            bpvi5.f139345a |= 8192;
                                            bpvi5.f139359o = j;
                                            long j2 = cursor.getLong(columnIndexOrThrow17);
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bpvi bpvi6 = (bpvi) da2.f164949b;
                                            bpvi6.f139345a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                            bpvi6.f139360p = j2;
                                            long j3 = cursor.getLong(columnIndexOrThrow18);
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bpvi bpvi7 = (bpvi) da2.f164949b;
                                            bpvi7.f139345a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                            bpvi7.f139361q = j3;
                                            long j4 = cursor.getLong(columnIndexOrThrow19);
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bpvi bpvi8 = (bpvi) da2.f164949b;
                                            bpvi8.f139345a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                            bpvi8.f139362r = j4;
                                            arrayList3.add((bpvi) da2.mo74062i());
                                            columnIndexOrThrow12 = i8;
                                            columnIndexOrThrow13 = i13;
                                        } else {
                                            throw null;
                                        }
                                    }
                                    if (cursor.isAfterLast()) {
                                        cursor.close();
                                        arrayDeque2 = arrayDeque4;
                                        bxvd2 = da;
                                        arrayList = arrayList3;
                                        z = false;
                                    } else {
                                        arrayDeque2 = arrayDeque4;
                                        bxvd2 = da;
                                        arrayList = arrayList3;
                                        z = true;
                                    }
                                } else {
                                    arrayDeque2 = arrayDeque4;
                                    bxvd2 = da;
                                    arrayList = arrayList3;
                                    z = false;
                                }
                            } else {
                                if (slo.f44699k == null) {
                                    slo.f44699k = (Cursor) f44691r.mo21850a(slo.f44698j);
                                }
                                Cursor cursor2 = slo.f44699k;
                                if (cursor2 != null) {
                                    try {
                                        columnIndexOrThrow = cursor2.getColumnIndexOrThrow("iface");
                                        columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("tag");
                                        columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("uid");
                                        columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("device_state");
                                        columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("transport_type");
                                        columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("background_rxbytes");
                                        columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("background_rxpackets");
                                        columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("background_txbytes");
                                        columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("background_txpackets");
                                        columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("foreground_rxbytes");
                                        columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("foreground_rxpackets");
                                        arrayDeque2 = arrayDeque4;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (cursor2.isAfterLast()) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                    try {
                                        int columnIndexOrThrow20 = cursor2.getColumnIndexOrThrow("foreground_txbytes");
                                        int columnIndexOrThrow21 = cursor2.getColumnIndexOrThrow("foreground_txpackets");
                                        while (true) {
                                            if (f44687c > 0) {
                                                if (!cursor2.moveToNext()) {
                                                    bxvd2 = da;
                                                    arrayList = arrayList3;
                                                    break;
                                                }
                                                bxvd bxvd3 = da;
                                                String string = cursor2.getString(columnIndexOrThrow);
                                                int i14 = columnIndexOrThrow;
                                                int i15 = cursor2.getInt(columnIndexOrThrow2);
                                                int i16 = columnIndexOrThrow2;
                                                int i17 = cursor2.getInt(columnIndexOrThrow3);
                                                int i18 = columnIndexOrThrow3;
                                                int i19 = cursor2.getInt(columnIndexOrThrow4);
                                                int i20 = columnIndexOrThrow4;
                                                bxvd da3 = bpvi.f139343s.mo74144da();
                                                ArrayList arrayList4 = arrayList3;
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                bpvi bpvi9 = (bpvi) da3.f164949b;
                                                string.getClass();
                                                int i21 = columnIndexOrThrow21;
                                                int i22 = bpvi9.f139345a | 1;
                                                bpvi9.f139345a = i22;
                                                bpvi9.f139346b = string;
                                                int i23 = i22 | 4;
                                                bpvi9.f139345a = i23;
                                                bpvi9.f139348d = i15;
                                                int i24 = i23 | 2;
                                                bpvi9.f139345a = i24;
                                                bpvi9.f139347c = i17;
                                                bpvi9.f139345a = i24 | 2048;
                                                bpvi9.f139357m = i19;
                                                int a2 = bpvh.m112321a(cursor2.getInt(columnIndexOrThrow5));
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                bpvi bpvi10 = (bpvi) da3.f164949b;
                                                int i25 = a2 - 2;
                                                if (a2 != 0) {
                                                    bpvi10.f139358n = i25;
                                                    bpvi10.f139345a |= 4096;
                                                    long j5 = cursor2.getLong(columnIndexOrThrow6);
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bpvi bpvi11 = (bpvi) da3.f164949b;
                                                    bpvi11.f139345a |= 8;
                                                    bpvi11.f139349e = j5;
                                                    long j6 = cursor2.getLong(columnIndexOrThrow7);
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bpvi bpvi12 = (bpvi) da3.f164949b;
                                                    bpvi12.f139345a |= 16;
                                                    bpvi12.f139350f = j6;
                                                    long j7 = cursor2.getLong(columnIndexOrThrow8);
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bpvi bpvi13 = (bpvi) da3.f164949b;
                                                    bpvi13.f139345a |= 32;
                                                    bpvi13.f139351g = j7;
                                                    long j8 = cursor2.getLong(columnIndexOrThrow9);
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bpvi bpvi14 = (bpvi) da3.f164949b;
                                                    bpvi14.f139345a |= 64;
                                                    bpvi14.f139352h = j8;
                                                    long j9 = cursor2.getLong(columnIndexOrThrow10);
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bpvi bpvi15 = (bpvi) da3.f164949b;
                                                    bpvi15.f139345a |= 128;
                                                    bpvi15.f139353i = j9;
                                                    long j10 = cursor2.getLong(columnIndexOrThrow11);
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bpvi bpvi16 = (bpvi) da3.f164949b;
                                                    bpvi16.f139345a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                    bpvi16.f139354j = j10;
                                                    long j11 = cursor2.getLong(columnIndexOrThrow20);
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bpvi bpvi17 = (bpvi) da3.f164949b;
                                                    bpvi17.f139345a |= 512;
                                                    bpvi17.f139355k = j11;
                                                    int i26 = i21;
                                                    long j12 = cursor2.getLong(i26);
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bpvi bpvi18 = (bpvi) da3.f164949b;
                                                    bpvi18.f139345a |= 1024;
                                                    bpvi18.f139356l = j12;
                                                    arrayList4.add((bpvi) da3.mo74062i());
                                                    columnIndexOrThrow21 = i26;
                                                    arrayList3 = arrayList4;
                                                    da = bxvd3;
                                                    columnIndexOrThrow = i14;
                                                    columnIndexOrThrow2 = i16;
                                                    columnIndexOrThrow3 = i18;
                                                    columnIndexOrThrow4 = i20;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                bxvd2 = da;
                                                arrayList = arrayList3;
                                                break;
                                            }
                                        }
                                        if (cursor2.isAfterLast()) {
                                            cursor2.close();
                                        } else {
                                            z = true;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        arrayDeque = arrayDeque2;
                                        while (!arrayDeque.isEmpty()) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    arrayDeque2 = arrayDeque4;
                                    bxvd2 = da;
                                    arrayList = arrayList3;
                                }
                                z = false;
                            }
                            if (!arrayList.isEmpty()) {
                                bxvd = bxvd2;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                ((bpvf) bxvd.f164949b).f139328f = GeneratedMessageLite.m124030de();
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bpvf bpvf2 = (bpvf) bxvd.f164949b;
                                if (!bpvf2.f139328f.mo73666a()) {
                                    bpvf2.f139328f = GeneratedMessageLite.m124021a(bpvf2.f139328f);
                                }
                                bxsy.m123078a(arrayList, bpvf2.f139328f);
                            } else {
                                bxvd = bxvd2;
                            }
                            slo = this;
                        } else {
                            arrayDeque2 = arrayDeque4;
                            bxvd = da;
                            z = false;
                            slo = this;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        arrayDeque = arrayDeque4;
                        while (!arrayDeque.isEmpty()) {
                        }
                        throw th;
                    }
                } else if (i4 != i2) {
                    if (i4 != 18) {
                        arrayDeque2 = arrayDeque4;
                        bxvd = da;
                        z = false;
                    } else {
                        if (slo.f44702n == null) {
                            m35586a(sqn.m35983a().getTimeInMillis() - cdna.f181280a.mo6606a().mo77936g());
                            ArrayList arrayList5 = new ArrayList();
                            if (!cdna.f181280a.mo6606a().mo77945p()) {
                                long timeInMillis = sqn.m35983a().getTimeInMillis();
                                long j13 = -86400000 + timeInMillis;
                                if (cdna.f181280a.mo6606a().mo77943n()) {
                                    arrayList5.addAll(smr.m35675a(j13, timeInMillis, z2));
                                }
                                if (cdna.f181280a.mo6606a().mo77944o()) {
                                    arrayList5.addAll(smr.m35675a(j13, timeInMillis, i));
                                }
                            } else {
                                arrayList5.addAll(smr.m35675a(0, Long.MAX_VALUE, z2 ? 1 : 0));
                                arrayList5.addAll(smr.m35675a(0, Long.MAX_VALUE, i));
                                m35586a(Long.MAX_VALUE);
                            }
                            slo.f44701m = arrayList5;
                            if (!arrayList5.isEmpty()) {
                                it = slo.f44701m.iterator();
                            } else {
                                it = null;
                            }
                            slo.f44702n = it;
                        }
                        Iterator it2 = slo.f44702n;
                        if (it2 == null || !it2.hasNext()) {
                            arrayDeque2 = arrayDeque4;
                            bxvd = da;
                            z = false;
                        } else {
                            Iterator it3 = slo.f44702n;
                            sdo.m34959a(it3);
                            List list2 = slo.f44701m;
                            sdo.m34959a(list2);
                            int min = Math.min(list2.size(), (int) cdna.f181280a.mo6606a().mo77940k());
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = z2;
                            }
                            ((bpvf) da.f164949b).f139337o = GeneratedMessageLite.m124030de();
                            for (int i27 = 0; i27 < min; i27++) {
                                bpvw bpvw = (bpvw) it3.next();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = z2;
                                }
                                bpvf bpvf3 = (bpvf) da.f164949b;
                                bpvw.getClass();
                                if (!bpvf3.f139337o.mo73666a()) {
                                    bpvf3.f139337o = GeneratedMessageLite.m124021a(bpvf3.f139337o);
                                }
                                bpvf3.f139337o.add(bpvw);
                                it3.remove();
                            }
                            z = it3.hasNext();
                            arrayDeque2 = arrayDeque4;
                            bxvd = da;
                        }
                    }
                } else if (!slo.f44697i.exists() || !slo.f44697i.getName().endsWith("alarms")) {
                    arrayDeque2 = arrayDeque4;
                    bxvd = da;
                    z = false;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    boolean a3 = slo.m35587a(f44688o, arrayList6);
                    if (arrayList6.size() > 0) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z2;
                        }
                        ((bpvf) da.f164949b).f139329g = GeneratedMessageLite.m124030de();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z2;
                        }
                        bpvf bpvf4 = (bpvf) da.f164949b;
                        if (!bpvf4.f139329g.mo73666a()) {
                            bpvf4.f139329g = GeneratedMessageLite.m124021a(bpvf4.f139329g);
                        }
                        bxsy.m123078a(arrayList6, bpvf4.f139329g);
                    }
                    arrayDeque2 = arrayDeque4;
                    bxvd = da;
                    z = a3;
                }
                if (sli.mo25685a(bxvd)) {
                    while (arrayDeque2.size() >= 5) {
                        ((rke) arrayDeque2.removeFirst()).mo9455a();
                    }
                    if (!bxvd.f164950c) {
                        z2 = false;
                    } else {
                        bxvd.mo74035c();
                        z2 = false;
                        bxvd.f164950c = false;
                    }
                    bpvf bpvf5 = (bpvf) bxvd.f164949b;
                    bpvc.getClass();
                    bpvf5.f139324b = bpvc;
                    bpvf5.f139323a |= 1;
                    bpvf bpvf6 = (bpvf) bxvd.mo74062i();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        qwo a4 = ((qws) it4.next()).mo24333a(bpvf6);
                        a4.mo24329b(sli.mo25683a());
                        int d = sli.mo25688d();
                        int i28 = d - 1;
                        if (d != 0) {
                            a4.mo24328b(i28);
                            arrayDeque = arrayDeque2;
                            try {
                                arrayDeque.addLast(a4.mo24327b());
                                arrayDeque2 = arrayDeque;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } else {
                            throw null;
                        }
                    }
                    arrayDeque3 = arrayDeque2;
                } else {
                    arrayDeque3 = arrayDeque2;
                    z2 = false;
                }
                if (!z) {
                    mo25706a();
                    while (!arrayDeque3.isEmpty()) {
                        ((rke) arrayDeque3.removeFirst()).mo9455a();
                    }
                    return;
                }
                arrayDeque4 = arrayDeque3;
                i2 = 5;
                i = 1;
            } catch (Throwable th6) {
                th = th6;
                arrayDeque = arrayDeque4;
                while (!arrayDeque.isEmpty()) {
                }
                throw th;
            }
        }
    }
}
