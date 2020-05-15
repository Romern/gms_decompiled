package p000;

import android.content.ContentResolver;
import android.widget.CompoundButton;

/* renamed from: amsi */
final /* synthetic */ class amsi implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final amsq f75855a;

    public amsi(amsq amsq) {
        this.f75855a = amsq;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        amsq amsq = this.f75855a;
        ContentResolver.setSyncAutomatically(amsq.f75863a, "com.android.contacts", z);
        amsq.mo41310a(6, z);
        if (cfus.f185744a.mo6606a().mo82770j() && !z) {
            ContentResolver.cancelSync(amsq.f75863a, "com.android.contacts");
        }
    }
}
