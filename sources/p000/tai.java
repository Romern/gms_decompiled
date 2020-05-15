package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.json.JSONArray;

/* renamed from: tai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tai extends AsyncTask {

    /* renamed from: a */
    private final String f45553a;

    /* renamed from: b */
    private final Bundle f45554b;

    /* renamed from: c */
    private final tdj f45555c;

    /* renamed from: d */
    private final WeakReference f45556d;

    /* renamed from: e */
    private final tbg f45557e;

    public tai(String str, Bundle bundle, tdj tdj, Context context, tbg tbg) {
        this.f45553a = str;
        this.f45554b = bundle;
        this.f45555c = tdj;
        this.f45556d = new WeakReference(context);
        this.f45557e = tbg;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Context context = (Context) this.f45556d.get();
        if (context == null) {
            return "";
        }
        tdx tdx = new tdx(UUID.randomUUID().toString(), this.f45555c);
        tdk.m36757a();
        return new JSONArray(tdk.m36756a(tdx, this.f45553a, context, this.f45554b).values()).toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        tbg tbg = this.f45557e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("window.setGaiaAccessTokens('");
        sb.append(str);
        sb.append("');");
        tbg.mo17983b(sb.toString());
    }
}
