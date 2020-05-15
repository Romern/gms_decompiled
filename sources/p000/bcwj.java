package p000;

import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: bcwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwj implements bcnl {

    /* renamed from: a */
    final int f105057a;

    /* renamed from: b */
    private final bcwp f105058b;

    /* renamed from: c */
    private final bqgj f105059c = bboz.m88304a().f103024a;

    /* renamed from: d */
    private final String f105060d;

    /* renamed from: e */
    private final bcoh f105061e;

    public bcwj(bcoh bcoh, String str, bcwp bcwp, int i) {
        this.f105058b = bcwp;
        this.f105060d = str;
        this.f105061e = bcoh;
        this.f105057a = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112673a(bqgg, new bcwi(this, (cbna) obj), this.f105059c);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = cbna.f177706c.mo74144da();
        bxvd da2 = cbmf.f177611d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbmf) da2.f164949b).f177614b = cipi.m150693a(12);
        String a = this.f105058b.mo57617a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a.getClass();
        ((cbmf) da2.f164949b).f177613a = a;
        bxvl a2 = bxvl.m124044a(this.f105058b.mo57618b());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a2.getClass();
        ((cbmf) da2.f164949b).f177615c = a2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmf cbmf = (cbmf) da2.mo74062i();
        cbmf.getClass();
        ((cbna) da.f164949b).f177709b = cbmf;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo.getClass();
        ((cbna) da.f164949b).f177708a = cbmo;
        return bqga.m112775a((cbna) da.mo74062i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo57616a(cbna cbna, bcwg bcwg) {
        File file;
        HttpsURLConnection httpsURLConnection;
        String str;
        try {
            file = new File(this.f105060d);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                if (!parentFile.mkdirs()) {
                    throw bcwg.m90141a("Unknown", "Unable to create parent directory", chuv.f189229p);
                }
            }
            httpsURLConnection = (HttpsURLConnection) new URL((String) bcwg.f105052b.f103161c.mo58455c()).openConnection();
            httpsURLConnection.setConnectTimeout(((Long) bcwg.f105052b.f103147ap.mo58455c()).intValue());
            httpsURLConnection.setReadTimeout(((Long) bcwg.f105052b.f103148aq.mo58455c()).intValue());
            httpsURLConnection.setInstanceFollowRedirects(true);
            httpsURLConnection.setRequestProperty("X-Goog-Download-Metadata", Base64.encodeToString(cbna.serializeToBytes(), 2));
            String valueOf = String.valueOf(bcwg.f105053c);
            httpsURLConnection.setRequestProperty("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpsURLConnection.getInputStream());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            boav.m111013a(bufferedInputStream, bufferedOutputStream);
            bufferedOutputStream.close();
            bufferedInputStream.close();
            return new Object();
        } catch (IOException e) {
            throw bcwg.m90142a("Unknown", "Unable to open connection", chuv.f189229p, e);
        } catch (IOException e2) {
            file.delete();
            int responseCode = httpsURLConnection.getResponseCode();
            if (httpsURLConnection.getHeaderField("x-guploader-uploadid") != null) {
                str = httpsURLConnection.getHeaderField("x-guploader-uploadid");
                String valueOf2 = String.valueOf(str);
                bbos.m88289a("ScottyStub", valueOf2.length() == 0 ? new String("Media Download requestId=") : "Media Download requestId=".concat(valueOf2));
            } else {
                str = "Unknown";
            }
            if (responseCode == 200) {
                throw new chux(chuv.f189217d.mo85692c(e2));
            } else if (responseCode == 401) {
                throw bcwg.m90141a(str, "Media download unauthenticated (Response Code 401)", chuv.f189223j);
            } else if (responseCode != 404) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("Media download failed: responseCode=");
                sb.append(responseCode);
                throw bcwg.m90141a(str, sb.toString(), chuv.f189229p);
            } else {
                throw bcwg.m90141a(str, "404 error", chuv.f189220g);
            }
        } catch (IOException e3) {
            throw bcwg.m90142a("Unknown", "Missing Status", chuv.f189229p, e3);
        } catch (MalformedURLException e4) {
            throw new chux(chuv.f189218e.mo85692c(e4));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        bcvw b = bcvx.m90131b();
        b.mo57614a(this.f105060d);
        return b.mo57613a();
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        int i2 = chuv.f189233s.f189211r;
        Throwable th = chuv.f189235u;
        if (th instanceof bcwb) {
            bcwb bcwb = (bcwb) th;
        }
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f105061e.mo57058b().mo57074e());
        q.mo57010a(this.f105061e.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(this.f105057a);
        q.mo57009a(Integer.valueOf(i2));
        q.mo57003a(i);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bcvx bcvx = (bcvx) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f105061e.mo57058b().mo57074e());
        q.mo57010a(this.f105061e.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(this.f105057a);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
