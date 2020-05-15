package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.feedback.SuggestionsChimeraActivity;

/* renamed from: wye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wye extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ Activity f51563a;

    /* renamed from: b */
    final /* synthetic */ SuggestionsChimeraActivity f51564b;

    public wye(SuggestionsChimeraActivity suggestionsChimeraActivity, Activity activity) {
        this.f51564b = suggestionsChimeraActivity;
        this.f51563a = activity;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        abht.m47727a(this.f51563a, Uri.parse(str), FeedbackChimeraActivity.f31577k, this.f51564b.mo18627h());
        return true;
    }
}
