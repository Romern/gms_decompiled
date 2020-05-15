package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.walletp2p.model.Contact;

/* renamed from: axkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axkv extends axlx {

    /* renamed from: a */
    private final Contact f96113a;

    /* renamed from: g */
    private final long f96114g;

    /* renamed from: h */
    private final String f96115h;

    /* renamed from: i */
    private final String f96116i;

    /* renamed from: j */
    private final String f96117j;

    /* renamed from: k */
    private final byte[] f96118k;

    public axkv(Context context, int i, Account account, Contact contact, long j, String str, String str2, String str3, byte[] bArr, axls axls, axls axls2) {
        super(context, i, account, axls, axls2);
        this.f96113a = contact;
        this.f96114g = j;
        this.f96115h = str;
        this.f96116i = str2;
        this.f96117j = str3;
        this.f96118k = bArr;
    }

    /* renamed from: a */
    public final void mo53158a() {
        bxvd da = btte.f150329d.mo74144da();
        btrs btrs = (btrs) btrt.f150144e.mo74144da();
        ByteString a = ByteString.m123261a(this.f96118k);
        if (btrs.f164950c) {
            btrs.mo74035c();
            btrs.f164950c = false;
        }
        btrt btrt = (btrt) btrs.f164949b;
        a.getClass();
        btrt.f150146a |= 1;
        btrt.f150147b = a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btte btte = (btte) da.f164949b;
        btrt btrt2 = (btrt) btrs.mo74062i();
        btrt2.getClass();
        btte.f150333c = btrt2;
        btte.f150331a |= 4;
        bxvd da2 = btsh.f150206f.mo74144da();
        bxvd da3 = btsb.f150174d.mo74144da();
        long j = this.f96114g;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        btsb btsb = (btsb) da3.f164949b;
        int i = btsb.f150176a | 1;
        btsb.f150176a = i;
        btsb.f150177b = j;
        String str = this.f96115h;
        str.getClass();
        btsb.f150176a = i | 2;
        btsb.f150178c = str;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btsh btsh = (btsh) da2.f164949b;
        btsb btsb2 = (btsb) da3.mo74062i();
        btsb2.getClass();
        btsh.f150211d = btsb2;
        btsh.f150208a |= 16;
        String str2 = this.f96116i;
        if (str2 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btsh btsh2 = (btsh) da2.f164949b;
            str2.getClass();
            btsh2.f150208a |= 32;
            btsh2.f150212e = str2;
        }
        bxvd da4 = btrw.f150162c.mo74144da();
        String str3 = this.f96117j;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        btrw btrw = (btrw) da4.f164949b;
        str3.getClass();
        btrw.f150164a |= 1;
        btrw.f150165b = str3;
        btrw btrw2 = (btrw) da4.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btsh btsh3 = (btsh) da2.f164949b;
        btrw2.getClass();
        btsh3.f150210c = btrw2;
        btsh3.f150208a |= 4;
        Contact contact = this.f96113a;
        if (contact != null) {
            btsf a2 = axkp.m82676a(contact);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btsh btsh4 = (btsh) da2.f164949b;
            a2.getClass();
            btsh4.f150209b = a2;
            btsh4.f150208a |= 2;
        } else {
            bxvd da5 = btsf.f150195c.mo74144da();
            String a3 = axeo.m82423a(this.f96166b, this.f96170f);
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            btsf btsf = (btsf) da5.f164949b;
            a3.getClass();
            btsf.f150197a = 4;
            btsf.f150198b = a3;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btsh btsh5 = (btsh) da2.f164949b;
            btsf btsf2 = (btsf) da5.mo74062i();
            btsf2.getClass();
            btsh5.f150209b = btsf2;
            btsh5.f150208a |= 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btte btte2 = (btte) da.f164949b;
        btsh btsh6 = (btsh) da2.mo74062i();
        btsh6.getClass();
        btte2.f150332b = btsh6;
        btte2.f150331a |= 1;
        bttf bttf = (bttf) axmo.m82727a("b/fundstransferv2/getTransactionDurationEstimate", this.f96167c, da.mo74062i(), bttf.f150335e, this.f96170f).get();
        if ((bttf.f150337a & 4) != 0) {
            bzvu bzvu = bttf.f150340d;
            if (bzvu == null) {
                bzvu = bzvu.f171552g;
            }
            mo53235a(bzvu);
        } else if (!bttf.f150338b.isEmpty()) {
            mo53236a(new axio(true, bttf.f150338b, bttf.f150339c));
        } else {
            mo53236a(new axio(false, null, null));
        }
    }
}
