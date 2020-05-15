package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;

/* renamed from: abda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abda extends aayk {

    /* renamed from: a */
    private final List f57063a;

    public abda(Context context, HelpConfig helpConfig, Account account, bqgj bqgj, List list) {
        super(context, helpConfig, account, bqgj);
        this.f57063a = list;
    }

    /* renamed from: a */
    public static bqgg m47534a(Context context, HelpConfig helpConfig, Account account, bqgj bqgj, List list) {
        sdo.m34973b("Must be called from a worker thread.");
        return new abda(context, helpConfig, account, bqgj, list).mo31911l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29564a(aash aash) {
        aash.f56457v = this.f57063a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.m136419x()).build().toString();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(3841);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(cehd.f182664a.mo6606a().mo79126b());
    }
}
