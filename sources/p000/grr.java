package p000;

import android.os.AsyncTask;
import java.util.List;

/* renamed from: grr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class grr extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ Runnable f18902a;

    /* renamed from: b */
    final /* synthetic */ String f18903b;

    /* renamed from: c */
    final /* synthetic */ boolean f18904c;

    /* renamed from: d */
    final /* synthetic */ grs f18905d;

    public grr(grs grs, Runnable runnable, String str, boolean z) {
        this.f18905d = grs;
        this.f18902a = runnable;
        this.f18903b = str;
        this.f18904c = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return this.f18905d.f18907b.mo12137a(this.f18903b, this.f18904c);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        List list = (List) obj;
        this.f18905d.f18908c.removeCallbacks(this.f18902a);
        if (list == null || list.isEmpty()) {
            this.f18905d.f18906a.mo7383g();
        } else if (list.size() != 1) {
            this.f18905d.f18906a.mo7381a((String) list.get(0), (String) list.get(1));
        } else {
            this.f18905d.f18906a.mo7380a((String) list.get(0));
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        this.f18905d.f18908c.postDelayed(this.f18902a, 100);
    }
}
