package p000;

import android.os.AsyncTask;
import com.google.android.gms.smartdevice.setup.p066ui.D2DSetupChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: aryg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aryg extends AsyncTask {

    /* renamed from: a */
    private final WeakReference f88451a;

    public aryg(D2DSetupChimeraActivity d2DSetupChimeraActivity) {
        this.f88451a = new WeakReference(d2DSetupChimeraActivity);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        D2DSetupChimeraActivity d2DSetupChimeraActivity = (D2DSetupChimeraActivity) this.f88451a.get();
        if (d2DSetupChimeraActivity != null) {
            return asbw.m73763a(d2DSetupChimeraActivity);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        D2DSetupChimeraActivity d2DSetupChimeraActivity = (D2DSetupChimeraActivity) this.f88451a.get();
        if (d2DSetupChimeraActivity != null) {
            d2DSetupChimeraActivity.f108203f = str;
        }
    }
}
