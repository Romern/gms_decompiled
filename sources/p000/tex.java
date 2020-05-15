package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: tex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tex implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f45807a;

    /* renamed from: b */
    final /* synthetic */ String f45808b;

    public tex(Context context, String str) {
        this.f45807a = context;
        this.f45808b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.f45808b;
        ((ClipboardManager) this.f45807a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
    }
}
