package p000;

import android.util.Log;

/* renamed from: brha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brha implements brhc {

    /* renamed from: a */
    private static final String f142842a = brha.class.getSimpleName();

    /* renamed from: a */
    public final void mo69531a(int i, brhb brhb) {
        String valueOf = String.valueOf(brhb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("FeliCa Event: ");
        sb.append(i);
        sb.append(", data: ");
        sb.append(valueOf);
        sb.toString();
    }

    /* renamed from: a */
    public final void mo69532a(String str, String str2, Object obj) {
        if (obj instanceof Throwable) {
            Log.e(f142842a, str2, (Throwable) obj);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append(str2);
        sb.append(valueOf);
        Log.e(str, sb.toString());
    }
}
