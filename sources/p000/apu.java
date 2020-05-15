package p000;

import android.app.slice.SliceManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.util.Set;

/* renamed from: apu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ apw f1952a;

    public apu(apw apw) {
        this.f1952a = apw;
    }

    public final void run() {
        this.f1952a.mo2282a();
        apw apw = this.f1952a;
        Context context = apw.f1959f.f1943a;
        Uri uri = apw.f1954a;
        Set set = ara.f2048c;
        int i = Build.VERSION.SDK_INT;
        this.f1952a.f1955b.execute(new apt(this, aph.m1807a(((SliceManager) context.getSystemService(SliceManager.class)).bindSlice(uri, aph.m1809a(set)), context)));
    }
}
