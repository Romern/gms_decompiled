package p000;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: ajjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajjs implements ajsn {

    /* renamed from: a */
    final /* synthetic */ ajsn f70762a;

    /* renamed from: b */
    final /* synthetic */ NearbySharingChimeraService f70763b;

    public ajjs(NearbySharingChimeraService nearbySharingChimeraService, ajsn ajsn) {
        this.f70763b = nearbySharingChimeraService;
        this.f70762a = ajsn;
    }

    /* renamed from: a */
    public final void mo38707a(ShareTarget shareTarget) {
        ajsn ajsn = this.f70762a;
        NearbySharingChimeraService nearbySharingChimeraService = this.f70763b;
        ajsl ajsl = new ajsl();
        ajsl.f71229a = shareTarget.f81028a;
        ajsl.f71230b = shareTarget.f81029b;
        ajsl.f71231c = shareTarget.f81030c;
        ajsl.f71232d = shareTarget.f81031d;
        ajsl.f71233e = shareTarget.f81032e;
        ajsl.f71234f = new ArrayList(shareTarget.f81033f);
        ajsl.f71235g = new ArrayList(shareTarget.f81034g);
        ajsl.f71236h = new ArrayList(shareTarget.f81035h);
        ajsl.f71237i = shareTarget.f81036i;
        ajsl.f71238j = shareTarget.f81037j;
        ajsl.f71239k = shareTarget.f81038k;
        ajsl.f71240l = shareTarget.f81039l;
        ajsl.f71241m = shareTarget.f81040m;
        ajsl.f71242n = shareTarget.f81041n;
        ajsl.f71241m = PendingIntent.getActivity(nearbySharingChimeraService.f80905q, 1007, new Intent().setClassName(nearbySharingChimeraService.f80905q, "com.google.android.gms.nearby.sharing.InternalShareSheetActivity").addFlags(268435456).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT).putExtra("direct_share_target_bytes", sef.m35074a(shareTarget)), 134217728);
        ajsn.mo38707a(ajsl.mo38887a());
    }

    /* renamed from: b */
    public final void mo38709b(ShareTarget shareTarget) {
        this.f70762a.mo38709b(shareTarget);
    }

    /* renamed from: a */
    public final void mo38708a(ShareTarget shareTarget, int i) {
        this.f70762a.mo38708a(shareTarget, i);
    }
}
