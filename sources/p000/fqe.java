package p000;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: fqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fqe extends DialogFragment implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = getActivity();
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("gms:ads:ads_identifier:adid_key");
        contentValues.putNull("gms:ads:ads_identifier:enable_limit_ad_tracking");
        activity.getContentResolver().update(new Uri.Builder().scheme("content").authority("com.google.android.gsf.gservices").appendPath("override").build(), contentValues, null, null);
        ((ActivityManager) activity.getSystemService("activity")).clearApplicationUserData();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(getActivity()).setTitle(getActivity().getText(C0126R.string.icing_storage_management_clear_all_data_dlg_title)).setIconAttribute(16843605).setMessage(getActivity().getText(C0126R.string.icing_storage_management_clear_all_data_dlg_text)).setPositiveButton(17039370, this).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }
}
