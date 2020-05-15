package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: aonf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aonf extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private int f78567a;

    /* renamed from: b */
    private int f78568b;

    /* renamed from: c */
    private int f78569c;

    /* renamed from: d */
    private int f78570d;

    /* renamed from: a */
    public static aonf m66133a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("title", 0);
        bundle.putInt("message", i);
        bundle.putInt("finish_button", 17039370);
        bundle.putInt("retry_button", 0);
        aonf aonf = new aonf();
        aonf.setArguments(bundle);
        return aonf;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m66134a(true);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        m66134a(i == -2);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f78567a = arguments.getInt("title");
        this.f78568b = arguments.getInt("message");
        this.f78569c = arguments.getInt("finish_button");
        this.f78570d = arguments.getInt("retry_button");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019651));
        int i = this.f78567a;
        if (i != 0) {
            builder.setTitle(i);
        }
        builder.setMessage(this.f78568b).setNegativeButton(this.f78569c, this).setCancelable(true);
        int i2 = this.f78570d;
        if (i2 != 0) {
            builder.setPositiveButton(i2, this);
        }
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    /* renamed from: a */
    private final void m66134a(boolean z) {
        Activity activity;
        if (z && (activity = getActivity()) != null) {
            activity.setResult(0);
            activity.finish();
        }
        dismiss();
    }
}
