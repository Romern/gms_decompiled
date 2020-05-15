package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.autofill.AutofillId;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.service.fill.plugin.ManualPasswordPickerFillPlugin$PasswordPickerTransformer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/* renamed from: lgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lgj implements lgd {

    /* renamed from: a */
    public static final srn f26037a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public final Context f26038b;

    /* renamed from: c */
    private final Account f26039c;

    /* renamed from: d */
    private final kpk f26040d;

    /* renamed from: e */
    private final lrc f26041e;

    public lgj(Context context, Account account, kpk kpk) {
        this.f26038b = context;
        this.f26039c = account;
        this.f26040d = kpk;
        this.f26041e = lrc.m19570a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    private final kbz m19032a(bngx bngx, RemoteViews remoteViews, FillForm fillForm, Context context, lgc lgc, bmxv bmxv) {
        PendingIntent pendingIntent;
        String str;
        FillForm fillForm2 = fillForm;
        Context context2 = context;
        kby a = kbz.m17615a();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            a.mo14355a(((FillField) i.next()).f11631a, null, remoteViews, bmxv);
        }
        if (!ccip.m129876p()) {
            pendingIntent = PendingIntent.getActivity(context2, 0, lio.m19198b(5).putExtra("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL", lqx.m19547a(new FillForm(bngx, fillForm2.f11643c))).setData(Uri.parse(UUID.randomUUID().toString())), 134217728, Bundle.EMPTY);
        } else if (this.f26039c != null) {
            bmxv bmxv2 = fillForm2.f11644d;
            if (!bmxv2.mo66813a()) {
                ComponentName activityComponent = lgc.f26025a.f25872b.getActivityComponent();
                if (activityComponent != null) {
                    str = activityComponent.getPackageName();
                } else {
                    str = null;
                }
                if (str == null) {
                    bmxv2 = bmvz.f131120a;
                } else {
                    try {
                        bmxv2 = bmxv.m108566b(this.f26040d.mo14765b(str));
                    } catch (kpi e) {
                        bmxv2 = bmvz.f131120a;
                    }
                }
                if (!bmxv2.mo66813a()) {
                    ((bnsl) f26037a.mo68387b()).mo68405a("Failed to create password picker intent, no AndroidDomain.");
                    return null;
                }
            }
            FillForm fillForm3 = new FillForm(fillForm2.f11645e, bngx, bmvz.f131120a, fillForm2.f11643c, bmxv2);
            kck kck = (kck) bmxv2.mo66814b();
            pendingIntent = lio.m19187a(5, context2, kcu.m17653a(this.f26039c, kcs.m17644a("pick_password", kck.toString()), new Intent().setClassName("com.google.android.gms", "com.google.android.gms.credential.manager.PasswordManagerActivity").putExtra("pwm.DataFieldNames.accountName", this.f26039c.name).putExtra("pwm.DataFieldNames.pickerWarningText", this.f26041e.mo15385a(C0126R.string.autofill_new_password_picker_password_warning_message, this.f26040d.mo14764a(kck).f24745a).toString()).putExtra("pwm.DataFieldNames.hasTwoFields", true), new ManualPasswordPickerFillPlugin$PasswordPickerTransformer(fillForm2.f11643c)), fillForm3, true);
            if (pendingIntent == null) {
                ((bnsl) f26037a.mo68388c()).mo68405a("Failed to create password picker intent, no pending intent.");
                return null;
            }
        } else {
            ((bnsl) f26037a.mo68388c()).mo68405a("Failed to create password picker intent, no account.");
            return null;
        }
        a.mo14353a(pendingIntent.getIntentSender());
        return a.mo14352a();
    }

    /* renamed from: a */
    public final bngx mo15054a(lgc lgc) {
        kbz a;
        if (!lgc.f26025a.mo15035a()) {
            return bngx.m109376e();
        }
        kjs kjs = lgc.f26026b;
        bnic bnic = kjs.f24278c;
        bnic bnic2 = kjs.f24279d;
        bnia c = bnic.m109499c(bnic.size() + bnic2.size());
        c.mo67752b((Iterable) bnic);
        c.mo67752b((Iterable) bnic2);
        bnic a2 = c.mo67751a();
        FillForm fillForm = lgc.f26027c;
        Context context = this.f26038b;
        RemoteViews a3 = lbj.m18888a(context, context.getText(C0126R.string.autofill_pick_saved_password), null, null, true, 1);
        bmxv a4 = lgc.mo15061a().mo66810a((bmxj) new lgh(this));
        bngs b = bngx.m109371b(a2.size() + 1);
        ArrayList arrayList = new ArrayList(fillForm.f11641a.size());
        bnre i = fillForm.f11641a.listIterator();
        while (i.hasNext()) {
            FillField fillField = (FillField) i.next();
            if (fillField.mo7943a(kpb.USERNAME) || fillField.mo7943a(kpb.PASSWORD)) {
                arrayList.add(fillField);
            }
        }
        if (!arrayList.isEmpty() && (a = m19032a(bngx.m109368a((Collection) arrayList), a3, fillForm, this.f26038b, lgc, a4)) != null) {
            b.mo67668c(new lgb(a, lbe.MANUAL_PASSWORD_PICKER));
        }
        bnrd a5 = a2.iterator();
        while (a5.hasNext()) {
            kom a6 = ((kjl) a5.next()).mo14516a();
            kqg a7 = FillField.m7129a();
            a7.mo14801a((AutofillId) a6.f24609h);
            a7.f24794a = a6.f24607f;
            a7.mo14806a(a6.f24608g);
            a7.mo14804a(kpb.NOT_APPLICABLE);
            kbz a8 = m19032a(bngx.m109356a(a7.mo14800a()), a3, fillForm, this.f26038b, lgc, a4);
            if (a8 != null) {
                b.mo67668c(new lgb(a8, lbe.MANUAL_PASSWORD_PICKER));
            }
        }
        return b.mo67664a();
    }
}
