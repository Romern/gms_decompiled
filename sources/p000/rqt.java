package p000;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Build;
import com.felicanetworks.mfc.Felica;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.locks.Lock;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: rqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqt {

    /* renamed from: a */
    public static final imn f43529a = new rqs();

    /* renamed from: b */
    private static final sek f43530b = new sek("GLSUser", "ChannelBindingManager");

    /* renamed from: c */
    private final Context f43531c;

    public rqt(Context context) {
        this.f43531c = context;
    }

    /* renamed from: a */
    public final boolean mo25034a() {
        boolean z;
        boolean z2;
        if (cbxv.f178529a.mo6606a().mo75587a() <= ((long) rfx.f42891a)) {
            z = true;
        } else {
            z = false;
        }
        if (cbxv.f178529a.mo6606a().mo75588b() <= ((long) Build.VERSION.SDK_INT)) {
            z2 = true;
        } else {
            z2 = false;
        }
        f43530b.mo25409a("Checking whether channelId is enabled. isEnabledGmsCore? %s, isEnabledSdk? %s, isAtLeastIceCreamSandwich? %s", Boolean.valueOf(z), Boolean.valueOf(z2), true);
        return z && z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0102 A[Catch:{ Exception -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010c A[Catch:{ Exception -> 0x0130 }] */
    /* renamed from: a */
    public final boolean mo25035a(abop abop, Context context) {
        SSLSocketFactory sSLSocketFactory;
        Lock lock;
        KeyPair keyPair;
        SSLSocketFactory sSLSocketFactory2;
        if (!mo25034a()) {
            return false;
        }
        rqu rqu = null;
        if (!mo25034a()) {
            sSLSocketFactory = null;
        } else if (cbxv.m128864b()) {
            sSLSocketFactory = new apto(context, Felica.MAX_TIMEOUT, true, "bound_sslcache");
        } else {
            try {
                sSLSocketFactory = SSLCertificateSocketFactory.getDefault(Felica.MAX_TIMEOUT, new SSLSessionCache(context.getDir("bound_sslcache", 0)));
            } catch (IOException e) {
                sSLSocketFactory = null;
            }
        }
        if (sSLSocketFactory == null) {
            return false;
        }
        ((aboy) abop.f57803a).f57826e = sSLSocketFactory;
        f43530b.mo25409a("Attempting to set channel binding key on GMSCore's SSLSocketFactory.", new Object[0]);
        if (!mo25034a()) {
            return false;
        }
        if ((sSLSocketFactory instanceof SSLCertificateSocketFactory) || (sSLSocketFactory instanceof apto)) {
            rqu = new rqu(sSLSocketFactory);
        } else {
            f43530b.mo25416d("Can't channel bind unsupported sslSocketFactory: %s", sSLSocketFactory.getClass());
        }
        if (rqu == null) {
            return false;
        }
        try {
            rqr.f43525a.lock();
            if (rqr.f43527c == null) {
                rqr.f43527c = new rqr();
            }
            rqr.f43525a.unlock();
            rqr rqr = rqr.f43527c;
            Context context2 = this.f43531c;
            rqr.f43525a.lock();
            if (rqr.f43528d == null) {
                rqr.f43528d = new iml(new File(context2.getFilesDir(), "auth.channel.store.properties"));
            }
            String a = rqr.f43528d.mo13139a("channel_binding_manager_privateKey");
            String a2 = rqr.f43528d.mo13139a("channel_binding_manager_publicKey");
            if (a != null) {
                if (a2 != null) {
                    rqr.f43526b.mo25409a("Using existing Channel ID key.", new Object[0]);
                    KeyFactory instance = KeyFactory.getInstance("EC");
                    keyPair = new KeyPair(instance.generatePublic(new X509EncodedKeySpec(sqd.m35966a(a2))), instance.generatePrivate(new PKCS8EncodedKeySpec(sqd.m35966a(a))));
                    lock = rqr.f43525a;
                    lock.unlock();
                    PrivateKey privateKey = keyPair.getPrivate();
                    sSLSocketFactory2 = rqu.f43533b;
                    if (!(sSLSocketFactory2 instanceof SSLCertificateSocketFactory)) {
                        sSLSocketFactory2.getClass().getMethod("setChannelIdPrivateKey", PrivateKey.class).invoke(rqu.f43533b, privateKey);
                    } else if (sSLSocketFactory2 instanceof apto) {
                        ((apto) sSLSocketFactory2).f84862d = privateKey;
                    }
                    rqu.f43532a.mo25414c("Successfully bound channel!", new Object[0]);
                    return true;
                }
            }
            int i = Build.VERSION.SDK_INT;
            rqr.f43526b.mo25409a("Checking for old wrapped keys", new Object[0]);
            keyPair = rqr.mo25033a();
            lock = rqr.f43525a;
            lock.unlock();
            PrivateKey privateKey2 = keyPair.getPrivate();
            try {
                sSLSocketFactory2 = rqu.f43533b;
                if (!(sSLSocketFactory2 instanceof SSLCertificateSocketFactory)) {
                }
                rqu.f43532a.mo25414c("Successfully bound channel!", new Object[0]);
                return true;
            } catch (Exception e2) {
                sek sek = rqu.f43532a;
                String valueOf = String.valueOf(e2.getMessage());
                sek.mo25416d(valueOf.length() == 0 ? new String("Exception: unable to bind channel ") : "Exception: unable to bind channel ".concat(valueOf), new Object[0]);
                return true;
            }
        } catch (Exception e3) {
            f43530b.mo25417e("Will proceed without channel binding: %s", e3, new Object[0]);
            return false;
        } catch (Throwable th) {
            rqr.f43525a.unlock();
            throw th;
        }
    }
}
