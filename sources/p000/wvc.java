package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: wvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wvc extends aaab {

    /* renamed from: a */
    private final wyt f51403a;

    public wvc(String str, wyt wyt) {
        super(29, str);
        this.f51403a = wyt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f51403a.mo29471a(context);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        String valueOf = String.valueOf(this.f27820m);
        Log.e("gf_BaseFeedbackOp", valueOf.length() == 0 ? new String("Failed to execute AsyncOperation: ") : "Failed to execute AsyncOperation: ".concat(valueOf));
    }
}
