package p000;

import android.util.Log;

/* renamed from: rcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rcb extends aebf {
    /* renamed from: a */
    public final void mo24458a(int i) {
        StringBuilder sb = new StringBuilder("RequestUpload finished with status: ");
        if (i != 2) {
            sb.append("RESULT SUCCESS");
        } else {
            sb.append("RESULT FAILURE");
        }
        Log.i("RequestUploadService", sb.toString());
    }
}
