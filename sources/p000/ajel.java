package p000;

import android.content.Context;
import com.android.volley.RetryPolicy;

/* renamed from: ajel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajel extends ajec {
    public ajel(Context context, String str, int i) {
        super(context, str, i);
    }

    /* renamed from: b */
    public final RetryPolicy mo38543b(String str) {
        return new sgu(this, str, 10);
    }
}
