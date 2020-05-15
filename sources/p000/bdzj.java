package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: bdzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdzj {

    /* renamed from: a */
    public static final boolean f106686a = true;

    /* renamed from: b */
    static final ConcurrentHashMap f106687b = new ConcurrentHashMap();

    /* renamed from: c */
    static volatile boolean f106688c;

    /* renamed from: d */
    public static bmxv f106689d = bmvz.f131120a;

    /* renamed from: e */
    public final bdym f106690e;

    /* renamed from: f */
    public final String f106691f;

    /* renamed from: g */
    public final boolean f106692g = false;

    /* renamed from: h */
    public final beaa f106693h = new beaa(new bdzc(this));

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public bdzj(bdym bdym, String str) {
        this.f106690e = bdym;
        this.f106691f = str;
    }

    /* renamed from: a */
    private final Map m91632a() {
        RandomAccessFile randomAccessFile = new RandomAccessFile(m91634b(), "r");
        try {
            beaf beaf = (beaf) GeneratedMessageLite.m124012a(beaf.f106724g, randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, randomAccessFile.length()));
            HashMap a = bnmt.m109795a(beaf.f106731f.size() + 3);
            for (beag beag : beaf.f106731f) {
                String str = beag.f106737d;
                String str2 = "";
                if (beag.f106735b == 5) {
                    str2 = (String) beag.f106736c;
                }
                a.put(str, str2);
            }
            a.put("__phenotype_server_token", beaf.f106729d);
            a.put("__phenotype_snapshot_token", beaf.f106727b);
            a.put("__phenotype_configuration_version", Long.toString(beaf.f106730e));
            bnhe a2 = bnhe.m109413a(a);
            randomAccessFile.close();
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private final File m91634b() {
        return new File(this.f106690e.f106636d.getDir("phenotype_file", 0), String.valueOf(this.f106691f).concat(".pb"));
    }

    /* renamed from: a */
    static final /* synthetic */ void m91633a(CancellationSignal cancellationSignal) {
        try {
            cancellationSignal.cancel();
        } catch (OperationCanceledException e) {
        }
    }

    /* renamed from: a */
    public final Map mo58463a(ContentResolver contentResolver, Uri uri, String[] strArr, CancellationSignal cancellationSignal) {
        Cursor query;
        bnhe bnhe;
        if (!f106688c) {
            bqgi a = this.f106690e.mo58441a().mo25814a(new bdzh(cancellationSignal), 2000, TimeUnit.MILLISECONDS);
            try {
                query = contentResolver.query(uri, strArr, null, null, null, cancellationSignal);
                if (query != null) {
                    HashMap a2 = bnmt.m109795a(query.getCount());
                    while (query.moveToNext()) {
                        a2.put(query.getString(0), query.getString(1));
                    }
                    bnhe = bnhe.m109413a(a2);
                } else {
                    bnhe = bnoj.f131912b;
                }
                a.cancel(true);
                if (query != null) {
                    query.close();
                }
                return bnhe;
            } catch (SQLiteException | OperationCanceledException | IllegalStateException | SecurityException e) {
                Log.e("ContentProviderFlagSource", "Could not read flags from ContentProvider, falling back to local stale flags", e);
                if (e instanceof OperationCanceledException) {
                    f106688c = true;
                }
                return m91632a();
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            Log.w("ContentProviderFlagSource", "Skipping content resolver query because of previous time outs.");
            return m91632a();
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo58464a(long j, long j2, long j3, long j4) {
        qws qws = new qws(this.f106690e.f106636d, "PHENOTYPE_COUNTERS", null);
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        qxq qxq = new qxq(qws, "PHENOTYPE_COUNTERS", 1024);
        qxq.mo24387e("ContentProvider_ProcessStable_UptimeLatency").mo24368a(j - j2);
        qxq.mo24387e("ContentProvider_ProcessStable_RealLatency").mo24368a(j3 - j4);
        qxq.mo24388e();
    }

    /* renamed from: a */
    public final void mo58465a(Map map) {
        FileOutputStream fileOutputStream;
        File b = m91634b();
        if (!map.isEmpty()) {
            beae beae = (beae) beaf.f106724g.mo74144da();
            for (Map.Entry entry : map.entrySet()) {
                if ("__phenotype_server_token".equals(entry.getKey())) {
                    String str = (String) map.get("__phenotype_server_token");
                    if (beae.f164950c) {
                        beae.mo74035c();
                        beae.f164950c = false;
                    }
                    beaf beaf = (beaf) beae.f164949b;
                    str.getClass();
                    beaf.f106726a |= 4;
                    beaf.f106729d = str;
                } else if ("__phenotype_snapshot_token".equals(entry.getKey())) {
                    String str2 = (String) map.get("__phenotype_snapshot_token");
                    if (beae.f164950c) {
                        beae.mo74035c();
                        beae.f164950c = false;
                    }
                    beaf beaf2 = (beaf) beae.f164949b;
                    str2.getClass();
                    beaf2.f106726a |= 1;
                    beaf2.f106727b = str2;
                } else if ("__phenotype_configuration_version".equals(entry.getKey())) {
                    long parseLong = Long.parseLong((String) map.get("__phenotype_configuration_version"));
                    if (beae.f164950c) {
                        beae.mo74035c();
                        beae.f164950c = false;
                    }
                    beaf beaf3 = (beaf) beae.f164949b;
                    beaf3.f106726a |= 8;
                    beaf3.f106730e = parseLong;
                } else {
                    bxvd da = beag.f106732e.mo74144da();
                    String str3 = (String) entry.getKey();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    beag beag = (beag) da.f164949b;
                    str3.getClass();
                    beag.f106734a |= 1;
                    beag.f106737d = str3;
                    String str4 = (String) entry.getValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    beag beag2 = (beag) da.f164949b;
                    str4.getClass();
                    beag2.f106735b = 5;
                    beag2.f106736c = str4;
                    beae.mo58475a(da);
                }
            }
            beaf beaf4 = (beaf) beae.mo74062i();
            File dir = this.f106690e.f106636d.getDir("phenotype_file", 0);
            String str5 = this.f106691f;
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 8);
            sb.append("temp-");
            sb.append(str5);
            sb.append(".pb");
            File file = new File(dir, sb.toString());
            try {
                fileOutputStream = new FileOutputStream(file);
                beaf4.mo73638a(fileOutputStream);
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file.exists() && !file.renameTo(b)) {
                    Log.e("ContentProviderFlagSource", "Could not write Phenotype flags to backup local storage.");
                    file.delete();
                    return;
                }
                return;
            } catch (IOException e) {
                Log.e("ContentProviderFlagSource", "Could not write Phenotype flags to temp local storage.");
                file.delete();
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else if (b.exists()) {
            b.delete();
            return;
        } else {
            return;
        }
        throw th;
    }
}
