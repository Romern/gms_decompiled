package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: amis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amis extends DialogFragment implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener {

    /* renamed from: a */
    private static String[] f74945a;

    /* renamed from: b */
    private static String f74946b;

    /* renamed from: c */
    private static String f74947c;

    /* renamed from: a */
    private static String[] m62951a(Context context) {
        if (f74945a == null) {
            f74946b = context.getString(C0126R.string.common_take_photo_label);
            f74947c = context.getString(C0126R.string.people_avatar_dialog_item_pick_photo);
            boolean isEmpty = context.getPackageManager().queryIntentActivities(new Intent("android.media.action.IMAGE_CAPTURE"), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).isEmpty();
            ArrayList arrayList = new ArrayList();
            if (!isEmpty) {
                arrayList.add(f74946b);
            }
            arrayList.add(f74947c);
            f74945a = (String[]) arrayList.toArray(new String[0]);
        }
        return f74945a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ((amir) getActivity()).mo41197c();
        dismiss();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = m62951a(getActivity())[i];
        if (f74946b.equals(str)) {
            ((amir) getActivity()).mo41195a();
            dismiss();
        } else if (f74947c.equals(str)) {
            ((amir) getActivity()).mo41196b();
            dismiss();
        } else {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Unrecognized avatar source option: ") : "Unrecognized avatar source option: ".concat(valueOf));
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132018565));
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83332bI()).booleanValue()) {
            alertDialog = builder.setTitle((int) C0126R.string.people_set_avatar_redirect_title).setMessage((int) C0126R.string.people_set_avatar_redirect_message).setPositiveButton((int) C0126R.string.people_set_avatar_open_browser, new amip(this)).setNegativeButton((int) C0126R.string.common_cancel, new amiq(this)).create();
        } else {
            alertDialog = builder.setTitle((int) C0126R.string.people_avatar_dialog_title).setItems(m62951a(getActivity()), this).create();
        }
        alertDialog.setCancelable(true);
        alertDialog.setCanceledOnTouchOutside(true);
        alertDialog.setOnKeyListener(this);
        return alertDialog;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        ((amir) getActivity()).mo41197c();
        dismiss();
        return true;
    }
}
