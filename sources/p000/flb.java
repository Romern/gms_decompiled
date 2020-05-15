package p000;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.PersistableBundle;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: flb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class flb extends fkj {

    /* renamed from: a */
    public boolean f16835a;

    /* renamed from: b */
    public final fkv f16836b;

    /* renamed from: c */
    public final fnu f16837c;

    /* renamed from: e */
    public final fkt f16838e;

    /* renamed from: f */
    public final flk f16839f;

    /* renamed from: g */
    public final fof f16840g;

    /* renamed from: h */
    public long f16841h;

    /* renamed from: i */
    public boolean f16842i;

    /* renamed from: j */
    private final fnw f16843j;

    /* renamed from: k */
    private final long f16844k = Long.MIN_VALUE;

    /* renamed from: l */
    private final flk f16845l;

    protected flb(fkm fkm, fkn fkn) {
        super(fkm);
        sdo.m34959a(fkn);
        this.f16837c = new fnu(fkm);
        this.f16836b = new fkv(fkm);
        this.f16843j = fkn.mo7139a(fkm);
        this.f16838e = new fkt(fkm);
        this.f16840g = new fof(mo10936e());
        this.f16845l = new fkx(this, fkm);
        this.f16839f = new fky(this, fkm);
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
    /* renamed from: x */
    private final void m11918x() {
        long j;
        flm l = mo10947l();
        if (l.f16861a && !l.f16862b) {
            fje.m11804a();
            mo10954t();
            try {
                fkv fkv = this.f16836b;
                fje.m11804a();
                fkv.mo10954t();
                j = fkv.mo10978a(fkv.f16821b, (String[]) null);
            } catch (SQLiteException e) {
                mo10938e("Failed to get min/max hit times from local store", e);
                j = 0;
            }
            if (j != 0) {
                long abs = Math.abs(mo10936e().mo20505a() - j);
                mo10943h();
                if (abs <= ((Long) fni.f16931i.mo11021a()).longValue()) {
                    mo10943h();
                    mo10926a("Dispatch alarm scheduled (ms)", Long.valueOf(flh.m11933c()));
                    l.mo10954t();
                    sdo.m34971a(l.f16861a, (Object) "Receiver not registered");
                    l.mo10943h();
                    long c = flh.m11933c();
                    if (c > 0) {
                        l.mo11015b();
                        l.mo10936e().mo20506b();
                        l.f16862b = true;
                        if (!((Boolean) fni.f16922H.mo11021a()).booleanValue()) {
                            int i = Build.VERSION.SDK_INT;
                            l.mo10933d("Scheduling upload with JobScheduler");
                            Context f = l.mo10939f();
                            ComponentName componentName = new ComponentName(f, "com.google.android.gms.analytics.AnalyticsJobService");
                            int c2 = l.mo11016c();
                            PersistableBundle persistableBundle = new PersistableBundle();
                            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                            JobInfo build = new JobInfo.Builder(c2, componentName).setMinimumLatency(c).setOverrideDeadline(c + c).setExtras(persistableBundle).build();
                            l.mo10926a("Scheduling job. JobID", Integer.valueOf(c2));
                            adzi.m51464a(f, build, "com.google.android.gms", "DispatchAlarm");
                            return;
                        }
                        l.mo10933d("Scheduling upload with GcmTaskService");
                        l.mo11014a(c);
                    }
                }
            }
        }
    }

    /* renamed from: y */
    private final void m11919y() {
        if (this.f16845l.mo11009b()) {
            mo10933d("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f16845l.mo11010c();
        flm l = mo10947l();
        if (l.f16862b) {
            l.mo11015b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
        this.f16836b.mo10955u();
        this.f16843j.mo10955u();
        this.f16838e.mo10955u();
    }

    /* renamed from: d */
    public final long mo10995d() {
        long j = this.f16844k;
        if (j != Long.MIN_VALUE) {
            return j;
        }
        mo10943h();
        long longValue = ((Long) fni.f16928f.mo11021a()).longValue();
        foh m = mo10948m();
        m.mo10954t();
        if (!m.f17010c) {
            return longValue;
        }
        foh m2 = mo10948m();
        m2.mo10954t();
        return ((long) m2.f17011e) * 1000;
    }

    /* renamed from: v */
    public final void mo10996v() {
        mo10954t();
        fje.m11804a();
        this.f16842i = true;
        this.f16838e.mo10972d();
        mo10994c();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fnw.a(fnl, boolean):java.lang.String
     arg types: [fnl, int]
     candidates:
      fnw.a(java.net.URL, byte[]):int
      fnw.a(fnl, java.lang.String):java.net.URL
      fki.a(java.lang.String, java.lang.Object):void
      fnw.a(fnl, boolean):java.lang.String */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03a9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03aa, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ad, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03ae, code lost:
        r5 = com.felicanetworks.mfc.mfi.BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03b5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b8, code lost:
        r24 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03be, code lost:
        r3 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03c2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03c3, code lost:
        r21 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r8.mo10938e("Error closing http compressed post connection output stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03df, code lost:
        r25.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05d2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05d3, code lost:
        r25 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05d6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05d7, code lost:
        r29 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03a9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:130:0x035d] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03bd A[ExcHandler: all (r0v66 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:108:0x02e2] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03d4 A[SYNTHETIC, Splitter:B:171:0x03d4] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03df A[Catch:{ IOException -> 0x0296, all -> 0x0604 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03ef A[SYNTHETIC, Splitter:B:184:0x03ef] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03fa A[Catch:{ IOException -> 0x0296, all -> 0x0604 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0413 A[Catch:{ IOException -> 0x0296, all -> 0x0604 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x043a A[Catch:{ IOException -> 0x0296, all -> 0x0604 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0450 A[Catch:{ IOException -> 0x0296, all -> 0x0604 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04dc A[SYNTHETIC, Splitter:B:236:0x04dc] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04e1 A[Catch:{ IOException -> 0x0296, all -> 0x0604 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04e6 A[Catch:{ IOException -> 0x0296, all -> 0x0604 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0563 A[Catch:{ IOException -> 0x0296, all -> 0x0604 }, LOOP:5: B:261:0x055d->B:263:0x0563, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x059c A[SYNTHETIC, Splitter:B:278:0x059c] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05b1 A[SYNTHETIC, Splitter:B:282:0x05b1] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05d2 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x05ec A[SYNTHETIC, Splitter:B:306:0x05ec] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e2 A[Catch:{ IOException -> 0x0296, all -> 0x0604 }] */
    /* renamed from: w */
    public final void mo10997w() {
        fkv fkv;
        String str;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        long j2;
        List<Long> list;
        ArrayList arrayList;
        fnv fnv;
        int i;
        int i2;
        HttpURLConnection httpURLConnection;
        Throwable th;
        OutputStream outputStream;
        fnl fnl;
        String str2 = "hit_id";
        fje.m11804a();
        mo10954t();
        mo10933d("Dispatching a batch of local hits");
        if (!this.f16838e.mo10970b()) {
            mo10943h();
        }
        this.f16843j.mo11044c();
        mo10943h();
        int f = flh.m11936f();
        mo10943h();
        long max = (long) Math.max(f, flh.m11935e());
        ArrayList arrayList2 = new ArrayList();
        long j3 = 0;
        long j4 = 0;
        while (true) {
            this.f16836b.mo10981b();
            arrayList2.clear();
            try {
                fkv fkv2 = this.f16836b;
                int i3 = 0;
                int i4 = 1;
                sdo.m34974b(max >= j3);
                fje.m11804a();
                fkv2.mo10954t();
                Cursor cursor = null;
                r25 = null;
                OutputStream outputStream2 = null;
                HttpURLConnection httpURLConnection2 = null;
                r25 = null;
                HttpURLConnection httpURLConnection3 = null;
                cursor = null;
                try {
                    int i5 = 2;
                    Cursor query = fkv2.mo10986w().query("hits2", new String[]{str2, "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", str2), Long.toString(max));
                    try {
                        ArrayList<fnl> arrayList3 = new ArrayList();
                        if (query.moveToFirst()) {
                            while (true) {
                                long j5 = query.getLong(i3);
                                long j6 = query.getLong(i4);
                                String string = query.getString(i5);
                                fnl fnl2 = fnl;
                                str = str2;
                                z = true;
                                fkv = fkv2;
                                fnl = new fnl(fkv2, fkv2.mo10979a(string), j6, fog.m12080d(query.getString(3)), j5, query.getInt(4), null);
                                arrayList3.add(fnl2);
                                if (!query.moveToNext()) {
                                    break;
                                }
                                str2 = str;
                                fkv2 = fkv;
                                i5 = 2;
                                i4 = 1;
                                i3 = 0;
                            }
                        } else {
                            str = str2;
                            z = true;
                        }
                        if (query != null) {
                            query.close();
                        }
                        if (!arrayList3.isEmpty()) {
                            mo10926a("Hits loaded from store. count", Integer.valueOf(arrayList3.size()));
                            for (fnl fnl3 : arrayList3) {
                                if (fnl3.f16958c == j4) {
                                    mo10935d("Database contains successfully uploaded hit", Long.valueOf(j4), Integer.valueOf(arrayList3.size()));
                                    m11919y();
                                    try {
                                        this.f16836b.mo10982c();
                                        this.f16836b.mo10984d();
                                        return;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        mo10938e("Failed to commit local dispatch transaction", e);
                                        m11919y();
                                        return;
                                    }
                                }
                            }
                            if (this.f16838e.mo10970b()) {
                                mo10943h();
                            }
                            if (this.f16843j.mo11044c()) {
                                fnw fnw = this.f16843j;
                                fje.m11804a();
                                fnw.mo10954t();
                                sdo.m34959a(arrayList3);
                                if (!fnw.mo10943h().mo11006b().isEmpty()) {
                                    fof fof = fnw.f16984a;
                                    fnw.mo10943h();
                                    if (fof.mo11060a(((long) ((Integer) fni.f16945w.mo11021a()).intValue()) * 1000)) {
                                        fnw.mo10943h();
                                        String str3 = (String) fni.f16939q.mo11021a();
                                        if ("BATCH_BY_SESSION".equalsIgnoreCase(str3) || "BATCH_BY_TIME".equalsIgnoreCase(str3) || "BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(str3) || "BATCH_BY_COUNT".equalsIgnoreCase(str3)) {
                                            z2 = true;
                                        } else {
                                            z2 = "BATCH_BY_SIZE".equalsIgnoreCase(str3);
                                        }
                                        fnw.mo10943h();
                                        z3 = "GZIP".equalsIgnoreCase((String) fni.f16940r.mo11021a());
                                        if (z2) {
                                            j = max;
                                            j2 = j4;
                                            list = new ArrayList(arrayList3.size());
                                            Iterator it = arrayList3.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                fnl fnl4 = (fnl) it.next();
                                                sdo.m34959a(fnl4);
                                                String a = fnw.mo11039a(fnl4, !fnl4.f16961f);
                                                if (a != null) {
                                                    int length = a.length();
                                                    fnw.mo10943h();
                                                    if (length <= ((Integer) fni.f16938p.mo11021a()).intValue()) {
                                                        URL a2 = fnw.mo11042a(fnl4, a);
                                                        if (a2 == null) {
                                                            fnw.mo10942g("Failed to build collect GET endpoint url");
                                                            break;
                                                        }
                                                        sdo.m34959a(a2);
                                                        fnw.mo10929b("GET request", a2);
                                                        try {
                                                            HttpURLConnection a3 = fnw.mo11040a(a2);
                                                            try {
                                                                a3.connect();
                                                                fnw.mo11043a(a3);
                                                                int responseCode = a3.getResponseCode();
                                                                if (responseCode == 200) {
                                                                    fnw.mo10946k().mo10923c();
                                                                }
                                                                fnw.mo10929b("GET status", Integer.valueOf(responseCode));
                                                                if (a3 != null) {
                                                                    a3.disconnect();
                                                                }
                                                                if (responseCode != 200) {
                                                                    break;
                                                                }
                                                            } catch (IOException e2) {
                                                                e = e2;
                                                                httpURLConnection3 = a3;
                                                                try {
                                                                    fnw.mo10934d("Network GET connection error", e);
                                                                    if (httpURLConnection3 == null) {
                                                                    }
                                                                    j4 = j2;
                                                                    while (r0.hasNext()) {
                                                                    }
                                                                    this.f16836b.mo10980a(list);
                                                                    arrayList2.addAll(list);
                                                                    if (!arrayList2.isEmpty()) {
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    if (httpURLConnection3 != null) {
                                                                        httpURLConnection3.disconnect();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                httpURLConnection3 = a3;
                                                                if (httpURLConnection3 != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (IOException e3) {
                                                            e = e3;
                                                            fnw.mo10934d("Network GET connection error", e);
                                                            if (httpURLConnection3 == null) {
                                                                httpURLConnection3.disconnect();
                                                            }
                                                            j4 = j2;
                                                            while (r0.hasNext()) {
                                                            }
                                                            this.f16836b.mo10980a(list);
                                                            arrayList2.addAll(list);
                                                            if (!arrayList2.isEmpty()) {
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            if (httpURLConnection3 != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        String a4 = fnw.mo11039a(fnl4, false);
                                                        if (a4 != null) {
                                                            byte[] bytes = a4.getBytes();
                                                            int length2 = bytes.length;
                                                            fnw.mo10943h();
                                                            if (length2 <= ((Integer) fni.f16942t.mo11021a()).intValue()) {
                                                                URL a5 = fnw.mo11041a(fnl4);
                                                                if (a5 != null) {
                                                                    if (fnw.mo11038a(a5, bytes) != 200) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    fnw.mo10942g("Failed to build collect POST endpoint url");
                                                                    break;
                                                                }
                                                            } else {
                                                                fnw.mo10941g().mo11027a(fnl4, "Hit payload exceeds size limit");
                                                            }
                                                        } else {
                                                            fnw.mo10941g().mo11027a(fnl4, "Error formatting hit for POST upload");
                                                        }
                                                    }
                                                } else {
                                                    fnw.mo10941g().mo11027a(fnl4, "Error formatting hit for upload");
                                                }
                                                list.add(Long.valueOf(fnl4.f16958c));
                                                int size = list.size();
                                                fnw.mo10943h();
                                                if (size >= flh.m11936f()) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            sdo.m34974b(arrayList3.isEmpty() ^ z);
                                            fnw.mo10927a("Uploading batched hits. compression, count", Boolean.valueOf(z3), Integer.valueOf(arrayList3.size()));
                                            fnv fnv2 = new fnv(fnw);
                                            ArrayList arrayList4 = new ArrayList();
                                            Iterator it2 = arrayList3.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    j = max;
                                                    break;
                                                }
                                                fnl fnl5 = (fnl) it2.next();
                                                sdo.m34959a(fnl5);
                                                int i6 = fnv2.f16980a + (z ? 1 : 0);
                                                fnv2.f16982c.mo10943h();
                                                if (i6 > flh.m11935e()) {
                                                    j = max;
                                                    break;
                                                }
                                                String a6 = fnv2.f16982c.mo11039a(fnl5, false);
                                                if (a6 != null) {
                                                    byte[] bytes2 = a6.getBytes();
                                                    int length3 = bytes2.length;
                                                    j = max;
                                                    fnv2.f16982c.mo10943h();
                                                    if (length3 <= ((Integer) fni.f16941s.mo11021a()).intValue()) {
                                                        if (fnv2.f16981b.size() > 0) {
                                                            length3++;
                                                        }
                                                        int size2 = fnv2.f16981b.size() + length3;
                                                        fnv2.f16982c.mo10943h();
                                                        if (size2 > ((Integer) fni.f16943u.mo11021a()).intValue()) {
                                                            break;
                                                        }
                                                        try {
                                                            if (fnv2.f16981b.size() > 0) {
                                                                fnv2.f16981b.write(fnw.f16983b);
                                                            }
                                                            fnv2.f16981b.write(bytes2);
                                                            fnv2.f16980a++;
                                                        } catch (IOException e4) {
                                                            fnv2.f16982c.mo10938e("Failed to write payload when batching hits", e4);
                                                        } catch (Throwable th5) {
                                                            this.f16836b.mo10982c();
                                                            this.f16836b.mo10984d();
                                                            throw th5;
                                                        }
                                                    } else {
                                                        fnv2.f16982c.mo10941g().mo11027a(fnl5, "Hit size exceeds the maximum size limit");
                                                    }
                                                } else {
                                                    j = max;
                                                    fnv2.f16982c.mo10941g().mo11027a(fnl5, "Error formatting hit");
                                                }
                                                arrayList4.add(Long.valueOf(fnl5.f16958c));
                                                max = j;
                                                z = true;
                                            }
                                            if (fnv2.f16980a != 0) {
                                                URL d = fnw.mo11045d();
                                                if (d == null) {
                                                    fnw.mo10942g("Failed to build batching endpoint url");
                                                    list = Collections.emptyList();
                                                    j2 = j4;
                                                } else {
                                                    if (z3) {
                                                        byte[] a7 = fnv2.mo11037a();
                                                        sdo.m34959a(d);
                                                        sdo.m34959a(a7);
                                                        try {
                                                            fnw.mo11025a(fnw.mo10939f().getPackageName());
                                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                                            gZIPOutputStream.write(a7);
                                                            gZIPOutputStream.close();
                                                            byteArrayOutputStream.close();
                                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                            int length4 = byteArray.length;
                                                            Integer valueOf = Integer.valueOf(length4);
                                                            j2 = j4;
                                                            long j7 = ((long) length4) * 100;
                                                            int length5 = a7.length;
                                                            arrayList = arrayList4;
                                                            fnv fnv3 = fnv2;
                                                            int i7 = length5;
                                                            fnv = fnv3;
                                                            Integer num = valueOf;
                                                            super.mo10925a(3, "POST compressed size, ratio %, url", valueOf, Long.valueOf(j7 / ((long) length5)), d);
                                                            if (length4 > i7) {
                                                                fnw.mo10932c("Compressed payload is larger then uncompressed. compressed, uncompressed", num, Integer.valueOf(i7));
                                                            }
                                                            if (fki.m11850r()) {
                                                                String str4 = new String(a7);
                                                                fnw.mo10926a("Post payload", str4.length() == 0 ? new String("\n") : "\n".concat(str4));
                                                            }
                                                            HttpURLConnection a8 = fnw.mo11040a(d);
                                                            try {
                                                                a8.setDoOutput(true);
                                                                a8.addRequestProperty("Content-Encoding", "gzip");
                                                                a8.setFixedLengthStreamingMode(length4);
                                                                a8.connect();
                                                                outputStream = a8.getOutputStream();
                                                            } catch (IOException e5) {
                                                                e = e5;
                                                                outputStream = null;
                                                                httpURLConnection2 = a8;
                                                                try {
                                                                    fnw.mo10934d("Network compressed POST connection error", e);
                                                                    if (outputStream != null) {
                                                                    }
                                                                    if (httpURLConnection2 != null) {
                                                                    }
                                                                    fnw.mo11026b();
                                                                    i = 0;
                                                                    if (i == i2) {
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    httpURLConnection = httpURLConnection2;
                                                                    outputStream2 = outputStream;
                                                                    if (outputStream2 != null) {
                                                                        try {
                                                                            outputStream2.close();
                                                                        } catch (IOException e6) {
                                                                            fnw.mo10938e("Error closing http compressed post connection output stream", e6);
                                                                        }
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    fnw.mo11026b();
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th7) {
                                                            }
                                                            try {
                                                                outputStream.write(byteArray);
                                                                outputStream.close();
                                                                fnw.mo11043a(a8);
                                                                i = a8.getResponseCode();
                                                                i2 = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
                                                                i2 = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
                                                                if (i == 200) {
                                                                    fnw.mo10946k().mo10923c();
                                                                }
                                                                fnw.mo10929b("POST status", Integer.valueOf(i));
                                                                if (a8 != null) {
                                                                    a8.disconnect();
                                                                }
                                                                fnw.mo11026b();
                                                            } catch (IOException e7) {
                                                                e = e7;
                                                                i2 = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
                                                                httpURLConnection2 = a8;
                                                                fnw.mo10934d("Network compressed POST connection error", e);
                                                                if (outputStream != null) {
                                                                }
                                                                if (httpURLConnection2 != null) {
                                                                }
                                                                fnw.mo11026b();
                                                                i = 0;
                                                                if (i == i2) {
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                httpURLConnection = a8;
                                                                outputStream2 = outputStream;
                                                                th = th;
                                                                if (outputStream2 != null) {
                                                                }
                                                                if (httpURLConnection != null) {
                                                                }
                                                                fnw.mo11026b();
                                                                throw th;
                                                            }
                                                        } catch (IOException e8) {
                                                            e = e8;
                                                            arrayList = arrayList4;
                                                            fnv = fnv2;
                                                            i2 = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
                                                            outputStream = null;
                                                            fnw.mo10934d("Network compressed POST connection error", e);
                                                            if (outputStream != null) {
                                                            }
                                                            if (httpURLConnection2 != null) {
                                                            }
                                                            fnw.mo11026b();
                                                            i = 0;
                                                            if (i == i2) {
                                                            }
                                                        } catch (Throwable th9) {
                                                        }
                                                    } else {
                                                        j2 = j4;
                                                        arrayList = arrayList4;
                                                        fnv = fnv2;
                                                        i2 = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
                                                        i = fnw.mo11038a(d, fnv.mo11037a());
                                                    }
                                                    if (i == i2) {
                                                        Integer valueOf2 = Integer.valueOf(i);
                                                        fnw.mo10926a("Network error uploading hits. status code", valueOf2);
                                                        if (fnw.mo10943h().mo11006b().contains(valueOf2)) {
                                                            fnw.mo10940f("Server instructed the client to stop batching");
                                                            fnw.f16984a.mo11059a();
                                                        }
                                                        list = Collections.emptyList();
                                                    } else {
                                                        fnw.mo10926a("Batched upload completed. Hits batched", Integer.valueOf(fnv.f16980a));
                                                    }
                                                }
                                            } else {
                                                j2 = j4;
                                                arrayList = arrayList4;
                                            }
                                            list = arrayList;
                                        }
                                        j4 = j2;
                                        for (Long l : list) {
                                            j4 = Math.max(j4, l.longValue());
                                        }
                                        this.f16836b.mo10980a(list);
                                        arrayList2.addAll(list);
                                    }
                                }
                                z3 = false;
                                z2 = false;
                                if (z2) {
                                }
                                j4 = j2;
                                while (r0.hasNext()) {
                                }
                                try {
                                    this.f16836b.mo10980a(list);
                                    arrayList2.addAll(list);
                                } catch (SQLiteException e9) {
                                    mo10938e("Failed to remove successfully uploaded hits", e9);
                                    m11919y();
                                    try {
                                        this.f16836b.mo10982c();
                                        this.f16836b.mo10984d();
                                        return;
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        mo10938e("Failed to commit local dispatch transaction", e);
                                        m11919y();
                                        return;
                                    }
                                }
                            } else {
                                j = max;
                            }
                            if (!arrayList2.isEmpty()) {
                                try {
                                    this.f16836b.mo10982c();
                                    this.f16836b.mo10984d();
                                    max = j;
                                    str2 = str;
                                    j3 = 0;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    mo10938e("Failed to commit local dispatch transaction", e);
                                    m11919y();
                                    return;
                                }
                            } else {
                                this.f16836b.mo10982c();
                                this.f16836b.mo10984d();
                                return;
                            }
                        } else {
                            mo10933d("Store is empty, nothing to dispatch");
                            m11919y();
                            try {
                                this.f16836b.mo10982c();
                                this.f16836b.mo10984d();
                                return;
                            } catch (SQLiteException e12) {
                                e = e12;
                                mo10938e("Failed to commit local dispatch transaction", e);
                                m11919y();
                                return;
                            }
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        cursor = query;
                        try {
                            fkv.mo10938e("Error loading hits from the database", e);
                            throw e;
                        } catch (Throwable th10) {
                            th = th10;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th11) {
                    }
                } catch (SQLiteException e14) {
                    e = e14;
                    fkv = fkv2;
                    fkv.mo10938e("Error loading hits from the database", e);
                    throw e;
                } catch (Throwable th12) {
                    th = th12;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e15) {
                mo10934d("Failed to read hits from persisted store", e15);
                m11919y();
                this.f16836b.mo10982c();
                this.f16836b.mo10984d();
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo10991a(fln fln) {
        long j;
        long j2 = this.f16841h;
        fje.m11804a();
        mo10954t();
        long c = mo10949n().mo11051c();
        if (c != 0) {
            j = Math.abs(mo10936e().mo20505a() - c);
        } else {
            j = -1;
        }
        mo10929b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j));
        mo10943h();
        try {
            mo10997w();
            mo10949n().mo11052d();
            mo10994c();
            if (fln != null) {
                fln.mo10990a();
            }
            if (this.f16841h != j2) {
                this.f16837c.mo11033c();
            }
        } catch (Exception e) {
            mo10938e("Local dispatch failed", e);
            mo10949n().mo11052d();
            mo10994c();
            if (fln != null) {
                fln.mo10990a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10993b() {
        fje.m11804a();
        mo10943h();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: c */
    public final void mo10994c() {
        long j;
        long j2;
        fje.m11804a();
        mo10954t();
        if (!this.f16842i) {
            mo10943h();
            if (mo10943h().mo11005a()) {
                long j3 = 0;
                if (mo10995d() > 0) {
                    if (this.f16836b.mo10985v() != 0) {
                        if (!((Boolean) fni.f16916B.mo11021a()).booleanValue()) {
                            fnu fnu = this.f16837c;
                            fnu.mo11031a();
                            if (!fnu.f16978c) {
                                Context e = fnu.mo11035e();
                                e.registerReceiver(fnu, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                                intentFilter.addCategory(e.getPackageName());
                                e.registerReceiver(fnu, intentFilter);
                                fnu.f16979d = fnu.mo11034d();
                                fnu.f16977b.mo10957a().mo10926a("Registering connectivity change receiver. Network connected", Boolean.valueOf(fnu.f16979d));
                                fnu.f16978c = true;
                            }
                            fnu fnu2 = this.f16837c;
                            if (!fnu2.f16978c) {
                                fnu2.f16977b.mo10957a().mo10940f("Connectivity unknown. Receiver not registered");
                            }
                            if (!fnu2.f16979d) {
                                m11919y();
                                m11918x();
                                return;
                            }
                        }
                        m11918x();
                        long d = mo10995d();
                        long c = mo10949n().mo11051c();
                        if (c != 0) {
                            j = d - Math.abs(mo10936e().mo20505a() - c);
                            if (j <= 0) {
                                mo10943h();
                                j = Math.min(flh.m11934d(), d);
                            }
                        } else {
                            mo10943h();
                            j = Math.min(flh.m11934d(), d);
                        }
                        mo10926a("Dispatch scheduled (ms)", Long.valueOf(j));
                        if (this.f16845l.mo11009b()) {
                            flk flk = this.f16845l;
                            if (flk.f16860d != 0) {
                                sqv sqv = flk.f16858b.f16787c;
                                j2 = Math.abs(System.currentTimeMillis() - flk.f16860d);
                            } else {
                                j2 = 0;
                            }
                            long max = Math.max(1L, j + j2);
                            flk flk2 = this.f16845l;
                            if (!flk2.mo11009b()) {
                                return;
                            }
                            if (max >= 0) {
                                sqv sqv2 = flk2.f16858b.f16787c;
                                long abs = max - Math.abs(System.currentTimeMillis() - flk2.f16860d);
                                if (abs >= 0) {
                                    j3 = abs;
                                }
                                flk2.mo11011d().removeCallbacks(flk2.f16859c);
                                if (!flk2.mo11011d().postDelayed(flk2.f16859c, j3)) {
                                    flk2.f16858b.mo10957a().mo10938e("Failed to adjust delayed post. time", Long.valueOf(j3));
                                    return;
                                }
                                return;
                            }
                            flk2.mo11010c();
                            return;
                        }
                        this.f16845l.mo11008a(j);
                        return;
                    }
                    this.f16837c.mo11032b();
                    m11919y();
                    return;
                }
            }
        }
        this.f16837c.mo11032b();
        m11919y();
    }

    /* renamed from: a */
    public final boolean mo10992a(String str) {
        return svr.m36484b(mo10939f()).mo26169a(str) == 0;
    }
}
