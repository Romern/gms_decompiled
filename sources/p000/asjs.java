package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import java.io.File;

/* renamed from: asjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjs {

    /* renamed from: a */
    public final File f89094a;

    /* renamed from: b */
    public final int f89095b;

    public asjs(Context context, String str) {
        sdo.m34959a((Object) str);
        this.f89094a = new File(new File(context.getFilesDir(), "android_pay_card_art"), asmd.m74372a(str));
        this.f89095b = Math.min(Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels), context.getResources().getDimensionPixelSize(C0126R.dimen.tp_card_art_max_request_width));
    }

    /* renamed from: a */
    public final String mo49202a(String str) {
        return new File(this.f89094a, asmd.m74372a(str)).getPath();
    }
}
