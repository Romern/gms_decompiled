package p000;

import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;

/* renamed from: wfc */
public final /* synthetic */ class wfc implements roo {

    /* renamed from: a */
    private final bxqf f50605a;

    /* renamed from: b */
    private final FacsInternalSyncCallOptions f50606b;

    public wfc(bxqf bxqf, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        this.f50605a = bxqf;
        this.f50606b = facsInternalSyncCallOptions;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        bxqf bxqf = this.f50605a;
        FacsInternalSyncCallOptions facsInternalSyncCallOptions = this.f50606b;
        ((wgb) ((wfp) obj).mo25289B()).mo29095a(new wff((aucf) obj2), bxqf.serializeToBytes(), facsInternalSyncCallOptions);
    }
}
