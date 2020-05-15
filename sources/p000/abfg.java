package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: abfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfg extends aayk {

    /* renamed from: a */
    private final String f57342a;

    public abfg(Context context, HelpConfig helpConfig, String str, bqgj bqgj, abcr abcr) {
        super(context, helpConfig, bqgj, abcr, 182);
        this.f57342a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(ceev.f182568a.mo6606a().mo79049a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo79009d()).build().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29564a(aash aash) {
        if (!TextUtils.isEmpty(this.f57342a)) {
            aash.f56442g = this.f57342a;
        }
    }
}
