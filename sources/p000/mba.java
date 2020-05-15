package p000;

import android.app.AlertDialog;
import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ContextThemeWrapper;

/* renamed from: mba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mba {
    /* renamed from: a */
    public static AlertDialog.Builder m24785a(Context context) {
        if (ccod.m130982c()) {
            context = new ContextThemeWrapper(context, (int) C0126R.style.BackupAlertDialog);
        }
        return new AlertDialog.Builder(context);
    }
}
