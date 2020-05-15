package p000;

import android.os.AsyncTask;
import java.io.IOException;

/* renamed from: jzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzy extends AsyncTask {

    /* renamed from: a */
    private final jzt f23591a;

    public jzy(jzt jzt) {
        this.f23591a = jzt;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            return addi.m50206a(this.f23591a.f23588a.getActivity().getApplicationContext()).mo33343a(((String[]) objArr)[0], "GCM");
        } catch (IOException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        jzt jzt = this.f23591a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("window.setIIDToken('");
        sb.append(str);
        sb.append("');");
        jzt.f23588a.mo14280f(sb.toString());
    }
}
