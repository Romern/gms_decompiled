package p000;

import com.google.android.gms.smartdevice.d2d.p065ui.SourceDirectTransferChimeraActivity;
import java.util.List;

/* renamed from: arox */
public final /* synthetic */ class arox implements aubq {

    /* renamed from: a */
    private final SourceDirectTransferChimeraActivity f88041a;

    public arox(SourceDirectTransferChimeraActivity sourceDirectTransferChimeraActivity) {
        this.f88041a = sourceDirectTransferChimeraActivity;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        SourceDirectTransferChimeraActivity sourceDirectTransferChimeraActivity = this.f88041a;
        List<aucb> list = (List) aucb.mo50386d();
        if (list != null) {
            for (aucb aucb2 : list) {
                if (aucb2.mo50384b() && ((Boolean) aucb2.mo50386d()).booleanValue()) {
                    return;
                }
            }
        }
        SourceDirectTransferChimeraActivity.f108018d.mo25416d("Transfer no longer in progress.", new Object[0]);
        asbv.m73762a(sourceDirectTransferChimeraActivity);
    }
}
