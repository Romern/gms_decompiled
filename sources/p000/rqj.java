package p000;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.people.data.Audience;

/* renamed from: rqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface rqj extends IInterface {
    vzr getView();

    void initialize(vzr vzr, vzr vzr2, rqm rqm);

    void onRestoreInstanceState(Bundle bundle);

    Bundle onSaveInstanceState();

    void setAudience(Audience audience);

    void setEditMode(int i);

    void setIsUnderageAccount(boolean z);

    void setShowEmptyText(boolean z);
}
