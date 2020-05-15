package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wxz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f51556a;

    public wxz(Context context) {
        this.f51556a = context;
    }

    public final void run() {
        Context context = this.f51556a;
        Toast toast = new Toast(context.getApplicationContext());
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.gf_thank_you_toast, (ViewGroup) null);
        toast.setGravity(119, 0, 0);
        toast.setDuration(0);
        toast.setView(inflate);
        toast.show();
        if (inflate != null) {
            inflate.setOnTouchListener(new wya(toast));
        }
    }
}
