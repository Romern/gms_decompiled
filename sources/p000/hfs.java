package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.auth.api.credentials.credentialsaving.p021ui.SaveAccountLinkingTokenChimeraActivity;

/* renamed from: hfs */
public final /* synthetic */ class hfs implements bmyl {

    /* renamed from: a */
    private final SaveAccountLinkingTokenChimeraActivity f19683a;

    public hfs(SaveAccountLinkingTokenChimeraActivity saveAccountLinkingTokenChimeraActivity) {
        this.f19683a = saveAccountLinkingTokenChimeraActivity;
    }

    /* renamed from: a */
    public final void mo12292a(Object obj) {
        SaveAccountLinkingTokenChimeraActivity saveAccountLinkingTokenChimeraActivity = this.f19683a;
        saveAccountLinkingTokenChimeraActivity.f10131b.mo24333a(adbu.m50141a((int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, (adbt) obj, saveAccountLinkingTokenChimeraActivity.f10132c)).mo24327b();
    }
}
