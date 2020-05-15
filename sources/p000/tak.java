package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: tak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tak extends AsyncTask {

    /* renamed from: a */
    private final WeakReference f45563a;

    /* renamed from: b */
    private final String f45564b;

    /* renamed from: c */
    private final Bundle f45565c;

    /* renamed from: d */
    private final tdx f45566d;

    /* renamed from: e */
    private final tbg f45567e;

    /* renamed from: f */
    private String f45568f;

    public tak(String str, String str2, Bundle bundle, Context context, tdx tdx, tbg tbg) {
        this.f45563a = new WeakReference(context);
        this.f45564b = str;
        this.f45568f = str2;
        this.f45565c = bundle;
        this.f45566d = tdx;
        this.f45567e = tbg;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (TextUtils.isEmpty(this.f45564b)) {
            return "";
        }
        if (TextUtils.isEmpty(this.f45568f)) {
            this.f45568f = "GCM";
        }
        Context context = (Context) this.f45563a.get();
        if (context == null) {
            return "";
        }
        try {
            return addi.m50206a(context).mo33344a(this.f45564b, this.f45568f, this.f45565c);
        } catch (IOException e) {
            tds.m36774a(context).mo26410a(this.f45566d, 34, e);
            tam.f45571a.mo25417e("Error getting IidToken", e, new Object[0]);
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        tbg tbg = this.f45567e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("window.setIidToken('");
        sb.append(str);
        sb.append("');");
        tbg.mo17983b(sb.toString());
    }
}
