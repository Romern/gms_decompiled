package p000;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.TokenizeAccountRequest;

/* renamed from: asna */
public final /* synthetic */ class asna implements roo {

    /* renamed from: a */
    private final Account f89263a;

    /* renamed from: b */
    private final byte[] f89264b;

    /* renamed from: c */
    private final Activity f89265c;

    public asna(Account account, byte[] bArr, Activity activity) {
        this.f89263a = account;
        this.f89264b = bArr;
        this.f89265c = activity;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Account account = this.f89263a;
        byte[] bArr = this.f89264b;
        Activity activity = this.f89265c;
        asyy asyy = new asyy();
        asyy.f89902a.f108562a = 2;
        String str = account.name;
        TokenizeAccountRequest tokenizeAccountRequest = asyy.f89902a;
        tokenizeAccountRequest.f108564c = str;
        tokenizeAccountRequest.f108565d = bArr;
        ((aswj) ((aswp) obj).mo25289B()).mo49582a(tokenizeAccountRequest, new aswo(activity, 600));
        rpc.m34201a(Status.f30107a, (aucf) obj2);
    }
}
