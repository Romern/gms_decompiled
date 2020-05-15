package p000;

import android.accounts.Account;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* renamed from: aayl */
final /* synthetic */ class aayl implements bmzi {

    /* renamed from: a */
    private final aayq f56824a;

    public aayl(aayq aayq) {
        this.f56824a = aayq;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        Account account;
        aayq aayq = this.f56824a;
        bqgy c = bqgy.m112818c();
        UrlRequest.Builder newUrlRequestBuilder = aayq.f56833f.newUrlRequestBuilder(aayq.mo29520b(), new aayo(c), aayq.f56834g);
        newUrlRequestBuilder.setHttpMethod(aayq.mo31906h());
        newUrlRequestBuilder.setPriority(aayq.mo29518a());
        UploadDataProvider i = aayq.mo31907i();
        if (i != null) {
            newUrlRequestBuilder.setUploadDataProvider(i, aayq.f56834g);
        }
        C1223np npVar = new C1223np();
        aayq.mo29519a(npVar);
        if (aayq.mo29521c() && (account = aayq.f56832e) != null) {
            try {
                aayq.f56837j = gie.m13187a(aayq.f56830c, account, "oauth2:https://www.googleapis.com/auth/supportcontent");
                shb.m35264a(npVar, aayq.f56837j, null);
            } catch (gid | IOException e) {
                String valueOf = String.valueOf(aayq.f56832e.name);
                Log.e("gH_CronetBaseRequest", valueOf.length() == 0 ? new String("Updating auth token failed for ") : "Updating auth token failed for ".concat(valueOf), e);
            }
        }
        for (Map.Entry entry : npVar.entrySet()) {
            newUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        UrlRequest build = newUrlRequestBuilder.build();
        if (!(aayq.f56836i == null || aayq.f56838k == 0)) {
            wzh wzh = new wzh();
            wzh.mo29584c();
            aayq.f56835h = wzh;
        }
        build.start();
        return c;
    }
}
