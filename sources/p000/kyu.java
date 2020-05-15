package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.data.DomainUtils$DomainParcel;

/* renamed from: kyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kyu {
    /* renamed from: a */
    public static Intent m18808a(Context context, bmxv bmxv, byte[] bArr) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.autofill.operation.RejectSavePromoOperation", "com.google.android.gms.autofill.operation.RejectSavePromoOperation");
        if (startIntent == null) {
            return null;
        }
        startIntent.putExtra("save_ui_action_event_extra", bArr);
        if (bmxv.mo66813a()) {
            startIntent.putExtra("save_application_domain", new DomainUtils$DomainParcel((kcv) bmxv.mo66814b()));
        }
        return startIntent;
    }

    /* renamed from: a */
    public static Intent m18809a(Context context, kcv kcv, kck kck, laz laz, byte[] bArr) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.autofill.operation.RejectSaveOperation", "com.google.android.gms.autofill.operation.RejectSaveOperation");
        if (startIntent == null) {
            return null;
        }
        startIntent.putExtra("save_data_type", laz.mo3214a()).putExtra("save_ui_action_event_extra", bArr).putExtra("save_data_domain", new DomainUtils$DomainParcel(kcv)).putExtra("save_application_domain", new DomainUtils$DomainParcel(kck));
        return startIntent;
    }

    /* renamed from: a */
    public static Intent m18810a(Context context, kdi kdi) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.autofill.operation.FeedbackOperation", "com.google.android.gms.autofill.operation.FeedbackOperation");
        if (startIntent == null) {
            return null;
        }
        Account account = kdi.f23888d;
        if (account != null) {
            startIntent.putExtra("account_name_in_use", account.name);
        }
        return startIntent;
    }
}
