package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.autofill.AutofillId;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import java.util.HashSet;

/* renamed from: lfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lfy implements lgd {

    /* renamed from: b */
    private static final srn f26013b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    public final Context f26014a;

    public lfy(Context context) {
        this.f26014a = context;
    }

    /* renamed from: a */
    public final bngx mo15054a(lgc lgc) {
        HashSet<AutofillId> hashSet = new HashSet();
        bnrd a = lgc.f26026b.f24277b.iterator();
        while (a.hasNext()) {
            hashSet.add((AutofillId) ((kjl) a.next()).mo14516a().f24609h);
        }
        if (hashSet.isEmpty()) {
            return bngx.m109376e();
        }
        bmxv a2 = lgc.mo15061a();
        kby a3 = kbz.m17615a();
        Intent a4 = lio.m19192a(0);
        if (a4 == null) {
            ((bnsl) f26013b.mo68388c()).mo68405a("Can't create an Intent for debug info");
            return bngx.m109376e();
        }
        PendingIntent activity = PendingIntent.getActivity(this.f26014a, 0, a4, 134217728);
        if (activity == null) {
            return bngx.m109376e();
        }
        Context context = this.f26014a;
        lrc a5 = lbj.m18891a(context);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), qkj.m32287a(context, C0126R.C0128layout.autofill_dataset_left));
        int a6 = a5.mo15383a((int) C0126R.dimen.autofill_view_padding);
        remoteViews.setViewPadding(16908308, 0, a6, a6, a6);
        remoteViews.setTextColor(16908308, lbj.m18884a(lbj.m18895b(context), context));
        remoteViews.setTextViewText(16908308, "Debug Info");
        remoteViews.setViewVisibility(16908309, 8);
        remoteViews.setImageViewResource(16908295, qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_bug_report_grey600_24));
        remoteViews.setViewPadding(16908295, a6, a6, a6, a6);
        remoteViews.setOnClickPendingIntent(16908290, activity);
        bmxv a7 = a2.mo66810a((bmxj) new lfx(this));
        for (AutofillId autofillId : hashSet) {
            a3.mo14355a(autofillId, null, remoteViews, a7);
        }
        if (a7.mo66813a()) {
            a3.mo14353a(activity.getIntentSender());
        }
        kbz a8 = a3.mo14352a();
        if (a8 == null) {
            return bngx.m109376e();
        }
        return bngx.m109356a(new lgb(a8, lbe.DEBUG_INFO));
    }
}
