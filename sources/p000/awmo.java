package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.analytics.events.OrchestrationApiEvent;
import java.io.File;

/* renamed from: awmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awmo extends awpc {

    /* renamed from: a */
    final /* synthetic */ awmq f94620a;

    public awmo(awmq awmq) {
        this.f94620a = awmq;
    }

    /* renamed from: a */
    public final void mo51894a() {
        Activity activity = this.f94620a.getActivity();
        awmq awmq = this.f94620a;
        int i = awmq.f94621l;
        OrchestrationApiEvent.m93817a(activity, 4, null, null, awmq.f95359C);
        this.f94620a.mo52898h(21);
        this.f94620a.mo52874ag();
        axaj axaj = (axaj) this.f94620a.mo52884b(10, axaj.class);
        if ((this.f94620a.f95366J instanceof bmqu) && axaj != null) {
            axaj.mo52939a(1);
        }
    }

    /* renamed from: b */
    public final void mo51897b() {
        Activity activity = this.f94620a.getActivity();
        awmq awmq = this.f94620a;
        int i = awmq.f94621l;
        OrchestrationApiEvent.m93817a(activity, 6, null, null, awmq.f95359C);
        this.f94620a.mo52898h(20);
        this.f94620a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        Activity activity = this.f94620a.getActivity();
        awmq awmq = this.f94620a;
        int i = awmq.f94621l;
        OrchestrationApiEvent.m93817a(activity, 5, null, null, awmq.f95359C);
        this.f94620a.mo52898h(22);
        this.f94620a.mo52897g(-1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmav, boolean, boolean):void
     arg types: [bmav, int, int]
     candidates:
      awmq.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awmq.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzg.a(awyy, int, long):void
      awzg.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
      awzk.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzk.a(long, int, int):void
      awzk.a(awyy, int, long):void
      awzk.a(bmnr, android.view.ViewGroup, boolean):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int, int):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
      awzk.a(java.util.List, android.view.ViewGroup, boolean):void
      bkbr.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awzk.a(bmav, boolean, boolean):void */
    /* renamed from: a */
    public final void mo52273a(bmqv bmqv) {
        awmq awmq = this.f94620a;
        bmav bmav = bmqv.f130440b;
        if (bmav == null) {
            bmav = bmav.f128500h;
        }
        int i = awmq.f94621l;
        awmq.mo52853a(bmav, (bmaq) null);
        axaj axaj = (axaj) this.f94620a.mo52884b(10, axaj.class);
        if (axaj != null) {
            int i2 = 2;
            if ((bmqv.f130439a & 1) != 0) {
                bmav bmav2 = bmqv.f130440b;
                if (bmav2 == null) {
                    bmav2 = bmav.f128500h;
                }
                int a = bmau.m107847a(bmav2.f128504c);
                if (a != 0) {
                    i2 = a != 2 ? 1 : 5;
                } else {
                    i2 = 1;
                }
            }
            byte[] k = bmqv.f130441c.mo73780k();
            File cacheDir = axaj.getActivity().getCacheDir();
            String str = File.separator;
            String str2 = axaj.f95518b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
            sb.append("wallet_document_cache");
            sb.append(str);
            sb.append(str2);
            new File(cacheDir, sb.toString()).delete();
            if (k.length <= 0) {
                axaj.f95517a = 4;
                axaj.mo51905a(1, Bundle.EMPTY);
            } else {
                axaj.f95520d = k;
                axaj.f95517a = 3;
            }
            axaj.mo52939a(i2);
        }
        if ((bmqv.f130439a & 1) != 0) {
            this.f94620a.mo52808n(true);
            awmq awmq2 = this.f94620a;
            bmav bmav3 = bmqv.f130440b;
            if (bmav3 == null) {
                bmav3 = bmav.f128500h;
            }
            awmq2.mo52856a(bmav3, false, true);
            awmq awmq3 = this.f94620a;
            awmq3.f94626e = false;
            awmq3.f94627f = null;
            awmq3.f94628g = null;
            return;
        }
        awmq awmq4 = this.f94620a;
        if (awmq4.f94626e) {
            awmq4.mo52278a(awmq4.f94627f, awmq4.f94628g);
        }
    }

    /* renamed from: a */
    public final void mo52274a(bmrk bmrk) {
        bmrl bmrl;
        bmav bmav;
        bmaq bmaq;
        bmag bmag;
        awmq awmq = this.f94620a;
        if ((bmrk.f130511a & 8) != 0) {
            bmrl = bmrk.f130515e;
            if (bmrl == null) {
                bmrl = bmrl.f130520u;
            }
        } else {
            bmrl = null;
        }
        bxwc bxwc = bmrk.f130516f;
        bwgz a = bwgz.m121952a(bmrk.f130518h);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bmrk.f130511a & 2) != 0) {
            bmav = bmrk.f130513c;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        if ((bmrk.f130511a & 1) != 0) {
            bmaq = bmrk.f130512b;
            if (bmaq == null) {
                bmaq = bmaq.f128479l;
            }
        } else {
            bmaq = null;
        }
        bmar bmar = bmrk.f130514d;
        if (bmar == null) {
            bmar = bmar.f128490c;
        }
        if ((bmrk.f130511a & 16) != 0) {
            bmag bmag2 = bmrk.f130517g;
            if (bmag2 == null) {
                bmag = bmag.f128442c;
            } else {
                bmag = bmag2;
            }
        } else {
            bmag = null;
        }
        int i = awmq.f94621l;
        awmq.mo52279a(bmrl, bxwc, a, bmav, bmaq, bmar, 0, bmag, true, "onInitializeResponse");
    }

    /* renamed from: a */
    public final void mo52275a(bmrr bmrr) {
        bmrl bmrl;
        bmav bmav;
        bmag bmag;
        awmq awmq = this.f94620a;
        if ((bmrr.f130567a & 8) != 0) {
            bmrl = bmrr.f130571e;
            if (bmrl == null) {
                bmrl = bmrl.f130520u;
            }
        } else {
            bmrl = null;
        }
        bxwc bxwc = bmrr.f130572f;
        bwgz a = bwgz.m121952a(bmrr.f130574h);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bmrr.f130567a & 2) != 0) {
            bmav = bmrr.f130569c;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        bmaq bmaq = bmrr.f130568b;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bmar bmar = bmrr.f130570d;
        if (bmar == null) {
            bmar = bmar.f128490c;
        }
        long j = bmrr.f130575i;
        if ((bmrr.f130567a & 16) != 0) {
            bmag = bmrr.f130573g;
            if (bmag == null) {
                bmag = bmag.f128442c;
            }
        } else {
            bmag = null;
        }
        int i = awmq.f94621l;
        awmq.mo52279a(bmrl, bxwc, a, bmav, bmaq, bmar, j, bmag, false, "onSubmitResponse");
    }
}
