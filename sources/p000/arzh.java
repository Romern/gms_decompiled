package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;

/* renamed from: arzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arzh extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ allh f88519a;

    /* renamed from: b */
    final /* synthetic */ arzi f88520b;

    public arzh(arzi arzi, allh allh) {
        this.f88520b = arzi;
        this.f88519a = allh;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return alls.m61238a(this.f88519a.mo40486b());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        arzi arzi = this.f88520b;
        arzi.f88522b.f88524b.put(arzi.f88521a, (Bitmap) obj);
        for (arzj arzj : this.f88520b.f88522b.f88525c) {
            arzj.mo48967a();
        }
    }
}
