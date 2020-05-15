package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;

/* renamed from: admc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class admc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f62150a;

    /* renamed from: b */
    final /* synthetic */ Intent f62151b;

    /* renamed from: c */
    final /* synthetic */ admd f62152c;

    public admc(admd admd, boolean z, Intent intent) {
        this.f62152c = admd;
        this.f62150a = z;
        this.f62151b = intent;
    }

    public void onClick(View view) {
        String str;
        if (this.f62150a) {
            try {
                this.f62152c.startActivity(this.f62151b);
            } catch (ActivityNotFoundException e) {
                admd.f62153a.mo33424a(e);
            }
        }
        admq admq = this.f62152c.f62173f;
        if (!this.f62150a) {
            str = "RestoreSupervisorFragment.Cancel";
        } else {
            str = "RestoreSupervisorFragment.OpenInWeb";
        }
        admq.mo33659a(str);
        this.f62152c.f62172e.mo33658i();
    }
}
