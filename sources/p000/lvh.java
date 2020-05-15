package p000;

import android.accounts.Account;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.backup.base.SetBackupAccountChimeraActivity;
import com.google.android.gms.common.internal.ClientContext;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: lvh */
public final /* synthetic */ class lvh implements Runnable {

    /* renamed from: a */
    private final SetBackupAccountChimeraActivity f33034a;

    /* renamed from: b */
    private final Account f33035b;

    /* renamed from: c */
    private final Activity f33036c;

    /* renamed from: d */
    private final lvj f33037d;

    public lvh(SetBackupAccountChimeraActivity setBackupAccountChimeraActivity, Account account, Activity activity, lvj lvj) {
        this.f33034a = setBackupAccountChimeraActivity;
        this.f33035b = account;
        this.f33036c = activity;
        this.f33037d = lvj;
    }

    public final void run() {
        byte[] bArr;
        SetBackupAccountChimeraActivity setBackupAccountChimeraActivity = this.f33034a;
        Account account = this.f33035b;
        Activity activity = this.f33036c;
        lvj lvj = this.f33037d;
        lvm lvm = setBackupAccountChimeraActivity.f29007d;
        try {
            bxvd da = btde.f148384e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btde) da.f164949b).f148386a = btee.m116473a(4);
            String c = gie.m13198c(lvm.f33052c, account.name);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            c.getClass();
            ((btde) da.f164949b).f148387b = c;
            bxvd da2 = bted.f148495c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bted bted = (bted) da2.f164949b;
            bted.f148497a = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
            bted.f148498b = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bted bted2 = (bted) da2.mo74062i();
            bted2.getClass();
            ((btde) da.f164949b).f148388c = bted2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btde) da.f164949b).f148390f = true;
            btde btde = (btde) da.mo74062i();
            String i = ccoa.f179599a.mo6606a().mo76518i();
            if (TextUtils.isEmpty(i)) {
                i = "https://www.googleapis.com/auth/peopleapi.legacy.readwrite";
            }
            ClientContext clientContext = new ClientContext();
            clientContext.f30212b = Process.myUid();
            clientContext.f30214d = account;
            clientContext.f30213c = account;
            clientContext.f30215e = lvm.f33052c.getPackageName();
            clientContext.f30216f = lvm.f33052c.getPackageName();
            clientContext.mo17806d(i);
            clientContext.mo17798a("social_client_app_id", "80");
            if (lvm.f33050a.mo19637a(2)) {
                lvm.f33050a.mo25409a("getPersonPhotoEncoded request = %s clientContext = %s", btde, clientContext);
            }
            lvl lvl = lvm.f33051b;
            if (lvl.f33048b == null) {
                lvl.f33048b = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/GetPersonPhotoEncoded", ciie.m150370a(btde.f148384e), ciie.m150370a(btdd.f148380c));
            }
            btdd btdd = (btdd) lvl.f33049a.mo25553a(lvl.f33048b, clientContext, btde, 10000, TimeUnit.MILLISECONDS);
            if (lvm.f33050a.mo19637a(2)) {
                lvn lvn = lvm.f33050a;
                Object[] objArr = new Object[2];
                btdc a = btdc.m116444a(btdd.f148382a);
                if (a == null) {
                    a = btdc.UNRECOGNIZED;
                }
                objArr[0] = a;
                objArr[1] = Integer.valueOf(btdd.f148383b.mo73744a());
                lvn.mo25409a("Got photo with format=%s size=%d", objArr);
            }
            bArr = btdd.f148383b.mo73780k();
        } catch (chuw e) {
            if (e.f189236a.f189233s.equals(chus.NOT_FOUND)) {
                lvm.f33050a.mo25414c("Profile image was not found for account %s", account.name);
                bArr = null;
            } else {
                lvm.f33050a.mo25417e("Error making gRPC request.", e, new Object[0]);
                bArr = null;
            }
        } catch (gid | IOException e2) {
            lvm.f33050a.mo25417e("Error making gRPC request.", e2, new Object[0]);
            bArr = null;
        }
        if (bArr != null) {
            setBackupAccountChimeraActivity.f29006c.put(account.name, bArr);
            lvj.getClass();
            activity.runOnUiThread(new lvi(lvj));
        }
    }
}
