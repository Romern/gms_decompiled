package p000;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.util.Log;

/* renamed from: saz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class saz implements DialogInterface.OnClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25323a();

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo25323a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } catch (Throwable th) {
            dialogInterface.dismiss();
            throw th;
        }
        dialogInterface.dismiss();
    }
}
