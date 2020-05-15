package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* renamed from: evz */
final /* synthetic */ class evz implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final Dialog f15910a;

    /* renamed from: b */
    private final Uri f15911b;

    public evz(Dialog dialog, Uri uri) {
        this.f15910a = dialog;
        this.f15911b = uri;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Dialog dialog = this.f15910a;
        Uri uri = this.f15911b;
        TextView textView = (TextView) dialog.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            if (cbro.m128199c()) {
                C1280ps.m19894a(textView, new ewe(uri));
            }
        }
    }
}
