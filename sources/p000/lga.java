package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.autofill.AutofillId;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import java.util.HashSet;

/* renamed from: lga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lga implements lgd {

    /* renamed from: b */
    private static final srn f26018b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    public final Context f26019a;

    /* renamed from: c */
    private final kdi f26020c;

    /* renamed from: d */
    private final lhi f26021d;

    public lga(Context context, kdi kdi, lhi lhi) {
        this.f26019a = context;
        this.f26020c = kdi;
        this.f26021d = lhi;
    }

    /* renamed from: a */
    public final bngx mo15054a(lgc lgc) {
        bmxv bmxv;
        HashSet<AutofillId> hashSet = new HashSet();
        if (this.f26021d.mo15088h()) {
            bnrd a = lgc.f26026b.f24277b.iterator();
            while (a.hasNext()) {
                hashSet.add((AutofillId) ((kjl) a.next()).mo14516a().f24609h);
            }
        } else if (ccip.f179070a.mo6606a().mo76054q()) {
            kqm kqm = lgc.f26028d;
            HashSet<FillField> hashSet2 = new HashSet();
            bnrd a2 = kqm.mo14791b().values().iterator();
            while (a2.hasNext()) {
                hashSet2.addAll((bngm) a2.next());
            }
            for (FillField fillField : hashSet2) {
                hashSet.add(fillField.f11631a);
            }
        }
        if (hashSet.isEmpty()) {
            return bngx.m109376e();
        }
        bmxv a3 = lgc.mo15061a();
        Intent a4 = kyu.m18810a(this.f26019a, this.f26020c);
        if (a4 == null) {
            ((bnsl) f26018b.mo68388c()).mo68405a("Can't create an Intent for feedback");
            bmxv = bmvz.f131120a;
        } else {
            bmxv = bmxv.m108566b(PendingIntent.getService(this.f26019a, 0, a4, 134217728));
        }
        if (!bmxv.mo66813a()) {
            return bngx.m109376e();
        }
        Context context = this.f26019a;
        lrc a5 = lbj.m18891a(context);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), qkj.m32287a(context, C0126R.C0128layout.autofill_dataset_left));
        int a6 = a5.mo15383a((int) C0126R.dimen.autofill_view_padding);
        remoteViews.setViewPadding(16908308, 0, a6, a6, a6);
        remoteViews.setTextColor(16908308, lbj.m18884a(lbj.m18895b(context), context));
        remoteViews.setTextViewText(16908308, "Send feedback");
        remoteViews.setViewVisibility(16908309, 8);
        remoteViews.setImageViewResource(16908295, qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_message_grey600_24));
        remoteViews.setViewPadding(16908295, a6, a6, a6, a6);
        remoteViews.setOnClickPendingIntent(16908290, (PendingIntent) bmxv.mo66814b());
        bmxv a7 = a3.mo66810a((bmxj) new lfz(this));
        kby a8 = kbz.m17615a();
        for (AutofillId autofillId : hashSet) {
            a8.mo14355a(autofillId, null, remoteViews, a7);
        }
        if (a7.mo66813a()) {
            a8.mo14353a(((PendingIntent) bmxv.mo66814b()).getIntentSender());
        }
        kbz a9 = a8.mo14352a();
        if (a9 == null) {
            return bngx.m109376e();
        }
        return bngx.m109356a(new lgb(a9, lbe.FEEDBACK));
    }
}
