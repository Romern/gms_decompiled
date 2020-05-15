package p000;

import android.os.AsyncTask;

/* renamed from: mxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mxz extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ mvt f34917a;

    /* renamed from: b */
    final /* synthetic */ mya f34918b;

    public mxz(mya mya, mvt mvt) {
        this.f34918b = mya;
        this.f34917a = mvt;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return this.f34917a.mo20271a();
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        this.f34918b.f34919a.remove(this);
    }

    /* access modifiers changed from: protected */
    public final void onPostExecute(Object obj) {
        this.f34918b.f34919a.remove(this);
        this.f34917a.mo20272a(obj);
    }
}
