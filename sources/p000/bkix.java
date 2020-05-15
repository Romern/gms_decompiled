package p000;

import android.content.DialogInterface;

/* renamed from: bkix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkix extends bkbq {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo66063a(bkiw bkiw) {
        throw null;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (getTargetFragment() instanceof bkiw) {
            mo66063a((bkiw) getTargetFragment());
        }
    }
}
