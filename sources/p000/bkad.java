package p000;

import android.os.AsyncTask;
import android.view.View;
import java.util.ArrayList;

/* renamed from: bkad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkad extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ bkaf f123728a;

    /* renamed from: b */
    private final View f123729b;

    /* renamed from: c */
    private final String f123730c;

    /* renamed from: d */
    private final ArrayList f123731d;

    public bkad(bkaf bkaf, View view) {
        this.f123728a = bkaf;
        this.f123729b = view;
        this.f123730c = bkaf.mo65716i();
        ArrayList arrayList = bkaf.f123748L;
        this.f123731d = arrayList != null ? new ArrayList(arrayList) : new ArrayList();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        bjtj bjtj = ((bjtj[]) objArr)[0];
        if (bjtj == null || bjtj.f123277f == null) {
            return null;
        }
        int size = this.f123731d.size();
        for (int i = 0; i < size; i++) {
            bjth bjth = (bjth) this.f123731d.get(i);
            if (bjtj.f123277f.equals(bjth.mo65523a())) {
                return bjth.mo65522a(bjtj.f123278g, this.f123730c);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        btwp btwp = (btwp) obj;
        bkaf bkaf = this.f123728a;
        int i = bkaf.f123732W;
        if (bkaf.f124073X != null) {
            super.onPostExecute(btwp);
            if (btwp != null) {
                this.f123728a.mo65698a(this.f123729b, btwp);
            }
        }
    }
}
