package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;

/* renamed from: aesv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aesv extends DialogFragment implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public static aesv m52523a(String str, String str2, String str3, String str4) {
        aesv aesv = new aesv();
        aesv.mo34529b(str, str2, str3, str4);
        return aesv;
    }

    /* renamed from: c */
    private final aesu m52524c() {
        if (getTargetFragment() instanceof aesu) {
            return (aesu) getTargetFragment();
        }
        if (getActivity() instanceof aesu) {
            return (aesu) getActivity();
        }
        return null;
    }

    /* renamed from: b */
    public final Context mo34528b() {
        int i = Build.VERSION.SDK_INT;
        return getActivity();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        aesu c = m52524c();
        if (c != null) {
            getArguments();
            c.mo34525a(getTag());
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        aesu c = m52524c();
        if (c == null) {
            return;
        }
        if (i == -2) {
            getArguments();
            c.mo34526b(getTag());
        } else if (i == -1) {
            getArguments();
            c.mo34527c(getTag());
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return mo9306a().create();
    }

    public void onResume() {
        TextView textView;
        super.onResume();
        if (getDialog() != null && (textView = (TextView) getDialog().findViewById(16908299)) != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AlertDialog.Builder mo9306a() {
        Bundle arguments = getArguments();
        AlertDialog.Builder builder = new AlertDialog.Builder(mo34528b());
        if (arguments.containsKey("title")) {
            builder.setTitle(arguments.getString("title"));
        }
        if (arguments.containsKey("message")) {
            builder.setMessage(Html.fromHtml(arguments.getString("message")));
        }
        if (arguments.containsKey("positive")) {
            builder.setPositiveButton(arguments.getString("positive"), this);
        }
        if (arguments.containsKey("negative")) {
            builder.setNegativeButton(arguments.getString("negative"), this);
        }
        return builder;
    }

    /* renamed from: b */
    public final void mo34529b(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("title", str);
        }
        if (str2 != null) {
            bundle.putString("message", str2);
        }
        if (str3 != null) {
            bundle.putString("positive", str3);
        }
        if (str4 != null) {
            bundle.putString("negative", str4);
        }
        setArguments(bundle);
    }
}
