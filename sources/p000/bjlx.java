package p000;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.chimera.DialogFragment;

/* renamed from: bjlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjlx extends DialogFragment {

    /* renamed from: c */
    public int f122952c;

    /* renamed from: d */
    public azah f122953d;

    /* renamed from: a */
    public static Bundle m103882a(int i, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("visualElementsId", i);
        bundle.putLong("uiReference", j);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo9306a() {
        return 0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = getArguments().getInt("visualElementsId");
        this.f122952c = i;
        if (i == 0) {
            i = mo9306a();
            this.f122952c = i;
        }
        if (i != 0) {
            bjii bjii = (bjii) bjie.f122757a;
            bjii.mo65278b();
            azak azak = new azak((ayxa) bjii.f122765a.mo6445a());
            cazf.m127593a(azak, "Cannot return null from a non-@Nullable @Provides method");
            this.f122953d = new azah(azak.f98835a, this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65374a(Dialog dialog) {
        if (this.f122952c != 0) {
            dialog.setOnShowListener(new azai(this, new bjlw(this)));
        }
    }
}
