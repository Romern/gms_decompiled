package p000;

import android.content.Intent;
import android.service.autofill.Dataset;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.widget.RemoteViews;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: ljk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ljk implements lis {

    /* renamed from: a */
    public final Object f26195a = new Object();

    /* renamed from: b */
    private final kct f26196b;

    /* renamed from: c */
    private final FillForm f26197c;

    public ljk(kct kct, FillForm fillForm) {
        this.f26196b = kct;
        this.f26197c = fillForm;
    }

    /* renamed from: a */
    public final Object mo15181a() {
        return this.f26195a;
    }

    /* renamed from: b */
    public final bqgg mo15182b() {
        Dataset.Builder builder = new Dataset.Builder();
        Credential credential = (Credential) this.f26196b.mo14368a();
        bnre i = this.f26197c.f11641a.listIterator();
        while (i.hasNext()) {
            FillField fillField = (FillField) i.next();
            AutofillId autofillId = fillField.f11631a;
            if (fillField.mo7943a(kpb.PASSWORD)) {
                builder.setValue(autofillId, AutofillValue.forText(credential.f11609b.f23889a), new RemoteViews("android", 17367043));
            } else {
                builder.setValue(autofillId, AutofillValue.forText(credential.f11608a), new RemoteViews("android", 17367043));
            }
        }
        Dataset build = builder.build();
        Intent intent = new Intent();
        intent.putExtra("android.view.autofill.extra.AUTHENTICATION_RESULT", build);
        return bqga.m112775a(bmxv.m108566b(intent));
    }
}
