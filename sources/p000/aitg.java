package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.webrtc.PeerConnection;

/* renamed from: aitg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aitg implements aith {

    /* renamed from: a */
    private final aitc f69687a;

    /* renamed from: b */
    private final aiss f69688b;

    /* renamed from: c */
    private final String f69689c;

    /* renamed from: d */
    private aitl f69690d;

    /* renamed from: e */
    private bxtx f69691e;

    public aitg(aitc aitc, aiss aiss, String str) {
        this.f69687a = aitc;
        this.f69688b = aiss;
        this.f69689c = str;
    }

    /* renamed from: b */
    private static cbmo m57898b(bxtx bxtx) {
        bxvd da = cbmo.f177654h.mo74144da();
        String uuid = UUID.randomUUID().toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo cbmo = (cbmo) da.f164949b;
        uuid.getClass();
        cbmo.f177656a = uuid;
        "Nearby".getClass();
        cbmo.f177658c = "Nearby";
        bxtx.getClass();
        cbmo.f177659d = bxtx;
        bxvd da2 = cbly.f177579g.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbly) da2.f164949b).f177586f = 1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbly cbly = (cbly) da2.f164949b;
        cbly.f177581a = 1;
        cbly.f177582b = 24;
        cbly.f177583c = 0;
        cbly.f177584d = 4;
        cbly cbly2 = (cbly) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbly2.getClass();
        ((cbmo) da.f164949b).f177660e = cbly2;
        return (cbmo) da.mo74062i();
    }

    /* renamed from: d */
    private final boolean m57899d() {
        return this.f69691e != null;
    }

    /* renamed from: e */
    private final synchronized void m57900e() {
        aitl aitl = this.f69690d;
        if (aitl != null) {
            aitl.mo37998a();
            this.f69690d = null;
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aitg", "e", 257, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Stopped receiving messages from tachyon.");
            return;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
        bnsl2.mo68432a("aitg", "e", 250, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Skipping stop receiving messages. We are not currently receiving messages from tachyon.");
    }

    /* renamed from: a */
    public final synchronized boolean mo37985a() {
        try {
            aitc aitc = this.f69687a;
            aitk aitk = aitc.f69675b;
            ClientContext clientContext = aitc.f69674a;
            aiss aiss = this.f69688b;
            String str = this.f69689c;
            bxvd da = cbla.f177461f.mo74144da();
            cbmo b = m57898b(bxtx.f164797b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbla cbla = (cbla) da.f164949b;
            b.getClass();
            cbla.f177463a = b;
            "Nearby".getClass();
            cbla.f177464b = "Nearby";
            String a = bute.m120426a();
            cblc cblc = (cblc) cbld.f177471h.mo74144da();
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            a.getClass();
            ((cbld) cblc.f164949b).f177477e = a;
            bxvd da2 = cblz.f177587c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((cblz) da2.f164949b).f177589a = 1;
            String str2 = aiss.f69653a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            str2.getClass();
            ((cblz) da2.f164949b).f177590b = str2;
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            cblz cblz = (cblz) da2.mo74062i();
            cblz.getClass();
            ((cbld) cblc.f164949b).f177473a = cblz;
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            cbld cbld = (cbld) cblc.f164949b;
            str.getClass();
            cbld.f177476d = str;
            String str3 = aiss.f69653a;
            str3.getClass();
            cbld.f177474b = str3;
            cbld cbld2 = (cbld) cblc.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbld2.getClass();
            ((cbla) da.f164949b).f177465c = cbld2;
            bxvd da3 = cbmd.f177603c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((cbmd) da3.f164949b).f177606b = ciph.m150692a(4);
            String country = Locale.getDefault().getCountry();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            country.getClass();
            ((cbmd) da3.f164949b).f177605a = country;
            cbmd cbmd = (cbmd) da3.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbmd.getClass();
            ((cbla) da.f164949b).f177467e = cbmd;
            cbla cbla2 = (cbla) da.mo74062i();
            if (aitk.f69700c == null) {
                aitk.f69700c = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Registration/RegisterAnonymous", ciie.m150370a(cbla.f177461f), ciie.m150370a(cblb.f177468b));
            }
            cblx cblx = ((cblb) aitk.f69702a.mo25553a(aitk.f69700c, clientContext, cbla2, (long) aitk.f69699b, TimeUnit.MILLISECONDS)).f177470a;
            if (cblx == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aitg", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("The tachyon register response is missing an auth token.");
                return false;
            }
            this.f69691e = cblx.f177577a;
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aitg", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Registered with tachyon as %s.", this.f69688b);
            return true;
        } catch (chuw | gid e) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("aitg", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to register with tachyon.");
            return false;
        }
    }

    /* renamed from: c */
    public final synchronized List mo37991c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (!m57899d()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aitg", "c", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Skipping get ice servers. We are not registered with tachyon.");
            return arrayList;
        }
        try {
            aitc aitc = this.f69687a;
            aitj aitj = aitc.f69678e;
            ClientContext clientContext = aitc.f69674a;
            bxtx bxtx = this.f69691e;
            bxvd da = cbkd.f177393c.mo74144da();
            cbmo b = m57898b(bxtx);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbkd cbkd = (cbkd) da.f164949b;
            b.getClass();
            cbkd.f177395a = b;
            "skylift_prod".getClass();
            cbkd.f177396b = "skylift_prod";
            cbcd cbcd = aitj.mo37997a(clientContext, (cbkd) da.mo74062i()).f177399a;
            if (cbcd == null) {
                cbcd = cbcd.f176642b;
            }
            for (cbce cbce : cbcd.f176644a) {
                String str = cbce.f176648b;
                String str2 = cbce.f176649c;
                for (String str3 : cbce.f176647a) {
                    ciuk a = PeerConnection.IceServer.m151192a(str3);
                    a.f191487a = str;
                    a.f191488b = str2;
                    arrayList.add(a.mo86580a());
                }
            }
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aitg", "c", 287, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68409a("Got %d ice servers from tachyon.", arrayList.size());
        } catch (chuw | gid e) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("aitg", "c", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to get ice servers from tachyon.");
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized boolean mo37990b() {
        if (!m57899d()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aitg", "b", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Skipping unregister. We are not registered with tachyon.");
            return false;
        }
        boolean a = mo37996a(this.f69691e);
        this.f69691e = null;
        return a;
    }

    /* renamed from: a */
    public final synchronized boolean mo37986a(ailt ailt) {
        synchronized (this) {
            if (!m57899d()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aitg", "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Skipping receive messages. We are not registered with tachyon.");
                return false;
            }
            this.f69690d = this.f69687a.f69677d;
            bqgy c = bqgy.m112818c();
            try {
                aitl aitl = this.f69690d;
                ClientContext clientContext = this.f69687a.f69674a;
                bxtx bxtx = this.f69691e;
                bxvd da = cbkr.f177440b.mo74144da();
                cbmo b = m57898b(bxtx);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                b.getClass();
                ((cbkr) da.f164949b).f177442a = b;
                cbkr cbkr = (cbkr) da.mo74062i();
                aitf aitf = new aitf(c, ailt);
                if (aitl.f69704c == null) {
                    aitl.f69704c = chtv.m149566a(chtu.SERVER_STREAMING, "google.internal.communications.instantmessaging.v1.Messaging/ReceiveMessages", ciie.m150370a(cbkr.f177440b), ciie.m150370a(cbkx.f177453c));
                }
                aitl.f69706a.mo25555a(aitl.f69704c, clientContext, cbkr, aitf, (long) aitl.f69703b, TimeUnit.MILLISECONDS);
                if (!ahhf.m55777b("TachyonLegacySignalingMessenger.readyToReceiveMessages", c, cfnv.m140757S())) {
                    return false;
                }
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aitg", "a", 244, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Receiving messages from tachyon.");
                return true;
            } catch (chuw | gid e) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("aitg", "a", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Failed to receive messages from tachyon.");
                return false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo37995a(aiss aiss, bxtx bxtx, byte[] bArr) {
        try {
            aitc aitc = this.f69687a;
            aiti aiti = aitc.f69676c;
            ClientContext clientContext = aitc.f69674a;
            bxvd da = cbkk.f177417d.mo74144da();
            cbmo b = m57898b(bxtx);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((cbkk) da.f164949b).f177421c = b;
            bxvd da2 = cbkj.f177405k.mo74144da();
            String uuid = UUID.randomUUID().toString();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbkj cbkj = (cbkj) da2.f164949b;
            uuid.getClass();
            cbkj.f177409c = uuid;
            cbkj.f177410d = cbki.m127937a(6);
            bxtx a = bxtx.m123261a(bArr);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbkj cbkj2 = (cbkj) da2.f164949b;
            a.getClass();
            cbkj2.f177411e = a;
            cbkj2.f177416j = cbkh.m127935a(4);
            cbkj cbkj3 = (cbkj) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbkj3.getClass();
            ((cbkk) da.f164949b).f177420b = cbkj3;
            bxvd da3 = cbma.f177591f.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cbma cbma = (cbma) da3.f164949b;
            "Nearby".getClass();
            cbma.f177595c = "Nearby";
            cbma.f177593a = cipg.m150690a(15);
            String str = aiss.f69653a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            str.getClass();
            ((cbma) da3.f164949b).f177594b = str;
            cbma cbma2 = (cbma) da3.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbma2.getClass();
            ((cbkk) da.f164949b).f177419a = cbma2;
            cbkk cbkk = (cbkk) da.mo74062i();
            if (aiti.f69693c == null) {
                aiti.f69693c = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Messaging/SendMessage", ciie.m150370a(cbkk.f177417d), ciie.m150370a(cbkl.f177422a));
            }
            cbkl cbkl = (cbkl) aiti.f69695a.mo25553a(aiti.f69693c, clientContext, cbkk, (long) aiti.f69692b, TimeUnit.MILLISECONDS);
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aitg", "a", 182, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Sent message to tachyon.");
            return true;
        } catch (chuw | gid e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aitg", "a", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to send message to tachyon.");
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37987a(aiss aiss, byte[] bArr) {
        if (!m57899d()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aitg", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Skipping send message. We are not registered with tachyon.");
            return false;
        }
        return mo37995a(aiss, this.f69691e, bArr);
    }

    /* renamed from: a */
    public final boolean mo37996a(bxtx bxtx) {
        try {
            aitc aitc = this.f69687a;
            aitk aitk = aitc.f69675b;
            ClientContext clientContext = aitc.f69674a;
            bxvd da = cbkb.f177386d.mo74144da();
            cbmo b = m57898b(bxtx);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbkb cbkb = (cbkb) da.f164949b;
            b.getClass();
            cbkb.f177388a = b;
            cbkb.f177390c = 1;
            ((cbkb) da.f164949b).f177389b = 2;
            cbkb cbkb2 = (cbkb) da.mo74062i();
            if (aitk.f69701d == null) {
                aitk.f69701d = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Registration/DeleteAccount", ciie.m150370a(cbkb.f177386d), ciie.m150370a(cbkc.f177391a));
            }
            cbkc cbkc = (cbkc) aitk.f69702a.mo25553a(aitk.f69701d, clientContext, cbkb2, (long) aitk.f69699b, TimeUnit.MILLISECONDS);
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aitg", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unregistered from tachyon.");
            this.f69691e = null;
            m57900e();
            return true;
        } catch (chuw | gid e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aitg", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to unregister from tachyon.");
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37988a(Executor executor) {
        if (!m57899d()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aitg", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Skipping unregister async. We are not registered with tachyon.");
            return false;
        }
        executor.execute(new aitd(this, this.f69691e.mo73775c(0)));
        this.f69691e = null;
        return true;
    }

    /* renamed from: a */
    public final synchronized boolean mo37989a(Executor executor, aiss aiss, byte[] bArr) {
        if (!m57899d()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aitg", "a", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Skipping send message async. We are not registered with tachyon.");
            return false;
        }
        executor.execute(new aite(this, aiss, this.f69691e.mo73775c(0), bArr));
        return true;
    }
}
