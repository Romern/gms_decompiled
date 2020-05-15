package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.walletp2p.model.Contact;

/* renamed from: axkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axkr extends axlx {

    /* renamed from: a */
    private final btsb f96084a;

    /* renamed from: g */
    private final String f96085g;

    /* renamed from: h */
    private final byte[] f96086h;

    /* renamed from: i */
    private final Contact f96087i;

    /* renamed from: j */
    private final String f96088j;

    public axkr(Context context, int i, Account account, btsb btsb, String str, byte[] bArr, Contact contact, String str2, axls axls, axls axls2) {
        super(context, i, account, axls, axls2);
        this.f96087i = contact;
        this.f96084a = btsb;
        this.f96088j = str2;
        this.f96085g = str;
        this.f96086h = bArr;
    }

    /* renamed from: a */
    public final void mo53158a() {
        if (!chkv.m148903b()) {
            mo53236a(btsj.f150218c);
            return;
        }
        bxvd da = btsh.f150206f.mo74144da();
        btsb btsb = this.f96084a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btsh btsh = (btsh) da.f164949b;
        btsb.getClass();
        btsh.f150211d = btsb;
        btsh.f150208a |= 16;
        bxvd da2 = btrw.f150162c.mo74144da();
        String str = this.f96085g;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btrw btrw = (btrw) da2.f164949b;
        str.getClass();
        btrw.f150164a |= 1;
        btrw.f150165b = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btsh btsh2 = (btsh) da.f164949b;
        btrw btrw2 = (btrw) da2.mo74062i();
        btrw2.getClass();
        btsh2.f150210c = btrw2;
        btsh2.f150208a |= 4;
        if (!TextUtils.isEmpty(this.f96088j)) {
            String str2 = this.f96088j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btsh btsh3 = (btsh) da.f164949b;
            str2.getClass();
            btsh3.f150208a |= 32;
            btsh3.f150212e = str2;
        }
        Contact contact = this.f96087i;
        if (contact == null) {
            bxvd da3 = btsf.f150195c.mo74144da();
            String a = axeo.m82423a(this.f96166b, this.f96170f);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            btsf btsf = (btsf) da3.f164949b;
            a.getClass();
            btsf.f150197a = 4;
            btsf.f150198b = a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btsh btsh4 = (btsh) da.f164949b;
            btsf btsf2 = (btsf) da3.mo74062i();
            btsf2.getClass();
            btsh4.f150209b = btsf2;
            btsh4.f150208a |= 2;
        } else {
            btsf a2 = axkp.m82676a(contact);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btsh btsh5 = (btsh) da.f164949b;
            a2.getClass();
            btsh5.f150209b = a2;
            btsh5.f150208a |= 2;
        }
        btrs btrs = (btrs) btrt.f150144e.mo74144da();
        bxtx a3 = bxtx.m123261a(this.f96086h);
        if (btrs.f164950c) {
            btrs.mo74035c();
            btrs.f164950c = false;
        }
        btrt btrt = (btrt) btrs.f164949b;
        a3.getClass();
        btrt.f150146a |= 1;
        btrt.f150147b = a3;
        btrt btrt2 = (btrt) btrs.mo74062i();
        btsg btsg = btsg.f150200e;
        bxvd da4 = btsl.f150229d.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        btsh btsh6 = (btsh) da.mo74062i();
        btsh6.getClass();
        ((btsl) da4.f164949b).f150231a = btsh6;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        btsl btsl = (btsl) da4.f164949b;
        btrt2.getClass();
        btsl.f150233c = btrt2;
        btsg.getClass();
        btsl.f150232b = btsg;
        btsj btsj = ((btsm) axmo.m82727a("b/evaluation/evaluateTransaction", this.f96167c, (btsl) da4.mo74062i(), btsm.f150235b, this.f96170f).get()).f150237a;
        if (btsj == null) {
            btsj = btsj.f150218c;
        }
        mo53236a(btsj);
    }
}
