package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;

/* renamed from: admn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class admn implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f62167a;

    /* renamed from: b */
    final /* synthetic */ Intent f62168b;

    /* renamed from: c */
    final /* synthetic */ admo f62169c;

    public admn(admo admo, boolean z, Intent intent) {
        this.f62169c = admo;
        this.f62167a = z;
        this.f62168b = intent;
    }

    public void onClick(View view) {
        String str;
        if (this.f62167a) {
            try {
                this.f62169c.startActivity(this.f62168b);
            } catch (ActivityNotFoundException e) {
                admo.f62170a.mo33424a(e);
            }
        }
        admq admq = this.f62169c.f62173f;
        if (!this.f62167a) {
            str = "SetupFailureFragment.Cancel";
        } else {
            str = "SetupFailureFragment.OpenInWeb";
        }
        admq.mo33659a(str);
        this.f62169c.f62173f.mo33661h();
    }
}
