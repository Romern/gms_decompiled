package p000;

import android.app.AlertDialog;
import android.content.Context;
import com.felicanetworks.mfc.C0126R;

/* renamed from: albw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albw {
    /* renamed from: a */
    public static void m60828a(int i, Context context, albu albu) {
        CharSequence text = context.getText(i);
        AlertDialog create = new AlertDialog.Builder(context).create();
        create.setTitle((int) C0126R.string.panorama_cannot_display_pano);
        create.setMessage(text);
        create.setButton(-3, context.getText(C0126R.string.panorama_ok), new albv(albu));
        create.show();
    }
}
