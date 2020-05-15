package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.p051ui.OptInChimeraActivity;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: adlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adlr implements aubw {

    /* renamed from: a */
    final /* synthetic */ boolean f62132a;

    /* renamed from: b */
    final /* synthetic */ OptInChimeraActivity f62133b;

    public adlr(OptInChimeraActivity optInChimeraActivity, boolean z) {
        this.f62133b = optInChimeraActivity;
        this.f62132a = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        OptInInfo optInInfo = (OptInInfo) obj;
        Account[] accountArr = optInInfo != null ? optInInfo.f79184c : null;
        if (accountArr == null || accountArr.length == 0) {
            OptInChimeraActivity.f79239b.mo33429c("No accounts found. Showing error.", new Object[0]);
            this.f62133b.mo33654a(1);
        } else if (!this.f62132a && this.f62133b.f79241d.findFragmentById(C0126R.C0129id.content_wrapper) != null) {
            adml adml = this.f62133b.f79240c;
            adml.f62162d.setAlpha(1.0f);
            adml.f62161c.setVisibility(0);
            adml.f62164f = 2;
        } else if (optInInfo.f79182a != 1) {
            OptInChimeraActivity optInChimeraActivity = this.f62133b;
            String stringExtra = optInChimeraActivity.getIntent().getStringExtra("defaultAccount");
            boolean booleanExtra = this.f62133b.getIntent().getBooleanExtra("lastChance", false);
            adma adma = new adma();
            Bundle bundle = new Bundle();
            bundle.putString("defaultAccount", stringExtra);
            bundle.putBoolean("lastChance", booleanExtra);
            bundle.putParcelableArrayList("eligibleAccounts", new ArrayList(Arrays.asList(accountArr)));
            adma.setArguments(bundle);
            optInChimeraActivity.mo43460a(adma);
        } else if (!adfr.m50319b(this.f62133b)) {
            this.f62133b.mo43462o();
        } else if (!this.f62133b.getIntent().getBooleanExtra("downloadSupervisorShowPrompt", false)) {
            this.f62133b.mo33660e();
        } else {
            OptInChimeraActivity optInChimeraActivity2 = this.f62133b;
            Intent p = optInChimeraActivity2.mo43463p();
            admd admd = new admd();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("browserIntent", p);
            admd.setArguments(bundle2);
            optInChimeraActivity2.mo43460a(admd);
        }
    }
}
