package p000;

import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;
import com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;

/* renamed from: izr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class izr {

    /* renamed from: a */
    public static final izr f22008a = new izr();

    /* renamed from: b */
    private static final Logger f22009b = jdh.m16547a("EnrollmentManager");

    /* renamed from: a */
    static final int m16378a(Context context, ByteString bxtx, ByteString bxtx2, int i) {
        try {
            RecoveryController.getInstance(context).initRecoveryService(ccfy.m129505q(), bxtx.getKey(), bxtx2.getKey());
            f22009b.mo25414c("Recovery service is initialized.", new Object[0]);
            jdg.m16546c(context, 6, i);
            return 4;
        } catch (InternalRecoveryServiceException | CertificateException e) {
            Logger Logger = f22009b;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Failed to initialize Recovery service. ");
            sb.append(valueOf);
            Logger.mo25414c(sb.toString(), new Object[0]);
            jdg.m16546c(context, 5, i);
            return 3;
        }
    }

    private izr() {
    }

    /* renamed from: a */
    static final ByteString m16379a(String str) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        InputStream inputStream;
        try {
            httpURLConnection = (HttpURLConnection) stp.m36306a(new izt(str).f22012a, 18432);
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    ByteString a = ByteString.m123256a(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    stp.m36307a(httpURLConnection);
                    return a;
                }
                Logger Logger = f22009b;
                StringBuilder sb = new StringBuilder(29);
                sb.append("Bad response code ");
                sb.append(responseCode);
                Logger.mo25412b(sb.toString(), new Object[0]);
                throw new IOException("Server returns bad data.");
            } catch (Throwable th2) {
                th = th2;
                stp.m36307a(httpURLConnection);
                throw th;
            }
            throw th;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            stp.m36307a(httpURLConnection);
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo13536a(Context context, boolean z, int i) {
        jib jib = jib.f22535e;
        try {
            bmxv a = izs.f22010a.mo13537a(context);
            if (a.mo66813a()) {
                f22009b.mo25414c("Returning certificates list from cache", new Object[0]);
                jib = (jib) a.mo66814b();
            } else {
                bxvd da = jib.f22535e.mo74144da();
                ByteString a2 = m16379a(ccfy.f178890a.mo6606a().mo75891f());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                jib jib2 = (jib) da.f164949b;
                a2.getClass();
                jib2.f22537a |= 2;
                jib2.f22538b = a2;
                ByteString a3 = m16379a(ccfy.f178890a.mo6606a().mo75890e());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                jib jib3 = (jib) da.f164949b;
                a3.getClass();
                jib3.f22537a |= 4;
                jib3.f22539c = a3;
                long currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(ccfy.f178890a.mo6606a().mo75889d());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                jib jib4 = (jib) da.f164949b;
                jib4.f22537a |= 8;
                jib4.f22540d = currentTimeMillis;
                jib jib5 = (jib) da.mo74062i();
                f22009b.mo25414c("Successfully downloaded certificates.", new Object[0]);
                izs.f22010a.mo13538a(context, jib5);
                jib = jib5;
            }
        } catch (IOException e) {
            if (z) {
                FolsomGcmTaskChimeraService.f10915a.mo25412b("scheduleCertificatesSyncRetry", new Object[0]);
                aebi aebi = new aebi();
                aebi.f63097i = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
                aebi.f63099k = "com.google.android.gms.auth.folsom.RETRY_KEY_SYNC_FOR_CERTIFICATES";
                aebi.f63102n = true;
                aebi.mo34004a(30, ccfy.f178890a.mo6606a().mo75875A());
                aebi.f63106r = FolsomGcmTaskChimeraService.f10916b;
                aebi.mo34023a(0);
                aebi.mo34027b(1);
                aeat.m51532a(context).mo33984a(aebi.mo33974b());
            }
        }
        if ((jib.f22537a & 2) == 0 || jib.f22538b.mo73744a() <= 0) {
            f22009b.mo25416d("Failed to download certificate.", new Object[0]);
            jdg.m16546c(context, 3, i);
            return 1;
        } else if ((jib.f22537a & 4) != 0 && jib.f22539c.mo73744a() > 0) {
            return m16378a(context, jib.f22538b, jib.f22539c, i);
        } else {
            f22009b.mo25416d("Failed to download signature.", new Object[0]);
            jdg.m16546c(context, 4, i);
            return 2;
        }
    }
}
