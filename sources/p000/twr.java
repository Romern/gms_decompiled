package p000;

import android.accounts.Account;
import com.google.android.gms.drive.networkcontrol.ConnectivityChangeReceiver;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: twr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class twr extends Thread {

    /* renamed from: a */
    final /* synthetic */ vpu f46764a;

    /* renamed from: b */
    final /* synthetic */ tws f46765b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public twr(tws tws, String str, vpu vpu) {
        super(str);
        this.f46765b = tws;
        this.f46764a = vpu;
    }

    public final void run() {
        uho uho;
        int i;
        uig k;
        try {
            File file = null;
            ((ugx) this.f46764a.f49757d).f47578a.mo27465a(ujd.f47755a, (uog) null);
            tws tws = this.f46765b;
            int i2 = tws.f46766d;
            uho = tws.f46769a;
            HashSet<String> hashSet = new HashSet();
            uhn uhn = uho.f47649b;
            for (uij uij : ((ugx) uhn).mo27363a(((ugx) uhn).f47578a.mo27468a(uim.f47706a.mo27735b(), (String[]) null, (uog) null, (String) null), uhv.f47665a).mo27502a()) {
                hashSet.add(uij.f47691f);
            }
            for (Account account : voo.m40938a(uho.f47651d)) {
                hashSet.remove(account.name);
            }
            for (String str : hashSet) {
                uho.f47649b.mo27412a(uho.f47649b.mo27428c(str));
            }
            File file2 = new File(uho.f47650c.f49698a.getCacheDir(), "filecache2");
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    file = file2;
                }
            }
            if (file != null) {
                srj.m36120a(file);
            }
            File d = uho.f47650c.mo28716d();
            if (d != null) {
                srj.m36120a(d);
            }
        } catch (IOException e) {
            uho.f47648a.mo25376c("Error removing legacy content files");
        } catch (Throwable th) {
            tws tws2 = this.f46765b;
            int i3 = tws.f46766d;
            tws2.f46771c.countDown();
            throw th;
        }
        if (uho.f47650c.mo28718f() != null) {
            uho.f47649b.mo27435d();
            try {
                bnia bnia = new bnia();
                k = uho.f47649b.mo27452k();
                Iterator it = k.iterator();
                while (it.hasNext()) {
                    ukp ukp = (ukp) it.next();
                    vow vow = ukp.f48036d;
                    if (vow == null || vow.f49688b == null || vow.f49689c == null) {
                        bnia.mo67629b(ukp.f48033a);
                        ukp.mo27726u();
                    }
                }
                uho.f47649b.mo27411a(bnia.mo67751a());
                uho.f47649b.mo27442f();
                k.close();
                uho.f47649b.mo27439e();
                File[] listFiles = uho.f47650c.mo28718f().listFiles();
                if (listFiles == null) {
                    uho.f47648a.mo25377c("ObsoleteDataCleaner", "Unable to retrieve files to delete from shared content directory.");
                } else {
                    for (File file3 : listFiles) {
                        if (uho.f47649b.mo27446g(file3.getName())) {
                            file3.delete();
                        }
                    }
                }
            } catch (Throwable th2) {
                uho.f47649b.mo27439e();
                throw th2;
            }
        }
        this.f46764a.f49765l.mo27886a();
        this.f46764a.f49769p.mo27275a();
        vpu vpu = this.f46764a;
        vfp vfp = vpu.f49768o;
        vpu.f49775v.mo27856a();
        this.f46764a.f49759f.mo27002c();
        ConnectivityChangeReceiver connectivityChangeReceiver = this.f46764a.f49742A;
        connectivityChangeReceiver.mo18281a(this.f46765b.f46770b.f47037b);
        connectivityChangeReceiver.mo18281a(vfp.f49200m);
        connectivityChangeReceiver.mo18281a(this.f46764a.f49776w.f49316a);
        this.f46764a.f49743B.mo18281a(this.f46765b.f46770b.f47036a);
        this.f46765b.f46770b.mo27006a();
        vfp.mo28398a();
        this.f46765b.f46771c.countDown();
    }
}
