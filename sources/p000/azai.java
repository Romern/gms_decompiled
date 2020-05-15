package p000;

import android.content.DialogInterface;
import com.google.android.chimera.DialogFragment;

/* renamed from: azai */
public final /* synthetic */ class azai implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final DialogFragment f98833a;

    /* renamed from: b */
    private final DialogInterface.OnShowListener f98834b;

    public azai(DialogFragment dialogFragment, DialogInterface.OnShowListener onShowListener) {
        this.f98833a = dialogFragment;
        this.f98834b = onShowListener;
    }

    public final void onShow(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.f98833a;
        DialogInterface.OnShowListener onShowListener = this.f98834b;
        if (dialogInterface != null && dialogFragment.getDialog() != null) {
            onShowListener.onShow(dialogInterface);
        }
    }
}
