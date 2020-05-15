package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;
import com.google.android.gms.udc.service.FacsInternalSyncApiChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.Executor;

/* renamed from: avez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avez extends wga implements aaai {

    /* renamed from: a */
    private final aaag f93059a;

    /* renamed from: b */
    private final ClientContext f93060b;

    /* renamed from: c */
    private final avgm f93061c;

    /* renamed from: d */
    private final bbjm f93062d;

    /* renamed from: e */
    private final Executor f93063e;

    public avez(aaag aaag, ClientContext clientContext, avgm avgm, bbjm bbjm, Executor executor) {
        this.f93059a = aaag;
        this.f93060b = clientContext;
        this.f93061c = avgm;
        this.f93062d = bbjm;
        this.f93063e = executor;
    }

    /* renamed from: a */
    public final void mo29094a(wfy wfy, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        bnsi d = FacsInternalSyncApiChimeraService.f109381a.mo68390d();
        d.mo68432a("avez", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Received 'syncActivityControlsSettingsInternal' (forced: %b) request...", Boolean.valueOf(facsInternalSyncCallOptions.f31270a));
        this.f93059a.mo16658a(new avbs(wfy, this.f93061c, this.f93060b, this.f93062d, this.f93063e, facsInternalSyncCallOptions));
        bnsi d2 = FacsInternalSyncApiChimeraService.f109381a.mo68390d();
        d2.mo68432a("avez", "a", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Operation 'syncActivityControlsSettingsInternal' dispatched!");
    }

    /* renamed from: a */
    public final void mo29095a(wfy wfy, byte[] bArr, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        bnsi d = FacsInternalSyncApiChimeraService.f109381a.mo68390d();
        d.mo68432a("avez", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Received 'updateActivityControlsSettingsInternal' request...");
        try {
            this.f93059a.mo16658a(new avbu(wfy, this.f93061c, this.f93060b, this.f93062d, this.f93063e, facsInternalSyncCallOptions, (bxqf) GeneratedMessageLite.m124016a(bxqf.f164373f, bArr, bxus.m123743b())));
            bnsi d2 = FacsInternalSyncApiChimeraService.f109381a.mo68390d();
            d2.mo68432a("avez", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Operation 'updateActivityControlsSettingsInternal' dispatched!");
        } catch (bxwf e) {
            wfy.mo29074a(new Status(35002, "The given request couldn't be parsed!"), (UpdateActivityControlsSettingsInternalResult) null);
            bnsi c = FacsInternalSyncApiChimeraService.f109381a.mo68388c();
            c.mo68432a("avez", "a", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to dispatch operation 'updateActivityControlsSettingsInternal' due to malformed request!");
        }
    }
}
