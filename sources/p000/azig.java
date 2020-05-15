package p000;

import android.support.p002v7.widget.SwitchCompat;
import android.view.View;

/* renamed from: azig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azig implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SwitchCompat f99469a;

    /* renamed from: b */
    final /* synthetic */ azik f99470b;

    public azig(azik azik, SwitchCompat switchCompat) {
        this.f99470b = azik;
        this.f99469a = switchCompat;
    }

    public void onClick(View view) {
        this.f99470b.f99480d = !this.f99469a.isChecked();
        azik azik = this.f99470b;
        azik.mo54950a(azik.f99480d, false);
    }
}
