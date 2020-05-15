package p000;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bben */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bben {

    /* renamed from: a */
    public final Executor f102487a;

    /* renamed from: b */
    final HashMap f102488b = new HashMap();

    /* renamed from: c */
    private final Context f102489c;

    /* renamed from: d */
    private final bmzi f102490d;

    /* renamed from: e */
    private final befa f102491e;

    /* renamed from: f */
    private final bbfn f102492f;

    /* renamed from: g */
    private final bmxv f102493g;

    public bben(Context context, bmzi bmzi, befa befa, bbfn bbfn, bmxv bmxv, Executor executor) {
        this.f102489c = context;
        this.f102490d = bmzi;
        this.f102491e = befa;
        this.f102492f = bbfn;
        this.f102493g = bmxv;
        this.f102487a = executor;
    }

    /* renamed from: a */
    public final bqgg mo56090a(bavr bavr, int i, Uri uri, String str, int i2, bavn bavn, bbem bbem, int i3, List list) {
        bqgg bqgg;
        long j;
        int a;
        bavr bavr2 = bavr;
        Uri uri2 = uri;
        String str2 = str;
        bavn bavn2 = bavn;
        bbem bbem2 = bbem;
        int i4 = i3;
        if (this.f102488b.containsKey(uri2)) {
            return (bqgg) this.f102488b.get(uri2);
        }
        if (!cenf.f183064a.mo6606a().mo79419d() || str2.startsWith("https")) {
            try {
                j = this.f102491e.mo60649e(uri2);
            } catch (IOException e) {
                j = 0;
            }
            if (cenf.f183064a.mo6606a().mo79421f()) {
                StatFs statFs = new StatFs(this.f102489c.getFilesDir().getAbsolutePath());
                int blockCount = statFs.getBlockCount();
                int blockSize = statFs.getBlockSize();
                double availableBlocks = (double) ((((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) - (((long) i2) - j));
                double d = (double) (((long) blockCount) * ((long) blockSize));
                double c = cenf.m137501c();
                Double.isNaN(d);
                double min = Math.min(c * d, (double) cenf.f183064a.mo6606a().mo79416a());
                if (bavn2 != null) {
                    int a2 = bavm.m87605a(bavn2.f101898b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i5 = a2 - 1;
                    if (i5 == 1) {
                        double c2 = cenf.m137501c();
                        Double.isNaN(d);
                        min = Math.min(d * c2, (double) cenf.f183064a.mo6606a().mo79418c());
                    } else if (i5 == 2) {
                        double c3 = cenf.m137501c();
                        Double.isNaN(d);
                        min = Math.min(d * c3, (double) cenf.f183064a.mo6606a().mo79417b());
                    }
                }
                if (availableBlocks <= min) {
                    bbev.m87906a("%s: Not enough space to download file %s", "MddFileDownloader", str2);
                    bauo a3 = bauq.m87573a();
                    a3.f101791a = baup.LOW_DISK_ERROR;
                    bqgg = bqga.m112777a((Throwable) a3.mo55987a());
                }
            }
            bbfn bbfn = this.f102492f;
            String str3 = bavr2.f101920c;
            String str4 = bavr2.f101919b;
            synchronized (bbfn.class) {
                bbfn.f102556c.put(uri2, bbfn.m87949a(str3, str4, i));
            }
            if (this.f102493g.mo66813a()) {
                bbfl bbfl = (bbfl) this.f102493g.mo66814b();
                String str5 = bavr2.f101919b;
                synchronized (bbfl.class) {
                    bbfl.f102546c.put(uri2, str5);
                }
            }
            baxg baxg = new baxg();
            baxg.mo56018a(-1);
            baxg.mo56020a(bngx.m109376e());
            baxg.f102031a = uri2;
            if (str2 != null) {
                baxg.f102032b = str2;
                if (bavn2 == null || (a = bavk.m87603a(bavn2.f101899c)) == 0 || a != 2) {
                    baxg.mo56019a(baxf.f102029a);
                } else {
                    baxg.mo56019a(baxf.f102030b);
                }
                if (i4 > 0) {
                    baxg.mo56018a(i4);
                }
                bngs j2 = bngx.m109377j();
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    bavo bavo = (bavo) list.get(i6);
                    j2.mo67668c(Pair.create(bavo.f101904a, bavo.f101905b));
                }
                baxg.mo56020a(j2.mo67664a());
                baxi baxi = (baxi) this.f102490d.mo6606a();
                String str6 = baxg.f102031a == null ? " fileUri" : "";
                if (baxg.f102032b == null) {
                    str6 = str6.concat(" urlToDownload");
                }
                if (baxg.f102033c == null) {
                    str6 = String.valueOf(str6).concat(" downloadConstraints");
                }
                if (baxg.f102034d == null) {
                    str6 = String.valueOf(str6).concat(" trafficTag");
                }
                if (baxg.f102035e == null) {
                    str6 = String.valueOf(str6).concat(" extraHttpHeaders");
                }
                if (!str6.isEmpty()) {
                    String valueOf = String.valueOf(str6);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                }
                bqgg = baxi.mo56021a(new baxc(baxg.f102031a, baxg.f102032b, baxg.f102033c, baxg.f102034d.intValue(), baxg.f102035e));
            } else {
                throw new NullPointerException("Null urlToDownload");
            }
        } else {
            bbev.m87906a("%s: File url = %s is not secure", "MddFileDownloader", str2);
            bauo a4 = bauq.m87573a();
            a4.f101791a = baup.INSECURE_URL_ERROR;
            bqgg = bqga.m112777a((Throwable) a4.mo55987a());
        }
        bqgg a5 = bqdf.m112620a(bqdx.m112674a(bqfl.m112747c(bqgg), new bbei(bbem2, uri2), this.f102487a), bauq.class, new bbej(this, bbem2), this.f102487a);
        this.f102488b.put(uri2, a5);
        ((bqfl) a5).mo741a(new bbel(this, uri2), this.f102487a);
        return a5;
    }

    /* renamed from: a */
    public final void mo56091a(Uri uri) {
        bqgg bqgg = (bqgg) this.f102488b.get(uri);
        if (bqgg != null) {
            this.f102488b.remove(uri);
            bqgg.cancel(true);
        } else if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", bbev.m87903a("%s: stopDownloading on non-existent download", "MddFileDownloader"));
        }
    }
}
