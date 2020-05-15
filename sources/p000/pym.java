package p000;

import android.content.Context;
import com.google.android.gms.cast.EqualizerSettings;

/* renamed from: pym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pym extends pyw {

    /* renamed from: a */
    final /* synthetic */ EqualizerSettings f40655a;

    /* renamed from: b */
    final /* synthetic */ pyx f40656b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pym(pyx pyx, String str, EqualizerSettings equalizerSettings) {
        super(str);
        this.f40656b = pyx;
        this.f40655a = equalizerSettings;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f40656b.f40686f.mo23199a(this.f40655a);
    }
}
