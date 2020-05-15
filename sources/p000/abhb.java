package p000;

import android.os.AsyncTask;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: abhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abhb extends AsyncTask {

    /* renamed from: a */
    private final WeakReference f57465a;

    /* renamed from: b */
    private final aasm f57466b;

    /* renamed from: c */
    private final boolean f57467c;

    /* renamed from: d */
    private final bqgj f57468d;

    public abhb(WeakReference weakReference, aasm aasm, boolean z, bqgj bqgj) {
        this.f57465a = weakReference;
        this.f57466b = aasm;
        this.f57467c = z;
        this.f57468d = bqgj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = (GoogleHelpRenderingApiWebViewChimeraActivity) this.f57465a.get();
        if (googleHelpRenderingApiWebViewChimeraActivity != null) {
            return abfn.m47620a(googleHelpRenderingApiWebViewChimeraActivity, this.f57466b, this.f57467c, this.f57468d);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        aasm aasm = (aasm) obj;
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = (GoogleHelpRenderingApiWebViewChimeraActivity) this.f57465a.get();
        if (googleHelpRenderingApiWebViewChimeraActivity == null) {
            return;
        }
        if (aasm == null) {
            if (googleHelpRenderingApiWebViewChimeraActivity.f79009f == null) {
                googleHelpRenderingApiWebViewChimeraActivity.f79009f = (LinearLayout) googleHelpRenderingApiWebViewChimeraActivity.getLayoutInflater().inflate((int) C0126R.C0128layout.gh_request_error, (ViewGroup) null);
            }
            LinearLayout linearLayout = googleHelpRenderingApiWebViewChimeraActivity.f79009f;
            if (linearLayout != null) {
                aatj.m46981a(linearLayout, (int) C0126R.string.common_something_went_wrong, new abhg(googleHelpRenderingApiWebViewChimeraActivity));
                googleHelpRenderingApiWebViewChimeraActivity.setContentView(googleHelpRenderingApiWebViewChimeraActivity.f79009f);
                return;
            }
            return;
        }
        String r = aasm.mo31735r();
        String str = aasm.f56496f;
        googleHelpRenderingApiWebViewChimeraActivity.f79005b = r;
        googleHelpRenderingApiWebViewChimeraActivity.f79006c = str;
        googleHelpRenderingApiWebViewChimeraActivity.runOnUiThread(new abhf(googleHelpRenderingApiWebViewChimeraActivity));
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = (GoogleHelpRenderingApiWebViewChimeraActivity) this.f57465a.get();
        if (googleHelpRenderingApiWebViewChimeraActivity != null) {
            googleHelpRenderingApiWebViewChimeraActivity.setContentView((int) C0126R.C0128layout.gh_rendering_api_web_view_progress_bar);
        }
    }
}
