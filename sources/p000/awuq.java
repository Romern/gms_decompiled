package p000;

import android.accounts.Account;
import android.net.Uri;
import android.util.Pair;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import java.util.ArrayList;

/* renamed from: awuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awuq extends awpe {

    /* renamed from: b */
    final /* synthetic */ String f95104b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f95105c;

    /* renamed from: e */
    final /* synthetic */ awvy f95106e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awuq(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, String str, ArrayList arrayList) {
        super(buyFlowConfig, account);
        this.f95106e = awvy;
        this.f95104b = str;
        this.f95105c = arrayList;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awgj awgj = this.f95106e.f95196c;
        String b = awvy.m81220b(this.f94799a);
        String str = this.f95104b;
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 17 + String.valueOf(str).length());
        sb.append(b);
        sb.append(str);
        sb.append("?s7e_mode=b64file");
        String sb2 = sb.toString();
        ArrayList arrayList = this.f95105c;
        ArrayList a = awgj.m79898a(bjev, DataParser.CONTENT_TYPE_VALUE);
        Uri.Builder builder = new Uri.Builder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            builder.appendQueryParameter((String) ((Pair) arrayList.get(i)).first, (String) ((Pair) arrayList.get(i)).second);
        }
        String encodedQuery = builder.build().getEncodedQuery();
        return awgj.mo52127a(sb2, a, DataParser.CONTENT_TYPE_VALUE, encodedQuery != null ? encodedQuery.getBytes() : new byte[0], 53, 39);
    }
}
