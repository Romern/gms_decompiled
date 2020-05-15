package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;
import com.google.android.gms.nearby.sharing.internal.CancelParams;
import com.google.android.gms.nearby.sharing.internal.GetAccountParams;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;
import com.google.android.gms.nearby.sharing.internal.GetDataUsageParams;
import com.google.android.gms.nearby.sharing.internal.GetDeviceNameParams;
import com.google.android.gms.nearby.sharing.internal.GetVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.IsEnabledParams;
import com.google.android.gms.nearby.sharing.internal.IsOptedInParams;
import com.google.android.gms.nearby.sharing.internal.MarkContactAsSelectedParams;
import com.google.android.gms.nearby.sharing.internal.OpenParams;
import com.google.android.gms.nearby.sharing.internal.OptInParams;
import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSharingProviderParams;
import com.google.android.gms.nearby.sharing.internal.RejectParams;
import com.google.android.gms.nearby.sharing.internal.SendParams;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;
import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;
import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;
import com.google.android.gms.nearby.sharing.internal.SetVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.UnmarkContactAsSelectedParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: ajmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajmt extends ajhf {

    /* renamed from: a */
    public final String f70933a;

    /* renamed from: b */
    public final rns f70934b = new ajmf();

    /* renamed from: c */
    final /* synthetic */ NearbySharingChimeraService f70935c;

    /* renamed from: d */
    private final Map f70936d = new C1223np();

    /* renamed from: e */
    private final Map f70937e = new C1223np();

    /* renamed from: f */
    private final Map f70938f = new C1223np();

    public ajmt(NearbySharingChimeraService nearbySharingChimeraService, String str) {
        this.f70935c = nearbySharingChimeraService;
        this.f70933a = str;
    }

    /* renamed from: a */
    public final void mo38635a(AcceptParams acceptParams) {
        sdo.m34959a(acceptParams.f81071a);
        sdo.m34959a(acceptParams.f81072b);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajko ajko = new ajko(this, acceptParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajko);
    }

    /* renamed from: a */
    public final void mo38636a(CancelParams cancelParams) {
        sdo.m34959a(cancelParams.f81073a);
        sdo.m34959a(cancelParams.f81074b);
        ajkq ajkq = new ajkq(this, cancelParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        new soa(9, ajkq).start();
    }

    /* renamed from: a */
    public final void mo38637a(GetAccountParams getAccountParams) {
        sdo.m34959a(getAccountParams.f81075a);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajky ajky = new ajky(this, getAccountParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajky);
    }

    /* renamed from: a */
    public final void mo38638a(GetContactsCountParams getContactsCountParams) {
        sdo.m34959a(getContactsCountParams.f81076a);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajku ajku = new ajku(this, getContactsCountParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajku);
    }

    /* renamed from: a */
    public final void mo38639a(GetContactsParams getContactsParams) {
        boolean z;
        sdo.m34959a(getContactsParams.f81078a);
        boolean z2 = true;
        if (getContactsParams.f81079b >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (getContactsParams.f81080c < 0) {
            z2 = false;
        }
        sdo.m34974b(z2);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajkt ajkt = new ajkt(this, getContactsParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajkt);
    }

    /* renamed from: a */
    public final void mo38640a(GetDataUsageParams getDataUsageParams) {
        sdo.m34959a(getDataUsageParams.f81082a);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajla ajla = new ajla(this, getDataUsageParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajla);
    }

    /* renamed from: a */
    public final void mo38641a(GetDeviceNameParams getDeviceNameParams) {
        sdo.m34959a(getDeviceNameParams.f81083a);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajma ajma = new ajma(this, getDeviceNameParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajma);
    }

    /* renamed from: a */
    public final void mo38642a(GetVisibilityParams getVisibilityParams) {
        sdo.m34959a(getVisibilityParams.f81084a);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajlc ajlc = new ajlc(this, getVisibilityParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajlc);
    }

    /* renamed from: a */
    public final void mo38643a(IsEnabledParams isEnabledParams) {
        sdo.m34959a(isEnabledParams.f81085a);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajlo ajlo = new ajlo(this, isEnabledParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajlo);
    }

    /* renamed from: a */
    public final void mo38644a(IsOptedInParams isOptedInParams) {
        sdo.m34959a(isOptedInParams.f81086a);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajks ajks = new ajks(this, isOptedInParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajks);
    }

    /* renamed from: a */
    public final void mo38645a(MarkContactAsSelectedParams markContactAsSelectedParams) {
        sdo.m34959a(markContactAsSelectedParams.f81087a);
        sdo.m34959a(markContactAsSelectedParams.f81088b);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajkv ajkv = new ajkv(this, markContactAsSelectedParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajkv);
    }

    /* renamed from: a */
    public final void mo38646a(OpenParams openParams) {
        sdo.m34959a(openParams.f81095a);
        sdo.m34959a(openParams.f81096b);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajkr ajkr = new ajkr(this, openParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajkr);
    }

    /* renamed from: a */
    public final void mo38647a(OptInParams optInParams) {
        sdo.m34959a(optInParams.f81097a);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajkh ajkh = new ajkh(this, optInParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajkh);
    }

    /* renamed from: a */
    public final void mo38648a(RegisterReceiveSurfaceParams registerReceiveSurfaceParams) {
        ajyz ajyz = registerReceiveSurfaceParams.f81108a;
        int i = registerReceiveSurfaceParams.f81109b;
        sdo.m34959a(ajyz);
        sdo.m34959a(registerReceiveSurfaceParams.f81110c);
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        sdo.m34974b(z);
        if (!this.f70936d.containsKey(ajyz.asBinder())) {
            ajmp ajmp = new ajmp(ajyz);
            ajkk ajkk = new ajkk(this, ajyz);
            this.f70936d.put(ajyz.asBinder(), new ajmr(ajmp, ajkk));
            try {
                ajyz.asBinder().linkToDeath(ajkk, 0);
            } catch (RemoteException e) {
                ajkk.binderDied();
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
            ajkl ajkl = new ajkl(this, registerReceiveSurfaceParams, ajmp, i);
            Charset charset = NearbySharingChimeraService.f80888a;
            nearbySharingChimeraService.mo44424a(ajkl);
            return;
        }
        throw new IllegalArgumentException("registerReceiveSurface failed. Already registered.");
    }

    /* renamed from: a */
    public final void mo38649a(RegisterSendSurfaceParams registerSendSurfaceParams) {
        ajyz ajyz = registerSendSurfaceParams.f81111a;
        ajyt ajyt = registerSendSurfaceParams.f81112b;
        int i = registerSendSurfaceParams.f81113c;
        sdo.m34959a(ajyz);
        sdo.m34959a(ajyt);
        sdo.m34959a(registerSendSurfaceParams.f81114d);
        boolean z = true;
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4)) {
            z = false;
        }
        sdo.m34974b(z);
        if (!this.f70937e.containsKey(ajyz.asBinder())) {
            ajmn ajmn = new ajmn(ajyz);
            ajmo ajmo = new ajmo(ajyt);
            ajme ajme = new ajme(this, ajyz);
            this.f70937e.put(ajyz.asBinder(), new ajms(ajmn, ajme));
            try {
                ajyz.asBinder().linkToDeath(ajme, 0);
            } catch (RemoteException e) {
                ajme.binderDied();
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
            ajki ajki = new ajki(this, i, registerSendSurfaceParams, ajmn, ajmo);
            Charset charset = NearbySharingChimeraService.f80888a;
            nearbySharingChimeraService.mo44424a(ajki);
            return;
        }
        throw new IllegalArgumentException("registerSendSurface failed. Already registered.");
    }

    /* renamed from: a */
    public final void mo38650a(RegisterSharingProviderParams registerSharingProviderParams) {
        ajyk ajyk = registerSharingProviderParams.f81116b;
        sdo.m34959a(ajyk);
        if (!this.f70938f.containsKey(ajyk.f12819a)) {
            String num = Integer.toString(Objects.hashCode(ajyk));
            ajmm ajmm = new ajmm(this, num, ajyk);
            ajmb ajmb = new ajmb(this, ajyk);
            this.f70938f.put(ajyk.f12819a, new ajmq(ajmm, ajmb));
            try {
                ajyk.f12819a.linkToDeath(ajmb, 0);
            } catch (RemoteException e) {
                ajmb.binderDied();
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
            ajmc ajmc = new ajmc(this, registerSharingProviderParams, ajmm, num);
            Charset charset = NearbySharingChimeraService.f80888a;
            nearbySharingChimeraService.mo44424a(ajmc);
            return;
        }
        throw new IllegalArgumentException("registerSharingProvider failed. Already registered.");
    }

    /* renamed from: a */
    public final void mo38651a(RejectParams rejectParams) {
        sdo.m34959a(rejectParams.f81117a);
        sdo.m34959a(rejectParams.f81118b);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajkp ajkp = new ajkp(this, rejectParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajkp);
    }

    /* renamed from: a */
    public final void mo38652a(SendParams sendParams) {
        sdo.m34959a(sendParams.f81119a);
        sdo.m34959a(sendParams.f81120b);
        sdo.m34959a(sendParams.f81121c);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajkn ajkn = new ajkn(this, sendParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajkn);
    }

    /* renamed from: a */
    public final void mo38653a(SetAccountParams setAccountParams) {
        sdo.m34959a(setAccountParams.f81123b);
        sdo.m34959a(setAccountParams.f81122a);
        sdo.m34974b("com.google".equals(setAccountParams.f81122a.type));
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajkx ajkx = new ajkx(this, setAccountParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajkx);
    }

    /* renamed from: a */
    public final void mo38654a(SetDataUsageParams setDataUsageParams) {
        sdo.m34959a(setDataUsageParams.f81125b);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajkz ajkz = new ajkz(this, setDataUsageParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajkz);
    }

    /* renamed from: a */
    public final void mo38655a(SetDeviceNameParams setDeviceNameParams) {
        sdo.m34959a((Object) setDeviceNameParams.f81126a);
        sdo.m34959a(setDeviceNameParams.f81127b);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajlz ajlz = new ajlz(this, setDeviceNameParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajlz);
    }

    /* renamed from: a */
    public final void mo38656a(SetEnabledParams setEnabledParams) {
        sdo.m34959a(setEnabledParams.f81129b);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajld ajld = new ajld(this, setEnabledParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajld);
    }

    /* renamed from: a */
    public final void mo38657a(SetVisibilityParams setVisibilityParams) {
        sdo.m34959a(setVisibilityParams.f81131b);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajlb ajlb = new ajlb(this, setVisibilityParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajlb);
    }

    /* renamed from: a */
    public final void mo38658a(UnmarkContactAsSelectedParams unmarkContactAsSelectedParams) {
        sdo.m34959a(unmarkContactAsSelectedParams.f81132a);
        sdo.m34959a(unmarkContactAsSelectedParams.f81133b);
        NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
        ajkw ajkw = new ajkw(this, unmarkContactAsSelectedParams);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajkw);
    }

    /* renamed from: a */
    public final void mo38659a(UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams) {
        ajyz ajyz = unregisterReceiveSurfaceParams.f81134a;
        sdo.m34959a(ajyz);
        sdo.m34959a(unregisterReceiveSurfaceParams.f81135b);
        if (this.f70936d.containsKey(ajyz.asBinder())) {
            ajmr ajmr = (ajmr) this.f70936d.remove(ajyz.asBinder());
            try {
                ajyz.asBinder().unlinkToDeath(ajmr.f70930b, 0);
            } catch (NoSuchElementException e) {
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
            ajkm ajkm = new ajkm(this, unregisterReceiveSurfaceParams, ajmr);
            Charset charset = NearbySharingChimeraService.f80888a;
            nearbySharingChimeraService.mo44424a(ajkm);
            return;
        }
        throw new IllegalArgumentException("unregisterReceiveSurface failed. Unknown TransferUpdateCallback");
    }

    /* renamed from: a */
    public final void mo38660a(UnregisterSendSurfaceParams unregisterSendSurfaceParams) {
        ajyz ajyz = unregisterSendSurfaceParams.f81136a;
        sdo.m34959a(ajyz);
        sdo.m34959a(unregisterSendSurfaceParams.f81137b);
        if (this.f70937e.containsKey(ajyz.asBinder())) {
            ajms ajms = (ajms) this.f70937e.remove(ajyz.asBinder());
            try {
                ajyz.asBinder().unlinkToDeath(ajms.f70932b, 0);
            } catch (NoSuchElementException e) {
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
            ajkj ajkj = new ajkj(this, unregisterSendSurfaceParams, ajms);
            Charset charset = NearbySharingChimeraService.f80888a;
            nearbySharingChimeraService.mo44424a(ajkj);
            return;
        }
        throw new IllegalArgumentException("unregisterSendSurface failed. Unknown TransferUpdateCallback");
    }

    /* renamed from: a */
    public final void mo38661a(UnregisterSharingProviderParams unregisterSharingProviderParams) {
        ajyk ajyk = unregisterSharingProviderParams.f81139b;
        sdo.m34959a(ajyk);
        if (this.f70938f.containsKey(ajyk.f12819a)) {
            ajmq ajmq = (ajmq) this.f70938f.remove(ajyk.f12819a);
            try {
                ajyk.f12819a.unlinkToDeath(ajmq.f70928b, 0);
            } catch (NoSuchElementException e) {
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.f70935c;
            ajmd ajmd = new ajmd(this, unregisterSharingProviderParams, ajmq);
            Charset charset = NearbySharingChimeraService.f80888a;
            nearbySharingChimeraService.mo44424a(ajmd);
            return;
        }
        throw new IllegalArgumentException("unregisterSharingProvider failed. Unknown ExternalSharingProvider");
    }
}
