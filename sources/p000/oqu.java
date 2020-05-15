package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.carsetup.AaSettingsActivityImpl;

/* renamed from: oqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oqu implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Intent f38251a;

    /* renamed from: b */
    final /* synthetic */ AaSettingsActivityImpl f38252b;

    public oqu(AaSettingsActivityImpl aaSettingsActivityImpl, Intent intent) {
        this.f38252b = aaSettingsActivityImpl;
        this.f38251a = intent;
    }

    public void onClick(View view) {
        this.f38252b.f29534c.mo21727a(bpea.SETTINGS_AA_GOOGLE_SETTINGS_LEARN_MORE);
        this.f38252b.startActivity(this.f38251a);
    }
}
