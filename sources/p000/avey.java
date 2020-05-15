package p000;

import android.accounts.Account;
import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;
import com.google.android.gms.udc.service.FacsCacheApiChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.Executor;

/* renamed from: avey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avey extends wfu implements aaai {

    /* renamed from: a */
    private final Account f93046a;

    /* renamed from: b */
    private final aaag f93047b;

    /* renamed from: c */
    private final aaag f93048c;

    /* renamed from: d */
    private final ClientContext f93049d;

    /* renamed from: e */
    private final avgm f93050e;

    /* renamed from: f */
    private final avgn f93051f;

    /* renamed from: g */
    private final avfh f93052g;

    /* renamed from: h */
    private final bbjm f93053h;

    /* renamed from: i */
    private final Executor f93054i;

    /* renamed from: j */
    private final aveu f93055j;

    /* renamed from: k */
    private final ayte f93056k;

    /* renamed from: l */
    private final wfh f93057l;

    /* renamed from: m */
    private final avfk f93058m;

    public avey(Account account, aaag aaag, aaag aaag2, ClientContext clientContext, avgm avgm, avgn avgn, avfh avfh, bbjm bbjm, Executor executor, aveu aveu, avfk avfk, ayte ayte, wfh wfh) {
        this.f93046a = account;
        this.f93047b = aaag;
        this.f93048c = aaag2;
        this.f93049d = clientContext;
        this.f93050e = avgm;
        this.f93051f = avgn;
        this.f93052g = avfh;
        this.f93053h = bbjm;
        this.f93054i = executor;
        this.f93055j = aveu;
        this.f93058m = avfk;
        this.f93056k = ayte;
        this.f93057l = wfh;
    }

    /* renamed from: a */
    private final bdro m78397a(String str) {
        batv batv;
        batv batv2;
        batv batv3;
        avfk avfk = this.f93058m;
        String str2 = this.f93049d.f30215e;
        Account account = this.f93046a;
        Context context = avfk.f93084a;
        bbil bbil = avfk.f93085b;
        bdqu a = bdqu.m91314a(str2, str);
        bdrl bdrl = new bdrl(context);
        if (cfgv.m139557b()) {
            synchronized (bbil.f102735a) {
                batv3 = (batv) bbil.f102737c.get(account);
                if (batv3 == null) {
                    batv3 = batx.m87541b(bbil.f102738d, account.toString(), bbil.f102739e);
                    bbil.f102737c.put(account, batv3);
                }
            }
            batv = batv3;
        } else {
            synchronized (bbil.f102735a) {
                batv2 = (batv) bbil.f102736b.get(account);
                if (batv2 == null) {
                    batv2 = batx.m87539a(bbil.f102738d, account.toString(), bbil.f102739e);
                    bbil.f102736b.put(account, batv2);
                }
            }
            batv = batv2;
        }
        return bdro.m91337a(a, 1009, bdrl, account, batv, cfgv.m139558c());
    }

    /* renamed from: b */
    public final void mo29093b(wfs wfs, FacsCacheCallOptions facsCacheCallOptions) {
        FacsCacheCallOptions facsCacheCallOptions2 = facsCacheCallOptions;
        bnsi d = FacsCacheApiChimeraService.f109379a.mo68390d();
        d.mo68432a("avey", "b", (int) BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("Received 'getActivityControlsSettings' request from package '%s', instance id '%s', version '%d'...", this.f93049d.f30215e, facsCacheCallOptions2.f31268a, Long.valueOf(facsCacheCallOptions2.f31269b));
        if (!chbh.m148007e()) {
            wfs.mo29069a(new Status(17), (GetActivityControlsSettingsResult) null);
            bnsi c = FacsCacheApiChimeraService.f109379a.mo68388c();
            c.mo68432a("avey", "b", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("API request rejected!");
            return;
        }
        this.f93047b.mo16658a(new avbe(wfs, this.f93049d, this.f93050e, this.f93051f, this.f93052g, this.f93053h, this.f93054i, facsCacheCallOptions, this.f93055j, m78397a(facsCacheCallOptions2.f31268a), this.f93056k, this.f93057l));
        bnsi d2 = FacsCacheApiChimeraService.f109379a.mo68390d();
        d2.mo68432a("avey", "b", 246, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Operation 'getActivityControlsSettings' dispatched!");
    }

    /* renamed from: a */
    public final void mo29089a(wfs wfs) {
        bnsi d = FacsCacheApiChimeraService.f109379a.mo68390d();
        d.mo68432a("avey", "a", 303, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Received 'readDeviceLevelSettings' request from package '%s'...", this.f93049d.f30215e);
        this.f93048c.mo16658a(new avbq(wfs, this.f93052g));
        bnsi d2 = FacsCacheApiChimeraService.f109379a.mo68390d();
        d2.mo68432a("avey", "a", 310, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Operation 'readDeviceLevelSettings' dispatched!");
    }

    /* renamed from: a */
    public final void mo29090a(wfs wfs, FacsCacheCallOptions facsCacheCallOptions) {
        FacsCacheCallOptions facsCacheCallOptions2 = facsCacheCallOptions;
        bnsi d = FacsCacheApiChimeraService.f109379a.mo68390d();
        d.mo68432a("avey", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("Received 'forceSettingsCacheRefresh' request from package '%s', instance id '%s', version '%d'...", this.f93049d.f30215e, facsCacheCallOptions2.f31268a, Long.valueOf(facsCacheCallOptions2.f31269b));
        if (!chbh.m148007e()) {
            wfs.mo29067a(new Status(17), (ForceSettingsCacheRefreshResult) null);
            bnsi c = FacsCacheApiChimeraService.f109379a.mo68388c();
            c.mo68432a("avey", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("API request rejected!");
            return;
        }
        this.f93047b.mo16658a(new avbc(wfs, this.f93049d, this.f93050e, this.f93053h, this.f93054i, facsCacheCallOptions, this.f93055j, m78397a(facsCacheCallOptions2.f31268a), this.f93056k, this.f93057l));
        bnsi d2 = FacsCacheApiChimeraService.f109379a.mo68390d();
        d2.mo68432a("avey", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Operation 'forceSettingsCacheRefresh' dispatched!");
    }

    /* renamed from: a */
    public final void mo29091a(wfs wfs, byte[] bArr) {
        bnsi d = FacsCacheApiChimeraService.f109379a.mo68390d();
        d.mo68432a("avey", "a", 316, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Received 'writeDeviceLevelSettings' request from package '%s'...", this.f93049d.f30215e);
        try {
            this.f93048c.mo16658a(new avby((bxok) GeneratedMessageLite.m124016a(bxok.f164161d, bArr, bxus.m123744c()), wfs, this.f93052g));
            bnsi d2 = FacsCacheApiChimeraService.f109379a.mo68390d();
            d2.mo68432a("avey", "a", 327, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Operation 'writeDeviceLevelSettings' dispatched!");
        } catch (bxwf e) {
            wfs.mo29071a(new Status(35002, "The given request couldn't be parsed!"));
            bnsi c = FacsCacheApiChimeraService.f109379a.mo68388c();
            c.mo68432a("avey", "a", 332, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to dispatch operation 'writeDeviceLevelSettings' due to malformed request!");
        }
    }

    /* renamed from: a */
    public final void mo29092a(wfs wfs, byte[] bArr, FacsCacheCallOptions facsCacheCallOptions) {
        String str;
        String str2;
        String str3;
        avbw avbw;
        wfs wfs2 = wfs;
        FacsCacheCallOptions facsCacheCallOptions2 = facsCacheCallOptions;
        bnsi d = FacsCacheApiChimeraService.f109379a.mo68390d();
        d.mo68432a("avey", "a", 255, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("Received 'updateActivityControlsSettings' request from package '%s', instance id '%s', version '%d'...", this.f93049d.f30215e, facsCacheCallOptions2.f31268a, Long.valueOf(facsCacheCallOptions2.f31269b));
        if (chbh.m148007e()) {
            try {
                bxqf bxqf = (bxqf) GeneratedMessageLite.m124014a(bxqf.f164373f, bArr);
                aaag aaag = this.f93047b;
                ClientContext clientContext = this.f93049d;
                avgm avgm = this.f93050e;
                avfh avfh = this.f93052g;
                bbjm bbjm = this.f93053h;
                Executor executor = this.f93054i;
                aveu aveu = this.f93055j;
                bdro a = m78397a(facsCacheCallOptions2.f31268a);
                ayte ayte = this.f93056k;
                wfh wfh = this.f93057l;
                avbw avbw2 = avbw;
                aaag aaag2 = aaag;
                String str4 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                String str5 = "a";
                String str6 = "avey";
                try {
                    avbw = new avbw(wfs, clientContext, avgm, bxqf, avfh, bbjm, executor, facsCacheCallOptions, aveu, a, ayte, wfh);
                    aaag2.mo16658a(avbw2);
                    bnsi d2 = FacsCacheApiChimeraService.f109379a.mo68390d();
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    try {
                        d2.mo68432a(str3, str2, 289, str);
                        d2.mo68405a("Operation 'updateActivityControlsSettings' dispatched!");
                    } catch (bxwf e) {
                        wfs.mo29068a(new Status(35002, "The given request couldn't be parsed!"), (UpdateActivityControlsSettingsResult) null);
                        bnsi c = FacsCacheApiChimeraService.f109379a.mo68388c();
                        c.mo68432a(str3, str2, 295, str);
                        c.mo68405a("Failed to dispatch operation 'updateActivityControlsSettings' due to malformed request!");
                    }
                } catch (bxwf e2) {
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    wfs.mo29068a(new Status(35002, "The given request couldn't be parsed!"), (UpdateActivityControlsSettingsResult) null);
                    bnsi c2 = FacsCacheApiChimeraService.f109379a.mo68388c();
                    c2.mo68432a(str3, str2, 295, str);
                    c2.mo68405a("Failed to dispatch operation 'updateActivityControlsSettings' due to malformed request!");
                }
            } catch (bxwf e3) {
                str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                str2 = "a";
                str3 = "avey";
                wfs.mo29068a(new Status(35002, "The given request couldn't be parsed!"), (UpdateActivityControlsSettingsResult) null);
                bnsi c22 = FacsCacheApiChimeraService.f109379a.mo68388c();
                c22.mo68432a(str3, str2, 295, str);
                c22.mo68405a("Failed to dispatch operation 'updateActivityControlsSettings' due to malformed request!");
            }
        } else {
            wfs2.mo29068a(new Status(17), (UpdateActivityControlsSettingsResult) null);
            bnsi c3 = FacsCacheApiChimeraService.f109379a.mo68388c();
            c3.mo68432a("avey", "a", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c3.mo68405a("API request rejected!");
        }
    }
}
