package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenResponse;

/* renamed from: axkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axkw extends axeq {

    /* renamed from: e */
    private final ValidateDraftTokenRequest f96119e;

    public axkw(ValidateDraftTokenRequest validateDraftTokenRequest, Account account, Bundle bundle, axnw axnw) {
        super("ValidateDraftTokenOperation", validateDraftTokenRequest, account, bundle, axnw);
        this.f96119e = validateDraftTokenRequest;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((axnw) this.f95864c).mo53067a((ValidateDraftTokenResponse) null, status);
    }

    /* renamed from: b */
    public final void mo53072b(Context context) {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        bxvd da = bttc.f150319d.mo74144da();
        String str4 = this.f96119e.f110847b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bttc bttc = (bttc) da.f164949b;
        str4.getClass();
        int i = bttc.f150321a | 1;
        bttc.f150321a = i;
        bttc.f150322b = str4;
        bttc.f150323c = (this.f96119e.f110846a != 0 ? 3 : 2) - 1;
        bttc.f150321a = i | 2;
        bttd bttd = (bttd) axmo.m82727a("b/fundstransferv2/getDraftTransaction", this.f95862a, (bttc) da.mo74062i(), bttd.f150324d, mo53071a()).get();
        int i2 = bttd.f150326a;
        if ((i2 & 1) != 0) {
            axnw axnw = (axnw) this.f95864c;
            bzvu bzvu = bttd.f150327b;
            if (bzvu == null) {
                bzvu = bzvu.f171552g;
            }
            ValidateDraftTokenResponse validateDraftTokenResponse = new ValidateDraftTokenResponse(-1, null, null, null, null, null, axep.m82424a(context, bzvu), null);
            bzvu bzvu2 = bttd.f150327b;
            if (bzvu2 == null) {
                bzvu2 = bzvu.f171552g;
            }
            axnw.mo53067a(validateDraftTokenResponse, new Status(axks.m82680a(bttb.m117113a(bzvu2.f171556c))));
        } else if ((i2 & 2) != 0) {
            axnw axnw2 = (axnw) this.f95864c;
            btsz btsz = bttd.f150328c;
            if (btsz == null) {
                btsz = btsz.f150308i;
            }
            btsb btsb = btsz.f150311b;
            if (btsb == null) {
                btsb = btsb.f150174d;
            }
            long j = btsb.f150177b;
            btsz btsz2 = bttd.f150328c;
            if (btsz2 == null) {
                btsz2 = btsz.f150308i;
            }
            btsb btsb2 = btsz2.f150311b;
            if (btsb2 == null) {
                btsb2 = btsb.f150174d;
            }
            String str5 = btsb2.f150178c;
            btsz btsz3 = bttd.f150328c;
            if (btsz3 == null) {
                btsz3 = btsz.f150308i;
            }
            if ((btsz3.f150310a & 2) != 0) {
                btsz btsz4 = bttd.f150328c;
                if (btsz4 == null) {
                    btsz4 = btsz.f150308i;
                }
                btrw btrw = btsz4.f150312c;
                if (btrw == null) {
                    btrw = btrw.f150162c;
                }
                str = btrw.f150165b;
            } else {
                str = null;
            }
            btsz btsz5 = bttd.f150328c;
            if (btsz5 == null) {
                btsz5 = btsz.f150308i;
            }
            String str6 = btsz5.f150313d;
            btsz btsz6 = bttd.f150328c;
            if (btsz6 == null) {
                btsz6 = btsz.f150308i;
            }
            if ((btsz6.f150310a & 16) != 0) {
                btsz btsz7 = bttd.f150328c;
                if (btsz7 == null) {
                    btsz7 = btsz.f150308i;
                }
                btsi btsi = btsz7.f150315f;
                if (btsi == null) {
                    btsi = btsi.f150214c;
                }
                str2 = btsi.f150217b;
            } else {
                str2 = null;
            }
            btsz btsz8 = bttd.f150328c;
            if (btsz8 == null) {
                btsz8 = btsz.f150308i;
            }
            if ((btsz8.f150310a & 8) != 0) {
                btsz btsz9 = bttd.f150328c;
                if (btsz9 == null) {
                    btsz9 = btsz.f150308i;
                }
                str3 = btsz9.f150314e;
            } else {
                str3 = null;
            }
            btsz btsz10 = bttd.f150328c;
            if (btsz10 == null) {
                btsz10 = btsz.f150308i;
            }
            if ((btsz10.f150310a & 128) != 0) {
                btsz btsz11 = bttd.f150328c;
                if (btsz11 == null) {
                    btsz11 = btsz.f150308i;
                }
                btrt btrt = btsz11.f150317h;
                if (btrt == null) {
                    btrt = btrt.f150144e;
                }
                bArr = btrt.f150147b.mo73780k();
            } else {
                bArr = null;
            }
            axnw2.mo53067a(new ValidateDraftTokenResponse(j, str5, str, str6, str2, str3, null, bArr), Status.f30107a);
        } else {
            mo6503a(Status.f30109c);
        }
    }
}
