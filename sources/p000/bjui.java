package p000;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.internal.GetSeCardsRequest;
import com.google.android.wallet.common.moduleapicalltasks.PaySeFetchCardAsyncTaskLoaderRequest;
import com.google.android.wallet.common.moduleapicalltasks.PaySeFetchCardAsyncTaskLoaderResponse;
import java.util.ArrayList;

/* renamed from: bjui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjui extends AsyncTaskLoader {

    /* renamed from: a */
    PaySeFetchCardAsyncTaskLoaderResponse f123351a;

    /* renamed from: b */
    boolean f123352b = false;

    /* renamed from: c */
    public final bjyg f123353c;

    /* renamed from: d */
    private final PaySeFetchCardAsyncTaskLoaderRequest f123354d;

    public bjui(Context context, PaySeFetchCardAsyncTaskLoaderRequest paySeFetchCardAsyncTaskLoaderRequest, bjyg bjyg) {
        super(context);
        this.f123354d = paySeFetchCardAsyncTaskLoaderRequest;
        this.f123353c = bjyg;
    }

    /* renamed from: a */
    private static bmit m104632a(SecureElementStoredValue secureElementStoredValue) {
        bxvd da = bmit.f129635e.mo74144da();
        String str = secureElementStoredValue.f81676a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmit bmit = (bmit) da.f164949b;
        str.getClass();
        int i = bmit.f129637a | 1;
        bmit.f129637a = i;
        bmit.f129638b = str;
        int i2 = secureElementStoredValue.f81677b;
        int i3 = i | 2;
        bmit.f129637a = i3;
        bmit.f129639c = i2;
        String str2 = secureElementStoredValue.f81678c;
        str2.getClass();
        bmit.f129637a = i3 | 4;
        bmit.f129640d = str2;
        return (bmit) da.mo74062i();
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        GetSeCardsRequest getSeCardsRequest = new GetSeCardsRequest(this.f123354d.f151809a);
        this.f123352b = true;
        SecureElementStoredValue[] secureElementStoredValueArr = this.f123353c.mo65624a(getContext(), this.f123354d.f151809a, getSeCardsRequest).f81693a;
        ArrayList arrayList = new ArrayList();
        int i = this.f123354d.f151810b;
        if (i == 0) {
            for (SecureElementStoredValue secureElementStoredValue : secureElementStoredValueArr) {
                if (secureElementStoredValue.f81681f != 0) {
                    arrayList.add(m104632a(secureElementStoredValue));
                }
            }
        } else {
            SecureElementStoredValue a = bjyd.m104884a(secureElementStoredValueArr, i);
            if (a != null) {
                arrayList.add(m104632a(a));
            }
        }
        PaySeFetchCardAsyncTaskLoaderResponse paySeFetchCardAsyncTaskLoaderResponse = new PaySeFetchCardAsyncTaskLoaderResponse(arrayList);
        this.f123351a = paySeFetchCardAsyncTaskLoaderResponse;
        return paySeFetchCardAsyncTaskLoaderResponse;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        PaySeFetchCardAsyncTaskLoaderResponse paySeFetchCardAsyncTaskLoaderResponse = this.f123351a;
        if (paySeFetchCardAsyncTaskLoaderResponse != null) {
            deliverResult(paySeFetchCardAsyncTaskLoaderResponse);
        } else if (!this.f123352b) {
            forceLoad();
        }
    }
}
