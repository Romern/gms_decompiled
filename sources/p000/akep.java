package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: akep */
final /* synthetic */ class akep implements Runnable {

    /* renamed from: a */
    private final akgy f71750a;

    /* renamed from: b */
    private final String f71751b;

    public akep(akgy akgy, String str) {
        this.f71750a = akgy;
        this.f71751b = str;
    }

    public final void run() {
        akgy akgy = this.f71750a;
        String str = this.f71751b;
        ((ClipboardManager) akgy.f71939f.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(akgy.f71939f.getString(C0126R.string.sharing_product_name), str));
        if (cfov.m142048X()) {
            akgy.mo39376a(0, (int) C0126R.string.sharing_toast_copied_to_clipboard, str);
        } else {
            Context context = akgy.f71939f;
            Toast.makeText(context, context.getString(C0126R.string.sharing_toast_copied_to_clipboard, str), 0).show();
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "f", 2954, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Copied %s to clipboard", str);
    }
}
