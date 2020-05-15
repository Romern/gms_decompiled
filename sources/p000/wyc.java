package p000;

import android.os.AsyncTask;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.feedback.ShowTextChimeraActivity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: wyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyc extends AsyncTask {

    /* renamed from: a */
    private final String f51560a;

    /* renamed from: b */
    private final WeakReference f51561b;

    public wyc(String str, ShowTextChimeraActivity showTextChimeraActivity) {
        this.f51560a = str;
        this.f51561b = new WeakReference(showTextChimeraActivity);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        AsyncTask asyncTask;
        Void[] voidArr = (Void[]) objArr;
        ShowTextChimeraActivity showTextChimeraActivity = (ShowTextChimeraActivity) this.f51561b.get();
        if (showTextChimeraActivity == null) {
            return null;
        }
        try {
            File file = new File(new File(showTextChimeraActivity.getFilesDir().getPath(), "reports"), String.valueOf(this.f51560a).concat(".txt"));
            ArrayList arrayList = new ArrayList();
            if (!file.exists() || !file.canRead()) {
                asyncTask = null;
            } else {
                asyncTask = new wxe(file, arrayList).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
            if (asyncTask != null) {
                return (String[]) asyncTask.get();
            }
            return null;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("gf_ShowTextActivity", "Failed to read the file.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        ShowTextChimeraActivity showTextChimeraActivity = (ShowTextChimeraActivity) this.f51561b.get();
        if (showTextChimeraActivity != null) {
            showTextChimeraActivity.findViewById(C0126R.C0129id.gf_progress_spinner_for_text).setVisibility(8);
            showTextChimeraActivity.findViewById(C0126R.C0129id.gf_container_for_text).setVisibility(0);
            showTextChimeraActivity.mo18623a(strArr);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        ShowTextChimeraActivity showTextChimeraActivity = (ShowTextChimeraActivity) this.f51561b.get();
        if (showTextChimeraActivity != null) {
            showTextChimeraActivity.findViewById(C0126R.C0129id.gf_progress_spinner_for_text).setVisibility(0);
            showTextChimeraActivity.findViewById(C0126R.C0129id.gf_container_for_text).setVisibility(8);
        }
    }
}
