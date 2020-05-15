package p000;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import java.util.ArrayList;

/* renamed from: atzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atzx implements asmj {

    /* renamed from: a */
    final /* synthetic */ boolean f91304a;

    /* renamed from: b */
    final /* synthetic */ Bundle f91305b;

    public atzx(boolean z, Bundle bundle) {
        this.f91304a = z;
        this.f91305b = bundle;
    }

    /* renamed from: b */
    public final GetAllCardsResponse mo49241b() {
        if (!this.f91304a) {
            return new GetAllCardsResponse(null, null, null, null, new SparseArray(0));
        }
        ArrayList parcelableArrayList = this.f91305b.getParcelableArrayList("cardInfos");
        return new GetAllCardsResponse(parcelableArrayList != null ? (CardInfo[]) parcelableArrayList.toArray(new CardInfo[0]) : null, (AccountInfo) this.f91305b.getParcelable("accountInfo"), this.f91305b.getString("defaultClientTokenId"), this.f91305b.getString("overrideClientTokenId"), new SparseArray(0));
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return !this.f91304a ? Status.f30109c : Status.f30107a;
    }
}
