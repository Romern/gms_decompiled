package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: aryu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aryu extends DialogFragment {

    /* renamed from: a */
    public int f88482a;

    /* renamed from: b */
    public aryt f88483b;

    /* renamed from: c */
    private String f88484c;

    /* renamed from: d */
    private String f88485d;

    /* renamed from: e */
    private String f88486e;

    /* renamed from: f */
    private String f88487f;

    /* renamed from: g */
    private boolean f88488g;

    /* renamed from: a */
    public static DialogFragment m73694a(int i, String str, String str2, String str3, String str4, boolean z) {
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str3);
        aryu aryu = new aryu();
        Bundle bundle = new Bundle();
        bundle.putInt("smartdevice.id", i);
        bundle.putString("smartdevice.title", str);
        bundle.putString("smartdevice.positiveButtonText", str3);
        bundle.putBoolean("smartdevice.cancelable", z);
        bundle.putString("smartdevice.message", str2);
        bundle.putString("smartdevice.negativeButtonText", str4);
        aryu.setArguments(bundle);
        return aryu;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f88483b = (aryt) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implement ErrorAlertDialogFragment.Listener", e);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f88483b.mo48948a(this.f88482a, 4);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        this.f88482a = arguments.getInt("smartdevice.id");
        this.f88482a = arguments.getInt("smartdevice.id");
        String string = arguments.getString("smartdevice.title");
        sdo.m34959a((Object) string);
        this.f88484c = string;
        this.f88485d = arguments.getString("smartdevice.message");
        String string2 = arguments.getString("smartdevice.positiveButtonText");
        sdo.m34959a((Object) string2);
        this.f88486e = string2;
        this.f88487f = arguments.getString("smartdevice.negativeButtonText");
        this.f88488g = arguments.getBoolean("smartdevice.cancelable");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        if (activity != null) {
            AlertDialog.Builder cancelable = new AlertDialog.Builder(activity).setTitle(this.f88484c).setPositiveButton(this.f88486e, new aryr(this)).setCancelable(this.f88488g);
            if (!TextUtils.isEmpty(this.f88485d)) {
                cancelable.setMessage(this.f88485d);
            }
            if (!TextUtils.isEmpty(this.f88487f)) {
                cancelable.setNegativeButton(this.f88487f, new arys(this));
            }
            AlertDialog create = cancelable.create();
            create.setCanceledOnTouchOutside(this.f88488g);
            return create;
        }
        throw new IllegalStateException("activity null");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f88483b.mo48948a(this.f88482a, 3);
    }
}
