package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.common.download.DownloadIntentOperation;
import com.google.android.gms.common.download.DownloadServiceSettingsChimeraActivity;
import java.io.File;

/* renamed from: ryb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryb extends DialogFragment {
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.widget.ImageView} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Dialog onCreateDialog(Bundle bundle) {
        ImageView imageView;
        Activity activity = getActivity();
        File b = DownloadIntentOperation.m22560b(activity, DownloadServiceSettingsChimeraActivity.m22572e().f30175a);
        if (b == null) {
            TextView textView = new TextView(activity);
            textView.setText((int) C0126R.string.download_msg_error_invalid);
            imageView = textView;
        } else {
            ImageView imageView2 = new ImageView(activity);
            imageView2.setContentDescription("google_logo_fragment_desc");
            imageView2.setImageURI(Uri.fromFile(b));
            imageView = imageView2;
        }
        return new AlertDialog.Builder(activity).setView(imageView).setCancelable(true).create();
    }
}
