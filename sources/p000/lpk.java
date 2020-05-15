package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.service.autofill.Dataset;
import android.support.p002v7.widget.RecyclerView;
import android.view.autofill.AutofillValue;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/* renamed from: lpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lpk extends lpq {

    /* renamed from: d */
    public static final srn f26540d = srn.m36126a("CredentialsBottomSheetActivityController", sgj.AUTOFILL);

    /* renamed from: e */
    public final lrc f26541e;

    /* renamed from: f */
    public final kpk f26542f;

    public lpk(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        this.f26541e = lrc.m19570a(lir);
        this.f26542f = krc.m18382a(lir).mo14833h();
    }

    /* renamed from: a */
    public static boolean m19476a(kct kct) {
        return kct != null && (kct.mo14368a() instanceof Credential);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo15344b(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new aah());
        recyclerView.setNestedScrollingEnabled(false);
        lqe lqe = new lqe();
        lqg f = lql.m19524f();
        f.mo15376b(this.f26541e.mo15386b(C0126R.string.autofill_pick_saved_password).toString());
        f.mo15373a(new lpd(this));
        lql a = f.mo15372a();
        lqg f2 = lql.m19524f();
        f2.mo15376b(this.f26541e.mo15386b(C0126R.string.autofill_manage_passwords).toString());
        f2.mo15373a(new lpe(this));
        lqe.mo15371a(bngx.m109357a(a, f2.mo15372a()));
        recyclerView.setAdapter(lqe);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final CharSequence mo15345h() {
        return this.f26541e.mo15386b(C0126R.string.common_passwords);
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        if (i != 1000) {
            if (i != 1001) {
                mo15167a(i2, intent);
            }
        } else if (i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("pwm.DataFieldNames.pickerUsername");
            String stringExtra2 = intent.getStringExtra("pwm.DataFieldNames.pickerPassword");
            if (!bmxx.m108577a(stringExtra) && !bmxx.m108577a(stringExtra2)) {
                mo15343a(new Credential(stringExtra, new kdj(stringExtra2), this.f26554k.f11643c));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15341a(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new aah());
        recyclerView.setNestedScrollingEnabled(true);
        lqe lqe = new lqe();
        recyclerView.setAdapter(lqe);
        bmxv f = this.f26555l.mo14868f();
        if (f.mo66813a()) {
            bqgg a = ((kfx) f.mo66814b()).mo14429a(new kej(mo15351i(), new Class[0]));
            a.mo741a(new lpf(this, a, lqe), new lqw(new adzt(Looper.getMainLooper())));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo15342a(bqgg bqgg, lqe lqe) {
        try {
            lqe.mo15371a((Collection) ((kek) bqgg.get()).f23936a.stream().filter(lpg.f26535a).map(new lph(this)).collect(Collectors.toList()));
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) f26540d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lpk", "a", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Execution exception while populating credential datasets");
        }
    }

    /* renamed from: a */
    public final void mo15343a(Credential credential) {
        Dataset dataset;
        kby kby = new kby(lbj.m18887a(this.f26159a, "", (CharSequence) null, (kcz) null));
        if (this.f26554k.mo7949a(kpb.USERNAME)) {
            kby.mo14354a(((FillField) this.f26554k.mo7950b(kpb.USERNAME).get(0)).f11631a, AutofillValue.forText(credential.f11608a));
        }
        if (this.f26554k.mo7949a(kpb.PASSWORD)) {
            kby.mo14354a(((FillField) this.f26554k.mo7950b(kpb.PASSWORD).get(0)).f11631a, AutofillValue.forText(credential.f11609b.f23889a));
        }
        kbz a = kby.mo14352a();
        if (a != null && (dataset = a.f23732a) != null) {
            Intent intent = new Intent();
            intent.putExtra("android.view.autofill.extra.AUTHENTICATION_RESULT", dataset);
            mo15167a(-1, intent);
        }
    }
}
