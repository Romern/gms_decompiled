package p000;

import android.content.Intent;
import android.util.Log;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.wallet.p084ow.RootChimeraActivity;

/* renamed from: awnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awnx extends awpc {

    /* renamed from: a */
    final /* synthetic */ RootChimeraActivity f94678a;

    public awnx(RootChimeraActivity rootChimeraActivity) {
        this.f94678a = rootChimeraActivity;
    }

    /* renamed from: a */
    public final void mo51894a() {
        this.f94678a.f110298p = false;
        this.f94678a.mo59956g();
    }

    /* renamed from: b */
    public final void mo51897b() {
        RootChimeraActivity rootChimeraActivity = this.f94678a;
        String str = RootChimeraActivity.f110284b;
        rootChimeraActivity.mo59952a(8);
    }

    /* renamed from: c */
    public final void mo51898c() {
        RootChimeraActivity rootChimeraActivity = this.f94678a;
        String str = RootChimeraActivity.f110284b;
        rootChimeraActivity.mo59952a(411);
    }

    /* renamed from: d */
    public final void mo52349d() {
        RootChimeraActivity rootChimeraActivity = this.f94678a;
        String str = RootChimeraActivity.f110284b;
        rootChimeraActivity.mo59954b(2);
        this.f94678a.f110298p = false;
        RootChimeraActivity rootChimeraActivity2 = this.f94678a;
        if (rootChimeraActivity2.f110286d) {
            rootChimeraActivity2.f110285c = true;
            rootChimeraActivity2.f110288f.setVisibility(8);
            this.f94678a.f110289g.setVisibility(0);
            this.f94678a.f110287e.mo59847a(true);
            return;
        }
        rootChimeraActivity2.mo59953a(-1, new Intent());
    }

    /* renamed from: a */
    public final void mo52348a(bltt bltt) {
        RootChimeraActivity rootChimeraActivity = this.f94678a;
        if ((bltt.f127738a & 4) != 0) {
            blts blts = bltt.f127739b;
            if (blts == null) {
                blts = blts.f127731c;
            }
            blts.f127733a.isEmpty();
            blts.f127734b.isEmpty();
        }
        int i = 8;
        if ((bltt.f127738a & 8) != 0) {
            bycg bycg = bltt.f127740c;
            if (bycg == null) {
                bycg = bycg.f165641e;
            }
            int a = byce.m124649a(bycg.f165644b);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            String valueOf = String.valueOf(Integer.toString(a - 1));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Wallet error code: ");
            sb.append(valueOf);
            Log.e("OwServiceUtils", sb.toString());
            if (!bycg.f165645c.isEmpty()) {
                String valueOf2 = String.valueOf(bycg.f165645c);
                Log.e("OwServiceUtils", valueOf2.length() == 0 ? new String("Wallet error detail: ") : "Wallet error detail: ".concat(valueOf2));
            }
            if ((bycg.f165643a & 4) != 0) {
                bycf bycf = bycg.f165646d;
                if (bycf == null) {
                    bycf = bycf.f165637b;
                }
                if (!bycf.f165639a.isEmpty()) {
                    String valueOf3 = String.valueOf(bycf.f165639a);
                    if (valueOf3.length() == 0) {
                        new String("Wallet error user message title: ");
                    } else {
                        "Wallet error user message title: ".concat(valueOf3);
                    }
                }
            }
            int a2 = byce.m124649a(bycg.f165644b);
            if (a2 != 0) {
                i2 = a2;
            }
            int i3 = i2 - 1;
            if (i3 == 12) {
                i = 409;
            } else if (i3 == 51) {
                i = 405;
            } else if (i3 == 61) {
                i = ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED;
            } else if (i3 == 21 || i3 == 22) {
                i = 408;
            } else {
                if (i3 != 31) {
                    if (i3 != 32) {
                        switch (i3) {
                            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                i = 412;
                                break;
                        }
                    } else {
                        i = 406;
                    }
                }
                i = 404;
            }
        }
        String str = RootChimeraActivity.f110284b;
        rootChimeraActivity.mo59952a(i);
    }
}
