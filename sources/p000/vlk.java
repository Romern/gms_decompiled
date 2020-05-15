package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.widget.TextView;

/* renamed from: vlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vlk {

    /* renamed from: a */
    public static final DialogInterface.OnKeyListener f49440a = vlj.f49439a;

    /* renamed from: a */
    public static Context m40825a(Context context) {
        return new ContextThemeWrapper(context, 2132019717);
    }

    /* renamed from: a */
    public static void m40826a(TextView textView, Dialog dialog) {
        sdo.m34959a(dialog);
        textView.setOnEditorActionListener(new vli(dialog));
    }
}
