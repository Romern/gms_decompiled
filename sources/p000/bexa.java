package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: bexa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexa {

    /* renamed from: a */
    public final Context f112869a;

    /* renamed from: b */
    public final String[] f112870b;

    /* renamed from: c */
    public final Map f112871c;

    /* renamed from: d */
    public final bfor f112872d;

    /* renamed from: e */
    public boolean f112873e = false;

    /* renamed from: f */
    public final bexb f112874f;

    /* renamed from: g */
    private final ExecutorService f112875g;

    /* renamed from: h */
    private final long f112876h;

    /* renamed from: i */
    private final long f112877i;

    /* renamed from: j */
    private long f112878j;

    /* renamed from: k */
    private final bfmf f112879k;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc A[SYNTHETIC] */
    public bexa(Context context, bfmf bfmf, ExecutorService executorService, bexb bexb, String[] strArr, bfor bfor) {
        btuv btuv;
        bewy a;
        long j;
        long j2;
        bxvd bxvd;
        this.f112869a = context;
        this.f112875g = executorService;
        this.f112874f = bexb;
        this.f112870b = strArr;
        this.f112879k = bfmf;
        this.f112872d = bfor;
        this.f112871c = new ConcurrentHashMap();
        this.f112878j = Long.MAX_VALUE;
        this.f112876h = System.currentTimeMillis();
        this.f112877i = SystemClock.elapsedRealtime();
        String[] strArr2 = this.f112870b;
        for (String str : strArr2) {
            btuv btuv2 = btuv.f150638e;
            try {
                btuv = (btuv) mo61217b(str).mo61862a((bxxk) btuv2.mo74142c(7));
                try {
                    if (btuv.f150642b > this.f112876h) {
                        bxvd bxvd2 = (bxvd) btuv.mo74142c(5);
                        bxvd2.mo73625a((bxvk) btuv);
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        btuv btuv3 = (btuv) bxvd2.f164949b;
                        btuv3.f150641a |= 1;
                        btuv3.f150642b = -1;
                        btuv = (btuv) bxvd2.mo74062i();
                    }
                } catch (IOException e) {
                    btuv2 = btuv;
                    bxvd = (bxvd) btuv2.mo74142c(5);
                    bxvd.mo73625a((bxvk) btuv2);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    btuv btuv4 = (btuv) bxvd.f164949b;
                    btuv4.f150641a |= 1;
                    btuv4.f150642b = -1;
                    btuv = (btuv) bxvd.mo74062i();
                    a = m96007a(btuv);
                    if (a != null) {
                    }
                    j = this.f112878j;
                    j2 = btuv.f150642b;
                    if (j > j2) {
                    }
                }
            } catch (IOException e2) {
                bxvd = (bxvd) btuv2.mo74142c(5);
                bxvd.mo73625a((bxvk) btuv2);
                if (bxvd.f164950c) {
                }
                btuv btuv42 = (btuv) bxvd.f164949b;
                btuv42.f150641a |= 1;
                btuv42.f150642b = -1;
                btuv = (btuv) bxvd.mo74062i();
                a = m96007a(btuv);
                if (a != null) {
                }
                j = this.f112878j;
                j2 = btuv.f150642b;
                if (j > j2) {
                }
            }
            a = m96007a(btuv);
            if (a != null) {
                this.f112871c.put(str, a);
            }
            j = this.f112878j;
            j2 = btuv.f150642b;
            if (j > j2) {
                this.f112878j = j2;
            }
        }
        mo61216a();
    }

    /* renamed from: a */
    public static final bewy m96007a(btuv btuv) {
        int i;
        if ((btuv.f150641a & 8) == 0) {
            return null;
        }
        btuz btuz = btuv.f150644d;
        if (btuz == null) {
            btuz = btuz.f150650c;
        }
        if (btuz.f150652a.size() == 0) {
            return null;
        }
        btuz btuz2 = btuv.f150644d;
        if (btuz2 == null) {
            btuz2 = btuz.f150650c;
        }
        bxwc bxwc = btuz2.f150652a;
        int size = bxwc.size();
        bewx[] bewxArr = new bewx[size];
        for (int i2 = 0; i2 < size; i2++) {
            btuu btuu = (btuu) bxwc.get(i2);
            if ((btuu.f150634a & 2) != 0) {
                i = btuu.f150637d;
            } else {
                i = 1000;
            }
            bewxArr[i2] = new bewx(bqcl.m112574a(btuu.f150635b), btuu.f150636c, i);
        }
        btuz btuz3 = btuv.f150644d;
        if (btuz3 == null) {
            btuz3 = btuz.f150650c;
        }
        return new bewy(bewxArr, btuz3.f150653b);
    }

    /* renamed from: b */
    public final bfkw mo61217b(String str) {
        return new bfkw(1, mo61215a(str), this.f112879k);
    }

    /* renamed from: a */
    public final File mo61215a(String str) {
        return new File(this.f112869a.getFilesDir(), String.format("activity_personalization_model_%s.pb", str));
    }

    /* renamed from: a */
    public final void mo61216a() {
        NetworkInfo activeNetworkInfo;
        long elapsedRealtime = (SystemClock.elapsedRealtime() - this.f112877i) + this.f112876h;
        if (elapsedRealtime - this.f112878j >= cezo.f183530a.mo6606a().personalizedModelRefreshIntervalDays() * 86400000 && (activeNetworkInfo = ((ConnectivityManager) this.f112869a.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            if (!cezo.f183530a.mo6606a().checkBatteryStatus() || this.f112873e) {
                this.f112875g.execute(new bewz(this, elapsedRealtime));
                this.f112878j = elapsedRealtime;
            }
        }
    }
}
