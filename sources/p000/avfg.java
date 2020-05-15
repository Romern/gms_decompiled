package p000;

import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: avfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avfg {

    /* renamed from: a */
    private static final srn f93076a = srn.m36124a();

    /* renamed from: b */
    private final bqgg f93077b;

    /* renamed from: c */
    private final avjn f93078c;

    /* renamed from: d */
    private final Random f93079d = new Random();

    /* renamed from: e */
    private long f93080e;

    public avfg(bqgg bqgg, avjn avjn) {
        this.f93077b = bqgg;
        this.f93078c = avjn;
    }

    /* renamed from: a */
    private final void m78422a(String str, String str2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f93080e;
        int b = (int) chav.f188214a.mo6606a().mo84890b();
        if (this.f93078c == null) {
            bnsl bnsl = (bnsl) f93076a.mo68388c();
            bnsl.mo68432a("avfg", "a", 178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("UdcClearcutLogger is null.");
        } else if (b > 0 && this.f93079d.nextInt(b) == 0) {
            avjn avjn = this.f93078c;
            bxvd da = bspq.f146567d.mo74144da();
            bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
            bsmt bsmt = bsmt.UDC_MOBILE;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp = (bspp) bxvf.f164949b;
            bspp.f146556b = bsmt.f145305dO;
            int i = bspp.f146555a | 1;
            bspp.f146555a = i;
            bspp.f146557c = 29006;
            int i2 = i | 2;
            bspp.f146555a = i2;
            bspp.f146555a = i2 | 16;
            bspp.f146560f = true;
            bsov a = avjn.mo51290a("com.google.android.gms", str, elapsedRealtime, str2);
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp2 = (bspp) bxvf.f164949b;
            a.getClass();
            bspp2.f146563i = a;
            bspp2.f146555a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspq bspq = (bspq) da.f164949b;
            bspp bspp3 = (bspp) bxvf.mo74062i();
            bspp3.getClass();
            bspq.f146570b = bspp3;
            bspq.f146569a |= 1;
            avjn.mo51294a((bspq) da.mo74062i());
        }
    }

    /* renamed from: c */
    private final void m78424c() {
        this.f93080e = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final avfs mo51190b() {
        String str;
        try {
            m78424c();
            return (avfs) this.f93077b.get(chbh.m148018p(), TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof UserRecoverableAuthException) {
                str = "UserRecoverableAuthException";
            } else {
                str = !(e.getCause() instanceof IOException) ? "OtherException" : "IOException";
            }
            bnsl bnsl = (bnsl) f93076a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("avfg", "b", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Exception occurred while getting SettingsStore instance.");
            m78422a("BlockingSettingsStore.getSettingsStore", str);
            return null;
        } catch (InterruptedException | TimeoutException e2) {
            bnsl bnsl2 = (bnsl) f93076a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("avfg", "b", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Timed out or interrupted while getting SettingsStore instance.");
            m78422a("BlockingSettingsStore.getSettingsStore", "Timeout");
            return null;
        }
    }

    /* renamed from: a */
    private final boolean m78423a(int i) {
        if (this.f93078c == null) {
            bnsl bnsl = (bnsl) f93076a.mo68388c();
            bnsl.mo68432a("avfg", "a", 178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("UdcClearcutLogger is null.");
            return false;
        } else if (i <= 0 || this.f93079d.nextInt(i) != 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final auzj mo51188a() {
        String str;
        avfs b = mo51190b();
        if (b == null) {
            return null;
        }
        try {
            m78424c();
            auzj auzj = (auzj) b.mo51194a().get(chbh.m148018p(), TimeUnit.MILLISECONDS);
            if (auzj == null) {
                bnsl bnsl = (bnsl) f93076a.mo68388c();
                bnsl.mo68432a("avfg", "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Empty content. Thus might mean that the settings are not synced down.");
                m78422a("BlockingSettingsStore.retrieveSettings", "NoDataAvailable");
            }
            return auzj;
        } catch (ExecutionException e) {
            bnsl bnsl2 = (bnsl) f93076a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("avfg", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Exception occurred while retrieving settings from storage.");
            if (!(e.getCause() instanceof IOException)) {
                str = "OtherException";
            } else {
                str = "IOException";
            }
            m78422a("BlockingSettingsStore.retrieveSettings", str);
            return null;
        } catch (InterruptedException | TimeoutException e2) {
            bnsl bnsl3 = (bnsl) f93076a.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("avfg", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Timed out or interrupted while retrieving settings from storage.");
            m78422a("BlockingSettingsStore.retrieveSettings", "Timeout");
            return null;
        }
    }

    /* renamed from: a */
    public final auzj mo51189a(auzj auzj) {
        String str;
        avfs b = mo51190b();
        if (b == null) {
            return null;
        }
        try {
            m78424c();
            AtomicReference atomicReference = new AtomicReference();
            return (auzj) bqdx.m112673a(b.f93105a.mo60777a(new avfp(atomicReference, auzj), bqfb.INSTANCE), new avfq(atomicReference), bqfb.INSTANCE).get(chbh.m148018p(), TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) f93076a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("avfg", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Exception occurred while saving UDC settings to storage.");
            if (!(e.getCause() instanceof IOException)) {
                str = "OtherException";
            } else {
                str = "IOException";
            }
            m78422a("BlockingSettingsStore.saveSettings", str);
            return null;
        } catch (InterruptedException | TimeoutException e2) {
            bnsl bnsl2 = (bnsl) f93076a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("avfg", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Timed out or interrupted while saving UDC settings to storage.");
            m78422a("BlockingSettingsStore.saveSettings", "Timeout");
            return null;
        }
    }
}
