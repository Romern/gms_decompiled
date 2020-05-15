package p000;

import android.content.Intent;
import com.android.volley.VolleyError;

/* renamed from: attk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class attk implements atfd {

    /* renamed from: a */
    final /* synthetic */ attl f90878a;

    public attk(attl attl) {
        this.f90878a = attl;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        bnsl bnsl = (bnsl) attl.f90879a.mo68387b();
        bnsl.mo68437a(volleyError);
        bnsl.mo68432a("attk", "onErrorResponse", 43, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Unexpected RemoteException");
        if (volleyError != null) {
            this.f90878a.mo50183a(atff.m75758a(volleyError));
            return;
        }
        this.f90878a.mo50183a((btnf) null);
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        btkf btkf = (btkf) obj;
        srn srn = attl.f90879a;
        String str = btkf.f149249a;
        this.f90878a.mo50179a(-1, new Intent().putExtra("extra_tokenization_session_id", btkf.f149249a).putExtra("tokenization_result_code", 1));
        this.f90878a.mo50178a();
    }
}
