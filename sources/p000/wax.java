package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: wax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wax implements dfo {
    /* renamed from: a */
    public final void mo8860a(Context context, int i) {
        mo8861a(context, i, "");
    }

    /* renamed from: a */
    public final void mo8861a(Context context, int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("[");
        sb.append(i - 1);
        sb.append("] ");
        sb.append(str);
        Log.i("DynamiteLoaderV2", sb.toString());
    }
}
