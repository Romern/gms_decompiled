package p000;

import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: taj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class taj extends AsyncTask {

    /* renamed from: a */
    private final Map f45558a;

    /* renamed from: b */
    private final String f45559b;

    /* renamed from: c */
    private final WeakReference f45560c;

    /* renamed from: d */
    private final tdj f45561d;

    /* renamed from: e */
    private final tbg f45562e;

    public taj(Map map, String str, Context context, tdj tdj, tbg tbg) {
        this.f45558a = map;
        this.f45559b = str;
        this.f45560c = new WeakReference(context);
        this.f45561d = tdj;
        this.f45562e = tbg;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Context context = (Context) this.f45560c.get();
        if (context == null || this.f45558a.size() == 0) {
            return "";
        }
        tdj tdj = this.f45561d;
        String str = this.f45559b;
        Map map = this.f45558a;
        tdj.mo26397a(context, str);
        String a = tdj.mo26396a(map);
        tdj.f45697a.mo28907b();
        return a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        tbg tbg = this.f45562e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("window.setDroidguardResult('");
        sb.append(str);
        sb.append("');");
        tbg.mo17983b(sb.toString());
    }
}
