package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.AsyncTaskLoader;
import java.io.IOException;

/* renamed from: akok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akok extends AsyncTaskLoader {

    /* renamed from: a */
    private static final srn f72357a = srn.m36127a(sgj.GUNS);

    /* renamed from: b */
    private final String f72358b;

    /* renamed from: c */
    private final String f72359c;

    /* renamed from: d */
    private String f72360d;

    /* renamed from: e */
    private Bundle f72361e;

    public akok(Context context, String str, String str2) {
        super(context);
        this.f72358b = str;
        this.f72359c = str2;
    }

    /* renamed from: a */
    public final void deliverResult(Bundle bundle) {
        this.f72361e = bundle;
        if (isStarted()) {
            super.deliverResult(this.f72361e);
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        String str;
        if (this.f72360d == null) {
            try {
                Context context = getContext();
                String str2 = this.f72358b;
                String valueOf = String.valueOf(Uri.encode(this.f72359c));
                str = gie.m13189a(context, str2, valueOf.length() == 0 ? new String("weblogin:continue=") : "weblogin:continue=".concat(valueOf));
            } catch (gid | IOException e) {
                bnsl bnsl = (bnsl) f72357a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to get authenticated url for webview.");
                str = null;
            }
            this.f72360d = str;
        }
        String str3 = this.f72360d;
        if (str3 == null) {
            this.f72361e.putBoolean("WebLoginUrlLoader.hadError", true);
        } else {
            this.f72361e.putString("WebloginUrlLoader.authenticatedUrl", str3);
        }
        return this.f72361e;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        Bundle bundle = this.f72361e;
        if (bundle == null) {
            this.f72361e = new Bundle();
            forceLoad();
            return;
        }
        deliverResult(bundle);
    }
}
