package p000;

import android.widget.Toast;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: juc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class juc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f23224a;

    /* renamed from: b */
    final /* synthetic */ SourceChimeraActivity f23225b;

    public juc(SourceChimeraActivity sourceChimeraActivity, int i) {
        this.f23225b = sourceChimeraActivity;
        this.f23224a = i;
    }

    public final void run() {
        Toast.makeText(this.f23225b, this.f23224a, 1).show();
    }
}
