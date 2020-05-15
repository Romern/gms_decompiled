package p000;

import android.accounts.Account;
import android.os.Build;
import com.google.android.gms.auth.authzen.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.UpdateDeviceInfoRequestEntity;
import com.google.android.gms.common.internal.ClientContext;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: ijg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ijg {

    /* renamed from: h */
    private static final sek f21097h = new sek("Enroller");

    /* renamed from: a */
    private final Account f21098a;

    /* renamed from: b */
    private final ige f21099b;

    /* renamed from: c */
    private final ijh f21100c;

    /* renamed from: d */
    private final asfb f21101d;

    /* renamed from: e */
    private asfa f21102e;

    /* renamed from: f */
    private final ihn f21103f;

    /* renamed from: g */
    private final ijd f21104g;

    protected ijg(Account account, ige ige, ijh ijh, asfb asfb, ijd ijd, shj shj) {
        this.f21098a = account;
        this.f21099b = ige;
        this.f21100c = ijh;
        this.f21101d = asfb;
        asfb.mo49115a(false);
        this.f21104g = ijd;
        this.f21103f = new ihn(shj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015f, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        p000.ijg.f21097h.mo25417e("error sending update to server", r14, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016b, code lost:
        if (r0 == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016d, code lost:
        r14 = r13.f21101d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0177, code lost:
        r13.f21101d.mo49120c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017d, code lost:
        r14 = r13.f21102e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017f, code lost:
        if (r14 != null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0181, code lost:
        r14.mo49109a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0184, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d7, code lost:
        if (r0 == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d9, code lost:
        r15 = r13.f21101d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e3, code lost:
        r13.f21101d.mo49120c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e9, code lost:
        r15 = r13.f21102e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01eb, code lost:
        if (r15 != null) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ed, code lost:
        r15.mo49109a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f0, code lost:
        throw r14;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x002c, B:30:0x00f5] */
    /* renamed from: a */
    public final boolean mo13061a(int i, int i2) {
        boolean booleanValue = ((Boolean) igt.f20975y.mo58455c()).booleanValue();
        if (!booleanValue) {
            this.f21101d.mo49111a(30000);
        } else {
            this.f21102e = this.f21101d.mo49116b("update device info", 30000);
        }
        try {
            String a = this.f21099b.mo12989a(this.f21098a, 2);
            if (a == null) {
                f21097h.mo25416d("Could not get auth token. Update failed", new Object[0]);
                if (!booleanValue) {
                    asfb asfb = this.f21101d;
                    if (asfb != null && asfb.mo49124e()) {
                        this.f21101d.mo49120c();
                    }
                } else {
                    asfa asfa = this.f21102e;
                    if (asfa != null) {
                        asfa.mo49109a();
                    }
                }
                return false;
            }
            bxvd a2 = bynz.f167151u.mo74141a(this.f21104g.mo13058a());
            if (a2.f164950c) {
                a2.mo74035c();
                a2.f164950c = false;
            }
            bynz bynz = (bynz) a2.f164949b;
            a.getClass();
            bynz.f167153a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            bynz.f167172t = a;
            bynz bynz2 = (bynz) a2.mo74062i();
            try {
                ijh ijh = this.f21100c;
                byte[] a3 = ifj.m15369a(ijh.f21105a, bysa.DEVICE_INFO_UPDATE, bynz2.mo73642k(), ijh.f21106b);
                iib iib = new iib();
                iib.f21050d = "gcmV1";
                iib.f21052f.add(5);
                iib.f21049c = i;
                iib.f21052f.add(4);
                iib.f21051e = i2;
                iib.f21052f.add(6);
                iib.f21048b = sqd.m35972d(a3);
                iib.f21052f.add(3);
                ijd ijd = this.f21104g;
                ihj ihj = new ihj();
                ihj.mo13014a((long) Build.VERSION.SDK_INT);
                ihj.mo13015a(ijd.f21089a.getPackageName());
                ihj.mo13016b();
                ihj.mo13017b("android");
                iib.f21047a = (DeviceClassifierEntity) ihj.mo13013a();
                iib.f21052f.add(2);
                ihn ihn = this.f21103f;
                ijh ijh2 = this.f21100c;
                int i3 = ijh2.f21105a.getApplicationInfo().uid;
                String str = ijh2.f21106b.name;
                String str2 = ijh2.f21106b.name;
                String packageName = ijh2.f21105a.getPackageName();
                ClientContext clientContext = new ClientContext(i3, str, str2, packageName, packageName);
                clientContext.mo17806d(igi.m15411b());
                clientContext.mo17798a("auth_token", a);
                ihn.f21029a.mo25539a(clientContext, 1, new StringBuilder("enrollment/updatedeviceinfo").toString(), new UpdateDeviceInfoRequestEntity(iib.f21052f, iib.f21047a, iib.f21048b, iib.f21049c, iib.f21050d, iib.f21051e));
                if (!booleanValue) {
                    asfb asfb2 = this.f21101d;
                    if (asfb2 != null && asfb2.mo49124e()) {
                        this.f21101d.mo49120c();
                    }
                } else {
                    asfa asfa2 = this.f21102e;
                    if (asfa2 != null) {
                        asfa2.mo49109a();
                    }
                }
                return true;
            } catch (InterruptedException | InvalidKeyException | NoSuchAlgorithmException | ExecutionException | TimeoutException e) {
                f21097h.mo25417e("error encrypting message", e, new Object[0]);
                if (!booleanValue) {
                    asfb asfb3 = this.f21101d;
                    if (asfb3 != null && asfb3.mo49124e()) {
                        this.f21101d.mo49120c();
                    }
                } else {
                    asfa asfa3 = this.f21102e;
                    if (asfa3 != null) {
                        asfa3.mo49109a();
                    }
                }
                return false;
            }
        } catch (gid e2) {
            f21097h.mo25416d("Credentials invalid. Update failed", new Object[0]);
            if (!booleanValue) {
                asfb asfb4 = this.f21101d;
                if (asfb4 != null && asfb4.mo49124e()) {
                    this.f21101d.mo49120c();
                }
            } else {
                asfa asfa4 = this.f21102e;
                if (asfa4 != null) {
                    asfa4.mo49109a();
                }
            }
            return false;
        }
    }
}
