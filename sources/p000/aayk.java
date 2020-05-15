package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.IOException;
import java.util.Map;
import org.chromium.net.UploadDataProvider;

/* renamed from: aayk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aayk extends aayq {

    /* renamed from: a */
    private boolean f56823a = false;

    protected aayk(Context context, HelpConfig helpConfig, Account account, bqgj bqgj) {
        super(context, helpConfig, account, bqgj, null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29564a(aash aash) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo31905b(aash aash) {
        Context context = this.f56830c;
        if (!aawg.m47115e(context, this.f56831d)) {
            String b = aazt.m47337b(context);
            if (!TextUtils.isEmpty(b)) {
                aash.f56441f = b;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public byte[] mo29522d() {
        return mo31908j().mo73642k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo31906h() {
        return DataParser.CONNECT_TYPE_POST;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final UploadDataProvider mo31907i() {
        byte[] d = mo29522d();
        try {
            d = aatb.m46964a(d);
            try {
                this.f56823a = true;
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e = e2;
            Log.e("gH_CronetBasePostReq", "Gzip post request bytes failed.", e);
            return new aayj(d);
        }
        return new aayj(d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final abeo mo31908j() {
        aash a = aash.m46863a();
        a.f56436a = this.f56830c;
        a.f56437b = this.f56831d;
        mo29564a(a);
        return a.mo31708b();
    }

    protected aayk(Context context, HelpConfig helpConfig, bqgj bqgj) {
        super(context, helpConfig, bqgj, null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29519a(Map map) {
        super.mo29519a(map);
        map.put("Content-Type", "application/protobuf");
        if (this.f56823a) {
            map.put("Content-Encoding", "gzip");
        }
    }

    protected aayk(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr, int i) {
        super(context, helpConfig, bqgj, abcr, i);
    }
}
