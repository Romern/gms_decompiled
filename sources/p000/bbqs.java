package p000;

import android.os.AsyncTask;

/* renamed from: bbqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbqs extends AsyncTask {

    /* renamed from: a */
    final bbqr f103076a;

    /* renamed from: b */
    final bdyx f103077b;

    public bbqs(bbqr bbqr, bdyx bdyx) {
        this.f103076a = bbqr;
        this.f103077b = bdyx;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return this.f103077b.mo58455c();
    }

    /* access modifiers changed from: protected */
    public final void onPostExecute(Object obj) {
        this.f103076a.mo56377a(obj);
    }
}
