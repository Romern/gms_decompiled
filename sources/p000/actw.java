package p000;

import android.os.AsyncTask;
import android.view.View;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: actw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class actw extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ actx f60769a;

    /* renamed from: b */
    private final actr f60770b;

    /* renamed from: c */
    private final View f60771c;

    public actw(actx actx, View view, actr actr) {
        this.f60769a = actx;
        this.f60770b = actr;
        this.f60771c = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Integer mo33084a() {
        apqb a = aplx.m70648a(this.f60769a.f60772a);
        actr actr = this.f60770b;
        String str = actr.f60764c;
        boolean z = ((svm) actr).f45239a;
        roz b = rpa.m34196b();
        b.f43472a = new apqs(str, !z);
        try {
            aucu.m76783a(((rjx) a).mo24701a(b.mo24977a()), 5, TimeUnit.SECONDS);
            return 0;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e.getCause() instanceof rjp) {
                return Integer.valueOf(((rjp) e.getCause()).mo24655a());
            }
            return 8;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return mo33084a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (this.f60769a.f60773b && num.intValue() == 0) {
            ((CompoundButton) this.f60771c.findViewById(C0126R.C0129id.toggle)).toggle();
            this.f60770b.toggle();
        }
    }
}
