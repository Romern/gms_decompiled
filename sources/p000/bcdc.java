package p000;

import android.os.AsyncTask;

/* renamed from: bcdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcdc extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ bcde f103978a;

    public bcdc(bcde bcde) {
        this.f103978a = bcde;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return this.f103978a.f103989j.mo56707c();
    }

    /* access modifiers changed from: protected */
    public final void onPostExecute(Object obj) {
        this.f103978a.commitContentChanged();
        bcde bcde = this.f103978a;
        bcde.f103988i = false;
        if (bcde.isStarted()) {
            String valueOf = String.valueOf(bcde.f103981b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
            sb.append("delivering: ");
            sb.append(valueOf);
            bbos.m88289a("DatabaseUriMonitor", sb.toString());
            bcde.f103989j.mo56705a(obj);
        }
    }
}
