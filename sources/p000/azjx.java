package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class azjx extends DialogFragment {

    /* renamed from: a */
    ImageView f99539a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final CardChimeraActivity mo9306a() {
        return (CardChimeraActivity) getActivity();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54978a(AlertDialog.Builder builder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54979a(ImageView imageView);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54980a(TextView textView);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo54982b(TextView textView);

    public final Dialog onCreateDialog(Bundle bundle) {
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.ms_first_time_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.first_time_dialog_title);
        mo54980a(textView);
        mo54982b((TextView) inflate.findViewById(C0126R.C0129id.first_time_dialog_content_text));
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.app_icon);
        this.f99539a = imageView;
        mo54979a(imageView);
        int i = Build.VERSION.SDK_INT;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), 2132019842);
        builder.setView(inflate);
        mo54978a(builder);
        AlertDialog create = builder.create();
        Window window = create.getWindow();
        window.requestFeature(1);
        window.setGravity(49);
        create.setOnShowListener(new azjv(this, window, textView));
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Activity activity = getActivity();
        if (activity != null) {
            mo54981a(activity);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54981a(Activity activity) {
        if (activity instanceof azjw) {
            ((azjw) activity).mo54977a();
        } else {
            azoj.m85933c("Dialog", "Failed to invoke onDialogDismissed on activity", new Object[0]);
        }
    }
}
