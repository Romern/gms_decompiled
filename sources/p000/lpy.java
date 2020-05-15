package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Looper;
import android.support.p002v7.widget.RecyclerView;
import com.felicanetworks.mfc.C0126R;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/* renamed from: lpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lpy extends lpq {

    /* renamed from: d */
    public static final srn f26569d = srn.m36126a("PaymentsBottomSheetActivityController", sgj.AUTOFILL);

    /* renamed from: e */
    private final lrc f26570e;

    public lpy(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        this.f26570e = lrc.m19570a(lir);
    }

    /* renamed from: a */
    public static boolean m19497a(kct kct) {
        return kct != null && (kct.mo14368a() instanceof kdb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo15344b(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new aah());
        recyclerView.setNestedScrollingEnabled(false);
        lqe lqe = new lqe();
        lqg f = lql.m19524f();
        f.mo15376b(this.f26570e.mo15386b(C0126R.string.autofill_scan_card).toString());
        f.mo15375a(new lqj(C0126R.C0127drawable.quantum_ic_photo_camera_grey600_36));
        f.mo15373a(new lpr(this));
        lql a = f.mo15372a();
        lqg f2 = lql.m19524f();
        f2.mo15376b(this.f26570e.mo15386b(C0126R.string.autofill_manage_payment_methods).toString());
        f2.mo15373a(new lps(this));
        lqe.mo15371a(bngx.m109357a(a, f2.mo15372a()));
        recyclerView.setAdapter(lqe);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final CharSequence mo15345h() {
        return this.f26570e.mo15386b(C0126R.string.autofill_datatype_payment);
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        if (i != 1002 && i2 != 0) {
            mo15167a(i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15341a(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new aah());
        recyclerView.setNestedScrollingEnabled(false);
        lqe lqe = new lqe();
        recyclerView.setAdapter(lqe);
        bmxv e = this.f26555l.mo14867e();
        if (e.mo66813a()) {
            bqgg a = ((khd) e.mo66814b()).mo14429a(new kej(mo15351i(), new Class[0]));
            a.mo741a(new lpt(this, a, lqe), new lqw(new adzt(Looper.getMainLooper())));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo15358a(bqgg bqgg, lqe lqe) {
        try {
            lqe.mo15371a((Collection) ((kek) bqgg.get()).f23936a.stream().filter(lpv.f26564a).map(new lpw(this)).collect(Collectors.toList()));
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) f26569d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lpy", "a", 187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Execution exception while populating payment card datasets");
        }
    }

    /* renamed from: a */
    public final void mo15359a(kdb kdb) {
        try {
            PendingIntent a = lio.m19190a(this.f26159a, kdb.f23846a, this.f26554k);
            if (a != null) {
                this.f26159a.startIntentSenderForResult(a.getIntentSender(), 1001, null, 0, 0, 0);
            }
        } catch (IntentSender.SendIntentException e) {
            bnsl bnsl = (bnsl) f26569d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lpy", "a", 232, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Starting unmask payment card intent failed");
        }
    }
}
