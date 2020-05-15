package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.p037ui.ErrorDialogActivity;

/* renamed from: sok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sok {

    /* renamed from: a */
    public final Intent f44864a;

    public sok(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW").setClass(context, ErrorDialogActivity.class).setPackage("com.google.android.gms");
        this.f44864a = intent;
        intent.addFlags(603979776);
        this.f44864a.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE", -1);
    }
}
