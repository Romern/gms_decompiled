package p000;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyResponse;
import java.util.Arrays;
import java.util.List;

/* renamed from: axko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axko extends axeq {

    /* renamed from: e */
    private final ClaimMoneyRequest f96082e;

    public axko(ClaimMoneyRequest claimMoneyRequest, Account account, Bundle bundle, axnw axnw) {
        super("ClaimMoneyOperation", claimMoneyRequest, account, bundle, axnw);
        this.f96082e = claimMoneyRequest;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((axnw) this.f95864c).mo53065a((ClaimMoneyResponse) null, status);
    }

    /* renamed from: b */
    public final void mo53072b(Context context) {
        KeyguardManager keyguardManager;
        btrr[] btrrArr;
        bxvd da = btso.f150239h.mo74144da();
        bxvd da2 = btsi.f150214c.mo74144da();
        String str = this.f96082e.f110791a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btsi btsi = (btsi) da2.f164949b;
        str.getClass();
        btsi.f150216a |= 1;
        btsi.f150217b = str;
        btsi btsi2 = (btsi) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btso btso = (btso) da.f164949b;
        btsi2.getClass();
        btso.f150242b = btsi2;
        btso.f150241a |= 1;
        if (this.f96082e.f110795e != null) {
            btrs btrs = (btrs) btrt.f150144e.mo74144da();
            bxtx a = bxtx.m123261a(this.f96082e.f110795e);
            if (btrs.f164950c) {
                btrs.mo74035c();
                btrs.f164950c = false;
            }
            btrt btrt = (btrt) btrs.f164949b;
            a.getClass();
            int i = btrt.f150146a | 1;
            btrt.f150146a = i;
            btrt.f150147b = a;
            boolean z = this.f96082e.f110797g;
            btrt.f150146a = i | 2;
            btrt.f150148c = z;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btso btso2 = (btso) da.f164949b;
            btrt btrt2 = (btrt) btrs.mo74062i();
            btrt2.getClass();
            btso2.f150247g = btrt2;
            btso2.f150241a |= 32;
        }
        bxvd da3 = btrw.f150162c.mo74144da();
        String str2 = this.f96082e.f110792b;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        btrw btrw = (btrw) da3.f164949b;
        str2.getClass();
        btrw.f150164a |= 1;
        btrw.f150165b = str2;
        btrw btrw2 = (btrw) da3.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btso btso3 = (btso) da.f164949b;
        btrw2.getClass();
        btso3.f150243c = btrw2;
        btso3.f150241a |= 2;
        if (context != null) {
            keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        } else {
            keyguardManager = null;
        }
        if (keyguardManager != null && keyguardManager.isKeyguardSecure()) {
            int i2 = Build.VERSION.SDK_INT;
            btrrArr = new btrr[]{btrr.IDV_CHALLENGE, btrr.CVN_CHALLENGE, btrr.DEVICE_LOCK_CHALLENGE, btrr.PURCHASE_MANAGER_CHALLENGE};
        } else {
            btrrArr = new btrr[]{btrr.IDV_CHALLENGE, btrr.CVN_CHALLENGE, btrr.PURCHASE_MANAGER_CHALLENGE};
        }
        List<btrr> asList = Arrays.asList(btrrArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btso btso4 = (btso) da.f164949b;
        if (!btso4.f150244d.mo73666a()) {
            btso4.f150244d = bxvk.m124019a(btso4.f150244d);
        }
        for (btrr btrr : asList) {
            btso4.f150244d.mo74153d(btrr.f150143g);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btso btso5 = (btso) da.f164949b;
        btso5.f150245e = 1;
        btso5.f150241a = 4 | btso5.f150241a;
        ClaimMoneyRequest claimMoneyRequest = (ClaimMoneyRequest) this.f95865d;
        if (!(claimMoneyRequest.f110793c == 0 && claimMoneyRequest.f110794d == 0 && claimMoneyRequest.f110796f == null)) {
            bxvd da4 = btsg.f150200e.mo74144da();
            long j = ((ClaimMoneyRequest) this.f95865d).f110793c;
            if (j != 0) {
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                btsg btsg = (btsg) da4.f164949b;
                btsg.f150202a = 1 | btsg.f150202a;
                btsg.f150203b = j;
            }
            long j2 = ((ClaimMoneyRequest) this.f95865d).f110794d;
            if (j2 != 0) {
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                btsg btsg2 = (btsg) da4.f164949b;
                btsg2.f150202a |= 2;
                btsg2.f150204c = j2;
            }
            byte[] bArr = ((ClaimMoneyRequest) this.f95865d).f110796f;
            if (bArr != null) {
                bxtx a2 = bxtx.m123261a(bArr);
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                btsg btsg3 = (btsg) da4.f164949b;
                a2.getClass();
                btsg3.f150202a |= 8;
                btsg3.f150205d = a2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btso btso6 = (btso) da.f164949b;
            btsg btsg4 = (btsg) da4.mo74062i();
            btsg4.getClass();
            btso6.f150246f = btsg4;
            btso6.f150241a |= 8;
        }
        btsp btsp = (btsp) axmo.m82727a("b/fundstransferv2/claimSendTransaction", this.f95862a, da.mo74062i(), btsp.f150248d, mo53071a()).get();
        int i3 = btsp.f150250a;
        if ((i3 & 1) != 0) {
            axnw axnw = (axnw) this.f95864c;
            bzvu bzvu = btsp.f150251b;
            if (bzvu == null) {
                bzvu = bzvu.f171552g;
            }
            ClaimMoneyResponse claimMoneyResponse = new ClaimMoneyResponse(axep.m82424a(context, bzvu), null);
            bzvu bzvu2 = btsp.f150251b;
            if (bzvu2 == null) {
                bzvu2 = bzvu.f171552g;
            }
            axnw.mo53065a(claimMoneyResponse, new Status(axks.m82680a(bttb.m117113a(bzvu2.f171556c))));
            return;
        }
        ((axnw) this.f95864c).mo53065a(new ClaimMoneyResponse(null, (2 & i3) != 0 ? btsp.f150252c : null), Status.f30107a);
    }
}
