package p000;

import android.content.Context;
import android.os.AsyncTask;

/* renamed from: aptk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aptk extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ Context f84853a;

    /* renamed from: b */
    final /* synthetic */ aptl f84854b;

    public aptk(Context context, aptl aptl) {
        this.f84853a = context;
        this.f84854b = aptl;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            aptm.m70976a(this.f84853a);
            return 0;
        } catch (rfw e) {
            return Integer.valueOf(e.f42890a);
        } catch (rfv e2) {
            return Integer.valueOf(e2.f42889a);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f84854b.mo47595a();
            return;
        }
        this.f84854b.mo47596a(num.intValue(), aptm.f84855a.mo24591b(this.f84853a, num.intValue(), "pi"));
    }
}
