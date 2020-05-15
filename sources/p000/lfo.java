package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: lfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lfo implements lgd {

    /* renamed from: a */
    public final Context f25998a;

    /* renamed from: b */
    private final bmxv f25999b;

    public lfo(Context context, bmxv bmxv) {
        this.f25998a = context;
        this.f25999b = bmxv;
    }

    /* renamed from: a */
    public final bngx mo15054a(lgc lgc) {
        FillForm fillForm = lgc.f26027c;
        CharSequence text = this.f25998a.getText(C0126R.string.autofill_settings);
        kcz a = kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.quantum_ic_settings_grey600_24, lrc.m19570a(new ContextThemeWrapper(this.f25998a, 2132019641)).mo15386b(C0126R.string.autofill_settings));
        RemoteViews a2 = lbj.m18888a(this.f25998a, text, null, a, true, 1);
        bngs j = bngx.m109377j();
        bngx bngx = fillForm.f11641a;
        bmxv a3 = lgc.mo15061a().mo66810a((bmxj) new lfn(this, text, a));
        if (!bngx.isEmpty()) {
            kby a4 = kbz.m17615a();
            bnre i = bngx.listIterator();
            while (i.hasNext()) {
                a4.mo14355a(((FillField) i.next()).f11631a, null, a2, a3);
            }
            a4.mo14353a(PendingIntent.getActivity(this.f25998a, 0, lio.m19194a(4, this.f25999b), 134217728).getIntentSender());
            kbz a5 = a4.mo14352a();
            if (a5 != null) {
                j.mo67668c(new lgb(a5, lbe.AUTOFILL_SETTINGS));
            }
        }
        return j.mo67664a();
    }
}
