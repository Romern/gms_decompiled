package p000;

import android.os.Bundle;
import android.service.autofill.Dataset;
import android.service.autofill.FillResponse;
import android.service.autofill.SaveInfo;
import android.service.autofill.UserData;
import android.view.autofill.AutofillId;
import java.util.List;

/* renamed from: kca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kca {

    /* renamed from: a */
    public final FillResponse.Builder f23735a = new FillResponse.Builder();

    /* renamed from: b */
    public boolean f23736b = false;

    /* renamed from: a */
    public final FillResponse mo14359a() {
        if (this.f23736b) {
            return this.f23735a.build();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo14365b() {
        this.f23735a.setFlags(1);
    }

    /* renamed from: a */
    public final void mo14360a(Bundle bundle) {
        this.f23735a.setClientState(bundle);
    }

    /* renamed from: a */
    public final void mo14361a(Dataset dataset) {
        if (dataset != null) {
            this.f23735a.addDataset(dataset);
            this.f23736b = true;
        }
    }

    /* renamed from: a */
    public final void mo14362a(SaveInfo saveInfo) {
        if (saveInfo != null) {
            this.f23735a.setSaveInfo(saveInfo);
            this.f23736b = true;
        }
    }

    /* renamed from: a */
    public final void mo14363a(List list) {
        if (!list.isEmpty()) {
            if (list.size() > UserData.getMaxFieldClassificationIdsSize()) {
                list = list.subList(0, UserData.getMaxFieldClassificationIdsSize());
            }
            this.f23735a.setFieldClassificationIds((AutofillId[]) list.toArray(new AutofillId[0]));
        }
    }

    /* renamed from: a */
    public final void mo14364a(AutofillId[] autofillIdArr) {
        if (autofillIdArr.length > 0) {
            this.f23735a.setIgnoredIds(autofillIdArr);
        }
    }
}
