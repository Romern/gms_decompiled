package p000;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.tapandpay.tokenization.NameResolutionChimeraActivity;

/* renamed from: atqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ atam f90669a;

    /* renamed from: b */
    final /* synthetic */ NameResolutionChimeraActivity f90670b;

    public atqk(NameResolutionChimeraActivity nameResolutionChimeraActivity, atam atam) {
        this.f90670b = nameResolutionChimeraActivity;
        this.f90669a = atam;
    }

    public void onClick(View view) {
        if (!TextUtils.isEmpty(this.f90670b.f108822b.f151297a.getText())) {
            Intent intent = new Intent();
            intent.putExtra("alternate_cardholder_name", this.f90670b.f108822b.f151297a.getText().toString());
            this.f90670b.setResult(-1, intent);
            this.f90670b.finish();
            atam atam = this.f90669a;
            atam.mo49741a(atam.mo49734a(26));
        }
    }
}
