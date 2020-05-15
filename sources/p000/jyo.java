package p000;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: jyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jyo extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ jyp f23536a;

    /* renamed from: b */
    private final Map f23537b;

    public jyo(jyp jyp, Map map) {
        this.f23536a = jyp;
        this.f23537b = map;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        jyp jyp = this.f23536a;
        sek sek = jyp.f23538a;
        jyn jyn = jyp.f23542e;
        if (jyn == null) {
            jyp.f23538a.mo25416d("DroidGuardHandleTask null", new Object[0]);
            return null;
        }
        try {
            vvq vvq = (vvq) jyn.get();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            String a = vvq.mo28905a(this.f23537b);
            jyp.f23538a.mo25412b("snapshot: %sms", Long.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
            return a;
        } catch (InterruptedException | ExecutionException e) {
            jyp.f23538a.mo25415d("Error getting DroidGuardHandle", e, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.f23536a.deliverResult((String) obj);
    }
}
