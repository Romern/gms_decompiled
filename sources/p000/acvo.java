package p000;

import android.content.Context;
import android.os.AsyncTask;
import com.felicanetworks.mfc.C0126R;
import java.util.concurrent.ExecutionException;

/* renamed from: acvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvo extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ acvp f60890a;

    public acvo(acvp acvp) {
        this.f60890a = acvp;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        boolean z = true;
        if (strArr.length != 1) {
            z = false;
        }
        sdo.m34974b(z);
        Context context = this.f60890a.getContext();
        if (context == null) {
            return 8;
        }
        String str = strArr[0];
        apne b = aplx.m70650b(context);
        roz b2 = rpa.m34196b();
        b2.f43472a = new apnw(str);
        try {
            aucu.m76782a(((rjx) b).mo24701a(b2.mo24977a()));
            return 0;
        } catch (InterruptedException | ExecutionException e) {
            if (e.getCause() instanceof rjp) {
                return Integer.valueOf(((rjp) e.getCause()).mo24655a());
            }
            return 8;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (this.f60890a.isAdded()) {
            this.f60890a.f60895e.setVisibility(8);
            Context context = this.f60890a.getContext();
            if (context == null) {
                return;
            }
            if (num.intValue() != 0) {
                acua.m49854a(context, "UPDATE_INDEX", context.getString(C0126R.string.failed_send_update_index, "UPDATE_INDEX"), num);
                return;
            }
            this.f60890a.f60894d.setVisibility(0);
            this.f60890a.f60905o.show();
            this.f60890a.mo33146a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.f60890a.isAdded()) {
            this.f60890a.f60894d.setVisibility(8);
            this.f60890a.f60895e.setVisibility(0);
        }
    }
}
