package p000;

import android.content.Context;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ahum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahum extends buqn {

    /* renamed from: a */
    final /* synthetic */ Context f68101a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahum(String str, Context context) {
        super(str);
        this.f68101a = context;
    }

    public final void run() {
        Toast.makeText(this.f68101a, (int) C0126R.string.fast_pair_enabling_bluetooth, 0).show();
    }
}
