package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.TimeUnit;

/* renamed from: whx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whx extends whz {

    /* renamed from: b */
    private final wgj f50690b;

    /* renamed from: c */
    private final Contact f50691c;

    /* renamed from: d */
    private final boolean f50692d;

    /* renamed from: e */
    private final String f50693e;

    /* renamed from: f */
    private final wgh f50694f;

    public whx(Context context, wgh wgh, wgj wgj, Contact contact, boolean z, String str) {
        super(context);
        this.f50690b = wgj;
        this.f50691c = contact;
        this.f50692d = z;
        this.f50693e = str;
        this.f50694f = wgh;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i;
        if (!this.f50692d) {
            i = 4;
        } else {
            i = 3;
        }
        try {
            Contact contact = this.f50691c;
            String str = this.f50693e;
            bxvd da = brdk.f142515l.mo74144da();
            bxvd da2 = brdm.f142533d.mo74144da();
            String str2 = contact.f31282a;
            if (str2 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                brdm brdm = (brdm) da2.f164949b;
                str2.getClass();
                brdm.f142535a |= 2;
                brdm.f142537c = str2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brdk brdk = (brdk) da.f164949b;
            brdm brdm2 = (brdm) da2.mo74062i();
            brdm2.getClass();
            brdk.f142519c = brdm2;
            brdk.f142517a |= 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brdk brdk2 = (brdk) da.f164949b;
            brdk2.f142525i = i - 1;
            brdk2.f142517a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            String str3 = contact.f31287f;
            String valueOf = String.valueOf(da);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + String.valueOf(str3).length());
            sb.append("Invitation proto: ");
            sb.append(valueOf);
            sb.append("inviteId: ");
            sb.append(str3);
            sb.toString();
            sbw sbw = wgn.f50624a;
            bxvd da3 = brek.f142665e.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            brek brek = (brek) da3.f164949b;
            brdk brdk3 = (brdk) da.mo74062i();
            brdk3.getClass();
            brek.f142670d = brdk3;
            brek.f142667a = 4 | brek.f142667a;
            brak a = wgy.m41937a(getContext(), this.f50690b, this.f50694f);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            brek brek2 = (brek) da3.f164949b;
            a.getClass();
            brek2.f142668b = a;
            int i2 = brek2.f142667a | 1;
            brek2.f142667a = i2;
            if (str3 != null) {
                str3.getClass();
                brek2.f142667a = i2 | 2;
                brek2.f142669c = str3;
            }
            try {
                wih a2 = whc.m41943a();
                ClientContext a3 = whc.m41942a(str);
                brek brek3 = (brek) da3.mo74062i();
                if (wih.f50722n == null) {
                    wih.f50722n = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/UpdateInvitation", ciie.m150370a(brek.f142665e), ciie.m150370a(brel.f142672b));
                }
                brel brel = (brel) a2.f50732a.mo25553a(wih.f50722n, a3, brek3, (long) wih.f50710b, TimeUnit.MILLISECONDS);
                wgj wgj = this.f50690b;
                bral bral = brel.f142674a;
                if (bral == null) {
                    bral = bral.f142158c;
                }
                wgy.m41938a(wgj, bral);
                return brel;
            } catch (chuw e) {
                e = e;
                throw new wgx(e.getMessage(), e);
            } catch (gid e2) {
                e = e2;
                throw new wgx(e.getMessage(), e);
            }
        } catch (wgx e3) {
            String valueOf2 = String.valueOf(e3.getMessage());
            if (valueOf2.length() == 0) {
                new String("Error updatingInvitationStatus: ");
            } else {
                "Error updatingInvitationStatus: ".concat(valueOf2);
            }
            sbw sbw2 = wgn.f50624a;
            return null;
        }
    }
}
