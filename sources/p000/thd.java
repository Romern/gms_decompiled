package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: thd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class thd implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f46010a;

    /* renamed from: b */
    final /* synthetic */ String f46011b;

    public thd(Context context, String str) {
        this.f46010a = context;
        this.f46011b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.f46011b;
        ((ClipboardManager) this.f46010a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
    }
}
