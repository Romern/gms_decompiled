package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rbn implements rbp {

    /* renamed from: a */
    private final Context f42581a;

    /* renamed from: b */
    private final qxq f42582b;

    /* renamed from: c */
    private final qws f42583c;

    /* renamed from: d */
    private final Map f42584d = new HashMap();

    /* renamed from: e */
    private qxo f42585e;

    public rbn(Context context, qws qws, qxq qxq) {
        this.f42581a = context;
        this.f42583c = qws;
        this.f42582b = qxq;
        qxq.mo24374a();
    }

    /* renamed from: a */
    private static void m33260a(bxvd bxvd, caik caik) {
        if ((caik.f174713a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            cagl cagl = (cagl) bmxv.m108567c(cagl.m126606a(caik.f174716d)).mo66812a(cagl.UNKNOWN);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boqt boqt = (boqt) bxvd.f164949b;
            boqt boqt2 = boqt.f134318j;
            boqt.f134322c = cagl.f174465yP;
            boqt.f134320a |= 2;
            return;
        }
        String str = caik.f174721i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boqt boqt3 = (boqt) bxvd.f164949b;
        boqt boqt4 = boqt.f134318j;
        str.getClass();
        boqt3.f134320a |= 1;
        boqt3.f134321b = str;
    }

    /* renamed from: b */
    public final void mo24449b(caik caik, int i) {
        qxq qxq = this.f42582b;
        bxvd da = boqt.f134318j.mo74144da();
        m33260a(da, caik);
        boolean a = rep.m33475a(this.f42581a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqt boqt = (boqt) da.f164949b;
        boqt.f134320a |= 4;
        boqt.f134323d = a;
        boolean b = rep.m33476b(this.f42581a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqt boqt2 = (boqt) da.f164949b;
        boqt2.f134320a |= 8;
        boqt2.f134324e = b;
        if ((caik.f174713a & 1024) != 0) {
            cagz cagz = (cagz) bmxv.m108567c(cagz.m126622a(caik.f174723k)).mo66812a(cagz.DEFAULT);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqt boqt3 = (boqt) da.f164949b;
            boqt3.f134325f = cagz.f174516f;
            boqt3.f134320a |= 16;
        }
        boqt boqt4 = (boqt) da.f164949b;
        boqt4.f134327h = i - 1;
        boqt4.f134320a |= 64;
        qxq.mo24377a(m33261a((boqt) da.mo74062i()));
        this.f42582b.mo24383c("HttpRequest").mo24359a();
    }

    /* renamed from: c */
    public final void mo24453c(caik caik, long j) {
        this.f42582b.mo24377a(mo24451b(caik));
        this.f42582b.mo24387e("RequestUploadDelay").mo24368a(j);
    }

    public final void close() {
        this.f42582b.mo24388e();
    }

    /* renamed from: a */
    private final byte[] m33261a(boqt boqt) {
        if (!this.f42584d.containsKey(boqt)) {
            this.f42584d.put(boqt, boqt.mo73642k());
        }
        return (byte[]) this.f42584d.get(boqt);
    }

    /* renamed from: a */
    public final void mo24439a() {
        this.f42582b.mo24377a((byte[]) null);
        this.f42582b.mo24383c("PseudonymousIdFailures").mo24359a();
    }

    /* renamed from: a */
    public final void mo24440a(int i) {
        this.f42582b.mo24377a((byte[]) null);
        qxo qxo = this.f42585e;
        if (qxo != null) {
            qxo.mo24371b();
        }
        qxq qxq = this.f42582b;
        bxvd da = boqt.f134318j.mo74144da();
        boolean a = rep.m33475a(this.f42581a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqt boqt = (boqt) da.f164949b;
        boqt.f134320a |= 4;
        boqt.f134323d = a;
        boolean b = rep.m33476b(this.f42581a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqt boqt2 = (boqt) da.f164949b;
        boqt2.f134320a |= 8;
        boqt2.f134324e = b;
        qxq.mo24377a(m33261a((boqt) da.mo74062i()));
        this.f42582b.mo24385d("ResponseStatus").mo24367a(i);
        StringBuilder sb = new StringBuilder(34);
        sb.append("ResponseStatus of code ");
        sb.append(i);
        sb.toString();
    }

    /* renamed from: b */
    public final void mo24450b(caik caik, long j) {
        this.f42582b.mo24377a(mo24451b(caik));
        if (j > -1) {
            this.f42582b.mo24387e("RequestHeaderSize").mo24368a(j);
            StringBuilder sb = new StringBuilder(38);
            sb.append("RequestHeaderSize=");
            sb.append(j);
            sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo24451b(caik caik) {
        bxvd da = boqt.f134318j.mo74144da();
        m33260a(da, caik);
        boolean a = rep.m33475a(this.f42581a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqt boqt = (boqt) da.f164949b;
        boqt.f134320a |= 4;
        boqt.f134323d = a;
        boolean b = rep.m33476b(this.f42581a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqt boqt2 = (boqt) da.f164949b;
        boqt2.f134320a |= 8;
        boqt2.f134324e = b;
        if ((caik.f174713a & 1024) != 0) {
            cagz cagz = (cagz) bmxv.m108567c(cagz.m126622a(caik.f174723k)).mo66812a(cagz.DEFAULT);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqt boqt3 = (boqt) da.f164949b;
            boqt3.f134325f = cagz.f174516f;
            boqt3.f134320a |= 16;
        }
        return m33261a((boqt) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo24441a(int i, String str) {
        if (cdeb.f180572a.mo6606a().mo77325b()) {
            if (str != null) {
                this.f42582b.mo24377a(mo24452b(str));
            } else {
                this.f42582b.mo24377a((byte[]) null);
            }
            this.f42582b.mo24385d("GetAuthToken").mo24367a(i);
        }
    }

    /* renamed from: a */
    public final void mo24442a(int i, byte[] bArr) {
        this.f42582b.mo24377a((byte[]) null);
        this.f42582b.mo24383c("LogResponseParseError").mo24359a();
        bxvd da = boqv.f134333d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqv boqv = (boqv) da.f164949b;
        boqv.f134335a |= 1;
        boqv.f134336b = i;
        bxtx a = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqv boqv2 = (boqv) da.f164949b;
        a.getClass();
        boqv2.f134335a |= 2;
        boqv2.f134337c = a;
        boqv boqv3 = (boqv) da.mo74062i();
        bxvd da2 = boqu.f134329c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boqu boqu = (boqu) da2.f164949b;
        boqv3.getClass();
        boqu.f134332b = boqv3;
        boqu.f134331a |= 2;
        qwo a2 = this.f42583c.mo24333a((boqu) da2.mo74062i());
        a2.f42320d = "METALOG";
        a2.mo24327b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo24452b(String str) {
        bxvd da = boqt.f134318j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqt boqt = (boqt) da.f164949b;
        str.getClass();
        boqt.f134320a |= 1;
        boqt.f134321b = str;
        return m33261a((boqt) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo24443a(caik caik) {
        this.f42582b.mo24377a(mo24451b(caik));
        this.f42585e = this.f42582b.mo24389f("RequestLatency").mo24372a();
    }

    /* renamed from: a */
    public final void mo24444a(caik caik, int i) {
        this.f42582b.mo24377a(mo24451b(caik));
        this.f42582b.mo24385d("OversizeBatchedLogRequests").mo24367a(i);
    }

    /* renamed from: a */
    public final void mo24445a(caik caik, long j) {
        this.f42582b.mo24377a(mo24451b(caik));
        if (j > -1) {
            this.f42582b.mo24387e("RequestSize").mo24368a(j);
            StringBuilder sb = new StringBuilder(32);
            sb.append("RequestSize=");
            sb.append(j);
            sb.toString();
        }
    }

    /* renamed from: a */
    public final void mo24446a(String str) {
        this.f42582b.mo24383c(str).mo24359a();
    }

    /* renamed from: a */
    public final void mo24447a(rdj rdj) {
        this.f42582b.mo24377a((byte[]) null);
        if (rdj == null) {
            return;
        }
        if (rdj.f42731b != 0 || rdj.f42733d != 0 || rdj.f42735f != 0 || rdj.f42730a != 0 || rdj.f42734e != 0 || rdj.f42736g != 0 || rdj.f42732c != 0 || rdj.f42737h != 0 || !rdj.f42738i.isEmpty()) {
            rdj.toString();
            this.f42582b.mo24383c("CleanupOccurrence").mo24359a();
            if (rdj.f42731b != 0) {
                this.f42582b.mo24387e("CleanupNumBytesDeletedOverSize").mo24368a(rdj.f42731b);
            }
            if (rdj.f42733d != 0) {
                this.f42582b.mo24387e("CleanupNumCorruptContextsDeleted").mo24368a(rdj.f42733d);
            }
            if (rdj.f42735f != 0) {
                this.f42582b.mo24387e("CleanupNumEventsDeletedOversize").mo24368a(rdj.f42735f);
            }
            if (rdj.f42730a != 0) {
                this.f42582b.mo24387e("CleanupNumBytesDeletedTooOld").mo24368a(rdj.f42730a);
            }
            if (rdj.f42734e != 0) {
                this.f42582b.mo24387e("CleanupNumEventsDeletedTooOld").mo24368a(rdj.f42734e);
            }
            if (rdj.f42736g != 0) {
                this.f42582b.mo24387e("CleanupNumEventsDeletedCorruptPLC").mo24368a(rdj.f42736g);
            }
            if (rdj.f42732c != 0) {
                this.f42582b.mo24387e("CleanupNumBytesDeletedCorruptPLC").mo24368a(rdj.f42732c);
            }
            if (!rdj.f42738i.isEmpty()) {
                for (Map.Entry entry : rdj.f42738i.entrySet()) {
                    qxq qxq = this.f42582b;
                    rdn rdn = (rdn) entry.getKey();
                    bxvd da = boqs.f134312e.mo74144da();
                    long j = rdn.f42750b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boqs boqs = (boqs) da.f164949b;
                    int i = boqs.f134314a | 1;
                    boqs.f134314a = i;
                    boqs.f134315b = j;
                    long j2 = rdn.f42751c;
                    int i2 = i | 2;
                    boqs.f134314a = i2;
                    boqs.f134316c = j2;
                    long j3 = rdn.f42752d;
                    boqs.f134314a = i2 | 4;
                    boqs.f134317d = j3;
                    boqs boqs2 = (boqs) da.mo74062i();
                    bxvd da2 = boqt.f134318j.mo74144da();
                    String str = rdn.f42749a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boqt boqt = (boqt) da2.f164949b;
                    str.getClass();
                    int i3 = boqt.f134320a | 1;
                    boqt.f134320a = i3;
                    boqt.f134321b = str;
                    boqs2.getClass();
                    boqt.f134328i = boqs2;
                    boqt.f134320a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    qxq.mo24377a(m33261a((boqt) da2.mo74062i()));
                    this.f42582b.mo24383c("LogFilesDeletedDueToTTL").mo24360a(((Long) entry.getValue()).longValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24448a(rdp rdp) {
        this.f42582b.mo24377a((byte[]) null);
        String k = rdp.mo24507k();
        try {
            long b = rdp.mo24490b();
            this.f42582b.mo24387e(String.valueOf(k).concat("TotalStorage")).mo24368a(b);
            StringBuilder sb = new StringBuilder(41);
            sb.append("TotalStorage of size ");
            sb.append(b);
            sb.toString();
        } catch (SQLiteException | IOException e) {
            Log.e("CountersMetaLogger", "Couldn't log total storage size.", e);
        }
        try {
            long e2 = rdp.mo24500e();
            this.f42582b.mo24387e(String.valueOf(k).concat("PlayLoggerContextNum")).mo24368a(e2);
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Num of PlayLoggerContexts: ");
            sb2.append(e2);
            sb2.toString();
        } catch (SQLiteException | IOException e3) {
            Log.e("CountersMetaLogger", "Couldn't log play logger context num.", e3);
        }
        try {
            if (!rdp.mo24498d()) {
                Map c = rdp.mo24496c();
                if (c != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        rdh rdh = (rdh) entry.getValue();
                        this.f42582b.mo24377a(mo24452b((String) entry.getKey()));
                        if (rdh.f42728b != 0) {
                            this.f42582b.mo24387e(String.valueOf(k).concat("PlcNumPerLogSource")).mo24368a(rdh.f42728b);
                        }
                        if (rdh.f42727a != 0) {
                            this.f42582b.mo24387e(String.valueOf(k).concat("SizePerLogSource")).mo24368a(rdh.f42727a);
                        }
                        if (rdh.f42729c != 0) {
                            this.f42582b.mo24387e(String.valueOf(k).concat("NumFilesPerLogSource")).mo24368a(rdh.f42729c);
                        }
                    }
                }
                try {
                    String k2 = rdp.mo24507k();
                    for (Map.Entry entry2 : rdp.mo24506j().entrySet()) {
                        qxq qxq = this.f42582b;
                        rdo rdo = (rdo) entry2.getKey();
                        bxvd da = boqt.f134318j.mo74144da();
                        String str = rdo.f42753a;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boqt boqt = (boqt) da.f164949b;
                        str.getClass();
                        int i = boqt.f134320a | 1;
                        boqt.f134320a = i;
                        boqt.f134321b = str;
                        String str2 = rdo.f42754b;
                        str2.getClass();
                        boqt.f134320a = i | 32;
                        boqt.f134326g = str2;
                        qxq.mo24377a(m33261a((boqt) da.mo74062i()));
                        this.f42582b.mo24383c(String.valueOf(k2).concat("LogDropCount")).mo24360a((long) ((Integer) entry2.getValue()).intValue());
                    }
                } catch (IOException e4) {
                    Log.i("CountersMetaLogger", "Could not retrieve the number of dropped logs.", e4);
                }
            } else {
                Log.i("CountersMetaLogger", "Storage is overflowing - bailing on size by log source");
            }
        } catch (SQLiteException | IOException e5) {
            Log.e("CountersMetaLogger", "Couldn't read database - bailing on size by log source", e5);
        }
    }
}
